package com.xworkz.airportterminals.service.impl;

import com.xworkz.airportterminals.dto.AirportDTO;
import com.xworkz.airportterminals.repository.AirportTerminalRepository;
import com.xworkz.airportterminals.repository.impl.AirportTerminalRepositoryImpl;
import com.xworkz.airportterminals.service.AirportTerminalService;

public class AirportTerminalServiceImpl implements AirportTerminalService {
    AirportTerminalRepository airportTerminalRepository;
    public AirportTerminalServiceImpl(){
        airportTerminalRepository = new AirportTerminalRepositoryImpl();
    }
    @Override
    public boolean validateAndAddAirportInfo(AirportDTO airportDTO) {
        System.out.println("Validating service layer");
        if (airportDTO!=null){
            airportTerminalRepository.addAirportInfo(airportDTO);
        }
        return true;
    }

    @Override
    public AirportDTO getAirportInfoByTerminalId(int id) {
        if (id>0){
           return airportTerminalRepository.getAirportInfoByTerminalId(id);
        }
        return null;
    }
}
