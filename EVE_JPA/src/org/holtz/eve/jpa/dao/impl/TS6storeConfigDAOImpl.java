package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TS6storeConfigDAO;
import org.holtz.eve.jpa.entity.TS6storeConfig;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TS6storeConfig;

public class TS6storeConfigDAOImpl implements TS6storeConfigDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TS6storeConfigDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TS6storeConfig getStoreConfigById(int id) {
		String queryString = "from TS6storeConfig storeConfig where storeConfig.id = :id";
		TS6storeConfig storeConfig = new TS6storeConfig();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		storeConfig = (TS6storeConfig) query.uniqueResult();
		return storeConfig;
	}

	@Override
	public TS6storeConfig getStoreConfigByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TS6storeConfig storeConfig where storeConfig.id like CONCAT('%',:name,'%')";
//		TS6storeConfig storeConfig = new TS6storeConfig();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		storeConfig = (TS6storeConfig) query.uniqueResult();
//		return storeConfig;
	}

	@Override
	public List<TS6storeConfig> getStoreConfigList() {
		String queryString = "from TS6storeConfig";
		List<TS6storeConfig> storeConfigList = new ArrayList<TS6storeConfig>();
		query = session.createQuery(queryString);
		storeConfigList = (List<TS6storeConfig>)query.list();
		return storeConfigList;
	}

	@Override
	public void save(TS6storeConfig storeConfig) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TS6storeConfig storeConfig) {
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
