package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCdCustOrderDAO;
import org.holtz.eve.jpa.entity.TCdCustOrder;
import org.holtz.jpa.util.HibernateUtil;

public class TCdCustOrderDAOImpl implements TCdCustOrderDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCdCustOrderDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCdCustOrder getCustOrderById(int id) {
		String queryString = "from TCdCustOrder custorder where custorder.cdCustOrderId = :id";
		TCdCustOrder custOrder = new TCdCustOrder();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		custOrder = (TCdCustOrder) query.uniqueResult();
		return custOrder;
	}

	@Override
	public TCdCustOrder getCustOrderByName(String name) {
		String queryString = "from TCdCustOrder custorder where custorder.cdNotesTxN like CONCAT('%',:name,'%')";
		TCdCustOrder custOrder = new TCdCustOrder();
		query = session.createQuery(queryString);
		query.setString("name", name);
		custOrder = (TCdCustOrder) query.uniqueResult();
		return custOrder;
	}

	@Override
	public List<TCdCustOrder> getCustOrderList() {
		String queryString = "from TCdCustOrder";
		List<TCdCustOrder> custOrderList = new ArrayList<TCdCustOrder>();
		query = session.createQuery(queryString);
		custOrderList = (List<TCdCustOrder>)query.list();
		return custOrderList;
	}

	@Override
	public void save(TCdCustOrder custOrder) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCdCustOrder custOrder) {
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
