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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * TCtcourseType generated by hbm2java
 */
@Entity
@Table(name = "T_CTCourseType", uniqueConstraints = @UniqueConstraint(columnNames = "CTCourseTypeTx"))
public class TCtcourseType implements java.io.Serializable {

	private int ctcourseTypeId;
	private TP5pictype TP5pictype;
	private TCacertAgency TCacertAgency;
	private String ctcourseTypeTx;
	private String ctprefixTx;
	private short ctminNoIn;
	private short ctmaxNoIn;
	private short ctcurrencyId;
	private float ctexchangeRateFl;
	private Integer ctprerequisiteIdN;
	private Integer ctpadicourseTypeIdN;
	private String ctvideoTxN;
	private boolean ctunavailableBl;
	private Date ctlastUpdatedDate;
	private String ctpadikeyTxN;
	private boolean ctdistinctiveBl;
	private boolean ctuploadableBl;
	private float ctinstructorPercentFl;
	private boolean ctrequiredBl;
	private String ctmlgfolderTxN;
	private boolean ctmlgbl;
	private Date ctcreationDate;
	private int ctforeColorIn;
	private int ctbackColorIn;
	private String ctdefaultEmpIdsN;
	private String ctempTypeIdsN;
	private String cturltxN;
	private Integer ctcertPriorityInN;
	private int ctwaitingListCapacityIn;
	private Integer ctnewPadikeyInN;
	private Integer ctdefPiccardTypeIdN;
	private boolean cttabModulesBl;
	private boolean cttabDatesBl;
	private boolean cttabTimesBl;
	private boolean cttabStaffBl;
	private boolean cttabLocationsBl;
	private boolean cttabSummaryBl;
	private boolean cttabCustomersBl;
	private boolean cttabOptionsBl;
	private boolean cttabExpensesBl;
	private boolean cttabStockItemsBl;
	private boolean ctshowDatesBl;
	private boolean ctshowSwimOptionsBl;
	private boolean cttabRequirementsBl;
	private Set<TEmEmp> TEmEmps = new HashSet<TEmEmp>(0);
	private Set<TCsCourse> TCsCourses = new HashSet<TCsCourse>(0);
	private Set<TP4piccard> TP4piccards = new HashSet<TP4piccard>(0);
	private Set<TSzStockCourseType> TSzStockCourseTypes = new HashSet<TSzStockCourseType>(0);
	private Set<TC8custInterest> TC8custInterests = new HashSet<TC8custInterest>(0);
	private Set<TSoStore> TSoStores = new HashSet<TSoStore>(0);
	private Set<TMtmoduleType> TMtmoduleTypes = new HashSet<TMtmoduleType>(0);
	private Set<TC1custCourse> TC1custCourses = new HashSet<TC1custCourse>(0);

	public TCtcourseType() {
	}

	public TCtcourseType(int ctcourseTypeId, TP5pictype TP5pictype, String ctcourseTypeTx,
			String ctprefixTx, short ctminNoIn, short ctmaxNoIn, short ctcurrencyId, float ctexchangeRateFl,
			boolean ctunavailableBl, Date ctlastUpdatedDate, boolean ctdistinctiveBl, boolean ctuploadableBl,
			float ctinstructorPercentFl, boolean ctrequiredBl, boolean ctmlgbl, Date ctcreationDate, int ctforeColorIn,
			int ctbackColorIn, int ctwaitingListCapacityIn, boolean cttabModulesBl, boolean cttabDatesBl,
			boolean cttabTimesBl, boolean cttabStaffBl, boolean cttabLocationsBl, boolean cttabSummaryBl,
			boolean cttabCustomersBl, boolean cttabOptionsBl, boolean cttabExpensesBl, boolean cttabStockItemsBl,
			boolean ctshowDatesBl, boolean ctshowSwimOptionsBl, boolean cttabRequirementsBl) {
		this.ctcourseTypeId = ctcourseTypeId;
		this.TP5pictype = TP5pictype;
		this.ctcourseTypeTx = ctcourseTypeTx;
		this.ctprefixTx = ctprefixTx;
		this.ctminNoIn = ctminNoIn;
		this.ctmaxNoIn = ctmaxNoIn;
		this.ctcurrencyId = ctcurrencyId;
		this.ctexchangeRateFl = ctexchangeRateFl;
		this.ctunavailableBl = ctunavailableBl;
		this.ctlastUpdatedDate = ctlastUpdatedDate;
		this.ctdistinctiveBl = ctdistinctiveBl;
		this.ctuploadableBl = ctuploadableBl;
		this.ctinstructorPercentFl = ctinstructorPercentFl;
		this.ctrequiredBl = ctrequiredBl;
		this.ctmlgbl = ctmlgbl;
		this.ctcreationDate = ctcreationDate;
		this.ctforeColorIn = ctforeColorIn;
		this.ctbackColorIn = ctbackColorIn;
		this.ctwaitingListCapacityIn = ctwaitingListCapacityIn;
		this.cttabModulesBl = cttabModulesBl;
		this.cttabDatesBl = cttabDatesBl;
		this.cttabTimesBl = cttabTimesBl;
		this.cttabStaffBl = cttabStaffBl;
		this.cttabLocationsBl = cttabLocationsBl;
		this.cttabSummaryBl = cttabSummaryBl;
		this.cttabCustomersBl = cttabCustomersBl;
		this.cttabOptionsBl = cttabOptionsBl;
		this.cttabExpensesBl = cttabExpensesBl;
		this.cttabStockItemsBl = cttabStockItemsBl;
		this.ctshowDatesBl = ctshowDatesBl;
		this.ctshowSwimOptionsBl = ctshowSwimOptionsBl;
		this.cttabRequirementsBl = cttabRequirementsBl;
	}

	public TCtcourseType(int ctcourseTypeId, TP5pictype TP5pictype, TCacertAgency TCacertAgency,
			String ctcourseTypeTx, String ctprefixTx, short ctminNoIn, short ctmaxNoIn, short ctcurrencyId,
			float ctexchangeRateFl, Integer ctprerequisiteIdN, Integer ctpadicourseTypeIdN, String ctvideoTxN,
			boolean ctunavailableBl, Date ctlastUpdatedDate, String ctpadikeyTxN, boolean ctdistinctiveBl,
			boolean ctuploadableBl, float ctinstructorPercentFl, boolean ctrequiredBl, String ctmlgfolderTxN,
			boolean ctmlgbl, Date ctcreationDate, int ctforeColorIn, int ctbackColorIn, String ctdefaultEmpIdsN,
			String ctempTypeIdsN, String cturltxN, Integer ctcertPriorityInN, int ctwaitingListCapacityIn,
			Integer ctnewPadikeyInN, Integer ctdefPiccardTypeIdN, boolean cttabModulesBl, boolean cttabDatesBl,
			boolean cttabTimesBl, boolean cttabStaffBl, boolean cttabLocationsBl, boolean cttabSummaryBl,
			boolean cttabCustomersBl, boolean cttabOptionsBl, boolean cttabExpensesBl, boolean cttabStockItemsBl,
			boolean ctshowDatesBl, boolean ctshowSwimOptionsBl, boolean cttabRequirementsBl, Set<TEmEmp> TEmEmps,
			Set<TCsCourse> TCsCourses, Set<TP4piccard> TP4piccards, Set<TSzStockCourseType> TSzStockCourseTypes,
			Set<TC8custInterest> TC8custInterests, Set<TSoStore> TSoStores, Set<TMtmoduleType> TMtmoduleTypes,
			Set<TC1custCourse> TC1custCourses) {
		this.ctcourseTypeId = ctcourseTypeId;
		this.TP5pictype = TP5pictype;
		this.TCacertAgency = TCacertAgency;
		this.ctcourseTypeTx = ctcourseTypeTx;
		this.ctprefixTx = ctprefixTx;
		this.ctminNoIn = ctminNoIn;
		this.ctmaxNoIn = ctmaxNoIn;
		this.ctcurrencyId = ctcurrencyId;
		this.ctexchangeRateFl = ctexchangeRateFl;
		this.ctprerequisiteIdN = ctprerequisiteIdN;
		this.ctpadicourseTypeIdN = ctpadicourseTypeIdN;
		this.ctvideoTxN = ctvideoTxN;
		this.ctunavailableBl = ctunavailableBl;
		this.ctlastUpdatedDate = ctlastUpdatedDate;
		this.ctpadikeyTxN = ctpadikeyTxN;
		this.ctdistinctiveBl = ctdistinctiveBl;
		this.ctuploadableBl = ctuploadableBl;
		this.ctinstructorPercentFl = ctinstructorPercentFl;
		this.ctrequiredBl = ctrequiredBl;
		this.ctmlgfolderTxN = ctmlgfolderTxN;
		this.ctmlgbl = ctmlgbl;
		this.ctcreationDate = ctcreationDate;
		this.ctforeColorIn = ctforeColorIn;
		this.ctbackColorIn = ctbackColorIn;
		this.ctdefaultEmpIdsN = ctdefaultEmpIdsN;
		this.ctempTypeIdsN = ctempTypeIdsN;
		this.cturltxN = cturltxN;
		this.ctcertPriorityInN = ctcertPriorityInN;
		this.ctwaitingListCapacityIn = ctwaitingListCapacityIn;
		this.ctnewPadikeyInN = ctnewPadikeyInN;
		this.ctdefPiccardTypeIdN = ctdefPiccardTypeIdN;
		this.cttabModulesBl = cttabModulesBl;
		this.cttabDatesBl = cttabDatesBl;
		this.cttabTimesBl = cttabTimesBl;
		this.cttabStaffBl = cttabStaffBl;
		this.cttabLocationsBl = cttabLocationsBl;
		this.cttabSummaryBl = cttabSummaryBl;
		this.cttabCustomersBl = cttabCustomersBl;
		this.cttabOptionsBl = cttabOptionsBl;
		this.cttabExpensesBl = cttabExpensesBl;
		this.cttabStockItemsBl = cttabStockItemsBl;
		this.ctshowDatesBl = ctshowDatesBl;
		this.ctshowSwimOptionsBl = ctshowSwimOptionsBl;
		this.cttabRequirementsBl = cttabRequirementsBl;
		this.TEmEmps = TEmEmps;
		this.TCsCourses = TCsCourses;
		this.TP4piccards = TP4piccards;
		this.TSzStockCourseTypes = TSzStockCourseTypes;
		this.TC8custInterests = TC8custInterests;
		this.TSoStores = TSoStores;
		this.TMtmoduleTypes = TMtmoduleTypes;
		this.TC1custCourses = TC1custCourses;
	}

	@Id

	@Column(name = "CTCourseTypeID", unique = true, nullable = false)
	public int getCtcourseTypeId() {
		return this.ctcourseTypeId;
	}

	public void setCtcourseTypeId(int ctcourseTypeId) {
		this.ctcourseTypeId = ctcourseTypeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTPICTypeID", nullable = false)
	public TP5pictype getTP5pictype() {
		return this.TP5pictype;
	}

	public void setTP5pictype(TP5pictype TP5pictype) {
		this.TP5pictype = TP5pictype;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTCertifyingAgencyID_N")
	public TCacertAgency getTCacertAgency() {
		return this.TCacertAgency;
	}

	public void setTCacertAgency(TCacertAgency TCacertAgency) {
		this.TCacertAgency = TCacertAgency;
	}

	@Column(name = "CTCourseTypeTx", unique = true, nullable = false)
	public String getCtcourseTypeTx() {
		return this.ctcourseTypeTx;
	}

	public void setCtcourseTypeTx(String ctcourseTypeTx) {
		this.ctcourseTypeTx = ctcourseTypeTx;
	}

	@Column(name = "CTPrefixTx", nullable = false)
	public String getCtprefixTx() {
		return this.ctprefixTx;
	}

	public void setCtprefixTx(String ctprefixTx) {
		this.ctprefixTx = ctprefixTx;
	}

	@Column(name = "CTMinNoIn", nullable = false)
	public short getCtminNoIn() {
		return this.ctminNoIn;
	}

	public void setCtminNoIn(short ctminNoIn) {
		this.ctminNoIn = ctminNoIn;
	}

	@Column(name = "CTMaxNoIn", nullable = false)
	public short getCtmaxNoIn() {
		return this.ctmaxNoIn;
	}

	public void setCtmaxNoIn(short ctmaxNoIn) {
		this.ctmaxNoIn = ctmaxNoIn;
	}

	@Column(name = "CTCurrencyID", nullable = false)
	public short getCtcurrencyId() {
		return this.ctcurrencyId;
	}

	public void setCtcurrencyId(short ctcurrencyId) {
		this.ctcurrencyId = ctcurrencyId;
	}

	@Column(name = "CTExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getCtexchangeRateFl() {
		return this.ctexchangeRateFl;
	}

	public void setCtexchangeRateFl(float ctexchangeRateFl) {
		this.ctexchangeRateFl = ctexchangeRateFl;
	}

	@Column(name = "CTPrerequisiteID_N")
	public Integer getCtprerequisiteIdN() {
		return this.ctprerequisiteIdN;
	}

	public void setCtprerequisiteIdN(Integer ctprerequisiteIdN) {
		this.ctprerequisiteIdN = ctprerequisiteIdN;
	}

	@Column(name = "CTPADICourseTypeID_N")
	public Integer getCtpadicourseTypeIdN() {
		return this.ctpadicourseTypeIdN;
	}

	public void setCtpadicourseTypeIdN(Integer ctpadicourseTypeIdN) {
		this.ctpadicourseTypeIdN = ctpadicourseTypeIdN;
	}

	@Column(name = "CTVideoTx_N")
	public String getCtvideoTxN() {
		return this.ctvideoTxN;
	}

	public void setCtvideoTxN(String ctvideoTxN) {
		this.ctvideoTxN = ctvideoTxN;
	}

	@Column(name = "CTUnavailableBl", nullable = false)
	public boolean isCtunavailableBl() {
		return this.ctunavailableBl;
	}

	public void setCtunavailableBl(boolean ctunavailableBl) {
		this.ctunavailableBl = ctunavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CTLastUpdatedDate", nullable = false, length = 23)
	public Date getCtlastUpdatedDate() {
		return this.ctlastUpdatedDate;
	}

	public void setCtlastUpdatedDate(Date ctlastUpdatedDate) {
		this.ctlastUpdatedDate = ctlastUpdatedDate;
	}

	@Column(name = "CTPADIKeyTx_N")
	public String getCtpadikeyTxN() {
		return this.ctpadikeyTxN;
	}

	public void setCtpadikeyTxN(String ctpadikeyTxN) {
		this.ctpadikeyTxN = ctpadikeyTxN;
	}

	@Column(name = "CTDistinctiveBl", nullable = false)
	public boolean isCtdistinctiveBl() {
		return this.ctdistinctiveBl;
	}

	public void setCtdistinctiveBl(boolean ctdistinctiveBl) {
		this.ctdistinctiveBl = ctdistinctiveBl;
	}

	@Column(name = "CTUploadableBl", nullable = false)
	public boolean isCtuploadableBl() {
		return this.ctuploadableBl;
	}

	public void setCtuploadableBl(boolean ctuploadableBl) {
		this.ctuploadableBl = ctuploadableBl;
	}

	@Column(name = "CTInstructorPercentFl", nullable = false, precision = 24, scale = 0)
	public float getCtinstructorPercentFl() {
		return this.ctinstructorPercentFl;
	}

	public void setCtinstructorPercentFl(float ctinstructorPercentFl) {
		this.ctinstructorPercentFl = ctinstructorPercentFl;
	}

	@Column(name = "CTRequiredBl", nullable = false)
	public boolean isCtrequiredBl() {
		return this.ctrequiredBl;
	}

	public void setCtrequiredBl(boolean ctrequiredBl) {
		this.ctrequiredBl = ctrequiredBl;
	}

	@Column(name = "CTMLGFolderTx_N")
	public String getCtmlgfolderTxN() {
		return this.ctmlgfolderTxN;
	}

	public void setCtmlgfolderTxN(String ctmlgfolderTxN) {
		this.ctmlgfolderTxN = ctmlgfolderTxN;
	}

	@Column(name = "CTMLGBl", nullable = false)
	public boolean isCtmlgbl() {
		return this.ctmlgbl;
	}

	public void setCtmlgbl(boolean ctmlgbl) {
		this.ctmlgbl = ctmlgbl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CTCreationDate", nullable = false, length = 23)
	public Date getCtcreationDate() {
		return this.ctcreationDate;
	}

	public void setCtcreationDate(Date ctcreationDate) {
		this.ctcreationDate = ctcreationDate;
	}

	@Column(name = "CTForeColorIn", nullable = false)
	public int getCtforeColorIn() {
		return this.ctforeColorIn;
	}

	public void setCtforeColorIn(int ctforeColorIn) {
		this.ctforeColorIn = ctforeColorIn;
	}

	@Column(name = "CTBackColorIn", nullable = false)
	public int getCtbackColorIn() {
		return this.ctbackColorIn;
	}

	public void setCtbackColorIn(int ctbackColorIn) {
		this.ctbackColorIn = ctbackColorIn;
	}

	@Column(name = "CTDefaultEmpIDs_N")
	public String getCtdefaultEmpIdsN() {
		return this.ctdefaultEmpIdsN;
	}

	public void setCtdefaultEmpIdsN(String ctdefaultEmpIdsN) {
		this.ctdefaultEmpIdsN = ctdefaultEmpIdsN;
	}

	@Column(name = "CTEmpTypeIDs_N")
	public String getCtempTypeIdsN() {
		return this.ctempTypeIdsN;
	}

	public void setCtempTypeIdsN(String ctempTypeIdsN) {
		this.ctempTypeIdsN = ctempTypeIdsN;
	}

	@Column(name = "CTURLTx_N")
	public String getCturltxN() {
		return this.cturltxN;
	}

	public void setCturltxN(String cturltxN) {
		this.cturltxN = cturltxN;
	}

	@Column(name = "CTCertPriorityIn_N")
	public Integer getCtcertPriorityInN() {
		return this.ctcertPriorityInN;
	}

	public void setCtcertPriorityInN(Integer ctcertPriorityInN) {
		this.ctcertPriorityInN = ctcertPriorityInN;
	}

	@Column(name = "CTWaitingListCapacityIn", nullable = false)
	public int getCtwaitingListCapacityIn() {
		return this.ctwaitingListCapacityIn;
	}

	public void setCtwaitingListCapacityIn(int ctwaitingListCapacityIn) {
		this.ctwaitingListCapacityIn = ctwaitingListCapacityIn;
	}

	@Column(name = "CTNewPADIKeyIn_N")
	public Integer getCtnewPadikeyInN() {
		return this.ctnewPadikeyInN;
	}

	public void setCtnewPadikeyInN(Integer ctnewPadikeyInN) {
		this.ctnewPadikeyInN = ctnewPadikeyInN;
	}

	@Column(name = "CTDefPICCardTypeID_N")
	public Integer getCtdefPiccardTypeIdN() {
		return this.ctdefPiccardTypeIdN;
	}

	public void setCtdefPiccardTypeIdN(Integer ctdefPiccardTypeIdN) {
		this.ctdefPiccardTypeIdN = ctdefPiccardTypeIdN;
	}

	@Column(name = "CTTabModulesBl", nullable = false)
	public boolean isCttabModulesBl() {
		return this.cttabModulesBl;
	}

	public void setCttabModulesBl(boolean cttabModulesBl) {
		this.cttabModulesBl = cttabModulesBl;
	}

	@Column(name = "CTTabDatesBl", nullable = false)
	public boolean isCttabDatesBl() {
		return this.cttabDatesBl;
	}

	public void setCttabDatesBl(boolean cttabDatesBl) {
		this.cttabDatesBl = cttabDatesBl;
	}

	@Column(name = "CTTabTimesBl", nullable = false)
	public boolean isCttabTimesBl() {
		return this.cttabTimesBl;
	}

	public void setCttabTimesBl(boolean cttabTimesBl) {
		this.cttabTimesBl = cttabTimesBl;
	}

	@Column(name = "CTTabStaffBl", nullable = false)
	public boolean isCttabStaffBl() {
		return this.cttabStaffBl;
	}

	public void setCttabStaffBl(boolean cttabStaffBl) {
		this.cttabStaffBl = cttabStaffBl;
	}

	@Column(name = "CTTabLocationsBl", nullable = false)
	public boolean isCttabLocationsBl() {
		return this.cttabLocationsBl;
	}

	public void setCttabLocationsBl(boolean cttabLocationsBl) {
		this.cttabLocationsBl = cttabLocationsBl;
	}

	@Column(name = "CTTabSummaryBl", nullable = false)
	public boolean isCttabSummaryBl() {
		return this.cttabSummaryBl;
	}

	public void setCttabSummaryBl(boolean cttabSummaryBl) {
		this.cttabSummaryBl = cttabSummaryBl;
	}

	@Column(name = "CTTabCustomersBl", nullable = false)
	public boolean isCttabCustomersBl() {
		return this.cttabCustomersBl;
	}

	public void setCttabCustomersBl(boolean cttabCustomersBl) {
		this.cttabCustomersBl = cttabCustomersBl;
	}

	@Column(name = "CTTabOptionsBl", nullable = false)
	public boolean isCttabOptionsBl() {
		return this.cttabOptionsBl;
	}

	public void setCttabOptionsBl(boolean cttabOptionsBl) {
		this.cttabOptionsBl = cttabOptionsBl;
	}

	@Column(name = "CTTabExpensesBl", nullable = false)
	public boolean isCttabExpensesBl() {
		return this.cttabExpensesBl;
	}

	public void setCttabExpensesBl(boolean cttabExpensesBl) {
		this.cttabExpensesBl = cttabExpensesBl;
	}

	@Column(name = "CTTabStockItemsBl", nullable = false)
	public boolean isCttabStockItemsBl() {
		return this.cttabStockItemsBl;
	}

	public void setCttabStockItemsBl(boolean cttabStockItemsBl) {
		this.cttabStockItemsBl = cttabStockItemsBl;
	}

	@Column(name = "CTShowDatesBl", nullable = false)
	public boolean isCtshowDatesBl() {
		return this.ctshowDatesBl;
	}

	public void setCtshowDatesBl(boolean ctshowDatesBl) {
		this.ctshowDatesBl = ctshowDatesBl;
	}

	@Column(name = "CTShowSwimOptionsBl", nullable = false)
	public boolean isCtshowSwimOptionsBl() {
		return this.ctshowSwimOptionsBl;
	}

	public void setCtshowSwimOptionsBl(boolean ctshowSwimOptionsBl) {
		this.ctshowSwimOptionsBl = ctshowSwimOptionsBl;
	}

	@Column(name = "CTTabRequirementsBl", nullable = false)
	public boolean isCttabRequirementsBl() {
		return this.cttabRequirementsBl;
	}

	public void setCttabRequirementsBl(boolean cttabRequirementsBl) {
		this.cttabRequirementsBl = cttabRequirementsBl;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_E1EmpCourseType", joinColumns = {
			@JoinColumn(name = "E1CourseTypeID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "E1EmpID", nullable = false, updatable = false) })
	public Set<TEmEmp> getTEmEmps() {
		return this.TEmEmps;
	}

	public void setTEmEmps(Set<TEmEmp> TEmEmps) {
		this.TEmEmps = TEmEmps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCtcourseType")
	public Set<TCsCourse> getTCsCourses() {
		return this.TCsCourses;
	}

	public void setTCsCourses(Set<TCsCourse> TCsCourses) {
		this.TCsCourses = TCsCourses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_X1CourseTypePICCard", joinColumns = {
			@JoinColumn(name = "X1CourseTypeID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "X1PICCardTypeID", nullable = false, updatable = false) })
	public Set<TP4piccard> getTP4piccards() {
		return this.TP4piccards;
	}

	public void setTP4piccards(Set<TP4piccard> TP4piccards) {
		this.TP4piccards = TP4piccards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCtcourseType")
	public Set<TSzStockCourseType> getTSzStockCourseTypes() {
		return this.TSzStockCourseTypes;
	}

	public void setTSzStockCourseTypes(Set<TSzStockCourseType> TSzStockCourseTypes) {
		this.TSzStockCourseTypes = TSzStockCourseTypes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCtcourseType")
	public Set<TC8custInterest> getTC8custInterests() {
		return this.TC8custInterests;
	}

	public void setTC8custInterests(Set<TC8custInterest> TC8custInterests) {
		this.TC8custInterests = TC8custInterests;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_Z6StoreCourseType", joinColumns = {
			@JoinColumn(name = "Z6CourseTypeID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Z6StoreID", nullable = false, updatable = false) })
	public Set<TSoStore> getTSoStores() {
		return this.TSoStores;
	}

	public void setTSoStores(Set<TSoStore> TSoStores) {
		this.TSoStores = TSoStores;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCtcourseType")
	public Set<TMtmoduleType> getTMtmoduleTypes() {
		return this.TMtmoduleTypes;
	}

	public void setTMtmoduleTypes(Set<TMtmoduleType> TMtmoduleTypes) {
		this.TMtmoduleTypes = TMtmoduleTypes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCtcourseType")
	public Set<TC1custCourse> getTC1custCourses() {
		return this.TC1custCourses;
	}

	public void setTC1custCourses(Set<TC1custCourse> TC1custCourses) {
		this.TC1custCourses = TC1custCourses;
	}

}
