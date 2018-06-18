package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TP3packageGroupDAO;
import org.holtz.eve.jpa.entity.TP3packageGroup;
import org.holtz.jpa.util.HibernateUtil;

public class TP3packageGroupDAOImpl implements TP3packageGroupDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TP3packageGroupDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TP3packageGroup getPackageGroupById(int id) {
		String queryString = "from TP3packageGroup packageGroup where packageGroup.p3packageGroupId = :id";
		TP3packageGroup packageGroup = new TP3packageGroup();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		packageGroup = (TP3packageGroup) query.uniqueResult();
		return packageGroup;
	}

	@Override
	public TP3packageGroup getPackageGroupByName(String name) {
		String queryString = "from TP3packageGroup packageGroup where packageGroup.p3packageNameTx like CONCAT('%',:name,'%')";
		TP3packageGroup packageGroup = new TP3packageGroup();
		query = session.createQuery(queryString);
		query.setString("name", name);
		packageGroup = (TP3packageGroup) query.uniqueResult();
		return packageGroup;
	}

	@Override
	public List<TP3packageGroup> getPackageGroupList() {
		String queryString = "from TP3packageGroup";
		List<TP3packageGroup> packageGroupList = new ArrayList<TP3packageGroup>();
		query = session.createQuery(queryString);
		packageGroupList = (List<TP3packageGroup>)query.list();
		return packageGroupList;
	}

	@Override
	public void save(TP3packageGroup packageGroup) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TP3packageGroup packageGroup) {
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
