package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPgPackageDAO;
import org.holtz.eve.jpa.entity.TPgPackage;
import org.holtz.jpa.util.HibernateUtil;

public class TPgPackageDAOImpl implements TPgPackageDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPgPackageDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPgPackage getPackageById(int id) {
		String queryString = "from TPgPackage tpgpackage where tpgpackage.pgPackageId = :id";
		TPgPackage tpgpackage = new TPgPackage();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		tpgpackage = (TPgPackage) query.uniqueResult();
		return tpgpackage;
	}

	@Override
	public TPgPackage getPackageByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TPgPackage tpgpackage where tpgpackage.pgPackageId like CONCAT('%',:name,'%')";
//		TPgPackage tpgpackage = new TPgPackage();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		tpgpackage = (TPgPackage) query.uniqueResult();
//		return tpgpackage;
	}

	@Override
	public List<TPgPackage> getPackageList() {
		String queryString = "from TPgPackage";
		List<TPgPackage> tpgpackageList = new ArrayList<TPgPackage>();
		query = session.createQuery(queryString);
		tpgpackageList = (List<TPgPackage>)query.list();
		return tpgpackageList;
	}

	@Override
	public void save(TPgPackage tpgpackage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPgPackage tpgpackage) {
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
