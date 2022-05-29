package com.StudentsManagementSystem.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.StudentsManagementSystem.entity.Book;
import com.StudentsManagementSystem.entity.Course;
import com.StudentsManagementSystem.entity.CourseList;
import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.helper.Message;
import com.StudentsManagementSystem.repository.BookRepository;
import com.StudentsManagementSystem.repository.CourseListRepository;
import com.StudentsManagementSystem.repository.CourseRepository;
import com.StudentsManagementSystem.repository.StudentRepository;
import com.StudentsManagementSystem.service.CourseListService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private CourseListRepository courseListRepository;

	@Autowired
	private CourseListService courseListService;

	@ModelAttribute
	public void addCommonData(Model model, Principal principal) {
		String studentEmail = principal.getName();
		System.out.println("STUDENTNAME : " + studentEmail);

		Student student = studentRepository.getStudentByStudentName(studentEmail);

		System.out.println(student);

		model.addAttribute("student", student);
	}

	@RequestMapping("/index")
	public String dashboard(Model model, Principal principal) {
		model.addAttribute("title", "Student Dashboard");
		return "student/student_dashboard";

	}

/*--------------------------------------------- Course Handler ----------------------------------------------- */
	
	@GetMapping("/add-course/{page}")
	public String addCourses(@PathVariable("page") Integer page,Model model) {
		model.addAttribute("title", "explore Course");

		Pageable pageable = PageRequest.of(page, 5);
		
		 model.addAttribute("courselist", courseListService.getAllCourseList());
		 Page<CourseList> courseList = this.courseListRepository.findAll(pageable);
		
		 
		 model.addAttribute("currentpage", page);
		 
		 model.addAttribute("totalpages", courseList.getTotalPages());
		return "student/add_course_form";
	}

	

	@PostMapping("/process-course")
	public String processCourse(@ModelAttribute CourseList courseList, Principal principal,
			HttpSession session) {

		try {
			String name = principal.getName();

			
			Student student = this.studentRepository.getStudentByStudentName(name);

			courseList.setStudent(student);

			student.getCourseList().add(courseList);

			this.studentRepository.save(student);

			System.out.println("DATA :" + courseList);

			System.out.println("ADDED To DB !");

			session.setAttribute("message", new Message("Course is added !!", "success"));

		} catch (Exception e) {

			System.out.println("ERROR: " + e.getMessage());

			e.printStackTrace();

			session.setAttribute("message", new Message("Something Went Wrong !!", "danger"));

		}

		return "student/add_course_form";
	}

	@GetMapping("/show-courses/{page}")
	public String showCourses(@PathVariable("page") Integer page, Model model, Principal principal) {
		model.addAttribute("title", "View Course");

		String studentName = principal.getName();
		Student student = this.studentRepository.getStudentByStudentName(studentName);

		Pageable pageable = PageRequest.of(page, 5);

//		Page<Course> courses = this.courseRepository.findCourseByStudent(student.getStudentId(), pageable);

		Page<CourseList> courses = this.courseListRepository.findCourseByStudent(student.getStudentId(), pageable);
		
		model.addAttribute("courses", courses);
		model.addAttribute("currentpage", page);

		model.addAttribute("totalpages", courses.getTotalPages());

		return "student/show_courses";

	}

	@GetMapping("/delete/{courseId}")
	public String deleteCourse(@PathVariable("courseId") Integer courseId, Model model, HttpSession session) {
		Optional<Course> courseOptional = this.courseRepository.findById(courseId);
		Course course = courseOptional.get();

		course.setStudent(null);

		this.courseRepository.delete(course);

		session.setAttribute("message", new Message("Course deleted successfully..", "success"));

		return "redirect:/student/show-courses";

	}

	@PostMapping("/update-course/{courseId}")
	public String updateForm(@PathVariable("courseId") Integer courseId, Model model) {
		model.addAttribute("title", "Update Course");

		Course course = this.courseRepository.findById(courseId).get();
		model.addAttribute("course", course);
		return "student/update_form";
	}

	@PostMapping("/process-update")
	public String updateHandler(@ModelAttribute Course course, Principal principal, HttpSession session) {

		try { // Course oldDetails =
			this.courseRepository.findById(course.getCourseId()).get();

			Student student = this.studentRepository.getStudentByStudentName(principal.getName());

			course.setStudent(student);

			this.courseRepository.save(course);

			session.setAttribute("message", new Message("Your course is updated...", "success"));

			System.out.println("Course Name: " + course.getCourseName());
			System.out.println("Course Id: " + course.getCourseId());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/student/show-courses";
		// return "redirect:/student/"+course.getCourseId()+"/course";

	}


/*--------------------------------------------- Course List ----------------------------------------------- */
	
	@GetMapping("/learn-more1000")
	public String PythonLearning(@ModelAttribute CourseList courseList,  Principal principal,HttpSession session) {


		try {
			String name = principal.getName();

			
			Student student = this.studentRepository.getStudentByStudentName(name);

			courseList.setStudent(student);

			student.getCourseList().add(courseList);

			this.studentRepository.save(student);

			System.out.println("DATA :" + courseList);

			System.out.println("ADDED To DB !");

			session.setAttribute("message", new Message("Course is added !!", "success"));

		} catch (Exception e) {

			System.out.println("ERROR: " + e.getMessage());

			e.printStackTrace();

			session.setAttribute("message", new Message("Something Went Wrong !!", "danger"));

		}
		
		
		return "course/learn_1000";
	}

	@GetMapping("/learn-1001")
	public String JavaBasic(@ModelAttribute CourseList courseList, Principal principal,HttpSession session) {
		
		try {
			String name = principal.getName();

			
			Student student = this.studentRepository.getStudentByStudentName(name);

			courseList.setStudent(student);

			student.getCourseList().add(courseList);

			this.studentRepository.save(student);

			System.out.println("DATA :" + courseList);

			System.out.println("ADDED To DB !");

			session.setAttribute("message", new Message("Course is added !!", "success"));

		} catch (Exception e) {

			System.out.println("ERROR: " + e.getMessage());

			e.printStackTrace();

			session.setAttribute("message", new Message("Something Went Wrong !!", "danger"));

		}

		return "course/learn_1001";
	}

	@GetMapping("/learn-1002")
	public String JavaAdvanced(@ModelAttribute CourseList courseList, Principal principal,HttpSession session) {

		try {
			String name = principal.getName();

			
			Student student = this.studentRepository.getStudentByStudentName(name);

			courseList.setStudent(student);

			student.getCourseList().add(courseList);

			this.studentRepository.save(student);

			System.out.println("DATA :" + courseList);

			System.out.println("ADDED To DB !");

			session.setAttribute("message", new Message("Course is added !!", "success"));

		} catch (Exception e) {

			System.out.println("ERROR: " + e.getMessage());

			e.printStackTrace();

			session.setAttribute("message", new Message("Something Went Wrong !!", "danger"));

		}
		return "course/learn_1002";
	}

	@GetMapping("/learn-1003")
	public String JavaScriptBasic(@ModelAttribute CourseList courseList, Principal principal,HttpSession session) {

		try {
			String name = principal.getName();

			
			Student student = this.studentRepository.getStudentByStudentName(name);

			courseList.setStudent(student);

			student.getCourseList().add(courseList);

			this.studentRepository.save(student);

			System.out.println("DATA :" + courseList);

			System.out.println("ADDED To DB !");

			session.setAttribute("message", new Message("Course is added !!", "success"));

		} catch (Exception e) {

			System.out.println("ERROR: " + e.getMessage());

			e.printStackTrace();

			session.setAttribute("message", new Message("Something Went Wrong !!", "danger"));

		}
		return "course/learn_1003";
	}

	@GetMapping("/learn-1004")
	public String JavaScriptAdvanced(@ModelAttribute CourseList courseList, Principal principal,HttpSession session) {

		try {
			String name = principal.getName();

			
			Student student = this.studentRepository.getStudentByStudentName(name);

			courseList.setStudent(student);

			student.getCourseList().add(courseList);

			this.studentRepository.save(student);

			System.out.println("DATA :" + courseList);

			System.out.println("ADDED To DB !");

			session.setAttribute("message", new Message("Course is added !!", "success"));

		} catch (Exception e) {

			System.out.println("ERROR: " + e.getMessage());

			e.printStackTrace();

			session.setAttribute("message", new Message("Something Went Wrong !!", "danger"));

		}
		return "course/learn_1004";
	}
	
	

/*--------------------------------------------- Book Handler ----------------------------------------------- */
	

	@GetMapping("/show-books/{page}")
	public String showBooks(@PathVariable("page") Integer page, Model model, Principal principal) {
		model.addAttribute("title", "View Books");

		String studentName = principal.getName();
		Student student = this.studentRepository.getStudentByStudentName(studentName);

		Pageable pageable = PageRequest.of(page, 5);

		Page<Book> book = this.bookRepository.findBookByStudent(student.getStudentId(), pageable);

		model.addAttribute("book", book);

		model.addAttribute("currentpage", page);

		model.addAttribute("totalpages", book.getTotalPages());

		return "student/show_books";

	}

	@GetMapping("/issue-book")
	public String issueABook(Model model) {

		model.addAttribute("title", "Issue Book");
		model.addAttribute("book", new Book());
		return "student/issue_book";
	}

	@PostMapping("/process-book")
	public String processBook(@ModelAttribute Book book, Principal principal, HttpSession session) {

		System.out.println("Data :" + book);

		String name = principal.getName();

		Student student = this.studentRepository.getStudentByStudentName(name);

		book.setStudent(student);

		student.getBook().add(book);

		this.studentRepository.save(student);

		System.out.println("Added to DB");

		session.setAttribute("message", new Message("Book Issued Successfully !!", "success"));

		return "student/issue_book";
	}

	@GetMapping("/deleteBook/{bookId}")
	public String deleteBook(@PathVariable("bookId") Integer bookId, Model model, HttpSession session) {
		Optional<Book> bookOptional = this.bookRepository.findById(bookId);
		Book book = bookOptional.get();

		book.setStudent(null);

		this.bookRepository.delete(book);

		session.setAttribute("message", new Message("Book Returned successfully..", "success"));

		return "redirect:/student/show-books";

	}

/*--------------------------------------------- Student Profile Handler ----------------------------------------------- */

	@GetMapping("/profile")
	public String profile(Model model, Principal principal) {
		model.addAttribute("title", "Student Profile");

		return "student/profile";
	}

	@PostMapping("/update-profile/{studentId}")
	public String updateProfile(@PathVariable("studentId") Integer studentId, Model model) {
		model.addAttribute("title", "Update Profile");

		Student student = this.studentRepository.findById(studentId).get();
		model.addAttribute("student", student);
		return "student/update_profile";
	}

	// @RequestMapping(value="/process-update",method=RequestMethod.POST)

	@PostMapping("/process-update-profile")
	public String updateHandler2(@ModelAttribute Student student, Principal principal, HttpSession session) {

		try { // Course oldDetails =
			this.studentRepository.findById(student.getStudentId()).get();

			student = this.studentRepository.getStudentByStudentName(principal.getName());

			this.studentRepository.save(student);

			session.setAttribute("message", new Message("Your Profile is updated...", "success"));

			System.out.println("Course Name: " + student.getStudentName());
			System.out.println("Course Id: " + student.getStudentId());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/student/profile";
		// return "redirect:/student/"+course.getCourseId()+"/course";

	}

	@GetMapping("/deleteProfile/{studentId}")
	public String deleteProfile(@PathVariable("studentId") Integer studentId, Model model, HttpSession session) {
		Optional<Student> studentOptional = this.studentRepository.findById(studentId);
		Student student = studentOptional.get();

//		student.setStudent(null);

		this.studentRepository.delete(student);

		session.setAttribute("message", new Message("Profile Deleted Successfully..", "success"));

		return "redirect:/";

	}
	

/*--------------------------------------------- Settings Handler ----------------------------------------------- */
	

	@GetMapping("/settings")
	public String openSettings() {
		return "student/settings";

	}

	@PostMapping("/change-password")
	public String changePassword(@RequestParam("oldPassword") String oldPassword,
			@RequestParam("newPassword") String newPassword, Principal principal, HttpSession session) {
		System.out.println("OLD PASSWORD : " + oldPassword);
		System.out.println("NEW PASSWORD : " + newPassword);

		String stuedntName = principal.getName();

		Student currentStudent = this.studentRepository.getStudentByStudentName(stuedntName);
		System.out.println(currentStudent.getPassword());

		if (this.bCryptPasswordEncoder.matches(oldPassword, currentStudent.getPassword())) {
			currentStudent.setPassword(this.bCryptPasswordEncoder.encode(newPassword));

			this.studentRepository.save(currentStudent);

			session.setAttribute("message", new Message("Your Password is successfully changed !", "success"));

		} else {
			session.setAttribute("message", new Message("Please Enter Correct Password !", "danger"));
		}

		return "redirect:/student/index";

	}

}


/*
 * @GetMapping("/add-course/{page}") public String
 * listCourses(@PathVariable("page") Integer page, Model model) {
 * 
 * Pageable pageable = PageRequest.of(page, 5);
 * 
 * model.addAttribute("courselist", courseListService.getAllCourseList());
 * 
 * Page<CourseList> courseList = this.courseListRepository.findAll(pageable);
 * 
 * model.addAttribute("currentpage", page);
 * 
 * model.addAttribute("totalpages", courseList.getTotalPages());
 * 
 * return "student/add_course_form";
 * 
 * }
 */