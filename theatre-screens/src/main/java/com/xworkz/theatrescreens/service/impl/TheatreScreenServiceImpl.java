package com.xworkz.theatrescreens.service.impl;

import com.xworkz.theatrescreens.dto.TheatreDTO;
import com.xworkz.theatrescreens.repository.TheatreScreenRepository;
import com.xworkz.theatrescreens.repository.impl.TheatreScreenRepositoryImpl;
import com.xworkz.theatrescreens.service.TheatreScreenService;

public class TheatreScreenServiceImpl implements TheatreScreenService {
    TheatreScreenRepository theatreScreenRepository;
    public TheatreScreenServiceImpl(){
        theatreScreenRepository = new TheatreScreenRepositoryImpl();
    }
    @Override
    public boolean validateAndAddTheatreInfo(TheatreDTO theatreDTO) {
        System.out.println("Validating service layer");
        if (theatreDTO!=null){
            theatreScreenRepository.addTheatreInfo(theatreDTO);
        }
        return true;
    }
}
