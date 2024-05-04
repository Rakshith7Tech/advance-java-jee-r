package com.xworkz.countrycity.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "city")
public class CityDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_Id")
    private int cityId;

    @Column(name = "city_Name")
    private String cityName;

    @Column(name = "population")
    private long population;

    @Column(name = "area")
    private double area;

    @Column(name = "country_Id")
    private int countryId;
}
