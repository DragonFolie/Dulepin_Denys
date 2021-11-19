package com.epam.spring.homework4.testing.repository.impl;

import com.epam.spring.homework4.testing.model.User;
import com.epam.spring.homework4.testing.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepositoryImpl implements UserRepository {
    private final List<User> list = new ArrayList<>();

    @Override
    public User createAccount(User user) {

        Instant now = Instant.now();
        user.setMovieName(String.valueOf(now));
        list.add(user);

        return user;
    }

    @Override
    public User find(String login) {
        return list.stream()
                .filter(user -> user.getLogin().equals(login)).findFirst()
                .orElseThrow(() -> new RuntimeException("User not found!"));
    }

    @Override
    public List<User> findAll() {
        return list;
    }

    @Override
    public User update(String login, User user) {
        boolean isDeleted = list.removeIf(u -> u.getLogin().equals(login));
        if (isDeleted) {
            list.add(user);
        } else {
            throw new RuntimeException("User not found!");
        }
        return user;

    }

    @Override
    public void delete(String login) {
        list.removeIf(user -> user.getLogin().equals(login));
    }
}
