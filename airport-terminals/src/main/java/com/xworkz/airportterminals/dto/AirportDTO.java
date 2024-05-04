package com.xworkz.airportterminals.dto;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "airport")
public class AirportDTO {
    @Id
    @Column(name = "airport_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int airportId;

    @Column(name = "airport_Name")
    private String airportName;
    @Column(name = "city")
    private String city;
    @Column(name = "type")
    private String type;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "airportDTO")
    //@JoinColumn(name = "airport_Id")
    private List<TerminalDTO>dtos;
}
