package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEheolheaderDAO;
import org.holtz.eve.jpa.entity.TEheolheader;
import org.holtz.eve.jpa.entity.TEheolheader;

public class TEheolheaderDAOImpl implements TEheolheaderDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEheolheaderDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEheolheader getEolHeaderById(int id) {
		String queryString = "from TEheolheader eolheader where eolheader.eheolheaderId = :id";
		TEheolheader eolheader = new TEheolheader();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		eolheader = (TEheolheader) query.uniqueResult();
		return eolheader;
	}

	@Override
	public TEheolheader getEolHeaderByName(String name) {
		String queryString = "from TEheolheader eolheader where eolheader.eheolheaderTx like CONCAT('%',:name,'%')";
		TEheolheader eolheader = new TEheolheader();
		query = session.createQuery(queryString);
		query.setString("name", name);
		eolheader = (TEheolheader) query.uniqueResult();
		return eolheader;
	}

	@Override
	public List<TEheolheader> getEolHeaderList() {
		String queryString = "from TEheolheader";
		List<TEheolheader> eolheaderList = new ArrayList<TEheolheader>();
		query = session.createQuery(queryString);
		eolheaderList = (List<TEheolheader>)query.list();
		return eolheaderList;
	}

	@Override
	public void save(TEheolheader eolHeader) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEheolheader eolHeader) {
		// TODO Auto-generated method stub

	}

	public SessionFactory getSessionFactory() {
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
