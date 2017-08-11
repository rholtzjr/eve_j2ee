package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEeEmpCourseDAO;
import org.holtz.eve.jpa.entity.TEeEmpCourse;
import org.holtz.jpa.util.HibernateUtil;

public class TEeEmpCourseDAOImpl implements TEeEmpCourseDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEeEmpCourseDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEeEmpCourse getEmpCourseById(int id) {
		String queryString = "from TEeEmpCourse empCourse where empCourse.eeEmpCourseId = :id";
		TEeEmpCourse empCourse = new TEeEmpCourse();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		empCourse = (TEeEmpCourse) query.uniqueResult();
		return empCourse;
	}

	@Override
	public TEeEmpCourse getEmpCourseByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TEeEmpCourse empCourse where empCourse.eeEmpCourseId like CONCAT('%',:name,'%')";
//		TEeEmpCourse empCourse = new TEeEmpCourse();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		empCourse = (TEeEmpCourse) query.uniqueResult();
//		return empCourse;
	}

	@Override
	public List<TEeEmpCourse> getEmpCourseList() {
		String queryString = "from TEeEmpCourse";
		List<TEeEmpCourse> empCourseList = new ArrayList<TEeEmpCourse>();
		query = session.createQuery(queryString);
		empCourseList = (List<TEeEmpCourse>)query.list();
		return empCourseList;
	}

	@Override
	public void save(TEeEmpCourse empCourse) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEeEmpCourse empCourse) {
		// TODO Auto-generated method stub

	}

	public SessionFactory getSessionFactory() {
		
		sessionFactory = HibernateUtil.getSessionFactory(); 
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
