package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TVsvalidState generated by hbm2java
 */
@Entity
@Table(name = "T_VSValidState")
public class TVsvalidState implements java.io.Serializable {

	private int vsvalidStateId;
	private TSeState TSeState;
	private TSoStore TSoStore;

	public TVsvalidState() {
	}

	public TVsvalidState(int vsvalidStateId, TSeState TSeState, TSoStore TSoStore) {
		this.vsvalidStateId = vsvalidStateId;
		this.TSeState = TSeState;
		this.TSoStore = TSoStore;
	}

	@Id

	@Column(name = "VSValidStateID", unique = true, nullable = false)
	public int getVsvalidStateId() {
		return this.vsvalidStateId;
	}

	public void setVsvalidStateId(int vsvalidStateId) {
		this.vsvalidStateId = vsvalidStateId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VSStateID", nullable = false)
	public TSeState getTSeState() {
		return this.TSeState;
	}

	public void setTSeState(TSeState TSeState) {
		this.TSeState = TSeState;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VSStoreID", nullable = false)
	public TSoStore getTSoStore() {
		return this.TSoStore;
	}

	public void setTSoStore(TSoStore TSoStore) {
		this.TSoStore = TSoStore;
	}

}
