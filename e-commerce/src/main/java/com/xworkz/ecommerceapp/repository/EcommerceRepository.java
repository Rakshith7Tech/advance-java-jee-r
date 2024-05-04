package com.xworkz.ecommerceapp.repository;

import com.xworkz.ecommerceapp.dto.CartItemDTO;
import com.xworkz.ecommerceapp.dto.UserDTO;

public interface EcommerceRepository {
    public void saveUser(UserDTO dto);
    public void saveCart(CartItemDTO dto);
}
