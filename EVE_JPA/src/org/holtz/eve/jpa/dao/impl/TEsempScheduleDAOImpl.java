package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEsempScheduleDAO;
import org.holtz.eve.jpa.entity.TEsempSchedule;
import org.holtz.jpa.util.HibernateUtil;

public class TEsempScheduleDAOImpl implements TEsempScheduleDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEsempScheduleDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEsempSchedule getEmpScheduleById(int id) {
		String queryString = "from TEsempSchedule empSchedule where empSchedule.esempScheduleId = :id";
		TEsempSchedule empSchedule = new TEsempSchedule();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		empSchedule = (TEsempSchedule) query.uniqueResult();
		return empSchedule;
	}

	@Override
	public TEsempSchedule getEmpScheduleByName(String name) {
		String queryString = "from TEsempSchedule empSchedule where empSchedule.esnotesTxN like CONCAT('%',:name,'%')";
		TEsempSchedule empSchedule = new TEsempSchedule();
		query = session.createQuery(queryString);
		query.setString("name", name);
		empSchedule = (TEsempSchedule) query.uniqueResult();
		return empSchedule;
	}

	@Override
	public List<TEsempSchedule> getEmpScheduleList() {
		String queryString = "from TEsempSchedule";
		List<TEsempSchedule> empScheduleList = new ArrayList<TEsempSchedule>();
		query = session.createQuery(queryString);
		empScheduleList = (List<TEsempSchedule>)query.list();
		return empScheduleList;
	}

	@Override
	public void save(TEsempSchedule empSchedule) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEsempSchedule empSchedule) {
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
