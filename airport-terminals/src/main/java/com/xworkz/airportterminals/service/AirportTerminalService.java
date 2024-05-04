package com.xworkz.airportterminals.service;

import com.xworkz.airportterminals.dto.AirportDTO;

public interface AirportTerminalService {
    public boolean validateAndAddAirportInfo(AirportDTO airportDTO);
    public AirportDTO getAirportInfoByTerminalId(int id);
}
