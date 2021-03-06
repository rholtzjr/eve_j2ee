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
 * TSpservicePart generated by hbm2java
 */
@Entity
@Table(name = "T_SPServicePart")
public class TSpservicePart implements java.io.Serializable {

	private int spservicePartId;
	private TSgServiceBookingItem TSgServiceBookingItem;
	private TSistockItem TSistockItem;
	private TTbtaxBand TTbtaxBand;
	private String spserialNoTxN;
	private short spqtyIn;
	private String spwarantyNoTxN;
	private double spunitPriceMn;
	private double sppriceMn;
	private double sptaxMn;
	private double spcostPriceMn;
	private float sptaxRateFl;
	private short spcurrencyId;
	private float spexchangeRateFl;
	private Date spwarantyDateN;
	private Date splastUpdatedDate;

	public TSpservicePart() {
	}

	public TSpservicePart(int spservicePartId, TSgServiceBookingItem TSgServiceBookingItem, TSistockItem TSistockItem,
			TTbtaxBand TTbtaxBand, short spqtyIn, double spunitPriceMn, double sppriceMn, double sptaxMn,
			double spcostPriceMn, float sptaxRateFl, short spcurrencyId, float spexchangeRateFl,
			Date splastUpdatedDate) {
		this.spservicePartId = spservicePartId;
		this.TSgServiceBookingItem = TSgServiceBookingItem;
		this.TSistockItem = TSistockItem;
		this.TTbtaxBand = TTbtaxBand;
		this.spqtyIn = spqtyIn;
		this.spunitPriceMn = spunitPriceMn;
		this.sppriceMn = sppriceMn;
		this.sptaxMn = sptaxMn;
		this.spcostPriceMn = spcostPriceMn;
		this.sptaxRateFl = sptaxRateFl;
		this.spcurrencyId = spcurrencyId;
		this.spexchangeRateFl = spexchangeRateFl;
		this.splastUpdatedDate = splastUpdatedDate;
	}

	public TSpservicePart(int spservicePartId, TSgServiceBookingItem TSgServiceBookingItem, TSistockItem TSistockItem,
			TTbtaxBand TTbtaxBand, String spserialNoTxN, short spqtyIn, String spwarantyNoTxN,
			double spunitPriceMn, double sppriceMn, double sptaxMn, double spcostPriceMn, float sptaxRateFl,
			short spcurrencyId, float spexchangeRateFl, Date spwarantyDateN, Date splastUpdatedDate) {
		this.spservicePartId = spservicePartId;
		this.TSgServiceBookingItem = TSgServiceBookingItem;
		this.TSistockItem = TSistockItem;
		this.TTbtaxBand = TTbtaxBand;
		this.spserialNoTxN = spserialNoTxN;
		this.spqtyIn = spqtyIn;
		this.spwarantyNoTxN = spwarantyNoTxN;
		this.spunitPriceMn = spunitPriceMn;
		this.sppriceMn = sppriceMn;
		this.sptaxMn = sptaxMn;
		this.spcostPriceMn = spcostPriceMn;
		this.sptaxRateFl = sptaxRateFl;
		this.spcurrencyId = spcurrencyId;
		this.spexchangeRateFl = spexchangeRateFl;
		this.spwarantyDateN = spwarantyDateN;
		this.splastUpdatedDate = splastUpdatedDate;
	}

	@Id

	@Column(name = "SPServicePartID", unique = true, nullable = false)
	public int getSpservicePartId() {
		return this.spservicePartId;
	}

	public void setSpservicePartId(int spservicePartId) {
		this.spservicePartId = spservicePartId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SPServiceBookingItemID", nullable = false)
	public TSgServiceBookingItem getTSgServiceBookingItem() {
		return this.TSgServiceBookingItem;
	}

	public void setTSgServiceBookingItem(TSgServiceBookingItem TSgServiceBookingItem) {
		this.TSgServiceBookingItem = TSgServiceBookingItem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SPStockItemID", nullable = false)
	public TSistockItem getTSistockItem() {
		return this.TSistockItem;
	}

	public void setTSistockItem(TSistockItem TSistockItem) {
		this.TSistockItem = TSistockItem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SPTaxBandID", nullable = false)
	public TTbtaxBand getTTbtaxBand() {
		return this.TTbtaxBand;
	}

	public void setTTbtaxBand(TTbtaxBand TTbtaxBand) {
		this.TTbtaxBand = TTbtaxBand;
	}

	@Column(name = "SPSerialNoTx_N")
	public String getSpserialNoTxN() {
		return this.spserialNoTxN;
	}

	public void setSpserialNoTxN(String spserialNoTxN) {
		this.spserialNoTxN = spserialNoTxN;
	}

	@Column(name = "SPQtyIn", nullable = false)
	public short getSpqtyIn() {
		return this.spqtyIn;
	}

	public void setSpqtyIn(short spqtyIn) {
		this.spqtyIn = spqtyIn;
	}

	@Column(name = "SPWarantyNoTx_N")
	public String getSpwarantyNoTxN() {
		return this.spwarantyNoTxN;
	}

	public void setSpwarantyNoTxN(String spwarantyNoTxN) {
		this.spwarantyNoTxN = spwarantyNoTxN;
	}

	@Column(name = "SPUnitPriceMn", nullable = false, precision = 53, scale = 0)
	public double getSpunitPriceMn() {
		return this.spunitPriceMn;
	}

	public void setSpunitPriceMn(double spunitPriceMn) {
		this.spunitPriceMn = spunitPriceMn;
	}

	@Column(name = "SPPriceMn", nullable = false, precision = 53, scale = 0)
	public double getSppriceMn() {
		return this.sppriceMn;
	}

	public void setSppriceMn(double sppriceMn) {
		this.sppriceMn = sppriceMn;
	}

	@Column(name = "SPTaxMn", nullable = false, precision = 53, scale = 0)
	public double getSptaxMn() {
		return this.sptaxMn;
	}

	public void setSptaxMn(double sptaxMn) {
		this.sptaxMn = sptaxMn;
	}

	@Column(name = "SPCostPriceMn", nullable = false, precision = 53, scale = 0)
	public double getSpcostPriceMn() {
		return this.spcostPriceMn;
	}

	public void setSpcostPriceMn(double spcostPriceMn) {
		this.spcostPriceMn = spcostPriceMn;
	}

	@Column(name = "SPTaxRateFl", nullable = false, precision = 24, scale = 0)
	public float getSptaxRateFl() {
		return this.sptaxRateFl;
	}

	public void setSptaxRateFl(float sptaxRateFl) {
		this.sptaxRateFl = sptaxRateFl;
	}

	@Column(name = "SPCurrencyID", nullable = false)
	public short getSpcurrencyId() {
		return this.spcurrencyId;
	}

	public void setSpcurrencyId(short spcurrencyId) {
		this.spcurrencyId = spcurrencyId;
	}

	@Column(name = "SPExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getSpexchangeRateFl() {
		return this.spexchangeRateFl;
	}

	public void setSpexchangeRateFl(float spexchangeRateFl) {
		this.spexchangeRateFl = spexchangeRateFl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPWarantyDate_N", length = 23)
	public Date getSpwarantyDateN() {
		return this.spwarantyDateN;
	}

	public void setSpwarantyDateN(Date spwarantyDateN) {
		this.spwarantyDateN = spwarantyDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPLastUpdatedDate", nullable = false, length = 23)
	public Date getSplastUpdatedDate() {
		return this.splastUpdatedDate;
	}

	public void setSplastUpdatedDate(Date splastUpdatedDate) {
		this.splastUpdatedDate = splastUpdatedDate;
	}

}
