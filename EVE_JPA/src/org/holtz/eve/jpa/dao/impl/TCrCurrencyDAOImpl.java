package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCrCurrencyDAO;
import org.holtz.eve.jpa.entity.TCrCurrency;
import org.holtz.jpa.util.HibernateUtil;

public class TCrCurrencyDAOImpl implements TCrCurrencyDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCrCurrencyDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCrCurrency getCurrencyById(int id) {
		String queryString = "from TCrCurrency currency where currency.crCurrencyId = :id";
		TCrCurrency currency = new TCrCurrency();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		currency = (TCrCurrency) query.uniqueResult();
		return currency;
	}

	@Override
	public TCrCurrency getCurrencyByName(String name) {
		String queryString = "from TCrCurrency currency where currency.crNameTx like CONCAT('%',:name,'%')";
		TCrCurrency currency = new TCrCurrency();
		query = session.createQuery(queryString);
		query.setString("name", name);
		currency = (TCrCurrency) query.uniqueResult();
		return currency;
	}

	@Override
	public List<TCrCurrency> getCurrencyList() {
		String queryString = "from TCrCurrency";
		List<TCrCurrency> currencyList = new ArrayList<TCrCurrency>();
		query = session.createQuery(queryString);
		currencyList = (List<TCrCurrency>)query.list();
		return currencyList;
	}

	@Override
	public void save(TCrCurrency currency) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCrCurrency currency) {
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
