package com.epam.spring.homework4.testing.controller.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class UserDto {
    private String login;
    private String email;
    private String  movieName;
    private String movieDate;
    private int roleId;

}

