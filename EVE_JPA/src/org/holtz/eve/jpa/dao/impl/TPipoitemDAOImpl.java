package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPipoitemDAO;
import org.holtz.eve.jpa.entity.TPipoitem;
import org.holtz.jpa.util.HibernateUtil;

public class TPipoitemDAOImpl implements TPipoitemDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPipoitemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPipoitem getPoitemById(int id) {
		String queryString = "from TPipoitem poitem where poitem.acAccountId = :id";
		TPipoitem poitem = new TPipoitem();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		poitem = (TPipoitem) query.uniqueResult();
		return poitem;
	}

	@Override
	public TPipoitem getPoitemByName(String name) {
		String queryString = "from TPipoitem poitem where poitem.acAccountNameTx like CONCAT('%',:name,'%')";
		TPipoitem poitem = new TPipoitem();
		query = session.createQuery(queryString);
		query.setString("name", name);
		poitem = (TPipoitem) query.uniqueResult();
		return poitem;
	}

	@Override
	public List<TPipoitem> getPoitemList() {
		String queryString = "from TPipoitem";
		List<TPipoitem> poitemList = new ArrayList<TPipoitem>();
		query = session.createQuery(queryString);
		poitemList = (List<TPipoitem>)query.list();
		return poitemList;
	}

	@Override
	public void save(TPipoitem poitem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPipoitem poitem) {
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
