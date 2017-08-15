package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPyPaymentDAO;
import org.holtz.eve.jpa.entity.TPyPayment;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TPyPayment;

public class TPyPaymentDAOImpl implements TPyPaymentDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPyPaymentDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPyPayment getPaymentById(int id) {
		String queryString = "from TPyPayment payment where payment.pyPaymentId = :id";
		TPyPayment payment = new TPyPayment();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		payment = (TPyPayment) query.uniqueResult();
		return payment;
	}

	@Override
	public TPyPayment getPaymentByName(String name) {
		String queryString = "from TPyPayment payment where payment.pyPaymentNumberTxN like CONCAT('%',:name,'%')";
		TPyPayment payment = new TPyPayment();
		query = session.createQuery(queryString);
		query.setString("name", name);
		payment = (TPyPayment) query.uniqueResult();
		return payment;
	}

	@Override
	public List<TPyPayment> getPaymentList() {
		String queryString = "from TPyPayment";
		List<TPyPayment> paymentList = new ArrayList<TPyPayment>();
		query = session.createQuery(queryString);
		paymentList = (List<TPyPayment>)query.list();
		return paymentList;
	}

	@Override
	public void save(TPyPayment payment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPyPayment payment) {
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
