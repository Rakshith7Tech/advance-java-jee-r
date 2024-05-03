package com.xworkz.mobilebattery.repository.impl;

import com.xworkz.mobilebattery.dto.MobileDTO;
import com.xworkz.mobilebattery.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.mobilebattery.repository.MobileBatteryRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class MobileBatteryRepositoryImpl implements MobileBatteryRepository {
    @Override
    public boolean addMobileDetails(MobileDTO dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(dto);
        transaction.commit();

        // Return true on successful addition, and let any exceptions propagate
        return true;
    }
}
