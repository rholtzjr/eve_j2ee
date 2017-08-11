package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDbdiscountBandDAO;
import org.holtz.eve.jpa.entity.TDbdiscountBand;
import org.holtz.eve.jpa.entity.TDbdiscountBand;
import org.holtz.jpa.util.HibernateUtil;

public class TDbdiscountBandDAOImpl implements TDbdiscountBandDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDbdiscountBandDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDbdiscountBand getDiscountBandById(int id) {
		String queryString = "from TDbdiscountBand discountBand where discountBand.dbdiscountBandId = :id";
		TDbdiscountBand discountBand = new TDbdiscountBand();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		discountBand = (TDbdiscountBand) query.uniqueResult();
		return discountBand;
	}

	@Override
	public TDbdiscountBand getDiscountBandByName(String name) {
		String queryString = "from TDbdiscountBand discountBand where discountBand.dbdiscountBandTx like CONCAT('%',:name,'%')";
		TDbdiscountBand discountBand = new TDbdiscountBand();
		query = session.createQuery(queryString);
		query.setString("name", name);
		discountBand = (TDbdiscountBand) query.uniqueResult();
		return discountBand;
	}

	@Override
	public List<TDbdiscountBand> getDiscountBandList() {
		String queryString = "from TDbdiscountBand";
		List<TDbdiscountBand> discountBandList = new ArrayList<TDbdiscountBand>();
		query = session.createQuery(queryString);
		discountBandList = (List<TDbdiscountBand>)query.list();
		return discountBandList;
	}

	@Override
	public void save(TDbdiscountBand discountBand) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDbdiscountBand discountBand) {
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
