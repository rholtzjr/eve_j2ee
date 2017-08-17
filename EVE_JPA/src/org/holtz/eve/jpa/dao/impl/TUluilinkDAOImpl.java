package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TUluilinkDAO;
import org.holtz.eve.jpa.entity.TUluilink;
import org.holtz.jpa.util.HibernateUtil;

public class TUluilinkDAOImpl implements TUluilinkDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TUluilinkDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TUluilink getUilinkById(int id) {
		String queryString = "from TUluilink uilink where uilink.uluilinkId = :id";
		TUluilink uilink = new TUluilink();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		uilink = (TUluilink) query.uniqueResult();
		return uilink;
	}

	@Override
	public TUluilink getUilinkByName(String name) {
		String queryString = "from TUluilink uilink where uilink.uluilinkTx like CONCAT('%',:name,'%')";
		TUluilink uilink = new TUluilink();
		query = session.createQuery(queryString);
		query.setString("name", name);
		uilink = (TUluilink) query.uniqueResult();
		return uilink;
	}

	@Override
	public List<TUluilink> getUilinkList() {
		String queryString = "from TUluilink";
		List<TUluilink> uilinkList = new ArrayList<TUluilink>();
		query = session.createQuery(queryString);
		uilinkList = (List<TUluilink>)query.list();
		return uilinkList;
	}

	@Override
	public void save(TUluilink uilink) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TUluilink uilink) {
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
