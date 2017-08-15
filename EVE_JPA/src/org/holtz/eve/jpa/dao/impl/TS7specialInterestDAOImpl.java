package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.entity.TS7specialInterest;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TS7specialInterest;

public class TS7specialInterestDAOImpl implements org.holtz.eve.jpa.dao.TS7specialInterestDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TS7specialInterestDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TS7specialInterest getSpecialInterestById(int id) {
		String queryString = "from TS7specialInterest specialInterest where specialInterest.s7specialInterestId = :id";
		TS7specialInterest specialInterest = new TS7specialInterest();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		specialInterest = (TS7specialInterest) query.uniqueResult();
		return specialInterest;
	}

	@Override
	public TS7specialInterest getSpecialInterestByName(String name) {
		String queryString = "from TS7specialInterest specialInterest where specialInterest.s7specialInterestTx like CONCAT('%',:name,'%')";
		TS7specialInterest specialInterest = new TS7specialInterest();
		query = session.createQuery(queryString);
		query.setString("name", name);
		specialInterest = (TS7specialInterest) query.uniqueResult();
		return specialInterest;
	}

	@Override
	public List<TS7specialInterest> getSpecialInterestList() {
		String queryString = "from TS7specialInterest";
		List<TS7specialInterest> specialInterestList = new ArrayList<TS7specialInterest>();
		query = session.createQuery(queryString);
		specialInterestList = (List<TS7specialInterest>)query.list();
		return specialInterestList;
	}

	@Override
	public void save(TS7specialInterest specialInterest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TS7specialInterest specialInterest) {
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
