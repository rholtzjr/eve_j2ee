package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSeStateDAO;
import org.holtz.eve.jpa.entity.TSeState;
import org.holtz.jpa.util.HibernateUtil;

public class TSeStateDAOImpl implements TSeStateDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSeStateDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSeState getStateById(int id) {
		String queryString = "from TSeState state where state.seStateId = :id";
		TSeState state = new TSeState();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		state = (TSeState) query.uniqueResult();
		return state;
	}

	@Override
	public TSeState getStateByName(String name) {
		String queryString = "from TSeState state where state.seStateTx like CONCAT('%',:name,'%')";
		TSeState state = new TSeState();
		query = session.createQuery(queryString);
		query.setString("name", name);
		state = (TSeState) query.uniqueResult();
		return state;
	}

	@Override
	public List<TSeState> getStateList() {
		String queryString = "from TSeState";
		List<TSeState> stateList = new ArrayList<TSeState>();
		query = session.createQuery(queryString);
		stateList = (List<TSeState>)query.list();
		return stateList;
	}

	@Override
	public void save(TSeState state) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSeState state) {
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
