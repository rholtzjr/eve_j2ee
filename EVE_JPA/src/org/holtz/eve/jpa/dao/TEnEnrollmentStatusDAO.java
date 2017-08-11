package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEnEnrollmentStatus;

public interface TEnEnrollmentStatusDAO {
	public TEnEnrollmentStatus getEnrollmentStatusById(int id);
	public TEnEnrollmentStatus getEnrollmentStatusByName(String name);
	public List<TEnEnrollmentStatus> getEnrollmentStatusList();
	public void save(TEnEnrollmentStatus enrollmentStatus);
	public void delete(TEnEnrollmentStatus enrollmentStatus);
}
