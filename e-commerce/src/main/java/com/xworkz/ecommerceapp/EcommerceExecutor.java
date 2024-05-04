package com.xworkz.ecommerceapp;

import com.xworkz.ecommerceapp.dto.CartItemDTO;
import com.xworkz.ecommerceapp.dto.UserDTO;
import com.xworkz.ecommerceapp.repository.EcommerceRepository;
import com.xworkz.ecommerceapp.repository.impl.EcommerceRepositoryImpl;
import com.xworkz.ecommerceapp.service.EcommerceService;
import com.xworkz.ecommerceapp.service.impl.EcommerceServiceImpl;

import java.sql.Timestamp;
import java.util.Scanner;

public class EcommerceExecutor {
    public static void main(String[] args) {

        EcommerceRepository ecommerceRepository = new EcommerceRepositoryImpl();
        EcommerceService ecommerceService = new EcommerceServiceImpl();

        UserDTO userDTO = new UserDTO();
        CartItemDTO cartItemDTO = new CartItemDTO();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the User Name: ");
        String username=sc.next();
        userDTO.setUserName(username);

        System.out.println("Enter the user first name: ");
        String firstname=sc.next();
        userDTO.setFirstName(firstname);

        System.out.println("Enter the user last name: ");
        String lastname=sc.next();
        userDTO.setLastName(lastname);

        System.out.println("Enter the Password: ");
        String password=sc.next();
        userDTO.setPassword(password);

        System.out.println("Enter the phone Number: ");
        long phNo=sc.nextLong();
        userDTO.setPhoneNo(phNo);

        System.out.println("Enter the created at (yyyy-MM-dd HH:mm:ss): ");
        String createdAtString = sc.next();
        userDTO.setCreatedAt(createdAtString);

        System.out.println("Enter the modified at (yyyy-MM-dd HH:mm:ss): ");
        String modifiedAtString = sc.next();
        userDTO.setModifiedAt(modifiedAtString);

        userDTO.setCartItemDTO(cartItemDTO);

        System.out.println("Enter the Cart Item ID: ");
        int cartItemId = sc.nextInt();
        cartItemDTO.setCartItemId(cartItemId);

        System.out.println("Enter the Product ID: ");
        int productId = sc.nextInt();
        cartItemDTO.setProductId(productId);

        System.out.println("Enter the Quantity: ");
        int quantity = sc.nextInt();
        cartItemDTO.setQuantity(quantity);

        boolean result = ecommerceService.validateAndSaveUser(userDTO);
        if (result) {
            System.out.println("Added successfully!");
        } else {
            System.out.println("Adding Failed.");
        }

        boolean result1 = ecommerceService.validateAndSaveCart(cartItemDTO);
            if (result) {
                System.out.println("Added successfully!");
            } else {
                System.out.println("Adding Failed.");
            }
    }
}
