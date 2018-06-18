package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIeitemCommissionDAO;
import org.holtz.eve.jpa.entity.TIeitemCommission;
import org.holtz.jpa.util.HibernateUtil;

public class TIeitemCommissionDAOImpl implements TIeitemCommissionDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIeitemCommissionDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIeitemCommission getItemCommissionById(int id) {
		String queryString = "from TIeitemCommission itemCommission where itemCommission.id = :id";
		TIeitemCommission itemCommission = new TIeitemCommission();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		itemCommission = (TIeitemCommission) query.uniqueResult();
		return itemCommission;
	}

	@Override
	public TIeitemCommission getItemCommissionByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TIeitemCommission itemCommission where itemCommission.id like CONCAT('%',:name,'%')";
//		TIeitemCommission itemCommission = new TIeitemCommission();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		itemCommission = (TIeitemCommission) query.uniqueResult();
//		return itemCommission;
	}

	@Override
	public List<TIeitemCommission> getItemCommissionList() {
		String queryString = "from TIeitemCommission";
		List<TIeitemCommission> itemCommissionList = new ArrayList<TIeitemCommission>();
		query = session.createQuery(queryString);
		itemCommissionList = (List<TIeitemCommission>)query.list();
		return itemCommissionList;
	}

	@Override
	public void save(TIeitemCommission itemCommission) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIeitemCommission itemCommission) {
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
