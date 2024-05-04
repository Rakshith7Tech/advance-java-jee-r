package com.xworkz.movieactors.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "actor_info")
public class ActorDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_Id")
    private int actorId;

    @Column(name = "actor_Name")
    private String actorName;

    @Column(name = "age")
    private int age;
}
