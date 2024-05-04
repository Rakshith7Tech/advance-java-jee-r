package com.xworkz.mallshops.service.impl;

import com.xworkz.mallshops.dto.MallDTO;
import com.xworkz.mallshops.repository.MallShopRepository;
import com.xworkz.mallshops.repository.impl.MallShopRepositoryImpl;
import com.xworkz.mallshops.service.MallShopService;

public class MallShopServiceImpl implements MallShopService {
    MallShopRepository mallShopRepository;
    public MallShopServiceImpl(){
        mallShopRepository = new MallShopRepositoryImpl();
    }
    @Override
    public boolean validateAndAddMallInfo(MallDTO mallDTO) {
        System.out.println("Validating service layer");
        if (mallDTO!=null){
            mallShopRepository.addMallInfo(mallDTO);
        }
        return true;
    }
}
