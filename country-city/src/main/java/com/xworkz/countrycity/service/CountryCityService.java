package com.xworkz.countrycity.service;

import com.xworkz.countrycity.dto.CountryDTO;

public interface CountryCityService {
    public boolean validateAndAddCountryDetails(CountryDTO dto);
}
