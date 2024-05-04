package com.xworkz.personpassport;

import com.xworkz.personpassport.dto.PassportDTO;
import com.xworkz.personpassport.dto.PersonDTO;
import com.xworkz.personpassport.service.PersonPassportService;
import com.xworkz.personpassport.service.impl.PersonPassportServiceImpl;

import java.util.Date;

public class Executor {
    public static void main(String[] args) {
        PersonPassportService personPassportService = new PersonPassportServiceImpl();

        // Create a new Passport
        PassportDTO passportDTO = new PassportDTO();
        passportDTO.setPassportNumber("AGHL72945");
        passportDTO.setIssueDate("Jan-20-2021"); // Set a valid date
        passportDTO.setExpirationDate("Dec-7-2025"); // Set a valid date

        // Create a new Person
        PersonDTO personDTO = new PersonDTO();
        personDTO.setPersonName("Ramesh");
        personDTO.setDateOfBirth("Mar-13-2001"); // Set a valid date
        personDTO.setGender("Male");
        personDTO.setNationality("Indian");
        personDTO.setPassport(passportDTO); // Link the Person to the Passport

        // Validate and add the Person and Passport details
        boolean result = personPassportService.validateAndAddPersonDetails(personDTO);

        if (result) {
            System.out.println("Person and Passport details added successfully!");
        } else {
            System.out.println("Adding person and passport details failed.");
        }
    }
}
