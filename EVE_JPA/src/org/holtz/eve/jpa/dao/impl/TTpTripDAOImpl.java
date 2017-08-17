package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTpTripDAO;
import org.holtz.eve.jpa.entity.TTpTrip;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TTpTrip;

public class TTpTripDAOImpl implements TTpTripDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTpTripDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTpTrip getTripById(int id) {
		String queryString = "from TTpTrip trip where trip.tpTripId = :id";
		TTpTrip trip = new TTpTrip();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		trip = (TTpTrip) query.uniqueResult();
		return trip;
	}

	@Override
	public TTpTrip getTripByName(String name) {
		String queryString = "from TTpTrip trip where trip.tpTripNoTx like CONCAT('%',:name,'%')";
		TTpTrip trip = new TTpTrip();
		query = session.createQuery(queryString);
		query.setString("name", name);
		trip = (TTpTrip) query.uniqueResult();
		return trip;
	}

	@Override
	public List<TTpTrip> getTripList() {
		String queryString = "from TTpTrip";
		List<TTpTrip> tripList = new ArrayList<TTpTrip>();
		query = session.createQuery(queryString);
		tripList = (List<TTpTrip>)query.list();
		return tripList;
	}

	@Override
	public void save(TTpTrip trip) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTpTrip trip) {
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
