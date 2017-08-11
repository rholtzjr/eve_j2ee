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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TCsCourse generated by hbm2java
 */
@Entity
@Table(name = "T_CsCourse")
public class TCsCourse implements java.io.Serializable {

	private int csCourseId;
	private TCjCourseStatus TCjCourseStatus;
	private TLgLanguage TLgLanguage;
	private TCtcourseType TCtcourseType;
	private TSoStore TSoStore;
	private TCsCourse TCsCourseByCsCurrentTermPreviousCourseIdN;
	private TTeTerm TTeTerm;
	private TLcLocation TLcLocation;
	private TCsCourse TCsCourseByCsPreviousTermPreviousCourseIdN;
	private String csCourseNoTx;
	private Date csStartDate;
	private Date csEndDate;
	private String csNotesTxN;
	private Date csLastUpdatedDate;
	private short csMinNoIn;
	private short csMaxNoIn;
	private Date csCreationDate;
	private String csPrivateNotesTxN;
	private int csWaitingListCapacityIn;
	private int csAvailableWaitingListPlacesIn;
	private String csMoreInfoTxN;
	private Set<TMoModule> TMoModules = new HashSet<TMoModule>(0);
	private Set<TCsCourse> TCsCoursesForCsPreviousTermPreviousCourseIdN = new HashSet<TCsCourse>(0);
	private Set<TC8custInterest> TC8custInterests = new HashSet<TC8custInterest>(0);
	private Set<TSlstockCourse> TSlstockCourses = new HashSet<TSlstockCourse>(0);
	private Set<TEeEmpCourse> TEeEmpCourses = new HashSet<TEeEmpCourse>(0);
	private Set<TCsCourse> TCsCoursesForCsCurrentTermPreviousCourseIdN = new HashSet<TCsCourse>(0);
	private Set<TC1custCourse> TC1custCourses = new HashSet<TC1custCourse>(0);

	public TCsCourse() {
	}

	public TCsCourse(int csCourseId, TCtcourseType TCtcourseType, TSoStore TSoStore, String csCourseNoTx,
			Date csStartDate, Date csEndDate, Date csLastUpdatedDate, short csMinNoIn, short csMaxNoIn,
			Date csCreationDate, int csWaitingListCapacityIn, int csAvailableWaitingListPlacesIn) {
		this.csCourseId = csCourseId;
		this.TCtcourseType = TCtcourseType;
		this.TSoStore = TSoStore;
		this.csCourseNoTx = csCourseNoTx;
		this.csStartDate = csStartDate;
		this.csEndDate = csEndDate;
		this.csLastUpdatedDate = csLastUpdatedDate;
		this.csMinNoIn = csMinNoIn;
		this.csMaxNoIn = csMaxNoIn;
		this.csCreationDate = csCreationDate;
		this.csWaitingListCapacityIn = csWaitingListCapacityIn;
		this.csAvailableWaitingListPlacesIn = csAvailableWaitingListPlacesIn;
	}

	public TCsCourse(int csCourseId, TCjCourseStatus TCjCourseStatus, TLgLanguage TLgLanguage,
			TCtcourseType TCtcourseType, TSoStore TSoStore, TCsCourse TCsCourseByCsCurrentTermPreviousCourseIdN,
			TTeTerm TTeTerm, TLcLocation TLcLocation, TCsCourse TCsCourseByCsPreviousTermPreviousCourseIdN,
			String csCourseNoTx, Date csStartDate, Date csEndDate, String csNotesTxN,
			Date csLastUpdatedDate, short csMinNoIn, short csMaxNoIn, Date csCreationDate,
			String csPrivateNotesTxN, int csWaitingListCapacityIn, int csAvailableWaitingListPlacesIn,
			String csMoreInfoTxN, Set<TMoModule> TMoModules,
			Set<TCsCourse> TCsCoursesForCsPreviousTermPreviousCourseIdN, Set<TC8custInterest> TC8custInterests,
			Set<TSlstockCourse> TSlstockCourses, Set<TEeEmpCourse> TEeEmpCourses,
			Set<TCsCourse> TCsCoursesForCsCurrentTermPreviousCourseIdN, Set<TC1custCourse> TC1custCourses) {
		this.csCourseId = csCourseId;
		this.TCjCourseStatus = TCjCourseStatus;
		this.TLgLanguage = TLgLanguage;
		this.TCtcourseType = TCtcourseType;
		this.TSoStore = TSoStore;
		this.TCsCourseByCsCurrentTermPreviousCourseIdN = TCsCourseByCsCurrentTermPreviousCourseIdN;
		this.TTeTerm = TTeTerm;
		this.TLcLocation = TLcLocation;
		this.TCsCourseByCsPreviousTermPreviousCourseIdN = TCsCourseByCsPreviousTermPreviousCourseIdN;
		this.csCourseNoTx = csCourseNoTx;
		this.csStartDate = csStartDate;
		this.csEndDate = csEndDate;
		this.csNotesTxN = csNotesTxN;
		this.csLastUpdatedDate = csLastUpdatedDate;
		this.csMinNoIn = csMinNoIn;
		this.csMaxNoIn = csMaxNoIn;
		this.csCreationDate = csCreationDate;
		this.csPrivateNotesTxN = csPrivateNotesTxN;
		this.csWaitingListCapacityIn = csWaitingListCapacityIn;
		this.csAvailableWaitingListPlacesIn = csAvailableWaitingListPlacesIn;
		this.csMoreInfoTxN = csMoreInfoTxN;
		this.TMoModules = TMoModules;
		this.TCsCoursesForCsPreviousTermPreviousCourseIdN = TCsCoursesForCsPreviousTermPreviousCourseIdN;
		this.TC8custInterests = TC8custInterests;
		this.TSlstockCourses = TSlstockCourses;
		this.TEeEmpCourses = TEeEmpCourses;
		this.TCsCoursesForCsCurrentTermPreviousCourseIdN = TCsCoursesForCsCurrentTermPreviousCourseIdN;
		this.TC1custCourses = TC1custCourses;
	}

	@Id

	@Column(name = "CsCourseID", unique = true, nullable = false)
	public int getCsCourseId() {
		return this.csCourseId;
	}

	public void setCsCourseId(int csCourseId) {
		this.csCourseId = csCourseId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CsCourseStatusID")
	public TCjCourseStatus getTCjCourseStatus() {
		return this.TCjCourseStatus;
	}

	public void setTCjCourseStatus(TCjCourseStatus TCjCourseStatus) {
		this.TCjCourseStatus = TCjCourseStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CsLanguageID_N")
	public TLgLanguage getTLgLanguage() {
		return this.TLgLanguage;
	}

	public void setTLgLanguage(TLgLanguage TLgLanguage) {
		this.TLgLanguage = TLgLanguage;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CsCourseTypeID", nullable = false)
	public TCtcourseType getTCtcourseType() {
		return this.TCtcourseType;
	}

	public void setTCtcourseType(TCtcourseType TCtcourseType) {
		this.TCtcourseType = TCtcourseType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CsStoreID", nullable = false)
	public TSoStore getTSoStore() {
		return this.TSoStore;
	}

	public void setTSoStore(TSoStore TSoStore) {
		this.TSoStore = TSoStore;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CsCurrentTermPreviousCourseID_N")
	public TCsCourse getTCsCourseByCsCurrentTermPreviousCourseIdN() {
		return this.TCsCourseByCsCurrentTermPreviousCourseIdN;
	}

	public void setTCsCourseByCsCurrentTermPreviousCourseIdN(TCsCourse TCsCourseByCsCurrentTermPreviousCourseIdN) {
		this.TCsCourseByCsCurrentTermPreviousCourseIdN = TCsCourseByCsCurrentTermPreviousCourseIdN;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CsTermID_N")
	public TTeTerm getTTeTerm() {
		return this.TTeTerm;
	}

	public void setTTeTerm(TTeTerm TTeTerm) {
		this.TTeTerm = TTeTerm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CsLocationId_N")
	public TLcLocation getTLcLocation() {
		return this.TLcLocation;
	}

	public void setTLcLocation(TLcLocation TLcLocation) {
		this.TLcLocation = TLcLocation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CsPreviousTermPreviousCourseID_N")
	public TCsCourse getTCsCourseByCsPreviousTermPreviousCourseIdN() {
		return this.TCsCourseByCsPreviousTermPreviousCourseIdN;
	}

	public void setTCsCourseByCsPreviousTermPreviousCourseIdN(TCsCourse TCsCourseByCsPreviousTermPreviousCourseIdN) {
		this.TCsCourseByCsPreviousTermPreviousCourseIdN = TCsCourseByCsPreviousTermPreviousCourseIdN;
	}

	@Column(name = "CsCourseNoTx", nullable = false)
	public String getCsCourseNoTx() {
		return this.csCourseNoTx;
	}

	public void setCsCourseNoTx(String csCourseNoTx) {
		this.csCourseNoTx = csCourseNoTx;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CsStartDate", nullable = false, length = 23)
	public Date getCsStartDate() {
		return this.csStartDate;
	}

	public void setCsStartDate(Date csStartDate) {
		this.csStartDate = csStartDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CsEndDate", nullable = false, length = 23)
	public Date getCsEndDate() {
		return this.csEndDate;
	}

	public void setCsEndDate(Date csEndDate) {
		this.csEndDate = csEndDate;
	}

	@Column(name = "CsNotesTx_N")
	public String getCsNotesTxN() {
		return this.csNotesTxN;
	}

	public void setCsNotesTxN(String csNotesTxN) {
		this.csNotesTxN = csNotesTxN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CsLastUpdatedDate", nullable = false, length = 23)
	public Date getCsLastUpdatedDate() {
		return this.csLastUpdatedDate;
	}

	public void setCsLastUpdatedDate(Date csLastUpdatedDate) {
		this.csLastUpdatedDate = csLastUpdatedDate;
	}

	@Column(name = "CsMinNoIn", nullable = false)
	public short getCsMinNoIn() {
		return this.csMinNoIn;
	}

	public void setCsMinNoIn(short csMinNoIn) {
		this.csMinNoIn = csMinNoIn;
	}

	@Column(name = "CsMaxNoIn", nullable = false)
	public short getCsMaxNoIn() {
		return this.csMaxNoIn;
	}

	public void setCsMaxNoIn(short csMaxNoIn) {
		this.csMaxNoIn = csMaxNoIn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CsCreationDate", nullable = false, length = 23)
	public Date getCsCreationDate() {
		return this.csCreationDate;
	}

	public void setCsCreationDate(Date csCreationDate) {
		this.csCreationDate = csCreationDate;
	}

	@Column(name = "CsPrivateNotesTx_N")
	public String getCsPrivateNotesTxN() {
		return this.csPrivateNotesTxN;
	}

	public void setCsPrivateNotesTxN(String csPrivateNotesTxN) {
		this.csPrivateNotesTxN = csPrivateNotesTxN;
	}

	@Column(name = "CsWaitingListCapacityIn", nullable = false)
	public int getCsWaitingListCapacityIn() {
		return this.csWaitingListCapacityIn;
	}

	public void setCsWaitingListCapacityIn(int csWaitingListCapacityIn) {
		this.csWaitingListCapacityIn = csWaitingListCapacityIn;
	}

	@Column(name = "CsAvailableWaitingListPlacesIn", nullable = false)
	public int getCsAvailableWaitingListPlacesIn() {
		return this.csAvailableWaitingListPlacesIn;
	}

	public void setCsAvailableWaitingListPlacesIn(int csAvailableWaitingListPlacesIn) {
		this.csAvailableWaitingListPlacesIn = csAvailableWaitingListPlacesIn;
	}

	@Column(name = "CsMoreInfoTx_N")
	public String getCsMoreInfoTxN() {
		return this.csMoreInfoTxN;
	}

	public void setCsMoreInfoTxN(String csMoreInfoTxN) {
		this.csMoreInfoTxN = csMoreInfoTxN;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCsCourse")
	public Set<TMoModule> getTMoModules() {
		return this.TMoModules;
	}

	public void setTMoModules(Set<TMoModule> TMoModules) {
		this.TMoModules = TMoModules;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCsCourseByCsPreviousTermPreviousCourseIdN")
	public Set<TCsCourse> getTCsCoursesForCsPreviousTermPreviousCourseIdN() {
		return this.TCsCoursesForCsPreviousTermPreviousCourseIdN;
	}

	public void setTCsCoursesForCsPreviousTermPreviousCourseIdN(
			Set<TCsCourse> TCsCoursesForCsPreviousTermPreviousCourseIdN) {
		this.TCsCoursesForCsPreviousTermPreviousCourseIdN = TCsCoursesForCsPreviousTermPreviousCourseIdN;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCsCourse")
	public Set<TC8custInterest> getTC8custInterests() {
		return this.TC8custInterests;
	}

	public void setTC8custInterests(Set<TC8custInterest> TC8custInterests) {
		this.TC8custInterests = TC8custInterests;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCsCourse")
	public Set<TSlstockCourse> getTSlstockCourses() {
		return this.TSlstockCourses;
	}

	public void setTSlstockCourses(Set<TSlstockCourse> TSlstockCourses) {
		this.TSlstockCourses = TSlstockCourses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCsCourse")
	public Set<TEeEmpCourse> getTEeEmpCourses() {
		return this.TEeEmpCourses;
	}

	public void setTEeEmpCourses(Set<TEeEmpCourse> TEeEmpCourses) {
		this.TEeEmpCourses = TEeEmpCourses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCsCourseByCsCurrentTermPreviousCourseIdN")
	public Set<TCsCourse> getTCsCoursesForCsCurrentTermPreviousCourseIdN() {
		return this.TCsCoursesForCsCurrentTermPreviousCourseIdN;
	}

	public void setTCsCoursesForCsCurrentTermPreviousCourseIdN(
			Set<TCsCourse> TCsCoursesForCsCurrentTermPreviousCourseIdN) {
		this.TCsCoursesForCsCurrentTermPreviousCourseIdN = TCsCoursesForCsCurrentTermPreviousCourseIdN;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCsCourse")
	public Set<TC1custCourse> getTC1custCourses() {
		return this.TC1custCourses;
	}

	public void setTC1custCourses(Set<TC1custCourse> TC1custCourses) {
		this.TC1custCourses = TC1custCourses;
	}

}
