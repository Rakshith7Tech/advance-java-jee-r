package com.xworkz.showroombrand.dto;

import com.xworkz.showroombrand.constant.Color;
import com.xworkz.showroombrand.constant.Warranty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "girias_product")
@Data
@NamedQuery(name = "findAll",query = "select dto from GiriasDTO as dto")
//@Builder
public class GiriasDTO {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")
    private int id;
    @Column(name = "product_Name")
    private String productName;
    @Column(name = "model")
    private String model;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity_In_Stock")
    private int quantityInStock;
    @Column(name = "category")
    private String category;
    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    private Color color;
    @Column(name = "weight")
    private int weight;
    @Column(name = "warranty")
    @Enumerated(EnumType.STRING)
    private Warranty warranty;
}
