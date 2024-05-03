package com.xworkz.showroombrand.repository.impl;

import com.xworkz.showroombrand.dto.GiriasDTO;
import com.xworkz.showroombrand.repository.ShowroomRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ShowroomRepositoryImpl implements ShowroomRepository {
    @Override
    public boolean addProduct(GiriasDTO dto) {
        Persistence persistence = new Persistence();

        EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("com.xworkz");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
        return false;
    }

    @Override
    public GiriasDTO getProductInfoById(int id) {
        System.out.println("Invoked getProductInfoById of repository layer ");
        return new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager().
                find(GiriasDTO.class,12);

    }

    @Override
    public void updateQuantityInStockByProductId(int updatedQuantityInStock, int id) {
        EntityManager entityManager=new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();
        GiriasDTO dto=entityManager.find(GiriasDTO.class,5
        );

        if (dto!=null){
            dto.setQuantityInStock(updatedQuantityInStock);
            entityManager.getTransaction().begin();
            entityManager.merge(dto);
            entityManager.getTransaction().commit();
            System.out.println("Successfully updated the quantity in stock");
        }
    }

    @Override
    public List<GiriasDTO> findAll() {
        EntityManager entityManager=new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();
        Query query=entityManager.createNamedQuery("findAll");
        return query.getResultList();
    }
}
