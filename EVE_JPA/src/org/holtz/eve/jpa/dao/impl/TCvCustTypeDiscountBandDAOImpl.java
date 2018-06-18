package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCvCustTypeDiscountBandDAO;
import org.holtz.eve.jpa.entity.TCvCustTypeDiscountBand;
import org.holtz.jpa.util.HibernateUtil;

public class TCvCustTypeDiscountBandDAOImpl implements TCvCustTypeDiscountBandDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCvCustTypeDiscountBandDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCvCustTypeDiscountBand getCustTypeDiscountBandById(int id) {
		String queryString = "from TCvCustTypeDiscountBand ctdb where ctdb.id = :id";
		TCvCustTypeDiscountBand ctdb = new TCvCustTypeDiscountBand();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		ctdb = (TCvCustTypeDiscountBand) query.uniqueResult();
		return ctdb;
	}

	@Override
	public TCvCustTypeDiscountBand getCustTypeDiscountBandByName(String name) {
		//NOOP
		return null;
		//		String queryString = "from TCvCustTypeDiscountBand ctdb where ctdb.TDbdiscountBand like CONCAT('%',:name,'%')";
//		TCvCustTypeDiscountBand ctdb = new TCvCustTypeDiscountBand();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		ctdb = (TCvCustTypeDiscountBand) query.uniqueResult();
//		return ctdb;
	}

	@Override
	public List<TCvCustTypeDiscountBand> getCustTypeDiscountBandList() {
		String queryString = "from TCvCustTypeDiscountBand";
		List<TCvCustTypeDiscountBand> ctdbList = new ArrayList<TCvCustTypeDiscountBand>();
		query = session.createQuery(queryString);
		ctdbList = (List<TCvCustTypeDiscountBand>)query.list();
		return ctdbList;
	}

	@Override
	public void save(TCvCustTypeDiscountBand ctdb) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCvCustTypeDiscountBand ctdb) {
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
