package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * TCfCustClub generated by hbm2java
 */
@Entity
@Table(name = "T_CfCustClub", uniqueConstraints = @UniqueConstraint(columnNames = { "CfCustID", "CfClubID" }))
public class TCfCustClub implements java.io.Serializable {

	private int cfCustClubId;
	private TCbClub TCbClub;
	private TCuCust TCuCust;
	private TMmMembershipType TMmMembershipType;
	private String cfMembershipNoTxN;
	private Date cfCardValidFromDateN;
	private Date cfCardValidToDateN;
	private Date cfCardLastPrintedDate;

	public TCfCustClub() {
	}

	public TCfCustClub(int cfCustClubId, TCbClub TCbClub, TCuCust TCuCust, Date cfCardLastPrintedDate) {
		this.cfCustClubId = cfCustClubId;
		this.TCbClub = TCbClub;
		this.TCuCust = TCuCust;
		this.cfCardLastPrintedDate = cfCardLastPrintedDate;
	}

	public TCfCustClub(int cfCustClubId, TCbClub TCbClub, TCuCust TCuCust, TMmMembershipType TMmMembershipType,
			String cfMembershipNoTxN, Date cfCardValidFromDateN, Date cfCardValidToDateN,
			Date cfCardLastPrintedDate) {
		this.cfCustClubId = cfCustClubId;
		this.TCbClub = TCbClub;
		this.TCuCust = TCuCust;
		this.TMmMembershipType = TMmMembershipType;
		this.cfMembershipNoTxN = cfMembershipNoTxN;
		this.cfCardValidFromDateN = cfCardValidFromDateN;
		this.cfCardValidToDateN = cfCardValidToDateN;
		this.cfCardLastPrintedDate = cfCardLastPrintedDate;
	}

	@Id

	@Column(name = "CfCustClubID", unique = true, nullable = false)
	public int getCfCustClubId() {
		return this.cfCustClubId;
	}

	public void setCfCustClubId(int cfCustClubId) {
		this.cfCustClubId = cfCustClubId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CfClubID", nullable = false)
	public TCbClub getTCbClub() {
		return this.TCbClub;
	}

	public void setTCbClub(TCbClub TCbClub) {
		this.TCbClub = TCbClub;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CfCustID", nullable = false)
	public TCuCust getTCuCust() {
		return this.TCuCust;
	}

	public void setTCuCust(TCuCust TCuCust) {
		this.TCuCust = TCuCust;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CfMembershipTypeID_N")
	public TMmMembershipType getTMmMembershipType() {
		return this.TMmMembershipType;
	}

	public void setTMmMembershipType(TMmMembershipType TMmMembershipType) {
		this.TMmMembershipType = TMmMembershipType;
	}

	@Column(name = "CfMembershipNoTx_N")
	public String getCfMembershipNoTxN() {
		return this.cfMembershipNoTxN;
	}

	public void setCfMembershipNoTxN(String cfMembershipNoTxN) {
		this.cfMembershipNoTxN = cfMembershipNoTxN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CfCardValidFromDate_N", length = 23)
	public Date getCfCardValidFromDateN() {
		return this.cfCardValidFromDateN;
	}

	public void setCfCardValidFromDateN(Date cfCardValidFromDateN) {
		this.cfCardValidFromDateN = cfCardValidFromDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CfCardValidToDate_N", length = 23)
	public Date getCfCardValidToDateN() {
		return this.cfCardValidToDateN;
	}

	public void setCfCardValidToDateN(Date cfCardValidToDateN) {
		this.cfCardValidToDateN = cfCardValidToDateN;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CfCardLastPrintedDate", nullable = false, length = 23)
	public Date getCfCardLastPrintedDate() {
		return this.cfCardLastPrintedDate;
	}

	public void setCfCardLastPrintedDate(Date cfCardLastPrintedDate) {
		this.cfCardLastPrintedDate = cfCardLastPrintedDate;
	}

}
