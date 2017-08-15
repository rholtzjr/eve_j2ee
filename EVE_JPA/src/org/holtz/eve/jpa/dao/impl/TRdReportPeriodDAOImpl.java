package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRdReportPeriodDAO;
import org.holtz.eve.jpa.entity.TRdReportPeriod;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TRdReportPeriod;

public class TRdReportPeriodDAOImpl implements TRdReportPeriodDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRdReportPeriodDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRdReportPeriod getReportPeriodById(int id) {
		String queryString = "from TRdReportPeriod reportPeriod where reportPeriod.rdReportPeriodId = :id";
		TRdReportPeriod reportPeriod = new TRdReportPeriod();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		reportPeriod = (TRdReportPeriod) query.uniqueResult();
		return reportPeriod;
	}

	@Override
	public TRdReportPeriod getReportPeriodByName(String name) {
		String queryString = "from TRdReportPeriod reportPeriod where reportPeriod.rdReportPeriodTx like CONCAT('%',:name,'%')";
		TRdReportPeriod reportPeriod = new TRdReportPeriod();
		query = session.createQuery(queryString);
		query.setString("name", name);
		reportPeriod = (TRdReportPeriod) query.uniqueResult();
		return reportPeriod;
	}

	@Override
	public List<TRdReportPeriod> getReportPeriodList() {
		String queryString = "from TRdReportPeriod";
		List<TRdReportPeriod> reportPeriodList = new ArrayList<TRdReportPeriod>();
		query = session.createQuery(queryString);
		reportPeriodList = (List<TRdReportPeriod>)query.list();
		return reportPeriodList;
	}

	@Override
	public void save(TRdReportPeriod reportPeriod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRdReportPeriod reportPeriod) {
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
