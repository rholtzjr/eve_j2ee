package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIiinvoiceItemDAO;
import org.holtz.eve.jpa.entity.TIiinvoiceItem;
import org.holtz.jpa.util.HibernateUtil;

public class TIiinvoiceItemDAOImpl implements TIiinvoiceItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIiinvoiceItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIiinvoiceItem getInvoiceItemById(int id) {
		String queryString = "from TIiinvoiceItem invoiceItem where invoiceItem.iiinvoiceItemId = :id";
		TIiinvoiceItem invoiceItem = new TIiinvoiceItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		invoiceItem = (TIiinvoiceItem) query.uniqueResult();
		return invoiceItem;
	}

	@Override
	public TIiinvoiceItem getInvoiceItemByName(String name) {
		String queryString = "from TIiinvoiceItem invoiceItem where invoiceItem.iinotesTxN like CONCAT('%',:name,'%')";
		TIiinvoiceItem invoiceItem = new TIiinvoiceItem();
		query = session.createQuery(queryString);
		query.setString("name", name);
		invoiceItem = (TIiinvoiceItem) query.uniqueResult();
		return invoiceItem;
	}

	@Override
	public List<TIiinvoiceItem> getInvoiceItemList() {
		String queryString = "from TIiinvoiceItem";
		List<TIiinvoiceItem> invoiceItemList = new ArrayList<TIiinvoiceItem>();
		query = session.createQuery(queryString);
		invoiceItemList = (List<TIiinvoiceItem>)query.list();
		return invoiceItemList;
	}

	@Override
	public void save(TIiinvoiceItem invoiceItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIiinvoiceItem invoiceItem) {
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
