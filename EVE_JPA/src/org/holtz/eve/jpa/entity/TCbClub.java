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
 * TCbClub generated by hbm2java
 */
@Entity
@Table(name = "T_CbClub", uniqueConstraints = @UniqueConstraint(columnNames = { "CbRegionID", "CbClubNameTx" }))
public class TCbClub implements java.io.Serializable {

	private int cbClubId;
	private String cbClubNameTx;
	private int cbRegionId;
	private String cbPoolTimeTxN;
	private String cbPoolLocationTxN;
	private String cbDryTimeTxN;
	private String cbDryLocationTxN;
	private Short cbYearPaidInN;
	private String cbClubOpenTxN;
	private String cbNotesTxN;
	private boolean cbUnavailableBl;
	private Date cbCertificatePrintedDate;
	private Date cbLastUpdatedDate;
	private boolean cbRequiredBl;
	private Date cbCreationDate;
	private int cbNextMemberNoIn;
	private boolean cbEolclubBl;
	private Set<TCfCustClub> TCfCustClubs = new HashSet<TCfCustClub>(0);
	private Set<TS0stockClub> TS0stockClubs = new HashSet<TS0stockClub>(0);
	private Set<TSistockItem> TSistockItems = new HashSet<TSistockItem>(0);
	private Set<TSoStore> TSoStores = new HashSet<TSoStore>(0);

	public TCbClub() {
	}

	public TCbClub(int cbClubId, String cbClubNameTx, int cbRegionId, boolean cbUnavailableBl,
			Date cbCertificatePrintedDate, Date cbLastUpdatedDate, boolean cbRequiredBl, Date cbCreationDate,
			int cbNextMemberNoIn, boolean cbEolclubBl) {
		this.cbClubId = cbClubId;
		this.cbClubNameTx = cbClubNameTx;
		this.cbRegionId = cbRegionId;
		this.cbUnavailableBl = cbUnavailableBl;
		this.cbCertificatePrintedDate = cbCertificatePrintedDate;
		this.cbLastUpdatedDate = cbLastUpdatedDate;
		this.cbRequiredBl = cbRequiredBl;
		this.cbCreationDate = cbCreationDate;
		this.cbNextMemberNoIn = cbNextMemberNoIn;
		this.cbEolclubBl = cbEolclubBl;
	}

	public TCbClub(int cbClubId, String cbClubNameTx, int cbRegionId, String cbPoolTimeTxN,
			String cbPoolLocationTxN, String cbDryTimeTxN, String cbDryLocationTxN,
			Short cbYearPaidInN, String cbClubOpenTxN, String cbNotesTxN, boolean cbUnavailableBl,
			Date cbCertificatePrintedDate, Date cbLastUpdatedDate, boolean cbRequiredBl, Date cbCreationDate,
			int cbNextMemberNoIn, boolean cbEolclubBl, Set<TCfCustClub> TCfCustClubs, Set<TS0stockClub> TS0stockClubs,
			Set<TSistockItem> TSistockItems, Set<TSoStore> TSoStores) {
		this.cbClubId = cbClubId;
		this.cbClubNameTx = cbClubNameTx;
		this.cbRegionId = cbRegionId;
		this.cbPoolTimeTxN = cbPoolTimeTxN;
		this.cbPoolLocationTxN = cbPoolLocationTxN;
		this.cbDryTimeTxN = cbDryTimeTxN;
		this.cbDryLocationTxN = cbDryLocationTxN;
		this.cbYearPaidInN = cbYearPaidInN;
		this.cbClubOpenTxN = cbClubOpenTxN;
		this.cbNotesTxN = cbNotesTxN;
		this.cbUnavailableBl = cbUnavailableBl;
		this.cbCertificatePrintedDate = cbCertificatePrintedDate;
		this.cbLastUpdatedDate = cbLastUpdatedDate;
		this.cbRequiredBl = cbRequiredBl;
		this.cbCreationDate = cbCreationDate;
		this.cbNextMemberNoIn = cbNextMemberNoIn;
		this.cbEolclubBl = cbEolclubBl;
		this.TCfCustClubs = TCfCustClubs;
		this.TS0stockClubs = TS0stockClubs;
		this.TSistockItems = TSistockItems;
		this.TSoStores = TSoStores;
	}

	@Id

	@Column(name = "CbClubID", unique = true, nullable = false)
	public int getCbClubId() {
		return this.cbClubId;
	}

	public void setCbClubId(int cbClubId) {
		this.cbClubId = cbClubId;
	}

	@Column(name = "CbClubNameTx", nullable = false)
	public String getCbClubNameTx() {
		return this.cbClubNameTx;
	}

	public void setCbClubNameTx(String cbClubNameTx) {
		this.cbClubNameTx = cbClubNameTx;
	}

	@Column(name = "CbRegionID", nullable = false)
	public int getCbRegionId() {
		return this.cbRegionId;
	}

	public void setCbRegionId(int cbRegionId) {
		this.cbRegionId = cbRegionId;
	}

	@Column(name = "CbPoolTimeTx_N")
	public String getCbPoolTimeTxN() {
		return this.cbPoolTimeTxN;
	}

	public void setCbPoolTimeTxN(String cbPoolTimeTxN) {
		this.cbPoolTimeTxN = cbPoolTimeTxN;
	}

	@Column(name = "CbPoolLocationTx_N")
	public String getCbPoolLocationTxN() {
		return this.cbPoolLocationTxN;
	}

	public void setCbPoolLocationTxN(String cbPoolLocationTxN) {
		this.cbPoolLocationTxN = cbPoolLocationTxN;
	}

	@Column(name = "CbDryTimeTx_N")
	public String getCbDryTimeTxN() {
		return this.cbDryTimeTxN;
	}

	public void setCbDryTimeTxN(String cbDryTimeTxN) {
		this.cbDryTimeTxN = cbDryTimeTxN;
	}

	@Column(name = "CbDryLocationTx_N")
	public String getCbDryLocationTxN() {
		return this.cbDryLocationTxN;
	}

	public void setCbDryLocationTxN(String cbDryLocationTxN) {
		this.cbDryLocationTxN = cbDryLocationTxN;
	}

	@Column(name = "CbYearPaidIn_N")
	public Short getCbYearPaidInN() {
		return this.cbYearPaidInN;
	}

	public void setCbYearPaidInN(Short cbYearPaidInN) {
		this.cbYearPaidInN = cbYearPaidInN;
	}

	@Column(name = "CbClubOpenTx_N")
	public String getCbClubOpenTxN() {
		return this.cbClubOpenTxN;
	}

	public void setCbClubOpenTxN(String cbClubOpenTxN) {
		this.cbClubOpenTxN = cbClubOpenTxN;
	}

	@Column(name = "CbNotesTx_N")
	public String getCbNotesTxN() {
		return this.cbNotesTxN;
	}

	public void setCbNotesTxN(String cbNotesTxN) {
		this.cbNotesTxN = cbNotesTxN;
	}

	@Column(name = "CbUnavailableBl", nullable = false)
	public boolean isCbUnavailableBl() {
		return this.cbUnavailableBl;
	}

	public void setCbUnavailableBl(boolean cbUnavailableBl) {
		this.cbUnavailableBl = cbUnavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CbCertificatePrintedDate", nullable = false, length = 23)
	public Date getCbCertificatePrintedDate() {
		return this.cbCertificatePrintedDate;
	}

	public void setCbCertificatePrintedDate(Date cbCertificatePrintedDate) {
		this.cbCertificatePrintedDate = cbCertificatePrintedDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CbLastUpdatedDate", nullable = false, length = 23)
	public Date getCbLastUpdatedDate() {
		return this.cbLastUpdatedDate;
	}

	public void setCbLastUpdatedDate(Date cbLastUpdatedDate) {
		this.cbLastUpdatedDate = cbLastUpdatedDate;
	}

	@Column(name = "CbRequiredBl", nullable = false)
	public boolean isCbRequiredBl() {
		return this.cbRequiredBl;
	}

	public void setCbRequiredBl(boolean cbRequiredBl) {
		this.cbRequiredBl = cbRequiredBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CbCreationDate", nullable = false, length = 23)
	public Date getCbCreationDate() {
		return this.cbCreationDate;
	}

	public void setCbCreationDate(Date cbCreationDate) {
		this.cbCreationDate = cbCreationDate;
	}

	@Column(name = "CbNextMemberNoIn", nullable = false)
	public int getCbNextMemberNoIn() {
		return this.cbNextMemberNoIn;
	}

	public void setCbNextMemberNoIn(int cbNextMemberNoIn) {
		this.cbNextMemberNoIn = cbNextMemberNoIn;
	}

	@Column(name = "CbEOLClubBl", nullable = false)
	public boolean isCbEolclubBl() {
		return this.cbEolclubBl;
	}

	public void setCbEolclubBl(boolean cbEolclubBl) {
		this.cbEolclubBl = cbEolclubBl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCbClub")
	public Set<TCfCustClub> getTCfCustClubs() {
		return this.TCfCustClubs;
	}

	public void setTCfCustClubs(Set<TCfCustClub> TCfCustClubs) {
		this.TCfCustClubs = TCfCustClubs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCbClub")
	public Set<TS0stockClub> getTS0stockClubs() {
		return this.TS0stockClubs;
	}

	public void setTS0stockClubs(Set<TS0stockClub> TS0stockClubs) {
		this.TS0stockClubs = TS0stockClubs;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_CQClubStockItem", joinColumns = {
			@JoinColumn(name = "CQClubId", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "CQStockItemId", nullable = false, updatable = false) })
	public Set<TSistockItem> getTSistockItems() {
		return this.TSistockItems;
	}

	public void setTSistockItems(Set<TSistockItem> TSistockItems) {
		this.TSistockItems = TSistockItems;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_Z3StoreClub", joinColumns = {
			@JoinColumn(name = "Z3ClubID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Z3StoreID", nullable = false, updatable = false) })
	public Set<TSoStore> getTSoStores() {
		return this.TSoStores;
	}

	public void setTSoStores(Set<TSoStore> TSoStores) {
		this.TSoStores = TSoStores;
	}

}
