package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIsissysDAO;
import org.holtz.eve.jpa.entity.TIsissys;
import org.holtz.jpa.util.HibernateUtil;

public class TIsissysDAOImpl implements TIsissysDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIsissysDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIsissys getIssysById(int id) {
		String queryString = "from TIsissys issys where issys.isissysofficeId = :id";
		TIsissys issys = new TIsissys();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		issys = (TIsissys) query.uniqueResult();
		return issys;
	}

	@Override
	public TIsissys getIssysByName(String name) {
		String queryString = "from TIsissys issys where issys.isissysofficeTx like CONCAT('%',:name,'%')";
		TIsissys issys = new TIsissys();
		query = session.createQuery(queryString);
		query.setString("name", name);
		issys = (TIsissys) query.uniqueResult();
		return issys;
	}

	@Override
	public List<TIsissys> getIssysList() {
		String queryString = "from TIsissys";
		List<TIsissys> issysList = new ArrayList<TIsissys>();
		query = session.createQuery(queryString);
		issysList = (List<TIsissys>)query.list();
		return issysList;
	}

	@Override
	public void save(TIsissys issys) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIsissys issys) {
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
