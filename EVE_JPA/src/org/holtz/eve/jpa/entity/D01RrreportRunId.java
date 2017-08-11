package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01RrreportRunId generated by hbm2java
 */
@Embeddable
public class D01RrreportRunId implements java.io.Serializable {

	private int rrreportRunId;
	private short rrreportGroupId;
	private Date rrlastRunDate;
	private int rrempId;
	private short rrstoreId;

	public D01RrreportRunId() {
	}

	public D01RrreportRunId(int rrreportRunId, short rrreportGroupId, Date rrlastRunDate, int rrempId,
			short rrstoreId) {
		this.rrreportRunId = rrreportRunId;
		this.rrreportGroupId = rrreportGroupId;
		this.rrlastRunDate = rrlastRunDate;
		this.rrempId = rrempId;
		this.rrstoreId = rrstoreId;
	}

	@Column(name = "RRReportRunID", nullable = false)
	public int getRrreportRunId() {
		return this.rrreportRunId;
	}

	public void setRrreportRunId(int rrreportRunId) {
		this.rrreportRunId = rrreportRunId;
	}

	@Column(name = "RRReportGroupID", nullable = false)
	public short getRrreportGroupId() {
		return this.rrreportGroupId;
	}

	public void setRrreportGroupId(short rrreportGroupId) {
		this.rrreportGroupId = rrreportGroupId;
	}

	@Column(name = "RRLastRunDate", nullable = false, length = 23)
	public Date getRrlastRunDate() {
		return this.rrlastRunDate;
	}

	public void setRrlastRunDate(Date rrlastRunDate) {
		this.rrlastRunDate = rrlastRunDate;
	}

	@Column(name = "RREmpID", nullable = false)
	public int getRrempId() {
		return this.rrempId;
	}

	public void setRrempId(int rrempId) {
		this.rrempId = rrempId;
	}

	@Column(name = "RRStoreID", nullable = false)
	public short getRrstoreId() {
		return this.rrstoreId;
	}

	public void setRrstoreId(short rrstoreId) {
		this.rrstoreId = rrstoreId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01RrreportRunId))
			return false;
		D01RrreportRunId castOther = (D01RrreportRunId) other;

		return (this.getRrreportRunId() == castOther.getRrreportRunId())
				&& (this.getRrreportGroupId() == castOther.getRrreportGroupId())
				&& ((this.getRrlastRunDate() == castOther.getRrlastRunDate())
						|| (this.getRrlastRunDate() != null && castOther.getRrlastRunDate() != null
								&& this.getRrlastRunDate().equals(castOther.getRrlastRunDate())))
				&& (this.getRrempId() == castOther.getRrempId()) && (this.getRrstoreId() == castOther.getRrstoreId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRrreportRunId();
		result = 37 * result + this.getRrreportGroupId();
		result = 37 * result + (getRrlastRunDate() == null ? 0 : this.getRrlastRunDate().hashCode());
		result = 37 * result + this.getRrempId();
		result = 37 * result + this.getRrstoreId();
		return result;
	}

}
