package com.xworkz.theatrescreens.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class TheatreDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theatre_Id")
    private int theatreId;

    @Column(name = "theatre_Name")
    private String theatreName;

    @Column(name = "location")
    private String location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "theatre_Id")
    private List<ScreenDTO> screens;
}
