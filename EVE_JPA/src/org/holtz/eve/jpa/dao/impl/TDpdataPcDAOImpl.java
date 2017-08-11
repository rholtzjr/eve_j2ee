package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDpdataPcDAO;
import org.holtz.eve.jpa.entity.TDpdataPc;
import org.holtz.eve.jpa.entity.TDpdataPc;
import org.holtz.jpa.util.HibernateUtil;

public class TDpdataPcDAOImpl implements TDpdataPcDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDpdataPcDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDpdataPc getDataPcById(int id) {
		String queryString = "from TDpdataPc dataPc where dataPc.dpdataPcid = :id";
		TDpdataPc dataPc = new TDpdataPc();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		dataPc = (TDpdataPc) query.uniqueResult();
		return dataPc;
	}

	@Override
	public TDpdataPc getDataPcByName(String name) {
		String queryString = "from TDpdataPc dataPc where dataPc.dpdataValueTxN like CONCAT('%',:name,'%')";
		TDpdataPc dataPc = new TDpdataPc();
		query = session.createQuery(queryString);
		query.setString("name", name);
		dataPc = (TDpdataPc) query.uniqueResult();
		return dataPc;
	}

	@Override
	public List<TDpdataPc> getDataPcList() {
		String queryString = "from TDpdataPc";
		List<TDpdataPc> dataPcList = new ArrayList<TDpdataPc>();
		query = session.createQuery(queryString);
		dataPcList = (List<TDpdataPc>)query.list();
		return dataPcList;
	}

	@Override
	public void save(TDpdataPc dataPc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDpdataPc dataPc) {
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
