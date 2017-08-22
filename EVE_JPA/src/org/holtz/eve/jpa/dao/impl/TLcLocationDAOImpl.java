package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TLcLocationDAO;
import org.holtz.eve.jpa.entity.TLcLocation;
import org.holtz.jpa.util.HibernateUtil;

public class TLcLocationDAOImpl implements TLcLocationDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TLcLocationDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TLcLocation getLocationById(int id) {
		String queryString = "from TLcLocation location where location.lcLocationId = :id";
		TLcLocation location = new TLcLocation();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		location = (TLcLocation) query.uniqueResult();
		return location;
	}

	@Override
	public TLcLocation getLocationByName(String name) {
		String queryString = "from TLcLocation location where location.lcLocationTx like CONCAT('%',:name,'%')";
		TLcLocation location = new TLcLocation();
		query = session.createQuery(queryString);
		query.setString("name", name);
		location = (TLcLocation) query.uniqueResult();
		return location;
	}

	@Override
	public List<TLcLocation> getLocationList() {
		String queryString = "from TLcLocation";
		List<TLcLocation> locationList = new ArrayList<TLcLocation>();
		query = session.createQuery(queryString);
		locationList = (List<TLcLocation>)query.list();
		return locationList;
	}

	@Override
	public void save(TLcLocation location) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TLcLocation location) {
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
