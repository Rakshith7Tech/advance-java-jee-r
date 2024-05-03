package com.xworkz.personpassport.service.impl;

import com.xworkz.personpassport.dto.PersonDTO;
import com.xworkz.personpassport.repository.PersonPassportRepository;
import com.xworkz.personpassport.repository.impl.PersonPassportRepositoryImpl;
import com.xworkz.personpassport.service.PersonPassportService;

public class PersonPassportServiceImpl implements PersonPassportService {
    PersonPassportRepository personPassportRepository;
    public PersonPassportServiceImpl() {
        personPassportRepository = new PersonPassportRepositoryImpl();
    }
    @Override
    public boolean validateAndAddPersonDetails(PersonDTO dto) {
        System.out.println("validation service layer");
        if (dto != null) {
            personPassportRepository.addPersonDetails(dto);
            return true;
        }
        System.out.println("validation failed");
        return false;
    }
}
