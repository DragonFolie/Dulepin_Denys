package com.epam.spring.homework4.testing.controller;

import com.epam.spring.homework4.testing.controller.dto.UserDto;
import com.epam.spring.homework4.testing.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/cinameUser")
    public UserDto createAccount(@RequestBody UserDto userDto) {

        return userService.createAccount(userDto);


    }





    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/cinameUser/{login}")
    public UserDto find(@PathVariable String login) {
        return userService.find(login);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/cinameUser")
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/cinameUser/{login}")
    public UserDto updateAccount(@PathVariable String login, @RequestBody UserDto userDto) {
        return userService.update(login, userDto);
    }

    @DeleteMapping(value = "/cinameUser/{login}")
    public ResponseEntity<Void> deleteAccount(@PathVariable String login) {
        userService.delete(login);
        return ResponseEntity.noContent().build();
    }
}
