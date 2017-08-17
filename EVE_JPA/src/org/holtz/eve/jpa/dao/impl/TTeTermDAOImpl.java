package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTeTermDAO;
import org.holtz.eve.jpa.entity.TTeTerm;
import org.holtz.jpa.util.HibernateUtil;

public class TTeTermDAOImpl implements TTeTermDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTeTermDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTeTerm getTermById(int id) {
		String queryString = "from TTeTerm term where term.teTermId = :id";
		TTeTerm term = new TTeTerm();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		term = (TTeTerm) query.uniqueResult();
		return term;
	}

	@Override
	public TTeTerm getTermByName(String name) {
		String queryString = "from TTeTerm term where term.teDescriptionN like CONCAT('%',:name,'%')";
		TTeTerm term = new TTeTerm();
		query = session.createQuery(queryString);
		query.setString("name", name);
		term = (TTeTerm) query.uniqueResult();
		return term;
	}

	@Override
	public List<TTeTerm> getTermList() {
		String queryString = "from TTeTerm";
		List<TTeTerm> termList = new ArrayList<TTeTerm>();
		query = session.createQuery(queryString);
		termList = (List<TTeTerm>)query.list();
		return termList;
	}

	@Override
	public void save(TTeTerm term) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTeTerm term) {
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
