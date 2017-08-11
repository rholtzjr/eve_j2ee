package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TItinvoiceTypeDAO;
import org.holtz.eve.jpa.entity.TItinvoiceType;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TItinvoiceType;

public class TItinvoiceTypeDAOImpl implements TItinvoiceTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TItinvoiceTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TItinvoiceType getInvoiceTypeById(int id) {
		String queryString = "from TItinvoiceType invoiceType where invoiceType.itinvoiceTypeId = :id";
		TItinvoiceType invoiceType = new TItinvoiceType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		invoiceType = (TItinvoiceType) query.uniqueResult();
		return invoiceType;
	}

	@Override
	public TItinvoiceType getInvoiceTypeByName(String name) {
		String queryString = "from TItinvoiceType invoiceType where invoiceType.itinvoiceTypeTx like CONCAT('%',:name,'%')";
		TItinvoiceType invoiceType = new TItinvoiceType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		invoiceType = (TItinvoiceType) query.uniqueResult();
		return invoiceType;
	}

	@Override
	public List<TItinvoiceType> getInvoiceTypeList() {
		String queryString = "from TItinvoiceType";
		List<TItinvoiceType> invoiceTypeList = new ArrayList<TItinvoiceType>();
		query = session.createQuery(queryString);
		invoiceTypeList = (List<TItinvoiceType>)query.list();
		return invoiceTypeList;
	}

	@Override
	public void save(TItinvoiceType invoiceType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TItinvoiceType invoiceType) {
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
