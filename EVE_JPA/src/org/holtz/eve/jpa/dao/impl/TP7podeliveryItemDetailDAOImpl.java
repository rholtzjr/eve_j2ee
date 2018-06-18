package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TP7podeliveryItemDetailDAO;
import org.holtz.eve.jpa.entity.TP7podeliveryItemDetail;
import org.holtz.jpa.util.HibernateUtil;

public class TP7podeliveryItemDetailDAOImpl implements TP7podeliveryItemDetailDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TP7podeliveryItemDetailDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TP7podeliveryItemDetail getPodeliveryItemDetailById(int id) {
		String queryString = "from TP7podeliveryItemDetail podeliveryItemDetail where podeliveryItemDetail.p7podeliveryItemDetailId = :id";
		TP7podeliveryItemDetail podeliveryItemDetail = new TP7podeliveryItemDetail();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		podeliveryItemDetail = (TP7podeliveryItemDetail) query.uniqueResult();
		return podeliveryItemDetail;
	}

	@Override
	public TP7podeliveryItemDetail getPodeliveryItemDetailByName(String name) {
		String queryString = "from TP7podeliveryItemDetail podeliveryItemDetail where podeliveryItemDetail.p7notesTxN like CONCAT('%',:name,'%')";
		TP7podeliveryItemDetail podeliveryItemDetail = new TP7podeliveryItemDetail();
		query = session.createQuery(queryString);
		query.setString("name", name);
		podeliveryItemDetail = (TP7podeliveryItemDetail) query.uniqueResult();
		return podeliveryItemDetail;
	}

	@Override
	public List<TP7podeliveryItemDetail> getPodeliveryItemDetailList() {
		String queryString = "from TP7podeliveryItemDetail";
		List<TP7podeliveryItemDetail> podeliveryItemDetailList = new ArrayList<TP7podeliveryItemDetail>();
		query = session.createQuery(queryString);
		podeliveryItemDetailList = (List<TP7podeliveryItemDetail>)query.list();
		return podeliveryItemDetailList;
	}

	@Override
	public void save(TP7podeliveryItemDetail podeliveryItemDetail) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TP7podeliveryItemDetail podeliveryItemDetail) {
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
