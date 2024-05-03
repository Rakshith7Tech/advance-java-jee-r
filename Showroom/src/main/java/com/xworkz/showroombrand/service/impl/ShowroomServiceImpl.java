package com.xworkz.showroombrand.service.impl;

import com.xworkz.showroombrand.dto.GiriasDTO;
import com.xworkz.showroombrand.repository.ShowroomRepository;
import com.xworkz.showroombrand.repository.impl.ShowroomRepositoryImpl;
import com.xworkz.showroombrand.service.ShowroomService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ShowroomServiceImpl implements ShowroomService {
    //has-a-relationship
    ShowroomRepository showroomRepository;

    public ShowroomServiceImpl(){
        showroomRepository = new ShowroomRepositoryImpl();
    }

    @Override
    public boolean validateProductAndAdd(GiriasDTO dto) {
        System.out.println("Welcome to validation method of service...Your data is getting validated");
        boolean isProductNameValidated=false;
        boolean isModelValidated=false;
        boolean isPriceValidated=false;
        boolean isQuantityInStockValidated=false;
        boolean isCategoryValidated=false;
        boolean isColorValidated=false;
        boolean isWeightValidated=false;
        boolean isWarrantyValidated=false;
        if (dto!=null){
            if (dto.getProductName()!=null){
                isProductNameValidated=true;
            }
            if (dto.getModel()!=null){
                isModelValidated=true;
            }
            if (dto.getPrice()>0){
                isPriceValidated=true;
            }
            if (dto.getQuantityInStock()>0){
                isQuantityInStockValidated=true;
            }
            if (dto.getCategory()!=null){
                isCategoryValidated=true;
            }
            if (dto.getColor()!=null){
                isColorValidated=true;
            }
            if (dto.getWeight()>0){
                isWeightValidated=true;
            }
            if (dto.getWarranty()!=null){
                isWarrantyValidated=true;
            }
        }
        if (isProductNameValidated==true && isModelValidated==true && isPriceValidated==true && isQuantityInStockValidated==true && isCategoryValidated==true && isColorValidated==true && isWeightValidated==true && isWarrantyValidated==true){
            showroomRepository.addProduct(dto);
        }
        return true;
    }

    @Override
    public GiriasDTO getProductInfoById(int id) {
        System.out.println("Invoked getProductInfoById of service layer");
        GiriasDTO dto=null;
        if (id>0) {
            System.out.println();
            dto=showroomRepository.getProductInfoById(id);
        }
        return dto;
    }

    @Override
    public List<GiriasDTO> findAll() {
        System.out.println("Invoked findAll of service layer");
        List<GiriasDTO> list = showroomRepository.findAll();
        if (list!=null){
            System.out.println("List is not null...");
        }
        return list;
    }
}
