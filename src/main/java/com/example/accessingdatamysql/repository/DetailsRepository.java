package com.example.accessingdatamysql.repository;

import com.example.accessingdatamysql.entity.DetailsTable;
import com.example.accessingdatamysql.entity.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface DetailsRepository extends JpaRepository<DetailsTable,Long> {

    @Query(value = "SELECT * FROM details",nativeQuery = true)
    public List<DetailsTable> getAllDetails();



    @Transactional
    @Modifying
    @Query(value = "UPDATE details d Set d.city = :city WHERE d.id = :id",nativeQuery = true)
    public List<DetailsTable> updateUserDetailById(@Param("city")String city,@Param("id")int id);





}
