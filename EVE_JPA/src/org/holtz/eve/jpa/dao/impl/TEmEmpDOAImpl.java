package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEmEmpDAO;
import org.holtz.eve.jpa.entity.TEmEmp;
import org.holtz.jpa.util.HibernateUtil;

public class TEmEmpDOAImpl implements TEmEmpDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEmEmpDOAImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEmEmp getEmEmpById(int id) {
		String queryString = "from TEmEmp emEmp where emEmp.emEmpId = :id";
		TEmEmp emEmp = new TEmEmp();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		emEmp = (TEmEmp) query.uniqueResult();
		return emEmp;
	}

	@Override
	public TEmEmp getEmEmpByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TEmEmp emEmp where emEmp.emInitialsTxN like CONCAT('%',:name,'%')";
//		TEmEmp emEmp = new TEmEmp();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		emEmp = (TEmEmp) query.uniqueResult();
//		return emEmp;
	}

	@Override
	public List<TEmEmp> getEmEmpList() {
		String queryString = "from TEmEmp";
		List<TEmEmp> emEmpList = new ArrayList<TEmEmp>();
		query = session.createQuery(queryString);
		emEmpList = (List<TEmEmp>)query.list();
		return emEmpList;
	}

	@Override
	public void save(TEmEmp emEmp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEmEmp emEmp) {
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
