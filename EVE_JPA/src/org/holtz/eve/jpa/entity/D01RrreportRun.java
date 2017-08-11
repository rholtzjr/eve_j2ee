package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * D01RrreportRun generated by hbm2java
 */
@Entity
@Table(name = "d01_RRReportRun")
public class D01RrreportRun implements java.io.Serializable {

	private D01RrreportRunId id;

	public D01RrreportRun() {
	}

	public D01RrreportRun(D01RrreportRunId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "rrreportRunId", column = @Column(name = "RRReportRunID", nullable = false)),
			@AttributeOverride(name = "rrreportGroupId", column = @Column(name = "RRReportGroupID", nullable = false)),
			@AttributeOverride(name = "rrlastRunDate", column = @Column(name = "RRLastRunDate", nullable = false, length = 23)),
			@AttributeOverride(name = "rrempId", column = @Column(name = "RREmpID", nullable = false)),
			@AttributeOverride(name = "rrstoreId", column = @Column(name = "RRStoreID", nullable = false)) })
	public D01RrreportRunId getId() {
		return this.id;
	}

	public void setId(D01RrreportRunId id) {
		this.id = id;
	}

}
