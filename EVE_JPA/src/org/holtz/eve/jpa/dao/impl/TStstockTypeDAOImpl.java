package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TStstockTypeDAO;
import org.holtz.eve.jpa.entity.TStstockType;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TStstockType;

public class TStstockTypeDAOImpl implements TStstockTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TStstockTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TStstockType getStockTypeById(int id) {
		String queryString = "from TStstockType stockType where stockType.ststockTypeId = :id";
		TStstockType stockType = new TStstockType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		stockType = (TStstockType) query.uniqueResult();
		return stockType;
	}

	@Override
	public TStstockType getStockTypeByName(String name) {
		String queryString = "from TStstockType stockType where stockType.ststockTypeTx like CONCAT('%',:name,'%')";
		TStstockType stockType = new TStstockType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		stockType = (TStstockType) query.uniqueResult();
		return stockType;
	}

	@Override
	public List<TStstockType> getStockTypeList() {
		String queryString = "from TStstockType";
		List<TStstockType> stockTypeList = new ArrayList<TStstockType>();
		query = session.createQuery(queryString);
		stockTypeList = (List<TStstockType>)query.list();
		return stockTypeList;
	}

	@Override
	public void save(TStstockType stockType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TStstockType stockType) {
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
