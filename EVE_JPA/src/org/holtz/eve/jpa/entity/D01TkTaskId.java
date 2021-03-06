package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01TkTaskId generated by hbm2java
 */
@Embeddable
public class D01TkTaskId implements java.io.Serializable {

	private int tkTaskId;
	private Integer tkEmpIdN;
	private Date tkDueStartDate;
	private Date tkDueEndDate;
	private Date tkReminderDate;
	private String tkNotesTxN;
	private int tkTaskTypeId;
	private int tkTaskStatusId;
	private Date tkCreationDate;
	private Date tkLastUpdatedDate;
	private short tkStoreId;
	private Date tkActualStartDateN;
	private Date tkActualEndDateN;
	private boolean tkSmsreminderBl;
	private Date tkSmssentDate;
	private Integer tkFromEmpIdN;
	private Integer tkCommissionClosingIdN;
	private int tkAssignedByEmpId;

	public D01TkTaskId() {
	}

	public D01TkTaskId(int tkTaskId, Date tkDueStartDate, Date tkDueEndDate, Date tkReminderDate, int tkTaskTypeId,
			int tkTaskStatusId, Date tkCreationDate, Date tkLastUpdatedDate, short tkStoreId, boolean tkSmsreminderBl,
			int tkAssignedByEmpId) {
		this.tkTaskId = tkTaskId;
		this.tkDueStartDate = tkDueStartDate;
		this.tkDueEndDate = tkDueEndDate;
		this.tkReminderDate = tkReminderDate;
		this.tkTaskTypeId = tkTaskTypeId;
		this.tkTaskStatusId = tkTaskStatusId;
		this.tkCreationDate = tkCreationDate;
		this.tkLastUpdatedDate = tkLastUpdatedDate;
		this.tkStoreId = tkStoreId;
		this.tkSmsreminderBl = tkSmsreminderBl;
		this.tkAssignedByEmpId = tkAssignedByEmpId;
	}

	public D01TkTaskId(int tkTaskId, Integer tkEmpIdN, Date tkDueStartDate, Date tkDueEndDate, Date tkReminderDate,
			String tkNotesTxN, int tkTaskTypeId, int tkTaskStatusId, Date tkCreationDate, Date tkLastUpdatedDate,
			short tkStoreId, Date tkActualStartDateN, Date tkActualEndDateN, boolean tkSmsreminderBl,
			Date tkSmssentDate, Integer tkFromEmpIdN, Integer tkCommissionClosingIdN, int tkAssignedByEmpId) {
		this.tkTaskId = tkTaskId;
		this.tkEmpIdN = tkEmpIdN;
		this.tkDueStartDate = tkDueStartDate;
		this.tkDueEndDate = tkDueEndDate;
		this.tkReminderDate = tkReminderDate;
		this.tkNotesTxN = tkNotesTxN;
		this.tkTaskTypeId = tkTaskTypeId;
		this.tkTaskStatusId = tkTaskStatusId;
		this.tkCreationDate = tkCreationDate;
		this.tkLastUpdatedDate = tkLastUpdatedDate;
		this.tkStoreId = tkStoreId;
		this.tkActualStartDateN = tkActualStartDateN;
		this.tkActualEndDateN = tkActualEndDateN;
		this.tkSmsreminderBl = tkSmsreminderBl;
		this.tkSmssentDate = tkSmssentDate;
		this.tkFromEmpIdN = tkFromEmpIdN;
		this.tkCommissionClosingIdN = tkCommissionClosingIdN;
		this.tkAssignedByEmpId = tkAssignedByEmpId;
	}

	@Column(name = "TkTaskID", nullable = false)
	public int getTkTaskId() {
		return this.tkTaskId;
	}

	public void setTkTaskId(int tkTaskId) {
		this.tkTaskId = tkTaskId;
	}

	@Column(name = "TkEmpID_N")
	public Integer getTkEmpIdN() {
		return this.tkEmpIdN;
	}

	public void setTkEmpIdN(Integer tkEmpIdN) {
		this.tkEmpIdN = tkEmpIdN;
	}

	@Column(name = "TkDueStartDate", nullable = false, length = 23)
	public Date getTkDueStartDate() {
		return this.tkDueStartDate;
	}

	public void setTkDueStartDate(Date tkDueStartDate) {
		this.tkDueStartDate = tkDueStartDate;
	}

	@Column(name = "TkDueEndDate", nullable = false, length = 23)
	public Date getTkDueEndDate() {
		return this.tkDueEndDate;
	}

	public void setTkDueEndDate(Date tkDueEndDate) {
		this.tkDueEndDate = tkDueEndDate;
	}

	@Column(name = "TkReminderDate", nullable = false, length = 23)
	public Date getTkReminderDate() {
		return this.tkReminderDate;
	}

	public void setTkReminderDate(Date tkReminderDate) {
		this.tkReminderDate = tkReminderDate;
	}

	@Column(name = "TkNotesTx_N")
	public String getTkNotesTxN() {
		return this.tkNotesTxN;
	}

	public void setTkNotesTxN(String tkNotesTxN) {
		this.tkNotesTxN = tkNotesTxN;
	}

	@Column(name = "TkTaskTypeID", nullable = false)
	public int getTkTaskTypeId() {
		return this.tkTaskTypeId;
	}

	public void setTkTaskTypeId(int tkTaskTypeId) {
		this.tkTaskTypeId = tkTaskTypeId;
	}

	@Column(name = "TkTaskStatusID", nullable = false)
	public int getTkTaskStatusId() {
		return this.tkTaskStatusId;
	}

	public void setTkTaskStatusId(int tkTaskStatusId) {
		this.tkTaskStatusId = tkTaskStatusId;
	}

	@Column(name = "TkCreationDate", nullable = false, length = 23)
	public Date getTkCreationDate() {
		return this.tkCreationDate;
	}

	public void setTkCreationDate(Date tkCreationDate) {
		this.tkCreationDate = tkCreationDate;
	}

	@Column(name = "TkLastUpdatedDate", nullable = false, length = 23)
	public Date getTkLastUpdatedDate() {
		return this.tkLastUpdatedDate;
	}

	public void setTkLastUpdatedDate(Date tkLastUpdatedDate) {
		this.tkLastUpdatedDate = tkLastUpdatedDate;
	}

	@Column(name = "TkStoreID", nullable = false)
	public short getTkStoreId() {
		return this.tkStoreId;
	}

	public void setTkStoreId(short tkStoreId) {
		this.tkStoreId = tkStoreId;
	}

	@Column(name = "TkActualStartDate_N", length = 23)
	public Date getTkActualStartDateN() {
		return this.tkActualStartDateN;
	}

	public void setTkActualStartDateN(Date tkActualStartDateN) {
		this.tkActualStartDateN = tkActualStartDateN;
	}

	@Column(name = "TkActualEndDate_N", length = 23)
	public Date getTkActualEndDateN() {
		return this.tkActualEndDateN;
	}

	public void setTkActualEndDateN(Date tkActualEndDateN) {
		this.tkActualEndDateN = tkActualEndDateN;
	}

	@Column(name = "TkSMSReminderBl", nullable = false)
	public boolean isTkSmsreminderBl() {
		return this.tkSmsreminderBl;
	}

	public void setTkSmsreminderBl(boolean tkSmsreminderBl) {
		this.tkSmsreminderBl = tkSmsreminderBl;
	}

	@Column(name = "TkSMSSentDate", length = 23)
	public Date getTkSmssentDate() {
		return this.tkSmssentDate;
	}

	public void setTkSmssentDate(Date tkSmssentDate) {
		this.tkSmssentDate = tkSmssentDate;
	}

	@Column(name = "TkFromEmpId_N")
	public Integer getTkFromEmpIdN() {
		return this.tkFromEmpIdN;
	}

	public void setTkFromEmpIdN(Integer tkFromEmpIdN) {
		this.tkFromEmpIdN = tkFromEmpIdN;
	}

	@Column(name = "TkCommissionClosingID_N")
	public Integer getTkCommissionClosingIdN() {
		return this.tkCommissionClosingIdN;
	}

	public void setTkCommissionClosingIdN(Integer tkCommissionClosingIdN) {
		this.tkCommissionClosingIdN = tkCommissionClosingIdN;
	}

	@Column(name = "TkAssignedByEmpID", nullable = false)
	public int getTkAssignedByEmpId() {
		return this.tkAssignedByEmpId;
	}

	public void setTkAssignedByEmpId(int tkAssignedByEmpId) {
		this.tkAssignedByEmpId = tkAssignedByEmpId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01TkTaskId))
			return false;
		D01TkTaskId castOther = (D01TkTaskId) other;

		return (this.getTkTaskId() == castOther.getTkTaskId())
				&& ((this.getTkEmpIdN() == castOther.getTkEmpIdN()) || (this.getTkEmpIdN() != null
						&& castOther.getTkEmpIdN() != null && this.getTkEmpIdN().equals(castOther.getTkEmpIdN())))
				&& ((this.getTkDueStartDate() == castOther.getTkDueStartDate())
						|| (this.getTkDueStartDate() != null && castOther.getTkDueStartDate() != null
								&& this.getTkDueStartDate().equals(castOther.getTkDueStartDate())))
				&& ((this.getTkDueEndDate() == castOther.getTkDueEndDate())
						|| (this.getTkDueEndDate() != null && castOther.getTkDueEndDate() != null
								&& this.getTkDueEndDate().equals(castOther.getTkDueEndDate())))
				&& ((this.getTkReminderDate() == castOther.getTkReminderDate())
						|| (this.getTkReminderDate() != null && castOther.getTkReminderDate() != null
								&& this.getTkReminderDate().equals(castOther.getTkReminderDate())))
				&& ((this.getTkNotesTxN() == castOther.getTkNotesTxN()) || (this.getTkNotesTxN() != null
						&& castOther.getTkNotesTxN() != null && this.getTkNotesTxN().equals(castOther.getTkNotesTxN())))
				&& (this.getTkTaskTypeId() == castOther.getTkTaskTypeId())
				&& (this.getTkTaskStatusId() == castOther.getTkTaskStatusId())
				&& ((this.getTkCreationDate() == castOther.getTkCreationDate())
						|| (this.getTkCreationDate() != null && castOther.getTkCreationDate() != null
								&& this.getTkCreationDate().equals(castOther.getTkCreationDate())))
				&& ((this.getTkLastUpdatedDate() == castOther.getTkLastUpdatedDate())
						|| (this.getTkLastUpdatedDate() != null && castOther.getTkLastUpdatedDate() != null
								&& this.getTkLastUpdatedDate().equals(castOther.getTkLastUpdatedDate())))
				&& (this.getTkStoreId() == castOther.getTkStoreId())
				&& ((this.getTkActualStartDateN() == castOther.getTkActualStartDateN())
						|| (this.getTkActualStartDateN() != null && castOther.getTkActualStartDateN() != null
								&& this.getTkActualStartDateN().equals(castOther.getTkActualStartDateN())))
				&& ((this.getTkActualEndDateN() == castOther.getTkActualEndDateN())
						|| (this.getTkActualEndDateN() != null && castOther.getTkActualEndDateN() != null
								&& this.getTkActualEndDateN().equals(castOther.getTkActualEndDateN())))
				&& (this.isTkSmsreminderBl() == castOther.isTkSmsreminderBl())
				&& ((this.getTkSmssentDate() == castOther.getTkSmssentDate())
						|| (this.getTkSmssentDate() != null && castOther.getTkSmssentDate() != null
								&& this.getTkSmssentDate().equals(castOther.getTkSmssentDate())))
				&& ((this.getTkFromEmpIdN() == castOther.getTkFromEmpIdN())
						|| (this.getTkFromEmpIdN() != null && castOther.getTkFromEmpIdN() != null
								&& this.getTkFromEmpIdN().equals(castOther.getTkFromEmpIdN())))
				&& ((this.getTkCommissionClosingIdN() == castOther.getTkCommissionClosingIdN())
						|| (this.getTkCommissionClosingIdN() != null && castOther.getTkCommissionClosingIdN() != null
								&& this.getTkCommissionClosingIdN().equals(castOther.getTkCommissionClosingIdN())))
				&& (this.getTkAssignedByEmpId() == castOther.getTkAssignedByEmpId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTkTaskId();
		result = 37 * result + (getTkEmpIdN() == null ? 0 : this.getTkEmpIdN().hashCode());
		result = 37 * result + (getTkDueStartDate() == null ? 0 : this.getTkDueStartDate().hashCode());
		result = 37 * result + (getTkDueEndDate() == null ? 0 : this.getTkDueEndDate().hashCode());
		result = 37 * result + (getTkReminderDate() == null ? 0 : this.getTkReminderDate().hashCode());
		result = 37 * result + (getTkNotesTxN() == null ? 0 : this.getTkNotesTxN().hashCode());
		result = 37 * result + this.getTkTaskTypeId();
		result = 37 * result + this.getTkTaskStatusId();
		result = 37 * result + (getTkCreationDate() == null ? 0 : this.getTkCreationDate().hashCode());
		result = 37 * result + (getTkLastUpdatedDate() == null ? 0 : this.getTkLastUpdatedDate().hashCode());
		result = 37 * result + this.getTkStoreId();
		result = 37 * result + (getTkActualStartDateN() == null ? 0 : this.getTkActualStartDateN().hashCode());
		result = 37 * result + (getTkActualEndDateN() == null ? 0 : this.getTkActualEndDateN().hashCode());
		result = 37 * result + (this.isTkSmsreminderBl() ? 1 : 0);
		result = 37 * result + (getTkSmssentDate() == null ? 0 : this.getTkSmssentDate().hashCode());
		result = 37 * result + (getTkFromEmpIdN() == null ? 0 : this.getTkFromEmpIdN().hashCode());
		result = 37 * result + (getTkCommissionClosingIdN() == null ? 0 : this.getTkCommissionClosingIdN().hashCode());
		result = 37 * result + this.getTkAssignedByEmpId();
		return result;
	}

}
