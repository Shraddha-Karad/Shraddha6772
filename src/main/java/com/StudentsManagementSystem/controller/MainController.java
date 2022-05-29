package com.StudentsManagementSystem.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.StudentsManagementSystem.entity.BookList;
import com.StudentsManagementSystem.entity.Course;
import com.StudentsManagementSystem.entity.CourseList;
import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.helper.Message;
import com.StudentsManagementSystem.repository.BookListRepository;
import com.StudentsManagementSystem.repository.BookRepository;
import com.StudentsManagementSystem.repository.CourseListRepository;
import com.StudentsManagementSystem.repository.CourseRepository;
import com.StudentsManagementSystem.repository.StudentRepository;
import com.StudentsManagementSystem.service.BookListService;
import com.StudentsManagementSystem.service.CourseListService;

@Controller
public class MainController {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private CourseListRepository courseListRepository;

	@Autowired
	private CourseListService courseListService;
	
	@Autowired
	private BookListRepository bookListRepository;
	
	@Autowired
	private BookListService bookListService;

	@RequestMapping("/")
	public String home(Model model) {

		model.addAttribute("title", "Home-Student Management System");
		return "home";
	}

	@GetMapping("/aboutus")
	public String aboutus(Model model) {

		model.addAttribute("title", "About Us");
		return "aboutus";
	}

	@GetMapping("/contact")
	public String contactus(Model model) {

		model.addAttribute("title", "Contact Us");
		return "contact";
	}

	@RequestMapping("/signup")
	public String signup(Model model) {

		model.addAttribute("title", "Register-Student Management System");
		model.addAttribute("student", new Student());
		return "signup";
	}

	@RequestMapping(value = "/do_register", method = RequestMethod.POST)
	public String registerStudent(@Valid @ModelAttribute("student") Student student, BindingResult result1,
			@RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model model,
			HttpSession session) {

		try {
			if (!agreement) {

				System.out.println("You have not agreed the terms and conditions !");
				throw new Exception("You have not agreed the terms and conditions");
			}

			if (result1.hasErrors()) {
				System.out.println("ERROR :" + result1.toString());
				model.addAttribute("student", student);
				return "signup";
			}

			student.setRole("ROLE_USER");
			student.setEnabled(true);
			student.setImageURL("default.png");
			student.setPassword(passwordEncoder.encode(student.getPassword()));

			System.out.println("Agreement   " + agreement);
			System.out.println("Student   " + student);

			Student result = this.studentRepository.save(student);

			model.addAttribute("student", new Student());

			session.setAttribute("message", new Message("Succefully Registered!!", "alert-success"));
			return "signup";
		} catch (Exception e) {

			e.printStackTrace();
			model.addAttribute("student", student);

			session.setAttribute("message", new Message("Something Went Wrong !!" + e.getMessage(), "alert-danger"));
			return "signup";
		}

	}

	@GetMapping("/signin")
	public String customeLogin(Model model) {
		model.addAttribute("title", "LoginPage");
		return "login";
	}

	@GetMapping("/course_list")
	public String listCourse(Model model) {
		model.addAttribute("courselist", courseListService.getAllCourseList());
		return "course_list";
	}

	@GetMapping("/add-coursetolist")
	public String createCourseForm(Model model) {

		CourseList courseList = new CourseList();
		model.addAttribute("courselist", courseList);
		return "course/add_course_form";

	}

	@PostMapping("/process-courselist")
	public String savecourse(@ModelAttribute("courselist") CourseList courseList, BindingResult result) {
		courseListService.saveCourse(courseList);
		return "redirect:/course_list";
	}

	
	  @GetMapping("/delete/{courseId}") public String
	  deleteCoursefromList(@PathVariable int courseId) {
	  courseListService.deleteCourseById(courseId); return "redirect:/course_list";
	  }
	 

	  
	  @GetMapping("/book_list")
		public String listBook(Model model) {
			model.addAttribute("booklist", bookListService.getAllBookList());
			return "book_list";
		}

	  
	  @GetMapping("/add-booktolist")
		public String createBookForm(Model model) {

			BookList bookList = new BookList();
			model.addAttribute("booklist", bookList);
			return "add_book_form";

		}
	  
	  @PostMapping("/process-booklist")
		public String savebook(@ModelAttribute("booklist") BookList bookList) {
			bookListService.saveBook(bookList);
			return "redirect:/book_list";
		}
	  
	  @GetMapping("/delete/{bookId}") public String
	  deleteBookfromList(@PathVariable int bookId) {
	  bookListService.deleteBookById(bookId); return "redirect:/book_list";
	  }
	  
	  
	  
	
		/*
		 * @GetMapping("/delete/{courseId}") public String
		 * deleteCoursefromList(@PathVariable("courseId") Integer courseId, Model model,
		 * HttpSession session) { Optional<CourseList> courseOptional =
		 * this.courseListRepository.findById(courseId); CourseList courseList =
		 * courseOptional.get();
		 * 
		 * 
		 * this.courseListRepository.delete(courseList);
		 * 
		 * session.setAttribute("message", new Message("Course deleted successfully..",
		 * "success"));
		 * 
		 * return "redirect:/course_list";
		 * 
		 * }
		 */
	
	
	
	
	@PostMapping("/update-course/{courseId}")
	public String updateForm(@PathVariable("courseId") Integer courseId, Model model) {
		model.addAttribute("title", "Update Course");

		model.addAttribute("courselist", courseListService.getCourseById(courseId));
		return "course_list";
	}


	@PostMapping("/process-update")
	public String updateHandler(@ModelAttribute CourseList courselist, HttpSession session) {

		try { // Course oldDetails =
//			this.courseListRepository.findById(courselist.getCourseId()).get();

			/*
			 * Student student =
			 * this.studentRepository.getStudentByStudentName(principal.getName());
			 * 
			 * course.setStudent(student);
			 */

			this.courseListRepository.save(courselist);

			session.setAttribute("message", new Message("Your course is updated...", "success"));

			System.out.println("Course Name: " + courselist.getCourseName());
			System.out.println("Course Id: " + courselist.getCourseId());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/course_list";
		// return "redirect:/student/"+course.getCourseId()+"/course";

	}
	
	
	
	/*
	 * @GetMapping("/course-list-edit/{id}") public String
	 * editCourseForm(@PathVariable int id, Model model) {
	 * model.addAttribute("course", courseListService.getCourseById(id)); return
	 * "edit_course"; }
	 * 
	 * @PostMapping("/course-list-update/{id}") public String
	 * updateCourse(@PathVariable int courseId, @ModelAttribute("courselist")
	 * CourseList courselist, Model model) {
	 * 
	 * // get student from database by id CourseList existingCourse =
	 * courseListService.getCourseById(courseId);
	 * existingCourse.setCourseId(courselist.getCourseId());
	 * existingCourse.setCourseName(courselist.getCourseName());
	 * existingCourse.setCourseFee(courselist.getCourseFee());
	 * existingCourse.setCourseDuration(courselist.getCourseDuration());
	 * existingCourse.setCourseDescription(courselist.getCourseDescription());
	 * 
	 * // save updated student object
	 * courseListService.updateCourse(existingCourse); return
	 * "redirect:/course_list"; }
	 */

	/*
	 * @GetMapping("/show-courselist") public String showCourses(Model model,
	 * Principal principal) { model.addAttribute("title", "View Course");
	 * 
	 * 
	 * List<Course> courses = this.courseRepository.findAll();
	 * 
	 * model.addAttribute("courses", courses);
	 * 
	 * return "course/course_list";
	 * 
	 * }
	 */

	/*
	 * @GetMapping("/add-coursetolist") public String openAddCourseForm(Model model)
	 * {
	 * 
	 * model.addAttribute("title", "Add Course"); model.addAttribute("courselist",
	 * new CourseList()); return "course/add_course_form"; }
	 */

	/*
	 * @PostMapping("/process-courselist") public String
	 * processCourseList(@ModelAttribute CourseList courselist, Principal principal,
	 * HttpSession session) {
	 * 
	 * try {
	 * 
	 * courseListService.saveCourse(courselist);
	 * 
	 * // List<CourseList> cl = (List<CourseList>)
	 * this.courseListRepository.save(courselist);
	 * 
	 * System.out.println("DATA :" + courselist);
	 * 
	 * System.out.println("ADDED To DB !");
	 * 
	 * session.setAttribute("message", new Message("Course is added !!",
	 * "success"));
	 * 
	 * } catch (Exception e) {
	 * 
	 * System.out.println("ERROR: " + e.getMessage());
	 * 
	 * e.printStackTrace();
	 * 
	 * session.setAttribute("message", new Message("Something Went Wrong !!",
	 * "danger"));
	 * 
	 * }
	 * 
	 * return "course/course_list"; }
	 */

	/*
	 * @PostMapping("/process-courselist") public String saveourse(@ModelAttribute
	 * CourseList courseList) { courseListService.saveCourse(courseList); return
	 * "redirect:/course_list"; }
	 */

	/*
	 * @GetMapping("/course_list") public String courselist(Model model) {
	 * model.addAttribute("title","LoginPage"); return "course/course_list"; }
	 */

	/*
	 * 
	 * @GetMapping("/adminlogin") public String adminLogin(Model model) {
	 * model.addAttribute("title","LoginPage"); return "admin_login"; }
	 */
}

/*
 * @Autowired private StudentRepository studentRepository;
 * 
 * 
 * @GetMapping("/first")
 * 
 * @ResponseBody public String test() {
 * 
 * Student student = new Student(); student.setStudentName("Shraddha karad");
 * student.setStudentEmail("shraddhakarad@ggmail.com");
 * 
 * Course course=new Course();
 * 
 * student.getCourse().add(course);
 * 
 * studentRepository.save(student); return "first"; }
 */