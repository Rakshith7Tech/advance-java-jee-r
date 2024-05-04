package com.xworkz.countrycity.repository.impl;

import com.xworkz.countrycity.dto.CountryDTO;
import com.xworkz.countrycity.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.countrycity.repository.CountryCityRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CountryCityRepositoryImpl implements CountryCityRepository {
    @Override
    public boolean addCountryDetails(CountryDTO dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(dto);
        transaction.commit();

        // Return true on successful addition, and let any exceptions propagate
        return true;
    }
}
