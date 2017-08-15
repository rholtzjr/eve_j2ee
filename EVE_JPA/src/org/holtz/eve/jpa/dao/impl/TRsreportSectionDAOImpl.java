package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRsreportSectionDAO;
import org.holtz.eve.jpa.entity.TRsreportSection;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TRsreportSection;

public class TRsreportSectionDAOImpl implements TRsreportSectionDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRsreportSectionDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRsreportSection getReportSectionById(int id) {
		String queryString = "from TRsreportSection reportSection where reportSection.rsreportSectionId = :id";
		TRsreportSection reportSection = new TRsreportSection();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		reportSection = (TRsreportSection) query.uniqueResult();
		return reportSection;
	}

	@Override
	public TRsreportSection getReportSectionByName(String name) {
		String queryString = "from TRsreportSection reportSection where reportSection.rsreportSectionTx like CONCAT('%',:name,'%')";
		TRsreportSection reportSection = new TRsreportSection();
		query = session.createQuery(queryString);
		query.setString("name", name);
		reportSection = (TRsreportSection) query.uniqueResult();
		return reportSection;
	}

	@Override
	public List<TRsreportSection> getReportSectionList() {
		String queryString = "from TRsreportSection";
		List<TRsreportSection> reportSectionList = new ArrayList<TRsreportSection>();
		query = session.createQuery(queryString);
		reportSectionList = (List<TRsreportSection>)query.list();
		return reportSectionList;
	}

	@Override
	public void save(TRsreportSection reportSection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRsreportSection reportSection) {
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
