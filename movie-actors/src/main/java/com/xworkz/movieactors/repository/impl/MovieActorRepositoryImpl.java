package com.xworkz.movieactors.repository.impl;

import com.xworkz.movieactors.dto.MovieDTO;
import com.xworkz.movieactors.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.movieactors.repository.MovieActorRepository;

import javax.persistence.EntityManager;

public class MovieActorRepositoryImpl implements MovieActorRepository {
    @Override
    public void addMovieInfo(MovieDTO movieDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(movieDTO);
        entityManager.getTransaction().commit();
    }
}
