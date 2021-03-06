package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TRcrebicategory generated by hbm2java
 */
@Entity
@Table(name = "T_RCREBICategory", uniqueConstraints = @UniqueConstraint(columnNames = "RCREBICategoryTx"))
public class TRcrebicategory implements java.io.Serializable {

	private int rcrebicategoryId;
	private String rcrebicategoryTx;

	public TRcrebicategory() {
	}

	public TRcrebicategory(int rcrebicategoryId, String rcrebicategoryTx) {
		this.rcrebicategoryId = rcrebicategoryId;
		this.rcrebicategoryTx = rcrebicategoryTx;
	}

	@Id

	@Column(name = "RCREBICategoryID", unique = true, nullable = false)
	public int getRcrebicategoryId() {
		return this.rcrebicategoryId;
	}

	public void setRcrebicategoryId(int rcrebicategoryId) {
		this.rcrebicategoryId = rcrebicategoryId;
	}

	@Column(name = "RCREBICategoryTx", unique = true, nullable = false)
	public String getRcrebicategoryTx() {
		return this.rcrebicategoryTx;
	}

	public void setRcrebicategoryTx(String rcrebicategoryTx) {
		this.rcrebicategoryTx = rcrebicategoryTx;
	}

}
