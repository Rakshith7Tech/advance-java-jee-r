package com.xworkz.mobilebattery;

import com.xworkz.mobilebattery.dto.BatteryDTO;
import com.xworkz.mobilebattery.dto.MobileDTO;
import com.xworkz.mobilebattery.service.MobileBatteryService;
import com.xworkz.mobilebattery.service.impl.MobileBatteryServiceImpl;

public class Executor {
    public static void main(String[] args) {
        MobileBatteryService mobileBatteryService = new MobileBatteryServiceImpl();

        // Create a new Battery
        BatteryDTO batteryDTO = new BatteryDTO();
        batteryDTO.setBrand("Duracell");
        batteryDTO.setCapacity(2000);
        batteryDTO.setVoltage(1.5);
        batteryDTO.setTechnology("Alkaline");
        batteryDTO.setPrice(2.5);

        // Create a new Mobile
        MobileDTO mobileDTO = new MobileDTO();
        mobileDTO.setBrand("Samsung");
        mobileDTO.setModel("Galaxy S21");
        mobileDTO.setStorageCapacity(128);
        mobileDTO.setColor("Phantom Black");
        mobileDTO.setPrice(999.99);

        // Link the Battery to the Mobile
        mobileDTO.setBatteryDTO(batteryDTO);

        // Validate and add the Mobile and Battery details
        boolean result = mobileBatteryService.validateAndAddMobileDetails(mobileDTO);

        if (result) {
            System.out.println("Mobile and Battery details added successfully!");
        } else {
            System.out.println("Adding mobile and battery details failed.");
        }
    }
}
