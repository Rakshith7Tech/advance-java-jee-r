package com.xworkz.patientaddress.repository.impl;

import com.xworkz.patientaddress.dto.PatientDTO;
import com.xworkz.patientaddress.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.patientaddress.repository.PatientAddressRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PatientAddressRepositoryImpl implements PatientAddressRepository {
    @Override
    public boolean addPatientDetails(PatientDTO dto) {
        EntityManager entityManager= EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(dto); // This saves the PatientDTO to the database
        transaction.commit();
        return false;
    }
}
