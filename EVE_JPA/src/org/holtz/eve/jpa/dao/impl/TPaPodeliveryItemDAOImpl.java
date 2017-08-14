package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPaPodeliveryItemDAO;
import org.holtz.eve.jpa.entity.TPaPodeliveryItem;
import org.holtz.jpa.util.HibernateUtil;

public class TPaPodeliveryItemDAOImpl implements TPaPodeliveryItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPaPodeliveryItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPaPodeliveryItem getPodeliveryItemById(int id) {
		String queryString = "from TPaPodeliveryItem podeliveryItem where podeliveryItem.paPodeliveryItemId = :id";
		TPaPodeliveryItem podeliveryItem = new TPaPodeliveryItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		podeliveryItem = (TPaPodeliveryItem) query.uniqueResult();
		return podeliveryItem;
	}

	@Override
	public TPaPodeliveryItem getPodeliveryItemByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TPaPodeliveryItem podeliveryItem where podeliveryItem.paPodeliveryItemId like CONCAT('%',:name,'%')";
//		TPaPodeliveryItem podeliveryItem = new TPaPodeliveryItem();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		podeliveryItem = (TPaPodeliveryItem) query.uniqueResult();
//		return podeliveryItem;
	}

	@Override
	public List<TPaPodeliveryItem> getPodeliveryItemList() {
		String queryString = "from TPaPodeliveryItem";
		List<TPaPodeliveryItem> podeliveryItemList = new ArrayList<TPaPodeliveryItem>();
		query = session.createQuery(queryString);
		podeliveryItemList = (List<TPaPodeliveryItem>)query.list();
		return podeliveryItemList;
	}

	@Override
	public void save(TPaPodeliveryItem podeliveryItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPaPodeliveryItem podeliveryItem) {
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
