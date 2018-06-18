package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TC1custCourseDAO;
import org.holtz.eve.jpa.entity.TC1custCourse;
import org.holtz.jpa.util.HibernateUtil;

public class TC1custCourseDAOImpl implements TC1custCourseDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TC1custCourseDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TC1custCourse getCustCourseById(int id) {
		String queryString = "from TC1custCourse custcourse where custcourse.c1custCourseId = :id";
		TC1custCourse custCourse = new TC1custCourse();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		custCourse = (TC1custCourse) query.uniqueResult();
		return custCourse;
	}

	@Override
	public TC1custCourse getCustCourseByName(String name) {
		// TODO NOOP for now until what to pass as name
//		String queryString = "from TC1custCourse custcourse where custcourse.c1courseNoTxN like CONCAT('%',:name,'%')";
//		TC1custCourse custCourse = new TC1custCourse();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		custCourse = (TC1custCourse) query.uniqueResult();
//		return custCourse;
		return null;
	}

	@Override
	public List<TC1custCourse> getCustCourseList() {
		String queryString = "from TC1custCourse";
		List<TC1custCourse> custCourseList = new ArrayList<TC1custCourse>();
		query = session.createQuery(queryString);
		custCourseList = (List<TC1custCourse>)query.list();
		return custCourseList;
	}

	@Override
	public void save(TC1custCourse custCourse) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TC1custCourse custCourse) {
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
