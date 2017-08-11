package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIaimportAttemptDAO;
import org.holtz.eve.jpa.entity.TIaimportAttempt;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TIaimportAttempt;

public class TIaimportAttemptDAOImpl implements TIaimportAttemptDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIaimportAttemptDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIaimportAttempt getImportAttemptById(int id) {
		String queryString = "from TIaimportAttempt importAttempt where importAttempt.iaimportAttemptId = :id";
		TIaimportAttempt importAttempt = new TIaimportAttempt();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		importAttempt = (TIaimportAttempt) query.uniqueResult();
		return importAttempt;
	}

	@Override
	public TIaimportAttempt getImportAttemptTypeByName(String name) {
		String queryString = "from TIaimportAttempt importAttempt where importAttempt.iaimportTypeTx like CONCAT('%',:name,'%')";
		TIaimportAttempt importAttempt = new TIaimportAttempt();
		query = session.createQuery(queryString);
		query.setString("name", name);
		importAttempt = (TIaimportAttempt) query.uniqueResult();
		return importAttempt;
	}

	@Override
	public List<TIaimportAttempt> getImportAttemptList() {
		String queryString = "from TIaimportAttempt";
		List<TIaimportAttempt> importAttemptList = new ArrayList<TIaimportAttempt>();
		query = session.createQuery(queryString);
		importAttemptList = (List<TIaimportAttempt>)query.list();
		return importAttemptList;
	}

	@Override
	public void save(TIaimportAttempt importAttempt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIaimportAttempt importAttempt) {
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
