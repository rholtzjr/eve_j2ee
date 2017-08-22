package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSzStockCourseTypeDAO;
import org.holtz.eve.jpa.entity.TSzStockCourseType;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TSzStockCourseType;

public class TSzStockCourseTypeDAOImpl implements TSzStockCourseTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSzStockCourseTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSzStockCourseType getStockCourseTypeById(int id) {
		String queryString = "from TSzStockCourseType stockCourseType where stockCourseType.szStockCourseTypeId = :id";
		TSzStockCourseType stockCourseType = new TSzStockCourseType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		stockCourseType = (TSzStockCourseType) query.uniqueResult();
		return stockCourseType;
	}

	@Override
	public TSzStockCourseType getStockCourseTypeByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSzStockCourseType stockCourseType where stockCourseType.szStockCourseTypeId like CONCAT('%',:name,'%')";
//		TSzStockCourseType stockCourseType = new TSzStockCourseType();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		stockCourseType = (TSzStockCourseType) query.uniqueResult();
//		return stockCourseType;
	}

	@Override
	public List<TSzStockCourseType> getStockCourseTypeList() {
		String queryString = "from TSzStockCourseType";
		List<TSzStockCourseType> stockCourseTypeList = new ArrayList<TSzStockCourseType>();
		query = session.createQuery(queryString);
		stockCourseTypeList = (List<TSzStockCourseType>)query.list();
		return stockCourseTypeList;
	}

	@Override
	public void save(TSzStockCourseType stockCourseType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSzStockCourseType stockCourseType) {
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
