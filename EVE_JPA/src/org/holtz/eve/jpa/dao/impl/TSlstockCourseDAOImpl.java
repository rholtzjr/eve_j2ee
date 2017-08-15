package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSlstockCourseDAO;
import org.holtz.eve.jpa.entity.TSlstockCourse;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TSlstockCourse;

public class TSlstockCourseDAOImpl implements TSlstockCourseDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSlstockCourseDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSlstockCourse getStockCourseById(int id) {
		String queryString = "from TSlstockCourse stockCourse where stockCourse.id = :id";
		TSlstockCourse stockCourse = new TSlstockCourse();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		stockCourse = (TSlstockCourse) query.uniqueResult();
		return stockCourse;
	}

	@Override
	public TSlstockCourse getStockCourseByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSlstockCourse stockCourse where stockCourse.id like CONCAT('%',:name,'%')";
//		TSlstockCourse stockCourse = new TSlstockCourse();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		stockCourse = (TSlstockCourse) query.uniqueResult();
//		return stockCourse;
	}

	@Override
	public List<TSlstockCourse> getStockCourseList() {
		String queryString = "from TSlstockCourse";
		List<TSlstockCourse> stockCourseList = new ArrayList<TSlstockCourse>();
		query = session.createQuery(queryString);
		stockCourseList = (List<TSlstockCourse>)query.list();
		return stockCourseList;
	}

	@Override
	public void save(TSlstockCourse stockCourse) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSlstockCourse stockCourse) {
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
