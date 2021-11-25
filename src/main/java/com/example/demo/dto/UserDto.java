package com.example.demo.dto;


import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Component
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Validated
public class UserDto {


    @Size(min = 1, max = 5, message
            = "About Me must be between 1 and 5 characters")
    private String name;


    private String surname;

    private String email;


    public UserDto() {
    }


    public UserDto(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
}
