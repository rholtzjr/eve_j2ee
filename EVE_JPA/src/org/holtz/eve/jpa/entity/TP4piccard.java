package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * TP4piccard generated by hbm2java
 */
@Entity
@Table(name = "T_P4PICCard")
public class TP4piccard implements java.io.Serializable {

	private int p4piccardId;
	private String p4piccardNameTx;
	private boolean p4unavailableBl;
	private Set<TCtcourseType> TCtcourseTypes = new HashSet<TCtcourseType>(0);

	public TP4piccard() {
	}

	public TP4piccard(int p4piccardId, String p4piccardNameTx, boolean p4unavailableBl) {
		this.p4piccardId = p4piccardId;
		this.p4piccardNameTx = p4piccardNameTx;
		this.p4unavailableBl = p4unavailableBl;
	}

	public TP4piccard(int p4piccardId, String p4piccardNameTx, boolean p4unavailableBl,
			Set<TCtcourseType> TCtcourseTypes) {
		this.p4piccardId = p4piccardId;
		this.p4piccardNameTx = p4piccardNameTx;
		this.p4unavailableBl = p4unavailableBl;
		this.TCtcourseTypes = TCtcourseTypes;
	}

	@Id

	@Column(name = "P4PICCardID", unique = true, nullable = false)
	public int getP4piccardId() {
		return this.p4piccardId;
	}

	public void setP4piccardId(int p4piccardId) {
		this.p4piccardId = p4piccardId;
	}

	@Column(name = "P4PICCardNameTx", nullable = false)
	public String getP4piccardNameTx() {
		return this.p4piccardNameTx;
	}

	public void setP4piccardNameTx(String p4piccardNameTx) {
		this.p4piccardNameTx = p4piccardNameTx;
	}

	@Column(name = "P4UnavailableBl", nullable = false)
	public boolean isP4unavailableBl() {
		return this.p4unavailableBl;
	}

	public void setP4unavailableBl(boolean p4unavailableBl) {
		this.p4unavailableBl = p4unavailableBl;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_X1CourseTypePICCard", joinColumns = {
			@JoinColumn(name = "X1PICCardTypeID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "X1CourseTypeID", nullable = false, updatable = false) })
	public Set<TCtcourseType> getTCtcourseTypes() {
		return this.TCtcourseTypes;
	}

	public void setTCtcourseTypes(Set<TCtcourseType> TCtcourseTypes) {
		this.TCtcourseTypes = TCtcourseTypes;
	}

}
