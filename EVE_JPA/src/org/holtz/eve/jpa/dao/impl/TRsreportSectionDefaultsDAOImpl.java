package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRsreportSectionDefaultsDAO;
import org.holtz.eve.jpa.entity.TRsreportSectionDefaults;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TRsreportSectionDefaults;

public class TRsreportSectionDefaultsDAOImpl implements TRsreportSectionDefaultsDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRsreportSectionDefaultsDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRsreportSectionDefaults getReportSectionDefaultsById(int id) {
		String queryString = "from TRsreportSectionDefaults reportSectionDefaults where reportSectionDefaults.id = :id";
		TRsreportSectionDefaults reportSectionDefaults = new TRsreportSectionDefaults();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		reportSectionDefaults = (TRsreportSectionDefaults) query.uniqueResult();
		return reportSectionDefaults;
	}

	@Override
	public TRsreportSectionDefaults getReportSectionDefaultsByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TRsreportSectionDefaults reportSectionDefaults where reportSectionDefaults.id like CONCAT('%',:name,'%')";
//		TRsreportSectionDefaults reportSectionDefaults = new TRsreportSectionDefaults();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		reportSectionDefaults = (TRsreportSectionDefaults) query.uniqueResult();
//		return reportSectionDefaults;
	}

	@Override
	public List<TRsreportSectionDefaults> getReportSectionDefaultsList() {
		String queryString = "from TRsreportSectionDefaults";
		List<TRsreportSectionDefaults> reportSectionDefaultsList = new ArrayList<TRsreportSectionDefaults>();
		query = session.createQuery(queryString);
		reportSectionDefaultsList = (List<TRsreportSectionDefaults>)query.list();
		return reportSectionDefaultsList;
	}

	@Override
	public void save(TRsreportSectionDefaults reportSectionDefaults) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRsreportSectionDefaults reportSectionDefaults) {
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
