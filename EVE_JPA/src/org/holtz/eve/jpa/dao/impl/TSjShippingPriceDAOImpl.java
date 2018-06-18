package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSjShippingPriceDAO;
import org.holtz.eve.jpa.entity.TSjShippingPrice;
import org.holtz.jpa.util.HibernateUtil;

public class TSjShippingPriceDAOImpl implements TSjShippingPriceDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSjShippingPriceDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSjShippingPrice getShippingPriceById(int id) {
		String queryString = "from TSjShippingPrice shippingPrice where shippingPrice.sjShippingPriceId = :id";
		TSjShippingPrice shippingPrice = new TSjShippingPrice();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		shippingPrice = (TSjShippingPrice) query.uniqueResult();
		return shippingPrice;
	}

	@Override
	public TSjShippingPrice getShippingPriceByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSjShippingPrice shippingPrice where shippingPrice.sjShippingPriceId like CONCAT('%',:name,'%')";
//		TSjShippingPrice shippingPrice = new TSjShippingPrice();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		shippingPrice = (TSjShippingPrice) query.uniqueResult();
//		return shippingPrice;
	}

	@Override
	public List<TSjShippingPrice> getShippingPriceList() {
		String queryString = "from TSjShippingPrice";
		List<TSjShippingPrice> shippingPriceList = new ArrayList<TSjShippingPrice>();
		query = session.createQuery(queryString);
		shippingPriceList = (List<TSjShippingPrice>)query.list();
		return shippingPriceList;
	}

	@Override
	public void save(TSjShippingPrice shippingPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSjShippingPrice shippingPrice) {
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
