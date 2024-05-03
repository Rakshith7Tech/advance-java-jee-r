package com.xworkz.countrycity.dto;

import lombok.Data;

import javax.persistence.*;

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

    @Column(name = "capital")
    private String capital;

    @Column(name = "population")
    private long population;

    @Column(name = "currency")
    private String currency;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "City_Id")
    private CityDTO cityDTO;
}
