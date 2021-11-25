package com.example.demo.controller;


import com.example.demo.dto.UserDto;
import com.example.demo.service.imp.DB_DAOService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    DB_DAOService db_daoService = new DB_DAOService();

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/user")
    public String getUsers(){
        return db_daoService.findAllUsers().toString();

    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/user/{id}")
    public String getUsersById(@PathVariable Integer id){
        return db_daoService.findUseryId(id);

    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/user")
    public ResponseEntity<String> addUsers(@RequestBody @Valid UserDto userDto){
         db_daoService.addUser(userDto);

        return ResponseEntity.ok("User is valid");

    }



}
