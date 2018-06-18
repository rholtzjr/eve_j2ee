package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TGdGiftCardDAO;
import org.holtz.eve.jpa.entity.TGdGiftCard;
import org.holtz.jpa.util.HibernateUtil;

public class TGdGiftCardDAOImpl implements TGdGiftCardDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TGdGiftCardDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TGdGiftCard getGiftCardById(int id) {
		String queryString = "from TGdGiftCard giftCard where giftCard.gdGiftCardId = :id";
		TGdGiftCard giftCard = new TGdGiftCard();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		giftCard = (TGdGiftCard) query.uniqueResult();
		return giftCard;
	}

	@Override
	public TGdGiftCard getGiftCardByName(String name) {
		String queryString = "from TGdGiftCard giftCard where giftCard.gdGiftCardNoTx like CONCAT('%',:name,'%')";
		TGdGiftCard giftCard = new TGdGiftCard();
		query = session.createQuery(queryString);
		query.setString("name", name);
		giftCard = (TGdGiftCard) query.uniqueResult();
		return giftCard;
	}

	@Override
	public List<TGdGiftCard> getGiftCardList() {
		String queryString = "from TGdGiftCard";
		List<TGdGiftCard> giftCardList = new ArrayList<TGdGiftCard>();
		query = session.createQuery(queryString);
		giftCardList = (List<TGdGiftCard>)query.list();
		return giftCardList;
	}

	@Override
	public void save(TGdGiftCard giftCard) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TGdGiftCard giftCard) {
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
