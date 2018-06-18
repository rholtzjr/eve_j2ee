package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCeCostPriceDAO;
import org.holtz.eve.jpa.entity.TCeCostPrice;
import org.holtz.jpa.util.HibernateUtil;

public class TCeCostPriceDAOImpl implements TCeCostPriceDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCeCostPriceDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCeCostPrice getCostPriceById(int id) {
		String queryString = "from TCeCostPrice costprice where costprice.id = :id";
		TCeCostPrice costPrice = new TCeCostPrice();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		costPrice = (TCeCostPrice) query.uniqueResult();
		return costPrice;
	}

	@Override
	public TCeCostPrice getCostPriceByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TCeCostPrice costprice where costprice.id like CONCAT('%',:name,'%')";
//		TCeCostPrice costPrice = new TCeCostPrice();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		costPrice = (TCeCostPrice) query.uniqueResult();
//		return costPrice;
	}

	@Override
	public List<TCeCostPrice> getCostPriceList() {
		String queryString = "from TCeCostPrice";
		List<TCeCostPrice> costPriceList = new ArrayList<TCeCostPrice>();
		query = session.createQuery(queryString);
		costPriceList = (List<TCeCostPrice>)query.list();
		return costPriceList;
	}

	@Override
	public void save(TCeCostPrice costPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCeCostPrice costPrice) {
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
