package com.xworkz.bingeottplatforms.repository.impl;

import com.xworkz.bingeottplatforms.dto.BingeDTO;
import com.xworkz.bingeottplatforms.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.bingeottplatforms.repository.BingeOttPlatformRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class BingeOttPlatformRepositoryImpl implements BingeOttPlatformRepository {
    @Override
    public void addBingeInfo(BingeDTO bingeDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(bingeDTO);
        entityManager.getTransaction().commit();
    }
}
