package com.example.accessingdatamysql.repository;

import com.example.accessingdatamysql.entity.DetailsTable;
import com.example.accessingdatamysql.entity.UserTable;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


@Repository
public interface UserRepository extends JpaRepository<UserTable, Integer> {


    @Query(value = "SELECT * FROM employees",nativeQuery = true)
    public List<UserTable> getAllUsers();







    @Query(
            value =
                    "insert into employees (name, surname, department,salary) values (:name, :surname, :department, :salary)",
            nativeQuery = true)
    public List<UserTable> addUsers(@Param("name") String name, @Param("surname") String surname,
                                    @Param("department") String  department, @Param("salary") int salary);
}
