package com.xworkz.mallshops;

import com.xworkz.mallshops.dto.MallDTO;
import com.xworkz.mallshops.dto.ShopDTO;
import com.xworkz.mallshops.service.MallShopService;
import com.xworkz.mallshops.service.impl.MallShopServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        MallShopService mallShopService = new MallShopServiceImpl();
        List<ShopDTO> shopDTOs = new ArrayList<>();

        MallDTO mallDTO = new MallDTO();
        mallDTO.setMallName("Orion Mall");
        mallDTO.setLocation("City Center");

        ShopDTO shopDTO1 = new ShopDTO();
        shopDTO1.setShopName("Electronics Store");
        shopDTO1.setCategory("Electronics");

        ShopDTO shopDTO2 = new ShopDTO();
        shopDTO2.setShopName("Fashion Outlet");
        shopDTO2.setCategory("Fashion");

        shopDTOs.add(shopDTO1);
        shopDTOs.add(shopDTO2);

        mallDTO.setShops(shopDTOs);

        boolean result = mallShopService.validateAndAddMallInfo(mallDTO);

        if (result) {
            System.out.println("Mall details added successfully!");
        } else {
            System.out.println("Adding mall details failed.");
        }
    }
}
