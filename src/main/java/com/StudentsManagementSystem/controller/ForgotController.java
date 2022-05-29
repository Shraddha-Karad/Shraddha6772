package com.StudentsManagementSystem.controller;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.helper.Message;
import com.StudentsManagementSystem.repository.StudentRepository;
import com.StudentsManagementSystem.service.EmailService;

@Controller
public class ForgotController {

	@Autowired
	private EmailService emailService;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@RequestMapping("/forgot")
	public String openEmailForm()
	{
		
		return "forgot_email_form";
	}
	
	@PostMapping("/send-otp")
	public String sendOTP(@RequestParam("email") String email,HttpSession session)
	{
		Random random = new Random(1000);
		
		System.out.println("Email: "+email);
		
		
		int otp = random.nextInt(99999);
		
		System.out.println("OTP: "+otp);
		
		String subject = "OTP from SMS";
		String message=""
				+"<div style='boder:1px solid #e2e2e2; padding:20px'>"
				+"<h1>"
				+"OTP IS"
				+"<b>"+otp
				+"</b>"
				+"</h1>"	
				+"</div>";
		String to=email;
		String from="shraddhatesting37@gmail.com";
		
		boolean flag=this.emailService.sendEmail(subject, message, to,from);
		
		if(flag)
		{
			session.setAttribute("myotp", otp);
			session.setAttribute("email", email);
			return "verify_otp";
			
			
		}
		else
		{
			session.setAttribute(message, "Please check your email id!!");
			return "forgot_email_form";
		}
		
	}
	
	@PostMapping("/verify-otp")
	public String verifyOtp(@RequestParam("otp") int otp, HttpSession session)
	{
		
		int myOtp =  (int)session.getAttribute("myotp");
		
		String email=(String) session.getAttribute("email");
		
		if(myOtp == otp)
		{
			Student student = this.studentRepository.getStudentByStudentName(email);
			
			if(student==null)
			{
				session.setAttribute("message","Student does not exist with this email!");
				return "forgot_email_form";
			}
			else {
				
			}
			
			
			return "password_change_form";
		}
		else
		{
			session.setAttribute("message",new Message("You have entered wrong otp","alert-primary"));
			return "verify_otp";
		}
	}
	
	@PostMapping("/change-password")
	public String changePassword(@RequestParam("newpassword") String newpassword, HttpSession session)
	{
		
		String email=(String) session.getAttribute("email");
		Student student = this.studentRepository.getStudentByStudentName(email);
		
		student.setPassword(this.bCryptPasswordEncoder.encode(newpassword));
		this.studentRepository.save(student);
		
		
		return "redirect:/signin?change=password changed sucessfully...";
	}
	
}

