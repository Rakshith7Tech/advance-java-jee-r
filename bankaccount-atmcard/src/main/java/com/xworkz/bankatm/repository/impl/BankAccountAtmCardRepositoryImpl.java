package com.xworkz.bankatm.repository.impl;

import com.xworkz.bankatm.dto.BankAccountDTO;
import com.xworkz.bankatm.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.bankatm.repository.BankAccountAtmCardRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class BankAccountAtmCardRepositoryImpl implements BankAccountAtmCardRepository {
    @Override
    public boolean addBankAccountDetails(BankAccountDTO dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(dto);
        transaction.commit();

        // Return true on successful addition, and let any exceptions propagate
        return true;
    }
}
