package com.xworkz.bingeottplatforms.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "binge")
public class BingeDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "binge_Id")
    private int bingeId;

    @Column(name = "binge_Name")
    private String bingeName;

    @Column(name = "category")
    private String category;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "binge_Id")
    private List<OttPlatformDTO> ottPlatformDTOS;
}
