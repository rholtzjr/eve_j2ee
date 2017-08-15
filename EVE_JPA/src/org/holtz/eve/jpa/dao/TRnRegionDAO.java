package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRnRegion;

public interface TRnRegionDAO {
	public TRnRegion getRegionById(int id);
	public TRnRegion getRegionByName(String name);
	public List<TRnRegion> getRegionList();
	public void save(TRnRegion region);
	public void delete(TRnRegion region);
}
