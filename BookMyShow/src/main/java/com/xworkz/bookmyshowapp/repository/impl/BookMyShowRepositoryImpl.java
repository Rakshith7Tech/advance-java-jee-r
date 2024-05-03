package com.xworkz.bookmyshowapp.repository.impl;

import com.xworkz.bookmyshowapp.dto.MovieTicketsDTO;
import com.xworkz.bookmyshowapp.entitymanager.EntityManagerFactorySingleton;
import com.xworkz.bookmyshowapp.repository.BookMyShowRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BookMyShowRepositoryImpl implements BookMyShowRepository {
    @Override
    public boolean save(MovieTicketsDTO dto) {
        System.out.println("add ayta?");
        //JPA
        /*new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();*/

        Persistence persistence = new Persistence();

        EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("com.xworkz");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();

        return false;
    }

    @Override
    public MovieTicketsDTO getBookingInfoById(int id) {
        System.out.println("Invoked getBookingInfoById of repository layer");
        return Persistence.
                createEntityManagerFactory("com.xworkz").
                createEntityManager().
                find(MovieTicketsDTO.class,8);
    }

    @Override
    public void updateNoOfTicketsByMovieId(int updatedNoOfTickets, int id) {
        EntityManager entityManager=new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();
        MovieTicketsDTO dto=entityManager.find(MovieTicketsDTO.class,1);

        if (dto!=null){
            dto.setNoOfTickets(updatedNoOfTickets);
            entityManager.getTransaction().begin();
            entityManager.merge(dto);
            entityManager.getTransaction().commit();
            System.out.println("Successfully updated the no of tickets");
        }
    }

    @Override
    public List<MovieTicketsDTO> findAll() {
        //EntityManager entityManager=new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();
        //Query query=entityManager.createNamedQuery("findAll");
        //return query.getResultList();
//        Query query = entityManager.createQuery("from MovieTicketsDTO dto");
//        List<MovieTicketsDTO> list = query.getResultList();
//        return list;
        return EntityManagerFactorySingleton.getFactory().createEntityManager().createQuery("from MovieTicketsDTO dto").getResultList();
    }

    @Override
    public MovieTicketsDTO getBookingInfoByMovieName(String movieName) {
//        EntityManager entityManager = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
//        Query query = entityManager.createQuery("from MovieTicketsDTO dto where movieName = '"+movieName+"' ");
        //query.setParameter("movieName", movieName);
//        MovieTicketsDTO dto = (MovieTicketsDTO) query.getSingleResult();
//        return dto;
        return (MovieTicketsDTO) EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("findBookingInfoByMovieName").setParameter("mn",movieName).
                getSingleResult();
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByMovieLanguage(String language) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("findBookingInfoByMovieLanguage").setParameter("lg",language);
        //query.setParameter("language", language);
        return query.getResultList();
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByLocation(String location) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("findBookingInfoByLocation").setParameter("lc",location);
        //query.setParameter("location", location);
        return query.getResultList();
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByPrice(int price) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("findBookingInfoByPrice").setParameter("pr",price);
        //query.setParameter("price", price);
        return query.getResultList();
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByNoOfTickets(int noOfTickets) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("findBookingInfoByNoOfTickets").setParameter("nt",noOfTickets);
        //query.setParameter("noOfTickets", noOfTickets);
        return query.getResultList();
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByTheatreName(String theatreName) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("findBookingInfoByTheatreName").setParameter("tn",theatreName);
        //query.setParameter("theatreName", theatreName);
        return query.getResultList();
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByTimings(String timings) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("findBookingInfoByTimings").setParameter("tm",timings);
        //query.setParameter("timings", timings);
        return query.getResultList();
    }

    @Override
    public String getTheatreNameByMovieName(String movieName) {
        return (String) EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("findTheatreNameByMovieName").setParameter("tnmn",movieName).getSingleResult();
    }

    @Override
    public String getMovieNameByLocation(String location) {
        return (String) EntityManagerFactorySingleton.getFactory().createEntityManager().createNamedQuery("findMovieNameByLocation").setParameter("mnlc",location).getSingleResult();
    }

    @Override
    public void updateMoviePriceByTheatreName(int moviePrice, String theatreName) {
        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        entityManager.getTransaction().begin();
        Query query =  entityManager.createQuery("update MovieTicketsDTO dto set dto.price = '"+moviePrice+"' where dto.theatreName = '"+theatreName+"' ");
        int price = query.executeUpdate();
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteMovieNameById(int id) {
        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from MovieTicketsDTO dto where dto.id = '"+id+"' ");
        int delete = query.executeUpdate();
        entityManager.getTransaction().commit();
    }
}
