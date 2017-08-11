package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TE6groupDAO;
import org.holtz.eve.jpa.entity.TE6group;
import org.holtz.jpa.util.HibernateUtil;

public class TE6groupDAOImpl implements TE6groupDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TE6groupDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TE6group getGroupById(int id) {
		String queryString = "from TE6group e6group where e6group.e6groupId = :id";
		TE6group group = new TE6group();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		group = (TE6group) query.uniqueResult();
		return group;
	}

	@Override
	public TE6group getGroupByName(String name) {
		String queryString = "from TE6group e6group where e6group.e6groupTx like CONCAT('%',:name,'%')";
		TE6group group = new TE6group();
		query = session.createQuery(queryString);
		query.setString("name", name);
		group = (TE6group) query.uniqueResult();
		return group;
	}

	@Override
	public List<TE6group> getGroupList() {
		String queryString = "from TE6group";
		List<TE6group> groupList = new ArrayList<TE6group>();
		query = session.createQuery(queryString);
		groupList = (List<TE6group>)query.list();
		return groupList;
	}

	@Override
	public void save(TE6group group) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TE6group group) {
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
