package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSuSupplierDAO;
import org.holtz.eve.jpa.entity.TSuSupplier;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TSuSupplier;

public class TSuSupplierDAOImpl implements TSuSupplierDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSuSupplierDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSuSupplier getSupplierById(int id) {
		String queryString = "from TSuSupplier supplier where supplier.acAccountId = :id";
		TSuSupplier supplier = new TSuSupplier();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		supplier = (TSuSupplier) query.uniqueResult();
		return supplier;
	}

	@Override
	public TSuSupplier getSupplierByName(String name) {
		String queryString = "from TSuSupplier supplier where supplier.acAccountNameTx like CONCAT('%',:name,'%')";
		TSuSupplier supplier = new TSuSupplier();
		query = session.createQuery(queryString);
		query.setString("name", name);
		supplier = (TSuSupplier) query.uniqueResult();
		return supplier;
	}

	@Override
	public List<TSuSupplier> getSupplierList() {
		String queryString = "from TSuSupplier";
		List<TSuSupplier> supplierList = new ArrayList<TSuSupplier>();
		query = session.createQuery(queryString);
		supplierList = (List<TSuSupplier>)query.list();
		return supplierList;
	}

	@Override
	public void save(TSuSupplier supplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSuSupplier supplier) {
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
