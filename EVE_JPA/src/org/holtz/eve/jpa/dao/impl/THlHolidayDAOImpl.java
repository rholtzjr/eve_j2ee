package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.THlHolidayDAO;
import org.holtz.eve.jpa.entity.THlHoliday;
import org.holtz.jpa.util.HibernateUtil;

public class THlHolidayDAOImpl implements THlHolidayDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public THlHolidayDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public THlHoliday getAccountById(int id) {
		String queryString = "from THlHoliday holiday where holiday.hlHolidayId = :id";
		THlHoliday holiday = new THlHoliday();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		holiday = (THlHoliday) query.uniqueResult();
		return holiday;
	}

	@Override
	public THlHoliday getAccountByName(String name) {
		String queryString = "from THlHoliday holiday where holiday.hlHolidayTx like CONCAT('%',:name,'%')";
		THlHoliday holiday = new THlHoliday();
		query = session.createQuery(queryString);
		query.setString("name", name);
		holiday = (THlHoliday) query.uniqueResult();
		return holiday;
	}

	@Override
	public List<THlHoliday> getAccountList() {
		String queryString = "from THlHoliday";
		List<THlHoliday> holidayList = new ArrayList<THlHoliday>();
		query = session.createQuery(queryString);
		holidayList = (List<THlHoliday>)query.list();
		return holidayList;
	}

	@Override
	public void save(THlHoliday holiday) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(THlHoliday holiday) {
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
