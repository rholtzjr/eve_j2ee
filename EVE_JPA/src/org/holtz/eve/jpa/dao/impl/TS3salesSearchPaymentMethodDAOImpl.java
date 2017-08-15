package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TS3salesSearchPaymentMethodDAO;
import org.holtz.eve.jpa.entity.TS3salesSearchPaymentMethod;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TS3salesSearchPaymentMethod;

public class TS3salesSearchPaymentMethodDAOImpl implements TS3salesSearchPaymentMethodDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TS3salesSearchPaymentMethodDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TS3salesSearchPaymentMethod getSalesSearchPaymentMethodById(int id) {
		String queryString = "from TS3salesSearchPaymentMethod salesSearchPaymentMethod where salesSearchPaymentMethod.id = :id";
		TS3salesSearchPaymentMethod salesSearchPaymentMethod = new TS3salesSearchPaymentMethod();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		salesSearchPaymentMethod = (TS3salesSearchPaymentMethod) query.uniqueResult();
		return salesSearchPaymentMethod;
	}

	@Override
	public TS3salesSearchPaymentMethod getSalesSearchPaymentMethodByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TS3salesSearchPaymentMethod salesSearchPaymentMethod where salesSearchPaymentMethod.id like CONCAT('%',:name,'%')";
//		TS3salesSearchPaymentMethod salesSearchPaymentMethod = new TS3salesSearchPaymentMethod();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		salesSearchPaymentMethod = (TS3salesSearchPaymentMethod) query.uniqueResult();
//		return salesSearchPaymentMethod;
	}

	@Override
	public List<TS3salesSearchPaymentMethod> getSalesSearchPaymentMethodList() {
		String queryString = "from TS3salesSearchPaymentMethod";
		List<TS3salesSearchPaymentMethod> salesSearchPaymentMethodList = new ArrayList<TS3salesSearchPaymentMethod>();
		query = session.createQuery(queryString);
		salesSearchPaymentMethodList = (List<TS3salesSearchPaymentMethod>)query.list();
		return salesSearchPaymentMethodList;
	}

	@Override
	public void save(TS3salesSearchPaymentMethod salesSearchPaymentMethod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TS3salesSearchPaymentMethod salesSearchPaymentMethod) {
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
