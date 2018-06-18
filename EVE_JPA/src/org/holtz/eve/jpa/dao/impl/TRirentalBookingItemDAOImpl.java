package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRirentalBookingItemDAO;
import org.holtz.eve.jpa.entity.TRirentalBookingItem;
import org.holtz.jpa.util.HibernateUtil;

public class TRirentalBookingItemDAOImpl implements TRirentalBookingItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRirentalBookingItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRirentalBookingItem getRentalBookingItemById(int id) {
		String queryString = "from TRirentalBookingItem rentalBookingItem where rentalBookingItem.rirentalBookingItemId = :id";
		TRirentalBookingItem rentalBookingItem = new TRirentalBookingItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		rentalBookingItem = (TRirentalBookingItem) query.uniqueResult();
		return rentalBookingItem;
	}

	@Override
	public TRirentalBookingItem getRentalBookingItemByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TRirentalBookingItem rentalBookingItem where rentalBookingItem.rirentalBookingItemId like CONCAT('%',:name,'%')";
//		TRirentalBookingItem rentalBookingItem = new TRirentalBookingItem();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		rentalBookingItem = (TRirentalBookingItem) query.uniqueResult();
//		return rentalBookingItem;
	}

	@Override
	public List<TRirentalBookingItem> getRentalBookingItemList() {
		String queryString = "from TRirentalBookingItem";
		List<TRirentalBookingItem> rentalBookingItemList = new ArrayList<TRirentalBookingItem>();
		query = session.createQuery(queryString);
		rentalBookingItemList = (List<TRirentalBookingItem>)query.list();
		return rentalBookingItemList;
	}

	@Override
	public void save(TRirentalBookingItem rentalBookingItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRirentalBookingItem rentalBookingItem) {
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
