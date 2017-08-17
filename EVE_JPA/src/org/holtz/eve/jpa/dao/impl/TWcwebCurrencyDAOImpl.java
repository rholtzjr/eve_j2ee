package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TWcwebCurrencyDAO;
import org.holtz.eve.jpa.entity.TWcwebCurrency;
import org.holtz.jpa.util.HibernateUtil;

public class TWcwebCurrencyDAOImpl implements TWcwebCurrencyDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TWcwebCurrencyDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TWcwebCurrency getWebCurrencyById(int id) {
		String queryString = "from TWcwebCurrency webCurrency where webCurrency.wcwebCurrencyId = :id";
		TWcwebCurrency webCurrency = new TWcwebCurrency();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		webCurrency = (TWcwebCurrency) query.uniqueResult();
		return webCurrency;
	}

	@Override
	public TWcwebCurrency getWebCurrencyByName(String name) {
		String queryString = "from TWcwebCurrency webCurrency where webCurrency.wcwebCurrencyTx like CONCAT('%',:name,'%')";
		TWcwebCurrency webCurrency = new TWcwebCurrency();
		query = session.createQuery(queryString);
		query.setString("name", name);
		webCurrency = (TWcwebCurrency) query.uniqueResult();
		return webCurrency;
	}

	@Override
	public List<TWcwebCurrency> getWebCurrencyList() {
		String queryString = "from TWcwebCurrency";
		List<TWcwebCurrency> webCurrencyList = new ArrayList<TWcwebCurrency>();
		query = session.createQuery(queryString);
		webCurrencyList = (List<TWcwebCurrency>)query.list();
		return webCurrencyList;
	}

	@Override
	public void save(TWcwebCurrency webCurrency) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TWcwebCurrency webCurrency) {
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
