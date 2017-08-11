package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * TP5pictype generated by hbm2java
 */
@Entity
@Table(name = "T_P5PICType", uniqueConstraints = @UniqueConstraint(columnNames = "P5PICTypeTx"))
public class TP5pictype implements java.io.Serializable {

	private int p5pictypeId;
	private String p5pictypeTx;
	private int p5reportLayoutId;
	private Boolean p5printTempCardBl;
	private boolean p5unavailableBl;
	private Date p5creationDate;
	private boolean p5debitPicbl;
	private Set<TCtcourseType> TCtcourseTypes = new HashSet<TCtcourseType>(0);

	public TP5pictype() {
	}

	public TP5pictype(int p5pictypeId, String p5pictypeTx, int p5reportLayoutId, boolean p5unavailableBl,
			Date p5creationDate, boolean p5debitPicbl) {
		this.p5pictypeId = p5pictypeId;
		this.p5pictypeTx = p5pictypeTx;
		this.p5reportLayoutId = p5reportLayoutId;
		this.p5unavailableBl = p5unavailableBl;
		this.p5creationDate = p5creationDate;
		this.p5debitPicbl = p5debitPicbl;
	}

	public TP5pictype(int p5pictypeId, String p5pictypeTx, int p5reportLayoutId, Boolean p5printTempCardBl,
			boolean p5unavailableBl, Date p5creationDate, boolean p5debitPicbl, Set<TCtcourseType> TCtcourseTypes) {
		this.p5pictypeId = p5pictypeId;
		this.p5pictypeTx = p5pictypeTx;
		this.p5reportLayoutId = p5reportLayoutId;
		this.p5printTempCardBl = p5printTempCardBl;
		this.p5unavailableBl = p5unavailableBl;
		this.p5creationDate = p5creationDate;
		this.p5debitPicbl = p5debitPicbl;
		this.TCtcourseTypes = TCtcourseTypes;
	}

	@Id

	@Column(name = "P5PICTypeID", unique = true, nullable = false)
	public int getP5pictypeId() {
		return this.p5pictypeId;
	}

	public void setP5pictypeId(int p5pictypeId) {
		this.p5pictypeId = p5pictypeId;
	}

	@Column(name = "P5PICTypeTx", unique = true, nullable = false)
	public String getP5pictypeTx() {
		return this.p5pictypeTx;
	}

	public void setP5pictypeTx(String p5pictypeTx) {
		this.p5pictypeTx = p5pictypeTx;
	}

	@Column(name = "P5ReportLayoutID", nullable = false)
	public int getP5reportLayoutId() {
		return this.p5reportLayoutId;
	}

	public void setP5reportLayoutId(int p5reportLayoutId) {
		this.p5reportLayoutId = p5reportLayoutId;
	}

	@Column(name = "P5PrintTempCardBl")
	public Boolean getP5printTempCardBl() {
		return this.p5printTempCardBl;
	}

	public void setP5printTempCardBl(Boolean p5printTempCardBl) {
		this.p5printTempCardBl = p5printTempCardBl;
	}

	@Column(name = "P5UnavailableBl", nullable = false)
	public boolean isP5unavailableBl() {
		return this.p5unavailableBl;
	}

	public void setP5unavailableBl(boolean p5unavailableBl) {
		this.p5unavailableBl = p5unavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "P5CreationDate", nullable = false, length = 23)
	public Date getP5creationDate() {
		return this.p5creationDate;
	}

	public void setP5creationDate(Date p5creationDate) {
		this.p5creationDate = p5creationDate;
	}

	@Column(name = "P5DebitPICBl", nullable = false)
	public boolean isP5debitPicbl() {
		return this.p5debitPicbl;
	}

	public void setP5debitPicbl(boolean p5debitPicbl) {
		this.p5debitPicbl = p5debitPicbl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TP5pictype")
	public Set<TCtcourseType> getTCtcourseTypes() {
		return this.TCtcourseTypes;
	}

	public void setTCtcourseTypes(Set<TCtcourseType> TCtcourseTypes) {
		this.TCtcourseTypes = TCtcourseTypes;
	}

}
