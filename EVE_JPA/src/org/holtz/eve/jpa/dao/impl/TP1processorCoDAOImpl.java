package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TP1processorCoDAO;
import org.holtz.eve.jpa.entity.TP1processorCo;
import org.holtz.jpa.util.HibernateUtil;

public class TP1processorCoDAOImpl implements TP1processorCoDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TP1processorCoDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TP1processorCo getProcessorCoById(int id) {
		String queryString = "from TP1processorCo processorCo where processorCo.p1processorId = :id";
		TP1processorCo processorCo = new TP1processorCo();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		processorCo = (TP1processorCo) query.uniqueResult();
		return processorCo;
	}

	@Override
	public TP1processorCo getProcessorCoByName(String name) {
		String queryString = "from TP1processorCo processorCo where processorCo.p1processorNameTx like CONCAT('%',:name,'%')";
		TP1processorCo processorCo = new TP1processorCo();
		query = session.createQuery(queryString);
		query.setString("name", name);
		processorCo = (TP1processorCo) query.uniqueResult();
		return processorCo;
	}

	@Override
	public List<TP1processorCo> getProcessorCoList() {
		String queryString = "from TP1processorCo";
		List<TP1processorCo> processorCoList = new ArrayList<TP1processorCo>();
		query = session.createQuery(queryString);
		processorCoList = (List<TP1processorCo>)query.list();
		return processorCoList;
	}

	@Override
	public void save(TP1processorCo processorCo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TP1processorCo processorCo) {
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
