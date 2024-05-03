package com.xworkz.personpassport.repository.impl;

import com.xworkz.personpassport.dto.PersonDTO;
import com.xworkz.personpassport.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.personpassport.repository.PersonPassportRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersonPassportRepositoryImpl implements PersonPassportRepository {
    public boolean addPersonDetails(PersonDTO dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(dto);
        transaction.commit();

        // Return true on successful addition, and let any exceptions propagate
        return true;
    }
}
