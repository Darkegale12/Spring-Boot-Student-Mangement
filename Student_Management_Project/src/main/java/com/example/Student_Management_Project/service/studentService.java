package com.example.Student_Management_Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student_Management_Project.DAO.studentDAO;
import com.example.Student_Management_Project.entity.Studententity;
@Service
public class studentService {

	
	@Autowired
	studentDAO dao;
	
	public String getalldata(Studententity sobj) {
		return dao.getalldata(sobj);
		
	}


	

	public List allStudent(String std, String division) {
	return dao.allStudent(std,division);
		
	}




	public List getMarks(String rollNo, String std, String division) {
	return	dao.getMarks(rollNo,std,division);
		
	}




	public List getattendance(String firstName) {
		return dao.getattendance(firstName);
	}




	public List getallinfo(String firstName) {
		return dao.getallinfo(firstName);
	}


	public List getclassteacher(String std, String division) {
	String s="The Class teacher of your class "+std+"-"+division+" is :"+dao.getclassteacher( std,  division);
			
				
		
		return dao.getclassteacher( std,  division);
	}

}
