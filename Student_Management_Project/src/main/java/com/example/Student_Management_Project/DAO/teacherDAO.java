package com.example.Student_Management_Project.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Student_Management_Project.entity.Studententity;
import com.example.Student_Management_Project.entity.Teacherentity;
@Repository
public class teacherDAO {
	@Autowired
	SessionFactory sf;

	public String getalldata(Teacherentity sobj) {
		Session session = sf.openSession();
		try {
			session.beginTransaction(); 
			session.save(sobj); 
			session.getTransaction().commit(); 
			return "Data Inserted Successfully";
		} catch (Exception e) {
			session.getTransaction().rollback(); 
			return "Error while inserting: " + e.getMessage();
		} finally {
			session.close();
		}
	}



	public List<Studententity> getstud(long id) {
	    Session session = sf.openSession();

	    try {session.beginTransaction();
	        Criteria cr = session.createCriteria(Studententity.class);

	        cr.createAlias("classTeacher", "teacher"); // Create alias for classTeacher relationship
	        cr.add(Restrictions.eq("teacher.id", id));  // Apply restriction on teacher's id

	        List<Studententity> students = cr.list();

	        session.getTransaction().commit();

	        return students;
	    } catch (Exception e) {
	        e.printStackTrace();
	   
	        session.getTransaction().rollback();
	    }
	    return null;
	}

}
