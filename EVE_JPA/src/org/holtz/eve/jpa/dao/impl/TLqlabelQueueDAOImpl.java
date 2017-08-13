package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TLqlabelQueueDAO;
import org.holtz.eve.jpa.entity.TLqlabelQueue;
import org.holtz.eve.jpa.entity.TLqlabelQueue;

public class TLqlabelQueueDAOImpl implements TLqlabelQueueDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TLqlabelQueueDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TLqlabelQueue getLabelQueueById(int id) {
		String queryString = "from TLqlabelQueue labelQueue where labelQueue.lqid = :id";
		TLqlabelQueue labelQueue = new TLqlabelQueue();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		labelQueue = (TLqlabelQueue) query.uniqueResult();
		return labelQueue;
	}

	@Override
	public TLqlabelQueue getLabelQueueByName(String name) {
		String queryString = "from TLqlabelQueue labelQueue where labelQueue.lqstockNoTxN like CONCAT('%',:name,'%')";
		TLqlabelQueue labelQueue = new TLqlabelQueue();
		query = session.createQuery(queryString);
		query.setString("name", name);
		labelQueue = (TLqlabelQueue) query.uniqueResult();
		return labelQueue;
	}

	@Override
	public List<TLqlabelQueue> getLabelQueueList() {
		String queryString = "from TLqlabelQueue";
		List<TLqlabelQueue> labelQueueList = new ArrayList<TLqlabelQueue>();
		query = session.createQuery(queryString);
		labelQueueList = (List<TLqlabelQueue>)query.list();
		return labelQueueList;
	}

	@Override
	public void save(TLqlabelQueue labelQueue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TLqlabelQueue labelQueue) {
		// TODO Auto-generated method stub

	}

	public SessionFactory getSessionFactory() {
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
