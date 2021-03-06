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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * TLcLocation generated by hbm2java
 */
@Entity
@Table(name = "T_LcLocation", uniqueConstraints = @UniqueConstraint(columnNames = "LcLocationTx"))
public class TLcLocation implements java.io.Serializable {

	private int lcLocationId;
	private TCyCountry TCyCountry;
	private TSeState TSeState;
	private String lcLocationTx;
	private boolean lcUnavailableBl;
	private Date lcLastUpdatedDate;
	private boolean lcRequiredBl;
	private short lcDoubleBookingCountIn;
	private Date lcCreationDate;
	private int lcForeColorIn;
	private int lcBackColorIn;
	private String lcUrltxN;
	private String lcAddress1txN;
	private String lcAddress2txN;
	private String lcAddress3txN;
	private String lcAddress4txN;
	private String lcPostCodeTxN;
	private int lcWaitingListCapacityIn;
	private Set<TSistockItem> TSistockItems = new HashSet<TSistockItem>(0);
	private Set<TEsempSchedule> TEsempSchedules = new HashSet<TEsempSchedule>(0);
	private Set<TIcInventoryLocation> TIcInventoryLocations = new HashSet<TIcInventoryLocation>(0);
	private Set<TSoStore> TSoStores = new HashSet<TSoStore>(0);
	private Set<TEyEntry> TEyEntries = new HashSet<TEyEntry>(0);
	private Set<TMoModule> TMoModules = new HashSet<TMoModule>(0);
	private Set<TCsCourse> TCsCourses = new HashSet<TCsCourse>(0);
	private Set<TC1custCourse> TC1custCourses = new HashSet<TC1custCourse>(0);
	private Set<TMtmoduleType> TMtmoduleTypes = new HashSet<TMtmoduleType>(0);

	public TLcLocation() {
	}

	public TLcLocation(int lcLocationId, String lcLocationTx, boolean lcUnavailableBl, Date lcLastUpdatedDate,
			boolean lcRequiredBl, short lcDoubleBookingCountIn, Date lcCreationDate, int lcForeColorIn,
			int lcBackColorIn, int lcWaitingListCapacityIn) {
		this.lcLocationId = lcLocationId;
		this.lcLocationTx = lcLocationTx;
		this.lcUnavailableBl = lcUnavailableBl;
		this.lcLastUpdatedDate = lcLastUpdatedDate;
		this.lcRequiredBl = lcRequiredBl;
		this.lcDoubleBookingCountIn = lcDoubleBookingCountIn;
		this.lcCreationDate = lcCreationDate;
		this.lcForeColorIn = lcForeColorIn;
		this.lcBackColorIn = lcBackColorIn;
		this.lcWaitingListCapacityIn = lcWaitingListCapacityIn;
	}

	public TLcLocation(int lcLocationId, TCyCountry TCyCountry, TSeState TSeState, String lcLocationTx,
			boolean lcUnavailableBl, Date lcLastUpdatedDate, boolean lcRequiredBl, short lcDoubleBookingCountIn,
			Date lcCreationDate, int lcForeColorIn, int lcBackColorIn, String lcUrltxN,
			String lcAddress1txN, String lcAddress2txN, String lcAddress3txN,
			String lcAddress4txN, String lcPostCodeTxN, int lcWaitingListCapacityIn,
			Set<TSistockItem> TSistockItems, Set<TEsempSchedule> TEsempSchedules,
			Set<TIcInventoryLocation> TIcInventoryLocations, Set<TSoStore> TSoStores, Set<TEyEntry> TEyEntries,
			Set<TMoModule> TMoModules, Set<TCsCourse> TCsCourses, Set<TC1custCourse> TC1custCourses,
			Set<TMtmoduleType> TMtmoduleTypes) {
		this.lcLocationId = lcLocationId;
		this.TCyCountry = TCyCountry;
		this.TSeState = TSeState;
		this.lcLocationTx = lcLocationTx;
		this.lcUnavailableBl = lcUnavailableBl;
		this.lcLastUpdatedDate = lcLastUpdatedDate;
		this.lcRequiredBl = lcRequiredBl;
		this.lcDoubleBookingCountIn = lcDoubleBookingCountIn;
		this.lcCreationDate = lcCreationDate;
		this.lcForeColorIn = lcForeColorIn;
		this.lcBackColorIn = lcBackColorIn;
		this.lcUrltxN = lcUrltxN;
		this.lcAddress1txN = lcAddress1txN;
		this.lcAddress2txN = lcAddress2txN;
		this.lcAddress3txN = lcAddress3txN;
		this.lcAddress4txN = lcAddress4txN;
		this.lcPostCodeTxN = lcPostCodeTxN;
		this.lcWaitingListCapacityIn = lcWaitingListCapacityIn;
		this.TSistockItems = TSistockItems;
		this.TEsempSchedules = TEsempSchedules;
		this.TIcInventoryLocations = TIcInventoryLocations;
		this.TSoStores = TSoStores;
		this.TEyEntries = TEyEntries;
		this.TMoModules = TMoModules;
		this.TCsCourses = TCsCourses;
		this.TC1custCourses = TC1custCourses;
		this.TMtmoduleTypes = TMtmoduleTypes;
	}

	@Id

	@Column(name = "LcLocationID", unique = true, nullable = false)
	public int getLcLocationId() {
		return this.lcLocationId;
	}

	public void setLcLocationId(int lcLocationId) {
		this.lcLocationId = lcLocationId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LcCountryID_N")
	public TCyCountry getTCyCountry() {
		return this.TCyCountry;
	}

	public void setTCyCountry(TCyCountry TCyCountry) {
		this.TCyCountry = TCyCountry;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LcStateID_N")
	public TSeState getTSeState() {
		return this.TSeState;
	}

	public void setTSeState(TSeState TSeState) {
		this.TSeState = TSeState;
	}

	@Column(name = "LcLocationTx", unique = true, nullable = false)
	public String getLcLocationTx() {
		return this.lcLocationTx;
	}

	public void setLcLocationTx(String lcLocationTx) {
		this.lcLocationTx = lcLocationTx;
	}

	@Column(name = "LcUnavailableBl", nullable = false)
	public boolean isLcUnavailableBl() {
		return this.lcUnavailableBl;
	}

	public void setLcUnavailableBl(boolean lcUnavailableBl) {
		this.lcUnavailableBl = lcUnavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LcLastUpdatedDate", nullable = false, length = 23)
	public Date getLcLastUpdatedDate() {
		return this.lcLastUpdatedDate;
	}

	public void setLcLastUpdatedDate(Date lcLastUpdatedDate) {
		this.lcLastUpdatedDate = lcLastUpdatedDate;
	}

	@Column(name = "LcRequiredBl", nullable = false)
	public boolean isLcRequiredBl() {
		return this.lcRequiredBl;
	}

	public void setLcRequiredBl(boolean lcRequiredBl) {
		this.lcRequiredBl = lcRequiredBl;
	}

	@Column(name = "LcDoubleBookingCountIn", nullable = false)
	public short getLcDoubleBookingCountIn() {
		return this.lcDoubleBookingCountIn;
	}

	public void setLcDoubleBookingCountIn(short lcDoubleBookingCountIn) {
		this.lcDoubleBookingCountIn = lcDoubleBookingCountIn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LcCreationDate", nullable = false, length = 23)
	public Date getLcCreationDate() {
		return this.lcCreationDate;
	}

	public void setLcCreationDate(Date lcCreationDate) {
		this.lcCreationDate = lcCreationDate;
	}

	@Column(name = "LcForeColorIn", nullable = false)
	public int getLcForeColorIn() {
		return this.lcForeColorIn;
	}

	public void setLcForeColorIn(int lcForeColorIn) {
		this.lcForeColorIn = lcForeColorIn;
	}

	@Column(name = "LcBackColorIn", nullable = false)
	public int getLcBackColorIn() {
		return this.lcBackColorIn;
	}

	public void setLcBackColorIn(int lcBackColorIn) {
		this.lcBackColorIn = lcBackColorIn;
	}

	@Column(name = "LcURLTx_N")
	public String getLcUrltxN() {
		return this.lcUrltxN;
	}

	public void setLcUrltxN(String lcUrltxN) {
		this.lcUrltxN = lcUrltxN;
	}

	@Column(name = "LcAddress1Tx_N")
	public String getLcAddress1txN() {
		return this.lcAddress1txN;
	}

	public void setLcAddress1txN(String lcAddress1txN) {
		this.lcAddress1txN = lcAddress1txN;
	}

	@Column(name = "LcAddress2Tx_N")
	public String getLcAddress2txN() {
		return this.lcAddress2txN;
	}

	public void setLcAddress2txN(String lcAddress2txN) {
		this.lcAddress2txN = lcAddress2txN;
	}

	@Column(name = "LcAddress3Tx_N")
	public String getLcAddress3txN() {
		return this.lcAddress3txN;
	}

	public void setLcAddress3txN(String lcAddress3txN) {
		this.lcAddress3txN = lcAddress3txN;
	}

	@Column(name = "LcAddress4Tx_N")
	public String getLcAddress4txN() {
		return this.lcAddress4txN;
	}

	public void setLcAddress4txN(String lcAddress4txN) {
		this.lcAddress4txN = lcAddress4txN;
	}

	@Column(name = "LcPostCodeTx_N")
	public String getLcPostCodeTxN() {
		return this.lcPostCodeTxN;
	}

	public void setLcPostCodeTxN(String lcPostCodeTxN) {
		this.lcPostCodeTxN = lcPostCodeTxN;
	}

	@Column(name = "LcWaitingListCapacityIn", nullable = false)
	public int getLcWaitingListCapacityIn() {
		return this.lcWaitingListCapacityIn;
	}

	public void setLcWaitingListCapacityIn(int lcWaitingListCapacityIn) {
		this.lcWaitingListCapacityIn = lcWaitingListCapacityIn;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_LSLocationStockItem", joinColumns = {
			@JoinColumn(name = "LSLocationId", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "LSStockItemId", nullable = false, updatable = false) })
	public Set<TSistockItem> getTSistockItems() {
		return this.TSistockItems;
	}

	public void setTSistockItems(Set<TSistockItem> TSistockItems) {
		this.TSistockItems = TSistockItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TLcLocation")
	public Set<TEsempSchedule> getTEsempSchedules() {
		return this.TEsempSchedules;
	}

	public void setTEsempSchedules(Set<TEsempSchedule> TEsempSchedules) {
		this.TEsempSchedules = TEsempSchedules;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TLcLocation")
	public Set<TIcInventoryLocation> getTIcInventoryLocations() {
		return this.TIcInventoryLocations;
	}

	public void setTIcInventoryLocations(Set<TIcInventoryLocation> TIcInventoryLocations) {
		this.TIcInventoryLocations = TIcInventoryLocations;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_ZeStoreLocation", joinColumns = {
			@JoinColumn(name = "ZeLocationID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ZeStoreID", nullable = false, updatable = false) })
	public Set<TSoStore> getTSoStores() {
		return this.TSoStores;
	}

	public void setTSoStores(Set<TSoStore> TSoStores) {
		this.TSoStores = TSoStores;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TLcLocation")
	public Set<TEyEntry> getTEyEntries() {
		return this.TEyEntries;
	}

	public void setTEyEntries(Set<TEyEntry> TEyEntries) {
		this.TEyEntries = TEyEntries;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TLcLocation")
	public Set<TMoModule> getTMoModules() {
		return this.TMoModules;
	}

	public void setTMoModules(Set<TMoModule> TMoModules) {
		this.TMoModules = TMoModules;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TLcLocation")
	public Set<TCsCourse> getTCsCourses() {
		return this.TCsCourses;
	}

	public void setTCsCourses(Set<TCsCourse> TCsCourses) {
		this.TCsCourses = TCsCourses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TLcLocation")
	public Set<TC1custCourse> getTC1custCourses() {
		return this.TC1custCourses;
	}

	public void setTC1custCourses(Set<TC1custCourse> TC1custCourses) {
		this.TC1custCourses = TC1custCourses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TLcLocation")
	public Set<TMtmoduleType> getTMtmoduleTypes() {
		return this.TMtmoduleTypes;
	}

	public void setTMtmoduleTypes(Set<TMtmoduleType> TMtmoduleTypes) {
		this.TMtmoduleTypes = TMtmoduleTypes;
	}

}
