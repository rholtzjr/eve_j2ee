package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TScSourceDAO;
import org.holtz.eve.jpa.entity.TScSource;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TScSource;

public class TScSourceDAOImpl implements TScSourceDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TScSourceDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TScSource getSourceById(int id) {
		String queryString = "from TScSource source where source.scSourceId = :id";
		TScSource source = new TScSource();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		source = (TScSource) query.uniqueResult();
		return source;
	}

	@Override
	public TScSource getSourceByName(String name) {
		String queryString = "from TScSource source where source.scSourceTx like CONCAT('%',:name,'%')";
		TScSource source = new TScSource();
		query = session.createQuery(queryString);
		query.setString("name", name);
		source = (TScSource) query.uniqueResult();
		return source;
	}

	@Override
	public List<TScSource> getSourceList() {
		String queryString = "from TScSource";
		List<TScSource> sourceList = new ArrayList<TScSource>();
		query = session.createQuery(queryString);
		sourceList = (List<TScSource>)query.list();
		return sourceList;
	}

	@Override
	public void save(TScSource source) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TScSource source) {
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
