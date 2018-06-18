package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TUnuiconfigNode generated by hbm2java
 */
@Entity
@Table(name = "T_UNUIConfigNode")
public class TUnuiconfigNode implements java.io.Serializable {

	private TUnuiconfigNodeId id;
	private TNdNode TNdNode;
	private TUiconfig TUiconfig;
	private String undataTypeIdsTxN;
	private String unuilinkIdsTxN;

	public TUnuiconfigNode() {
	}

	public TUnuiconfigNode(TUnuiconfigNodeId id, TNdNode TNdNode, TUiconfig TUiconfig) {
		this.id = id;
		this.TNdNode = TNdNode;
		this.TUiconfig = TUiconfig;
	}

	public TUnuiconfigNode(TUnuiconfigNodeId id, TNdNode TNdNode, TUiconfig TUiconfig, String undataTypeIdsTxN,
			String unuilinkIdsTxN) {
		this.id = id;
		this.TNdNode = TNdNode;
		this.TUiconfig = TUiconfig;
		this.undataTypeIdsTxN = undataTypeIdsTxN;
		this.unuilinkIdsTxN = unuilinkIdsTxN;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "unuiconfigId", column = @Column(name = "UNUIConfigID", nullable = false)),
			@AttributeOverride(name = "unnodeId", column = @Column(name = "UNNodeID", nullable = false)) })
	public TUnuiconfigNodeId getId() {
		return this.id;
	}

	public void setId(TUnuiconfigNodeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNNodeID", nullable = false, insertable = false, updatable = false)
	public TNdNode getTNdNode() {
		return this.TNdNode;
	}

	public void setTNdNode(TNdNode TNdNode) {
		this.TNdNode = TNdNode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNUIConfigID", nullable = false, insertable = false, updatable = false)
	public TUiconfig getTUiconfig() {
		return this.TUiconfig;
	}

	public void setTUiconfig(TUiconfig TUiconfig) {
		this.TUiconfig = TUiconfig;
	}

	@Column(name = "UNDataTypeIDsTx_N")
	public String getUndataTypeIdsTxN() {
		return this.undataTypeIdsTxN;
	}

	public void setUndataTypeIdsTxN(String undataTypeIdsTxN) {
		this.undataTypeIdsTxN = undataTypeIdsTxN;
	}

	@Column(name = "UNUILinkIDsTx_N")
	public String getUnuilinkIdsTxN() {
		return this.unuilinkIdsTxN;
	}

	public void setUnuilinkIdsTxN(String unuilinkIdsTxN) {
		this.unuilinkIdsTxN = unuilinkIdsTxN;
	}

}
