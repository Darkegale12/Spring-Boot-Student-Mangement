package com.example.Student_Management_Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student_Management_Project.DAO.teacherDAO;

import com.example.Student_Management_Project.entity.Teacherentity;
@Service
public class teacherService {
	@Autowired
	teacherDAO dao;
	
	public String getalldata(Teacherentity sobj) {
		return dao.getalldata(sobj);
		
	}

	public Object getstud(long id) {
		
		return dao.getstud(id);
	}
}
