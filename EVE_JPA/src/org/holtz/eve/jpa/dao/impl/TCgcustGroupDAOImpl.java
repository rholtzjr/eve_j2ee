package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCgcustGroupDAO;
import org.holtz.eve.jpa.entity.TCgcustGroup;
import org.holtz.jpa.util.HibernateUtil;

public class TCgcustGroupDAOImpl implements TCgcustGroupDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCgcustGroupDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCgcustGroup getCustGroupById(int id) {
		String queryString = "from TCgcustGroup custgroup where custgroup.cgcustGroupId = :id";
		TCgcustGroup custGroup = new TCgcustGroup();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		custGroup = (TCgcustGroup) query.uniqueResult();
		return custGroup;
	}

	@Override
	public TCgcustGroup getCustGroupByName(String name) {
		String queryString = "from TCgcustGroup custgroup where custgroup.TGpGroup.gpGroupNameTx like CONCAT('%',:name,'%')";
		TCgcustGroup custGroup = new TCgcustGroup();
		query = session.createQuery(queryString);
		query.setString("name", name);
		custGroup = (TCgcustGroup) query.uniqueResult();
		return custGroup;
	}

	@Override
	public List<TCgcustGroup> getCustGroupList() {
		String queryString = "from TAcAccount";
		List<TCgcustGroup> custGroupList = new ArrayList<TCgcustGroup>();
		query = session.createQuery(queryString);
		custGroupList = (List<TCgcustGroup>)query.list();
		return custGroupList;
	}

	@Override
	public void save(TCgcustGroup custGroup) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCgcustGroup custGroup) {
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
