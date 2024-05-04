package com.xworkz.mobilebattery.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mobile")
public class MobileDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mobile_Id")
    private int mobileId;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "storage_capacity")
    private int storageCapacity;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private double price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "battery_Id")
    private BatteryDTO batteryDTO;
}
