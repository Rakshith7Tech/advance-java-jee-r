package com.xworkz.patientaddress.repository;

import com.xworkz.patientaddress.dto.PatientDTO;

public interface PatientAddressRepository {
    public  boolean addPatientDetails(PatientDTO dto);
}
