package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TS0stockClubDAO;
import org.holtz.eve.jpa.entity.TS0stockClub;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TS0stockClub;

public class TS0stockClubDAOImpl implements TS0stockClubDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TS0stockClubDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TS0stockClub getStockClubById(int id) {
		String queryString = "from TS0stockClub stockClub where stockClub.s0stockItemId = :id";
		TS0stockClub stockClub = new TS0stockClub();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		stockClub = (TS0stockClub) query.uniqueResult();
		return stockClub;
	}

	@Override
	public TS0stockClub getStockClubByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TS0stockClub stockClub where stockClub.s0stockItemId like CONCAT('%',:name,'%')";
//		TS0stockClub stockClub = new TS0stockClub();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		stockClub = (TS0stockClub) query.uniqueResult();
//		return stockClub;
	}

	@Override
	public List<TS0stockClub> getStockClubList() {
		String queryString = "from TS0stockClub";
		List<TS0stockClub> stockClubList = new ArrayList<TS0stockClub>();
		query = session.createQuery(queryString);
		stockClubList = (List<TS0stockClub>)query.list();
		return stockClubList;
	}

	@Override
	public void save(TS0stockClub stockClub) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TS0stockClub stockClub) {
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
