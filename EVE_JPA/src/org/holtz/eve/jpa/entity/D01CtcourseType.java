package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * D01CtcourseType generated by hbm2java
 */
@Entity
@Table(name = "d01_CTCourseType")
public class D01CtcourseType implements java.io.Serializable {

	private D01CtcourseTypeId id;

	public D01CtcourseType() {
	}

	public D01CtcourseType(D01CtcourseTypeId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "ctcourseTypeId", column = @Column(name = "CTCourseTypeID", nullable = false)),
			@AttributeOverride(name = "ctcourseTypeTx", column = @Column(name = "CTCourseTypeTx", nullable = false)),
			@AttributeOverride(name = "ctprefixTx", column = @Column(name = "CTPrefixTx", nullable = false)),
			@AttributeOverride(name = "ctminNoIn", column = @Column(name = "CTMinNoIn", nullable = false)),
			@AttributeOverride(name = "ctmaxNoIn", column = @Column(name = "CTMaxNoIn", nullable = false)),
			@AttributeOverride(name = "ctcurrencyId", column = @Column(name = "CTCurrencyID", nullable = false)),
			@AttributeOverride(name = "ctexchangeRateFl", column = @Column(name = "CTExchangeRateFl", nullable = false, precision = 24, scale = 0)),
			@AttributeOverride(name = "ctprerequisiteIdN", column = @Column(name = "CTPrerequisiteID_N")),
			@AttributeOverride(name = "ctcertifyingAgencyIdN", column = @Column(name = "CTCertifyingAgencyID_N")),
			@AttributeOverride(name = "ctpadicourseTypeIdN", column = @Column(name = "CTPADICourseTypeID_N")),
			@AttributeOverride(name = "ctvideoTxN", column = @Column(name = "CTVideoTx_N")),
			@AttributeOverride(name = "ctunavailableBl", column = @Column(name = "CTUnavailableBl", nullable = false)),
			@AttributeOverride(name = "ctlastUpdatedDate", column = @Column(name = "CTLastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "ctpadikeyTxN", column = @Column(name = "CTPADIKeyTx_N")),
			@AttributeOverride(name = "ctdistinctiveBl", column = @Column(name = "CTDistinctiveBl", nullable = false)),
			@AttributeOverride(name = "ctuploadableBl", column = @Column(name = "CTUploadableBl", nullable = false)),
			@AttributeOverride(name = "ctinstructorPercentFl", column = @Column(name = "CTInstructorPercentFl", nullable = false, precision = 24, scale = 0)),
			@AttributeOverride(name = "ctrequiredBl", column = @Column(name = "CTRequiredBl", nullable = false)),
			@AttributeOverride(name = "ctmlgfolderTxN", column = @Column(name = "CTMLGFolderTx_N")),
			@AttributeOverride(name = "ctmlgbl", column = @Column(name = "CTMLGBl", nullable = false)),
			@AttributeOverride(name = "ctcreationDate", column = @Column(name = "CTCreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "ctforeColorIn", column = @Column(name = "CTForeColorIn", nullable = false)),
			@AttributeOverride(name = "ctbackColorIn", column = @Column(name = "CTBackColorIn", nullable = false)),
			@AttributeOverride(name = "ctdefaultEmpIdsN", column = @Column(name = "CTDefaultEmpIDs_N")),
			@AttributeOverride(name = "ctempTypeIdsN", column = @Column(name = "CTEmpTypeIDs_N")),
			@AttributeOverride(name = "cturltxN", column = @Column(name = "CTURLTx_N")),
			@AttributeOverride(name = "ctcertPriorityInN", column = @Column(name = "CTCertPriorityIn_N")),
			@AttributeOverride(name = "ctwaitingListCapacityIn", column = @Column(name = "CTWaitingListCapacityIn", nullable = false)),
			@AttributeOverride(name = "ctpictypeId", column = @Column(name = "CTPICTypeID", nullable = false)),
			@AttributeOverride(name = "ctnewPadikeyInN", column = @Column(name = "CTNewPADIKeyIn_N")),
			@AttributeOverride(name = "ctdefPiccardTypeIdN", column = @Column(name = "CTDefPICCardTypeID_N")),
			@AttributeOverride(name = "cttabModulesBl", column = @Column(name = "CTTabModulesBl", nullable = false)),
			@AttributeOverride(name = "cttabDatesBl", column = @Column(name = "CTTabDatesBl", nullable = false)),
			@AttributeOverride(name = "cttabTimesBl", column = @Column(name = "CTTabTimesBl", nullable = false)),
			@AttributeOverride(name = "cttabStaffBl", column = @Column(name = "CTTabStaffBl", nullable = false)),
			@AttributeOverride(name = "cttabLocationsBl", column = @Column(name = "CTTabLocationsBl", nullable = false)),
			@AttributeOverride(name = "cttabSummaryBl", column = @Column(name = "CTTabSummaryBl", nullable = false)),
			@AttributeOverride(name = "cttabCustomersBl", column = @Column(name = "CTTabCustomersBl", nullable = false)),
			@AttributeOverride(name = "cttabOptionsBl", column = @Column(name = "CTTabOptionsBl", nullable = false)),
			@AttributeOverride(name = "cttabExpensesBl", column = @Column(name = "CTTabExpensesBl", nullable = false)),
			@AttributeOverride(name = "cttabStockItemsBl", column = @Column(name = "CTTabStockItemsBl", nullable = false)),
			@AttributeOverride(name = "ctshowDatesBl", column = @Column(name = "CTShowDatesBl", nullable = false)),
			@AttributeOverride(name = "ctshowSwimOptionsBl", column = @Column(name = "CTShowSwimOptionsBl", nullable = false)),
			@AttributeOverride(name = "cttabRequirementsBl", column = @Column(name = "CTTabRequirementsBl", nullable = false)) })
	public D01CtcourseTypeId getId() {
		return this.id;
	}

	public void setId(D01CtcourseTypeId id) {
		this.id = id;
	}

}
