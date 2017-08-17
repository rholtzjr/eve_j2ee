package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.VrandNumberDAO;
import org.holtz.eve.jpa.entity.VrandNumber;
import org.holtz.jpa.util.HibernateUtil;

public class VrandNumberDAOImpl implements VrandNumberDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public VrandNumberDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public VrandNumber getVrandNumberById(int id) {
		String queryString = "from VrandNumber vrandNumber where vrandNumber.randNumber = :id";
		VrandNumber vrandNumber = new VrandNumber();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		vrandNumber = (VrandNumber) query.uniqueResult();
		return vrandNumber;
	}

	@Override
	public VrandNumber getVrandNumberByName(String name) {
		//NOOP
		return null;
//		String queryString = "from VrandNumber vrandNumber where vrandNumber.randNumber like CONCAT('%',:name,'%')";
//		VrandNumber vrandNumber = new VrandNumber();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		vrandNumber = (VrandNumber) query.uniqueResult();
//		return vrandNumber;
	}

	@Override
	public List<VrandNumber> getVrandNumberList() {
		String queryString = "from VrandNumber";
		List<VrandNumber> vrandNumberList = new ArrayList<VrandNumber>();
		query = session.createQuery(queryString);
		vrandNumberList = (List<VrandNumber>)query.list();
		return vrandNumberList;
	}

	@Override
	public void save(VrandNumber vrandNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(VrandNumber vrandNumber) {
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
