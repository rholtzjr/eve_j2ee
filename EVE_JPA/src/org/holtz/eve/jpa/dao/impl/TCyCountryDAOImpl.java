package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCyCountryDAO;
import org.holtz.eve.jpa.entity.TCyCountry;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TCyCountry;

public class TCyCountryDAOImpl implements TCyCountryDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCyCountryDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCyCountry getCountryById(int id) {
		String queryString = "from TCyCountry country where country.cyCountryId = :id";
		TCyCountry country = new TCyCountry();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		country = (TCyCountry) query.uniqueResult();
		return country;
	}

	@Override
	public TCyCountry getCountryByName(String name) {
		String queryString = "from TCyCountry country where country.cyCountryTx like CONCAT('%',:name,'%')";
		TCyCountry country = new TCyCountry();
		query = session.createQuery(queryString);
		query.setString("name", name);
		country = (TCyCountry) query.uniqueResult();
		return country;
	}

	@Override
	public List<TCyCountry> getCountryList() {
		String queryString = "from TCyCountry";
		List<TCyCountry> countryList = new ArrayList<TCyCountry>();
		query = session.createQuery(queryString);
		countryList = (List<TCyCountry>)query.list();
		return countryList;
	}

	@Override
	public void save(TCyCountry country) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCyCountry country) {
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
