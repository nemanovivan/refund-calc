package ru.itgirls.calc.dto;

import java.util.List;

public class CustomerDto {
    private Long id;
    private String surname;
    private String name;
    private String phone;
    private String telegramName;
    private String mail;
    private List <AccountDto> accountDtos;
}
