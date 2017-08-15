package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRkRoomBookingDAO;
import org.holtz.eve.jpa.entity.TRkRoomBooking;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TRkRoomBooking;

public class TRkRoomBookingDAOImpl implements TRkRoomBookingDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRkRoomBookingDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRkRoomBooking getRoomBookingById(int id) {
		String queryString = "from TRkRoomBooking roomBooking where roomBooking.rkRoomBookingId = :id";
		TRkRoomBooking roomBooking = new TRkRoomBooking();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		roomBooking = (TRkRoomBooking) query.uniqueResult();
		return roomBooking;
	}

	@Override
	public TRkRoomBooking getRoomBookingByName(String name) {
		String queryString = "from TRkRoomBooking roomBooking where roomBooking.rkRoomNoTxN like CONCAT('%',:name,'%')";
		TRkRoomBooking roomBooking = new TRkRoomBooking();
		query = session.createQuery(queryString);
		query.setString("name", name);
		roomBooking = (TRkRoomBooking) query.uniqueResult();
		return roomBooking;
	}

	@Override
	public List<TRkRoomBooking> getRoomBookingList() {
		String queryString = "from TRkRoomBooking";
		List<TRkRoomBooking> roomBookingList = new ArrayList<TRkRoomBooking>();
		query = session.createQuery(queryString);
		roomBookingList = (List<TRkRoomBooking>)query.list();
		return roomBookingList;
	}

	@Override
	public void save(TRkRoomBooking roomBooking) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRkRoomBooking roomBooking) {
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
