package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01E3emailAgentId generated by hbm2java
 */
@Embeddable
public class S01E3emailAgentId implements java.io.Serializable {

	private int e3emailAgentId;
	private String e3eventTx;
	private String e3eventParam1txN;
	private String e3eventParam2txN;
	private String e3sqltx;
	private String e3outlookFolderTxN;
	private String e3subjectLineTx;
	private int e3delayIn;
	private int e3expiryDaysIn;
	private Date e3lastRunDate;
	private boolean e3confirmationRequiredBl;
	private String e3lastRunStatusTxN;
	private boolean e3runLaterIfAgentOffBl;
	private boolean e3unavailableBl;
	private String e3onMailingListsTxN;
	private String e3notOnMailingListsTxN;
	private String e3subQueryTxN;
	private int e3priorityIn;
	private boolean e3sendToNewsletterEngineBl;
	private String e3newsletterTemplateTxN;
	private String e3notesTxN;
	private String e3fromAccountTxN;
	private short e3storeId;
	private String e3primaryTablesTx;
	private int e3jobTypeId;
	private int e3subJobTypeId;
	private String e3listTxN;
	private boolean e3moveToFolderBl;
	private String e3viewTxN;
	private String e3columnsTxN;
	private String e3dateColumnTxN;
	private Integer e3datePeriodInN;
	private Integer e3dateValueInN;
	private Integer e3groupIdN;

	public S01E3emailAgentId() {
	}

	public S01E3emailAgentId(int e3emailAgentId, String e3eventTx, String e3sqltx,
			String e3subjectLineTx, int e3delayIn, int e3expiryDaysIn, Date e3lastRunDate,
			boolean e3confirmationRequiredBl, boolean e3runLaterIfAgentOffBl, boolean e3unavailableBl, int e3priorityIn,
			boolean e3sendToNewsletterEngineBl, short e3storeId, String e3primaryTablesTx, int e3jobTypeId,
			int e3subJobTypeId, boolean e3moveToFolderBl) {
		this.e3emailAgentId = e3emailAgentId;
		this.e3eventTx = e3eventTx;
		this.e3sqltx = e3sqltx;
		this.e3subjectLineTx = e3subjectLineTx;
		this.e3delayIn = e3delayIn;
		this.e3expiryDaysIn = e3expiryDaysIn;
		this.e3lastRunDate = e3lastRunDate;
		this.e3confirmationRequiredBl = e3confirmationRequiredBl;
		this.e3runLaterIfAgentOffBl = e3runLaterIfAgentOffBl;
		this.e3unavailableBl = e3unavailableBl;
		this.e3priorityIn = e3priorityIn;
		this.e3sendToNewsletterEngineBl = e3sendToNewsletterEngineBl;
		this.e3storeId = e3storeId;
		this.e3primaryTablesTx = e3primaryTablesTx;
		this.e3jobTypeId = e3jobTypeId;
		this.e3subJobTypeId = e3subJobTypeId;
		this.e3moveToFolderBl = e3moveToFolderBl;
	}

	public S01E3emailAgentId(int e3emailAgentId, String e3eventTx, String e3eventParam1txN,
			String e3eventParam2txN, String e3sqltx, String e3outlookFolderTxN,
			String e3subjectLineTx, int e3delayIn, int e3expiryDaysIn, Date e3lastRunDate,
			boolean e3confirmationRequiredBl, String e3lastRunStatusTxN, boolean e3runLaterIfAgentOffBl,
			boolean e3unavailableBl, String e3onMailingListsTxN, String e3notOnMailingListsTxN,
			String e3subQueryTxN, int e3priorityIn, boolean e3sendToNewsletterEngineBl,
			String e3newsletterTemplateTxN, String e3notesTxN, String e3fromAccountTxN,
			short e3storeId, String e3primaryTablesTx, int e3jobTypeId, int e3subJobTypeId,
			String e3listTxN, boolean e3moveToFolderBl, String e3viewTxN, String e3columnsTxN,
			String e3dateColumnTxN, Integer e3datePeriodInN, Integer e3dateValueInN, Integer e3groupIdN) {
		this.e3emailAgentId = e3emailAgentId;
		this.e3eventTx = e3eventTx;
		this.e3eventParam1txN = e3eventParam1txN;
		this.e3eventParam2txN = e3eventParam2txN;
		this.e3sqltx = e3sqltx;
		this.e3outlookFolderTxN = e3outlookFolderTxN;
		this.e3subjectLineTx = e3subjectLineTx;
		this.e3delayIn = e3delayIn;
		this.e3expiryDaysIn = e3expiryDaysIn;
		this.e3lastRunDate = e3lastRunDate;
		this.e3confirmationRequiredBl = e3confirmationRequiredBl;
		this.e3lastRunStatusTxN = e3lastRunStatusTxN;
		this.e3runLaterIfAgentOffBl = e3runLaterIfAgentOffBl;
		this.e3unavailableBl = e3unavailableBl;
		this.e3onMailingListsTxN = e3onMailingListsTxN;
		this.e3notOnMailingListsTxN = e3notOnMailingListsTxN;
		this.e3subQueryTxN = e3subQueryTxN;
		this.e3priorityIn = e3priorityIn;
		this.e3sendToNewsletterEngineBl = e3sendToNewsletterEngineBl;
		this.e3newsletterTemplateTxN = e3newsletterTemplateTxN;
		this.e3notesTxN = e3notesTxN;
		this.e3fromAccountTxN = e3fromAccountTxN;
		this.e3storeId = e3storeId;
		this.e3primaryTablesTx = e3primaryTablesTx;
		this.e3jobTypeId = e3jobTypeId;
		this.e3subJobTypeId = e3subJobTypeId;
		this.e3listTxN = e3listTxN;
		this.e3moveToFolderBl = e3moveToFolderBl;
		this.e3viewTxN = e3viewTxN;
		this.e3columnsTxN = e3columnsTxN;
		this.e3dateColumnTxN = e3dateColumnTxN;
		this.e3datePeriodInN = e3datePeriodInN;
		this.e3dateValueInN = e3dateValueInN;
		this.e3groupIdN = e3groupIdN;
	}

	@Column(name = "E3EmailAgentID", nullable = false)
	public int getE3emailAgentId() {
		return this.e3emailAgentId;
	}

	public void setE3emailAgentId(int e3emailAgentId) {
		this.e3emailAgentId = e3emailAgentId;
	}

	@Column(name = "E3EventTx", nullable = false)
	public String getE3eventTx() {
		return this.e3eventTx;
	}

	public void setE3eventTx(String e3eventTx) {
		this.e3eventTx = e3eventTx;
	}

	@Column(name = "E3EventParam1Tx_N")
	public String getE3eventParam1txN() {
		return this.e3eventParam1txN;
	}

	public void setE3eventParam1txN(String e3eventParam1txN) {
		this.e3eventParam1txN = e3eventParam1txN;
	}

	@Column(name = "E3EventParam2Tx_N")
	public String getE3eventParam2txN() {
		return this.e3eventParam2txN;
	}

	public void setE3eventParam2txN(String e3eventParam2txN) {
		this.e3eventParam2txN = e3eventParam2txN;
	}

	@Column(name = "E3SQLTx", nullable = false)
	public String getE3sqltx() {
		return this.e3sqltx;
	}

	public void setE3sqltx(String e3sqltx) {
		this.e3sqltx = e3sqltx;
	}

	@Column(name = "E3OutlookFolderTx_N")
	public String getE3outlookFolderTxN() {
		return this.e3outlookFolderTxN;
	}

	public void setE3outlookFolderTxN(String e3outlookFolderTxN) {
		this.e3outlookFolderTxN = e3outlookFolderTxN;
	}

	@Column(name = "E3SubjectLineTx", nullable = false)
	public String getE3subjectLineTx() {
		return this.e3subjectLineTx;
	}

	public void setE3subjectLineTx(String e3subjectLineTx) {
		this.e3subjectLineTx = e3subjectLineTx;
	}

	@Column(name = "E3DelayIn", nullable = false)
	public int getE3delayIn() {
		return this.e3delayIn;
	}

	public void setE3delayIn(int e3delayIn) {
		this.e3delayIn = e3delayIn;
	}

	@Column(name = "E3ExpiryDaysIn", nullable = false)
	public int getE3expiryDaysIn() {
		return this.e3expiryDaysIn;
	}

	public void setE3expiryDaysIn(int e3expiryDaysIn) {
		this.e3expiryDaysIn = e3expiryDaysIn;
	}

	@Column(name = "E3LastRunDate", nullable = false, length = 23)
	public Date getE3lastRunDate() {
		return this.e3lastRunDate;
	}

	public void setE3lastRunDate(Date e3lastRunDate) {
		this.e3lastRunDate = e3lastRunDate;
	}

	@Column(name = "E3ConfirmationRequiredBl", nullable = false)
	public boolean isE3confirmationRequiredBl() {
		return this.e3confirmationRequiredBl;
	}

	public void setE3confirmationRequiredBl(boolean e3confirmationRequiredBl) {
		this.e3confirmationRequiredBl = e3confirmationRequiredBl;
	}

	@Column(name = "E3LastRunStatusTx_N")
	public String getE3lastRunStatusTxN() {
		return this.e3lastRunStatusTxN;
	}

	public void setE3lastRunStatusTxN(String e3lastRunStatusTxN) {
		this.e3lastRunStatusTxN = e3lastRunStatusTxN;
	}

	@Column(name = "E3RunLaterIfAgentOffBl", nullable = false)
	public boolean isE3runLaterIfAgentOffBl() {
		return this.e3runLaterIfAgentOffBl;
	}

	public void setE3runLaterIfAgentOffBl(boolean e3runLaterIfAgentOffBl) {
		this.e3runLaterIfAgentOffBl = e3runLaterIfAgentOffBl;
	}

	@Column(name = "E3UnavailableBl", nullable = false)
	public boolean isE3unavailableBl() {
		return this.e3unavailableBl;
	}

	public void setE3unavailableBl(boolean e3unavailableBl) {
		this.e3unavailableBl = e3unavailableBl;
	}

	@Column(name = "E3OnMailingListsTx_N")
	public String getE3onMailingListsTxN() {
		return this.e3onMailingListsTxN;
	}

	public void setE3onMailingListsTxN(String e3onMailingListsTxN) {
		this.e3onMailingListsTxN = e3onMailingListsTxN;
	}

	@Column(name = "E3NotOnMailingListsTx_N")
	public String getE3notOnMailingListsTxN() {
		return this.e3notOnMailingListsTxN;
	}

	public void setE3notOnMailingListsTxN(String e3notOnMailingListsTxN) {
		this.e3notOnMailingListsTxN = e3notOnMailingListsTxN;
	}

	@Column(name = "E3SubQueryTx_N")
	public String getE3subQueryTxN() {
		return this.e3subQueryTxN;
	}

	public void setE3subQueryTxN(String e3subQueryTxN) {
		this.e3subQueryTxN = e3subQueryTxN;
	}

	@Column(name = "E3PriorityIn", nullable = false)
	public int getE3priorityIn() {
		return this.e3priorityIn;
	}

	public void setE3priorityIn(int e3priorityIn) {
		this.e3priorityIn = e3priorityIn;
	}

	@Column(name = "E3SendToNewsletterEngineBl", nullable = false)
	public boolean isE3sendToNewsletterEngineBl() {
		return this.e3sendToNewsletterEngineBl;
	}

	public void setE3sendToNewsletterEngineBl(boolean e3sendToNewsletterEngineBl) {
		this.e3sendToNewsletterEngineBl = e3sendToNewsletterEngineBl;
	}

	@Column(name = "E3NewsletterTemplateTx_N")
	public String getE3newsletterTemplateTxN() {
		return this.e3newsletterTemplateTxN;
	}

	public void setE3newsletterTemplateTxN(String e3newsletterTemplateTxN) {
		this.e3newsletterTemplateTxN = e3newsletterTemplateTxN;
	}

	@Column(name = "E3NotesTx_N")
	public String getE3notesTxN() {
		return this.e3notesTxN;
	}

	public void setE3notesTxN(String e3notesTxN) {
		this.e3notesTxN = e3notesTxN;
	}

	@Column(name = "E3FromAccountTx_N")
	public String getE3fromAccountTxN() {
		return this.e3fromAccountTxN;
	}

	public void setE3fromAccountTxN(String e3fromAccountTxN) {
		this.e3fromAccountTxN = e3fromAccountTxN;
	}

	@Column(name = "E3StoreID", nullable = false)
	public short getE3storeId() {
		return this.e3storeId;
	}

	public void setE3storeId(short e3storeId) {
		this.e3storeId = e3storeId;
	}

	@Column(name = "E3PrimaryTablesTx", nullable = false)
	public String getE3primaryTablesTx() {
		return this.e3primaryTablesTx;
	}

	public void setE3primaryTablesTx(String e3primaryTablesTx) {
		this.e3primaryTablesTx = e3primaryTablesTx;
	}

	@Column(name = "E3JobTypeID", nullable = false)
	public int getE3jobTypeId() {
		return this.e3jobTypeId;
	}

	public void setE3jobTypeId(int e3jobTypeId) {
		this.e3jobTypeId = e3jobTypeId;
	}

	@Column(name = "E3SubJobTypeID", nullable = false)
	public int getE3subJobTypeId() {
		return this.e3subJobTypeId;
	}

	public void setE3subJobTypeId(int e3subJobTypeId) {
		this.e3subJobTypeId = e3subJobTypeId;
	}

	@Column(name = "E3ListTx_N")
	public String getE3listTxN() {
		return this.e3listTxN;
	}

	public void setE3listTxN(String e3listTxN) {
		this.e3listTxN = e3listTxN;
	}

	@Column(name = "E3MoveToFolderBl", nullable = false)
	public boolean isE3moveToFolderBl() {
		return this.e3moveToFolderBl;
	}

	public void setE3moveToFolderBl(boolean e3moveToFolderBl) {
		this.e3moveToFolderBl = e3moveToFolderBl;
	}

	@Column(name = "E3ViewTx_N")
	public String getE3viewTxN() {
		return this.e3viewTxN;
	}

	public void setE3viewTxN(String e3viewTxN) {
		this.e3viewTxN = e3viewTxN;
	}

	@Column(name = "E3ColumnsTx_N")
	public String getE3columnsTxN() {
		return this.e3columnsTxN;
	}

	public void setE3columnsTxN(String e3columnsTxN) {
		this.e3columnsTxN = e3columnsTxN;
	}

	@Column(name = "E3DateColumnTx_N")
	public String getE3dateColumnTxN() {
		return this.e3dateColumnTxN;
	}

	public void setE3dateColumnTxN(String e3dateColumnTxN) {
		this.e3dateColumnTxN = e3dateColumnTxN;
	}

	@Column(name = "E3DatePeriodIn_N")
	public Integer getE3datePeriodInN() {
		return this.e3datePeriodInN;
	}

	public void setE3datePeriodInN(Integer e3datePeriodInN) {
		this.e3datePeriodInN = e3datePeriodInN;
	}

	@Column(name = "E3DateValueIn_N")
	public Integer getE3dateValueInN() {
		return this.e3dateValueInN;
	}

	public void setE3dateValueInN(Integer e3dateValueInN) {
		this.e3dateValueInN = e3dateValueInN;
	}

	@Column(name = "E3GroupID_N")
	public Integer getE3groupIdN() {
		return this.e3groupIdN;
	}

	public void setE3groupIdN(Integer e3groupIdN) {
		this.e3groupIdN = e3groupIdN;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01E3emailAgentId))
			return false;
		S01E3emailAgentId castOther = (S01E3emailAgentId) other;

		return (this.getE3emailAgentId() == castOther.getE3emailAgentId())
				&& ((this.getE3eventTx() == castOther.getE3eventTx()) || (this.getE3eventTx() != null
						&& castOther.getE3eventTx() != null && this.getE3eventTx().equals(castOther.getE3eventTx())))
				&& ((this.getE3eventParam1txN() == castOther.getE3eventParam1txN())
						|| (this.getE3eventParam1txN() != null && castOther.getE3eventParam1txN() != null
								&& this.getE3eventParam1txN().equals(castOther.getE3eventParam1txN())))
				&& ((this.getE3eventParam2txN() == castOther.getE3eventParam2txN())
						|| (this.getE3eventParam2txN() != null && castOther.getE3eventParam2txN() != null
								&& this.getE3eventParam2txN().equals(castOther.getE3eventParam2txN())))
				&& ((this.getE3sqltx() == castOther.getE3sqltx()) || (this.getE3sqltx() != null
						&& castOther.getE3sqltx() != null && this.getE3sqltx().equals(castOther.getE3sqltx())))
				&& ((this.getE3outlookFolderTxN() == castOther.getE3outlookFolderTxN())
						|| (this.getE3outlookFolderTxN() != null && castOther.getE3outlookFolderTxN() != null
								&& this.getE3outlookFolderTxN().equals(castOther.getE3outlookFolderTxN())))
				&& ((this.getE3subjectLineTx() == castOther.getE3subjectLineTx())
						|| (this.getE3subjectLineTx() != null && castOther.getE3subjectLineTx() != null
								&& this.getE3subjectLineTx().equals(castOther.getE3subjectLineTx())))
				&& (this.getE3delayIn() == castOther.getE3delayIn())
				&& (this.getE3expiryDaysIn() == castOther.getE3expiryDaysIn())
				&& ((this.getE3lastRunDate() == castOther.getE3lastRunDate())
						|| (this.getE3lastRunDate() != null && castOther.getE3lastRunDate() != null
								&& this.getE3lastRunDate().equals(castOther.getE3lastRunDate())))
				&& (this.isE3confirmationRequiredBl() == castOther.isE3confirmationRequiredBl())
				&& ((this.getE3lastRunStatusTxN() == castOther.getE3lastRunStatusTxN())
						|| (this.getE3lastRunStatusTxN() != null && castOther.getE3lastRunStatusTxN() != null
								&& this.getE3lastRunStatusTxN().equals(castOther.getE3lastRunStatusTxN())))
				&& (this.isE3runLaterIfAgentOffBl() == castOther.isE3runLaterIfAgentOffBl())
				&& (this.isE3unavailableBl() == castOther.isE3unavailableBl())
				&& ((this.getE3onMailingListsTxN() == castOther.getE3onMailingListsTxN())
						|| (this.getE3onMailingListsTxN() != null && castOther.getE3onMailingListsTxN() != null
								&& this.getE3onMailingListsTxN().equals(castOther.getE3onMailingListsTxN())))
				&& ((this.getE3notOnMailingListsTxN() == castOther.getE3notOnMailingListsTxN())
						|| (this.getE3notOnMailingListsTxN() != null && castOther.getE3notOnMailingListsTxN() != null
								&& this.getE3notOnMailingListsTxN().equals(castOther.getE3notOnMailingListsTxN())))
				&& ((this.getE3subQueryTxN() == castOther.getE3subQueryTxN())
						|| (this.getE3subQueryTxN() != null && castOther.getE3subQueryTxN() != null
								&& this.getE3subQueryTxN().equals(castOther.getE3subQueryTxN())))
				&& (this.getE3priorityIn() == castOther.getE3priorityIn())
				&& (this.isE3sendToNewsletterEngineBl() == castOther.isE3sendToNewsletterEngineBl())
				&& ((this.getE3newsletterTemplateTxN() == castOther.getE3newsletterTemplateTxN())
						|| (this.getE3newsletterTemplateTxN() != null && castOther.getE3newsletterTemplateTxN() != null
								&& this.getE3newsletterTemplateTxN().equals(castOther.getE3newsletterTemplateTxN())))
				&& ((this.getE3notesTxN() == castOther.getE3notesTxN()) || (this.getE3notesTxN() != null
						&& castOther.getE3notesTxN() != null && this.getE3notesTxN().equals(castOther.getE3notesTxN())))
				&& ((this.getE3fromAccountTxN() == castOther.getE3fromAccountTxN())
						|| (this.getE3fromAccountTxN() != null && castOther.getE3fromAccountTxN() != null
								&& this.getE3fromAccountTxN().equals(castOther.getE3fromAccountTxN())))
				&& (this.getE3storeId() == castOther.getE3storeId())
				&& ((this.getE3primaryTablesTx() == castOther.getE3primaryTablesTx())
						|| (this.getE3primaryTablesTx() != null && castOther.getE3primaryTablesTx() != null
								&& this.getE3primaryTablesTx().equals(castOther.getE3primaryTablesTx())))
				&& (this.getE3jobTypeId() == castOther.getE3jobTypeId())
				&& (this.getE3subJobTypeId() == castOther.getE3subJobTypeId())
				&& ((this.getE3listTxN() == castOther.getE3listTxN()) || (this.getE3listTxN() != null
						&& castOther.getE3listTxN() != null && this.getE3listTxN().equals(castOther.getE3listTxN())))
				&& (this.isE3moveToFolderBl() == castOther.isE3moveToFolderBl())
				&& ((this.getE3viewTxN() == castOther.getE3viewTxN()) || (this.getE3viewTxN() != null
						&& castOther.getE3viewTxN() != null && this.getE3viewTxN().equals(castOther.getE3viewTxN())))
				&& ((this.getE3columnsTxN() == castOther.getE3columnsTxN())
						|| (this.getE3columnsTxN() != null && castOther.getE3columnsTxN() != null
								&& this.getE3columnsTxN().equals(castOther.getE3columnsTxN())))
				&& ((this.getE3dateColumnTxN() == castOther.getE3dateColumnTxN())
						|| (this.getE3dateColumnTxN() != null && castOther.getE3dateColumnTxN() != null
								&& this.getE3dateColumnTxN().equals(castOther.getE3dateColumnTxN())))
				&& ((this.getE3datePeriodInN() == castOther.getE3datePeriodInN())
						|| (this.getE3datePeriodInN() != null && castOther.getE3datePeriodInN() != null
								&& this.getE3datePeriodInN().equals(castOther.getE3datePeriodInN())))
				&& ((this.getE3dateValueInN() == castOther.getE3dateValueInN())
						|| (this.getE3dateValueInN() != null && castOther.getE3dateValueInN() != null
								&& this.getE3dateValueInN().equals(castOther.getE3dateValueInN())))
				&& ((this.getE3groupIdN() == castOther.getE3groupIdN())
						|| (this.getE3groupIdN() != null && castOther.getE3groupIdN() != null
								&& this.getE3groupIdN().equals(castOther.getE3groupIdN())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getE3emailAgentId();
		result = 37 * result + (getE3eventTx() == null ? 0 : this.getE3eventTx().hashCode());
		result = 37 * result + (getE3eventParam1txN() == null ? 0 : this.getE3eventParam1txN().hashCode());
		result = 37 * result + (getE3eventParam2txN() == null ? 0 : this.getE3eventParam2txN().hashCode());
		result = 37 * result + (getE3sqltx() == null ? 0 : this.getE3sqltx().hashCode());
		result = 37 * result + (getE3outlookFolderTxN() == null ? 0 : this.getE3outlookFolderTxN().hashCode());
		result = 37 * result + (getE3subjectLineTx() == null ? 0 : this.getE3subjectLineTx().hashCode());
		result = 37 * result + this.getE3delayIn();
		result = 37 * result + this.getE3expiryDaysIn();
		result = 37 * result + (getE3lastRunDate() == null ? 0 : this.getE3lastRunDate().hashCode());
		result = 37 * result + (this.isE3confirmationRequiredBl() ? 1 : 0);
		result = 37 * result + (getE3lastRunStatusTxN() == null ? 0 : this.getE3lastRunStatusTxN().hashCode());
		result = 37 * result + (this.isE3runLaterIfAgentOffBl() ? 1 : 0);
		result = 37 * result + (this.isE3unavailableBl() ? 1 : 0);
		result = 37 * result + (getE3onMailingListsTxN() == null ? 0 : this.getE3onMailingListsTxN().hashCode());
		result = 37 * result + (getE3notOnMailingListsTxN() == null ? 0 : this.getE3notOnMailingListsTxN().hashCode());
		result = 37 * result + (getE3subQueryTxN() == null ? 0 : this.getE3subQueryTxN().hashCode());
		result = 37 * result + this.getE3priorityIn();
		result = 37 * result + (this.isE3sendToNewsletterEngineBl() ? 1 : 0);
		result = 37 * result
				+ (getE3newsletterTemplateTxN() == null ? 0 : this.getE3newsletterTemplateTxN().hashCode());
		result = 37 * result + (getE3notesTxN() == null ? 0 : this.getE3notesTxN().hashCode());
		result = 37 * result + (getE3fromAccountTxN() == null ? 0 : this.getE3fromAccountTxN().hashCode());
		result = 37 * result + this.getE3storeId();
		result = 37 * result + (getE3primaryTablesTx() == null ? 0 : this.getE3primaryTablesTx().hashCode());
		result = 37 * result + this.getE3jobTypeId();
		result = 37 * result + this.getE3subJobTypeId();
		result = 37 * result + (getE3listTxN() == null ? 0 : this.getE3listTxN().hashCode());
		result = 37 * result + (this.isE3moveToFolderBl() ? 1 : 0);
		result = 37 * result + (getE3viewTxN() == null ? 0 : this.getE3viewTxN().hashCode());
		result = 37 * result + (getE3columnsTxN() == null ? 0 : this.getE3columnsTxN().hashCode());
		result = 37 * result + (getE3dateColumnTxN() == null ? 0 : this.getE3dateColumnTxN().hashCode());
		result = 37 * result + (getE3datePeriodInN() == null ? 0 : this.getE3datePeriodInN().hashCode());
		result = 37 * result + (getE3dateValueInN() == null ? 0 : this.getE3dateValueInN().hashCode());
		result = 37 * result + (getE3groupIdN() == null ? 0 : this.getE3groupIdN().hashCode());
		return result;
	}

}
