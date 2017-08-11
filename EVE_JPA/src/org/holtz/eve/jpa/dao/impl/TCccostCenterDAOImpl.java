package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCccostCenterDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TCccostCenter;
import org.holtz.jpa.util.HibernateUtil;

public class TCccostCenterDAOImpl implements TCccostCenterDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCccostCenterDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCccostCenter getCostCenterById(int id) {
		String queryString = "from TCccostCenter costcenter where costcenter.cccostCenterId = :id";
		TCccostCenter costCenter = new TCccostCenter();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		costCenter = (TCccostCenter) query.uniqueResult();
		return costCenter;
	}

	@Override
	public TCccostCenter getCostCenterByName(String name) {
		String queryString = "from TCccostCenter costcenter where costcenter.cccostCenterTx like CONCAT('%',:name,'%')";
		TCccostCenter costCenter = new TCccostCenter();
		query = session.createQuery(queryString);
		query.setString("name", name);
		costCenter = (TCccostCenter) query.uniqueResult();
		return costCenter;
	}

	@Override
	public List<TCccostCenter> getCostCenterList() {
		String queryString = "from TCccostCenter";
		List<TCccostCenter> costCenterList = new ArrayList<TCccostCenter>();
		query = session.createQuery(queryString);
		costCenterList = (List<TCccostCenter>)query.list();
		return costCenterList;
	}

	@Override
	public void save(TCccostCenter costCenter) {
		// TODO This will need to take into account the session/transaction state.

	}

	@Override
	public void delete(TCccostCenter costCenter) {
		// TODO This will need to take into account the session/transaction state.
		
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
