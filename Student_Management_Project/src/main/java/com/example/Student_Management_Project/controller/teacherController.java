package com.example.Student_Management_Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student_Management_Project.entity.Teacherentity;
import com.example.Student_Management_Project.service.teacherService;

@RestController
public class teacherController {

	@Autowired
	teacherService service;
	
	@PostMapping("insert-student-byTeacherDB")
	public String insert(@RequestBody Teacherentity sobj) {
	    return service.getalldata(sobj);
	}
	
	@GetMapping("get-students-byTeacherid/{id}")
	public Object getstud(@PathVariable long id) {
		return service.getstud(id);
	}
}
