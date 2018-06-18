package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRlreportLayoutDefaultsDAO;
import org.holtz.eve.jpa.entity.TRlreportLayoutDefaults;
import org.holtz.jpa.util.HibernateUtil;

public class TRlreportLayoutDefaultsDAOImpl implements TRlreportLayoutDefaultsDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRlreportLayoutDefaultsDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRlreportLayoutDefaults getReportLayoutDefaultsById(int id) {
		String queryString = "from TRlreportLayoutDefaults reportLayoutDefaults where reportLayoutDefaults.id = :id";
		TRlreportLayoutDefaults reportLayoutDefaults = new TRlreportLayoutDefaults();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		reportLayoutDefaults = (TRlreportLayoutDefaults) query.uniqueResult();
		return reportLayoutDefaults;
	}

	@Override
	public TRlreportLayoutDefaults getReportLayoutDefaultsByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TRlreportLayoutDefaults reportLayoutDefaults where reportLayoutDefaults.id like CONCAT('%',:name,'%')";
//		TRlreportLayoutDefaults reportLayoutDefaults = new TRlreportLayoutDefaults();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		reportLayoutDefaults = (TRlreportLayoutDefaults) query.uniqueResult();
//		return reportLayoutDefaults;
	}

	@Override
	public List<TRlreportLayoutDefaults> getReportLayoutDefaultsList() {
		String queryString = "from TRlreportLayoutDefaults";
		List<TRlreportLayoutDefaults> reportLayoutDefaultsList = new ArrayList<TRlreportLayoutDefaults>();
		query = session.createQuery(queryString);
		reportLayoutDefaultsList = (List<TRlreportLayoutDefaults>)query.list();
		return reportLayoutDefaultsList;
	}

	@Override
	public void save(TRlreportLayoutDefaults reportLayoutDefaults) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRlreportLayoutDefaults reportLayoutDefaults) {
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
