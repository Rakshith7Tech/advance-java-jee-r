package com.xworkz.patientaddress.service.impl;

import com.xworkz.patientaddress.dto.PatientDTO;
import com.xworkz.patientaddress.repository.PatientAddressRepository;
import com.xworkz.patientaddress.repository.impl.PatientAddressRepositoryImpl;
import com.xworkz.patientaddress.service.PatientAddressService;

public class PatientAddressServiceImpl implements PatientAddressService {
    PatientAddressRepository patientAddressRepository;

    public PatientAddressServiceImpl(){
        patientAddressRepository = new PatientAddressRepositoryImpl();
    }

    @Override
    public boolean validateAndAddPatientDetails(PatientDTO dto) {
        System.out.println("validation service layer");
        if (dto != null){
            patientAddressRepository.addPatientDetails(dto);
            return true;
        }
        System.out.println("validation failed");
        return false;
    }
}
