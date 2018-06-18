package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCuCustDAO;
import org.holtz.eve.jpa.entity.TCuCust;
import org.holtz.jpa.util.HibernateUtil;

public class TCuCustDAOImpl implements TCuCustDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCuCustDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCuCust getCustById(int id) {
		String queryString = "from TCuCust cust where cust.cuCustId = :id";
		TCuCust cust = new TCuCust();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		cust = (TCuCust) query.uniqueResult();
		return cust;
	}

	@Override
	public TCuCust getCustByName(String name) {
		String queryString = "from TCuCust cust where cust.cuUserNameTxN like CONCAT('%',:name,'%')";
		TCuCust cust = new TCuCust();
		query = session.createQuery(queryString);
		query.setString("name", name);
		cust = (TCuCust) query.uniqueResult();
		return cust;
	}

	@Override
	public List<TCuCust> getCustList() {
		String queryString = "from TCuCust";
		List<TCuCust> custList = new ArrayList<TCuCust>();
		query = session.createQuery(queryString);
		custList = (List<TCuCust>)query.list();
		return custList;
	}

	@Override
	public void save(TCuCust cust) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCuCust cust) {
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
