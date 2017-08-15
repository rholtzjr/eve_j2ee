package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TS8swcatDAO;
import org.holtz.eve.jpa.entity.TS8swcat;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TS8swcat;

public class TS8swcatDAOImpl implements TS8swcatDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TS8swcatDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TS8swcat getSwcatById(int id) {
		String queryString = "from TS8swcat swcat where swcat.id = :id";
		TS8swcat swcat = new TS8swcat();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		swcat = (TS8swcat) query.uniqueResult();
		return swcat;
	}

	@Override
	public TS8swcat getSwcatByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TS8swcat swcat where swcat.id like CONCAT('%',:name,'%')";
//		TS8swcat swcat = new TS8swcat();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		swcat = (TS8swcat) query.uniqueResult();
//		return swcat;
	}

	@Override
	public List<TS8swcat> getSwcatList() {
		String queryString = "from TS8swcat";
		List<TS8swcat> swcatList = new ArrayList<TS8swcat>();
		query = session.createQuery(queryString);
		swcatList = (List<TS8swcat>)query.list();
		return swcatList;
	}

	@Override
	public void save(TS8swcat swcat) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TS8swcat swcat) {
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
