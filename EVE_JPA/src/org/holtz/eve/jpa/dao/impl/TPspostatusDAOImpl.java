package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPspostatusDAO;
import org.holtz.eve.jpa.entity.TPspostatus;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TPspostatus;

public class TPspostatusDAOImpl implements TPspostatusDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPspostatusDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPspostatus getPostatusById(int id) {
		String queryString = "from TPspostatus postatus where postatus.pspostatusId = :id";
		TPspostatus postatus = new TPspostatus();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		postatus = (TPspostatus) query.uniqueResult();
		return postatus;
	}

	@Override
	public TPspostatus getPostatusByName(String name) {
		String queryString = "from TPspostatus postatus where postatus.pspostatusTx like CONCAT('%',:name,'%')";
		TPspostatus postatus = new TPspostatus();
		query = session.createQuery(queryString);
		query.setString("name", name);
		postatus = (TPspostatus) query.uniqueResult();
		return postatus;
	}

	@Override
	public List<TPspostatus> getPostatusList() {
		String queryString = "from TPspostatus";
		List<TPspostatus> postatusList = new ArrayList<TPspostatus>();
		query = session.createQuery(queryString);
		postatusList = (List<TPspostatus>)query.list();
		return postatusList;
	}

	@Override
	public void save(TPspostatus postatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPspostatus postatus) {
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
