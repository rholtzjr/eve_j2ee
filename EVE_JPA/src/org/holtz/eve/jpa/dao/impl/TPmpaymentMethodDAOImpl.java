package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPmpaymentMethodDAO;
import org.holtz.eve.jpa.entity.TPmpaymentMethod;
import org.holtz.jpa.util.HibernateUtil;

public class TPmpaymentMethodDAOImpl implements TPmpaymentMethodDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPmpaymentMethodDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPmpaymentMethod getPaymentMethodById(int id) {
		String queryString = "from TPmpaymentMethod paymentMethod where paymentMethod.pmpaymentMethodId = :id";
		TPmpaymentMethod paymentMethod = new TPmpaymentMethod();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		paymentMethod = (TPmpaymentMethod) query.uniqueResult();
		return paymentMethod;
	}

	@Override
	public TPmpaymentMethod getPaymentMethodByName(String name) {
		String queryString = "from TPmpaymentMethod paymentMethod where paymentMethod.pmpaymentMethodTx like CONCAT('%',:name,'%')";
		TPmpaymentMethod paymentMethod = new TPmpaymentMethod();
		query = session.createQuery(queryString);
		query.setString("name", name);
		paymentMethod = (TPmpaymentMethod) query.uniqueResult();
		return paymentMethod;
	}

	@Override
	public List<TPmpaymentMethod> getPaymentMethodList() {
		String queryString = "from TPmpaymentMethod";
		List<TPmpaymentMethod> paymentMethodList = new ArrayList<TPmpaymentMethod>();
		query = session.createQuery(queryString);
		paymentMethodList = (List<TPmpaymentMethod>)query.list();
		return paymentMethodList;
	}

	@Override
	public void save(TPmpaymentMethod paymentMethod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPmpaymentMethod paymentMethod) {
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
