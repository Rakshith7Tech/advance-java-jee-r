package com.xworkz.countrystates.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "country")
public class CountryDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_Id")
    private int countryId;

    @Column(name = "country_Name")
    private String countryName;

    @Column(name = "continent")
    private String continent;

    @Column(name = "capital")
    private String capital;

    @Column(name = "population")
    private int population;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_Id")
    private List<StateDTO> states;
}
