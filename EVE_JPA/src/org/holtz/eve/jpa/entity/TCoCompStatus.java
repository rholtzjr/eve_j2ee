package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

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
 * TCoCompStatus generated by hbm2java
 */
@Entity
@Table(name = "T_CoCompStatus", uniqueConstraints = @UniqueConstraint(columnNames = "CoCompStatusTx"))
public class TCoCompStatus implements java.io.Serializable {

	private short coCompStatusId;
	private String coCompStatusTx;
	private boolean coUnavailableBl;
	private Date coCreationDate;
	private Date coLastUpdatedDate;
	private boolean coRequiredBl;
	private boolean coEnableDatesBl;
	private Set<TC1custCourse> TC1custCourses = new HashSet<TC1custCourse>(0);

	public TCoCompStatus() {
	}

	public TCoCompStatus(short coCompStatusId, String coCompStatusTx, boolean coUnavailableBl,
			Date coCreationDate, Date coLastUpdatedDate, boolean coRequiredBl, boolean coEnableDatesBl) {
		this.coCompStatusId = coCompStatusId;
		this.coCompStatusTx = coCompStatusTx;
		this.coUnavailableBl = coUnavailableBl;
		this.coCreationDate = coCreationDate;
		this.coLastUpdatedDate = coLastUpdatedDate;
		this.coRequiredBl = coRequiredBl;
		this.coEnableDatesBl = coEnableDatesBl;
	}

	public TCoCompStatus(short coCompStatusId, String coCompStatusTx, boolean coUnavailableBl,
			Date coCreationDate, Date coLastUpdatedDate, boolean coRequiredBl, boolean coEnableDatesBl,
			Set<TC1custCourse> TC1custCourses) {
		this.coCompStatusId = coCompStatusId;
		this.coCompStatusTx = coCompStatusTx;
		this.coUnavailableBl = coUnavailableBl;
		this.coCreationDate = coCreationDate;
		this.coLastUpdatedDate = coLastUpdatedDate;
		this.coRequiredBl = coRequiredBl;
		this.coEnableDatesBl = coEnableDatesBl;
		this.TC1custCourses = TC1custCourses;
	}

	@Id

	@Column(name = "CoCompStatusID", unique = true, nullable = false)
	public short getCoCompStatusId() {
		return this.coCompStatusId;
	}

	public void setCoCompStatusId(short coCompStatusId) {
		this.coCompStatusId = coCompStatusId;
	}

	@Column(name = "CoCompStatusTx", unique = true, nullable = false)
	public String getCoCompStatusTx() {
		return this.coCompStatusTx;
	}

	public void setCoCompStatusTx(String coCompStatusTx) {
		this.coCompStatusTx = coCompStatusTx;
	}

	@Column(name = "CoUnavailableBl", nullable = false)
	public boolean isCoUnavailableBl() {
		return this.coUnavailableBl;
	}

	public void setCoUnavailableBl(boolean coUnavailableBl) {
		this.coUnavailableBl = coUnavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CoCreationDate", nullable = false, length = 23)
	public Date getCoCreationDate() {
		return this.coCreationDate;
	}

	public void setCoCreationDate(Date coCreationDate) {
		this.coCreationDate = coCreationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CoLastUpdatedDate", nullable = false, length = 23)
	public Date getCoLastUpdatedDate() {
		return this.coLastUpdatedDate;
	}

	public void setCoLastUpdatedDate(Date coLastUpdatedDate) {
		this.coLastUpdatedDate = coLastUpdatedDate;
	}

	@Column(name = "CoRequiredBl", nullable = false)
	public boolean isCoRequiredBl() {
		return this.coRequiredBl;
	}

	public void setCoRequiredBl(boolean coRequiredBl) {
		this.coRequiredBl = coRequiredBl;
	}

	@Column(name = "CoEnableDatesBl", nullable = false)
	public boolean isCoEnableDatesBl() {
		return this.coEnableDatesBl;
	}

	public void setCoEnableDatesBl(boolean coEnableDatesBl) {
		this.coEnableDatesBl = coEnableDatesBl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCoCompStatus")
	public Set<TC1custCourse> getTC1custCourses() {
		return this.TC1custCourses;
	}

	public void setTC1custCourses(Set<TC1custCourse> TC1custCourses) {
		this.TC1custCourses = TC1custCourses;
	}

}
