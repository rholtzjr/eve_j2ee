package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRfreportFieldDAO;
import org.holtz.eve.jpa.entity.TRfreportField;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TRfreportField;

public class TRfreportFieldDAOImpl implements TRfreportFieldDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRfreportFieldDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRfreportField getReportFieldById(int id) {
		String queryString = "from TRfreportField reportField where reportField.rfreportFieldId = :id";
		TRfreportField reportField = new TRfreportField();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		reportField = (TRfreportField) query.uniqueResult();
		return reportField;
	}

	@Override
	public TRfreportField getReportFieldByName(String name) {
		String queryString = "from TRfreportField reportField where reportField.rffieldTx like CONCAT('%',:name,'%')";
		TRfreportField reportField = new TRfreportField();
		query = session.createQuery(queryString);
		query.setString("name", name);
		reportField = (TRfreportField) query.uniqueResult();
		return reportField;
	}

	@Override
	public List<TRfreportField> getReportFieldList() {
		String queryString = "from TRfreportField";
		List<TRfreportField> reportFieldList = new ArrayList<TRfreportField>();
		query = session.createQuery(queryString);
		reportFieldList = (List<TRfreportField>)query.list();
		return reportFieldList;
	}

	@Override
	public void save(TRfreportField reportField) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRfreportField reportField) {
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
