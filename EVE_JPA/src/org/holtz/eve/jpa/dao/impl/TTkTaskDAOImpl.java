package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TTkTaskDAO;
import org.holtz.eve.jpa.entity.TTkTask;
import org.holtz.jpa.util.HibernateUtil;

public class TTkTaskDAOImpl implements TTkTaskDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TTkTaskDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TTkTask getTaskById(int id) {
		String queryString = "from TTkTask task where task.tkTaskId = :id";
		TTkTask task = new TTkTask();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		task = (TTkTask) query.uniqueResult();
		return task;
	}

	@Override
	public TTkTask getTaskByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TTkTask task where task.tkNotesTxN like CONCAT('%',:name,'%')";
//		TTkTask task = new TTkTask();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		task = (TTkTask) query.uniqueResult();
//		return task;
	}

	@Override
	public List<TTkTask> getTaskList() {
		String queryString = "from TTkTask";
		List<TTkTask> taskList = new ArrayList<TTkTask>();
		query = session.createQuery(queryString);
		taskList = (List<TTkTask>)query.list();
		return taskList;
	}

	@Override
	public void save(TTkTask task) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TTkTask task) {
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
