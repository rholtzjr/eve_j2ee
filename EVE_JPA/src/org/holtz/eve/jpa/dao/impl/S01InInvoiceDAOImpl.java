package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.S01InInvoiceDAO;
import org.holtz.eve.jpa.entity.S01InInvoice;
import org.holtz.jpa.util.HibernateUtil;

public class S01InInvoiceDAOImpl implements S01InInvoiceDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public S01InInvoiceDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public S01InInvoice getInInvoiceById(int id) {
		String queryString = "from S01InInvoice invoice where invoice.inInvoiceID = :id";
		S01InInvoice invoice = new S01InInvoice();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		invoice = (S01InInvoice) query.uniqueResult();
		return invoice;
	}

	@Override
	public S01InInvoice getInInvoiceByName(String name) {
		String queryString = "from S01InInvoice invoice where invoice.inInvoiceNumberTx_N like CONCAT('%',:name,'%')";
		S01InInvoice invoice = new S01InInvoice();
		query = session.createQuery(queryString);
		query.setString("name", name);
		invoice = (S01InInvoice) query.uniqueResult();
		return invoice;
	}

	@Override
	public List<S01InInvoice> getInInvoiceList() {
		String queryString = "from S01InInvoice";
		List<S01InInvoice> invoiceList = new ArrayList<S01InInvoice>();
		query = session.createQuery(queryString);
		invoiceList = (List<S01InInvoice>)query.list();
		return invoiceList;
	}

	@Override
	public void save(S01InInvoice inInvoice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(S01InInvoice inInvoice) {
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

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}

}
