package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRfreportFieldDefaultsDAO;
import org.holtz.eve.jpa.entity.TRfreportFieldDefaults;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TRfreportFieldDefaults;

public class TRfreportFieldDefaultsDAOImpl implements TRfreportFieldDefaultsDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRfreportFieldDefaultsDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRfreportFieldDefaults getReportFieldDefaultsById(int id) {
		String queryString = "from TRfreportFieldDefaults reportFieldDefaults where reportFieldDefaults.id = :id";
		TRfreportFieldDefaults reportFieldDefaults = new TRfreportFieldDefaults();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		reportFieldDefaults = (TRfreportFieldDefaults) query.uniqueResult();
		return reportFieldDefaults;
	}

	@Override
	public TRfreportFieldDefaults getReportFieldDefaultsByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TRfreportFieldDefaults reportFieldDefaults where reportFieldDefaults.id like CONCAT('%',:name,'%')";
//		TRfreportFieldDefaults reportFieldDefaults = new TRfreportFieldDefaults();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		reportFieldDefaults = (TRfreportFieldDefaults) query.uniqueResult();
//		return reportFieldDefaults;
	}

	@Override
	public List<TRfreportFieldDefaults> getReportFieldDefaultsList() {
		String queryString = "from TRfreportFieldDefaults";
		List<TRfreportFieldDefaults> reportFieldDefaultsList = new ArrayList<TRfreportFieldDefaults>();
		query = session.createQuery(queryString);
		reportFieldDefaultsList = (List<TRfreportFieldDefaults>)query.list();
		return reportFieldDefaultsList;
	}

	@Override
	public void save(TRfreportFieldDefaults reportFieldDefaults) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRfreportFieldDefaults reportFieldDefaults) {
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
