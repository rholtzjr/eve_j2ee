package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRqqtyBandDAO;
import org.holtz.eve.jpa.entity.TRqqtyBand;
import org.holtz.jpa.util.HibernateUtil;

public class TRqqtyBandDAOImpl implements TRqqtyBandDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRqqtyBandDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRqqtyBand getQtyBandById(int id) {
		String queryString = "from TRqqtyBand qtyBand where qtyBand.rqqtyBandId = :id";
		TRqqtyBand qtyBand = new TRqqtyBand();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		qtyBand = (TRqqtyBand) query.uniqueResult();
		return qtyBand;
	}

	@Override
	public TRqqtyBand getQtyBandByName(String name) {
		String queryString = "from TRqqtyBand qtyBand where qtyBand.rqnotesTxN like CONCAT('%',:name,'%')";
		TRqqtyBand qtyBand = new TRqqtyBand();
		query = session.createQuery(queryString);
		query.setString("name", name);
		qtyBand = (TRqqtyBand) query.uniqueResult();
		return qtyBand;
	}

	@Override
	public List<TRqqtyBand> getQtyBandList() {
		String queryString = "from TRqqtyBand";
		List<TRqqtyBand> qtyBandList = new ArrayList<TRqqtyBand>();
		query = session.createQuery(queryString);
		qtyBandList = (List<TRqqtyBand>)query.list();
		return qtyBandList;
	}

	@Override
	public void save(TRqqtyBand qtyBand) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRqqtyBand qtyBand) {
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
