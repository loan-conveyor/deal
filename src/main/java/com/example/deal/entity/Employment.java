package com.example.deal.entity;

import com.example.deal.entity.enums.EmploymentStatus;
import com.example.deal.entity.enums.Position;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "employment")
public class Employment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EmploymentStatus employmentStatus;

    private String employerINN;

    private BigDecimal salary;

    @Enumerated(EnumType.STRING)
    private Position position;

    private Integer workExperienceTotal;

    private Integer workExperienceCurrent;

}
