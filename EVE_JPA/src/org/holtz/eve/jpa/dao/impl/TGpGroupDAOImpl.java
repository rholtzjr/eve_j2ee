package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TGpGroupDAO;
import org.holtz.eve.jpa.entity.TGpGroup;
import org.holtz.jpa.util.HibernateUtil;

public class TGpGroupDAOImpl implements TGpGroupDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TGpGroupDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TGpGroup getGroupById(int id) {
		String queryString = "from TGpGroup tgpGroup where tgpGroup.gpGroupId = :id";
		TGpGroup tgpGroup = new TGpGroup();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		tgpGroup = (TGpGroup) query.uniqueResult();
		return tgpGroup;
	}

	@Override
	public TGpGroup getGroupByName(String name) {
		String queryString = "from TGpGroup tgpGroup where tgpGroup.gpGroupNameTx like CONCAT('%',:name,'%')";
		TGpGroup tgpGroup = new TGpGroup();
		query = session.createQuery(queryString);
		query.setString("name", name);
		tgpGroup = (TGpGroup) query.uniqueResult();
		return tgpGroup;
	}

	@Override
	public List<TGpGroup> getGroupList() {
		String queryString = "from TGpGroup";
		List<TGpGroup> tgpGroupList = new ArrayList<TGpGroup>();
		query = session.createQuery(queryString);
		tgpGroupList = (List<TGpGroup>)query.list();
		return tgpGroupList;
	}

	@Override
	public void save(TGpGroup tgpgroup) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TGpGroup tgpgroup) {
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
