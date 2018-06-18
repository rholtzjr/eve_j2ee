package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPzPaperSizeDAO;
import org.holtz.eve.jpa.entity.TPzPaperSize;
import org.holtz.jpa.util.HibernateUtil;

public class TPzPaperSizeDAOImpl implements TPzPaperSizeDAO {

	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPzPaperSizeDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPzPaperSize getPaperSizeById(int id) {
		String queryString = "from TPzPaperSize paperSize where paperSize.pzPaperSizeId = :id";
		TPzPaperSize paperSize = new TPzPaperSize();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		paperSize = (TPzPaperSize) query.uniqueResult();
		return paperSize;
	}

	@Override
	public TPzPaperSize getPaperSizeByName(String name) {
		String queryString = "from TPzPaperSize paperSize where paperSize.pzPaperSizeTx like CONCAT('%',:name,'%')";
		TPzPaperSize paperSize = new TPzPaperSize();
		query = session.createQuery(queryString);
		query.setString("name", name);
		paperSize = (TPzPaperSize) query.uniqueResult();
		return paperSize;
	}

	@Override
	public List<TPzPaperSize> getPaperSizeList() {
		String queryString = "from TPzPaperSize";
		List<TPzPaperSize> paperSizeList = new ArrayList<TPzPaperSize>();
		query = session.createQuery(queryString);
		paperSizeList = (List<TPzPaperSize>)query.list();
		return paperSizeList;
	}

	@Override
	public void save(TPzPaperSize paperSize) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPzPaperSize paperSize) {
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
