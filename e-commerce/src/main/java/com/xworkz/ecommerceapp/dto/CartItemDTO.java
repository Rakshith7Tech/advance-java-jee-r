package com.xworkz.ecommerceapp.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "cart_items")
public class CartItemDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private int cartItemId;

    @Column(name = "product_id")
    private int productId;
    @Column(name = "quantity")
    private int quantity;
//    @OneToOne(mappedBy = "userId") // It represents column name mapped with the db
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id") // It represents foreign key in db
//    private UserDTO userDTO;
    @Column(name = "created_at")
    private String createdAt;
    @Column(name = "modified_at")
    private String modifiedAt;
}
