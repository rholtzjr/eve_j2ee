package org.holtz.eve.jpa.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPpPaymentProviderDAO;
import org.holtz.eve.jpa.entity.TPpPaymentProvider;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TPpPaymentProvider;

public class TPpPaymentProviderDAOImpl implements TPpPaymentProviderDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPpPaymentProviderDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPpPaymentProvider getPaymentProviderById(int id) {
		String queryString = "from TPpPaymentProvider paymentProvider where paymentProvider.ppPaymentProviderId = :id";
		TPpPaymentProvider paymentProvider = new TPpPaymentProvider();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		paymentProvider = (TPpPaymentProvider) query.uniqueResult();
		return paymentProvider;
	}

	@Override
	public TPpPaymentProvider getPaymentProviderByName(String name) {
		String queryString = "from TPpPaymentProvider paymentProvider where paymentProvider.ppNameTx like CONCAT('%',:name,'%')";
		TPpPaymentProvider paymentProvider = new TPpPaymentProvider();
		query = session.createQuery(queryString);
		query.setString("name", name);
		paymentProvider = (TPpPaymentProvider) query.uniqueResult();
		return paymentProvider;
	}

	@Override
	public List<TPpPaymentProvider> getPaymentProviderList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(TPpPaymentProvider paymentProvider) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPpPaymentProvider paymentProvider) {
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
