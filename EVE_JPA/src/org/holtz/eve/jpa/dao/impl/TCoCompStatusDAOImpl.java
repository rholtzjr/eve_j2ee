package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCoCompStatusDAO;
import org.holtz.eve.jpa.entity.TCoCompStatus;
import org.holtz.jpa.util.HibernateUtil;

public class TCoCompStatusDAOImpl implements TCoCompStatusDAO {

	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCoCompStatusDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCoCompStatus getCompStatusById(int id) {
		String queryString = "from TCoCompStatus compstatus where compstatus.coCompStatusId = :id";
		TCoCompStatus compstatus = new TCoCompStatus();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		compstatus = (TCoCompStatus) query.uniqueResult();
		return compstatus;
	}

	@Override
	public TCoCompStatus getCompStatusByName(String name) {
		String queryString = "from TCoCompStatus compstatus where compstatus.acAccountNameTx like CONCAT('%',:name,'%')";
		TCoCompStatus compstatus = new TCoCompStatus();
		query = session.createQuery(queryString);
		query.setString("name", name);
		compstatus = (TCoCompStatus) query.uniqueResult();
		return compstatus;
	}

	@Override
	public List<TCoCompStatus> getCompStatusList() {
		String queryString = "from TCoCompStatus";
		List<TCoCompStatus> compstatusList = new ArrayList<TCoCompStatus>();
		query = session.createQuery(queryString);
		compstatusList = (List<TCoCompStatus>)query.list();
		return compstatusList;
	}

	@Override
	public void save(TCoCompStatus compStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCoCompStatus compStatus) {
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
