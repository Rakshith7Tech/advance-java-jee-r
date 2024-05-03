package com.xworkz.bankatm.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bank_account")
public class BankAccountDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_Id")
    private int accountId;

    @Column(name = "account_Number")
    private String accountNumber;

    @Column(name = "accountHolder_Name")
    private String accountHolderName;

    @Column(name = "balance")
    private double balance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_Id")
    private AtmCardDTO atmCard;
}
