package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSvStockRoomDAO;
import org.holtz.eve.jpa.entity.TSvStockRoom;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TSvStockRoom;

public class TSvStockRoomDAOImpl implements TSvStockRoomDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSvStockRoomDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSvStockRoom getStockRoomById(int id) {
		String queryString = "from TSvStockRoom stockRoom where stockRoom.id = :id";
		TSvStockRoom stockRoom = new TSvStockRoom();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		stockRoom = (TSvStockRoom) query.uniqueResult();
		return stockRoom;
	}

	@Override
	public TSvStockRoom getStockRoomByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSvStockRoom stockRoom where stockRoom.id like CONCAT('%',:name,'%')";
//		TSvStockRoom stockRoom = new TSvStockRoom();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		stockRoom = (TSvStockRoom) query.uniqueResult();
//		return stockRoom;
	}

	@Override
	public List<TSvStockRoom> getStockRoomList() {
		String queryString = "from TSvStockRoom";
		List<TSvStockRoom> stockRoomList = new ArrayList<TSvStockRoom>();
		query = session.createQuery(queryString);
		stockRoomList = (List<TSvStockRoom>)query.list();
		return stockRoomList;
	}

	@Override
	public void save(TSvStockRoom stockRoom) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSvStockRoom stockRoom) {
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
