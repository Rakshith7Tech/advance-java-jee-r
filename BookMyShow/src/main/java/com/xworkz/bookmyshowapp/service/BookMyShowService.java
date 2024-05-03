package com.xworkz.bookmyshowapp.service;

import com.xworkz.bookmyshowapp.dto.MovieTicketsDTO;

import java.util.List;

public interface BookMyShowService {
    public boolean validateMovieTicketAndSave(MovieTicketsDTO dto);
    public List<MovieTicketsDTO> findAll();
    public MovieTicketsDTO getBookingInfoByMovieName(String movieName);
    public List<MovieTicketsDTO> getBookingInfoByLocation(String location);
    public List<MovieTicketsDTO> getBookingInfoByMovieLanguage(String language);
    public List<MovieTicketsDTO> getBookingInfoByPrice(int price);
    public List<MovieTicketsDTO> getBookingInfoByNoOfTickets(int noOfTickets);
    public List<MovieTicketsDTO> getBookingInfoByTheatreName(String theatreName);
    public List<MovieTicketsDTO> getBookingInfoByTimings(String timings);
    public String getTheatreNameByMovieName(String movieName);
    public String getMovieNameByLocation(String location);
    public void updateMoviePriceByTheatreName(int moviePrice, String theatreName);
    public void deleteMovieNameById(int id);
//    public boolean save(MovieTicketsDTO dto);
    public MovieTicketsDTO getBookingInfoById(int id);
//    public void updateNoOfTicketsByMovieId(int updatedNoOfTickets, int id);
}
