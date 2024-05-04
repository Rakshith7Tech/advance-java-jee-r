package com.xworkz.ecommerceapp.repository.impl;

import com.xworkz.ecommerceapp.dto.CartItemDTO;
import com.xworkz.ecommerceapp.dto.UserDTO;
import com.xworkz.ecommerceapp.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.ecommerceapp.repository.EcommerceRepository;

import javax.persistence.EntityManager;

public class EcommerceRepositoryImpl implements EcommerceRepository {
    @Override
    public void saveUser(UserDTO dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
    }

    @Override
    public void saveCart(CartItemDTO dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
    }
}
