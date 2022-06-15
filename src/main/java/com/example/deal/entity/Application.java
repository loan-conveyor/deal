package com.example.deal.entity;

import com.example.deal.entity.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CLIENT_ID", referencedColumnName="ID")
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CREDIT_ID", referencedColumnName="ID")
    private Credit credit;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDate creationDate;

    private String appliedOffer;

    private LocalDate signDate;

    private String sesCode;

    private String statusHistory;
}
