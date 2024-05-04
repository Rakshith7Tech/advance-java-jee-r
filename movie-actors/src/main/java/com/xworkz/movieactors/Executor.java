package com.xworkz.movieactors;

import com.xworkz.movieactors.dto.ActorDTO;
import com.xworkz.movieactors.dto.MovieDTO;
import com.xworkz.movieactors.service.MovieActorService;
import com.xworkz.movieactors.service.impl.MovieActorServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        MovieActorService movieActorService = new MovieActorServiceImpl();
        List<ActorDTO> actorDTOS = new ArrayList<>();

        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setMovieName("Toxic");
        movieDTO.setGenre("Action-Oriented");

        ActorDTO actorDTO1 = new ActorDTO();
        actorDTO1.setActorName("Yash");
        actorDTO1.setAge(38);

        ActorDTO actorDTO2 = new ActorDTO();
        actorDTO2.setActorName("Kiara Advani");
        actorDTO2.setAge(31);

        ActorDTO actorDTO3 = new ActorDTO();
        actorDTO3.setActorName("Nayanthara");
        actorDTO3.setAge(39);

        actorDTOS.add(actorDTO1);
        actorDTOS.add(actorDTO2);
        actorDTOS.add(actorDTO3);

        movieDTO.setActors(actorDTOS);

        boolean result = movieActorService.validateAndAddMovieInfo(movieDTO);

        if(result){
            System.out.println("Movie details added successfully!");
        }else {
            System.out.println("Adding movie details failed.");
        }
    }
}
