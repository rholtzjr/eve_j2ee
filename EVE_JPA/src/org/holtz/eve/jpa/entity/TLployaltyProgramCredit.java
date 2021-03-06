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

/**
 * TLployaltyProgramCredit generated by hbm2java
 */
@Entity
@Table(name = "T_LPLoyaltyProgramCredit")
public class TLployaltyProgramCredit implements java.io.Serializable {

	private int lployaltyProgramCreditId;
	private TGdGiftCard TGdGiftCard;
	private double lpcreditMn;
	private Date lpcreationDate;

	public TLployaltyProgramCredit() {
	}

	public TLployaltyProgramCredit(int lployaltyProgramCreditId, TGdGiftCard TGdGiftCard, double lpcreditMn,
			Date lpcreationDate) {
		this.lployaltyProgramCreditId = lployaltyProgramCreditId;
		this.TGdGiftCard = TGdGiftCard;
		this.lpcreditMn = lpcreditMn;
		this.lpcreationDate = lpcreationDate;
	}

	@Id

	@Column(name = "LPLoyaltyProgramCreditID", unique = true, nullable = false)
	public int getLployaltyProgramCreditId() {
		return this.lployaltyProgramCreditId;
	}

	public void setLployaltyProgramCreditId(int lployaltyProgramCreditId) {
		this.lployaltyProgramCreditId = lployaltyProgramCreditId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LPGiftCardID", nullable = false)
	public TGdGiftCard getTGdGiftCard() {
		return this.TGdGiftCard;
	}

	public void setTGdGiftCard(TGdGiftCard TGdGiftCard) {
		this.TGdGiftCard = TGdGiftCard;
	}

	@Column(name = "LPCreditMn", nullable = false, precision = 53, scale = 0)
	public double getLpcreditMn() {
		return this.lpcreditMn;
	}

	public void setLpcreditMn(double lpcreditMn) {
		this.lpcreditMn = lpcreditMn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LPCreationDate", nullable = false, length = 23)
	public Date getLpcreationDate() {
		return this.lpcreationDate;
	}

	public void setLpcreationDate(Date lpcreationDate) {
		this.lpcreationDate = lpcreationDate;
	}

}
