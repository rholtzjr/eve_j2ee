package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TZ5storeSupplierDAO;
import org.holtz.eve.jpa.entity.TZ5storeSupplier;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TZ5storeSupplier;

public class TZ5storeSupplierDAOImpl implements TZ5storeSupplierDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TZ5storeSupplierDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TZ5storeSupplier getStoreSupplierById(int id) {
		String queryString = "from TZ5storeSupplier storeSupplier where storeSupplier.id = :id";
		TZ5storeSupplier storeSupplier = new TZ5storeSupplier();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		storeSupplier = (TZ5storeSupplier) query.uniqueResult();
		return storeSupplier;
	}

	@Override
	public TZ5storeSupplier getStoreSupplierByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TZ5storeSupplier storeSupplier where storeSupplier.is like CONCAT('%',:name,'%')";
//		TZ5storeSupplier storeSupplier = new TZ5storeSupplier();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		storeSupplier = (TZ5storeSupplier) query.uniqueResult();
//		return storeSupplier;
	}

	@Override
	public List<TZ5storeSupplier> getStoreSupplierList() {
		String queryString = "from TZ5storeSupplier";
		List<TZ5storeSupplier> storeSupplierList = new ArrayList<TZ5storeSupplier>();
		query = session.createQuery(queryString);
		storeSupplierList = (List<TZ5storeSupplier>)query.list();
		return storeSupplierList;
	}

	@Override
	public void save(TZ5storeSupplier storeSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TZ5storeSupplier storeSupplier) {
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
