package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TP6picsendCardToDAO;
import org.holtz.eve.jpa.entity.TP6picsendCardTo;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TP6picsendCardTo;

public class TP6picsendCardToDAOImpl implements TP6picsendCardToDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TP6picsendCardToDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TP6picsendCardTo getPicsendCardToById(int id) {
		String queryString = "from TP6picsendCardTo picsendCardTo where picsendCardTo.p6picsendCardToId = :id";
		TP6picsendCardTo picsendCardTo = new TP6picsendCardTo();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		picsendCardTo = (TP6picsendCardTo) query.uniqueResult();
		return picsendCardTo;
	}

	@Override
	public TP6picsendCardTo getPicsendCardToByName(String name) {
		String queryString = "from TP6picsendCardTo picsendCardTo where picsendCardTo.p6picsendCardToTx like CONCAT('%',:name,'%')";
		TP6picsendCardTo picsendCardTo = new TP6picsendCardTo();
		query = session.createQuery(queryString);
		query.setString("name", name);
		picsendCardTo = (TP6picsendCardTo) query.uniqueResult();
		return picsendCardTo;
	}

	@Override
	public List<TP6picsendCardTo> getPicsendCardToList() {
		String queryString = "from TP6picsendCardTo";
		List<TP6picsendCardTo> picsendCardToList = new ArrayList<TP6picsendCardTo>();
		query = session.createQuery(queryString);
		picsendCardToList = (List<TP6picsendCardTo>)query.list();
		return picsendCardToList;
	}

	@Override
	public void save(TP6picsendCardTo picsendCardTo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TP6picsendCardTo picsendCardTo) {
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
