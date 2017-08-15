package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPrProfileDAO;
import org.holtz.eve.jpa.entity.TPrProfile;
import org.holtz.jpa.util.HibernateUtil;

public class TPrProfileDAOImpl implements TPrProfileDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPrProfileDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPrProfile getProfileById(int id) {
		String queryString = "from TPrProfile profile where profile.prProfileId = :id";
		TPrProfile profile = new TPrProfile();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		profile = (TPrProfile) query.uniqueResult();
		return profile;
	}

	@Override
	public TPrProfile getProfileByName(String name) {
		String queryString = "from TPrProfile profile where profile.prNotesTxN like CONCAT('%',:name,'%')";
		TPrProfile profile = new TPrProfile();
		query = session.createQuery(queryString);
		query.setString("name", name);
		profile = (TPrProfile) query.uniqueResult();
		return profile;
	}

	@Override
	public List<TPrProfile> getProfileList() {
		String queryString = "from TPrProfile";
		List<TPrProfile> profileList = new ArrayList<TPrProfile>();
		query = session.createQuery(queryString);
		profileList = (List<TPrProfile>)query.list();
		return profileList;
	}

	@Override
	public void save(TPrProfile profile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPrProfile profile) {
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
