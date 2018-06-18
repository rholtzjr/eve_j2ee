package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIuInterestStatusDAO;
import org.holtz.eve.jpa.entity.TIuInterestStatus;
import org.holtz.jpa.util.HibernateUtil;

public class TIuInterestStatusDAOImpl implements TIuInterestStatusDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIuInterestStatusDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIuInterestStatus getInterestStatusById(int id) {
		String queryString = "from TIuInterestStatus interestStatus where interestStatus.iuInterestStatusId = :id";
		TIuInterestStatus interestStatus = new TIuInterestStatus();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		interestStatus = (TIuInterestStatus) query.uniqueResult();
		return interestStatus;
	}

	@Override
	public TIuInterestStatus getInterestStatusByName(String name) {
		String queryString = "from TIuInterestStatus interestStatus where interestStatus.iuInterestStatusTx like CONCAT('%',:name,'%')";
		TIuInterestStatus interestStatus = new TIuInterestStatus();
		query = session.createQuery(queryString);
		query.setString("name", name);
		interestStatus = (TIuInterestStatus) query.uniqueResult();
		return interestStatus;
	}

	@Override
	public List<TIuInterestStatus> getInterestStatusList() {
		String queryString = "from TIuInterestStatus";
		List<TIuInterestStatus> interestStatusList = new ArrayList<TIuInterestStatus>();
		query = session.createQuery(queryString);
		interestStatusList = (List<TIuInterestStatus>)query.list();
		return interestStatusList;
	}

	@Override
	public void save(TIuInterestStatus interestStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIuInterestStatus interestStatus) {
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
