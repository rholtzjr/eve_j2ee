package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTstransStatusDAO;
import org.holtz.eve.jpa.entity.TTstransStatus;
import org.holtz.jpa.util.HibernateUtil;

public class TTstransStatusDAOImpl implements TTstransStatusDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTstransStatusDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTstransStatus getTransStatusById(int id) {
		String queryString = "from TTstransStatus transStatus where transStatus.tstransStatusId = :id";
		TTstransStatus transStatus = new TTstransStatus();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		transStatus = (TTstransStatus) query.uniqueResult();
		return transStatus;
	}

	@Override
	public TTstransStatus getTransStatusByName(String name) {
		String queryString = "from TTstransStatus transStatus where transStatus.tstransStatusTx like CONCAT('%',:name,'%')";
		TTstransStatus transStatus = new TTstransStatus();
		query = session.createQuery(queryString);
		query.setString("name", name);
		transStatus = (TTstransStatus) query.uniqueResult();
		return transStatus;
	}

	@Override
	public List<TTstransStatus> getTransStatusList() {
		String queryString = "from TTstransStatus";
		List<TTstransStatus> transStatusList = new ArrayList<TTstransStatus>();
		query = session.createQuery(queryString);
		transStatusList = (List<TTstransStatus>)query.list();
		return transStatusList;
	}

	@Override
	public void save(TTstransStatus transStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTstransStatus transStatus) {
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
