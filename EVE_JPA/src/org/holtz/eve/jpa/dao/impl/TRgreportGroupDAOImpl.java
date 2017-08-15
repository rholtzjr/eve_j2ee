package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TRgreportGroupDAO;
import org.holtz.eve.jpa.entity.TRgreportGroup;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TRgreportGroup;

public class TRgreportGroupDAOImpl implements TRgreportGroupDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TRgreportGroupDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TRgreportGroup getReportGroupById(int id) {
		String queryString = "from TRgreportGroup reportGroup where reportGroup.rgreportGroupId = :id";
		TRgreportGroup reportGroup = new TRgreportGroup();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		reportGroup = (TRgreportGroup) query.uniqueResult();
		return reportGroup;
	}

	@Override
	public TRgreportGroup getReportGroupByName(String name) {
		String queryString = "from TRgreportGroup reportGroup where reportGroup.rgreportGroupTx like CONCAT('%',:name,'%')";
		TRgreportGroup reportGroup = new TRgreportGroup();
		query = session.createQuery(queryString);
		query.setString("name", name);
		reportGroup = (TRgreportGroup) query.uniqueResult();
		return reportGroup;
	}

	@Override
	public List<TRgreportGroup> getReportGroupList() {
		String queryString = "from TRgreportGroup";
		List<TRgreportGroup> reportGroupList = new ArrayList<TRgreportGroup>();
		query = session.createQuery(queryString);
		reportGroupList = (List<TRgreportGroup>)query.list();
		return reportGroupList;
	}

	@Override
	public void save(TRgreportGroup reportGroup) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TRgreportGroup reportGroup) {
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
