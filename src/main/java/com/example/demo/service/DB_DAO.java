package com.example.demo.service;

import com.example.demo.dto.UserDto;

import java.util.List;

public interface DB_DAO {

    public String findUseryId(int id);
    public List<UserDto> findAllUsers();
    public void addUser(UserDto userDto);

}
