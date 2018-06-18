package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEyEntryDAO;
import org.holtz.eve.jpa.entity.TEyEntry;
import org.holtz.jpa.util.HibernateUtil;

public class TEyEntryDAOImpl implements TEyEntryDAO {

	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEyEntryDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEyEntry getTEyEntryById(int id) {
		String queryString = "from TEyEntry teyEntry where teyEntry.eyEntryId = :id";
		TEyEntry teyEntry = new TEyEntry();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		teyEntry = (TEyEntry) query.uniqueResult();
		return teyEntry;
	}

	@Override
	public TEyEntry getTEyEntryByName(String name) {
		String queryString = "from TEyEntry teyEntry where teyEntry.eyCustClubIdN like CONCAT('%',:name,'%')";
		TEyEntry teyEntry = new TEyEntry();
		query = session.createQuery(queryString);
		query.setString("name", name);
		teyEntry = (TEyEntry) query.uniqueResult();
		return teyEntry;
	}

	@Override
	public List<TEyEntry> getTEyEntryList() {
		String queryString = "from TEyEntry";
		List<TEyEntry> teyEntryList = new ArrayList<TEyEntry>();
		query = session.createQuery(queryString);
		teyEntryList = (List<TEyEntry>)query.list();
		return teyEntryList;
	}

	@Override
	public void save(TEyEntry teyEntry) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEyEntry teyEntry) {
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
