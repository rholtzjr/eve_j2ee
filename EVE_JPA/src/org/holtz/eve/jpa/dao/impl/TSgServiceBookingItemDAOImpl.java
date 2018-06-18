package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSgServiceBookingItemDAO;
import org.holtz.eve.jpa.entity.TSgServiceBookingItem;
import org.holtz.jpa.util.HibernateUtil;

public class TSgServiceBookingItemDAOImpl implements TSgServiceBookingItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSgServiceBookingItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSgServiceBookingItem getServiceBookingItemById(int id) {
		String queryString = "from TSgServiceBookingItem serviceBookingItem where serviceBookingItem.sgServiceBookingItemId = :id";
		TSgServiceBookingItem serviceBookingItem = new TSgServiceBookingItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		serviceBookingItem = (TSgServiceBookingItem) query.uniqueResult();
		return serviceBookingItem;
	}

	@Override
	public TSgServiceBookingItem getServiceBookingItemByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSgServiceBookingItem serviceBookingItem where serviceBookingItem.sgServiceBookingItemId like CONCAT('%',:name,'%')";
//		TSgServiceBookingItem serviceBookingItem = new TSgServiceBookingItem();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		serviceBookingItem = (TSgServiceBookingItem) query.uniqueResult();
//		return serviceBookingItem;
	}

	@Override
	public List<TSgServiceBookingItem> getServiceBookingItemList() {
		String queryString = "from TSgServiceBookingItem";
		List<TSgServiceBookingItem> serviceBookingItemList = new ArrayList<TSgServiceBookingItem>();
		query = session.createQuery(queryString);
		serviceBookingItemList = (List<TSgServiceBookingItem>)query.list();
		return serviceBookingItemList;
	}

	@Override
	public void save(TSgServiceBookingItem serviceBookingItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSgServiceBookingItem serviceBookingItem) {
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
