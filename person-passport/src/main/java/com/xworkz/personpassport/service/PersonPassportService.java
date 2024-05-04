package com.xworkz.personpassport.service;

import com.xworkz.personpassport.dto.PersonDTO;

public interface PersonPassportService {
    public boolean validateAndAddPersonDetails(PersonDTO dto);
}
