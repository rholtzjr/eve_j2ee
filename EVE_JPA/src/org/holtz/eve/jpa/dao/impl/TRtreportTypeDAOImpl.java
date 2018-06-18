package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRtreportTypeDAO;
import org.holtz.eve.jpa.entity.TRtreportType;
import org.holtz.jpa.util.HibernateUtil;

public class TRtreportTypeDAOImpl implements TRtreportTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRtreportTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRtreportType getReportTypeById(int id) {
		String queryString = "from TRtreportType reportType where reportType.rtreportTypeId = :id";
		TRtreportType reportType = new TRtreportType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		reportType = (TRtreportType) query.uniqueResult();
		return reportType;
	}

	@Override
	public TRtreportType getReportTypeByName(String name) {
		String queryString = "from TRtreportType reportType where reportType.rtreportTypeTx like CONCAT('%',:name,'%')";
		TRtreportType reportType = new TRtreportType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		reportType = (TRtreportType) query.uniqueResult();
		return reportType;
	}

	@Override
	public List<TRtreportType> getReportTypeList() {
		String queryString = "from TRtreportType";
		List<TRtreportType> reportTypeList = new ArrayList<TRtreportType>();
		query = session.createQuery(queryString);
		reportTypeList = (List<TRtreportType>)query.list();
		return reportTypeList;
	}

	@Override
	public void save(TRtreportType reportType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRtreportType reportType) {
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
