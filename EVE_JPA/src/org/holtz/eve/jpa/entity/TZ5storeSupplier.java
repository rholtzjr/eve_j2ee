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
 * TZ5storeSupplier generated by hbm2java
 */
@Entity
@Table(name = "T_Z5StoreSupplier")
public class TZ5storeSupplier implements java.io.Serializable {

	private TZ5storeSupplierId id;
	private TSoStore TSoStore;
	private TSuSupplier TSuSupplier;
	private TTbtaxBand TTbtaxBand;
	private String z5customerNoN;
	private String z5accountNoN;
	private String z5defShippingInstructionsN;
	private String z5defPaymentTermsN;
	private short z5costPriceLevelIn;
	private Date z5lastReStockDate;
	private String z5custSuffixTxN;

	public TZ5storeSupplier() {
	}

	public TZ5storeSupplier(TZ5storeSupplierId id, TSoStore TSoStore, TSuSupplier TSuSupplier, TTbtaxBand TTbtaxBand,
			short z5costPriceLevelIn, Date z5lastReStockDate) {
		this.id = id;
		this.TSoStore = TSoStore;
		this.TSuSupplier = TSuSupplier;
		this.TTbtaxBand = TTbtaxBand;
		this.z5costPriceLevelIn = z5costPriceLevelIn;
		this.z5lastReStockDate = z5lastReStockDate;
	}

	public TZ5storeSupplier(TZ5storeSupplierId id, TSoStore TSoStore, TSuSupplier TSuSupplier, TTbtaxBand TTbtaxBand,
			String z5customerNoN, String z5accountNoN, String z5defShippingInstructionsN,
			String z5defPaymentTermsN, short z5costPriceLevelIn, Date z5lastReStockDate,
			String z5custSuffixTxN) {
		this.id = id;
		this.TSoStore = TSoStore;
		this.TSuSupplier = TSuSupplier;
		this.TTbtaxBand = TTbtaxBand;
		this.z5customerNoN = z5customerNoN;
		this.z5accountNoN = z5accountNoN;
		this.z5defShippingInstructionsN = z5defShippingInstructionsN;
		this.z5defPaymentTermsN = z5defPaymentTermsN;
		this.z5costPriceLevelIn = z5costPriceLevelIn;
		this.z5lastReStockDate = z5lastReStockDate;
		this.z5custSuffixTxN = z5custSuffixTxN;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "z5supplierId", column = @Column(name = "Z5SupplierID", nullable = false)),
			@AttributeOverride(name = "z5storeId", column = @Column(name = "Z5StoreID", nullable = false)) })
	public TZ5storeSupplierId getId() {
		return this.id;
	}

	public void setId(TZ5storeSupplierId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Z5StoreID", nullable = false, insertable = false, updatable = false)
	public TSoStore getTSoStore() {
		return this.TSoStore;
	}

	public void setTSoStore(TSoStore TSoStore) {
		this.TSoStore = TSoStore;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Z5SupplierID", nullable = false, insertable = false, updatable = false)
	public TSuSupplier getTSuSupplier() {
		return this.TSuSupplier;
	}

	public void setTSuSupplier(TSuSupplier TSuSupplier) {
		this.TSuSupplier = TSuSupplier;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Z5PurchaseTaxBandID", nullable = false)
	public TTbtaxBand getTTbtaxBand() {
		return this.TTbtaxBand;
	}

	public void setTTbtaxBand(TTbtaxBand TTbtaxBand) {
		this.TTbtaxBand = TTbtaxBand;
	}

	@Column(name = "Z5CustomerNo_N")
	public String getZ5customerNoN() {
		return this.z5customerNoN;
	}

	public void setZ5customerNoN(String z5customerNoN) {
		this.z5customerNoN = z5customerNoN;
	}

	@Column(name = "Z5AccountNo_N")
	public String getZ5accountNoN() {
		return this.z5accountNoN;
	}

	public void setZ5accountNoN(String z5accountNoN) {
		this.z5accountNoN = z5accountNoN;
	}

	@Column(name = "Z5DefShippingInstructions_N")
	public String getZ5defShippingInstructionsN() {
		return this.z5defShippingInstructionsN;
	}

	public void setZ5defShippingInstructionsN(String z5defShippingInstructionsN) {
		this.z5defShippingInstructionsN = z5defShippingInstructionsN;
	}

	@Column(name = "Z5DefPaymentTerms_N")
	public String getZ5defPaymentTermsN() {
		return this.z5defPaymentTermsN;
	}

	public void setZ5defPaymentTermsN(String z5defPaymentTermsN) {
		this.z5defPaymentTermsN = z5defPaymentTermsN;
	}

	@Column(name = "Z5CostPriceLevelIn", nullable = false)
	public short getZ5costPriceLevelIn() {
		return this.z5costPriceLevelIn;
	}

	public void setZ5costPriceLevelIn(short z5costPriceLevelIn) {
		this.z5costPriceLevelIn = z5costPriceLevelIn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Z5LastReStockDate", nullable = false, length = 23)
	public Date getZ5lastReStockDate() {
		return this.z5lastReStockDate;
	}

	public void setZ5lastReStockDate(Date z5lastReStockDate) {
		this.z5lastReStockDate = z5lastReStockDate;
	}

	@Column(name = "Z5CustSuffixTx_N")
	public String getZ5custSuffixTxN() {
		return this.z5custSuffixTxN;
	}

	public void setZ5custSuffixTxN(String z5custSuffixTxN) {
		this.z5custSuffixTxN = z5custSuffixTxN;
	}

}
