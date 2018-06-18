package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TMeMultiSaleDAO;
import org.holtz.eve.jpa.entity.TMeMultiSale;
import org.holtz.jpa.util.HibernateUtil;

public class TMeMultiSaleDAOImpl implements TMeMultiSaleDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TMeMultiSaleDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TMeMultiSale getMultiSaleById(int id) {
		String queryString = "from TMeMultiSale multiSale where multiSale.meMultiSaleId = :id";
		TMeMultiSale multiSale = new TMeMultiSale();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		multiSale = (TMeMultiSale) query.uniqueResult();
		return multiSale;
	}

	@Override
	public TMeMultiSale getMultiSaleByName(String name) {
		String queryString = "from TMeMultiSale multiSale where multiSale.meMultiSaleNameTx like CONCAT('%',:name,'%')";
		TMeMultiSale multiSale = new TMeMultiSale();
		query = session.createQuery(queryString);
		query.setString("name", name);
		multiSale = (TMeMultiSale) query.uniqueResult();
		return multiSale;
	}

	@Override
	public List<TMeMultiSale> getMultiSaleList() {
		String queryString = "from TMeMultiSale";
		List<TMeMultiSale> multiSaleList = new ArrayList<TMeMultiSale>();
		query = session.createQuery(queryString);
		multiSaleList = (List<TMeMultiSale>)query.list();
		return multiSaleList;
	}

	@Override
	public void save(TMeMultiSale multiSale) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TMeMultiSale multiSale) {
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
