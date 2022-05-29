package com.StudentsManagementSystem.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="admin")
public class Admin {

	@Id
	private int adminId;
	private String adminName;
	private String adminEmail;
	private String password;
	private String acessKey;
	
	
}
