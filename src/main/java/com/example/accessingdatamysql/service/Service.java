package com.example.accessingdatamysql.service;

import com.example.accessingdatamysql.entity.UserTable;
import com.example.accessingdatamysql.repository.UserRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface Service {

    @Query(
            value = "SELECT name,surname FROM  my_db.employees",
            nativeQuery = true)
    List<UserTable> getAllUsers();
}
