package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCmcontactMethodDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TCmcontactMethod;
import org.holtz.jpa.util.HibernateUtil;

public class TCmcontactMethodDAOImpl implements TCmcontactMethodDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCmcontactMethodDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCmcontactMethod getContactMethodById(int id) {
		String queryString = "from TCmcontactMethod contactmethod where contactmethod.cmcontactMethodId = :id";
		TCmcontactMethod account = new TCmcontactMethod();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		account = (TCmcontactMethod) query.uniqueResult();
		return account;
	}

	@Override
	public TCmcontactMethod getContactMethodByName(String name) {
		String queryString = "from TCmcontactMethod contactmethod where contactmethod.cmcontactMethodTx like CONCAT('%',:name,'%')";
		TCmcontactMethod account = new TCmcontactMethod();
		query = session.createQuery(queryString);
		query.setString("name", name);
		account = (TCmcontactMethod) query.uniqueResult();
		return account;
	}

	@Override
	public List<TCmcontactMethod> getContactMethodList() {
		String queryString = "from TCmcontactMethod";
		List<TCmcontactMethod> accountList = new ArrayList<TCmcontactMethod>();
		query = session.createQuery(queryString);
		accountList = (List<TCmcontactMethod>)query.list();
		return accountList;
	}

	@Override
	public void save(TCmcontactMethod contactMethod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCmcontactMethod contactMethod) {
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
