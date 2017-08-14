package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TNsnotifStatus;

public interface TNsnotifStatusDAO {
	public TNsnotifStatus getNotifStatusById(int id);
	public TNsnotifStatus getNotifStatusByName(String name);
	public List<TNsnotifStatus> getNotifStatusList();
	public void save(TNsnotifStatus notifStatus);
	public void delete(TNsnotifStatus notifStatus);
}
