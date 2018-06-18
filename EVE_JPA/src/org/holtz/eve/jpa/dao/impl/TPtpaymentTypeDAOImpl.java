package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPtpaymentTypeDAO;
import org.holtz.eve.jpa.entity.TPtpaymentType;
import org.holtz.jpa.util.HibernateUtil;

public class TPtpaymentTypeDAOImpl implements TPtpaymentTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPtpaymentTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPtpaymentType getPaymentTypeById(int id) {
		String queryString = "from TPtpaymentType paymentType where paymentType.ptpaymentTypeId = :id";
		TPtpaymentType paymentType = new TPtpaymentType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		paymentType = (TPtpaymentType) query.uniqueResult();
		return paymentType;
	}

	@Override
	public TPtpaymentType getPaymentTypeByName(String name) {
		String queryString = "from TPtpaymentType paymentType where paymentType.ptpaymentTypeTx like CONCAT('%',:name,'%')";
		TPtpaymentType paymentType = new TPtpaymentType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		paymentType = (TPtpaymentType) query.uniqueResult();
		return paymentType;
	}

	@Override
	public List<TPtpaymentType> getPaymentTypeList() {
		String queryString = "from TPtpaymentType";
		List<TPtpaymentType> paymentTypeList = new ArrayList<TPtpaymentType>();
		query = session.createQuery(queryString);
		paymentTypeList = (List<TPtpaymentType>)query.list();
		return paymentTypeList;
	}

	@Override
	public void save(TPtpaymentType paymentType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPtpaymentType paymentType) {
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
