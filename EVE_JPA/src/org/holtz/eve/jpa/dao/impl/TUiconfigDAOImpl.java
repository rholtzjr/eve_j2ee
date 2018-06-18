package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TUiconfigDAO;
import org.holtz.eve.jpa.entity.TUiconfig;
import org.holtz.jpa.util.HibernateUtil;

public class TUiconfigDAOImpl implements TUiconfigDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TUiconfigDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TUiconfig getConfigById(int id) {
		String queryString = "from TUiconfig config where config.uiconfigId = :id";
		TUiconfig config = new TUiconfig();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		config = (TUiconfig) query.uniqueResult();
		return config;
	}

	@Override
	public TUiconfig getConfigByName(String name) {
		String queryString = "from TUiconfig config where config.uiconfigTx like CONCAT('%',:name,'%')";
		TUiconfig config = new TUiconfig();
		query = session.createQuery(queryString);
		query.setString("name", name);
		config = (TUiconfig) query.uniqueResult();
		return config;
	}

	@Override
	public List<TUiconfig> getConfigList() {
		String queryString = "from TUiconfig";
		List<TUiconfig> configList = new ArrayList<TUiconfig>();
		query = session.createQuery(queryString);
		configList = (List<TUiconfig>)query.list();
		return configList;
	}

	@Override
	public void save(TUiconfig config) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TUiconfig config) {
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
