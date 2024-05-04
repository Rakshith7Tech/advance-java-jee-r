package com.xworkz.airportterminals.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
//@ToString
@Entity
@Table(name = "terminal")
@NamedQuery(name = "findAirportByTerminalId",query = "select t FROM TerminalDTO t WHERE t.terminalId =:id")
public class TerminalDTO {
    @Id
    @Column(name = "terminal_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int terminalId;

    @Column(name = "terminal_Name")
    private String terminalName;

    @ManyToOne
    @JoinColumn(name = "airport_Id")
    private AirportDTO airportDTO;
}
