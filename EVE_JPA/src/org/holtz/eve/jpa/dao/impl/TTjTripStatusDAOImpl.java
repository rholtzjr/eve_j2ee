package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTjTripStatusDAO;
import org.holtz.eve.jpa.entity.TTjTripStatus;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TTjTripStatus;

public class TTjTripStatusDAOImpl implements TTjTripStatusDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTjTripStatusDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTjTripStatus getTripStatusById(int id) {
		String queryString = "from TTjTripStatus tripStatus where tripStatus.tjTripStatusId = :id";
		TTjTripStatus tripStatus = new TTjTripStatus();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		tripStatus = (TTjTripStatus) query.uniqueResult();
		return tripStatus;
	}

	@Override
	public TTjTripStatus getTripStatusByName(String name) {
		String queryString = "from TTjTripStatus tripStatus where tripStatus.tjTripStatusTx like CONCAT('%',:name,'%')";
		TTjTripStatus tripStatus = new TTjTripStatus();
		query = session.createQuery(queryString);
		query.setString("name", name);
		tripStatus = (TTjTripStatus) query.uniqueResult();
		return tripStatus;
	}

	@Override
	public List<TTjTripStatus> getTripStatusList() {
		String queryString = "from TTjTripStatus";
		List<TTjTripStatus> tripStatusList = new ArrayList<TTjTripStatus>();
		query = session.createQuery(queryString);
		tripStatusList = (List<TTjTripStatus>)query.list();
		return tripStatusList;
	}

	@Override
	public void save(TTjTripStatus tripStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTjTripStatus tripStatus) {
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
