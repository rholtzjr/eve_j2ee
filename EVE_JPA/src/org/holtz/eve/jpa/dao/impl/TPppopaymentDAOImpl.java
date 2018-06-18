package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPppopaymentDAO;
import org.holtz.eve.jpa.entity.TPppopayment;
import org.holtz.jpa.util.HibernateUtil;

public class TPppopaymentDAOImpl implements TPppopaymentDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPppopaymentDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPppopayment getPopaymentById(int id) {
		String queryString = "from TPppopayment popayment where popayment.pppopaymentId = :id";
		TPppopayment popayment = new TPppopayment();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		popayment = (TPppopayment) query.uniqueResult();
		return popayment;
	}

	@Override
	public TPppopayment getPopaymentByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TPppopayment popayment where popayment.pppopaymentId like CONCAT('%',:name,'%')";
//		TPppopayment popayment = new TPppopayment();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		popayment = (TPppopayment) query.uniqueResult();
//		return popayment;
	}

	@Override
	public List<TPppopayment> getPopaymentList() {
		String queryString = "from TPppopayment";
		List<TPppopayment> popaymentList = new ArrayList<TPppopayment>();
		query = session.createQuery(queryString);
		popaymentList = (List<TPppopayment>)query.list();
		return popaymentList;
	}

	@Override
	public void save(TPppopayment popayment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPppopayment popayment) {
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
