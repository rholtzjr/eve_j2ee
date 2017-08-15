package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TS5stockTypeRentalPriceDAO;
import org.holtz.eve.jpa.entity.TS5stockTypeRentalPrice;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TS5stockTypeRentalPrice;

public class TS5stockTypeRentalPriceDAOImpl implements TS5stockTypeRentalPriceDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TS5stockTypeRentalPriceDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TS5stockTypeRentalPrice getStockTypeRentalPriceById(int id) {
		String queryString = "from TS5stockTypeRentalPrice stockTypeRentalPrice where stockTypeRentalPrice.s5stockTypeRentalPriceId = :id";
		TS5stockTypeRentalPrice stockTypeRentalPrice = new TS5stockTypeRentalPrice();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		stockTypeRentalPrice = (TS5stockTypeRentalPrice) query.uniqueResult();
		return stockTypeRentalPrice;
	}

	@Override
	public TS5stockTypeRentalPrice getStockTypeRentalPriceByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TS5stockTypeRentalPrice stockTypeRentalPrice where stockTypeRentalPrice.s5stockTypeRentalPriceId like CONCAT('%',:name,'%')";
//		TS5stockTypeRentalPrice stockTypeRentalPrice = new TS5stockTypeRentalPrice();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		stockTypeRentalPrice = (TS5stockTypeRentalPrice) query.uniqueResult();
//		return stockTypeRentalPrice;
	}

	@Override
	public List<TS5stockTypeRentalPrice> getStockTypeRentalPriceList() {
		String queryString = "from TS5stockTypeRentalPrice";
		List<TS5stockTypeRentalPrice> stockTypeRentalPriceList = new ArrayList<TS5stockTypeRentalPrice>();
		query = session.createQuery(queryString);
		stockTypeRentalPriceList = (List<TS5stockTypeRentalPrice>)query.list();
		return stockTypeRentalPriceList;
	}

	@Override
	public void save(TS5stockTypeRentalPrice stockTypeRentalPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TS5stockTypeRentalPrice stockTypeRentalPrice) {
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
