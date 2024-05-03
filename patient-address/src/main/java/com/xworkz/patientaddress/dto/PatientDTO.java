package com.xworkz.patientaddress.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "patient")

public class PatientDTO {
    @Id
    @Column(name = "patient_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;
    @Column(name = "patient_Name")
    private  String patientName;
    @Column(name = "disease")
    private String disease;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_Id")
    private AddressDTO addressId;

}
