package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCsCourseDAO;
import org.holtz.eve.jpa.entity.TCsCourse;
import org.holtz.jpa.util.HibernateUtil;

public class TCsCourseDAOImpl implements TCsCourseDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCsCourseDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCsCourse getCourseById(int id) {
		String queryString = "from TCsCourse course where course.csCourseId = :id";
		TCsCourse course = new TCsCourse();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		course = (TCsCourse) query.uniqueResult();
		return course;
	}

	@Override
	public TCsCourse getCourseByName(String name) {
		String queryString = "from TCsCourse course where course.csCourseNoTx like CONCAT('%',:name,'%')";
		TCsCourse course = new TCsCourse();
		query = session.createQuery(queryString);
		query.setString("name", name);
		course = (TCsCourse) query.uniqueResult();
		return course;
	}

	@Override
	public List<TCsCourse> getCourseList() {
		String queryString = "from TCsCourse";
		List<TCsCourse> courseList = new ArrayList<TCsCourse>();
		query = session.createQuery(queryString);
		courseList = (List<TCsCourse>)query.list();
		return courseList;
	}

	@Override
	public void save(org.holtz.eve.jpa.entity.TCsCourse course) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(org.holtz.eve.jpa.entity.TCsCourse course) {
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
