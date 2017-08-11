package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TFafollowUpAction;

public interface TFafollowUpActionDAO {
	public TFafollowUpAction getFollowUpActionById(int id);
	public TFafollowUpAction getFollowUpActionByName(String name);
	public List<TFafollowUpAction> getFollowUpActionList();
	public void save(TFafollowUpAction followUpAction);
	public void delete(TFafollowUpAction followUpAction);
}
