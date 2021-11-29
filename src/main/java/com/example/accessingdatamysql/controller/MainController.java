package com.example.accessingdatamysql.controller;

import com.example.accessingdatamysql.entity.DetailsTable;
import com.example.accessingdatamysql.repository.DetailsRepository;
import com.example.accessingdatamysql.repository.UserRepository;
import com.example.accessingdatamysql.entity.UserTable;
import com.example.accessingdatamysql.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {





    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DetailsRepository detailsRepository;


	@GetMapping(path="/all")
	public List<UserTable> getAllUsers()
	{
		return userRepository.getAllUsers();

	}

    @GetMapping(path="/details")
    public List<DetailsTable> getAllDetails()
    {
        return detailsRepository.findAll();

    }

    @GetMapping(path="/details/{variable}")
    public List<DetailsTable> getAllDetailsWithSort(@PathVariable String variable)
    {
        return detailsRepository.findAll(Sort.by(variable));

    }

    @GetMapping(path="/details/{pageSize}/{offSet}")
    public Page<DetailsTable> getAllDetailsWithPagination(@PathVariable int  pageSize,@PathVariable int offSet)
    {
        Page<DetailsTable> page = detailsRepository.findAll(PageRequest.of(offSet,pageSize));

        return page;

    }




    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value="/addUser")
    public Object addUser(@RequestBody UserTable userTable)
    {

//        System.out.println(detailsTable.toString());
//        return userTable + "  --------------- " + detailsTable;
        return userRepository.addUsers("hi","hi","hi",55);

    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value="/addUser/detail")
    public Object addUserDetail(@RequestBody DetailsTable detailsTable)
    {


        return detailsRepository.save(detailsTable);

    }


    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value ="/addUser/detail/{id}")
    public Object updateUserDetailCityById(@PathVariable int id,@RequestBody DetailsTable detailsTable)
    {



        return detailsRepository.updateUserDetailById(detailsTable.getCity(),id);

    }


}
