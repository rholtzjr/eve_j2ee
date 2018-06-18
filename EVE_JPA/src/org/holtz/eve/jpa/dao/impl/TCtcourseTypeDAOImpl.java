package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCtcourseTypeDAO;
import org.holtz.eve.jpa.entity.TCtcourseType;
import org.holtz.jpa.util.HibernateUtil;

public class TCtcourseTypeDAOImpl implements TCtcourseTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCtcourseTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCtcourseType getCourseTypeById(int id) {
		String queryString = "from TCtcourseType courseType where courseType.ctcourseTypeId = :id";
		TCtcourseType courseType = new TCtcourseType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		courseType = (TCtcourseType) query.uniqueResult();
		return courseType;
	}

	@Override
	public TCtcourseType getCourseTypeByName(String name) {
		String queryString = "from TCtcourseType courseType where courseType.ctcourseTypeTx like CONCAT('%',:name,'%')";
		TCtcourseType courseType = new TCtcourseType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		courseType = (TCtcourseType) query.uniqueResult();
		return courseType;
	}

	@Override
	public List<TCtcourseType> getCourseTypeList() {
		String queryString = "from TCtcourseType";
		List<TCtcourseType> courseTypeList = new ArrayList<TCtcourseType>();
		query = session.createQuery(queryString);
		courseTypeList = (List<TCtcourseType>)query.list();
		return courseTypeList;
	}

	@Override
	public void save(TCtcourseType courseType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCtcourseType courseType) {
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
