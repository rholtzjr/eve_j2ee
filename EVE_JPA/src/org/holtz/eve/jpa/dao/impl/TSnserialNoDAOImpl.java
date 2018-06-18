package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TSnserialNoDAO;
import org.holtz.eve.jpa.entity.TSnserialNo;
import org.holtz.jpa.util.HibernateUtil;

public class TSnserialNoDAOImpl implements TSnserialNoDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSnserialNoDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TSnserialNo getSerialNoById(int id) {
		String queryString = "from TSnserialNo serialNo where serialNo.id = :id";
		TSnserialNo serialNo = new TSnserialNo();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		serialNo = (TSnserialNo) query.uniqueResult();
		return serialNo;
	}

	@Override
	public TSnserialNo getSerialNoByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TSnserialNo serialNo where serialNo.id like CONCAT('%',:name,'%')";
//		TSnserialNo serialNo = new TSnserialNo();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		serialNo = (TSnserialNo) query.uniqueResult();
//		return serialNo;
	}

	@Override
	public List<TSnserialNo> getSerialNoList() {
		String queryString = "from TSnserialNo";
		List<TSnserialNo> serialNoList = new ArrayList<TSnserialNo>();
		query = session.createQuery(queryString);
		serialNoList = (List<TSnserialNo>)query.list();
		return serialNoList;
	}

	@Override
	public void save(TSnserialNo serialNo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TSnserialNo serialNo) {
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
