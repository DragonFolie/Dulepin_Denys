package com.epam.spring.homework4.testing.repository;


import com.epam.spring.homework4.testing.model.User;

import java.util.List;

public interface UserRepository {

    User createAccount(User user);

    User find(String login);

    List<User> findAll();

    User update(String login, User user);

    void delete(String login);
}
