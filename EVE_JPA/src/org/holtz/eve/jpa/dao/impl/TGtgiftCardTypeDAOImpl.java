package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TGtgiftCardTypeDAO;
import org.holtz.eve.jpa.entity.TGtgiftCardType;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TGtgiftCardType;

public class TGtgiftCardTypeDAOImpl implements TGtgiftCardTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TGtgiftCardTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TGtgiftCardType getGiftCardTypeById(int id) {
		String queryString = "from TGtgiftCardType giftCardType where giftCardType.gtgiftCardTypeId = :id";
		TGtgiftCardType giftCardType = new TGtgiftCardType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		giftCardType = (TGtgiftCardType) query.uniqueResult();
		return giftCardType;
	}

	@Override
	public TGtgiftCardType getGiftCardTypeByName(String name) {
		String queryString = "from TGtgiftCardType giftCardType where giftCardType.gtgiftCardTypeTx like CONCAT('%',:name,'%')";
		TGtgiftCardType giftCardType = new TGtgiftCardType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		giftCardType = (TGtgiftCardType) query.uniqueResult();
		return giftCardType;
	}

	@Override
	public List<TGtgiftCardType> getGiftCardTypeList() {
		String queryString = "from TGtgiftCardType";
		List<TGtgiftCardType> giftCardTypeList = new ArrayList<TGtgiftCardType>();
		query = session.createQuery(queryString);
		giftCardTypeList = (List<TGtgiftCardType>)query.list();
		return giftCardTypeList;
	}

	@Override
	public void save(TGtgiftCardType giftCardType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TGtgiftCardType giftCardType) {
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
