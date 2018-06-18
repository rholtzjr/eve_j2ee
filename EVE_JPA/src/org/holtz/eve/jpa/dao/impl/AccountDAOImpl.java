package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.AccountDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.jpa.util.HibernateUtil;

public class AccountDAOImpl implements AccountDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public AccountDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}
	
	
	@Override
	public TAcAccount getAccountById(int id) {
		String queryString = "from TAcAccount account where account.acAccountId = :id";
		TAcAccount account = new TAcAccount();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		account = (TAcAccount) query.uniqueResult();
		return account;
	}

	@Override
	public TAcAccount getAccountByName(String name) {
		String queryString = "from TAcAccount account where account.acAccountNameTx like CONCAT('%',:name,'%')";
		TAcAccount account = new TAcAccount();
		query = session.createQuery(queryString);
		query.setString("name", name);
		account = (TAcAccount) query.uniqueResult();
		return account;
	}

	@Override
	public List<TAcAccount> getAccountList() {
		String queryString = "from TAcAccount";
		List<TAcAccount> accountList = new ArrayList<TAcAccount>();
		query = session.createQuery(queryString);
		accountList = (List<TAcAccount>)query.list();
		return accountList;
	}
	
	@Override
	public void save(TAcAccount account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TAcAccount account) {
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
