package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCoCompStatus;

public interface TCoCompStatusDAO {
	public TCoCompStatus getCompStatusById(int id);
	public TCoCompStatus getCompStatusByName(String name);
	public List<TCoCompStatus> getCompStatusList();
	public void save(TCoCompStatus compStatus);
	public void delete(TCoCompStatus compStatus);
}
