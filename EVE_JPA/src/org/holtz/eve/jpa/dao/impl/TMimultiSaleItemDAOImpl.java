package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TMimultiSaleItemDAO;
import org.holtz.eve.jpa.entity.TMimultiSaleItem;
import org.holtz.jpa.util.HibernateUtil;

public class TMimultiSaleItemDAOImpl implements TMimultiSaleItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TMimultiSaleItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TMimultiSaleItem getMultiSaleItemById(int id) {
		String queryString = "from TMimultiSaleItem multiSaleItem where multiSaleItem.mimultiSaleItemId = :id";
		TMimultiSaleItem multiSaleItem = new TMimultiSaleItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		multiSaleItem = (TMimultiSaleItem) query.uniqueResult();
		return multiSaleItem;
	}

	@Override
	public TMimultiSaleItem getMultiSaleItemByName(String name) {
		String queryString = "from TMimultiSaleItem multiSaleItem where multiSaleItem.minotes1txN like CONCAT('%',:name,'%')";
		TMimultiSaleItem multiSaleItem = new TMimultiSaleItem();
		query = session.createQuery(queryString);
		query.setString("name", name);
		multiSaleItem = (TMimultiSaleItem) query.uniqueResult();
		return multiSaleItem;
	}

	@Override
	public List<TMimultiSaleItem> getMultiSaleItemList() {
		String queryString = "from TMimultiSaleItem";
		List<TMimultiSaleItem> multiSaleItemList = new ArrayList<TMimultiSaleItem>();
		query = session.createQuery(queryString);
		multiSaleItemList = (List<TMimultiSaleItem>)query.list();
		return multiSaleItemList;
	}

	@Override
	public void save(TMimultiSaleItem multiSaleItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TMimultiSaleItem multiSaleItem) {
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
