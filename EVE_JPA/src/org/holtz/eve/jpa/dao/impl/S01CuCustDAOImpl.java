package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.S01CuCustDAO;
import org.holtz.eve.jpa.entity.S01CuCust;
import org.holtz.eve.jpa.entity.S01CuCust;

public class S01CuCustDAOImpl implements S01CuCustDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public S01CuCustDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public S01CuCust getCuCustById(int id) {
		String queryString = "from S01CuCust cuCust where cuCust.id.cuCustId = :id";
		S01CuCust cuCust = new S01CuCust();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		cuCust = (S01CuCust) query.uniqueResult();
		return cuCust;
	}

	@Override
	public S01CuCust getCuCustByName(String name) {
		String queryString = "from S01CuCust cuCust where cuCust.id.cuCustNumberTxN like CONCAT('%',:name,'%')";
		S01CuCust cuCust = new S01CuCust();
		query = session.createQuery(queryString);
		query.setString("name", name);
		cuCust = (S01CuCust) query.uniqueResult();
		return cuCust;
	}

	@Override
	public List<S01CuCust> getCuCustList() {
		String queryString = "from S01CuCust";
		List<S01CuCust> cuCustList = new ArrayList<S01CuCust>();
		query = session.createQuery(queryString);
		cuCustList = (List<S01CuCust>)query.list();
		return cuCustList;
	}

	@Override
	public void save(S01CuCust cuCust) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(S01CuCust cuCust) {
		// TODO Auto-generated method stub

	}

	public SessionFactory getSessionFactory() {
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
