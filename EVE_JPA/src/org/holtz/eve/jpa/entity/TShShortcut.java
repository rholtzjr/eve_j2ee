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
 * TShShortcut generated by hbm2java
 */
@Entity
@Table(name = "T_ShShortcut")
public class TShShortcut implements java.io.Serializable {

	private int shShortcutId;
	private TDtdataType TDtdataType;
	private TNdNode TNdNode;
	private TSoStore TSoStore;
	private int shValueIn;
	private int shDataId;
	private String shShortcutTx;
	private Short shCoolbarIdN;

	public TShShortcut() {
	}

	public TShShortcut(int shShortcutId, TDtdataType TDtdataType, TSoStore TSoStore, int shValueIn, int shDataId,
			String shShortcutTx) {
		this.shShortcutId = shShortcutId;
		this.TDtdataType = TDtdataType;
		this.TSoStore = TSoStore;
		this.shValueIn = shValueIn;
		this.shDataId = shDataId;
		this.shShortcutTx = shShortcutTx;
	}

	public TShShortcut(int shShortcutId, TDtdataType TDtdataType, TNdNode TNdNode, TSoStore TSoStore, int shValueIn,
			int shDataId, String shShortcutTx, Short shCoolbarIdN) {
		this.shShortcutId = shShortcutId;
		this.TDtdataType = TDtdataType;
		this.TNdNode = TNdNode;
		this.TSoStore = TSoStore;
		this.shValueIn = shValueIn;
		this.shDataId = shDataId;
		this.shShortcutTx = shShortcutTx;
		this.shCoolbarIdN = shCoolbarIdN;
	}

	@Id

	@Column(name = "ShShortcutID", unique = true, nullable = false)
	public int getShShortcutId() {
		return this.shShortcutId;
	}

	public void setShShortcutId(int shShortcutId) {
		this.shShortcutId = shShortcutId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ShDataTypeID", nullable = false)
	public TDtdataType getTDtdataType() {
		return this.TDtdataType;
	}

	public void setTDtdataType(TDtdataType TDtdataType) {
		this.TDtdataType = TDtdataType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ShNodeID")
	public TNdNode getTNdNode() {
		return this.TNdNode;
	}

	public void setTNdNode(TNdNode TNdNode) {
		this.TNdNode = TNdNode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ShStoreID", nullable = false)
	public TSoStore getTSoStore() {
		return this.TSoStore;
	}

	public void setTSoStore(TSoStore TSoStore) {
		this.TSoStore = TSoStore;
	}

	@Column(name = "ShValueIn", nullable = false)
	public int getShValueIn() {
		return this.shValueIn;
	}

	public void setShValueIn(int shValueIn) {
		this.shValueIn = shValueIn;
	}

	@Column(name = "ShDataID", nullable = false)
	public int getShDataId() {
		return this.shDataId;
	}

	public void setShDataId(int shDataId) {
		this.shDataId = shDataId;
	}

	@Column(name = "ShShortcutTx", nullable = false)
	public String getShShortcutTx() {
		return this.shShortcutTx;
	}

	public void setShShortcutTx(String shShortcutTx) {
		this.shShortcutTx = shShortcutTx;
	}

	@Column(name = "ShCoolbarID_N")
	public Short getShCoolbarIdN() {
		return this.shCoolbarIdN;
	}

	public void setShCoolbarIdN(Short shCoolbarIdN) {
		this.shCoolbarIdN = shCoolbarIdN;
	}

}
