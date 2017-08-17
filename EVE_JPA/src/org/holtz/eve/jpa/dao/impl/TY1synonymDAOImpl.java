package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TY1synonymDAO;
import org.holtz.eve.jpa.entity.TY1synonym;
import org.holtz.jpa.util.HibernateUtil;

public class TY1synonymDAOImpl implements TY1synonymDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TY1synonymDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TY1synonym getSynonymById(int id) {
		String queryString = "from TY1synonym synonym where synonym.y1synonymId = :id";
		TY1synonym synonym = new TY1synonym();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		synonym = (TY1synonym) query.uniqueResult();
		return synonym;
	}

	@Override
	public TY1synonym getSynonymByName(String name) {
		String queryString = "from TY1synonym synonym where synonym.y1synonymTx like CONCAT('%',:name,'%')";
		TY1synonym synonym = new TY1synonym();
		query = session.createQuery(queryString);
		query.setString("name", name);
		synonym = (TY1synonym) query.uniqueResult();
		return synonym;
	}

	@Override
	public List<TY1synonym> getSynonymList() {
		String queryString = "from TY1synonym";
		List<TY1synonym> synonymList = new ArrayList<TY1synonym>();
		query = session.createQuery(queryString);
		synonymList = (List<TY1synonym>)query.list();
		return synonymList;
	}

	@Override
	public void save(TY1synonym synonym) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TY1synonym synonym) {
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
