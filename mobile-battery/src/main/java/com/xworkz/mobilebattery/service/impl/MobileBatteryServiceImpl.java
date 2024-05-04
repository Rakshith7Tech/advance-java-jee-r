package com.xworkz.mobilebattery.service.impl;

import com.xworkz.mobilebattery.dto.MobileDTO;
import com.xworkz.mobilebattery.repository.MobileBatteryRepository;
import com.xworkz.mobilebattery.repository.impl.MobileBatteryRepositoryImpl;
import com.xworkz.mobilebattery.service.MobileBatteryService;

public class MobileBatteryServiceImpl implements MobileBatteryService {
    MobileBatteryRepository mobileBatteryRepository;
    public MobileBatteryServiceImpl(){
        mobileBatteryRepository=new MobileBatteryRepositoryImpl();
    }
    @Override
    public boolean validateAndAddMobileDetails(MobileDTO dto) {
        System.out.println("validation service layer");
        if (dto != null) {
            mobileBatteryRepository.addMobileDetails(dto);
            return true;
        }
        System.out.println("validation failed");
        return false;
    }
}
