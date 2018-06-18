package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TLhLookupCacheDAO;
import org.holtz.eve.jpa.entity.TLhLookupCache;
import org.holtz.jpa.util.HibernateUtil;

public class TLhLookupCacheDAOImpl implements TLhLookupCacheDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TLhLookupCacheDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TLhLookupCache getLookupCacheById(int id) {
		String queryString = "from TLhLookupCache lookupCache where lookupCache.lhLookupCacheId = :id";
		TLhLookupCache lookupCache = new TLhLookupCache();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		lookupCache = (TLhLookupCache) query.uniqueResult();
		return lookupCache;
	}

	@Override
	public TLhLookupCache getLookupCacheByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TLhLookupCache lookupCache where lookupCache.lhLookupCacheId like CONCAT('%',:name,'%')";
//		TLhLookupCache lookupCache = new TLhLookupCache();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		lookupCache = (TLhLookupCache) query.uniqueResult();
//		return lookupCache;
	}

	@Override
	public List<TLhLookupCache> getLookupCacheList() {
		String queryString = "from TLhLookupCache";
		List<TLhLookupCache> lookupCacheList = new ArrayList<TLhLookupCache>();
		query = session.createQuery(queryString);
		lookupCacheList = (List<TLhLookupCache>)query.list();
		return lookupCacheList;
	}

	@Override
	public void save(TLhLookupCache lookupCache) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TLhLookupCache lookupCache) {
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
