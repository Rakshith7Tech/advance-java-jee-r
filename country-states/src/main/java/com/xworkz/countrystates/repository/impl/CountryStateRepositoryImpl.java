package com.xworkz.countrystates.repository.impl;

import com.xworkz.countrystates.dto.CountryDTO;
import com.xworkz.countrystates.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.countrystates.repository.CountryStateRepository;

import javax.persistence.EntityManager;

public class CountryStateRepositoryImpl implements CountryStateRepository {
    @Override
    public void addCountryInfo(CountryDTO countryDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(countryDTO);
        entityManager.getTransaction().commit();
    }
}
