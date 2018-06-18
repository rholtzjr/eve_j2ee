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
import javax.persistence.UniqueConstraint;

/**
 * TMimultiSaleItem generated by hbm2java
 */
@Entity
@Table(name = "T_MIMultiSaleItem", uniqueConstraints = @UniqueConstraint(columnNames = { "MIMultiSaleID",
		"MINumberIn" }))
public class TMimultiSaleItem implements java.io.Serializable {

	private int mimultiSaleItemId;
	private TMeMultiSale TMeMultiSale;
	private int minumberIn;
	private Date miusedDateN;
	private Date milastUpdatedDate;
	private String minotes1txN;
	private String minotes2txN;

	public TMimultiSaleItem() {
	}

	public TMimultiSaleItem(int mimultiSaleItemId, TMeMultiSale TMeMultiSale, int minumberIn) {
		this.mimultiSaleItemId = mimultiSaleItemId;
		this.TMeMultiSale = TMeMultiSale;
		this.minumberIn = minumberIn;
	}

	public TMimultiSaleItem(int mimultiSaleItemId, TMeMultiSale TMeMultiSale, int minumberIn, Date miusedDateN,
			Date milastUpdatedDate, String minotes1txN, String minotes2txN) {
		this.mimultiSaleItemId = mimultiSaleItemId;
		this.TMeMultiSale = TMeMultiSale;
		this.minumberIn = minumberIn;
		this.miusedDateN = miusedDateN;
		this.milastUpdatedDate = milastUpdatedDate;
		this.minotes1txN = minotes1txN;
		this.minotes2txN = minotes2txN;
	}

	@Id

	@Column(name = "MIMultiSaleItemID", unique = true, nullable = false)
	public int getMimultiSaleItemId() {
		return this.mimultiSaleItemId;
	}

	public void setMimultiSaleItemId(int mimultiSaleItemId) {
		this.mimultiSaleItemId = mimultiSaleItemId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MIMultiSaleID", nullable = false)
	public TMeMultiSale getTMeMultiSale() {
		return this.TMeMultiSale;
	}

	public void setTMeMultiSale(TMeMultiSale TMeMultiSale) {
		this.TMeMultiSale = TMeMultiSale;
	}

	@Column(name = "MINumberIn", nullable = false)
	public int getMinumberIn() {
		return this.minumberIn;
	}

	public void setMinumberIn(int minumberIn) {
		this.minumberIn = minumberIn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MIUsedDate_N", length = 23)
	public Date getMiusedDateN() {
		return this.miusedDateN;
	}

	public void setMiusedDateN(Date miusedDateN) {
		this.miusedDateN = miusedDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MILastUpdatedDate", length = 23)
	public Date getMilastUpdatedDate() {
		return this.milastUpdatedDate;
	}

	public void setMilastUpdatedDate(Date milastUpdatedDate) {
		this.milastUpdatedDate = milastUpdatedDate;
	}

	@Column(name = "MINotes1Tx_N")
	public String getMinotes1txN() {
		return this.minotes1txN;
	}

	public void setMinotes1txN(String minotes1txN) {
		this.minotes1txN = minotes1txN;
	}

	@Column(name = "MINotes2Tx_N")
	public String getMinotes2txN() {
		return this.minotes2txN;
	}

	public void setMinotes2txN(String minotes2txN) {
		this.minotes2txN = minotes2txN;
	}

}
