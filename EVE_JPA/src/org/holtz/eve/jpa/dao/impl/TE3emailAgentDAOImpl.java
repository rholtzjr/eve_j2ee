package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TE3emailAgentDAO;
import org.holtz.eve.jpa.entity.TE3emailAgent;
import org.holtz.jpa.util.HibernateUtil;

public class TE3emailAgentDAOImpl implements TE3emailAgentDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TE3emailAgentDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TE3emailAgent getEmailAgentById(int id) {
		String queryString = "from TE3emailAgent emailAgent where emailAgent.e3emailAgentId = :id";
		TE3emailAgent emailAgent = new TE3emailAgent();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		emailAgent = (TE3emailAgent) query.uniqueResult();
		return emailAgent;
	}

	@Override
	public TE3emailAgent getEmailAgentByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TE3emailAgent emailAgent where emailAgent.e3notesTxN like CONCAT('%',:name,'%')";
//		TE3emailAgent emailAgent = new TE3emailAgent();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		emailAgent = (TE3emailAgent) query.uniqueResult();
//		return emailAgent;
	}

	@Override
	public List<TE3emailAgent> getEmailAgentList() {
		String queryString = "from TE3emailAgent";
		List<TE3emailAgent> emailAgentList = new ArrayList<TE3emailAgent>();
		query = session.createQuery(queryString);
		emailAgentList = (List<TE3emailAgent>)query.list();
		return emailAgentList;
	}

	@Override
	public void save(TE3emailAgent emailAgent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TE3emailAgent emailAgent) {
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
