package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TQ2internalExamStDAO;
import org.holtz.eve.jpa.entity.TQ2internalExamSt;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TQ2internalExamSt;

public class TQ2internalExamStDAOImpl implements TQ2internalExamStDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TQ2internalExamStDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TQ2internalExamSt getInternalExamStById(int id) {
		String queryString = "from TQ2internalExamSt internalExamSt where internalExamSt.q2internalExamStId = :id";
		TQ2internalExamSt internalExamSt = new TQ2internalExamSt();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		internalExamSt = (TQ2internalExamSt) query.uniqueResult();
		return internalExamSt;
	}

	@Override
	public TQ2internalExamSt getInternalExamStByName(String name) {
		String queryString = "from TQ2internalExamSt internalExamSt where internalExamSt.q2internalExamStTx like CONCAT('%',:name,'%')";
		TQ2internalExamSt internalExamSt = new TQ2internalExamSt();
		query = session.createQuery(queryString);
		query.setString("name", name);
		internalExamSt = (TQ2internalExamSt) query.uniqueResult();
		return internalExamSt;
	}

	@Override
	public List<TQ2internalExamSt> getInternalExamStList() {
		String queryString = "from TQ2internalExamSt";
		List<TQ2internalExamSt> internalExamStList = new ArrayList<TQ2internalExamSt>();
		query = session.createQuery(queryString);
		internalExamStList = (List<TQ2internalExamSt>)query.list();
		return internalExamStList;
	}

	@Override
	public void save(TQ2internalExamSt internalExamSt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TQ2internalExamSt internalExamSt) {
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
