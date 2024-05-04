package com.xworkz.countrystates;

import com.xworkz.countrystates.dto.CountryDTO;
import com.xworkz.countrystates.dto.StateDTO;
import com.xworkz.countrystates.service.CountryStateService;
import com.xworkz.countrystates.service.impl.CountryStateServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        CountryStateService countryStateService = new CountryStateServiceImpl();
        List<StateDTO> stateDTOs = new ArrayList<>();

        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setCountryName("India");
        countryDTO.setContinent("Asia");
        countryDTO.setCapital("New Delhi");
        countryDTO.setPopulation(1380004385);

        StateDTO stateDTO1 = new StateDTO();
        stateDTO1.setStateName("Karnataka");
        stateDTO1.setStateCapital("Bengaluru");

        StateDTO stateDTO2 = new StateDTO();
        stateDTO2.setStateName("Kerala");
        stateDTO2.setStateCapital("Thiruvananthapuram");

        stateDTOs.add(stateDTO1);
        stateDTOs.add(stateDTO2);

        countryDTO.setStates(stateDTOs);

        boolean result = countryStateService.validateAndAddCountryInfo(countryDTO);

        if (result) {
            System.out.println("Country details added successfully!");
        } else {
            System.out.println("Adding country details failed.");
        }
    }
}
