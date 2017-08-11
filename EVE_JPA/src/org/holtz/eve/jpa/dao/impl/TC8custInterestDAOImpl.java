package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TC8custInterestDAO;
import org.holtz.eve.jpa.entity.TC8custInterest;
import org.holtz.jpa.util.HibernateUtil;

public class TC8custInterestDAOImpl implements TC8custInterestDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TC8custInterestDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TC8custInterest getCustInterestById(int id) {
		String queryString = "from TC8custInterest custinterest where custinterest.c8custInterestId = :id";
		TC8custInterest custInterest = new TC8custInterest();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		custInterest = (TC8custInterest) query.uniqueResult();
		return custInterest;
	}

	@Override
	public TC8custInterest getCustInterestByName(String name) {
		String queryString = "from TC8custInterest custinterest where custinterest.c8notesTxN like CONCAT('%',:name,'%')";
		TC8custInterest custInterest = new TC8custInterest();
		query = session.createQuery(queryString);
		query.setString("name", name);
		custInterest = (TC8custInterest) query.uniqueResult();
		return custInterest;
	}

	@Override
	public List<TC8custInterest> getCustInterestList() {
		String queryString = "from TC8custInterest";
		List<TC8custInterest> custInterestList = new ArrayList<TC8custInterest>();
		query = session.createQuery(queryString);
		custInterestList = (List<TC8custInterest>)query.list();
		return custInterestList;
	}

	@Override
	public void save(TC8custInterest account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TC8custInterest account) {
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
