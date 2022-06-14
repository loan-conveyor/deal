package com.example.deal.entity;

import com.example.deal.entity.enums.Gender;
import com.example.deal.entity.enums.MaritalStatus;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lastName;

    private String firstName;

    private String middleName;

    private LocalDate birthdate;

    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    private Integer dependentAmount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="PASSPORT_ID", referencedColumnName="ID")
    private Passport passport;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="EMPLOYMENT_ID", referencedColumnName="ID")
    private Employment employment;

    private String account;
}