package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.entity.TSrsalesReport;
import org.holtz.eve.jpa.entity.TSrsalesReport;

public class TSrsalesReportDAOImpl implements org.holtz.eve.jpa.dao.TSrsalesReportDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSrsalesReportDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSrsalesReport getSalesReporById(int id) {
		String queryString = "from TSrsalesReport salesReport where salesReport.srsalesReportId = :id";
		TSrsalesReport salesReport = new TSrsalesReport();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		salesReport = (TSrsalesReport) query.uniqueResult();
		return salesReport;
	}

	@Override
	public TSrsalesReport getSalesReporByName(String name) {
		String queryString = "from TSrsalesReport salesReport where salesReport.srdescriptionTx like CONCAT('%',:name,'%')";
		TSrsalesReport salesReport = new TSrsalesReport();
		query = session.createQuery(queryString);
		query.setString("name", name);
		salesReport = (TSrsalesReport) query.uniqueResult();
		return salesReport;
	}

	@Override
	public List<TSrsalesReport> getSalesReporList() {
		String queryString = "from TSrsalesReport";
		List<TSrsalesReport> salesReportList = new ArrayList<TSrsalesReport>();
		query = session.createQuery(queryString);
		salesReportList = (List<TSrsalesReport>)query.list();
		return salesReportList;
	}

	@Override
	public void save(TSrsalesReport salesReport) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSrsalesReport salesReport) {
		// TODO Auto-generated method stub

	}

	public SessionFactory getSessionFactory() {
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
