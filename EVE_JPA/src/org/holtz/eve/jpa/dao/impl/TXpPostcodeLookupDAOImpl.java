package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TXpPostcodeLookupDAO;
import org.holtz.eve.jpa.entity.TXpPostcodeLookup;
import org.holtz.jpa.util.HibernateUtil;

public class TXpPostcodeLookupDAOImpl implements TXpPostcodeLookupDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TXpPostcodeLookupDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TXpPostcodeLookup getPostcodeLookupById(int id) {
		String queryString = "from TXpPostcodeLookup postcodeLookup where postcodeLookup.id = :id";
		TXpPostcodeLookup postcodeLookup = new TXpPostcodeLookup();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		postcodeLookup = (TXpPostcodeLookup) query.uniqueResult();
		return postcodeLookup;
	}

	@Override
	public TXpPostcodeLookup getPostcodeLookupByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TXpPostcodeLookup postcodeLookup where postcodeLookup.id like CONCAT('%',:name,'%')";
//		TXpPostcodeLookup postcodeLookup = new TXpPostcodeLookup();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		postcodeLookup = (TXpPostcodeLookup) query.uniqueResult();
//		return postcodeLookup;
	}

	@Override
	public List<TXpPostcodeLookup> getPostcodeLookupList() {
		String queryString = "from TXpPostcodeLookup";
		List<TXpPostcodeLookup> postcodeLookupList = new ArrayList<TXpPostcodeLookup>();
		query = session.createQuery(queryString);
		postcodeLookupList = (List<TXpPostcodeLookup>)query.list();
		return postcodeLookupList;
	}

	@Override
	public void save(TXpPostcodeLookup postcodeLookup) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TXpPostcodeLookup postcodeLookup) {
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
