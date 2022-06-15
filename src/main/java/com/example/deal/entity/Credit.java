package com.example.deal.entity;

import com.example.deal.entity.enums.CreditStatus;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "credit")
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    private Integer term;

    private BigDecimal monthlyPayment;

    private BigDecimal rate;

    private BigDecimal psk;

    private String paymentSchedule;

    private Boolean isInsuranceEnabled;

    private Boolean isSalaryClient;

    @Enumerated(EnumType.STRING)
    private CreditStatus creditStatus;
}
