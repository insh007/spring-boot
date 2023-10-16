package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Courses> retrieveAllCourses(){
		return Arrays.asList(
				new Courses(1, "Learn AWS", "Udemy"),
				new Courses(2, "Learn Java", "Acc")
				);
	}
}
