package com.xworkz.airportterminals.repository;

import com.xworkz.airportterminals.dto.AirportDTO;

public interface AirportTerminalRepository {
    public void addAirportInfo(AirportDTO airportDTO);
    public AirportDTO getAirportInfoByTerminalId(int id);
}
