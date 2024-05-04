package com.xworkz.theatrescreens;

import com.xworkz.theatrescreens.dto.ScreenDTO;
import com.xworkz.theatrescreens.dto.TheatreDTO;
import com.xworkz.theatrescreens.service.TheatreScreenService;
import com.xworkz.theatrescreens.service.impl.TheatreScreenServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        TheatreScreenService theatreScreenService = new TheatreScreenServiceImpl();
        List<ScreenDTO> screenDTOs = new ArrayList<>();

        TheatreDTO theatreDTO = new TheatreDTO();
        theatreDTO.setTheatreName("Cineplex");
        theatreDTO.setLocation("City Square");

        ScreenDTO screenDTO1 = new ScreenDTO();
        screenDTO1.setScreenName("Screen 1");
        screenDTO1.setDimension("2D");

        ScreenDTO screenDTO2 = new ScreenDTO();
        screenDTO2.setScreenName("Screen 2");
        screenDTO2.setDimension("3D");

        screenDTOs.add(screenDTO1);
        screenDTOs.add(screenDTO2);

        theatreDTO.setScreens(screenDTOs);

        boolean result = theatreScreenService.validateAndAddTheatreInfo(theatreDTO);

        if (result) {
            System.out.println("Theatre details added successfully!");
        } else {
            System.out.println("Adding theatre details failed.");
        }
    }
}
