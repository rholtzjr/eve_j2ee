package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRrreportRunDAO;
import org.holtz.eve.jpa.entity.TRrreportRun;
import org.holtz.jpa.util.HibernateUtil;

public class TRrreportRunDAOImpl implements TRrreportRunDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRrreportRunDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRrreportRun getReportRunById(int id) {
		String queryString = "from TRrreportRun reportRun where reportRun.rrreportRunId = :id";
		TRrreportRun reportRun = new TRrreportRun();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		reportRun = (TRrreportRun) query.uniqueResult();
		return reportRun;
	}

	@Override
	public TRrreportRun getReportRunByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TRrreportRun reportRun where reportRun.rrreportRunId like CONCAT('%',:name,'%')";
//		TRrreportRun reportRun = new TRrreportRun();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		reportRun = (TRrreportRun) query.uniqueResult();
//		return reportRun;
	}

	@Override
	public List<TRrreportRun> getReportRunList() {
		String queryString = "from TRrreportRun";
		List<TRrreportRun> reportRunList = new ArrayList<TRrreportRun>();
		query = session.createQuery(queryString);
		reportRunList = (List<TRrreportRun>)query.list();
		return reportRunList;
	}

	@Override
	public void save(TRrreportRun reportRun) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRrreportRun reportRun) {
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
