package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSyStockTripDAO;
import org.holtz.eve.jpa.entity.TSyStockTrip;
import org.holtz.jpa.util.HibernateUtil;

public class TSyStockTripDAOImpl implements TSyStockTripDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSyStockTripDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSyStockTrip getStockTripById(int id) {
		String queryString = "from TSyStockTrip stockTrip where stockTrip.syStockTripId = :id";
		TSyStockTrip stockTrip = new TSyStockTrip();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		stockTrip = (TSyStockTrip) query.uniqueResult();
		return stockTrip;
	}

	@Override
	public TSyStockTrip getStockTripByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSyStockTrip stockTrip where stockTrip.syStockTripId like CONCAT('%',:name,'%')";
//		TSyStockTrip stockTrip = new TSyStockTrip();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		stockTrip = (TSyStockTrip) query.uniqueResult();
//		return stockTrip;
	}

	@Override
	public List<TSyStockTrip> getStockTripList() {
		String queryString = "from TSyStockTrip";
		List<TSyStockTrip> stockTripList = new ArrayList<TSyStockTrip>();
		query = session.createQuery(queryString);
		stockTripList = (List<TSyStockTrip>)query.list();
		return stockTripList;
	}

	@Override
	public void save(TSyStockTrip stockTrip) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSyStockTrip stockTrip) {
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
