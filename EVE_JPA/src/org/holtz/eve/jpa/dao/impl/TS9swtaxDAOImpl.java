package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TS9swtaxDAO;
import org.holtz.eve.jpa.entity.TS9swtax;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TS9swtax;

public class TS9swtaxDAOImpl implements TS9swtaxDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TS9swtaxDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TS9swtax getSwtaxById(int id) {
		String queryString = "from TS9swtax swtax where swtax.id = :id";
		TS9swtax swtax = new TS9swtax();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		swtax = (TS9swtax) query.uniqueResult();
		return swtax;
	}

	@Override
	public TS9swtax getSwtaxByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TS9swtax swtax where swtax.id like CONCAT('%',:name,'%')";
//		TS9swtax swtax = new TS9swtax();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		swtax = (TS9swtax) query.uniqueResult();
//		return swtax;
	}

	@Override
	public List<TS9swtax> getSwtaxList() {
		String queryString = "from TS9swtax";
		List<TS9swtax> swtaxList = new ArrayList<TS9swtax>();
		query = session.createQuery(queryString);
		swtaxList = (List<TS9swtax>)query.list();
		return swtaxList;
	}

	@Override
	public void save(TS9swtax swtax) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TS9swtax swtax) {
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
