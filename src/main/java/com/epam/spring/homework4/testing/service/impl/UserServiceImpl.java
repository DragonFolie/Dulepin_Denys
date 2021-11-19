package com.epam.spring.homework4.testing.service.impl;

import com.epam.spring.homework4.testing.controller.dto.UserDto;
import com.epam.spring.homework4.testing.model.User;
import com.epam.spring.homework4.testing.service.UserService;
import com.epam.spring.homework4.testing.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDto createAccount(UserDto userDto) {

        log.info("createAccount with login {}", userDto.getLogin());

        User user = mapAccountDtoToAccount(userDto);
        user = userRepository.createAccount(user);
        return mapAccountToAccountDto(user);
    }

    @Override
    public UserDto find(String login) {
        log.info("find by login {}", login);
        User user = userRepository.find(login);
        return mapAccountToAccountDto(user);
    }

    @Override
    public List<UserDto> findAll() {
        log.info("find all accounts");
        return userRepository.findAll()
                .stream()
                .map(this::mapAccountToAccountDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto update(String login, UserDto userDto) {
        log.info("update user with login {}", login);
        User user = mapAccountDtoToAccount(userDto);
        user = userRepository.update(login, user);
        return mapAccountToAccountDto(user);
    }

    @Override
    public void delete(String login) {
        log.info("delete account with login {}", login);
        userRepository.delete(login);
    }

    private UserDto mapAccountToAccountDto(User user) {
        return UserDto.builder()
                .login(user.getLogin())
                .email(user.getEmail())
                .roleId(user.getRoleId())
                .build();
    }

    private User mapAccountDtoToAccount(UserDto userDto) {
        return User.builder()
                .login(userDto.getLogin())
                .email(userDto.getEmail())
                .roleId(userDto.getRoleId())
                .date(userDto.getMovieDate())
                .build();
    }
}
