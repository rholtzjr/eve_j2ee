package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEzSizeDAO;
import org.holtz.eve.jpa.entity.TEzSize;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TEzSize;

public class TEzSizeDAOImpl implements TEzSizeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEzSizeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEzSize getSizeById(int id) {
		String queryString = "from TEzSize size where size.ezSizeId = :id";
		TEzSize size = new TEzSize();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		size = (TEzSize) query.uniqueResult();
		return size;
	}

	@Override
	public TEzSize getSizeByName(String name) {
		String queryString = "from TEzSize size where size.ezSizeTx like CONCAT('%',:name,'%')";
		TEzSize size = new TEzSize();
		query = session.createQuery(queryString);
		query.setString("name", name);
		size = (TEzSize) query.uniqueResult();
		return size;
	}

	@Override
	public List<TEzSize> getSizeList() {
		String queryString = "from TEzSize";
		List<TEzSize> sizeList = new ArrayList<TEzSize>();
		query = session.createQuery(queryString);
		sizeList = (List<TEzSize>)query.list();
		return sizeList;
	}

	@Override
	public void save(TEzSize size) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEzSize size) {
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
