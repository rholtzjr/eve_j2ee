package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01CtcourseTypeId generated by hbm2java
 */
@Embeddable
public class S01CtcourseTypeId implements java.io.Serializable {

	private int ctcourseTypeId;
	private String ctcourseTypeTx;
	private String ctprefixTx;
	private short ctminNoIn;
	private short ctmaxNoIn;
	private short ctcurrencyId;
	private float ctexchangeRateFl;
	private Integer ctprerequisiteIdN;
	private Integer ctcertifyingAgencyIdN;
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
	private int ctpictypeId;
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

	public S01CtcourseTypeId() {
	}

	public S01CtcourseTypeId(int ctcourseTypeId, String ctcourseTypeTx, String ctprefixTx, short ctminNoIn,
			short ctmaxNoIn, short ctcurrencyId, float ctexchangeRateFl, boolean ctunavailableBl,
			Date ctlastUpdatedDate, boolean ctdistinctiveBl, boolean ctuploadableBl, float ctinstructorPercentFl,
			boolean ctrequiredBl, boolean ctmlgbl, Date ctcreationDate, int ctforeColorIn, int ctbackColorIn,
			int ctwaitingListCapacityIn, int ctpictypeId, boolean cttabModulesBl, boolean cttabDatesBl,
			boolean cttabTimesBl, boolean cttabStaffBl, boolean cttabLocationsBl, boolean cttabSummaryBl,
			boolean cttabCustomersBl, boolean cttabOptionsBl, boolean cttabExpensesBl, boolean cttabStockItemsBl,
			boolean ctshowDatesBl, boolean ctshowSwimOptionsBl, boolean cttabRequirementsBl) {
		this.ctcourseTypeId = ctcourseTypeId;
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
		this.ctpictypeId = ctpictypeId;
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

	public S01CtcourseTypeId(int ctcourseTypeId, String ctcourseTypeTx, String ctprefixTx, short ctminNoIn,
			short ctmaxNoIn, short ctcurrencyId, float ctexchangeRateFl, Integer ctprerequisiteIdN,
			Integer ctcertifyingAgencyIdN, Integer ctpadicourseTypeIdN, String ctvideoTxN,
			boolean ctunavailableBl, Date ctlastUpdatedDate, String ctpadikeyTxN, boolean ctdistinctiveBl,
			boolean ctuploadableBl, float ctinstructorPercentFl, boolean ctrequiredBl, String ctmlgfolderTxN,
			boolean ctmlgbl, Date ctcreationDate, int ctforeColorIn, int ctbackColorIn, String ctdefaultEmpIdsN,
			String ctempTypeIdsN, String cturltxN, Integer ctcertPriorityInN, int ctwaitingListCapacityIn,
			int ctpictypeId, Integer ctnewPadikeyInN, Integer ctdefPiccardTypeIdN, boolean cttabModulesBl,
			boolean cttabDatesBl, boolean cttabTimesBl, boolean cttabStaffBl, boolean cttabLocationsBl,
			boolean cttabSummaryBl, boolean cttabCustomersBl, boolean cttabOptionsBl, boolean cttabExpensesBl,
			boolean cttabStockItemsBl, boolean ctshowDatesBl, boolean ctshowSwimOptionsBl,
			boolean cttabRequirementsBl) {
		this.ctcourseTypeId = ctcourseTypeId;
		this.ctcourseTypeTx = ctcourseTypeTx;
		this.ctprefixTx = ctprefixTx;
		this.ctminNoIn = ctminNoIn;
		this.ctmaxNoIn = ctmaxNoIn;
		this.ctcurrencyId = ctcurrencyId;
		this.ctexchangeRateFl = ctexchangeRateFl;
		this.ctprerequisiteIdN = ctprerequisiteIdN;
		this.ctcertifyingAgencyIdN = ctcertifyingAgencyIdN;
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
		this.ctpictypeId = ctpictypeId;
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
	}

	@Column(name = "CTCourseTypeID", nullable = false)
	public int getCtcourseTypeId() {
		return this.ctcourseTypeId;
	}

	public void setCtcourseTypeId(int ctcourseTypeId) {
		this.ctcourseTypeId = ctcourseTypeId;
	}

	@Column(name = "CTCourseTypeTx", nullable = false)
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

	@Column(name = "CTCertifyingAgencyID_N")
	public Integer getCtcertifyingAgencyIdN() {
		return this.ctcertifyingAgencyIdN;
	}

	public void setCtcertifyingAgencyIdN(Integer ctcertifyingAgencyIdN) {
		this.ctcertifyingAgencyIdN = ctcertifyingAgencyIdN;
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

	@Column(name = "CTPICTypeID", nullable = false)
	public int getCtpictypeId() {
		return this.ctpictypeId;
	}

	public void setCtpictypeId(int ctpictypeId) {
		this.ctpictypeId = ctpictypeId;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01CtcourseTypeId))
			return false;
		S01CtcourseTypeId castOther = (S01CtcourseTypeId) other;

		return (this.getCtcourseTypeId() == castOther.getCtcourseTypeId())
				&& ((this.getCtcourseTypeTx() == castOther.getCtcourseTypeTx())
						|| (this.getCtcourseTypeTx() != null && castOther.getCtcourseTypeTx() != null
								&& this.getCtcourseTypeTx().equals(castOther.getCtcourseTypeTx())))
				&& ((this.getCtprefixTx() == castOther.getCtprefixTx()) || (this.getCtprefixTx() != null
						&& castOther.getCtprefixTx() != null && this.getCtprefixTx().equals(castOther.getCtprefixTx())))
				&& (this.getCtminNoIn() == castOther.getCtminNoIn())
				&& (this.getCtmaxNoIn() == castOther.getCtmaxNoIn())
				&& (this.getCtcurrencyId() == castOther.getCtcurrencyId())
				&& (this.getCtexchangeRateFl() == castOther.getCtexchangeRateFl())
				&& ((this.getCtprerequisiteIdN() == castOther.getCtprerequisiteIdN())
						|| (this.getCtprerequisiteIdN() != null && castOther.getCtprerequisiteIdN() != null
								&& this.getCtprerequisiteIdN().equals(castOther.getCtprerequisiteIdN())))
				&& ((this.getCtcertifyingAgencyIdN() == castOther.getCtcertifyingAgencyIdN())
						|| (this.getCtcertifyingAgencyIdN() != null && castOther.getCtcertifyingAgencyIdN() != null
								&& this.getCtcertifyingAgencyIdN().equals(castOther.getCtcertifyingAgencyIdN())))
				&& ((this.getCtpadicourseTypeIdN() == castOther.getCtpadicourseTypeIdN())
						|| (this.getCtpadicourseTypeIdN() != null && castOther.getCtpadicourseTypeIdN() != null
								&& this.getCtpadicourseTypeIdN().equals(castOther.getCtpadicourseTypeIdN())))
				&& ((this.getCtvideoTxN() == castOther.getCtvideoTxN()) || (this.getCtvideoTxN() != null
						&& castOther.getCtvideoTxN() != null && this.getCtvideoTxN().equals(castOther.getCtvideoTxN())))
				&& (this.isCtunavailableBl() == castOther.isCtunavailableBl())
				&& ((this.getCtlastUpdatedDate() == castOther.getCtlastUpdatedDate())
						|| (this.getCtlastUpdatedDate() != null && castOther.getCtlastUpdatedDate() != null
								&& this.getCtlastUpdatedDate().equals(castOther.getCtlastUpdatedDate())))
				&& ((this.getCtpadikeyTxN() == castOther.getCtpadikeyTxN())
						|| (this.getCtpadikeyTxN() != null && castOther.getCtpadikeyTxN() != null
								&& this.getCtpadikeyTxN().equals(castOther.getCtpadikeyTxN())))
				&& (this.isCtdistinctiveBl() == castOther.isCtdistinctiveBl())
				&& (this.isCtuploadableBl() == castOther.isCtuploadableBl())
				&& (this.getCtinstructorPercentFl() == castOther.getCtinstructorPercentFl())
				&& (this.isCtrequiredBl() == castOther.isCtrequiredBl())
				&& ((this.getCtmlgfolderTxN() == castOther.getCtmlgfolderTxN())
						|| (this.getCtmlgfolderTxN() != null && castOther.getCtmlgfolderTxN() != null
								&& this.getCtmlgfolderTxN().equals(castOther.getCtmlgfolderTxN())))
				&& (this.isCtmlgbl() == castOther.isCtmlgbl())
				&& ((this.getCtcreationDate() == castOther.getCtcreationDate())
						|| (this.getCtcreationDate() != null && castOther.getCtcreationDate() != null
								&& this.getCtcreationDate().equals(castOther.getCtcreationDate())))
				&& (this.getCtforeColorIn() == castOther.getCtforeColorIn())
				&& (this.getCtbackColorIn() == castOther.getCtbackColorIn())
				&& ((this.getCtdefaultEmpIdsN() == castOther.getCtdefaultEmpIdsN())
						|| (this.getCtdefaultEmpIdsN() != null && castOther.getCtdefaultEmpIdsN() != null
								&& this.getCtdefaultEmpIdsN().equals(castOther.getCtdefaultEmpIdsN())))
				&& ((this.getCtempTypeIdsN() == castOther.getCtempTypeIdsN())
						|| (this.getCtempTypeIdsN() != null && castOther.getCtempTypeIdsN() != null
								&& this.getCtempTypeIdsN().equals(castOther.getCtempTypeIdsN())))
				&& ((this.getCturltxN() == castOther.getCturltxN()) || (this.getCturltxN() != null
						&& castOther.getCturltxN() != null && this.getCturltxN().equals(castOther.getCturltxN())))
				&& ((this.getCtcertPriorityInN() == castOther.getCtcertPriorityInN())
						|| (this.getCtcertPriorityInN() != null && castOther.getCtcertPriorityInN() != null
								&& this.getCtcertPriorityInN().equals(castOther.getCtcertPriorityInN())))
				&& (this.getCtwaitingListCapacityIn() == castOther.getCtwaitingListCapacityIn())
				&& (this.getCtpictypeId() == castOther.getCtpictypeId())
				&& ((this.getCtnewPadikeyInN() == castOther.getCtnewPadikeyInN())
						|| (this.getCtnewPadikeyInN() != null && castOther.getCtnewPadikeyInN() != null
								&& this.getCtnewPadikeyInN().equals(castOther.getCtnewPadikeyInN())))
				&& ((this.getCtdefPiccardTypeIdN() == castOther.getCtdefPiccardTypeIdN())
						|| (this.getCtdefPiccardTypeIdN() != null && castOther.getCtdefPiccardTypeIdN() != null
								&& this.getCtdefPiccardTypeIdN().equals(castOther.getCtdefPiccardTypeIdN())))
				&& (this.isCttabModulesBl() == castOther.isCttabModulesBl())
				&& (this.isCttabDatesBl() == castOther.isCttabDatesBl())
				&& (this.isCttabTimesBl() == castOther.isCttabTimesBl())
				&& (this.isCttabStaffBl() == castOther.isCttabStaffBl())
				&& (this.isCttabLocationsBl() == castOther.isCttabLocationsBl())
				&& (this.isCttabSummaryBl() == castOther.isCttabSummaryBl())
				&& (this.isCttabCustomersBl() == castOther.isCttabCustomersBl())
				&& (this.isCttabOptionsBl() == castOther.isCttabOptionsBl())
				&& (this.isCttabExpensesBl() == castOther.isCttabExpensesBl())
				&& (this.isCttabStockItemsBl() == castOther.isCttabStockItemsBl())
				&& (this.isCtshowDatesBl() == castOther.isCtshowDatesBl())
				&& (this.isCtshowSwimOptionsBl() == castOther.isCtshowSwimOptionsBl())
				&& (this.isCttabRequirementsBl() == castOther.isCttabRequirementsBl());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCtcourseTypeId();
		result = 37 * result + (getCtcourseTypeTx() == null ? 0 : this.getCtcourseTypeTx().hashCode());
		result = 37 * result + (getCtprefixTx() == null ? 0 : this.getCtprefixTx().hashCode());
		result = 37 * result + this.getCtminNoIn();
		result = 37 * result + this.getCtmaxNoIn();
		result = 37 * result + this.getCtcurrencyId();
		result = 37 * result + (int) this.getCtexchangeRateFl();
		result = 37 * result + (getCtprerequisiteIdN() == null ? 0 : this.getCtprerequisiteIdN().hashCode());
		result = 37 * result + (getCtcertifyingAgencyIdN() == null ? 0 : this.getCtcertifyingAgencyIdN().hashCode());
		result = 37 * result + (getCtpadicourseTypeIdN() == null ? 0 : this.getCtpadicourseTypeIdN().hashCode());
		result = 37 * result + (getCtvideoTxN() == null ? 0 : this.getCtvideoTxN().hashCode());
		result = 37 * result + (this.isCtunavailableBl() ? 1 : 0);
		result = 37 * result + (getCtlastUpdatedDate() == null ? 0 : this.getCtlastUpdatedDate().hashCode());
		result = 37 * result + (getCtpadikeyTxN() == null ? 0 : this.getCtpadikeyTxN().hashCode());
		result = 37 * result + (this.isCtdistinctiveBl() ? 1 : 0);
		result = 37 * result + (this.isCtuploadableBl() ? 1 : 0);
		result = 37 * result + (int) this.getCtinstructorPercentFl();
		result = 37 * result + (this.isCtrequiredBl() ? 1 : 0);
		result = 37 * result + (getCtmlgfolderTxN() == null ? 0 : this.getCtmlgfolderTxN().hashCode());
		result = 37 * result + (this.isCtmlgbl() ? 1 : 0);
		result = 37 * result + (getCtcreationDate() == null ? 0 : this.getCtcreationDate().hashCode());
		result = 37 * result + this.getCtforeColorIn();
		result = 37 * result + this.getCtbackColorIn();
		result = 37 * result + (getCtdefaultEmpIdsN() == null ? 0 : this.getCtdefaultEmpIdsN().hashCode());
		result = 37 * result + (getCtempTypeIdsN() == null ? 0 : this.getCtempTypeIdsN().hashCode());
		result = 37 * result + (getCturltxN() == null ? 0 : this.getCturltxN().hashCode());
		result = 37 * result + (getCtcertPriorityInN() == null ? 0 : this.getCtcertPriorityInN().hashCode());
		result = 37 * result + this.getCtwaitingListCapacityIn();
		result = 37 * result + this.getCtpictypeId();
		result = 37 * result + (getCtnewPadikeyInN() == null ? 0 : this.getCtnewPadikeyInN().hashCode());
		result = 37 * result + (getCtdefPiccardTypeIdN() == null ? 0 : this.getCtdefPiccardTypeIdN().hashCode());
		result = 37 * result + (this.isCttabModulesBl() ? 1 : 0);
		result = 37 * result + (this.isCttabDatesBl() ? 1 : 0);
		result = 37 * result + (this.isCttabTimesBl() ? 1 : 0);
		result = 37 * result + (this.isCttabStaffBl() ? 1 : 0);
		result = 37 * result + (this.isCttabLocationsBl() ? 1 : 0);
		result = 37 * result + (this.isCttabSummaryBl() ? 1 : 0);
		result = 37 * result + (this.isCttabCustomersBl() ? 1 : 0);
		result = 37 * result + (this.isCttabOptionsBl() ? 1 : 0);
		result = 37 * result + (this.isCttabExpensesBl() ? 1 : 0);
		result = 37 * result + (this.isCttabStockItemsBl() ? 1 : 0);
		result = 37 * result + (this.isCtshowDatesBl() ? 1 : 0);
		result = 37 * result + (this.isCtshowSwimOptionsBl() ? 1 : 0);
		result = 37 * result + (this.isCttabRequirementsBl() ? 1 : 0);
		return result;
	}

}
