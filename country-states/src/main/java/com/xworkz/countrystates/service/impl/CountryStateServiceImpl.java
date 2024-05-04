package com.xworkz.countrystates.service.impl;

import com.xworkz.countrystates.dto.CountryDTO;
import com.xworkz.countrystates.repository.CountryStateRepository;
import com.xworkz.countrystates.repository.impl.CountryStateRepositoryImpl;
import com.xworkz.countrystates.service.CountryStateService;

public class CountryStateServiceImpl implements CountryStateService {
    CountryStateRepository countryStateRepository;
    public CountryStateServiceImpl(){
        countryStateRepository = new CountryStateRepositoryImpl();
    }
    @Override
    public boolean validateAndAddCountryInfo(CountryDTO countryDTO) {
        System.out.println("Validating service layer");
        if (countryDTO!=null){
            countryStateRepository.addCountryInfo(countryDTO);
        }
        return true;
    }
}
