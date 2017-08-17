package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTmTaskStatusDAO;
import org.holtz.eve.jpa.entity.TTmTaskStatus;
import org.holtz.jpa.util.HibernateUtil;

public class TTmTaskStatusDAOImpl implements TTmTaskStatusDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTmTaskStatusDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTmTaskStatus getTaskStatusById(int id) {
		String queryString = "from TTmTaskStatus taskStatus where taskStatus.tmTaskStatusId = :id";
		TTmTaskStatus taskStatus = new TTmTaskStatus();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		taskStatus = (TTmTaskStatus) query.uniqueResult();
		return taskStatus;
	}

	@Override
	public TTmTaskStatus getTaskStatusByName(String name) {
		String queryString = "from TTmTaskStatus taskStatus where taskStatus.tmTaskStatusTx like CONCAT('%',:name,'%')";
		TTmTaskStatus taskStatus = new TTmTaskStatus();
		query = session.createQuery(queryString);
		query.setString("name", name);
		taskStatus = (TTmTaskStatus) query.uniqueResult();
		return taskStatus;
	}

	@Override
	public List<TTmTaskStatus> getTaskStatusList() {
		String queryString = "from TTmTaskStatus";
		List<TTmTaskStatus> taskStatusList = new ArrayList<TTmTaskStatus>();
		query = session.createQuery(queryString);
		taskStatusList = (List<TTmTaskStatus>)query.list();
		return taskStatusList;
	}

	@Override
	public void save(TTmTaskStatus taskStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTmTaskStatus taskStatus) {
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
