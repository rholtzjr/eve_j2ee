package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TQtqualificationType;

public interface TQtqualificationTypeDAO {
	public TQtqualificationType getQualificationTypeById(int id);
	public TQtqualificationType getQualificationTypeByName(String name);
	public List<TQtqualificationType> getQualificationTypeList();
	public void save(TQtqualificationType qualificationType);
	public void delete(TQtqualificationType qualificationType);
}
