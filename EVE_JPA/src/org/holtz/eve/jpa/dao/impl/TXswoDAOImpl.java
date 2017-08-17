package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TXswoDAO;
import org.holtz.eve.jpa.entity.TXswo;
import org.holtz.jpa.util.HibernateUtil;

public class TXswoDAOImpl implements TXswoDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TXswoDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TXswo getWoById(int id) {
		String queryString = "from TXswo wo where wo.workOrderNumber = :id";
		TXswo wo = new TXswo();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		wo = (TXswo) query.uniqueResult();
		return wo;
	}

	@Override
	public TXswo getWoByName(String name) {
		String queryString = "from TXswo wo where wo.customerName like CONCAT('%',:name,'%')";
		TXswo wo = new TXswo();
		query = session.createQuery(queryString);
		query.setString("name", name);
		wo = (TXswo) query.uniqueResult();
		return wo;
	}

	@Override
	public List<TXswo> getWoList() {
		String queryString = "from TXswo";
		List<TXswo> woList = new ArrayList<TXswo>();
		query = session.createQuery(queryString);
		woList = (List<TXswo>)query.list();
		return woList;
	}

	@Override
	public void save(TXswo wo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TXswo wo) {
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
