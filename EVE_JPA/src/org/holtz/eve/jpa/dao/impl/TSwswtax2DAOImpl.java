package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSwswtax2DAO;
import org.holtz.eve.jpa.entity.TSwswtax2;
import org.holtz.jpa.util.HibernateUtil;

public class TSwswtax2DAOImpl implements TSwswtax2DAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSwswtax2DAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSwswtax2 getSwtax2ById(int id) {
		String queryString = "from TSwswtax2 swtax2 where swtax2.id = :id";
		TSwswtax2 swtax2 = new TSwswtax2();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		swtax2 = (TSwswtax2) query.uniqueResult();
		return swtax2;
	}

	@Override
	public TSwswtax2 getSwtax2ByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSwswtax2 swtax2 where swtax2.id like CONCAT('%',:name,'%')";
//		TSwswtax2 swtax2 = new TSwswtax2();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		swtax2 = (TSwswtax2) query.uniqueResult();
//		return swtax2;
	}

	@Override
	public List<TSwswtax2> getSwtax2List() {
		String queryString = "from TSwswtax2";
		List<TSwswtax2> swtax2List = new ArrayList<TSwswtax2>();
		query = session.createQuery(queryString);
		swtax2List = (List<TSwswtax2>)query.list();
		return swtax2List;
	}

	@Override
	public void save(TSwswtax2 swtax2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSwswtax2 swtax2) {
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
