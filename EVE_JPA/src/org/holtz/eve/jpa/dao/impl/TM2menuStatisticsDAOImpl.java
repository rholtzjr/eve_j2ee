package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TM2menuStatisticsDAO;
import org.holtz.eve.jpa.entity.TM2menuStatistics;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TM2menuStatistics;

public class TM2menuStatisticsDAOImpl implements TM2menuStatisticsDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TM2menuStatisticsDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TM2menuStatistics getMenuStatisticsById(int id) {
		String queryString = "from TM2menuStatistics menuStatistics where menuStatistics.id = :id";
		TM2menuStatistics menuStatistics = new TM2menuStatistics();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		menuStatistics = (TM2menuStatistics) query.uniqueResult();
		return menuStatistics;
	}

	@Override
	public TM2menuStatistics getMenuStatisticsByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TM2menuStatistics menuStatistics where menuStatistics.id like CONCAT('%',:name,'%')";
//		TM2menuStatistics menuStatistics = new TM2menuStatistics();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		menuStatistics = (TM2menuStatistics) query.uniqueResult();
//		return menuStatistics;
	}

	@Override
	public List<TM2menuStatistics> getMenuStatisticsList() {
		String queryString = "from TM2menuStatistics";
		List<TM2menuStatistics> menuStatisticsList = new ArrayList<TM2menuStatistics>();
		query = session.createQuery(queryString);
		menuStatisticsList = (List<TM2menuStatistics>)query.list();
		return menuStatisticsList;
	}

	@Override
	public void save(TM2menuStatistics menuStatistics) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TM2menuStatistics menuStatistics) {
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
