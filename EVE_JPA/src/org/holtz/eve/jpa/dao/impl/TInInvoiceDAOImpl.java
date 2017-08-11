package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TInInvoiceDAO;
import org.holtz.eve.jpa.entity.TInInvoice;
import org.holtz.eve.jpa.entity.TInInvoice;
import org.holtz.jpa.util.HibernateUtil;

public class TInInvoiceDAOImpl implements TInInvoiceDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TInInvoiceDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TInInvoice getInvoiceById(int id) {
		String queryString = "from TInInvoice invoice where invoice.inInvoiceId = :id";
		TInInvoice invoice = new TInInvoice();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		invoice = (TInInvoice) query.uniqueResult();
		return invoice;
	}

	@Override
	public TInInvoice getInvoiceByName(String name) {
		String queryString = "from TInInvoice invoice where invoice.inInvoiceNumberTxN like CONCAT('%',:name,'%')";
		TInInvoice invoice = new TInInvoice();
		query = session.createQuery(queryString);
		query.setString("name", name);
		invoice = (TInInvoice) query.uniqueResult();
		return invoice;
	}

	@Override
	public List<TInInvoice> getInvoiceList() {
		String queryString = "from TInInvoice";
		List<TInInvoice> invoiceList = new ArrayList<TInInvoice>();
		query = session.createQuery(queryString);
		invoiceList = (List<TInInvoice>)query.list();
		return invoiceList;
	}

	@Override
	public void save(TInInvoice invoice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TInInvoice invoice) {
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
