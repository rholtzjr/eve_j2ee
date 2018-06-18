package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TIlimportLogDAO;
import org.holtz.eve.jpa.entity.TIlimportLog;
import org.holtz.jpa.util.HibernateUtil;

public class TIlimportLogDAOImpl implements TIlimportLogDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TIlimportLogDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TIlimportLog getImportLogById(int id) {
		String queryString = "from TIlimportLog importLog where importLog.ilimportLogId = :id";
		TIlimportLog importLog = new TIlimportLog();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		importLog = (TIlimportLog) query.uniqueResult();
		return importLog;
	}

	@Override
	public TIlimportLog getImportLogByName(String name) {
		String queryString = "from TIlimportLog importLog where importLog.ildescriptionTx like CONCAT('%',:name,'%')";
		TIlimportLog importLog = new TIlimportLog();
		query = session.createQuery(queryString);
		query.setString("name", name);
		importLog = (TIlimportLog) query.uniqueResult();
		return importLog;
	}

	@Override
	public List<TIlimportLog> getImportLogList() {
		String queryString = "from TIlimportLog";
		List<TIlimportLog> importLogList = new ArrayList<TIlimportLog>();
		query = session.createQuery(queryString);
		importLogList = (List<TIlimportLog>)query.list();
		return importLogList;
	}

	@Override
	public void save(TIlimportLog importLog) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TIlimportLog importLog) {
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
