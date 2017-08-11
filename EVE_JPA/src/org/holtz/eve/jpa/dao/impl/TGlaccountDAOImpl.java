package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TGlaccountDAO;
import org.holtz.eve.jpa.entity.TGlaccount;
import org.holtz.jpa.util.HibernateUtil;

public class TGlaccountDAOImpl implements TGlaccountDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TGlaccountDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TGlaccount getAccountById(int id) {
		String queryString = "from TGlaccount account where account.glaccountId = :id";
		TGlaccount account = new TGlaccount();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		account = (TGlaccount) query.uniqueResult();
		return account;
	}

	@Override
	public TGlaccount getAccountByName(String name) {
		String queryString = "from TGlaccount account where account.glaccountTx like CONCAT('%',:name,'%')";
		TGlaccount account = new TGlaccount();
		query = session.createQuery(queryString);
		query.setString("name", name);
		account = (TGlaccount) query.uniqueResult();
		return account;
	}

	@Override
	public List<TGlaccount> getAccountList() {
		String queryString = "from TGlaccount";
		List<TGlaccount> accountList = new ArrayList<TGlaccount>();
		query = session.createQuery(queryString);
		accountList = (List<TGlaccount>)query.list();
		return accountList;
	}

	@Override
	public void save(org.holtz.eve.jpa.entity.TGlaccount account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(org.holtz.eve.jpa.entity.TGlaccount account) {
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
