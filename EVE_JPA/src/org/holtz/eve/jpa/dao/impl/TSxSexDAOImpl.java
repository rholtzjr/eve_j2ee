package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSxSexDAO;
import org.holtz.eve.jpa.entity.TSxSex;
import org.holtz.jpa.util.HibernateUtil;

public class TSxSexDAOImpl implements TSxSexDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSxSexDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSxSex getSexById(int id) {
		String queryString = "from TSxSex sex where sex.sxSexId = :id";
		TSxSex sex = new TSxSex();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		sex = (TSxSex) query.uniqueResult();
		return sex;
	}

	@Override
	public TSxSex getSexByName(String name) {
		String queryString = "from TSxSex sex where sex.sxSexTx like CONCAT('%',:name,'%')";
		TSxSex sex = new TSxSex();
		query = session.createQuery(queryString);
		query.setString("name", name);
		sex = (TSxSex) query.uniqueResult();
		return sex;
	}

	@Override
	public List<TSxSex> getSexList() {
		String queryString = "from TSxSex";
		List<TSxSex> sexList = new ArrayList<TSxSex>();
		query = session.createQuery(queryString);
		sexList = (List<TSxSex>)query.list();
		return sexList;
	}

	@Override
	public void save(TSxSex sex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSxSex sex) {
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
