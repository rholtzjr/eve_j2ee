package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRpretailPriceDAO;
import org.holtz.eve.jpa.entity.TRpretailPrice;
import org.holtz.jpa.util.HibernateUtil;

public class TRpretailPriceDAOImpl implements TRpretailPriceDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRpretailPriceDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRpretailPrice getRetailPriceById(int id) {
		String queryString = "from TRpretailPrice retailPrice where retailPrice.rpretailPriceId = :id";
		TRpretailPrice retailPrice = new TRpretailPrice();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		retailPrice = (TRpretailPrice) query.uniqueResult();
		return retailPrice;
	}

	@Override
	public TRpretailPrice getRetailPriceByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TRpretailPrice retailPrice where retailPrice.rpretailPriceId like CONCAT('%',:name,'%')";
//		TRpretailPrice retailPrice = new TRpretailPrice();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		retailPrice = (TRpretailPrice) query.uniqueResult();
//		return retailPrice;
	}

	@Override
	public List<TRpretailPrice> getRetailPriceList() {
		String queryString = "from TRpretailPrice";
		List<TRpretailPrice> retailPriceList = new ArrayList<TRpretailPrice>();
		query = session.createQuery(queryString);
		retailPriceList = (List<TRpretailPrice>)query.list();
		return retailPriceList;
	}

	@Override
	public void save(TRpretailPrice retailPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRpretailPrice retailPrice) {
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
