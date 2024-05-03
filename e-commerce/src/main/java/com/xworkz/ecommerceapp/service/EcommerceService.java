package com.xworkz.ecommerceapp.service;

import com.xworkz.ecommerceapp.dto.CartItemDTO;
import com.xworkz.ecommerceapp.dto.UserDTO;

public interface EcommerceService {
    public boolean validateAndSaveUser(UserDTO dto);
    public boolean validateAndSaveCart(CartItemDTO dto);
}
