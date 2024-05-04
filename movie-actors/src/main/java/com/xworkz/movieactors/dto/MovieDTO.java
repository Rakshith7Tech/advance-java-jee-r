package com.xworkz.movieactors.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "movie_info")
public class MovieDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_Id")
    private int movieId;

    @Column(name = "movie_Name")
    private String movieName;

    @Column(name = "genre")
    private String genre;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_Id")
    private List<ActorDTO> actors;
}
