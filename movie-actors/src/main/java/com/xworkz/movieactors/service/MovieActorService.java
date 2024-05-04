package com.xworkz.movieactors.service;

import com.xworkz.movieactors.dto.MovieDTO;

public interface MovieActorService {
    public boolean validateAndAddMovieInfo(MovieDTO movieDTO);
}
