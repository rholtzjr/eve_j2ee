package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * TDbdiscountBand generated by hbm2java
 */
@Entity
@Table(name = "T_DBDiscountBand", uniqueConstraints = @UniqueConstraint(columnNames = "DBDiscountBandTx"))
public class TDbdiscountBand implements java.io.Serializable {

	private int dbdiscountBandId;
	private String dbdiscountBandTx;
	private String dbformulaTx;
	private String dbminTxN;
	private boolean dbunavailableBl;
	private Date dblastUpdatedDate;
	private boolean dbrequiredBl;
	private Date dbcreationDate;
	private boolean dbforManualUseBl;
	private int dbprivLevelIn;
	private Set<TIiinvoiceItem> TIiinvoiceItems = new HashSet<TIiinvoiceItem>(0);
	private Set<TVivoucherItem> TVivoucherItems = new HashSet<TVivoucherItem>(0);
	private Set<TZlStoreStockItem> TZlStoreStockItems = new HashSet<TZlStoreStockItem>(0);
	private Set<TCvCustTypeDiscountBand> TCvCustTypeDiscountBands = new HashSet<TCvCustTypeDiscountBand>(0);
	private Set<TStstockType> TStstockTypes = new HashSet<TStstockType>(0);
	private Set<TQiquoteItem> TQiquoteItems = new HashSet<TQiquoteItem>(0);
	private Set<TPgPackage> TPgPackages = new HashSet<TPgPackage>(0);

	public TDbdiscountBand() {
	}

	public TDbdiscountBand(int dbdiscountBandId, String dbdiscountBandTx, String dbformulaTx,
			boolean dbunavailableBl, Date dblastUpdatedDate, boolean dbrequiredBl, Date dbcreationDate,
			boolean dbforManualUseBl, int dbprivLevelIn) {
		this.dbdiscountBandId = dbdiscountBandId;
		this.dbdiscountBandTx = dbdiscountBandTx;
		this.dbformulaTx = dbformulaTx;
		this.dbunavailableBl = dbunavailableBl;
		this.dblastUpdatedDate = dblastUpdatedDate;
		this.dbrequiredBl = dbrequiredBl;
		this.dbcreationDate = dbcreationDate;
		this.dbforManualUseBl = dbforManualUseBl;
		this.dbprivLevelIn = dbprivLevelIn;
	}

	public TDbdiscountBand(int dbdiscountBandId, String dbdiscountBandTx, String dbformulaTx,
			String dbminTxN, boolean dbunavailableBl, Date dblastUpdatedDate, boolean dbrequiredBl,
			Date dbcreationDate, boolean dbforManualUseBl, int dbprivLevelIn, Set<TIiinvoiceItem> TIiinvoiceItems,
			Set<TVivoucherItem> TVivoucherItems, Set<TZlStoreStockItem> TZlStoreStockItems,
			Set<TCvCustTypeDiscountBand> TCvCustTypeDiscountBands, Set<TStstockType> TStstockTypes,
			Set<TQiquoteItem> TQiquoteItems, Set<TPgPackage> TPgPackages) {
		this.dbdiscountBandId = dbdiscountBandId;
		this.dbdiscountBandTx = dbdiscountBandTx;
		this.dbformulaTx = dbformulaTx;
		this.dbminTxN = dbminTxN;
		this.dbunavailableBl = dbunavailableBl;
		this.dblastUpdatedDate = dblastUpdatedDate;
		this.dbrequiredBl = dbrequiredBl;
		this.dbcreationDate = dbcreationDate;
		this.dbforManualUseBl = dbforManualUseBl;
		this.dbprivLevelIn = dbprivLevelIn;
		this.TIiinvoiceItems = TIiinvoiceItems;
		this.TVivoucherItems = TVivoucherItems;
		this.TZlStoreStockItems = TZlStoreStockItems;
		this.TCvCustTypeDiscountBands = TCvCustTypeDiscountBands;
		this.TStstockTypes = TStstockTypes;
		this.TQiquoteItems = TQiquoteItems;
		this.TPgPackages = TPgPackages;
	}

	@Id

	@Column(name = "DBDiscountBandID", unique = true, nullable = false)
	public int getDbdiscountBandId() {
		return this.dbdiscountBandId;
	}

	public void setDbdiscountBandId(int dbdiscountBandId) {
		this.dbdiscountBandId = dbdiscountBandId;
	}

	@Column(name = "DBDiscountBandTx", unique = true, nullable = false)
	public String getDbdiscountBandTx() {
		return this.dbdiscountBandTx;
	}

	public void setDbdiscountBandTx(String dbdiscountBandTx) {
		this.dbdiscountBandTx = dbdiscountBandTx;
	}

	@Column(name = "DBFormulaTx", nullable = false)
	public String getDbformulaTx() {
		return this.dbformulaTx;
	}

	public void setDbformulaTx(String dbformulaTx) {
		this.dbformulaTx = dbformulaTx;
	}

	@Column(name = "DBMinTx_N")
	public String getDbminTxN() {
		return this.dbminTxN;
	}

	public void setDbminTxN(String dbminTxN) {
		this.dbminTxN = dbminTxN;
	}

	@Column(name = "DBUnavailableBl", nullable = false)
	public boolean isDbunavailableBl() {
		return this.dbunavailableBl;
	}

	public void setDbunavailableBl(boolean dbunavailableBl) {
		this.dbunavailableBl = dbunavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DBLastUpdatedDate", nullable = false, length = 23)
	public Date getDblastUpdatedDate() {
		return this.dblastUpdatedDate;
	}

	public void setDblastUpdatedDate(Date dblastUpdatedDate) {
		this.dblastUpdatedDate = dblastUpdatedDate;
	}

	@Column(name = "DBRequiredBl", nullable = false)
	public boolean isDbrequiredBl() {
		return this.dbrequiredBl;
	}

	public void setDbrequiredBl(boolean dbrequiredBl) {
		this.dbrequiredBl = dbrequiredBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DBCreationDate", nullable = false, length = 23)
	public Date getDbcreationDate() {
		return this.dbcreationDate;
	}

	public void setDbcreationDate(Date dbcreationDate) {
		this.dbcreationDate = dbcreationDate;
	}

	@Column(name = "DBForManualUseBl", nullable = false)
	public boolean isDbforManualUseBl() {
		return this.dbforManualUseBl;
	}

	public void setDbforManualUseBl(boolean dbforManualUseBl) {
		this.dbforManualUseBl = dbforManualUseBl;
	}

	@Column(name = "DBPrivLevelIn", nullable = false)
	public int getDbprivLevelIn() {
		return this.dbprivLevelIn;
	}

	public void setDbprivLevelIn(int dbprivLevelIn) {
		this.dbprivLevelIn = dbprivLevelIn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDbdiscountBand")
	public Set<TIiinvoiceItem> getTIiinvoiceItems() {
		return this.TIiinvoiceItems;
	}

	public void setTIiinvoiceItems(Set<TIiinvoiceItem> TIiinvoiceItems) {
		this.TIiinvoiceItems = TIiinvoiceItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDbdiscountBand")
	public Set<TVivoucherItem> getTVivoucherItems() {
		return this.TVivoucherItems;
	}

	public void setTVivoucherItems(Set<TVivoucherItem> TVivoucherItems) {
		this.TVivoucherItems = TVivoucherItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDbdiscountBand")
	public Set<TZlStoreStockItem> getTZlStoreStockItems() {
		return this.TZlStoreStockItems;
	}

	public void setTZlStoreStockItems(Set<TZlStoreStockItem> TZlStoreStockItems) {
		this.TZlStoreStockItems = TZlStoreStockItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDbdiscountBand")
	public Set<TCvCustTypeDiscountBand> getTCvCustTypeDiscountBands() {
		return this.TCvCustTypeDiscountBands;
	}

	public void setTCvCustTypeDiscountBands(Set<TCvCustTypeDiscountBand> TCvCustTypeDiscountBands) {
		this.TCvCustTypeDiscountBands = TCvCustTypeDiscountBands;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDbdiscountBand")
	public Set<TStstockType> getTStstockTypes() {
		return this.TStstockTypes;
	}

	public void setTStstockTypes(Set<TStstockType> TStstockTypes) {
		this.TStstockTypes = TStstockTypes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDbdiscountBand")
	public Set<TQiquoteItem> getTQiquoteItems() {
		return this.TQiquoteItems;
	}

	public void setTQiquoteItems(Set<TQiquoteItem> TQiquoteItems) {
		this.TQiquoteItems = TQiquoteItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDbdiscountBand")
	public Set<TPgPackage> getTPgPackages() {
		return this.TPgPackages;
	}

	public void setTPgPackages(Set<TPgPackage> TPgPackages) {
		this.TPgPackages = TPgPackages;
	}

}
