package com.epam.spring.homework4.testing.service;

import com.epam.spring.homework4.testing.controller.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createAccount(UserDto userDto);

    UserDto find(String login);

    List<UserDto> findAll();

    UserDto update(String login, UserDto userDto);

    void delete(String login);
}
