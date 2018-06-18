package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDiDiveProfileDAO;
import org.holtz.eve.jpa.entity.TDiDiveProfile;
import org.holtz.jpa.util.HibernateUtil;

public class TDiDiveProfileDAOImpl implements TDiDiveProfileDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDiDiveProfileDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDiDiveProfile getDiveProfileById(int id) {
		String queryString = "from TDiDiveProfile diveProfile where diveProfile.diDiveProfileId = :id";
		TDiDiveProfile diveProfile = new TDiDiveProfile();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		diveProfile = (TDiDiveProfile) query.uniqueResult();
		return diveProfile;
	}

	@Override
	public TDiDiveProfile getDiveProfileByName(String name) {
		String queryString = "from TDiDiveProfile diveProfile where diveProfile.diNotesTxN like CONCAT('%',:name,'%')";
		TDiDiveProfile diveProfile = new TDiDiveProfile();
		query = session.createQuery(queryString);
		query.setString("name", name);
		diveProfile = (TDiDiveProfile) query.uniqueResult();
		return diveProfile;
	}

	@Override
	public List<TDiDiveProfile> getDiveProfileList() {
		String queryString = "from TDiDiveProfile";
		List<TDiDiveProfile> diveProfileList = new ArrayList<TDiDiveProfile>();
		query = session.createQuery(queryString);
		diveProfileList = (List<TDiDiveProfile>)query.list();
		return diveProfileList;
	}

	@Override
	public void save(TDiDiveProfile diveProfile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDiDiveProfile diveProfile) {
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
