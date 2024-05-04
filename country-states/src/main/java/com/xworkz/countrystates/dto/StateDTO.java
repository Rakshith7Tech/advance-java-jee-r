package com.xworkz.countrystates.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "state")
public class StateDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "state_Id")
    private int stateId;

    @Column(name = "state_Name")
    private String stateName;

    @Column(name = "state_Capital")
    private String stateCapital;

//    @ManyToOne
//    @JoinColumn(name = "country_Id")
//    private CountryDTO country;
}
