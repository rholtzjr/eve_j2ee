package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TE2emailQueueDAO;
import org.holtz.eve.jpa.entity.TE2emailQueue;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TE2emailQueue;

public class TE2emailQueueDAOImpl implements TE2emailQueueDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TE2emailQueueDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TE2emailQueue getEmailQueueById(int id) {
		String queryString = "from TE2emailQueue emailQueue where emailQueue.e2emailQueueId = :id";
		TE2emailQueue emailQueue = new TE2emailQueue();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		emailQueue = (TE2emailQueue) query.uniqueResult();
		return emailQueue;
	}

	@Override
	public TE2emailQueue getEmailQueueByName(String name) {
		String queryString = "from TE2emailQueue emailQueue where emailQueue.e2listTxN like CONCAT('%',:name,'%')";
		TE2emailQueue emailQueue = new TE2emailQueue();
		query = session.createQuery(queryString);
		query.setString("name", name);
		emailQueue = (TE2emailQueue) query.uniqueResult();
		return emailQueue;
	}

	@Override
	public List<TE2emailQueue> getEmailQueueList() {
		String queryString = "from TE2emailQueue";
		List<TE2emailQueue> emailQueueList = new ArrayList<TE2emailQueue>();
		query = session.createQuery(queryString);
		emailQueueList = (List<TE2emailQueue>)query.list();
		return emailQueueList;
	}

	@Override
	public void save(TE2emailQueue emailQueue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TE2emailQueue emailQueue) {
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
