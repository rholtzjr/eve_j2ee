package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TMsmaritalStatusDAO;
import org.holtz.eve.jpa.entity.TMsmaritalStatus;
import org.holtz.jpa.util.HibernateUtil;

public class TMsmaritalStatusDAOImpl implements TMsmaritalStatusDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TMsmaritalStatusDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TMsmaritalStatus getMaritalStatusById(int id) {
		String queryString = "from TMsmaritalStatus maritalStatus where maritalStatus.msmaritalStatusId = :id";
		TMsmaritalStatus maritalStatus = new TMsmaritalStatus();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		maritalStatus = (TMsmaritalStatus) query.uniqueResult();
		return maritalStatus;
	}

	@Override
	public TMsmaritalStatus getMaritalStatusByName(String name) {
		String queryString = "from TMsmaritalStatus maritalStatus where maritalStatus.msmaritalStatusTx like CONCAT('%',:name,'%')";
		TMsmaritalStatus maritalStatus = new TMsmaritalStatus();
		query = session.createQuery(queryString);
		query.setString("name", name);
		maritalStatus = (TMsmaritalStatus) query.uniqueResult();
		return maritalStatus;
	}

	@Override
	public List<TMsmaritalStatus> getMaritalStatusList() {
		String queryString = "from TMsmaritalStatus";
		List<TMsmaritalStatus> maritalStatusList = new ArrayList<TMsmaritalStatus>();
		query = session.createQuery(queryString);
		maritalStatusList = (List<TMsmaritalStatus>)query.list();
		return maritalStatusList;
	}

	@Override
	public void save(TMsmaritalStatus maritalStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TMsmaritalStatus maritalStatus) {
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
