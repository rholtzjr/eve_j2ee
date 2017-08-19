package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEkEmpClockInDAO;
import org.holtz.eve.jpa.entity.TEkEmpClockIn;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TEkEmpClockIn;

public class TEkEmpClockInDAOImpl implements TEkEmpClockInDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEkEmpClockInDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEkEmpClockIn getEmpClockInById(int id) {
		String queryString = "from TEkEmpClockIn empClockIn where empClockIn.ekEmpClockInId = :id";
		TEkEmpClockIn empClockIn = new TEkEmpClockIn();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		empClockIn = (TEkEmpClockIn) query.uniqueResult();
		return empClockIn;
	}

	@Override
	public TEkEmpClockIn getEmpClockInByName(String name) {
		String queryString = "from TEkEmpClockIn empClockIn where empClockIn.acAccountNameTx like CONCAT('%',:name,'%')";
		TEkEmpClockIn empClockIn = new TEkEmpClockIn();
		query = session.createQuery(queryString);
		query.setString("name", name);
		empClockIn = (TEkEmpClockIn) query.uniqueResult();
		return empClockIn;
	}

	@Override
	public List<TEkEmpClockIn> getEmpClockInList() {
		String queryString = "from TEkEmpClockIn";
		List<TEkEmpClockIn> empClockInList = new ArrayList<TEkEmpClockIn>();
		query = session.createQuery(queryString);
		empClockInList = (List<TEkEmpClockIn>)query.list();
		return empClockInList;
	}

	@Override
	public void save(TEkEmpClockIn empClockIn) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEkEmpClockIn empClockIn) {
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
