package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TS2salesSearchColDAO;
import org.holtz.eve.jpa.entity.TS2salesSearchCol;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TS2salesSearchCol;

public class TS2salesSearchColDAOImpl implements TS2salesSearchColDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TS2salesSearchColDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TS2salesSearchCol getSalesSearchColById(int id) {
		String queryString = "from TS2salesSearchCol salesSearchCol where salesSearchCol.id = :id";
		TS2salesSearchCol salesSearchCol = new TS2salesSearchCol();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		salesSearchCol = (TS2salesSearchCol) query.uniqueResult();
		return salesSearchCol;
	}

	@Override
	public TS2salesSearchCol getSalesSearchColByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TS2salesSearchCol salesSearchCol where salesSearchCol.id like CONCAT('%',:name,'%')";
//		TS2salesSearchCol salesSearchCol = new TS2salesSearchCol();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		salesSearchCol = (TS2salesSearchCol) query.uniqueResult();
//		return salesSearchCol;
	}

	@Override
	public List<TS2salesSearchCol> getSalesSearchColList() {
		String queryString = "from TS2salesSearchCol";
		List<TS2salesSearchCol> salesSearchColList = new ArrayList<TS2salesSearchCol>();
		query = session.createQuery(queryString);
		salesSearchColList = (List<TS2salesSearchCol>)query.list();
		return salesSearchColList;
	}

	@Override
	public void save(TS2salesSearchCol salesSearchCol) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TS2salesSearchCol salesSearchCol) {
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
