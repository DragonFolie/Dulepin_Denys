package com.example.accessingdatamysql.entity;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "details")
@Getter
@ToString
@RequiredArgsConstructor
public class DetailsTable {


    public DetailsTable(String city, String phone_number, String email) {
        this.city = city;
        this.phone_number = phone_number;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private String phone_number;


    @Column(name = "email")
    private String email;





}
