package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPcpcDAO;
import org.holtz.eve.jpa.entity.TPcpc;
import org.holtz.jpa.util.HibernateUtil;

public class TPcpcDAOImpl implements TPcpcDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPcpcDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPcpc getPcById(int id) {
		String queryString = "from TPcpc tpcpc where tpcpc.pcid = :id";
		TPcpc tpcpc = new TPcpc();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		tpcpc = (TPcpc) query.uniqueResult();
		return tpcpc;
	}

	@Override
	public TPcpc getPcByName(String name) {
		String queryString = "from TPcpc tpcpc where tpcpc.pcnameTx like CONCAT('%',:name,'%')";
		TPcpc tpcpc = new TPcpc();
		query = session.createQuery(queryString);
		query.setString("name", name);
		tpcpc = (TPcpc) query.uniqueResult();
		return tpcpc;
	}

	@Override
	public List<TPcpc> getPcList() {
		String queryString = "from TPcpc";
		List<TPcpc> tpcpcList = new ArrayList<TPcpc>();
		query = session.createQuery(queryString);
		tpcpcList = (List<TPcpc>)query.list();
		return tpcpcList;
	}

	@Override
	public void save(TPcpc tpcpc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPcpc tpcpc) {
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
