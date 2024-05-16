package ru.itgirls.calc.dto;

import java.time.LocalDate;

public class AccountDto {
    private Long id;
    private CustomerDto customerDto;
    private int deposit;
    private int fullCost;
    private int refund;
    private LocalDate purchaseDate;
}
