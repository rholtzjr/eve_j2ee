package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRbrentalBookingDAO;
import org.holtz.eve.jpa.entity.TRbrentalBooking;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TRbrentalBooking;

public class TRbrentalBookingDAOImpl implements TRbrentalBookingDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRbrentalBookingDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRbrentalBooking getRentalBookingById(int id) {
		String queryString = "from TRbrentalBooking rentalBooking where rentalBooking.rbrentalBookingId = :id";
		TRbrentalBooking rentalBooking = new TRbrentalBooking();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		rentalBooking = (TRbrentalBooking) query.uniqueResult();
		return rentalBooking;
	}

	@Override
	public TRbrentalBooking getRentalBookingByName(String name) {
		String queryString = "from TRbrentalBooking rentalBooking where rentalBooking.rbnotesTxN like CONCAT('%',:name,'%')";
		TRbrentalBooking rentalBooking = new TRbrentalBooking();
		query = session.createQuery(queryString);
		query.setString("name", name);
		rentalBooking = (TRbrentalBooking) query.uniqueResult();
		return rentalBooking;
	}

	@Override
	public List<TRbrentalBooking> getRentalBookingList() {
		String queryString = "from TRbrentalBooking";
		List<TRbrentalBooking> rentalBookingList = new ArrayList<TRbrentalBooking>();
		query = session.createQuery(queryString);
		rentalBookingList = (List<TRbrentalBooking>)query.list();
		return rentalBookingList;
	}

	@Override
	public void save(TRbrentalBooking rentalBooking) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRbrentalBooking rentalBooking) {
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
