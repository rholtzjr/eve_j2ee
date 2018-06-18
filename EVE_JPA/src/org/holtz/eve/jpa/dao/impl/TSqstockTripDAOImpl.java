package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSqstockTripDAO;
import org.holtz.eve.jpa.entity.TSqstockTrip;
import org.holtz.jpa.util.HibernateUtil;

public class TSqstockTripDAOImpl implements TSqstockTripDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSqstockTripDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSqstockTrip getStockTripById(int id) {
		String queryString = "from TSqstockTrip stockTrip where stockTrip.id = :id";
		TSqstockTrip stockTrip = new TSqstockTrip();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		stockTrip = (TSqstockTrip) query.uniqueResult();
		return stockTrip;
	}

	@Override
	public TSqstockTrip getStockTripByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSqstockTrip stockTrip where stockTrip.id like CONCAT('%',:name,'%')";
//		TSqstockTrip stockTrip = new TSqstockTrip();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		stockTrip = (TSqstockTrip) query.uniqueResult();
//		return stockTrip;
	}

	@Override
	public List<TSqstockTrip> getStockTripList() {
		String queryString = "from TSqstockTrip";
		List<TSqstockTrip> stockTripList = new ArrayList<TSqstockTrip>();
		query = session.createQuery(queryString);
		stockTripList = (List<TSqstockTrip>)query.list();
		return stockTripList;
	}

	@Override
	public void save(TSqstockTrip stockTrip) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSqstockTrip stockTrip) {
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
