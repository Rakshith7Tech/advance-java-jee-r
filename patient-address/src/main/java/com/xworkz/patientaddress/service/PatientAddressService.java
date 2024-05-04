package com.xworkz.patientaddress.service;

import com.xworkz.patientaddress.dto.PatientDTO;

public interface PatientAddressService {
    public boolean validateAndAddPatientDetails(PatientDTO dto);
}
