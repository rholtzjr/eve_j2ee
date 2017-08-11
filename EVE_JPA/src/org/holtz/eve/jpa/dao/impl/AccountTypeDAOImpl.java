package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.AccountTypeDAO;
import org.holtz.eve.jpa.entity.TAtaccountType;
import org.holtz.jpa.util.HibernateUtil;

public class AccountTypeDAOImpl implements AccountTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public AccountTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TAtaccountType getAccountTypeById(int id) {
		String queryString = "from TAtaccountType accountType where accountType.ataccountTypeId = :id";
		TAtaccountType accountType = new TAtaccountType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		accountType = (TAtaccountType) query.uniqueResult();
		return accountType;
	}

	@Override
	public TAtaccountType getAccountTypeByName(String name) {
		String queryString = "from TAtaccountType accountType where accountType.ataccountTypeTx like CONCAT('%',:name,'%')";
		TAtaccountType accountType = new TAtaccountType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		accountType = (TAtaccountType) query.uniqueResult();
		return accountType;
	}

	@Override
	public List<TAtaccountType> getAccountTypeList() {
		String queryString = "from TAtaccountType";
		List<TAtaccountType> accountTypeList = new ArrayList<TAtaccountType>();
		query = session.createQuery(queryString);
		accountTypeList = (List<TAtaccountType>)query.list();
		return accountTypeList;
	}

	@Override
	public void save(TAtaccountType account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TAtaccountType account) {
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
