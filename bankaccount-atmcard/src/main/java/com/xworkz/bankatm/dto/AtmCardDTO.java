package com.xworkz.bankatm.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "atm_card")
public class AtmCardDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_Id")
    private int cardId;

    @Column(name = "card_Number")
    private String cardNumber;

    @Column(name = "expiration_Date")
    private String expirationDate;

}
