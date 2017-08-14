package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TOcoptionalColDAO;
import org.holtz.eve.jpa.entity.TOcoptionalCol;
import org.holtz.jpa.util.HibernateUtil;

public class TOcoptionalColDAOImpl implements TOcoptionalColDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TOcoptionalColDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TOcoptionalCol getOptionalColById(int id) {
		String queryString = "from TOcoptionalCol optionalCol where optionalCol.ocoptionalColId = :id";
		TOcoptionalCol optionalCol = new TOcoptionalCol();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		optionalCol = (TOcoptionalCol) query.uniqueResult();
		return optionalCol;
	}

	@Override
	public TOcoptionalCol getOptionalColByName(String name) {
		String queryString = "from TOcoptionalCol optionalCol where optionalCol.ocoptionalColTx like CONCAT('%',:name,'%')";
		TOcoptionalCol optionalCol = new TOcoptionalCol();
		query = session.createQuery(queryString);
		query.setString("name", name);
		optionalCol = (TOcoptionalCol) query.uniqueResult();
		return optionalCol;
	}

	@Override
	public List<TOcoptionalCol> getOptionalColList() {
		String queryString = "from TOcoptionalCol";
		List<TOcoptionalCol> optionalColList = new ArrayList<TOcoptionalCol>();
		query = session.createQuery(queryString);
		optionalColList = (List<TOcoptionalCol>)query.list();
		return optionalColList;
	}

	@Override
	public void save(TOcoptionalCol optionalCol) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TOcoptionalCol optionalCol) {
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
