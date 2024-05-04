package com.xworkz.mallshops.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "mall")
public class MallDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mall_Id")
    private int mallId;

    @Column(name = "mall_Name")
    private String mallName;

    @Column(name = "location")
    private String location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "mall_Id")
    private List<ShopDTO> shops;
}
