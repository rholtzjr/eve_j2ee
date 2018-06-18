package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TReRoomTypeDAO;
import org.holtz.eve.jpa.entity.TReRoomType;
import org.holtz.jpa.util.HibernateUtil;

public class TReRoomTypeDAOImpl implements TReRoomTypeDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TReRoomTypeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TReRoomType getRoomTypeById(int id) {
		String queryString = "from TReRoomType roomType where roomType.reRoomTypeId = :id";
		TReRoomType roomType = new TReRoomType();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		roomType = (TReRoomType) query.uniqueResult();
		return roomType;
	}

	@Override
	public TReRoomType getRoomTypeByName(String name) {
		String queryString = "from TReRoomType roomType where roomType.reRoomTypeTx like CONCAT('%',:name,'%')";
		TReRoomType roomType = new TReRoomType();
		query = session.createQuery(queryString);
		query.setString("name", name);
		roomType = (TReRoomType) query.uniqueResult();
		return roomType;
	}

	@Override
	public List<TReRoomType> getRoomTypeList() {
		String queryString = "from TReRoomType";
		List<TReRoomType> roomTypeList = new ArrayList<TReRoomType>();
		query = session.createQuery(queryString);
		roomTypeList = (List<TReRoomType>)query.list();
		return roomTypeList;
	}

	@Override
	public void save(TReRoomType roomType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TReRoomType roomType) {
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
