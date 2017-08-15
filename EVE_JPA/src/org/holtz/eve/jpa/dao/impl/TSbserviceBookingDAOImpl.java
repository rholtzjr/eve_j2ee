package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSbserviceBookingDAO;
import org.holtz.eve.jpa.entity.TSbserviceBooking;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TSbserviceBooking;

public class TSbserviceBookingDAOImpl implements TSbserviceBookingDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSbserviceBookingDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSbserviceBooking getServiceBookingById(int id) {
		String queryString = "from TSbserviceBooking serviceBooking where serviceBooking.sbserviceBookingId = :id";
		TSbserviceBooking serviceBooking = new TSbserviceBooking();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		serviceBooking = (TSbserviceBooking) query.uniqueResult();
		return serviceBooking;
	}

	@Override
	public TSbserviceBooking getServiceBookingByName(String name) {
		String queryString = "from TSbserviceBooking serviceBooking where serviceBooking.sbnotesTxN like CONCAT('%',:name,'%')";
		TSbserviceBooking serviceBooking = new TSbserviceBooking();
		query = session.createQuery(queryString);
		query.setString("name", name);
		serviceBooking = (TSbserviceBooking) query.uniqueResult();
		return serviceBooking;
	}

	@Override
	public List<TSbserviceBooking> getServiceBookingList() {
		String queryString = "from TSbserviceBooking";
		List<TSbserviceBooking> serviceBookingList = new ArrayList<TSbserviceBooking>();
		query = session.createQuery(queryString);
		serviceBookingList = (List<TSbserviceBooking>)query.list();
		return serviceBookingList;
	}

	@Override
	public void save(TSbserviceBooking serviceBooking) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSbserviceBooking serviceBooking) {
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
