package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TGrgiftRegistry generated by hbm2java
 */
@Entity
@Table(name = "T_GRGiftRegistry")
public class TGrgiftRegistry implements java.io.Serializable {

	private int grgiftRegistryId;
	private TSistockItem TSistockItem;
	private TInInvoice TInInvoice;
	private TCuCust TCuCust;
	private Date grcreationDate;

	public TGrgiftRegistry() {
	}

	public TGrgiftRegistry(int grgiftRegistryId, TSistockItem TSistockItem, TCuCust TCuCust) {
		this.grgiftRegistryId = grgiftRegistryId;
		this.TSistockItem = TSistockItem;
		this.TCuCust = TCuCust;
	}

	public TGrgiftRegistry(int grgiftRegistryId, TSistockItem TSistockItem, TInInvoice TInInvoice, TCuCust TCuCust,
			Date grcreationDate) {
		this.grgiftRegistryId = grgiftRegistryId;
		this.TSistockItem = TSistockItem;
		this.TInInvoice = TInInvoice;
		this.TCuCust = TCuCust;
		this.grcreationDate = grcreationDate;
	}

	@Id

	@Column(name = "GRGiftRegistryID", unique = true, nullable = false)
	public int getGrgiftRegistryId() {
		return this.grgiftRegistryId;
	}

	public void setGrgiftRegistryId(int grgiftRegistryId) {
		this.grgiftRegistryId = grgiftRegistryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GRStockItemID", nullable = false)
	public TSistockItem getTSistockItem() {
		return this.TSistockItem;
	}

	public void setTSistockItem(TSistockItem TSistockItem) {
		this.TSistockItem = TSistockItem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GRInvoiceID_N")
	public TInInvoice getTInInvoice() {
		return this.TInInvoice;
	}

	public void setTInInvoice(TInInvoice TInInvoice) {
		this.TInInvoice = TInInvoice;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GRCustID", nullable = false)
	public TCuCust getTCuCust() {
		return this.TCuCust;
	}

	public void setTCuCust(TCuCust TCuCust) {
		this.TCuCust = TCuCust;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "GRCreationDate", length = 23)
	public Date getGrcreationDate() {
		return this.grcreationDate;
	}

	public void setGrcreationDate(Date grcreationDate) {
		this.grcreationDate = grcreationDate;
	}

}
