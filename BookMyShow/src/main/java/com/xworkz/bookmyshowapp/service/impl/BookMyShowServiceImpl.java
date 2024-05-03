package com.xworkz.bookmyshowapp.service.impl;

import com.xworkz.bookmyshowapp.dto.MovieTicketsDTO;
import com.xworkz.bookmyshowapp.repository.BookMyShowRepository;
import com.xworkz.bookmyshowapp.repository.impl.BookMyShowRepositoryImpl;
import com.xworkz.bookmyshowapp.service.BookMyShowService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class BookMyShowServiceImpl implements BookMyShowService {
    //has-a-relationship
    BookMyShowRepository bookMyShowRepository;

    public BookMyShowServiceImpl(){
        bookMyShowRepository = new BookMyShowRepositoryImpl();
    }

    @Override
    public boolean validateMovieTicketAndSave(MovieTicketsDTO dto) {
        System.out.println("Welcome to validation method of service...Your data is getting validated");
        boolean isIdValidated=false;
        boolean isNoOfTicketsValidated=false;
        boolean isPriceValidated=false;
        boolean isMovieNameValidated=false;
        boolean isLocationValidated=false;
        boolean isTheatreNameValidated=false;
        boolean isTimingsValidated=false;
        boolean isLanguageValidated=false;

        if (dto!=null){
            if (dto.getId()>0){
                System.out.println("1");
                isIdValidated=true;
            }
            if (dto.getNoOfTickets()>0){
                System.out.println("2");

                isNoOfTicketsValidated=true;
            }
            if (dto.getPrice()>0){
                System.out.println("3");

                isPriceValidated=true;
            }
            if (dto.getMovieName()!=null){
                System.out.println("4");

                isMovieNameValidated=true;
            }
            if (dto.getLocation()!=null){
                System.out.println("5");

                isLocationValidated=true;
            }
            if (dto.getTheatreName()!=null){
                System.out.println("6");

                isTheatreNameValidated=true;
            }
            if (dto.getTimings()!=null){
                System.out.println("7");

                isTimingsValidated=true;
            }
            if (dto.getLanguage()!=null){
                System.out.println("8");

                isLanguageValidated=true;
            }
        }
        if ( isNoOfTicketsValidated==true && isPriceValidated==true && isMovieNameValidated==true && isLocationValidated==true && isTheatreNameValidated==true && isTimingsValidated==true && isLanguageValidated==true) {
            System.out.println("validationnnnnnnnnnnnn");
            bookMyShowRepository.save(dto);
        }
        return true;
    }

    @Override
    public List<MovieTicketsDTO> findAll() {
        System.out.println("Invoked findAll of service layer");
        List<MovieTicketsDTO> list = bookMyShowRepository.findAll();
        if (list!=null){
            System.out.println("List is not null...");
        }
        return list;
    }

    @Override
    public MovieTicketsDTO getBookingInfoByMovieName(String movieName) {
        if (movieName!=null){
            return bookMyShowRepository.getBookingInfoByMovieName(movieName);
        }
        return null;
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByLocation(String location) {
        if (location!=null){
            return bookMyShowRepository.getBookingInfoByLocation(location);
        }
        return null;
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByMovieLanguage(String language) {
        if (language!=null){
            return bookMyShowRepository.getBookingInfoByMovieLanguage(language);
        }
        return null;
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByPrice(int price) {
        if (price>0){
            return bookMyShowRepository.getBookingInfoByPrice(price);
        }
        return null;
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByNoOfTickets(int noOfTickets) {
        if (noOfTickets>0){
            return bookMyShowRepository.getBookingInfoByNoOfTickets(noOfTickets);
        }
        return null;
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByTheatreName(String theatreName) {
        if (theatreName!=null){
            return bookMyShowRepository.getBookingInfoByTheatreName(theatreName);
        }
        return null;
    }

    @Override
    public List<MovieTicketsDTO> getBookingInfoByTimings(String timings) {
        if (timings!=null){
            return bookMyShowRepository.getBookingInfoByTimings(timings);
        }
        return null;
    }

    @Override
    public String getTheatreNameByMovieName(String movieName) {
        if (movieName!=null){
            return bookMyShowRepository.getTheatreNameByMovieName(movieName);
        }
        return null;
    }

    @Override
    public String getMovieNameByLocation(String location) {
        if (location!=null){
            return bookMyShowRepository.getMovieNameByLocation(location);
        }
        return null;
    }

    @Override
    public void updateMoviePriceByTheatreName(int moviePrice, String theatreName) {
        if (moviePrice!=0 && theatreName!=null){
            bookMyShowRepository.updateMoviePriceByTheatreName(moviePrice,theatreName);
        }
    }

    @Override
    public void deleteMovieNameById(int id) {
        if (id>-1){
            bookMyShowRepository.deleteMovieNameById(id);
        }
    }

    @Override
    public MovieTicketsDTO getBookingInfoById(int id) {
        System.out.println("Invoked getBookingInfoById of service layer");
        MovieTicketsDTO dto=null;
        if (id>0) {
            System.out.println();
            dto=bookMyShowRepository.getBookingInfoById(id);
        }
        return dto;
    }

//    @Override
//    public boolean save(MovieTicketsDTO dto) {
//        //JPA
//        /*new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(dto);
//        entityManager.getTransaction().commit();*/
//
//            Persistence persistence = new Persistence();
//
//            EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("com.xworkz");
//
//            EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//            entityManager.getTransaction().begin();
//            entityManager.persist(dto);
//            entityManager.getTransaction().commit();
//
//            return false;
//}
//
//    @Override
//    public MovieTicketsDTO getBookingInfoById(int id) {
//        return new Persistence().
//                createEntityManagerFactory("com.xworkz").
//                createEntityManager().
//                find(MovieTicketsDTO.class,2);
//    }
//
//    @Override
//    public void updateNoOfTicketsByMovieId(int updatedNoOfTickets, int id) {
//        EntityManager entityManager=new Persistence().createEntityManagerFactory("com.xworkz").createEntityManager();
//        MovieTicketsDTO dto=entityManager.find(MovieTicketsDTO.class,1);
//
//        if (dto!=null){
//            dto.setNoOfTickets(updatedNoOfTickets);
//            entityManager.getTransaction().begin();
//            entityManager.merge(dto);
//            entityManager.getTransaction().commit();
//            System.out.println("Successfully updated the no of tickets");
//        }
//    }
}
