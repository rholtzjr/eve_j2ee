package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TSnserialNo generated by hbm2java
 */
@Entity
@Table(name = "T_SNSerialNo")
public class TSnserialNo implements java.io.Serializable {

	private TSnserialNoId id;
	private TSistockItem TSistockItem;
	private TInInvoice TInInvoice;
	private TSoStore TSoStore;
	private Date sncreationDate;

	public TSnserialNo() {
	}

	public TSnserialNo(TSnserialNoId id, TSistockItem TSistockItem, TSoStore TSoStore, Date sncreationDate) {
		this.id = id;
		this.TSistockItem = TSistockItem;
		this.TSoStore = TSoStore;
		this.sncreationDate = sncreationDate;
	}

	public TSnserialNo(TSnserialNoId id, TSistockItem TSistockItem, TInInvoice TInInvoice, TSoStore TSoStore,
			Date sncreationDate) {
		this.id = id;
		this.TSistockItem = TSistockItem;
		this.TInInvoice = TInInvoice;
		this.TSoStore = TSoStore;
		this.sncreationDate = sncreationDate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "snstockItemId", column = @Column(name = "SNStockItemID", nullable = false)),
			@AttributeOverride(name = "snserialNoTx", column = @Column(name = "SNSerialNoTx", nullable = false)) })
	public TSnserialNoId getId() {
		return this.id;
	}

	public void setId(TSnserialNoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SNStockItemID", nullable = false, insertable = false, updatable = false)
	public TSistockItem getTSistockItem() {
		return this.TSistockItem;
	}

	public void setTSistockItem(TSistockItem TSistockItem) {
		this.TSistockItem = TSistockItem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SNInvoiceID_N")
	public TInInvoice getTInInvoice() {
		return this.TInInvoice;
	}

	public void setTInInvoice(TInInvoice TInInvoice) {
		this.TInInvoice = TInInvoice;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SNStoreID", nullable = false)
	public TSoStore getTSoStore() {
		return this.TSoStore;
	}

	public void setTSoStore(TSoStore TSoStore) {
		this.TSoStore = TSoStore;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SNCreationDate", nullable = false, length = 23)
	public Date getSncreationDate() {
		return this.sncreationDate;
	}

	public void setSncreationDate(Date sncreationDate) {
		this.sncreationDate = sncreationDate;
	}

}
