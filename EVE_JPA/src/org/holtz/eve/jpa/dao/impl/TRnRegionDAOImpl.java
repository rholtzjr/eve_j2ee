package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRnRegionDAO;
import org.holtz.eve.jpa.entity.TRnRegion;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TRnRegion;

public class TRnRegionDAOImpl implements TRnRegionDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRnRegionDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRnRegion getRegionById(int id) {
		String queryString = "from TRnRegion region where region.rnRegionId = :id";
		TRnRegion region = new TRnRegion();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		region = (TRnRegion) query.uniqueResult();
		return region;
	}

	@Override
	public TRnRegion getRegionByName(String name) {
		String queryString = "from TRnRegion region where region.rnRegionTx like CONCAT('%',:name,'%')";
		TRnRegion region = new TRnRegion();
		query = session.createQuery(queryString);
		query.setString("name", name);
		region = (TRnRegion) query.uniqueResult();
		return region;
	}

	@Override
	public List<TRnRegion> getRegionList() {
		String queryString = "from TRnRegion";
		List<TRnRegion> regionList = new ArrayList<TRnRegion>();
		query = session.createQuery(queryString);
		regionList = (List<TRnRegion>)query.list();
		return regionList;
	}

	@Override
	public void save(TRnRegion region) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRnRegion region) {
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
