package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TC7costCenterStockTypeDAO;
import org.holtz.eve.jpa.entity.TC7costCenterStockType;
import org.holtz.jpa.util.HibernateUtil;

public class TC7costCenterStockTypeDAOImpl implements TC7costCenterStockTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TC7costCenterStockTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TC7costCenterStockType getCostCenterStockTypeById(int id) {
		String queryString = "from TC7costCenterStockType ccst where ccst.id = :id";
		TC7costCenterStockType ccst = new TC7costCenterStockType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		ccst = (TC7costCenterStockType) query.uniqueResult();
		return ccst;
	}

	@Override
	public TC7costCenterStockType getCostCenterStockTypeByName(String name) {
		// NOOP
		return null;
	}

	@Override
	public List<TC7costCenterStockType> getCostCenterStockTypeList() {
		String queryString = "from TC7costCenterStockType";
		List<TC7costCenterStockType> ccStList = new ArrayList<TC7costCenterStockType>();
		query = session.createQuery(queryString);
		ccStList = (List<TC7costCenterStockType>)query.list();
		return ccStList;
	}

	@Override
	public void save(TC7costCenterStockType ccst) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TC7costCenterStockType ccst) {
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
