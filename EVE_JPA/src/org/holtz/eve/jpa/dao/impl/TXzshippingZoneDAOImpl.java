package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TXzshippingZoneDAO;
import org.holtz.eve.jpa.entity.TXzshippingZone;
import org.holtz.jpa.util.HibernateUtil;

public class TXzshippingZoneDAOImpl implements TXzshippingZoneDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TXzshippingZoneDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TXzshippingZone getShippingZoneById(int id) {
		String queryString = "from TXzshippingZone shippingZone where shippingZone.xzshippingZoneId = :id";
		TXzshippingZone shippingZone = new TXzshippingZone();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		shippingZone = (TXzshippingZone) query.uniqueResult();
		return shippingZone;
	}

	@Override
	public TXzshippingZone getShippingZoneByName(String name) {
		String queryString = "from TXzshippingZone shippingZone where shippingZone.xzshippingZoneTx like CONCAT('%',:name,'%')";
		TXzshippingZone shippingZone = new TXzshippingZone();
		query = session.createQuery(queryString);
		query.setString("name", name);
		shippingZone = (TXzshippingZone) query.uniqueResult();
		return shippingZone;
	}

	@Override
	public List<TXzshippingZone> getShippingZoneList() {
		String queryString = "from TXzshippingZone";
		List<TXzshippingZone> shippingZoneList = new ArrayList<TXzshippingZone>();
		query = session.createQuery(queryString);
		shippingZoneList = (List<TXzshippingZone>)query.list();
		return shippingZoneList;
	}

	@Override
	public void save(TXzshippingZone shippingZone) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TXzshippingZone shippingZone) {
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
