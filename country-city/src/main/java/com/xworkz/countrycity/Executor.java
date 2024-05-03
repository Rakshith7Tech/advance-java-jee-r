package com.xworkz.countrycity;

import com.xworkz.countrycity.dto.CityDTO;
import com.xworkz.countrycity.dto.CountryDTO;
import com.xworkz.countrycity.service.CountryCityService;
import com.xworkz.countrycity.service.impl.CountryCityServiceImpl;

public class Executor {
    public static void main(String[] args) {
        CountryCityService countryCityService = new CountryCityServiceImpl();

        // Create a new City
        CityDTO cityDTO = new CityDTO();
        cityDTO.setCityName("Bangalore");
        cityDTO.setPopulation(1234567L);
        cityDTO.setArea(709.5);

        // Create a new Country
        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setCountryName("India");
        countryDTO.setCapital("New Delhi");
        countryDTO.setPopulation(1380004385L);
        countryDTO.setCurrency("Indian Rupee");

        // Link the Country to the City
        countryDTO.setCityDTO(cityDTO);

        // Validate and add the Country and City details
        boolean result = countryCityService.validateAndAddCountryDetails(countryDTO);

        if (result) {
            System.out.println("Country and City details added successfully!");
        } else {
            System.out.println("Adding country and city details failed.");
        }
    }
}
