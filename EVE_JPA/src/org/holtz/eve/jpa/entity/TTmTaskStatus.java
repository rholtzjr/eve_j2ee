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
 * TTmTaskStatus generated by hbm2java
 */
@Entity
@Table(name = "T_TmTaskStatus", uniqueConstraints = @UniqueConstraint(columnNames = "TmTaskStatusTx"))
public class TTmTaskStatus implements java.io.Serializable {

	private int tmTaskStatusId;
	private String tmTaskStatusTx;
	private Date tmCreationDate;
	private Date tmLastUpdatedDate;
	private boolean tmUnavailableBl;
	private boolean tmRequiredBl;
	private Set<TTkTask> TTkTasks = new HashSet<TTkTask>(0);

	public TTmTaskStatus() {
	}

	public TTmTaskStatus(int tmTaskStatusId, String tmTaskStatusTx, Date tmCreationDate, Date tmLastUpdatedDate,
			boolean tmUnavailableBl, boolean tmRequiredBl) {
		this.tmTaskStatusId = tmTaskStatusId;
		this.tmTaskStatusTx = tmTaskStatusTx;
		this.tmCreationDate = tmCreationDate;
		this.tmLastUpdatedDate = tmLastUpdatedDate;
		this.tmUnavailableBl = tmUnavailableBl;
		this.tmRequiredBl = tmRequiredBl;
	}

	public TTmTaskStatus(int tmTaskStatusId, String tmTaskStatusTx, Date tmCreationDate, Date tmLastUpdatedDate,
			boolean tmUnavailableBl, boolean tmRequiredBl, Set<TTkTask> TTkTasks) {
		this.tmTaskStatusId = tmTaskStatusId;
		this.tmTaskStatusTx = tmTaskStatusTx;
		this.tmCreationDate = tmCreationDate;
		this.tmLastUpdatedDate = tmLastUpdatedDate;
		this.tmUnavailableBl = tmUnavailableBl;
		this.tmRequiredBl = tmRequiredBl;
		this.TTkTasks = TTkTasks;
	}

	@Id

	@Column(name = "TmTaskStatusID", unique = true, nullable = false)
	public int getTmTaskStatusId() {
		return this.tmTaskStatusId;
	}

	public void setTmTaskStatusId(int tmTaskStatusId) {
		this.tmTaskStatusId = tmTaskStatusId;
	}

	@Column(name = "TmTaskStatusTx", unique = true, nullable = false)
	public String getTmTaskStatusTx() {
		return this.tmTaskStatusTx;
	}

	public void setTmTaskStatusTx(String tmTaskStatusTx) {
		this.tmTaskStatusTx = tmTaskStatusTx;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TmCreationDate", nullable = false, length = 23)
	public Date getTmCreationDate() {
		return this.tmCreationDate;
	}

	public void setTmCreationDate(Date tmCreationDate) {
		this.tmCreationDate = tmCreationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TmLastUpdatedDate", nullable = false, length = 23)
	public Date getTmLastUpdatedDate() {
		return this.tmLastUpdatedDate;
	}

	public void setTmLastUpdatedDate(Date tmLastUpdatedDate) {
		this.tmLastUpdatedDate = tmLastUpdatedDate;
	}

	@Column(name = "TmUnavailableBl", nullable = false)
	public boolean isTmUnavailableBl() {
		return this.tmUnavailableBl;
	}

	public void setTmUnavailableBl(boolean tmUnavailableBl) {
		this.tmUnavailableBl = tmUnavailableBl;
	}

	@Column(name = "TmRequiredBl", nullable = false)
	public boolean isTmRequiredBl() {
		return this.tmRequiredBl;
	}

	public void setTmRequiredBl(boolean tmRequiredBl) {
		this.tmRequiredBl = tmRequiredBl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TTmTaskStatus")
	public Set<TTkTask> getTTkTasks() {
		return this.TTkTasks;
	}

	public void setTTkTasks(Set<TTkTask> TTkTasks) {
		this.TTkTasks = TTkTasks;
	}

}
