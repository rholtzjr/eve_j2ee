package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TQ1internalExamAlDAO;
import org.holtz.eve.jpa.entity.TQ1internalExamAl;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TQ1internalExamAl;

public class TQ1internalExamAlDAOImpl implements TQ1internalExamAlDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TQ1internalExamAlDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TQ1internalExamAl getInternalExamAlById(int id) {
		String queryString = "from TQ1internalExamAl internalExamAl where internalExamAl.q1internalExamAlId = :id";
		TQ1internalExamAl internalExamAl = new TQ1internalExamAl();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		internalExamAl = (TQ1internalExamAl) query.uniqueResult();
		return internalExamAl;
	}

	@Override
	public TQ1internalExamAl getInternalExamAlByName(String name) {
		String queryString = "from TQ1internalExamAl internalExamAl where internalExamAl.q1internalExamAlTx like CONCAT('%',:name,'%')";
		TQ1internalExamAl internalExamAl = new TQ1internalExamAl();
		query = session.createQuery(queryString);
		query.setString("name", name);
		internalExamAl = (TQ1internalExamAl) query.uniqueResult();
		return internalExamAl;
	}

	@Override
	public List<TQ1internalExamAl> getInternalExamAlList() {
		String queryString = "from TQ1internalExamAl";
		List<TQ1internalExamAl> internalExamAlList = new ArrayList<TQ1internalExamAl>();
		query = session.createQuery(queryString);
		internalExamAlList = (List<TQ1internalExamAl>)query.list();
		return internalExamAlList;
	}

	@Override
	public void save(TQ1internalExamAl internalExamAl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TQ1internalExamAl internalExamAl) {
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
