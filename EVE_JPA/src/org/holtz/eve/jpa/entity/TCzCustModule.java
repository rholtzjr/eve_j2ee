package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TCzCustModule generated by hbm2java
 */
@Entity
@Table(name = "T_CzCustModule")
public class TCzCustModule implements java.io.Serializable {

	private TCzCustModuleId id;
	private TCuCust TCuCust;
	private TMoModule TMoModule;
	private Date czLastUpdatedDate;
	private boolean czAttendedBl;
	private String czScoreTxN;
	private String czNotesTxN;
	private Integer czRentalBookingIdN;
	private Date czTickDateN;
	private Integer czInstructorIdN;
	private Date czAttendanceDateN;
	private Integer czCommissionClosingIdN;

	public TCzCustModule() {
	}

	public TCzCustModule(TCzCustModuleId id, TCuCust TCuCust, TMoModule TMoModule, Date czLastUpdatedDate,
			boolean czAttendedBl) {
		this.id = id;
		this.TCuCust = TCuCust;
		this.TMoModule = TMoModule;
		this.czLastUpdatedDate = czLastUpdatedDate;
		this.czAttendedBl = czAttendedBl;
	}

	public TCzCustModule(TCzCustModuleId id, TCuCust TCuCust, TMoModule TMoModule, Date czLastUpdatedDate,
			boolean czAttendedBl, String czScoreTxN, String czNotesTxN, Integer czRentalBookingIdN,
			Date czTickDateN, Integer czInstructorIdN, Date czAttendanceDateN, Integer czCommissionClosingIdN) {
		this.id = id;
		this.TCuCust = TCuCust;
		this.TMoModule = TMoModule;
		this.czLastUpdatedDate = czLastUpdatedDate;
		this.czAttendedBl = czAttendedBl;
		this.czScoreTxN = czScoreTxN;
		this.czNotesTxN = czNotesTxN;
		this.czRentalBookingIdN = czRentalBookingIdN;
		this.czTickDateN = czTickDateN;
		this.czInstructorIdN = czInstructorIdN;
		this.czAttendanceDateN = czAttendanceDateN;
		this.czCommissionClosingIdN = czCommissionClosingIdN;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "czCustId", column = @Column(name = "CzCustID", nullable = false)),
			@AttributeOverride(name = "czModuleId", column = @Column(name = "CzModuleID", nullable = false)) })
	public TCzCustModuleId getId() {
		return this.id;
	}

	public void setId(TCzCustModuleId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CzCustID", nullable = false, insertable = false, updatable = false)
	public TCuCust getTCuCust() {
		return this.TCuCust;
	}

	public void setTCuCust(TCuCust TCuCust) {
		this.TCuCust = TCuCust;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CzModuleID", nullable = false, insertable = false, updatable = false)
	public TMoModule getTMoModule() {
		return this.TMoModule;
	}

	public void setTMoModule(TMoModule TMoModule) {
		this.TMoModule = TMoModule;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CzLastUpdatedDate", nullable = false, length = 23)
	public Date getCzLastUpdatedDate() {
		return this.czLastUpdatedDate;
	}

	public void setCzLastUpdatedDate(Date czLastUpdatedDate) {
		this.czLastUpdatedDate = czLastUpdatedDate;
	}

	@Column(name = "CzAttendedBl", nullable = false)
	public boolean isCzAttendedBl() {
		return this.czAttendedBl;
	}

	public void setCzAttendedBl(boolean czAttendedBl) {
		this.czAttendedBl = czAttendedBl;
	}

	@Column(name = "CzScoreTx_N")
	public String getCzScoreTxN() {
		return this.czScoreTxN;
	}

	public void setCzScoreTxN(String czScoreTxN) {
		this.czScoreTxN = czScoreTxN;
	}

	@Column(name = "CzNotesTx_N")
	public String getCzNotesTxN() {
		return this.czNotesTxN;
	}

	public void setCzNotesTxN(String czNotesTxN) {
		this.czNotesTxN = czNotesTxN;
	}

	@Column(name = "CzRentalBookingID_N")
	public Integer getCzRentalBookingIdN() {
		return this.czRentalBookingIdN;
	}

	public void setCzRentalBookingIdN(Integer czRentalBookingIdN) {
		this.czRentalBookingIdN = czRentalBookingIdN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CzTickDate_N", length = 23)
	public Date getCzTickDateN() {
		return this.czTickDateN;
	}

	public void setCzTickDateN(Date czTickDateN) {
		this.czTickDateN = czTickDateN;
	}

	@Column(name = "CzInstructorID_N")
	public Integer getCzInstructorIdN() {
		return this.czInstructorIdN;
	}

	public void setCzInstructorIdN(Integer czInstructorIdN) {
		this.czInstructorIdN = czInstructorIdN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CzAttendanceDate_N", length = 23)
	public Date getCzAttendanceDateN() {
		return this.czAttendanceDateN;
	}

	public void setCzAttendanceDateN(Date czAttendanceDateN) {
		this.czAttendanceDateN = czAttendanceDateN;
	}

	@Column(name = "CzCommissionClosingID_N")
	public Integer getCzCommissionClosingIdN() {
		return this.czCommissionClosingIdN;
	}

	public void setCzCommissionClosingIdN(Integer czCommissionClosingIdN) {
		this.czCommissionClosingIdN = czCommissionClosingIdN;
	}

}
