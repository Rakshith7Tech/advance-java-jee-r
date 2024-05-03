package com.xworkz.showroombrand;

import com.xworkz.showroombrand.constant.Color;
import com.xworkz.showroombrand.constant.Warranty;
import com.xworkz.showroombrand.dto.GiriasDTO;
import com.xworkz.showroombrand.repository.impl.ShowroomRepositoryImpl;
import com.xworkz.showroombrand.repository.ShowroomRepository;
import com.xworkz.showroombrand.service.ShowroomService;
import com.xworkz.showroombrand.service.impl.ShowroomServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ProductExecutor {
    public static void main(String[] args) {
        ShowroomRepository showroom = new ShowroomRepositoryImpl();
        ShowroomService showroomService = new ShowroomServiceImpl();
        Scanner sc = new Scanner(System.in);

//        int size= sc.nextInt();
//
//        for (int i = 0; i < size; i++) {
//
//            sc.nextLine();
//
//            System.out.print("Product Name: ");
//            String productName = sc.nextLine();
//
//            System.out.print("Model Name: ");
//            String model = sc.nextLine();
//
//            System.out.print("Price: ");
//            double price = sc.nextDouble();
//
//            System.out.print("Quantity in Stock: ");
//            int quantity = sc.nextInt();
//
//            System.out.print("Category: ");
//            String category = sc.next();
//
//            System.out.print("Color: ");
//            String color = sc.next();
//
//            sc.nextLine();
//
//            System.out.print("Weight: ");
//            int weight = sc.nextInt();
//
//            System.out.println("Warranty: ");
//            String warranty = sc.next();
//
//            GiriasDTO giriasDTO = new GiriasDTO();
//            giriasDTO.setProductName(productName);
//            giriasDTO.setModel(model);
//            giriasDTO.setPrice(price);
//            giriasDTO.setQuantityInStock(quantity);
//            giriasDTO.setCategory(category);
//            giriasDTO.setColor(Color.valueOf(color));
//            giriasDTO.setWeight(weight);
//            giriasDTO.setWarranty(Warranty.valueOf(warranty));
//
//            boolean result = showroomService.validateProductAndAdd(giriasDTO);
//            if (result) {
//                System.out.println("Product added successfully!");
//            } else {
//                System.out.println("Failed to add the product.");
//            }
//        }
        List<GiriasDTO> list = showroomService.findAll();
        for (GiriasDTO giriasDTO : list) {
            System.out.println(giriasDTO);
        }
//        System.out.println(list.toString());
//        System.out.println(list.size());

//
//        int id = 0;
//        GiriasDTO giriasDTO = GiriasDTO.
//                builder().id(id++).
//                productName(sc.next()).
//                model(sc.next()).
//                price(sc.nextDouble()).
//                quantityInStock(sc.nextInt()).
//                category(sc.next()).
//                color(Color.valueOf(sc.next())).
//                weight(sc.nextInt()).
//                warranty(Warranty.valueOf(sc.next())).
//                build();
//        showroom.addProduct(giriasDTO);


        int productId=sc.nextInt();
        GiriasDTO giri = showroom.getProductInfoById(productId);

        System.out.println(giri);

        System.out.println("Enter the Id to get Product Details");
        int productid=sc.nextInt();
        GiriasDTO retrievedData= showroom.getProductInfoById(productid);
        System.out.println(retrievedData);

        System.out.println("Enter Product Id to update Quantity in Stock");
        int prodId=sc.nextInt();

        System.out.println("Enter the updated Quantity in Stock");
        int updatedQuantity=sc.nextInt();

        showroom.updateQuantityInStockByProductId(updatedQuantity,prodId);
    }
}
