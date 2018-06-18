package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TC3custCreditCardDAO;
import org.holtz.eve.jpa.entity.TC3custCreditCard;
import org.holtz.jpa.util.HibernateUtil;

public class TC3custCreditCardDAOImpl implements TC3custCreditCardDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TC3custCreditCardDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TC3custCreditCard getCustCCById(int id) {
		String queryString = "from TC3custCreditCard custcc where custcc.c3custCreditCardId = :id";
		TC3custCreditCard custCC = new TC3custCreditCard();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		custCC = (TC3custCreditCard) query.uniqueResult();
		return custCC;
	}

	@Override
	public TC3custCreditCard getCustCCByLastName(String name) {
		String queryString = "from TC3custCreditCard custcc where custcc.c3lastNameTxN like CONCAT('%',:name,'%')";
		TC3custCreditCard custCC = new TC3custCreditCard();
		query = session.createQuery(queryString);
		query.setString("name", name);
		custCC = (TC3custCreditCard) query.uniqueResult();
		return custCC;
	}

	@Override
	public List<TC3custCreditCard> getCustCCList() {
		String queryString = "from TC3custCreditCard";
		List<TC3custCreditCard> custCCList = new ArrayList<TC3custCreditCard>();
		query = session.createQuery(queryString);
		custCCList = (List<TC3custCreditCard>)query.list();
		return custCCList;
	}

	@Override
	public void save(TC3custCreditCard custCard) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TC3custCreditCard custCard) {
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
