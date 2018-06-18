package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TLvSeasonDAO;
import org.holtz.eve.jpa.entity.TLvSeason;
import org.holtz.jpa.util.HibernateUtil;

public class TLvSeasonDAOImpl implements TLvSeasonDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TLvSeasonDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TLvSeason getSeasonById(int id) {
		String queryString = "from TLvSeason season where season.lvSeasonId = :id";
		TLvSeason season = new TLvSeason();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		season = (TLvSeason) query.uniqueResult();
		return season;
	}

	@Override
	public TLvSeason getSeasonByName(String name) {
		String queryString = "from TLvSeason season where season.lvSeasonTx like CONCAT('%',:name,'%')";
		TLvSeason season = new TLvSeason();
		query = session.createQuery(queryString);
		query.setString("name", name);
		season = (TLvSeason) query.uniqueResult();
		return season;
	}

	@Override
	public List<TLvSeason> getSeasonList() {
		String queryString = "from TLvSeason";
		List<TLvSeason> seasonList = new ArrayList<TLvSeason>();
		query = session.createQuery(queryString);
		seasonList = (List<TLvSeason>)query.list();
		return seasonList;
	}

	@Override
	public void save(TLvSeason season) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TLvSeason season) {
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
