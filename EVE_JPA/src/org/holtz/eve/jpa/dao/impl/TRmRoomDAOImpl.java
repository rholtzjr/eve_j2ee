package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRmRoomDAO;
import org.holtz.eve.jpa.entity.TRmRoom;
import org.holtz.jpa.util.HibernateUtil;

public class TRmRoomDAOImpl implements TRmRoomDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRmRoomDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRmRoom getRoomById(int id) {
		String queryString = "from TRmRoom room where room.rmRoomId = :id";
		TRmRoom room = new TRmRoom();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		room = (TRmRoom) query.uniqueResult();
		return room;
	}

	@Override
	public TRmRoom getRoomByName(String name) {
		String queryString = "from TRmRoom room where room.rmRoomNoTx like CONCAT('%',:name,'%')";
		TRmRoom room = new TRmRoom();
		query = session.createQuery(queryString);
		query.setString("name", name);
		room = (TRmRoom) query.uniqueResult();
		return room;
	}

	@Override
	public List<TRmRoom> getRoomList() {
		String queryString = "from TRmRoom";
		List<TRmRoom> roomList = new ArrayList<TRmRoom>();
		query = session.createQuery(queryString);
		roomList = (List<TRmRoom>)query.list();
		return roomList;
	}

	@Override
	public void save(TRmRoom room) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRmRoom room) {
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
