package com.xworkz.mallshops.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shop")
public class ShopDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_Id")
    private int shopId;

    @Column(name = "shop_Name")
    private String shopName;

    @Column(name = "category")
    private String category;
}
