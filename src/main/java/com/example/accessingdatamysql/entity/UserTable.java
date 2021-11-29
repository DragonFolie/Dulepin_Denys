package com.example.accessingdatamysql.entity;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Getter
@ToString
@RequiredArgsConstructor
public class UserTable {

	public UserTable(String name, String surname, String department, String salary) {
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.salary = salary;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surname;


	@Column(name = "department")
	private String department;


	@Column(name = "salary")
	private String salary;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "details_id")
	private DetailsTable detailsTable;



}
