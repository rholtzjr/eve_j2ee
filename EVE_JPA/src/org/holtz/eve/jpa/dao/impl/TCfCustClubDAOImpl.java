package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCfCustClubDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TCfCustClub;
import org.holtz.jpa.util.HibernateUtil;

public class TCfCustClubDAOImpl implements TCfCustClubDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCfCustClubDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCfCustClub getCustClubById(int id) {
		String queryString = "from TCfCustClub custclub where custclub.cfCustClubId = :id";
		TCfCustClub custClub = new TCfCustClub();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		custClub = (TCfCustClub) query.uniqueResult();
		return custClub;
	}

	@Override
	public TCfCustClub getCustClubByName(String name) {
		String queryString = "from TCfCustClub custclub where custclub.TCbClub.cbClubNameTx like CONCAT('%',:name,'%')";
		TCfCustClub custClub = new TCfCustClub();
		query = session.createQuery(queryString);
		query.setString("name", name);
		custClub = (TCfCustClub) query.uniqueResult();
		return custClub;
	}

	@Override
	public List<TCfCustClub> getCustClubList() {
		String queryString = "from TAcAccount";
		List<TCfCustClub> custClubList = new ArrayList<TCfCustClub>();
		query = session.createQuery(queryString);
		custClubList = (List<TCfCustClub>)query.list();
		return custClubList;
	}

	@Override
	public void save(TCfCustClub account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCfCustClub account) {
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
