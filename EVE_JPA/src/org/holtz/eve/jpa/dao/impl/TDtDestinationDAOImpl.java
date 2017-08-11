package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDtDestinationDAO;
import org.holtz.eve.jpa.entity.TDtDestination;
import org.holtz.eve.jpa.entity.TDtDestination;
import org.holtz.jpa.util.HibernateUtil;

public class TDtDestinationDAOImpl implements TDtDestinationDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDtDestinationDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDtDestination getDestinationById(int id) {
		String queryString = "from TDtDestination destination where destination.dtDestinationId = :id";
		TDtDestination destination = new TDtDestination();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		destination = (TDtDestination) query.uniqueResult();
		return destination;
	}

	@Override
	public TDtDestination getDestinationByName(String name) {
		String queryString = "from TDtDestination destination where destination.dtDestinationTx like CONCAT('%',:name,'%')";
		TDtDestination destination = new TDtDestination();
		query = session.createQuery(queryString);
		query.setString("name", name);
		destination = (TDtDestination) query.uniqueResult();
		return destination;
	}

	@Override
	public List<TDtDestination> getDestinationList() {
		String queryString = "from TDtDestination";
		List<TDtDestination> destinationList = new ArrayList<TDtDestination>();
		query = session.createQuery(queryString);
		destinationList = (List<TDtDestination>)query.list();
		return destinationList;
	}

	@Override
	public void save(TDtDestination destination) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDtDestination destination) {
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
