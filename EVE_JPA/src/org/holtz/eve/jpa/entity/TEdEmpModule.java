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
 * TEdEmpModule generated by hbm2java
 */
@Entity
@Table(name = "T_EdEmpModule", uniqueConstraints = @UniqueConstraint(columnNames = { "EdModuleID", "EdEmpID" }))
public class TEdEmpModule implements java.io.Serializable {

	private int edEmpModuleId;
	private TMoModule TMoModule;
	private TEmEmp TEmEmp;
	private int edRoleId;
	private String edNotesTxN;
	private double edEmpPayMn;
	private double edEmpTaxMn;
	private Date edLastUpdatedDate;
	private short edCurrencyId;
	private float edExchangeRateFl;
	private Integer edCommissionClosingIdN;

	public TEdEmpModule() {
	}

	public TEdEmpModule(int edEmpModuleId, TMoModule TMoModule, TEmEmp TEmEmp, int edRoleId, double edEmpPayMn,
			double edEmpTaxMn, Date edLastUpdatedDate, short edCurrencyId, float edExchangeRateFl) {
		this.edEmpModuleId = edEmpModuleId;
		this.TMoModule = TMoModule;
		this.TEmEmp = TEmEmp;
		this.edRoleId = edRoleId;
		this.edEmpPayMn = edEmpPayMn;
		this.edEmpTaxMn = edEmpTaxMn;
		this.edLastUpdatedDate = edLastUpdatedDate;
		this.edCurrencyId = edCurrencyId;
		this.edExchangeRateFl = edExchangeRateFl;
	}

	public TEdEmpModule(int edEmpModuleId, TMoModule TMoModule, TEmEmp TEmEmp, int edRoleId, String edNotesTxN,
			double edEmpPayMn, double edEmpTaxMn, Date edLastUpdatedDate, short edCurrencyId, float edExchangeRateFl,
			Integer edCommissionClosingIdN) {
		this.edEmpModuleId = edEmpModuleId;
		this.TMoModule = TMoModule;
		this.TEmEmp = TEmEmp;
		this.edRoleId = edRoleId;
		this.edNotesTxN = edNotesTxN;
		this.edEmpPayMn = edEmpPayMn;
		this.edEmpTaxMn = edEmpTaxMn;
		this.edLastUpdatedDate = edLastUpdatedDate;
		this.edCurrencyId = edCurrencyId;
		this.edExchangeRateFl = edExchangeRateFl;
		this.edCommissionClosingIdN = edCommissionClosingIdN;
	}

	@Id

	@Column(name = "EdEmpModuleID", unique = true, nullable = false)
	public int getEdEmpModuleId() {
		return this.edEmpModuleId;
	}

	public void setEdEmpModuleId(int edEmpModuleId) {
		this.edEmpModuleId = edEmpModuleId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EdModuleID", nullable = false)
	public TMoModule getTMoModule() {
		return this.TMoModule;
	}

	public void setTMoModule(TMoModule TMoModule) {
		this.TMoModule = TMoModule;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EdEmpID", nullable = false)
	public TEmEmp getTEmEmp() {
		return this.TEmEmp;
	}

	public void setTEmEmp(TEmEmp TEmEmp) {
		this.TEmEmp = TEmEmp;
	}

	@Column(name = "EdRoleID", nullable = false)
	public int getEdRoleId() {
		return this.edRoleId;
	}

	public void setEdRoleId(int edRoleId) {
		this.edRoleId = edRoleId;
	}

	@Column(name = "EdNotesTx_N")
	public String getEdNotesTxN() {
		return this.edNotesTxN;
	}

	public void setEdNotesTxN(String edNotesTxN) {
		this.edNotesTxN = edNotesTxN;
	}

	@Column(name = "EdEmpPayMn", nullable = false, precision = 53, scale = 0)
	public double getEdEmpPayMn() {
		return this.edEmpPayMn;
	}

	public void setEdEmpPayMn(double edEmpPayMn) {
		this.edEmpPayMn = edEmpPayMn;
	}

	@Column(name = "EdEmpTaxMn", nullable = false, precision = 53, scale = 0)
	public double getEdEmpTaxMn() {
		return this.edEmpTaxMn;
	}

	public void setEdEmpTaxMn(double edEmpTaxMn) {
		this.edEmpTaxMn = edEmpTaxMn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EdLastUpdatedDate", nullable = false, length = 23)
	public Date getEdLastUpdatedDate() {
		return this.edLastUpdatedDate;
	}

	public void setEdLastUpdatedDate(Date edLastUpdatedDate) {
		this.edLastUpdatedDate = edLastUpdatedDate;
	}

	@Column(name = "EdCurrencyID", nullable = false)
	public short getEdCurrencyId() {
		return this.edCurrencyId;
	}

	public void setEdCurrencyId(short edCurrencyId) {
		this.edCurrencyId = edCurrencyId;
	}

	@Column(name = "EdExchangeRateFl", nullable = false, precision = 24, scale = 0)
	public float getEdExchangeRateFl() {
		return this.edExchangeRateFl;
	}

	public void setEdExchangeRateFl(float edExchangeRateFl) {
		this.edExchangeRateFl = edExchangeRateFl;
	}

	@Column(name = "EdCommissionClosingID_N")
	public Integer getEdCommissionClosingIdN() {
		return this.edCommissionClosingIdN;
	}

	public void setEdCommissionClosingIdN(Integer edCommissionClosingIdN) {
		this.edCommissionClosingIdN = edCommissionClosingIdN;
	}

}
