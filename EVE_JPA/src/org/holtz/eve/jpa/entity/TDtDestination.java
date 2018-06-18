package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

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
 * TDtDestination generated by hbm2java
 */
@Entity
@Table(name = "T_DtDestination", uniqueConstraints = @UniqueConstraint(columnNames = "DtDestinationTx"))
public class TDtDestination implements java.io.Serializable {

	private int dtDestinationId;
	private String dtDestinationTx;
	private boolean dtUnavailableBl;
	private String dtVideoTxN;
	private short dtMinNoIn;
	private short dtMaxNoIn;
	private Date dtLastUpdatedDate;
	private boolean dtRequiredBl;
	private Date dtCreationDate;
	private int dtForeColorIn;
	private int dtBackColorIn;
	private String dtPrefixTx;
	private String dtUrltxN;
	private Set<TSyStockTrip> TSyStockTrips = new HashSet<TSyStockTrip>(0);
	private Set<TDiDiveProfile> TDiDiveProfiles = new HashSet<TDiDiveProfile>(0);
	private Set<TSoStore> TSoStores = new HashSet<TSoStore>(0);
	private Set<TC8custInterest> TC8custInterests = new HashSet<TC8custInterest>(0);
	private Set<TTpTrip> TTpTrips = new HashSet<TTpTrip>(0);

	public TDtDestination() {
	}

	public TDtDestination(int dtDestinationId, String dtDestinationTx, boolean dtUnavailableBl, short dtMinNoIn,
			short dtMaxNoIn, Date dtLastUpdatedDate, boolean dtRequiredBl, Date dtCreationDate, int dtForeColorIn,
			int dtBackColorIn, String dtPrefixTx) {
		this.dtDestinationId = dtDestinationId;
		this.dtDestinationTx = dtDestinationTx;
		this.dtUnavailableBl = dtUnavailableBl;
		this.dtMinNoIn = dtMinNoIn;
		this.dtMaxNoIn = dtMaxNoIn;
		this.dtLastUpdatedDate = dtLastUpdatedDate;
		this.dtRequiredBl = dtRequiredBl;
		this.dtCreationDate = dtCreationDate;
		this.dtForeColorIn = dtForeColorIn;
		this.dtBackColorIn = dtBackColorIn;
		this.dtPrefixTx = dtPrefixTx;
	}

	public TDtDestination(int dtDestinationId, String dtDestinationTx, boolean dtUnavailableBl,
			String dtVideoTxN, short dtMinNoIn, short dtMaxNoIn, Date dtLastUpdatedDate, boolean dtRequiredBl,
			Date dtCreationDate, int dtForeColorIn, int dtBackColorIn, String dtPrefixTx, String dtUrltxN,
			Set<TSyStockTrip> TSyStockTrips, Set<TDiDiveProfile> TDiDiveProfiles, Set<TSoStore> TSoStores,
			Set<TC8custInterest> TC8custInterests, Set<TTpTrip> TTpTrips) {
		this.dtDestinationId = dtDestinationId;
		this.dtDestinationTx = dtDestinationTx;
		this.dtUnavailableBl = dtUnavailableBl;
		this.dtVideoTxN = dtVideoTxN;
		this.dtMinNoIn = dtMinNoIn;
		this.dtMaxNoIn = dtMaxNoIn;
		this.dtLastUpdatedDate = dtLastUpdatedDate;
		this.dtRequiredBl = dtRequiredBl;
		this.dtCreationDate = dtCreationDate;
		this.dtForeColorIn = dtForeColorIn;
		this.dtBackColorIn = dtBackColorIn;
		this.dtPrefixTx = dtPrefixTx;
		this.dtUrltxN = dtUrltxN;
		this.TSyStockTrips = TSyStockTrips;
		this.TDiDiveProfiles = TDiDiveProfiles;
		this.TSoStores = TSoStores;
		this.TC8custInterests = TC8custInterests;
		this.TTpTrips = TTpTrips;
	}

	@Id

	@Column(name = "DtDestinationID", unique = true, nullable = false)
	public int getDtDestinationId() {
		return this.dtDestinationId;
	}

	public void setDtDestinationId(int dtDestinationId) {
		this.dtDestinationId = dtDestinationId;
	}

	@Column(name = "DtDestinationTx", unique = true, nullable = false)
	public String getDtDestinationTx() {
		return this.dtDestinationTx;
	}

	public void setDtDestinationTx(String dtDestinationTx) {
		this.dtDestinationTx = dtDestinationTx;
	}

	@Column(name = "DtUnavailableBl", nullable = false)
	public boolean isDtUnavailableBl() {
		return this.dtUnavailableBl;
	}

	public void setDtUnavailableBl(boolean dtUnavailableBl) {
		this.dtUnavailableBl = dtUnavailableBl;
	}

	@Column(name = "DtVideoTx_N")
	public String getDtVideoTxN() {
		return this.dtVideoTxN;
	}

	public void setDtVideoTxN(String dtVideoTxN) {
		this.dtVideoTxN = dtVideoTxN;
	}

	@Column(name = "DtMinNoIn", nullable = false)
	public short getDtMinNoIn() {
		return this.dtMinNoIn;
	}

	public void setDtMinNoIn(short dtMinNoIn) {
		this.dtMinNoIn = dtMinNoIn;
	}

	@Column(name = "DtMaxNoIn", nullable = false)
	public short getDtMaxNoIn() {
		return this.dtMaxNoIn;
	}

	public void setDtMaxNoIn(short dtMaxNoIn) {
		this.dtMaxNoIn = dtMaxNoIn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtLastUpdatedDate", nullable = false, length = 23)
	public Date getDtLastUpdatedDate() {
		return this.dtLastUpdatedDate;
	}

	public void setDtLastUpdatedDate(Date dtLastUpdatedDate) {
		this.dtLastUpdatedDate = dtLastUpdatedDate;
	}

	@Column(name = "DtRequiredBl", nullable = false)
	public boolean isDtRequiredBl() {
		return this.dtRequiredBl;
	}

	public void setDtRequiredBl(boolean dtRequiredBl) {
		this.dtRequiredBl = dtRequiredBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtCreationDate", nullable = false, length = 23)
	public Date getDtCreationDate() {
		return this.dtCreationDate;
	}

	public void setDtCreationDate(Date dtCreationDate) {
		this.dtCreationDate = dtCreationDate;
	}

	@Column(name = "DtForeColorIn", nullable = false)
	public int getDtForeColorIn() {
		return this.dtForeColorIn;
	}

	public void setDtForeColorIn(int dtForeColorIn) {
		this.dtForeColorIn = dtForeColorIn;
	}

	@Column(name = "DtBackColorIn", nullable = false)
	public int getDtBackColorIn() {
		return this.dtBackColorIn;
	}

	public void setDtBackColorIn(int dtBackColorIn) {
		this.dtBackColorIn = dtBackColorIn;
	}

	@Column(name = "DtPrefixTx", nullable = false)
	public String getDtPrefixTx() {
		return this.dtPrefixTx;
	}

	public void setDtPrefixTx(String dtPrefixTx) {
		this.dtPrefixTx = dtPrefixTx;
	}

	@Column(name = "DtURLTx_N")
	public String getDtUrltxN() {
		return this.dtUrltxN;
	}

	public void setDtUrltxN(String dtUrltxN) {
		this.dtUrltxN = dtUrltxN;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDtDestination")
	public Set<TSyStockTrip> getTSyStockTrips() {
		return this.TSyStockTrips;
	}

	public void setTSyStockTrips(Set<TSyStockTrip> TSyStockTrips) {
		this.TSyStockTrips = TSyStockTrips;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDtDestination")
	public Set<TDiDiveProfile> getTDiDiveProfiles() {
		return this.TDiDiveProfiles;
	}

	public void setTDiDiveProfiles(Set<TDiDiveProfile> TDiDiveProfiles) {
		this.TDiDiveProfiles = TDiDiveProfiles;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_Z9StoreDestination", joinColumns = {
			@JoinColumn(name = "Z9DestinationID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Z9StoreID", nullable = false, updatable = false) })
	public Set<TSoStore> getTSoStores() {
		return this.TSoStores;
	}

	public void setTSoStores(Set<TSoStore> TSoStores) {
		this.TSoStores = TSoStores;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDtDestination")
	public Set<TC8custInterest> getTC8custInterests() {
		return this.TC8custInterests;
	}

	public void setTC8custInterests(Set<TC8custInterest> TC8custInterests) {
		this.TC8custInterests = TC8custInterests;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TDtDestination")
	public Set<TTpTrip> getTTpTrips() {
		return this.TTpTrips;
	}

	public void setTTpTrips(Set<TTpTrip> TTpTrips) {
		this.TTpTrips = TTpTrips;
	}

}
