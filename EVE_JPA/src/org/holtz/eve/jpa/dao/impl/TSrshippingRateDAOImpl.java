package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSrshippingRateDAO;
import org.holtz.eve.jpa.entity.TSrshippingRate;
import org.holtz.jpa.util.HibernateUtil;

public class TSrshippingRateDAOImpl implements TSrshippingRateDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSrshippingRateDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSrshippingRate getShippingRateById(int id) {
		String queryString = "from TSrshippingRate shippingRate where shippingRate.srShippingRateId = :id";
		TSrshippingRate shippingRate = new TSrshippingRate();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		shippingRate = (TSrshippingRate) query.uniqueResult();
		return shippingRate;
	}

	@Override
	public TSrshippingRate getShippingRateByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSrshippingRate shippingRate where shippingRate.srShippingRateId like CONCAT('%',:name,'%')";
//		TSrshippingRate shippingRate = new TSrshippingRate();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		shippingRate = (TSrshippingRate) query.uniqueResult();
//		return shippingRate;
	}

	@Override
	public List<TSrshippingRate> getShippingRateList() {
		String queryString = "from TSrshippingRate";
		List<TSrshippingRate> shippingRateList = new ArrayList<TSrshippingRate>();
		query = session.createQuery(queryString);
		shippingRateList = (List<TSrshippingRate>)query.list();
		return shippingRateList;
	}

	@Override
	public void save(TSrshippingRate shippingRate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSrshippingRate shippingRate) {
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
