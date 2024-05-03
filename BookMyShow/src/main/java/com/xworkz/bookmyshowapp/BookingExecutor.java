package com.xworkz.bookmyshowapp;

import com.xworkz.bookmyshowapp.constant.Language;
import com.xworkz.bookmyshowapp.dto.MovieTicketsDTO;
import com.xworkz.bookmyshowapp.repository.BookMyShowRepository;
import com.xworkz.bookmyshowapp.repository.impl.BookMyShowRepositoryImpl;
import com.xworkz.bookmyshowapp.service.BookMyShowService;
import com.xworkz.bookmyshowapp.service.impl.BookMyShowServiceImpl;

import java.util.List;
import java.util.Scanner;

public class BookingExecutor {
    public static void main(String[] args) {
        BookMyShowRepository bookMyShowRepository = new BookMyShowRepositoryImpl();
        BookMyShowService bookMyShowService = new BookMyShowServiceImpl();
        Scanner sc = new Scanner(System.in);

//        int size= sc.nextInt();
//        int id=11;
//
//        for (int i = 0; i < size; i++) {
//
//            sc.nextLine();
//
//            System.out.println("Id: ");
//            id=sc.nextInt();
//
//            sc.nextLine();
//
//            System.out.print("Movie Name: ");
//            String movieName = sc.nextLine();
//
//            System.out.print("Movie Language: ");
//            String language = sc.nextLine();
//
//            System.out.print("Location: ");
//            String location = sc.nextLine();
//
//            System.out.print("Ticket Price: ");
//            int price = sc.nextInt();
//
//            System.out.print("No of Tickets: ");
//            int tickets = sc.nextInt();
//
//            System.out.print("Theatre Name: ");
//            String theatreName = sc.next();
//
//            //sc.nextLine();
//
//            System.out.print("Movie Timings: ");
//            String timings = sc.next();
//
//            MovieTicketsDTO movieTicketsDTO = new MovieTicketsDTO();
//            movieTicketsDTO.setMovieName(movieName);
//            movieTicketsDTO.setLanguage(Language.valueOf(language));
//            movieTicketsDTO.setLocation(location);
//            movieTicketsDTO.setPrice(price);
//            movieTicketsDTO.setNoOfTickets(tickets);
//            movieTicketsDTO.setTheatreName(theatreName);
//            movieTicketsDTO.setTimings(timings);
//
//            boolean result = bookMyShowService.validateMovieTicketAndSave(movieTicketsDTO);
//            if (result) {
//                System.out.println("Booked successfully!");
//            } else {
//                System.out.println("Booking Failed.");
//            }
//        }
        List<MovieTicketsDTO> lists = bookMyShowService.findAll();
        for (MovieTicketsDTO movieTicketsDTO : lists) {
            System.out.println(movieTicketsDTO);
        }
//        System.out.println(list.toString());
//        System.out.println(list.size());

        System.out.println("Enter the movie name to get theatre name");
        String movie=sc.next();
        String rt=bookMyShowService.getTheatreNameByMovieName(movie);
        System.out.println("Theatre Name :" + rt);

//        System.out.println("Enter the theater name to update the price");
//        String theaterName = sc.next();
//
//        System.out.println("Enter the updated price");
//        int updatedPrice = sc.nextInt();
//
//        bookMyShowService.updateMoviePriceByTheatreName(updatedPrice, theaterName);
//        System.out.println("Price updated successfully!");
//
//        System.out.println("Enter the ID of the movie to delete: ");
//        int movieIdToDelete = sc.nextInt();
//
//        bookMyShowRepository.deleteMovieNameById(movieIdToDelete);
//        System.out.println("Movie deleted successfully!");

        System.out.println("Enter the location to get movie name");
        String location=sc.next();
        String rt1=bookMyShowService.getMovieNameByLocation(location);
        System.out.println("Theatre Name :" + rt1);

        System.out.println("Enter the movie name to get booking info");
        String name=sc.next();
        MovieTicketsDTO retriveMovieName=bookMyShowService.getBookingInfoByMovieName(name);
        System.out.println("Booking Info : " +retriveMovieName);

        System.out.println("Enter the location to get booking info");
        String locate=sc.next();
        List<MovieTicketsDTO> list = bookMyShowService.getBookingInfoByLocation(locate);
        for (MovieTicketsDTO movieTicketsDTO: list) {
            System.out.println(movieTicketsDTO);
        }

//        System.out.println("Enter the language to get booking info");
//
//        List<MovieTicketsDTO> list1 = bookMyShowService.getBookingInfoByMovieLanguage(Language.valueOf(sc.next());
//        for (MovieTicketsDTO movieTicketsDTO: list1) {
//            System.out.println(movieTicketsDTO);
//        }

        System.out.println("Enter the price to get booking info");
        int price=sc.nextInt();
        List<MovieTicketsDTO> list2 = bookMyShowService.getBookingInfoByPrice(price);
        for (MovieTicketsDTO movieTicketsDTO: list2) {
            System.out.println(movieTicketsDTO);
        }

        System.out.println("Enter the no of tickets to get booking info");
        int noOfTickets=sc.nextInt();
        List<MovieTicketsDTO> list3 = bookMyShowService.getBookingInfoByNoOfTickets(noOfTickets);
        for (MovieTicketsDTO movieTicketsDTO: list3) {
            System.out.println(movieTicketsDTO);
        }

        System.out.println("Enter the theatre name to get booking info");
        String theatreName=sc.next();
        List<MovieTicketsDTO> list4 = bookMyShowService.getBookingInfoByTheatreName(theatreName);
        for (MovieTicketsDTO movieTicketsDTO: list4) {
            System.out.println(movieTicketsDTO);
        }

        System.out.println("Enter the timings to get booking info");
        String timings=sc.next();
        List<MovieTicketsDTO> list5 = bookMyShowService.getBookingInfoByTimings(timings);
        for (MovieTicketsDTO movieTicketsDTO: list5) {
            System.out.println(movieTicketsDTO);
        }




//            int id = 6;
//            MovieTicketsDTO movieTicketsDTO = MovieTicketsDTO.
//                    builder().
//                    movieName(sc.next()).
//                    language(Language.valueOf(sc.next())).
//                    location(sc.next()).
//                    price(sc.nextInt()).
//                    noOfTickets(sc.nextInt()).
//                    theatreName(sc.next()).
//                    timings(sc.next()).
//                    id(id++).
//                    build();
//            bookMyShow.save(movieTicketsDTO);

        System.out.println("Enter the Id to get Booking Details");
        int ticketid=sc.nextInt();
        MovieTicketsDTO retrivedData= bookMyShowRepository.getBookingInfoById(ticketid);
        System.out.println(retrivedData);

        System.out.println("Enter Movie Id to update No of Tickets");
        int movieId=sc.nextInt();

        System.out.println("Enter the updated no of tickets");
        int updatedTickets=sc.nextInt();

        bookMyShowRepository.updateNoOfTicketsByMovieId(updatedTickets,movieId);
    }
}
