package ru.itgirls.calc.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity

@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "customer_id")
    //private Customer customer;
    @Column(nullable = false)
    private int deposit;
    @Column(nullable = false, name ="full_cost")
    private int fullCost;
    @Column
    private int refund;
    @Column
    private LocalDate purchaseDate;
}
