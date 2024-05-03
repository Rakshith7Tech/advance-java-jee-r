package com.xworkz.patientaddress.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "address")

public class AddressDTO {
    @Id
    @Column(name = "address_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    @Column(name = "pin_Code")
    private int pinCode;
    @Column(name = "area_Name")
    private String areaName;
    @Column(name = "state")
    private  String state;
    @Column(name = "country")
    private  String country;
}
