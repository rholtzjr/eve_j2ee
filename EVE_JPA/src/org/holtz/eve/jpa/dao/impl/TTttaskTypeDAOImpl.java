package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTttaskTypeDAO;
import org.holtz.eve.jpa.entity.TTttaskType;
import org.holtz.jpa.util.HibernateUtil;

public class TTttaskTypeDAOImpl implements TTttaskTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTttaskTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTttaskType getTaskTypeById(int id) {
		String queryString = "from TTttaskType taskType where taskType.tttaskTypeId = :id";
		TTttaskType taskType = new TTttaskType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		taskType = (TTttaskType) query.uniqueResult();
		return taskType;
	}

	@Override
	public TTttaskType getTaskTypeByName(String name) {
		String queryString = "from TTttaskType taskType where taskType.tttaskTypeTx like CONCAT('%',:name,'%')";
		TTttaskType taskType = new TTttaskType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		taskType = (TTttaskType) query.uniqueResult();
		return taskType;
	}

	@Override
	public List<TTttaskType> getTaskTypeList() {
		String queryString = "from TTttaskType";
		List<TTttaskType> taskTypeList = new ArrayList<TTttaskType>();
		query = session.createQuery(queryString);
		taskTypeList = (List<TTttaskType>)query.list();
		return taskTypeList;
	}

	@Override
	public void save(TTttaskType taskType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTttaskType taskType) {
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
