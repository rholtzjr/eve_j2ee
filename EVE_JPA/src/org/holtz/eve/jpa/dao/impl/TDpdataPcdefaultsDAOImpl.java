package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDpdataPcdefaultsDAO;
import org.holtz.eve.jpa.entity.TDpdataPcdefaults;
import org.holtz.eve.jpa.entity.TDpdataPcdefaults;
import org.holtz.jpa.util.HibernateUtil;

public class TDpdataPcdefaultsDAOImpl implements TDpdataPcdefaultsDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDpdataPcdefaultsDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDpdataPcdefaults getDataPcDefaultsById(int id) {
		String queryString = "from TDpdataPcdefaults dataPcdefaults where dataPcdefaults.id = :id";
		TDpdataPcdefaults dataPcdefaults = new TDpdataPcdefaults();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		dataPcdefaults = (TDpdataPcdefaults) query.uniqueResult();
		return dataPcdefaults;
	}

	@Override
	public TDpdataPcdefaults getDataPcDefaultsByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TDpdataPcdefaults dataPcdefaults where dataPcdefaults.id like CONCAT('%',:name,'%')";
//		TDpdataPcdefaults dataPcdefaults = new TDpdataPcdefaults();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		dataPcdefaults = (TDpdataPcdefaults) query.uniqueResult();
//		return dataPcdefaults;
	}

	@Override
	public List<TDpdataPcdefaults> getDataPcDefaultsList() {
		String queryString = "from TDpdataPcdefaults";
		List<TDpdataPcdefaults> dataPcdefaultsList = new ArrayList<TDpdataPcdefaults>();
		query = session.createQuery(queryString);
		dataPcdefaultsList = (List<TDpdataPcdefaults>)query.list();
		return dataPcdefaultsList;
	}

	@Override
	public void save(TDpdataPcdefaults dataPcDefaults) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDpdataPcdefaults dataPcDefaults) {
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
