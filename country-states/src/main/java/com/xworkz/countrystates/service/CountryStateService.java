package com.xworkz.countrystates.service;

import com.xworkz.countrystates.dto.CountryDTO;

public interface CountryStateService {
    public boolean validateAndAddCountryInfo(CountryDTO countryDTO);
}
