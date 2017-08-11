package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.AccountPaymentDAO;
import org.holtz.eve.jpa.entity.TAyAccountPayment;
import org.holtz.jpa.util.HibernateUtil;

public class AccountPaymentDAOImpl implements AccountPaymentDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public AccountPaymentDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TAyAccountPayment getAccountPaymentById(int id) {
		String queryString = "from TAyAccountPayment accountpayment where accountpayment.ayAccountPaymentId = :id";
		TAyAccountPayment accountPayment = new TAyAccountPayment();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		accountPayment = (TAyAccountPayment) query.uniqueResult();
		return accountPayment;
	}

	@Override
	public TAyAccountPayment getAccountPaymentByName(String name) {
	//NOOP
		return null;
	}

	@Override
	public List<TAyAccountPayment> getAccountPaymentList() {
		String queryString = "from TAyAccountPayment";
		List<TAyAccountPayment> accountPaymentList = new ArrayList<TAyAccountPayment>();
		query = session.createQuery(queryString);
		accountPaymentList = (List<TAyAccountPayment>)query.list();
		return accountPaymentList;
	}

	@Override
	public void save(TAyAccountPayment accountPayment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TAyAccountPayment accountPayment) {
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
