package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TT1tipDAO;
import org.holtz.eve.jpa.entity.TT1tip;
import org.holtz.jpa.util.HibernateUtil;

public class TT1tipDAOImpl implements TT1tipDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TT1tipDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TT1tip getTipById(int id) {
		String queryString = "from TT1tip tip where tip.t1tipId = :id";
		TT1tip tip = new TT1tip();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		tip = (TT1tip) query.uniqueResult();
		return tip;
	}

	@Override
	public TT1tip getTipByName(String name) {
		String queryString = "from TT1tip tip where tip.t1tipTx like CONCAT('%',:name,'%')";
		TT1tip tip = new TT1tip();
		query = session.createQuery(queryString);
		query.setString("name", name);
		tip = (TT1tip) query.uniqueResult();
		return tip;
	}

	@Override
	public List<TT1tip> getTipList() {
		String queryString = "from TT1tip";
		List<TT1tip> tipList = new ArrayList<TT1tip>();
		query = session.createQuery(queryString);
		tipList = (List<TT1tip>)query.list();
		return tipList;
	}

	@Override
	public void save(TT1tip tip) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TT1tip tip) {
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
