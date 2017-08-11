package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCjCourseStatusDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TCjCourseStatus;
import org.holtz.jpa.util.HibernateUtil;

public class TCjCourseStatusDAOImpl implements TCjCourseStatusDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCjCourseStatusDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCjCourseStatus getCourseStatusById(int id) {
		String queryString = "from TCjCourseStatus coursestatus where coursestatus.cjCourseStatusId = :id";
		TCjCourseStatus courseStatus = new TCjCourseStatus();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		courseStatus = (TCjCourseStatus) query.uniqueResult();
		return courseStatus;
	}

	@Override
	public TCjCourseStatus getCourseStatusByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TCjCourseStatus coursestatus where coursestatus.TCsCourses.csCourseNoTx like CONCAT('%',:name,'%')";
//		TCjCourseStatus courseStatus = new TCjCourseStatus();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		courseStatus = (TCjCourseStatus) query.uniqueResult();
//		return courseStatus;
	}

	@Override
	public List<TCjCourseStatus> getCourseStatusList() {
		String queryString = "from TAcAccount";
		List<TCjCourseStatus> courseStatusList = new ArrayList<TCjCourseStatus>();
		query = session.createQuery(queryString);
		courseStatusList = (List<TCjCourseStatus>)query.list();
		return courseStatusList;
	}

	@Override
	public void save(TCjCourseStatus courseStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCjCourseStatus courseStatus) {
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
