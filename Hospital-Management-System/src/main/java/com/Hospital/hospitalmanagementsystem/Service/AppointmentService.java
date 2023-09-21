package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Entity.Appointment;
import com.Hospital.hospitalmanagementsystem.Entity.Doctor;
import com.Hospital.hospitalmanagementsystem.Entity.Patient;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.AppointmentRepository;
import com.Hospital.hospitalmanagementsystem.Repository.DoctorRepository;
import com.Hospital.hospitalmanagementsystem.Repository.PatientRepository;
import com.Hospital.hospitalmanagementsystem.Request.AppointmentRequest;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;

    public void addAppointment(AppointmentRequest appointmentRequest) throws ParseException {
        List<Doctor> doctorList = doctorRepository.findByDoctorPresent(true);//doctors still working in the hospital
        Doctor selectedDoctor = doctorList
                .stream()
                .filter(doctor -> appointmentRequest.getDoctorEmail().equals(doctor.getEmail()))
                .findFirst()
                .orElse(null);

        if (selectedDoctor != null) {
            Patient patient = patientRepository.findByEmail(appointmentRequest.getPatientEmail());
            if (patient == null) {
                throw new EntityNotFoundException("Patient not found. Please Register");
            }

            if (appointmentRepository.findAll().
                    stream().
                    anyMatch(appointment ->
                            appointment.getDoctor().getDoctorId() == selectedDoctor.getDoctorId() && appointment.getPatient().getPatientId() == patient.getPatientId())) {
                throw new ValidationException("Appointment already scheduled");
            }

            Appointment appointment = new Appointment();
            appointment.setDoctor(selectedDoctor);
            appointment.setPatient(patient);
            appointment.setTreatmentStatus(false);
            appointment.setDoctorFreeStatus(true);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date utilDate = sdf.parse(appointmentRequest.getAppointmentDate());
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            appointment.setAppointmentDate(sqlDate);

            appointment.setAppointmentSlots(appointmentRequest.getAppointmentSlots());
            appointmentRepository.save(appointment);
        } else {
            throw new EntityNotFoundException("Doctor not found");
        }
    }
}