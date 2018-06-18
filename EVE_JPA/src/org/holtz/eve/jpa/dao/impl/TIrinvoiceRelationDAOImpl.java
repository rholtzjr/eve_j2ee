package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIrinvoiceRelationDAO;
import org.holtz.eve.jpa.entity.TIrinvoiceRelation;
import org.holtz.jpa.util.HibernateUtil;

public class TIrinvoiceRelationDAOImpl implements TIrinvoiceRelationDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIrinvoiceRelationDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIrinvoiceRelation getInvoiceRelationById(int id) {
		String queryString = "from TIrinvoiceRelation invoiceRelation where invoiceRelation.id = :id";
		TIrinvoiceRelation invoiceRelation = new TIrinvoiceRelation();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		invoiceRelation = (TIrinvoiceRelation) query.uniqueResult();
		return invoiceRelation;
	}

	@Override
	public TIrinvoiceRelation getInvoiceRelationByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TIrinvoiceRelation invoiceRelation where invoiceRelation.id like CONCAT('%',:name,'%')";
//		TIrinvoiceRelation invoiceRelation = new TIrinvoiceRelation();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		invoiceRelation = (TIrinvoiceRelation) query.uniqueResult();
//		return invoiceRelation;
	}

	@Override
	public List<TIrinvoiceRelation> getInvoiceRelationList() {
		String queryString = "from TIrinvoiceRelation";
		List<TIrinvoiceRelation> invoiceRelationList = new ArrayList<TIrinvoiceRelation>();
		query = session.createQuery(queryString);
		invoiceRelationList = (List<TIrinvoiceRelation>)query.list();
		return invoiceRelationList;
	}

	@Override
	public void save(TIrinvoiceRelation invoiceRelation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIrinvoiceRelation invoiceRelation) {
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
