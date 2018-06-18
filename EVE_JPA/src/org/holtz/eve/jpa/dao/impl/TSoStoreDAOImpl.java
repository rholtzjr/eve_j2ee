package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSoStoreDAO;
import org.holtz.eve.jpa.entity.TSoStore;
import org.holtz.jpa.util.HibernateUtil;

public class TSoStoreDAOImpl implements TSoStoreDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSoStoreDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSoStore getStoreById(int id) {
		String queryString = "from TSoStore store where store.soStoreId = :id";
		TSoStore store = new TSoStore();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		store = (TSoStore) query.uniqueResult();
		return store;
	}

	@Override
	public TSoStore getStoreByName(String name) {
		String queryString = "from TSoStore store where store.soStoreNameTx like CONCAT('%',:name,'%')";
		TSoStore store = new TSoStore();
		query = session.createQuery(queryString);
		query.setString("name", name);
		store = (TSoStore) query.uniqueResult();
		return store;
	}

	@Override
	public List<TSoStore> getStoreList() {
		String queryString = "from TSoStore";
		List<TSoStore> storeList = new ArrayList<TSoStore>();
		query = session.createQuery(queryString);
		storeList = (List<TSoStore>)query.list();
		return storeList;
	}

	@Override
	public void save(TSoStore store) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSoStore store) {
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
