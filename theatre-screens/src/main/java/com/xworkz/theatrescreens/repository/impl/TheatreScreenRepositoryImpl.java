package com.xworkz.theatrescreens.repository.impl;

import com.xworkz.theatrescreens.dto.TheatreDTO;
import com.xworkz.theatrescreens.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.theatrescreens.repository.TheatreScreenRepository;

import javax.persistence.EntityManager;

public class TheatreScreenRepositoryImpl implements TheatreScreenRepository {
    @Override
    public void addTheatreInfo(TheatreDTO theatreDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(theatreDTO);
        entityManager.getTransaction().commit();
    }
}
