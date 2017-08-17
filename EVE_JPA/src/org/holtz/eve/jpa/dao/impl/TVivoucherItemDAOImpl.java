package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TVivoucherItemDAO;
import org.holtz.eve.jpa.entity.TVivoucherItem;
import org.holtz.jpa.util.HibernateUtil;

public class TVivoucherItemDAOImpl implements TVivoucherItemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TVivoucherItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TVivoucherItem getVoucherItemById(int id) {
		String queryString = "from TVivoucherItem voucherItem where voucherItem.vivoucherItemId = :id";
		TVivoucherItem voucherItem = new TVivoucherItem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		voucherItem = (TVivoucherItem) query.uniqueResult();
		return voucherItem;
	}

	@Override
	public TVivoucherItem getVoucherItemByName(String name) {//
		//NOOP
		return null;
//		String queryString = "from TVivoucherItem voucherItem where voucherItem.vivoucherItemId like CONCAT('%',:name,'%')";
//		TVivoucherItem voucherItem = new TVivoucherItem();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		voucherItem = (TVivoucherItem) query.uniqueResult();
//		return voucherItem;
	}

	@Override
	public List<TVivoucherItem> getVoucherItemList() {
		String queryString = "from TVivoucherItem";
		List<TVivoucherItem> voucherItemList = new ArrayList<TVivoucherItem>();
		query = session.createQuery(queryString);
		voucherItemList = (List<TVivoucherItem>)query.list();
		return voucherItemList;
	}

	@Override
	public void save(TVivoucherItem voucherItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TVivoucherItem voucherItem) {
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
