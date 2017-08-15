package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TQssqlDAO;
import org.holtz.eve.jpa.entity.TQssql;
import org.holtz.jpa.util.HibernateUtil;

public class TQssqlDAOImpl implements TQssqlDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TQssqlDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TQssql getSqlById(int id) {
		//NOOP
		return null;
//		String queryString = "from TQssql sql where sql.acAccountId = :id";
//		TQssql sql = new TQssql();
//		query = session.createQuery(queryString);
//		query.setInteger("id", id);
//		sql = (TQssql) query.uniqueResult();
//		return sql;
	}

	@Override
	public TQssql getSqlByName(String name) {
		String queryString = "from TQssql sql where sql.qssqlnameTx like CONCAT('%',:name,'%')";
		TQssql sql = new TQssql();
		query = session.createQuery(queryString);
		query.setString("name", name);
		sql = (TQssql) query.uniqueResult();
		return sql;
	}

	@Override
	public List<TQssql> getSqlList() {
		String queryString = "from TQssql";
		List<TQssql> sqlList = new ArrayList<TQssql>();
		query = session.createQuery(queryString);
		sqlList = (List<TQssql>)query.list();
		return sqlList;
	}

	@Override
	public void save(TQssql sql) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TQssql sql) {
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
