package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.Tables1DAO;
import org.holtz.eve.jpa.entity.Tables1;
import org.holtz.jpa.util.HibernateUtil;

public class Tables1DAOImpl implements Tables1DAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public Tables1DAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public Tables1 getTables1ById(int id) {
		String queryString = "from Tables1 tables1 where tables1.id = :id";
		Tables1 tables1 = new Tables1();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		tables1 = (Tables1) query.uniqueResult();
		return tables1;
	}

	@Override
	public Tables1 getTables1ByName(String name) {
		
		//NOOP
		return null;
//		String queryString = "from Tables1 tables1 where tables1.id like CONCAT('%',:name,'%')";
//		Tables1 tables1 = new Tables1();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		tables1 = (Tables1) query.uniqueResult();
//		return tables1;
	}

	@Override
	public List<Tables1> getTables1List() {
		String queryString = "from Tables1";
		List<Tables1> tables1List = new ArrayList<Tables1>();
		query = session.createQuery(queryString);
		tables1List = (List<Tables1>)query.list();
		return tables1List;
	}

	@Override
	public void save(Tables1 tables1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Tables1 tables1) {
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
