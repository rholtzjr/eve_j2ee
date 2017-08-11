package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * TChCustType generated by hbm2java
 */
@Entity
@Table(name = "T_ChCustType", uniqueConstraints = @UniqueConstraint(columnNames = "ChCustTypeTx"))
public class TChCustType implements java.io.Serializable {

	private int chCustTypeId;
	private String chCustTypeTx;
	private boolean chDiscountableBl;
	private boolean chCourseRoleBl;
	private boolean chTripRoleBl;
	private boolean chUnavailableBl;
	private Date chLastUpdatedDate;
	private boolean chRequiredBl;
	private Date chCreationDate;
	private boolean chEmployeeBl;
	private boolean chTripCustTypeBl;
	private String chInvoiceTextTxN;
	private boolean chSupportStaffBl;
	private Set<TC4custCustType> TC4custCustTypes = new HashSet<TC4custCustType>(0);
	private Set<TSoStore> TSoStores = new HashSet<TSoStore>(0);
	private Set<TRpretailPrice> TRpretailPrices = new HashSet<TRpretailPrice>(0);
	private Set<TCvCustTypeDiscountBand> TCvCustTypeDiscountBands = new HashSet<TCvCustTypeDiscountBand>(0);
	private Set<TErempRole> TErempRoles = new HashSet<TErempRole>(0);

	public TChCustType() {
	}

	public TChCustType(int chCustTypeId, String chCustTypeTx, boolean chDiscountableBl, boolean chCourseRoleBl,
			boolean chTripRoleBl, boolean chUnavailableBl, Date chLastUpdatedDate, boolean chRequiredBl,
			Date chCreationDate, boolean chEmployeeBl, boolean chTripCustTypeBl, boolean chSupportStaffBl) {
		this.chCustTypeId = chCustTypeId;
		this.chCustTypeTx = chCustTypeTx;
		this.chDiscountableBl = chDiscountableBl;
		this.chCourseRoleBl = chCourseRoleBl;
		this.chTripRoleBl = chTripRoleBl;
		this.chUnavailableBl = chUnavailableBl;
		this.chLastUpdatedDate = chLastUpdatedDate;
		this.chRequiredBl = chRequiredBl;
		this.chCreationDate = chCreationDate;
		this.chEmployeeBl = chEmployeeBl;
		this.chTripCustTypeBl = chTripCustTypeBl;
		this.chSupportStaffBl = chSupportStaffBl;
	}

	public TChCustType(int chCustTypeId, String chCustTypeTx, boolean chDiscountableBl, boolean chCourseRoleBl,
			boolean chTripRoleBl, boolean chUnavailableBl, Date chLastUpdatedDate, boolean chRequiredBl,
			Date chCreationDate, boolean chEmployeeBl, boolean chTripCustTypeBl, String chInvoiceTextTxN,
			boolean chSupportStaffBl, Set<TC4custCustType> TC4custCustTypes, Set<TSoStore> TSoStores,
			Set<TRpretailPrice> TRpretailPrices, Set<TCvCustTypeDiscountBand> TCvCustTypeDiscountBands,
			Set<TErempRole> TErempRoles) {
		this.chCustTypeId = chCustTypeId;
		this.chCustTypeTx = chCustTypeTx;
		this.chDiscountableBl = chDiscountableBl;
		this.chCourseRoleBl = chCourseRoleBl;
		this.chTripRoleBl = chTripRoleBl;
		this.chUnavailableBl = chUnavailableBl;
		this.chLastUpdatedDate = chLastUpdatedDate;
		this.chRequiredBl = chRequiredBl;
		this.chCreationDate = chCreationDate;
		this.chEmployeeBl = chEmployeeBl;
		this.chTripCustTypeBl = chTripCustTypeBl;
		this.chInvoiceTextTxN = chInvoiceTextTxN;
		this.chSupportStaffBl = chSupportStaffBl;
		this.TC4custCustTypes = TC4custCustTypes;
		this.TSoStores = TSoStores;
		this.TRpretailPrices = TRpretailPrices;
		this.TCvCustTypeDiscountBands = TCvCustTypeDiscountBands;
		this.TErempRoles = TErempRoles;
	}

	@Id

	@Column(name = "ChCustTypeID", unique = true, nullable = false)
	public int getChCustTypeId() {
		return this.chCustTypeId;
	}

	public void setChCustTypeId(int chCustTypeId) {
		this.chCustTypeId = chCustTypeId;
	}

	@Column(name = "ChCustTypeTx", unique = true, nullable = false)
	public String getChCustTypeTx() {
		return this.chCustTypeTx;
	}

	public void setChCustTypeTx(String chCustTypeTx) {
		this.chCustTypeTx = chCustTypeTx;
	}

	@Column(name = "ChDiscountableBl", nullable = false)
	public boolean isChDiscountableBl() {
		return this.chDiscountableBl;
	}

	public void setChDiscountableBl(boolean chDiscountableBl) {
		this.chDiscountableBl = chDiscountableBl;
	}

	@Column(name = "ChCourseRoleBl", nullable = false)
	public boolean isChCourseRoleBl() {
		return this.chCourseRoleBl;
	}

	public void setChCourseRoleBl(boolean chCourseRoleBl) {
		this.chCourseRoleBl = chCourseRoleBl;
	}

	@Column(name = "ChTripRoleBl", nullable = false)
	public boolean isChTripRoleBl() {
		return this.chTripRoleBl;
	}

	public void setChTripRoleBl(boolean chTripRoleBl) {
		this.chTripRoleBl = chTripRoleBl;
	}

	@Column(name = "ChUnavailableBl", nullable = false)
	public boolean isChUnavailableBl() {
		return this.chUnavailableBl;
	}

	public void setChUnavailableBl(boolean chUnavailableBl) {
		this.chUnavailableBl = chUnavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ChLastUpdatedDate", nullable = false, length = 23)
	public Date getChLastUpdatedDate() {
		return this.chLastUpdatedDate;
	}

	public void setChLastUpdatedDate(Date chLastUpdatedDate) {
		this.chLastUpdatedDate = chLastUpdatedDate;
	}

	@Column(name = "ChRequiredBl", nullable = false)
	public boolean isChRequiredBl() {
		return this.chRequiredBl;
	}

	public void setChRequiredBl(boolean chRequiredBl) {
		this.chRequiredBl = chRequiredBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ChCreationDate", nullable = false, length = 23)
	public Date getChCreationDate() {
		return this.chCreationDate;
	}

	public void setChCreationDate(Date chCreationDate) {
		this.chCreationDate = chCreationDate;
	}

	@Column(name = "ChEmployeeBl", nullable = false)
	public boolean isChEmployeeBl() {
		return this.chEmployeeBl;
	}

	public void setChEmployeeBl(boolean chEmployeeBl) {
		this.chEmployeeBl = chEmployeeBl;
	}

	@Column(name = "ChTripCustTypeBl", nullable = false)
	public boolean isChTripCustTypeBl() {
		return this.chTripCustTypeBl;
	}

	public void setChTripCustTypeBl(boolean chTripCustTypeBl) {
		this.chTripCustTypeBl = chTripCustTypeBl;
	}

	@Column(name = "ChInvoiceTextTx_N")
	public String getChInvoiceTextTxN() {
		return this.chInvoiceTextTxN;
	}

	public void setChInvoiceTextTxN(String chInvoiceTextTxN) {
		this.chInvoiceTextTxN = chInvoiceTextTxN;
	}

	@Column(name = "ChSupportStaffBl", nullable = false)
	public boolean isChSupportStaffBl() {
		return this.chSupportStaffBl;
	}

	public void setChSupportStaffBl(boolean chSupportStaffBl) {
		this.chSupportStaffBl = chSupportStaffBl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TChCustType")
	public Set<TC4custCustType> getTC4custCustTypes() {
		return this.TC4custCustTypes;
	}

	public void setTC4custCustTypes(Set<TC4custCustType> TC4custCustTypes) {
		this.TC4custCustTypes = TC4custCustTypes;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_Z7StoreCustType", joinColumns = {
			@JoinColumn(name = "Z7CustTypeID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Z7StoreID", nullable = false, updatable = false) })
	public Set<TSoStore> getTSoStores() {
		return this.TSoStores;
	}

	public void setTSoStores(Set<TSoStore> TSoStores) {
		this.TSoStores = TSoStores;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TChCustType")
	public Set<TRpretailPrice> getTRpretailPrices() {
		return this.TRpretailPrices;
	}

	public void setTRpretailPrices(Set<TRpretailPrice> TRpretailPrices) {
		this.TRpretailPrices = TRpretailPrices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TChCustType")
	public Set<TCvCustTypeDiscountBand> getTCvCustTypeDiscountBands() {
		return this.TCvCustTypeDiscountBands;
	}

	public void setTCvCustTypeDiscountBands(Set<TCvCustTypeDiscountBand> TCvCustTypeDiscountBands) {
		this.TCvCustTypeDiscountBands = TCvCustTypeDiscountBands;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TChCustType")
	public Set<TErempRole> getTErempRoles() {
		return this.TErempRoles;
	}

	public void setTErempRoles(Set<TErempRole> TErempRoles) {
		this.TErempRoles = TErempRoles;
	}

}
