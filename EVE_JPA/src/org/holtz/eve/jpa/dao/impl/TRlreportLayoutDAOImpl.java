package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRlreportLayoutDAO;
import org.holtz.eve.jpa.entity.TRlreportLayout;
import org.holtz.jpa.util.HibernateUtil;

public class TRlreportLayoutDAOImpl implements TRlreportLayoutDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRlreportLayoutDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRlreportLayout getReportLayoutById(int id) {
		String queryString = "from TRlreportLayout reportLayout where reportLayout.rlreportLayoutId = :id";
		TRlreportLayout reportLayout = new TRlreportLayout();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		reportLayout = (TRlreportLayout) query.uniqueResult();
		return reportLayout;
	}

	@Override
	public TRlreportLayout getReportLayoutByName(String name) {
		String queryString = "from TRlreportLayout reportLayout where reportLayout.rlreportLayoutTx like CONCAT('%',:name,'%')";
		TRlreportLayout reportLayout = new TRlreportLayout();
		query = session.createQuery(queryString);
		query.setString("name", name);
		reportLayout = (TRlreportLayout) query.uniqueResult();
		return reportLayout;
	}

	@Override
	public List<TRlreportLayout> getReportLayoutList() {
		String queryString = "from TRlreportLayout";
		List<TRlreportLayout> reportLayoutList = new ArrayList<TRlreportLayout>();
		query = session.createQuery(queryString);
		reportLayoutList = (List<TRlreportLayout>)query.list();
		return reportLayoutList;
	}

	@Override
	public void save(TRlreportLayout reportLayout) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRlreportLayout reportLayout) {
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
