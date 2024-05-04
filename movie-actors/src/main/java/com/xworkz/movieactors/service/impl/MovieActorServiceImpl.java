package com.xworkz.movieactors.service.impl;

import com.xworkz.movieactors.dto.MovieDTO;
import com.xworkz.movieactors.repository.MovieActorRepository;
import com.xworkz.movieactors.repository.impl.MovieActorRepositoryImpl;
import com.xworkz.movieactors.service.MovieActorService;

public class MovieActorServiceImpl implements MovieActorService {
    MovieActorRepository movieActorRepository;
    public MovieActorServiceImpl(){
        movieActorRepository = new MovieActorRepositoryImpl();
    }
    @Override
    public boolean validateAndAddMovieInfo(MovieDTO movieDTO) {
        System.out.println("Validating service layer");
        if (movieDTO!=null){
            movieActorRepository.addMovieInfo(movieDTO);
        }
        return true;
    }
}
