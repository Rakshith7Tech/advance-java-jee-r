package com.xworkz.airportterminals.repository.impl;

import com.xworkz.airportterminals.dto.AirportDTO;
import com.xworkz.airportterminals.dto.TerminalDTO;
import com.xworkz.airportterminals.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.airportterminals.repository.AirportTerminalRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class AirportTerminalRepositoryImpl implements AirportTerminalRepository {
    @Override
    public void addAirportInfo(AirportDTO airportDTO) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(airportDTO);
        entityManager.getTransaction().commit();
    }

    @Override
    public AirportDTO getAirportInfoByTerminalId(int id) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("findAirportByTerminalId");
        query.setParameter("id", id);
        TerminalDTO terminalDTO = (TerminalDTO) query.getSingleResult();
        return terminalDTO.getAirportDTO();
    }
}
