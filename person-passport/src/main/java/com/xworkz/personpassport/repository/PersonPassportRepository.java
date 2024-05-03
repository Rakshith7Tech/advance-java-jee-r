package com.xworkz.personpassport.repository;

import com.xworkz.personpassport.dto.PersonDTO;

public interface PersonPassportRepository {
    public boolean addPersonDetails(PersonDTO dto);
}
