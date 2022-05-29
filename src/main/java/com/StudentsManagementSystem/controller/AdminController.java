package com.StudentsManagementSystem.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.StudentsManagementSystem.entity.Admin;
import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.repository.BookRepository;
import com.StudentsManagementSystem.repository.CourseRepository;
import com.StudentsManagementSystem.repository.StudentRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private BookRepository bookRepository;

	

	/*
	 * @ModelAttribute public void addCommonData(Model model, Principal principal) {
	 * String studentEmail = principal.getName();
	 * System.out.println("STUDENTNAME : " + studentEmail);
	 * 
	 * Student student = studentRepository.getStudentByStudentName(studentEmail);
	 * 
	 * System.out.println(student);
	 * 
	 * model.addAttribute("student", student); }
	 */
	
	
	

	/*
	 * @RequestMapping("/admin_index") public String dashboard(Model model,
	 * Principal principal) { model.addAttribute("title", "Admin Dashboard"); return
	 * "student/admin_dashboard";
	 * 
	 * }
	 */

}
