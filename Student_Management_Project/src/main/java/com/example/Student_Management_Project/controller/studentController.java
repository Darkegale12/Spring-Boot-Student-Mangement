package com.example.Student_Management_Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student_Management_Project.entity.Studententity;
import com.example.Student_Management_Project.service.studentService;
@RestController
public class studentController {

	@Autowired
	studentService service;
	
	@PostMapping("insert-into-studentDB")
	public String insert(@RequestBody Studententity sobj) {
	    return service.getalldata(sobj);
	}
	
	@GetMapping("allStudents-in-your-class/{std}/{Division}")
	public List DisplayAllStudent(@PathVariable String std,@PathVariable String Division) {
		return service.allStudent(std,Division);
	}
	@GetMapping("student-marks/{rollNo}/{std}/{Division}")
	public List GetMarks(@PathVariable String rollNo,@PathVariable String std,@PathVariable String Division) {
		return service.getMarks(rollNo,std,Division);
	}
	
	@GetMapping("student-attendance/{firstName}")
	public List GetAttendance(@PathVariable String firstName ) {
		return service.getattendance(firstName);
	}

	@GetMapping("student-allInfo/{firstName}")
	public List GetAllinfo(@PathVariable String firstName ) {
		return service.getallinfo(firstName);
	}
	@GetMapping("check-ur-classTeacher/{std}/{Division}")
	public List Getclassteacher(@PathVariable String std,@PathVariable String Division) {
		return service.getclassteacher(std,Division);
	}
	
}
