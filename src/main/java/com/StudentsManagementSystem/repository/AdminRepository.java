package com.StudentsManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.StudentsManagementSystem.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	

	@Query("select a from Admin a where a.adminEmail = :adminEmail")
	public Admin getAdminByAdminName(@Param("adminEmail") String adminEmail);
}
