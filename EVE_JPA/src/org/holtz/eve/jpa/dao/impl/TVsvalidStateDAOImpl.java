package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TVsvalidStateDAO;
import org.holtz.eve.jpa.entity.TVsvalidState;
import org.holtz.jpa.util.HibernateUtil;

public class TVsvalidStateDAOImpl implements TVsvalidStateDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TVsvalidStateDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TVsvalidState getValidStateById(int id) {
		String queryString = "from TVsvalidState validState where validState.vsvalidStateId = :id";
		TVsvalidState validState = new TVsvalidState();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		validState = (TVsvalidState) query.uniqueResult();
		return validState;
	}

	@Override
	public TVsvalidState getValidStateByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TVsvalidState validState where validState.vsvalidStateId like CONCAT('%',:name,'%')";
//		TVsvalidState validState = new TVsvalidState();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		validState = (TVsvalidState) query.uniqueResult();
//		return validState;
	}

	@Override
	public List<TVsvalidState> getValidStateList() {
		String queryString = "from TVsvalidState";
		List<TVsvalidState> validStateList = new ArrayList<TVsvalidState>();
		query = session.createQuery(queryString);
		validStateList = (List<TVsvalidState>)query.list();
		return validStateList;
	}

	@Override
	public void save(TVsvalidState validState) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TVsvalidState validState) {
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
