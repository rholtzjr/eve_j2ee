package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TIxIndex generated by hbm2java
 */
@Entity
@Table(name = "T_IxIndex", uniqueConstraints = @UniqueConstraint(columnNames = "IxIndexTx"))
public class TIxIndex implements java.io.Serializable {

	private TIxIndexId id;
	private String ixIndexTx;
	private String ixFillFactorTx;

	public TIxIndex() {
	}

	public TIxIndex(TIxIndexId id, String ixIndexTx) {
		this.id = id;
		this.ixIndexTx = ixIndexTx;
	}

	public TIxIndex(TIxIndexId id, String ixIndexTx, String ixFillFactorTx) {
		this.id = id;
		this.ixIndexTx = ixIndexTx;
		this.ixFillFactorTx = ixFillFactorTx;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "ixIndexId", column = @Column(name = "IxIndexID", nullable = false)),
			@AttributeOverride(name = "ixKeyIn", column = @Column(name = "IxKeyIn", nullable = false)) })
	public TIxIndexId getId() {
		return this.id;
	}

	public void setId(TIxIndexId id) {
		this.id = id;
	}

	@Column(name = "IxIndexTx", unique = true, nullable = false)
	public String getIxIndexTx() {
		return this.ixIndexTx;
	}

	public void setIxIndexTx(String ixIndexTx) {
		this.ixIndexTx = ixIndexTx;
	}

	@Column(name = "IxFillFactorTx")
	public String getIxFillFactorTx() {
		return this.ixFillFactorTx;
	}

	public void setIxFillFactorTx(String ixFillFactorTx) {
		this.ixFillFactorTx = ixFillFactorTx;
	}

}
