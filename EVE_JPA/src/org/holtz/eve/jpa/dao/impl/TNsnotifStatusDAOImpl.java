package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TNsnotifStatusDAO;
import org.holtz.eve.jpa.entity.TNsnotifStatus;
import org.holtz.jpa.util.HibernateUtil;

public class TNsnotifStatusDAOImpl implements TNsnotifStatusDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TNsnotifStatusDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TNsnotifStatus getNotifStatusById(int id) {
		String queryString = "from TNsnotifStatus notifStatus where notifStatus.nsnotifStatusId = :id";
		TNsnotifStatus notifStatus = new TNsnotifStatus();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		notifStatus = (TNsnotifStatus) query.uniqueResult();
		return notifStatus;
	}

	@Override
	public TNsnotifStatus getNotifStatusByName(String name) {
		String queryString = "from TNsnotifStatus notifStatus where notifStatus.nsnotifStatusTx like CONCAT('%',:name,'%')";
		TNsnotifStatus notifStatus = new TNsnotifStatus();
		query = session.createQuery(queryString);
		query.setString("name", name);
		notifStatus = (TNsnotifStatus) query.uniqueResult();
		return notifStatus;
	}

	@Override
	public List<TNsnotifStatus> getNotifStatusList() {
		String queryString = "from TNsnotifStatus";
		List<TNsnotifStatus> notifStatusList = new ArrayList<TNsnotifStatus>();
		query = session.createQuery(queryString);
		notifStatusList = (List<TNsnotifStatus>)query.list();
		return notifStatusList;
	}

	@Override
	public void save(TNsnotifStatus notifStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TNsnotifStatus notifStatus) {
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
