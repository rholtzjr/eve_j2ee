package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TGrgiftRegistryDAO;
import org.holtz.eve.jpa.entity.TGrgiftRegistry;
import org.holtz.jpa.util.HibernateUtil;

public class TGrgiftRegistryDAOImpl implements TGrgiftRegistryDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TGrgiftRegistryDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TGrgiftRegistry getGiftRegistryById(int id) {
		String queryString = "from TGrgiftRegistry giftRegistry where giftRegistry.grgiftRegistryId = :id";
		TGrgiftRegistry giftRegistry = new TGrgiftRegistry();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		giftRegistry = (TGrgiftRegistry) query.uniqueResult();
		return giftRegistry;
	}

	@Override
	public TGrgiftRegistry getGiftRegistryByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TGrgiftRegistry giftRegistry where giftRegistry.grgiftRegistryId like CONCAT('%',:name,'%')";
//		TGrgiftRegistry giftRegistry = new TGrgiftRegistry();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		giftRegistry = (TGrgiftRegistry) query.uniqueResult();
//		return giftRegistry;
	}

	@Override
	public List<TGrgiftRegistry> getGiftRegistryList() {
		String queryString = "from TGrgiftRegistry";
		List<TGrgiftRegistry> giftRegistryList = new ArrayList<TGrgiftRegistry>();
		query = session.createQuery(queryString);
		giftRegistryList = (List<TGrgiftRegistry>)query.list();
		return giftRegistryList;
	}

	@Override
	public void save(TGrgiftRegistry giftRegistry) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TGrgiftRegistry giftRegistry) {
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
