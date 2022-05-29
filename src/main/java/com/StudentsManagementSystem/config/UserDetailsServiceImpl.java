package com.StudentsManagementSystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.repository.StudentRepository;

public class UserDetailsServiceImpl implements UserDetailsService{


	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public UserDetails loadUserByUsername(String studentEmail) throws UsernameNotFoundException {

		Student student= studentRepository.getStudentByStudentName(studentEmail);
		
		if(student==null)
		{
			throw new UsernameNotFoundException("Could not found Student!!");
		}
		
		CustomUserDetails customUserDetails = new CustomUserDetails(student);
		return customUserDetails;
	}
	
	
	
	

}
