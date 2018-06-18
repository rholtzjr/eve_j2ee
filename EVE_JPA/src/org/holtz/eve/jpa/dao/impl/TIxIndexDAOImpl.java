package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIxIndexDAO;
import org.holtz.eve.jpa.entity.TIxIndex;
import org.holtz.jpa.util.HibernateUtil;

public class TIxIndexDAOImpl implements TIxIndexDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIxIndexDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIxIndex getIndexById(int id) {
		String queryString = "from TIxIndex index where index.id = :id";
		TIxIndex index = new TIxIndex();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		index = (TIxIndex) query.uniqueResult();
		return index;
	}

	@Override
	public TIxIndex getIndexByName(String name) {
		String queryString = "from TIxIndex index where index.ixIndexTx like CONCAT('%',:name,'%')";
		TIxIndex index = new TIxIndex();
		query = session.createQuery(queryString);
		query.setString("name", name);
		index = (TIxIndex) query.uniqueResult();
		return index;
	}

	@Override
	public List<TIxIndex> getIndexList() {
		String queryString = "from TIxIndex";
		List<TIxIndex> indexList = new ArrayList<TIxIndex>();
		query = session.createQuery(queryString);
		indexList = (List<TIxIndex>)query.list();
		return indexList;
	}

	@Override
	public void save(TIxIndex index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIxIndex index) {
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
