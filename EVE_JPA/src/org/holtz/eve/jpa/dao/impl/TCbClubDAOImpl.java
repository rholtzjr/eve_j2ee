package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCbClubDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TCbClub;
import org.holtz.jpa.util.HibernateUtil;

public class TCbClubDAOImpl implements TCbClubDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCbClubDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCbClub getClubById(int id) {
		String queryString = "from TCbClub club where club.cbClubId = :id";
		TCbClub club = new TCbClub();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		club = (TCbClub) query.uniqueResult();
		return club;
	}

	@Override
	public TCbClub getClubByName(String name) {
		String queryString = "from TCbClub club where club.cbClubNameTx like CONCAT('%',:name,'%')";
		TCbClub club = new TCbClub();
		query = session.createQuery(queryString);
		query.setString("name", name);
		club = (TCbClub) query.uniqueResult();
		return club;
	}

	@Override
	public List<TCbClub> getClubList() {
		String queryString = "from TCbClub";
		List<TCbClub> clubList = new ArrayList<TCbClub>();
		query = session.createQuery(queryString);
		clubList = (List<TCbClub>)query.list();
		return clubList;
	}

	@Override
	public void save(TCbClub account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCbClub account) {
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
