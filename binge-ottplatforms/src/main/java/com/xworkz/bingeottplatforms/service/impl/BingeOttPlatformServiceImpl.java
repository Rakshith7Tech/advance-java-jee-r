package com.xworkz.bingeottplatforms.service.impl;

import com.xworkz.bingeottplatforms.dto.BingeDTO;
import com.xworkz.bingeottplatforms.repository.BingeOttPlatformRepository;
import com.xworkz.bingeottplatforms.repository.impl.BingeOttPlatformRepositoryImpl;
import com.xworkz.bingeottplatforms.service.BingeOttPlatformService;

public class BingeOttPlatformServiceImpl implements BingeOttPlatformService {
    BingeOttPlatformRepository bingeOttPlatformRepository;
    public BingeOttPlatformServiceImpl(){
        bingeOttPlatformRepository = new BingeOttPlatformRepositoryImpl();
    }
    @Override
    public boolean validateAndAddBingeInfo(BingeDTO bingeDTO) {
        System.out.println("Validating service layer");
        if (bingeDTO!=null){
            bingeOttPlatformRepository.addBingeInfo(bingeDTO);
        }
        return true;
    }
}
