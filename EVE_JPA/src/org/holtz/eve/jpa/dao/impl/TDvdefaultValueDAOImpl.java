package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDvdefaultValueDAO;
import org.holtz.eve.jpa.entity.TDvdefaultValue;
import org.holtz.jpa.util.HibernateUtil;

public class TDvdefaultValueDAOImpl implements TDvdefaultValueDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDvdefaultValueDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDvdefaultValue getDefaultValueById(int id) {
		String queryString = "from TDvdefaultValue defaultValue where defaultValue.id = :id";
		TDvdefaultValue defaultValue = new TDvdefaultValue();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		defaultValue = (TDvdefaultValue) query.uniqueResult();
		return defaultValue;
	}

	@Override
	public TDvdefaultValue getDefaultValueByName(String name) {
		String queryString = "from TDvdefaultValue defaultValue where defaultValue.dvdataValueN like CONCAT('%',:name,'%')";
		TDvdefaultValue defaultValue = new TDvdefaultValue();
		query = session.createQuery(queryString);
		query.setString("name", name);
		defaultValue = (TDvdefaultValue) query.uniqueResult();
		return defaultValue;
	}

	@Override
	public List<TDvdefaultValue> getDefaultValueList() {
		String queryString = "from TDvdefaultValue";
		List<TDvdefaultValue> defaultValueList = new ArrayList<TDvdefaultValue>();
		query = session.createQuery(queryString);
		defaultValueList = (List<TDvdefaultValue>)query.list();
		return defaultValueList;
	}

	@Override
	public void save(TDvdefaultValue defaultValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDvdefaultValue defaultValue) {
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
