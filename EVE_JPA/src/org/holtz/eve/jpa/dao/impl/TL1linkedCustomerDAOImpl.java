package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TL1linkedCustomerDAO;
import org.holtz.eve.jpa.entity.TL1linkedCustomer;
import org.holtz.jpa.util.HibernateUtil;

public class TL1linkedCustomerDAOImpl implements TL1linkedCustomerDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TL1linkedCustomerDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TL1linkedCustomer getLinkedCustomerById(int id) {
		String queryString = "from TL1linkedCustomer linkedCustomer where linkedCustomer.id = :id";
		TL1linkedCustomer linkedCustomer = new TL1linkedCustomer();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		linkedCustomer = (TL1linkedCustomer) query.uniqueResult();
		return linkedCustomer;
	}

	@Override
	public TL1linkedCustomer getLinkedCustomerByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TL1linkedCustomer linkedCustomer where linkedCustomer.id like CONCAT('%',:name,'%')";
//		TL1linkedCustomer linkedCustomer = new TL1linkedCustomer();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		linkedCustomer = (TL1linkedCustomer) query.uniqueResult();
//		return linkedCustomer;
	}

	@Override
	public List<TL1linkedCustomer> getLinkedCustomerList() {
		String queryString = "from TL1linkedCustomer";
		List<TL1linkedCustomer> linkedCustomerList = new ArrayList<TL1linkedCustomer>();
		query = session.createQuery(queryString);
		linkedCustomerList = (List<TL1linkedCustomer>)query.list();
		return linkedCustomerList;
	}

	@Override
	public void save(TL1linkedCustomer linkedCustomer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TL1linkedCustomer linkedCustomer) {
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
