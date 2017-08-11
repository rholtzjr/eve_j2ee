package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TE4emailHistoryDAO;
import org.holtz.eve.jpa.entity.TE4emailHistory;
import org.holtz.eve.jpa.entity.TE4emailHistory;
import org.holtz.jpa.util.HibernateUtil;

public class TE4emailHistoryDAOImpl implements TE4emailHistoryDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TE4emailHistoryDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TE4emailHistory getEmailHistoryById(int id) {
		String queryString = "from TE4emailHistory emailHistory where emailHistory.e4emailHistoryId = :id";
		TE4emailHistory emailHistory = new TE4emailHistory();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		emailHistory = (TE4emailHistory) query.uniqueResult();
		return emailHistory;
	}

	@Override
	public TE4emailHistory getEmailHistoryByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TE4emailHistory emailHistory where emailHistory. like CONCAT('%',:name,'%')";
//		TE4emailHistory emailHistory = new TE4emailHistory();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		emailHistory = (TE4emailHistory) query.uniqueResult();
//		return emailHistory;
	}

	@Override
	public List<TE4emailHistory> getEmailHistoryList() {
		String queryString = "from TE4emailHistory";
		List<TE4emailHistory> emailHistoryList = new ArrayList<TE4emailHistory>();
		query = session.createQuery(queryString);
		emailHistoryList = (List<TE4emailHistory>)query.list();
		return emailHistoryList;
	}

	@Override
	public void save(TE4emailHistory emailHistory) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TE4emailHistory emailHistory) {
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
