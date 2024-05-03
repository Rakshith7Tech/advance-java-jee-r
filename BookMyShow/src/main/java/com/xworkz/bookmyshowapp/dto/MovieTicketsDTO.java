package com.xworkz.bookmyshowapp.dto;

import com.xworkz.bookmyshowapp.constant.Language;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Data
//@Builder

@Table(name = "tickets")
@Entity // Used for mapping class with table
@NamedQueries({@NamedQuery(name = "findAll",query = "select dto from MovieTicketsDTO as dto"),
               @NamedQuery(name = "findBookingInfoByMovieName",query = "from MovieTicketsDTO dto where movieName =:mn"),
               @NamedQuery(name = "findBookingInfoByMovieLanguage",query = "select dto from MovieTicketsDTO dto where language =:lg"),
               @NamedQuery(name = "findBookingInfoByLocation",query = "select dto from MovieTicketsDTO dto where location =:lc"),
               @NamedQuery(name = "findBookingInfoByPrice",query = "select dto from MovieTicketsDTO dto where price =:pr"),
               @NamedQuery(name = "findBookingInfoByNoOfTickets",query = "select dto from MovieTicketsDTO dto where noOfTickets =:nt"),
               @NamedQuery(name = "findBookingInfoByTheatreName",query = "select dto from MovieTicketsDTO dto where theatreName =:tn"),
               @NamedQuery(name = "findBookingInfoByTimings",query = "select dto from MovieTicketsDTO dto where timings =:tm"),
               @NamedQuery(name = "findTheatreNameByMovieName",query = "select dto.theatreName from MovieTicketsDTO dto where dto.movieName =:tnmn"),
               @NamedQuery(name = "findMovieNameByLocation",query = "select dto.movieName from MovieTicketsDTO dto where dto.location =:mnlc")
              })

public class MovieTicketsDTO {
    @Id
    @Column(name = "id")
//    @GenericGenerator(name = "ref", strategy = "increment")
//    @GeneratedValue(generator = "ref")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "movie_name") // Used for mapping fields with columns
    private String movieName;
    @Column(name = "language")
    @Enumerated(EnumType.STRING) // Convert enum to string (varchar in db)
    private Language language;
    @Column(name = "location")
    private String location;
    @Column(name = "price")
    private int price;
    @Column(name = "no_of_tickets")
    private int noOfTickets;
    @Column(name = "theatre_name")
    private String theatreName;
    @Column(name = "timings")
    private String timings;
}

