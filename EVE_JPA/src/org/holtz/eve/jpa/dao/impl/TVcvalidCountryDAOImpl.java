package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TVcvalidCountryDAO;
import org.holtz.eve.jpa.entity.TVcvalidCountry;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TVcvalidCountry;

public class TVcvalidCountryDAOImpl implements TVcvalidCountryDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TVcvalidCountryDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TVcvalidCountry getValidCountryById(int id) {
		String queryString = "from TVcvalidCountry validCountry where validCountry.vcvalidCountryId = :id";
		TVcvalidCountry validCountry = new TVcvalidCountry();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		validCountry = (TVcvalidCountry) query.uniqueResult();
		return validCountry;
	}

	@Override
	public TVcvalidCountry getValidCountryByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TVcvalidCountry validCountry where validCountry.vcvalidCountryId like CONCAT('%',:name,'%')";
//		TVcvalidCountry validCountry = new TVcvalidCountry();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		validCountry = (TVcvalidCountry) query.uniqueResult();
//		return validCountry;
	}

	@Override
	public List<TVcvalidCountry> getValidCountryList() {
		String queryString = "from TVcvalidCountry";
		List<TVcvalidCountry> validCountryList = new ArrayList<TVcvalidCountry>();
		query = session.createQuery(queryString);
		validCountryList = (List<TVcvalidCountry>)query.list();
		return validCountryList;
	}

	@Override
	public void save(TVcvalidCountry validCountry) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TVcvalidCountry validCountry) {
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
