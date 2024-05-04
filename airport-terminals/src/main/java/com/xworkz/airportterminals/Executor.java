package com.xworkz.airportterminals;

import com.xworkz.airportterminals.dto.AirportDTO;
import com.xworkz.airportterminals.dto.TerminalDTO;
import com.xworkz.airportterminals.service.AirportTerminalService;
import com.xworkz.airportterminals.service.impl.AirportTerminalServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        AirportTerminalService airportTerminalService = new AirportTerminalServiceImpl();
        List<TerminalDTO> terminalDTOS = new ArrayList<>();

        AirportDTO airportDTO = new AirportDTO();
        airportDTO.setAirportName("Indira Gandhi International Airport");
        airportDTO.setCity("Delhi");
        airportDTO.setType("International");

        TerminalDTO terminalDTO = new TerminalDTO();
        terminalDTO.setTerminalName("Spider Man");
        terminalDTO.setAirportDTO(airportDTO);

        TerminalDTO terminalDTO1 = new TerminalDTO();
        terminalDTO1.setTerminalName("Hulk");
        terminalDTO1.setAirportDTO(airportDTO);

        TerminalDTO terminalDTO2 = new TerminalDTO();
        terminalDTO2.setTerminalName("Wolverine");
        terminalDTO2.setAirportDTO(airportDTO);

        terminalDTOS.add(terminalDTO);
        terminalDTOS.add(terminalDTO1);
        terminalDTOS.add(terminalDTO2);

        airportDTO.setDtos(terminalDTOS);

//        boolean result = airportTerminalService.validateAndAddAirportInfo(airportDTO);
//
//        if (result) {
//            System.out.println("Airport details added successfully!");
//        } else {
//            System.out.println("Adding airport details failed.");
//        }

        //terminalDTO.setAirportDTO(airportDTO);

        System.out.println("Fetching airport info by terminal id");
        AirportDTO airportDTO1 = airportTerminalService.getAirportInfoByTerminalId(8);
        System.out.println(airportDTO1);
    }
}
