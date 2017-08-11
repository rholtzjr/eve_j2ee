package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.THtHotelDAO;
import org.holtz.eve.jpa.entity.THtHotel;
import org.holtz.jpa.util.HibernateUtil;

public class THtHotelDAOImpl implements THtHotelDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	
	public THtHotelDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public THtHotel getHotelById(int id) {
		String queryString = "from THtHotel hotel where hotel.htHotelId = :id";
		THtHotel hotel = new THtHotel();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		hotel = (THtHotel) query.uniqueResult();
		return hotel;
	}

	@Override
	public THtHotel getHotelByName(String name) {
		String queryString = "from THtHotel hotel where hotel.htHotelTx like CONCAT('%',:name,'%')";
		THtHotel hotel = new THtHotel();
		query = session.createQuery(queryString);
		query.setString("name", name);
		hotel = (THtHotel) query.uniqueResult();
		return hotel;
	}

	@Override
	public List<THtHotel> getHotelList() {
		String queryString = "from THtHotel";
		List<THtHotel> hotelList = new ArrayList<THtHotel>();
		query = session.createQuery(queryString);
		hotelList = (List<THtHotel>)query.list();
		return hotelList;
	}

	@Override
	public void save(THtHotel hotel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(THtHotel hotel) {
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
