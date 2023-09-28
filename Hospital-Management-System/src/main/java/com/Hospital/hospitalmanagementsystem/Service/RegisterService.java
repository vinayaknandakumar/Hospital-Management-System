package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Entity.Admin;
import com.Hospital.hospitalmanagementsystem.Entity.Doctor;
import com.Hospital.hospitalmanagementsystem.Entity.Patient;
import com.Hospital.hospitalmanagementsystem.Entity.Receptionist;
import com.Hospital.hospitalmanagementsystem.Exception.ExcelException;
import com.Hospital.hospitalmanagementsystem.Repository.AdminRepository;
import com.Hospital.hospitalmanagementsystem.Repository.DoctorRepository;
import com.Hospital.hospitalmanagementsystem.Repository.PatientRepository;
import com.Hospital.hospitalmanagementsystem.Repository.ReceptionistRepository;
import com.Hospital.hospitalmanagementsystem.Request.RegisterRequest;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;

@Service
public class RegisterService {

    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private ReceptionistRepository receptionistRepository;
    @Autowired
    private JavaMailSender mailSender;


    private static final String RECEPTIONISTNAME="receptionist";
    private static final String ADMINNAME="admin";
    private static final String DOCTORNAME="doctor";
    private static final String PATIENTNAME="patient";

    @Value("${email.subject}")
    private String subject;

    @Value("${spring.mail.username}")
    private String senderEmail;


    /**
     * for registration of admin, doctor, patient and receptionist
     * @param registerRequest
     */
    public void registerStaff(RegisterRequest registerRequest) {

        if (registerRequest.getRole().equalsIgnoreCase(RegisterService.ADMINNAME)) {
            Admin admin = new Admin();
            admin.setFirstName(registerRequest.getFirstName());
            admin.setLastName(registerRequest.getLastName());
            admin.setEmail(registerRequest.getEmail());
            admin.setPhone(registerRequest.getPhone());
            admin.setPassword(BCrypt.hashpw(registerRequest.getPassword(), BCrypt.gensalt()));
            adminRepository.save(admin);
        } else if (registerRequest.getRole().equalsIgnoreCase(RegisterService.DOCTORNAME)) {
            Doctor doctor = new Doctor();
            doctor.setFirstName(registerRequest.getFirstName());
            doctor.setLastName(registerRequest.getLastName());
            doctor.setEmail(registerRequest.getEmail());
            doctor.setPhone(registerRequest.getPhone());
            doctor.setGender(registerRequest.getGender());
            doctor.setSpecialization(registerRequest.getSpecialization());
            doctor.setDoctorPresent(true);
            doctor.setPassword(BCrypt.hashpw(registerRequest.getPassword(), BCrypt.gensalt()));
            doctorRepository.save(doctor);
        } else if (registerRequest.getRole().equalsIgnoreCase(RegisterService.PATIENTNAME)) {
            Patient patient = new Patient();
            patient.setFirstName(registerRequest.getFirstName());
            patient.setLastName(registerRequest.getLastName());
            patient.setAge(registerRequest.getAge());
            patient.setGender(registerRequest.getGender());
            patient.setPhone(registerRequest.getPhone());
            patient.setEmail(registerRequest.getEmail());
            patient.setPassword(BCrypt.hashpw(registerRequest.getPassword(), BCrypt.gensalt()));
            patient.setAddress(registerRequest.getAddress());
            patientRepository.save(patient);
        } else if (registerRequest.getRole().equalsIgnoreCase(RegisterService.RECEPTIONISTNAME)) {
            Receptionist receptionist = new Receptionist();
            receptionist.setFirstName(registerRequest.getFirstName());
            receptionist.setLastName(registerRequest.getLastName());
            receptionist.setGender(registerRequest.getGender());
            receptionist.setPhone(registerRequest.getPhone());
            receptionist.setEmail(registerRequest.getEmail());
            receptionist.setPassword(BCrypt.hashpw(registerRequest.getPassword(), BCrypt.gensalt()));
            receptionistRepository.save(receptionist);
        }
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(senderEmail);
        message.setTo(registerRequest.getEmail());
        message.setSubject(subject);
        message.setText("Welcome "+registerRequest.getFirstName()+" "+registerRequest.getLastName()+". Thank you for registering with UnitedHealthCare. We care about you");
        mailSender.send(message);


    }

    public void registerPatientFromExcel(MultipartFile file) throws IOException {
        try (InputStream inputStream = file.getInputStream()) {
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0); // The data in excel sheet is in the 1st sheet

            for (int rowIndex = 2; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);

                Patient patient = new Patient();
                patient.setFirstName(row.getCell(0).getStringCellValue());
                patient.setLastName(row.getCell(1).getStringCellValue());
                patient.setAge(String.valueOf((int)row.getCell(2).getNumericCellValue()));
                patient.setGender(row.getCell(3).getStringCellValue());
                patient.setPhone(String.valueOf((long)row.getCell(4).getNumericCellValue()));
                patient.setAddress(row.getCell(5).getStringCellValue());
                patient.setEmail(row.getCell(6).getStringCellValue());
                patient.setPassword(BCrypt.hashpw("unitedhealthcare", BCrypt.gensalt()));
                patientRepository.save(patient);
            }
            workbook.close();
        }
    }


}











//                String firstName;
//                String lastName;
//                String age;2147483647
//                String gender;
//                String phone;
//                String email;
//                String address;

//                firstName = row.getCell(0).getStringCellValue();

//                Cell firstNameCell = row.getCell(0);
//                if (firstNameCell.getCellType() == CellType.STRING) {
//                    firstName = firstNameCell.getStringCellValue();
//                } else if (firstNameCell.getCellType() == CellType.NUMERIC) {
//                    // Handle numeric value convert it to a string or perform necessary processing
//                    double numericValue = firstNameCell.getNumericCellValue();
//                    firstName = String.valueOf(numericValue); // Convert to string if needed
//                } else {
//                    throw new ExcelException("Cannot get first name: Row "+rowIndex);
//                }


//                Cell lastNameCell = row.getCell(1);
//                if (lastNameCell.getCellType() == CellType.STRING) {
//                    lastName = lastNameCell.getStringCellValue();
//                } else if (lastNameCell.getCellType() == CellType.NUMERIC) {
//                    lastName = String.valueOf(lastNameCell.getNumericCellValue());
//                } else {
//                    throw new ExcelException("Cannot get last name: Row "+rowIndex);
//                }
//
//                Cell ageCell = row.getCell(2);
//                if(ageCell.getCellType() == CellType.STRING) {
//                    age = ageCell.getStringCellValue();
//                } else if (ageCell.getCellType() == CellType.NUMERIC) {
//                    age = String.valueOf((int)ageCell.getNumericCellValue());
//                } else {
//                    throw new ExcelException("Cannot get age: Row "+rowIndex);
//                }
//
//                Cell genderCell = row.getCell(3);
//                if (genderCell.getCellType() == CellType.STRING) {
//                    gender = genderCell.getStringCellValue();
//                } else if (genderCell.getCellType() == CellType.NUMERIC) {
//                    gender = String.valueOf(genderCell.getNumericCellValue());
//                } else {
//                    throw new ExcelException("Cannot get gender: Row "+rowIndex);
//                }
//
//                Cell phoneCell = row.getCell(4);
//                if (phoneCell.getCellType() == CellType.STRING) {
//                    phone = phoneCell.getStringCellValue();
//                } else if (phoneCell.getCellType() == CellType.NUMERIC) {
//                    phone = String.valueOf((long)phoneCell.getNumericCellValue());
//                } else {
//                    throw new ExcelException("Cannot get phone number: Row "+rowIndex);
//                }
//
//                Cell emailCell = row.getCell(5);
//                if (emailCell.getCellType() == CellType.STRING) {
//                    email = emailCell.getStringCellValue();
//                } else if (emailCell.getCellType() == CellType.NUMERIC) {
//                    email = String.valueOf(emailCell.getNumericCellValue());
//                } else {
//                    throw new ExcelException("Cannot get email: Row "+rowIndex);
//                }
//
//                Cell addressCell = row.getCell(6);
//                if (addressCell.getCellType() == CellType.STRING) {
//                    address = addressCell.getStringCellValue();
//                } else if (addressCell.getCellType() == CellType.NUMERIC) {
//                    address = String.valueOf(addressCell.getNumericCellValue());
//                } else {
//                    throw new ExcelException("Cannot get address: Row "+rowIndex);
//                }

