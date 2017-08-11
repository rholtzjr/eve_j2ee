package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TC0companyDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TC0company;
import org.holtz.jpa.util.HibernateUtil;

public class TC0companyDAOImpl implements TC0companyDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TC0companyDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TC0company getCompanyById(int id) {
		String queryString = "from TC0company company where company.c0companyId = :id";
		TC0company company = new TC0company();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		company = (TC0company) query.uniqueResult();
		return company;
	}

	@Override
	public TC0company getCompanyByName(String name) {
		String queryString = "from TC0company company where company.c0companyNameTx like CONCAT('%',:name,'%')";
		TC0company company = new TC0company();
		query = session.createQuery(queryString);
		query.setString("name", name);
		company = (TC0company) query.uniqueResult();
		return company;
	}

	@Override
	public List<TC0company> getCompanyList() {
		String queryString = "from TC0company";
		List<TC0company> companyList = new ArrayList<TC0company>();
		query = session.createQuery(queryString);
		companyList = (List<TC0company>)query.list();
		return companyList;
	}

	@Override
	public void save(TC0company company) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TC0company company) {
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
