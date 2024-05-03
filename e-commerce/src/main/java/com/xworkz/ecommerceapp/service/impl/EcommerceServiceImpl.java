package com.xworkz.ecommerceapp.service.impl;

import com.xworkz.ecommerceapp.dto.CartItemDTO;
import com.xworkz.ecommerceapp.dto.UserDTO;
import com.xworkz.ecommerceapp.repository.EcommerceRepository;
import com.xworkz.ecommerceapp.repository.impl.EcommerceRepositoryImpl;
import com.xworkz.ecommerceapp.service.EcommerceService;

public class EcommerceServiceImpl implements EcommerceService {
    EcommerceRepository ecommerceRepository;

    public EcommerceServiceImpl(){
        ecommerceRepository=new EcommerceRepositoryImpl();
    }

    @Override
    public boolean validateAndSaveUser(UserDTO dto) {
        System.out.println("Welcome to validation method of user service...Your data is getting validated");

        boolean isUserNameValidated=false;
        boolean isFirstNameValidated=false;
        boolean isLastNameValidated=false;
        boolean isPasswordValidated=false;
        boolean isPhoneNoValidated=false;
        boolean isCreatedAtValidated = false;
        boolean isModifiedAtValidated = false;

        if (dto != null) {
            if (dto.getUserName() != null && !dto.getUserName().isEmpty()) {
                isUserNameValidated = true;
            }
            if (dto.getFirstName() != null && !dto.getFirstName().isEmpty()) {
                isFirstNameValidated = true;
            }
            if (dto.getLastName() != null && !dto.getLastName().isEmpty()) {
                isLastNameValidated = true;
            }
            if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
                isPasswordValidated = true;
            }
            if (dto.getCreatedAt() != null) {
                isCreatedAtValidated = true;
            }
            if (dto.getModifiedAt() != null) {
                isModifiedAtValidated = true;
            }
            if (dto.getPhoneNo() > 0) {
                isPhoneNoValidated = true;
            }
        }

        if (isUserNameValidated==true && isFirstNameValidated==true && isLastNameValidated==true &&
                isPasswordValidated==true && isPhoneNoValidated==true && isCreatedAtValidated==true &&
                isModifiedAtValidated==true) {
            System.out.println("User Validation Successful");
            ecommerceRepository.saveUser(dto);
        }
        return true;
    }

    @Override
    public boolean validateAndSaveCart(CartItemDTO dto) {
        System.out.println("Welcome to validation method of cart service...Your data is getting validated");
        if (dto != null) {
            System.out.println("Validation Successful");
            ecommerceRepository.saveCart(dto);
            return true;
        }
        System.out.println("Validation Failed");
        return false;
    }
}
