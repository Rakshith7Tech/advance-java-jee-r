package com.xworkz.patientaddress;

import com.xworkz.patientaddress.dto.AddressDTO;
import com.xworkz.patientaddress.dto.PatientDTO;
import com.xworkz.patientaddress.service.PatientAddressService;
import com.xworkz.patientaddress.service.impl.PatientAddressServiceImpl;

public class Executor {
    public static void main(String[] args) {
        PatientAddressService patientAddressService = new PatientAddressServiceImpl();

        // Create a new Address
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setPinCode(560001);
        addressDTO.setAreaName("Bhashyam circle");
        addressDTO.setState("Karnataka");
        addressDTO.setCountry("India");

        // Create a new Patient
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setPatientName("Raja");
        patientDTO.setDisease("cold");
        patientDTO.setAddressId(addressDTO); // Link the Patient to the Address

        // Validate and add the Patient details
        boolean result = patientAddressService.validateAndAddPatientDetails(patientDTO);

        if (result) {
            System.out.println("Patient details added successfully!");
        } else {
            System.out.println("Adding patient details failed.");
        }
    }
}
