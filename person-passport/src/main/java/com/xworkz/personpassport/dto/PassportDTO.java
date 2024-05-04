package com.xworkz.personpassport.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "passport")
public class PassportDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passport_id")
    private int passportId;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "issue_date")
    private String issueDate;

    @Column(name = "expiration_date")
    private String expirationDate;
}
