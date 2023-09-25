package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Entity.*;
import com.Hospital.hospitalmanagementsystem.Exception.OneToOneException;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.*;
import com.Hospital.hospitalmanagementsystem.Request.PrescriptionRequest;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private MedicineRepository medicineRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;

    public void addPrescription(PrescriptionRequest prescriptionRequest) {
        //doctors still working in the hospital
        Doctor selectedDoctor = doctorRepository.findByDoctorPresent(true)
                .stream()
                .filter(doctor -> prescriptionRequest.getDoctorEmail().equals(doctor.getEmail()))
                .findFirst()
                .orElse(null);

        if (selectedDoctor != null) {
            Patient patient = patientRepository.findByEmail(prescriptionRequest.getPatientEmail());
            if (patient == null) {
                throw new EntityNotFoundException("Patient not found. Please Register");
            }

            Optional<Appointment> currentAppointment = appointmentRepository.findAll()
                    .stream()
                    .filter(appointment ->
                            appointment.getDoctor().getDoctorId() == selectedDoctor.getDoctorId() &&
                                    appointment.getPatient().getPatientId() == patient.getPatientId())
                    .findFirst();

            if (currentAppointment.isPresent()) {
                if (prescriptionRepository.existsByAppointment_AppointmentId(currentAppointment.get().getAppointmentId())){
                    throw new OneToOneException("Already a prescription generated with the current appointment id");
                }
                List<Medicine> medicineList = medicineRepository.findAll();
                // Check if all medicines in prescriptionRequest.medicines exist in the medicineRepository

                if (!prescriptionRequest.getMedicines()
                        .stream()
                        .allMatch(medicineName -> medicineList.stream().anyMatch(medicine -> medicine.getMedicineName().equals(medicineName)))) {

                    throw new EntityNotFoundException("Some or all medicines are not found in the repository");
                }

                Prescription prescription = new Prescription();
                prescription.setPrescriptionData(prescriptionRequest.getPrescriptionData());
                prescription.setDoctor(selectedDoctor);
                prescription.setPatient(patient);
                prescription.setMedicines(medicineRepository.findAllByNameIn(prescriptionRequest.getMedicines()));
                prescription.setPrescriptionDate(currentAppointment.get().getAppointmentDate());
                prescription.setAppointment(currentAppointment.get());
                prescriptionRepository.save(prescription);


            }
            else {
                throw new EntityNotFoundException("Appointment not found");
            }



        } else {
            throw new EntityNotFoundException("Doctor not found");
        }
    }
}

