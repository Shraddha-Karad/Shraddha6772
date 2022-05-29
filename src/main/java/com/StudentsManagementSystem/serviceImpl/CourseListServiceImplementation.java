package com.StudentsManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentsManagementSystem.entity.CourseList;
import com.StudentsManagementSystem.repository.CourseListRepository;
import com.StudentsManagementSystem.service.CourseListService;


@Service
public class CourseListServiceImplementation implements CourseListService{

	private CourseListRepository courseListRepository;
	
	public CourseListServiceImplementation(CourseListRepository courseListRepository) {
		super();
		this.courseListRepository = courseListRepository;
	}

	@Override
	public List<CourseList> getAllCourseList() {
		return courseListRepository.findAll();
	}

	@Override
	public CourseList saveCourse(CourseList courseList) {
		return courseListRepository.save(courseList);
	}

	@Override
	public CourseList getCourseById(int id) {
		return courseListRepository.findById(id).get();
	}

	
	
	
	@Override
	public CourseList updateCourse(CourseList courseList) {
		return courseListRepository.save(courseList);
	}

	
	
	  @Override public void deleteCourseById(int id) {
	  courseListRepository.deleteById(id); }
	 

	

}