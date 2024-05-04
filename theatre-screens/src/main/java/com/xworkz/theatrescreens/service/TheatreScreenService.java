package com.xworkz.theatrescreens.service;

import com.xworkz.theatrescreens.dto.TheatreDTO;

public interface TheatreScreenService {
    public boolean validateAndAddTheatreInfo(TheatreDTO theatreDTO);
}
