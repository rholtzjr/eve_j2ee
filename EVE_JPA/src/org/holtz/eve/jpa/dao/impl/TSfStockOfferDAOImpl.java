package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSfStockOfferDAO;
import org.holtz.eve.jpa.entity.TSfStockOffer;
import org.holtz.jpa.util.HibernateUtil;

public class TSfStockOfferDAOImpl implements TSfStockOfferDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSfStockOfferDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSfStockOffer getStockOfferById(int id) {
		String queryString = "from TSfStockOffer stockOffer where stockOffer.sfOfferId = :id";
		TSfStockOffer stockOffer = new TSfStockOffer();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		stockOffer = (TSfStockOffer) query.uniqueResult();
		return stockOffer;
	}

	@Override
	public TSfStockOffer getStockOfferByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSfStockOffer stockOffer where stockOffer.sfOfferId like CONCAT('%',:name,'%')";
//		TSfStockOffer stockOffer = new TSfStockOffer();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		stockOffer = (TSfStockOffer) query.uniqueResult();
//		return stockOffer;
	}

	@Override
	public List<TSfStockOffer> getStockOfferList() {
		String queryString = "from TSfStockOffer";
		List<TSfStockOffer> stockOfferList = new ArrayList<TSfStockOffer>();
		query = session.createQuery(queryString);
		stockOfferList = (List<TSfStockOffer>)query.list();
		return stockOfferList;
	}

	@Override
	public void save(TSfStockOffer stockOffer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSfStockOffer stockOffer) {
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
