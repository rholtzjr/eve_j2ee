package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIsinvoiceTypeStoreDAO;
import org.holtz.eve.jpa.entity.TIsinvoiceTypeStore;
import org.holtz.jpa.util.HibernateUtil;

public class TIsinvoiceTypeStoreDAOImpl implements TIsinvoiceTypeStoreDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIsinvoiceTypeStoreDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIsinvoiceTypeStore getInvoiceTypeStoreById(int id) {
		String queryString = "from TIsinvoiceTypeStore invoiceTypeStore where invoiceTypeStore.isinvoiceTypeStore = :id";
		TIsinvoiceTypeStore invoiceTypeStore = new TIsinvoiceTypeStore();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		invoiceTypeStore = (TIsinvoiceTypeStore) query.uniqueResult();
		return invoiceTypeStore;
	}

	@Override
	public TIsinvoiceTypeStore getInvoiceTypeStoreByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TIsinvoiceTypeStore invoiceTypeStore where invoiceTypeStore.isinvoiceTypeStore like CONCAT('%',:name,'%')";
//		TIsinvoiceTypeStore invoiceTypeStore = new TIsinvoiceTypeStore();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		invoiceTypeStore = (TIsinvoiceTypeStore) query.uniqueResult();
//		return invoiceTypeStore;
	}

	@Override
	public List<TIsinvoiceTypeStore> getInvoiceTypeStoreList() {
		String queryString = "from TIsinvoiceTypeStore";
		List<TIsinvoiceTypeStore> invoiceTypeStoreList = new ArrayList<TIsinvoiceTypeStore>();
		query = session.createQuery(queryString);
		invoiceTypeStoreList = (List<TIsinvoiceTypeStore>)query.list();
		return invoiceTypeStoreList;
	}

	@Override
	public void save(TIsinvoiceTypeStore invoiceTypeStore) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIsinvoiceTypeStore invoiceTypeStore) {
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
