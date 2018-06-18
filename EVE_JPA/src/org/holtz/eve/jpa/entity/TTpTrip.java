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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TTpTrip generated by hbm2java
 */
@Entity
@Table(name = "T_TpTrip")
public class TTpTrip implements java.io.Serializable {

	private int tpTripId;
	private TBtBoat TBtBoat;
	private TTjTripStatus TTjTripStatus;
	private TSoStore TSoStore;
	private TDtDestination TDtDestination;
	private TVnVan TVnVan;
	private String tpTripNoTx;
	private Date tpStartDateN;
	private Date tpEndDateN;
	private String tpNotesTxN;
	private short tpMinNoIn;
	private short tpMaxNoIn;
	private Integer tpParentTripIdN;
	private Date tpCreationDate;
	private boolean tpWaiverRequiredBl;
	private String tpMeetingPointTxN;
	private boolean tpPassportRequiredBl;
	private Date tpLastUpdatedDate;
	private short tpTripTypeId;
	private int tpArrivalMinsIn;
	private Short tpNoOfDivesInN;
	private Integer tpRentalBookingIdN;
	private Integer tpCertPriorityInN;
	private String tpPrivateNotesTxN;
	private int tpPlacesAvailableIn;
	private String tpMoreInfoTxN;
	private Set<TErempRole> TErempRoles = new HashSet<TErempRole>(0);
	private Set<TSqstockTrip> TSqstockTrips = new HashSet<TSqstockTrip>(0);
	private Set<TCpCustTrip> TCpCustTrips = new HashSet<TCpCustTrip>(0);
	private Set<TEtempTrip> TEtempTrips = new HashSet<TEtempTrip>(0);
	private Set<TSyStockTrip> TSyStockTrips = new HashSet<TSyStockTrip>(0);
	private Set<TC8custInterest> TC8custInterests = new HashSet<TC8custInterest>(0);

	public TTpTrip() {
	}

	public TTpTrip(int tpTripId, TTjTripStatus TTjTripStatus, TSoStore TSoStore, String tpTripNoTx,
			short tpMinNoIn, short tpMaxNoIn, Date tpCreationDate, boolean tpWaiverRequiredBl,
			boolean tpPassportRequiredBl, short tpTripTypeId, int tpArrivalMinsIn, int tpPlacesAvailableIn) {
		this.tpTripId = tpTripId;
		this.TTjTripStatus = TTjTripStatus;
		this.TSoStore = TSoStore;
		this.tpTripNoTx = tpTripNoTx;
		this.tpMinNoIn = tpMinNoIn;
		this.tpMaxNoIn = tpMaxNoIn;
		this.tpCreationDate = tpCreationDate;
		this.tpWaiverRequiredBl = tpWaiverRequiredBl;
		this.tpPassportRequiredBl = tpPassportRequiredBl;
		this.tpTripTypeId = tpTripTypeId;
		this.tpArrivalMinsIn = tpArrivalMinsIn;
		this.tpPlacesAvailableIn = tpPlacesAvailableIn;
	}

	public TTpTrip(int tpTripId, TBtBoat TBtBoat, TTjTripStatus TTjTripStatus, TSoStore TSoStore,
			TDtDestination TDtDestination, TVnVan TVnVan, String tpTripNoTx, Date tpStartDateN, Date tpEndDateN,
			String tpNotesTxN, short tpMinNoIn, short tpMaxNoIn, Integer tpParentTripIdN, Date tpCreationDate,
			boolean tpWaiverRequiredBl, String tpMeetingPointTxN, boolean tpPassportRequiredBl,
			Date tpLastUpdatedDate, short tpTripTypeId, int tpArrivalMinsIn, Short tpNoOfDivesInN,
			Integer tpRentalBookingIdN, Integer tpCertPriorityInN, String tpPrivateNotesTxN,
			int tpPlacesAvailableIn, String tpMoreInfoTxN, Set<TErempRole> TErempRoles,
			Set<TSqstockTrip> TSqstockTrips, Set<TCpCustTrip> TCpCustTrips, Set<TEtempTrip> TEtempTrips,
			Set<TSyStockTrip> TSyStockTrips, Set<TC8custInterest> TC8custInterests) {
		this.tpTripId = tpTripId;
		this.TBtBoat = TBtBoat;
		this.TTjTripStatus = TTjTripStatus;
		this.TSoStore = TSoStore;
		this.TDtDestination = TDtDestination;
		this.TVnVan = TVnVan;
		this.tpTripNoTx = tpTripNoTx;
		this.tpStartDateN = tpStartDateN;
		this.tpEndDateN = tpEndDateN;
		this.tpNotesTxN = tpNotesTxN;
		this.tpMinNoIn = tpMinNoIn;
		this.tpMaxNoIn = tpMaxNoIn;
		this.tpParentTripIdN = tpParentTripIdN;
		this.tpCreationDate = tpCreationDate;
		this.tpWaiverRequiredBl = tpWaiverRequiredBl;
		this.tpMeetingPointTxN = tpMeetingPointTxN;
		this.tpPassportRequiredBl = tpPassportRequiredBl;
		this.tpLastUpdatedDate = tpLastUpdatedDate;
		this.tpTripTypeId = tpTripTypeId;
		this.tpArrivalMinsIn = tpArrivalMinsIn;
		this.tpNoOfDivesInN = tpNoOfDivesInN;
		this.tpRentalBookingIdN = tpRentalBookingIdN;
		this.tpCertPriorityInN = tpCertPriorityInN;
		this.tpPrivateNotesTxN = tpPrivateNotesTxN;
		this.tpPlacesAvailableIn = tpPlacesAvailableIn;
		this.tpMoreInfoTxN = tpMoreInfoTxN;
		this.TErempRoles = TErempRoles;
		this.TSqstockTrips = TSqstockTrips;
		this.TCpCustTrips = TCpCustTrips;
		this.TEtempTrips = TEtempTrips;
		this.TSyStockTrips = TSyStockTrips;
		this.TC8custInterests = TC8custInterests;
	}

	@Id

	@Column(name = "TpTripID", unique = true, nullable = false)
	public int getTpTripId() {
		return this.tpTripId;
	}

	public void setTpTripId(int tpTripId) {
		this.tpTripId = tpTripId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TpBoatID_N")
	public TBtBoat getTBtBoat() {
		return this.TBtBoat;
	}

	public void setTBtBoat(TBtBoat TBtBoat) {
		this.TBtBoat = TBtBoat;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TpTripStatusID", nullable = false)
	public TTjTripStatus getTTjTripStatus() {
		return this.TTjTripStatus;
	}

	public void setTTjTripStatus(TTjTripStatus TTjTripStatus) {
		this.TTjTripStatus = TTjTripStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TpStoreID", nullable = false)
	public TSoStore getTSoStore() {
		return this.TSoStore;
	}

	public void setTSoStore(TSoStore TSoStore) {
		this.TSoStore = TSoStore;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TpDestinationID_N")
	public TDtDestination getTDtDestination() {
		return this.TDtDestination;
	}

	public void setTDtDestination(TDtDestination TDtDestination) {
		this.TDtDestination = TDtDestination;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TpVanID_N")
	public TVnVan getTVnVan() {
		return this.TVnVan;
	}

	public void setTVnVan(TVnVan TVnVan) {
		this.TVnVan = TVnVan;
	}

	@Column(name = "TpTripNoTx", nullable = false)
	public String getTpTripNoTx() {
		return this.tpTripNoTx;
	}

	public void setTpTripNoTx(String tpTripNoTx) {
		this.tpTripNoTx = tpTripNoTx;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TpStartDate_N", length = 23)
	public Date getTpStartDateN() {
		return this.tpStartDateN;
	}

	public void setTpStartDateN(Date tpStartDateN) {
		this.tpStartDateN = tpStartDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TpEndDate_N", length = 23)
	public Date getTpEndDateN() {
		return this.tpEndDateN;
	}

	public void setTpEndDateN(Date tpEndDateN) {
		this.tpEndDateN = tpEndDateN;
	}

	@Column(name = "TpNotesTx_N")
	public String getTpNotesTxN() {
		return this.tpNotesTxN;
	}

	public void setTpNotesTxN(String tpNotesTxN) {
		this.tpNotesTxN = tpNotesTxN;
	}

	@Column(name = "TpMinNoIn", nullable = false)
	public short getTpMinNoIn() {
		return this.tpMinNoIn;
	}

	public void setTpMinNoIn(short tpMinNoIn) {
		this.tpMinNoIn = tpMinNoIn;
	}

	@Column(name = "TpMaxNoIn", nullable = false)
	public short getTpMaxNoIn() {
		return this.tpMaxNoIn;
	}

	public void setTpMaxNoIn(short tpMaxNoIn) {
		this.tpMaxNoIn = tpMaxNoIn;
	}

	@Column(name = "TpParentTripID_N")
	public Integer getTpParentTripIdN() {
		return this.tpParentTripIdN;
	}

	public void setTpParentTripIdN(Integer tpParentTripIdN) {
		this.tpParentTripIdN = tpParentTripIdN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TpCreationDate", nullable = false, length = 23)
	public Date getTpCreationDate() {
		return this.tpCreationDate;
	}

	public void setTpCreationDate(Date tpCreationDate) {
		this.tpCreationDate = tpCreationDate;
	}

	@Column(name = "TpWaiverRequiredBl", nullable = false)
	public boolean isTpWaiverRequiredBl() {
		return this.tpWaiverRequiredBl;
	}

	public void setTpWaiverRequiredBl(boolean tpWaiverRequiredBl) {
		this.tpWaiverRequiredBl = tpWaiverRequiredBl;
	}

	@Column(name = "TpMeetingPointTx_N")
	public String getTpMeetingPointTxN() {
		return this.tpMeetingPointTxN;
	}

	public void setTpMeetingPointTxN(String tpMeetingPointTxN) {
		this.tpMeetingPointTxN = tpMeetingPointTxN;
	}

	@Column(name = "TpPassportRequiredBl", nullable = false)
	public boolean isTpPassportRequiredBl() {
		return this.tpPassportRequiredBl;
	}

	public void setTpPassportRequiredBl(boolean tpPassportRequiredBl) {
		this.tpPassportRequiredBl = tpPassportRequiredBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TpLastUpdatedDate", length = 23)
	public Date getTpLastUpdatedDate() {
		return this.tpLastUpdatedDate;
	}

	public void setTpLastUpdatedDate(Date tpLastUpdatedDate) {
		this.tpLastUpdatedDate = tpLastUpdatedDate;
	}

	@Column(name = "TpTripTypeID", nullable = false)
	public short getTpTripTypeId() {
		return this.tpTripTypeId;
	}

	public void setTpTripTypeId(short tpTripTypeId) {
		this.tpTripTypeId = tpTripTypeId;
	}

	@Column(name = "TpArrivalMinsIn", nullable = false)
	public int getTpArrivalMinsIn() {
		return this.tpArrivalMinsIn;
	}

	public void setTpArrivalMinsIn(int tpArrivalMinsIn) {
		this.tpArrivalMinsIn = tpArrivalMinsIn;
	}

	@Column(name = "TpNoOfDivesIn_N")
	public Short getTpNoOfDivesInN() {
		return this.tpNoOfDivesInN;
	}

	public void setTpNoOfDivesInN(Short tpNoOfDivesInN) {
		this.tpNoOfDivesInN = tpNoOfDivesInN;
	}

	@Column(name = "TpRentalBookingID_N")
	public Integer getTpRentalBookingIdN() {
		return this.tpRentalBookingIdN;
	}

	public void setTpRentalBookingIdN(Integer tpRentalBookingIdN) {
		this.tpRentalBookingIdN = tpRentalBookingIdN;
	}

	@Column(name = "TpCertPriorityIn_N")
	public Integer getTpCertPriorityInN() {
		return this.tpCertPriorityInN;
	}

	public void setTpCertPriorityInN(Integer tpCertPriorityInN) {
		this.tpCertPriorityInN = tpCertPriorityInN;
	}

	@Column(name = "TpPrivateNotesTx_N")
	public String getTpPrivateNotesTxN() {
		return this.tpPrivateNotesTxN;
	}

	public void setTpPrivateNotesTxN(String tpPrivateNotesTxN) {
		this.tpPrivateNotesTxN = tpPrivateNotesTxN;
	}

	@Column(name = "TpPlacesAvailableIn", nullable = false)
	public int getTpPlacesAvailableIn() {
		return this.tpPlacesAvailableIn;
	}

	public void setTpPlacesAvailableIn(int tpPlacesAvailableIn) {
		this.tpPlacesAvailableIn = tpPlacesAvailableIn;
	}

	@Column(name = "TpMoreInfoTx_N")
	public String getTpMoreInfoTxN() {
		return this.tpMoreInfoTxN;
	}

	public void setTpMoreInfoTxN(String tpMoreInfoTxN) {
		this.tpMoreInfoTxN = tpMoreInfoTxN;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TTpTrip")
	public Set<TErempRole> getTErempRoles() {
		return this.TErempRoles;
	}

	public void setTErempRoles(Set<TErempRole> TErempRoles) {
		this.TErempRoles = TErempRoles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TTpTrip")
	public Set<TSqstockTrip> getTSqstockTrips() {
		return this.TSqstockTrips;
	}

	public void setTSqstockTrips(Set<TSqstockTrip> TSqstockTrips) {
		this.TSqstockTrips = TSqstockTrips;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TTpTrip")
	public Set<TCpCustTrip> getTCpCustTrips() {
		return this.TCpCustTrips;
	}

	public void setTCpCustTrips(Set<TCpCustTrip> TCpCustTrips) {
		this.TCpCustTrips = TCpCustTrips;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TTpTrip")
	public Set<TEtempTrip> getTEtempTrips() {
		return this.TEtempTrips;
	}

	public void setTEtempTrips(Set<TEtempTrip> TEtempTrips) {
		this.TEtempTrips = TEtempTrips;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TTpTrip")
	public Set<TSyStockTrip> getTSyStockTrips() {
		return this.TSyStockTrips;
	}

	public void setTSyStockTrips(Set<TSyStockTrip> TSyStockTrips) {
		this.TSyStockTrips = TSyStockTrips;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TTpTrip")
	public Set<TC8custInterest> getTC8custInterests() {
		return this.TC8custInterests;
	}

	public void setTC8custInterests(Set<TC8custInterest> TC8custInterests) {
		this.TC8custInterests = TC8custInterests;
	}

}
