package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
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

/**
 * TT3ticketRule generated by hbm2java
 */
@Entity
@Table(name = "T_T3TicketRule")
public class TT3ticketRule implements java.io.Serializable {

	private int t3ticketRuleId;
	private TEmEmp TEmEmp;
	private String t3emailDomainTx;
	private Date t3creationDate;

	public TT3ticketRule() {
	}

	public TT3ticketRule(int t3ticketRuleId, TEmEmp TEmEmp, String t3emailDomainTx, Date t3creationDate) {
		this.t3ticketRuleId = t3ticketRuleId;
		this.TEmEmp = TEmEmp;
		this.t3emailDomainTx = t3emailDomainTx;
		this.t3creationDate = t3creationDate;
	}

	@Id

	@Column(name = "T3TicketRuleID", unique = true, nullable = false)
	public int getT3ticketRuleId() {
		return this.t3ticketRuleId;
	}

	public void setT3ticketRuleId(int t3ticketRuleId) {
		this.t3ticketRuleId = t3ticketRuleId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "T3EmpID", nullable = false)
	public TEmEmp getTEmEmp() {
		return this.TEmEmp;
	}

	public void setTEmEmp(TEmEmp TEmEmp) {
		this.TEmEmp = TEmEmp;
	}

	@Column(name = "T3EmailDomainTx", nullable = false)
	public String getT3emailDomainTx() {
		return this.t3emailDomainTx;
	}

	public void setT3emailDomainTx(String t3emailDomainTx) {
		this.t3emailDomainTx = t3emailDomainTx;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "T3CreationDate", nullable = false, length = 23)
	public Date getT3creationDate() {
		return this.t3creationDate;
	}

	public void setT3creationDate(Date t3creationDate) {
		this.t3creationDate = t3creationDate;
	}

}
