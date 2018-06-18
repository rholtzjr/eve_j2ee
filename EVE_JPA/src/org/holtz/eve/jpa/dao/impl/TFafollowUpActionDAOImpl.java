package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TFafollowUpActionDAO;
import org.holtz.eve.jpa.entity.TFafollowUpAction;
import org.holtz.jpa.util.HibernateUtil;

public class TFafollowUpActionDAOImpl implements TFafollowUpActionDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TFafollowUpActionDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TFafollowUpAction getFollowUpActionById(int id) {
		String queryString = "from TFafollowUpAction followUpAction where followUpAction.fafollowUpActionId = :id";
		TFafollowUpAction followUpAction = new TFafollowUpAction();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		followUpAction = (TFafollowUpAction) query.uniqueResult();
		return followUpAction;
	}

	@Override
	public TFafollowUpAction getFollowUpActionByName(String name) {
		String queryString = "from TFafollowUpAction followUpAction where followUpAction.fafollowUpActionTx like CONCAT('%',:name,'%')";
		TFafollowUpAction followUpAction = new TFafollowUpAction();
		query = session.createQuery(queryString);
		query.setString("name", name);
		followUpAction = (TFafollowUpAction) query.uniqueResult();
		return followUpAction;
	}

	@Override
	public List<TFafollowUpAction> getFollowUpActionList() {
		String queryString = "from TFafollowUpAction";
		List<TFafollowUpAction> followUpActionList = new ArrayList<TFafollowUpAction>();
		query = session.createQuery(queryString);
		followUpActionList = (List<TFafollowUpAction>)query.list();
		return followUpActionList;
	}

	@Override
	public void save(TFafollowUpAction followUpAction) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TFafollowUpAction followUpAction) {
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
