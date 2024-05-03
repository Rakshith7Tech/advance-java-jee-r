package com.xworkz.countrycity.service.impl;

import com.xworkz.countrycity.dto.CountryDTO;
import com.xworkz.countrycity.repository.CountryCityRepository;
import com.xworkz.countrycity.repository.impl.CountryCityRepositoryImpl;
import com.xworkz.countrycity.service.CountryCityService;

public class CountryCityServiceImpl implements CountryCityService {
    CountryCityRepository countryCityRepository;
    public CountryCityServiceImpl(){
        countryCityRepository=new CountryCityRepositoryImpl();
    }
    @Override
    public boolean validateAndAddCountryDetails(CountryDTO dto) {
        System.out.println("validation service layer");
        if (dto != null) {
            countryCityRepository.addCountryDetails(dto);
            return true;
        }
        System.out.println("validation failed");
        return false;
    }
}
