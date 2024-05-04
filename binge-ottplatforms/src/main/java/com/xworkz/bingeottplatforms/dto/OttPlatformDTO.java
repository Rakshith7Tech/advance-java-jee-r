package com.xworkz.bingeottplatforms.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ott")
public class OttPlatformDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ott_Id")
    private int ottId;

    @Column(name = "ott_Name")
    private String ottName;

    @Column(name = "ott_Type")
    private String ottType;
}
