package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TS1salesSearchDAO;
import org.holtz.eve.jpa.entity.TS1salesSearch;
import org.holtz.jpa.util.HibernateUtil;

public class TS1salesSearchDAOImpl implements TS1salesSearchDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TS1salesSearchDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TS1salesSearch getSalesSearchById(int id) {
		String queryString = "from TS1salesSearch salesSearch where salesSearch.s1salesSearchId = :id";
		TS1salesSearch salesSearch = new TS1salesSearch();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		salesSearch = (TS1salesSearch) query.uniqueResult();
		return salesSearch;
	}

	@Override
	public TS1salesSearch getSalesSearchByName(String name) {
		String queryString = "from TS1salesSearch salesSearch where salesSearch.s1stockNoTxN like CONCAT('%',:name,'%')";
		TS1salesSearch salesSearch = new TS1salesSearch();
		query = session.createQuery(queryString);
		query.setString("name", name);
		salesSearch = (TS1salesSearch) query.uniqueResult();
		return salesSearch;
	}

	@Override
	public List<TS1salesSearch> getSalesSearchList() {
		String queryString = "from TS1salesSearch";
		List<TS1salesSearch> salesSearchList = new ArrayList<TS1salesSearch>();
		query = session.createQuery(queryString);
		salesSearchList = (List<TS1salesSearch>)query.list();
		return salesSearchList;
	}

	@Override
	public void save(TS1salesSearch salesSearch) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TS1salesSearch salesSearch) {
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
