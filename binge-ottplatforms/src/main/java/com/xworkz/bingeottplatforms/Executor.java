package com.xworkz.bingeottplatforms;

import com.xworkz.bingeottplatforms.dto.BingeDTO;
import com.xworkz.bingeottplatforms.dto.OttPlatformDTO;
import com.xworkz.bingeottplatforms.service.BingeOttPlatformService;
import com.xworkz.bingeottplatforms.service.impl.BingeOttPlatformServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        BingeOttPlatformService bingeOttPlatformService = new BingeOttPlatformServiceImpl();
        List<OttPlatformDTO> ottPlatformDTOS = new ArrayList<>();

        BingeDTO bingeDTO = new BingeDTO();
        bingeDTO.setBingeName("Binge");
        bingeDTO.setCategory("Video Stream");

        OttPlatformDTO ottPlatformDTO1 = new OttPlatformDTO();
        ottPlatformDTO1.setOttName("House of Cards");
        ottPlatformDTO1.setOttType("Series");

        OttPlatformDTO ottPlatformDTO2 = new OttPlatformDTO();
        ottPlatformDTO2.setOttName("Squid Game");
        ottPlatformDTO2.setOttType("Series");

        OttPlatformDTO ottPlatformDTO3 = new OttPlatformDTO();
        ottPlatformDTO3.setOttName("2 fast 2 Furious");
        ottPlatformDTO3.setOttType("Movie");

        ottPlatformDTOS.add(ottPlatformDTO1);
        ottPlatformDTOS.add(ottPlatformDTO2);
        ottPlatformDTOS.add(ottPlatformDTO3);

        bingeDTO.setOttPlatformDTOS(ottPlatformDTOS);

        boolean result = bingeOttPlatformService.validateAndAddBingeInfo(bingeDTO);

        if (result){
            System.out.println("Binge details added successfully!");
        }else {
            System.out.println("Adding binge details failed.");
        }
    }
}
