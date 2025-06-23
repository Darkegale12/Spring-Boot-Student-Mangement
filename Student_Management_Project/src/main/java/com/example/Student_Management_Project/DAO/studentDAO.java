package com.example.Student_Management_Project.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Student_Management_Project.entity.Studententity;

@Repository
public class studentDAO {

	@Autowired
	SessionFactory sf;

	public String getalldata(Studententity sobj) {
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

	public List allStudent(String std, String division) {
		Session session=sf.openSession();
		Criteria cobj=session.createCriteria(Studententity.class);
		cobj.add(Restrictions.eq("std", std));
		cobj.add(Restrictions.eq("division", division));
		cobj.setProjection(Projections.projectionList().add(Projections.property("firstName"))
				.add(Projections.property("std")).add(Projections.property("division")).add(Projections.property("rollNo")));
		return cobj.list();
		                                                                                                                 
		
	}

	public List getMarks(String rollNo, String std, String division) {
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Studententity.class);
		cr.add(Restrictions.eq("rollNo", rollNo));
		cr.add(Restrictions.eq("std", std));
		cr.add(Restrictions.eq("division", division));
		cr.setProjection(Projections.property("marks"));
		return cr.list();
	}

	public List getattendance(String firstName) {
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Studententity.class);
		cr.add(Restrictions.eq("firstName", firstName));
		cr.setProjection(Projections.property("attendance"));
		return cr.list();
	}

	public List getallinfo(String firstName) {
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Studententity.class);
		cr.add(Restrictions.eq("firstName", firstName));
		return cr.list();
		
	}

	public List getclassteacher(String std, String division) {
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Studententity.class);
		cr.add(Restrictions.eq("std", std));
		cr.add(Restrictions.eq("division", division));
		cr.setProjection(Projections.property("classTeacher"));
		return cr.list();
	}
}
