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
 * TC3custCreditCard generated by hbm2java
 */
@Entity
@Table(name = "T_C3CustCreditCard")
public class TC3custCreditCard implements java.io.Serializable {

	private int c3custCreditCardId;
	private TCuCust TCuCust;
	private TPmpaymentMethod TPmpaymentMethod;
	private String c3creditCardNoTx;
	private String c3expiryDate;
	private boolean c3unavailableBl;
	private Date c3creationDate;
	private Date c3lastUpdatedDate;
	private String c3startDateN;
	private String c3firstNameTxN;
	private String c3lastNameTxN;
	private String c3houseNoTxN;
	private String c3postcodeTxN;
	private String c3countryCodeTxN;
	private String c3issueNoTxN;

	public TC3custCreditCard() {
	}

	public TC3custCreditCard(int c3custCreditCardId, TCuCust TCuCust, TPmpaymentMethod TPmpaymentMethod,
			boolean c3unavailableBl, Date c3creationDate, Date c3lastUpdatedDate) {
		this.c3custCreditCardId = c3custCreditCardId;
		this.TCuCust = TCuCust;
		this.TPmpaymentMethod = TPmpaymentMethod;
		this.c3unavailableBl = c3unavailableBl;
		this.c3creationDate = c3creationDate;
		this.c3lastUpdatedDate = c3lastUpdatedDate;
	}

	public TC3custCreditCard(int c3custCreditCardId, TCuCust TCuCust, TPmpaymentMethod TPmpaymentMethod,
			String c3creditCardNoTx, String c3expiryDate, boolean c3unavailableBl, Date c3creationDate,
			Date c3lastUpdatedDate, String c3startDateN, String c3firstNameTxN, String c3lastNameTxN,
			String c3houseNoTxN, String c3postcodeTxN, String c3countryCodeTxN,
			String c3issueNoTxN) {
		this.c3custCreditCardId = c3custCreditCardId;
		this.TCuCust = TCuCust;
		this.TPmpaymentMethod = TPmpaymentMethod;
		this.c3creditCardNoTx = c3creditCardNoTx;
		this.c3expiryDate = c3expiryDate;
		this.c3unavailableBl = c3unavailableBl;
		this.c3creationDate = c3creationDate;
		this.c3lastUpdatedDate = c3lastUpdatedDate;
		this.c3startDateN = c3startDateN;
		this.c3firstNameTxN = c3firstNameTxN;
		this.c3lastNameTxN = c3lastNameTxN;
		this.c3houseNoTxN = c3houseNoTxN;
		this.c3postcodeTxN = c3postcodeTxN;
		this.c3countryCodeTxN = c3countryCodeTxN;
		this.c3issueNoTxN = c3issueNoTxN;
	}

	@Id

	@Column(name = "C3CustCreditCardID", unique = true, nullable = false)
	public int getC3custCreditCardId() {
		return this.c3custCreditCardId;
	}

	public void setC3custCreditCardId(int c3custCreditCardId) {
		this.c3custCreditCardId = c3custCreditCardId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C3CustID", nullable = false)
	public TCuCust getTCuCust() {
		return this.TCuCust;
	}

	public void setTCuCust(TCuCust TCuCust) {
		this.TCuCust = TCuCust;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C3PaymentMethodID", nullable = false)
	public TPmpaymentMethod getTPmpaymentMethod() {
		return this.TPmpaymentMethod;
	}

	public void setTPmpaymentMethod(TPmpaymentMethod TPmpaymentMethod) {
		this.TPmpaymentMethod = TPmpaymentMethod;
	}

	@Column(name = "C3CreditCardNoTx")
	public String getC3creditCardNoTx() {
		return this.c3creditCardNoTx;
	}

	public void setC3creditCardNoTx(String c3creditCardNoTx) {
		this.c3creditCardNoTx = c3creditCardNoTx;
	}

	@Column(name = "C3ExpiryDate")
	public String getC3expiryDate() {
		return this.c3expiryDate;
	}

	public void setC3expiryDate(String c3expiryDate) {
		this.c3expiryDate = c3expiryDate;
	}

	@Column(name = "C3UnavailableBl", nullable = false)
	public boolean isC3unavailableBl() {
		return this.c3unavailableBl;
	}

	public void setC3unavailableBl(boolean c3unavailableBl) {
		this.c3unavailableBl = c3unavailableBl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "C3CreationDate", nullable = false, length = 23)
	public Date getC3creationDate() {
		return this.c3creationDate;
	}

	public void setC3creationDate(Date c3creationDate) {
		this.c3creationDate = c3creationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "C3LastUpdatedDate", nullable = false, length = 23)
	public Date getC3lastUpdatedDate() {
		return this.c3lastUpdatedDate;
	}

	public void setC3lastUpdatedDate(Date c3lastUpdatedDate) {
		this.c3lastUpdatedDate = c3lastUpdatedDate;
	}

	@Column(name = "C3StartDate_N")
	public String getC3startDateN() {
		return this.c3startDateN;
	}

	public void setC3startDateN(String c3startDateN) {
		this.c3startDateN = c3startDateN;
	}

	@Column(name = "C3FirstNameTx_N")
	public String getC3firstNameTxN() {
		return this.c3firstNameTxN;
	}

	public void setC3firstNameTxN(String c3firstNameTxN) {
		this.c3firstNameTxN = c3firstNameTxN;
	}

	@Column(name = "C3LastNameTx_N")
	public String getC3lastNameTxN() {
		return this.c3lastNameTxN;
	}

	public void setC3lastNameTxN(String c3lastNameTxN) {
		this.c3lastNameTxN = c3lastNameTxN;
	}

	@Column(name = "C3HouseNoTx_N")
	public String getC3houseNoTxN() {
		return this.c3houseNoTxN;
	}

	public void setC3houseNoTxN(String c3houseNoTxN) {
		this.c3houseNoTxN = c3houseNoTxN;
	}

	@Column(name = "C3PostcodeTx_N")
	public String getC3postcodeTxN() {
		return this.c3postcodeTxN;
	}

	public void setC3postcodeTxN(String c3postcodeTxN) {
		this.c3postcodeTxN = c3postcodeTxN;
	}

	@Column(name = "C3CountryCodeTx_N")
	public String getC3countryCodeTxN() {
		return this.c3countryCodeTxN;
	}

	public void setC3countryCodeTxN(String c3countryCodeTxN) {
		this.c3countryCodeTxN = c3countryCodeTxN;
	}

	@Column(name = "C3IssueNoTx_N")
	public String getC3issueNoTxN() {
		return this.c3issueNoTxN;
	}

	public void setC3issueNoTxN(String c3issueNoTxN) {
		this.c3issueNoTxN = c3issueNoTxN;
	}

}
