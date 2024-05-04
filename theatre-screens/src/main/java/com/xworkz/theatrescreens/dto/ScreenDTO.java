package com.xworkz.theatrescreens.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class ScreenDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "screen_Id")
    private int screenId;

    @Column(name = "screen_Name")
    private String screenName;

    @Column(name = "dimension")
    private String dimension;
}

