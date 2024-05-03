package com.xworkz.mobilebattery.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "battery")
public class BatteryDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "battery_Id")
    private int batteryId;

    @Column(name = "brand")
    private String brand;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "voltage")
    private double voltage;

    @Column(name = "technology")
    private String technology;

    @Column(name = "price")
    private double price;

}
