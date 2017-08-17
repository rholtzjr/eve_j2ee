package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TXcshippingCountryDAO;
import org.holtz.eve.jpa.entity.TXcshippingCountry;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TXcshippingCountry;

public class TXcshippingCountryDAOImpl implements TXcshippingCountryDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TXcshippingCountryDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TXcshippingCountry getShippingCountryById(int id) {
		String queryString = "from TXcshippingCountry shippingCountry where shippingCountry.xcshippingCountryId = :id";
		TXcshippingCountry shippingCountry = new TXcshippingCountry();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		shippingCountry = (TXcshippingCountry) query.uniqueResult();
		return shippingCountry;
	}

	@Override
	public TXcshippingCountry getShippingCountryByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TXcshippingCountry shippingCountry where shippingCountry.xcshippingCountryId like CONCAT('%',:name,'%')";
//		TXcshippingCountry shippingCountry = new TXcshippingCountry();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		shippingCountry = (TXcshippingCountry) query.uniqueResult();
//		return shippingCountry;
	}

	@Override
	public List<TXcshippingCountry> getShippingCountryList() {
		String queryString = "from TXcshippingCountry";
		List<TXcshippingCountry> shippingCountryList = new ArrayList<TXcshippingCountry>();
		query = session.createQuery(queryString);
		shippingCountryList = (List<TXcshippingCountry>)query.list();
		return shippingCountryList;
	}

	@Override
	public void save(TXcshippingCountry shippingCountry) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TXcshippingCountry shippingCountry) {
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
