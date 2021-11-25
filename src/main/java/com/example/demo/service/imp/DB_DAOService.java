package com.example.demo.service.imp;

import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Service;
import com.example.demo.service.DB_DAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class DB_DAOService implements DB_DAO {

    private List<UserDto> arrayList = new ArrayList(Arrays.asList(
            new UserDto("One","One","e@gmail.com"),
            new UserDto("Two","Two","e@gmail.com")
    ));

//    public DB_DAOService() {
//        arrayList.add(new UserDto("One","One"));
//        arrayList.add(new UserDto("Two","Two"));
//    }

    @Override
    public List<UserDto> findAllUsers() {

        return arrayList;
    }

    @Override
    public String findUseryId(int id) {

        return arrayList.get(id).toString();

    }

    @Override
    public void addUser(UserDto userDto) {

         arrayList.add(userDto);




    }
}
