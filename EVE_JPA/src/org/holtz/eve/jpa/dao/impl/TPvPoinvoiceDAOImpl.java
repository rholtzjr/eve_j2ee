package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPvPoinvoiceDAO;
import org.holtz.eve.jpa.entity.TPvPoinvoice;
import org.holtz.jpa.util.HibernateUtil;

public class TPvPoinvoiceDAOImpl implements TPvPoinvoiceDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPvPoinvoiceDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPvPoinvoice getPoinvoiceById(int id) {
		String queryString = "from TPvPoinvoice poinvoice where poinvoice.pvPoinvoiceId = :id";
		TPvPoinvoice poinvoice = new TPvPoinvoice();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		poinvoice = (TPvPoinvoice) query.uniqueResult();
		return poinvoice;
	}

	@Override
	public TPvPoinvoice getPoinvoiceByName(String name) {
		String queryString = "from TPvPoinvoice poinvoice where poinvoice.pvInvoiceNoTx like CONCAT('%',:name,'%')";
		TPvPoinvoice poinvoice = new TPvPoinvoice();
		query = session.createQuery(queryString);
		query.setString("name", name);
		poinvoice = (TPvPoinvoice) query.uniqueResult();
		return poinvoice;
	}

	@Override
	public List<TPvPoinvoice> getPoinvoiceList() {
		String queryString = "from TPvPoinvoice";
		List<TPvPoinvoice> poinvoiceList = new ArrayList<TPvPoinvoice>();
		query = session.createQuery(queryString);
		poinvoiceList = (List<TPvPoinvoice>)query.list();
		return poinvoiceList;
	}

	@Override
	public void save(TPvPoinvoice poinvoice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPvPoinvoice poinvoice) {
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
