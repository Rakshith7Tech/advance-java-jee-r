package com.xworkz.mallshops.repository.impl;

import com.xworkz.mallshops.dto.MallDTO;
import com.xworkz.mallshops.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.mallshops.repository.MallShopRepository;

import javax.persistence.EntityManager;

public class MallShopRepositoryImpl implements MallShopRepository {
    @Override
    public void addMallInfo(MallDTO mallDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mallDTO);
        entityManager.getTransaction().commit();
    }
}
