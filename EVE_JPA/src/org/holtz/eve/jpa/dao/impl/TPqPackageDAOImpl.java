package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPqPackageDAO;
import org.holtz.eve.jpa.entity.TPqPackage;
import org.holtz.jpa.util.HibernateUtil;

public class TPqPackageDAOImpl implements TPqPackageDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPqPackageDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPqPackage getPackageById(int id) {
		String queryString = "from TPqPackage tpqpackage where tpqpackage.pqPackageId = :id";
		TPqPackage tpqpackage = new TPqPackage();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		tpqpackage = (TPqPackage) query.uniqueResult();
		return tpqpackage;
	}

	@Override
	public TPqPackage getPackageByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TPqPackage tpqpackage where tpqpackage.pqPackageId like CONCAT('%',:name,'%')";
//		TPqPackage tpqpackage = new TPqPackage();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		tpqpackage = (TPqPackage) query.uniqueResult();
//		return tpqpackage;
	}

	@Override
	public List<TPqPackage> getPackageList() {
		String queryString = "from TPqPackage";
		List<TPqPackage> tpqpackageList = new ArrayList<TPqPackage>();
		query = session.createQuery(queryString);
		tpqpackageList = (List<TPqPackage>)query.list();
		return tpqpackageList;
	}

	@Override
	public void save(TPqPackage tpqpackage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPqPackage tpqpackage) {
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
