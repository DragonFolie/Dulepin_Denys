package com.epam.spring.homework4.testing.model;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class User {

    private String login;
    private String email;
    private String password;
    private String  movieName;
    private String date;
    private int roleId;
}
