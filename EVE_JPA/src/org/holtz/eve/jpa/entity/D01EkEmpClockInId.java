package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01EkEmpClockInId generated by hbm2java
 */
@Embeddable
public class D01EkEmpClockInId implements java.io.Serializable {

	private int ekEmpClockInId;
	private int ekEmpId;
	private Date ekClockInDate;
	private Date ekClockOutDateN;
	private short ekPcid;
	private String ekCommentsTxN;
	private short ekStoreId;
	private Integer ekTaskTypeIdN;

	public D01EkEmpClockInId() {
	}

	public D01EkEmpClockInId(int ekEmpClockInId, int ekEmpId, Date ekClockInDate, short ekPcid, short ekStoreId) {
		this.ekEmpClockInId = ekEmpClockInId;
		this.ekEmpId = ekEmpId;
		this.ekClockInDate = ekClockInDate;
		this.ekPcid = ekPcid;
		this.ekStoreId = ekStoreId;
	}

	public D01EkEmpClockInId(int ekEmpClockInId, int ekEmpId, Date ekClockInDate, Date ekClockOutDateN, short ekPcid,
			String ekCommentsTxN, short ekStoreId, Integer ekTaskTypeIdN) {
		this.ekEmpClockInId = ekEmpClockInId;
		this.ekEmpId = ekEmpId;
		this.ekClockInDate = ekClockInDate;
		this.ekClockOutDateN = ekClockOutDateN;
		this.ekPcid = ekPcid;
		this.ekCommentsTxN = ekCommentsTxN;
		this.ekStoreId = ekStoreId;
		this.ekTaskTypeIdN = ekTaskTypeIdN;
	}

	@Column(name = "EkEmpClockInID", nullable = false)
	public int getEkEmpClockInId() {
		return this.ekEmpClockInId;
	}

	public void setEkEmpClockInId(int ekEmpClockInId) {
		this.ekEmpClockInId = ekEmpClockInId;
	}

	@Column(name = "EkEmpID", nullable = false)
	public int getEkEmpId() {
		return this.ekEmpId;
	}

	public void setEkEmpId(int ekEmpId) {
		this.ekEmpId = ekEmpId;
	}

	@Column(name = "EkClockInDate", nullable = false, length = 23)
	public Date getEkClockInDate() {
		return this.ekClockInDate;
	}

	public void setEkClockInDate(Date ekClockInDate) {
		this.ekClockInDate = ekClockInDate;
	}

	@Column(name = "EkClockOutDate_N", length = 23)
	public Date getEkClockOutDateN() {
		return this.ekClockOutDateN;
	}

	public void setEkClockOutDateN(Date ekClockOutDateN) {
		this.ekClockOutDateN = ekClockOutDateN;
	}

	@Column(name = "EkPCID", nullable = false)
	public short getEkPcid() {
		return this.ekPcid;
	}

	public void setEkPcid(short ekPcid) {
		this.ekPcid = ekPcid;
	}

	@Column(name = "EkCommentsTx_N")
	public String getEkCommentsTxN() {
		return this.ekCommentsTxN;
	}

	public void setEkCommentsTxN(String ekCommentsTxN) {
		this.ekCommentsTxN = ekCommentsTxN;
	}

	@Column(name = "EkStoreID", nullable = false)
	public short getEkStoreId() {
		return this.ekStoreId;
	}

	public void setEkStoreId(short ekStoreId) {
		this.ekStoreId = ekStoreId;
	}

	@Column(name = "EkTaskTypeID_N")
	public Integer getEkTaskTypeIdN() {
		return this.ekTaskTypeIdN;
	}

	public void setEkTaskTypeIdN(Integer ekTaskTypeIdN) {
		this.ekTaskTypeIdN = ekTaskTypeIdN;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01EkEmpClockInId))
			return false;
		D01EkEmpClockInId castOther = (D01EkEmpClockInId) other;

		return (this.getEkEmpClockInId() == castOther.getEkEmpClockInId())
				&& (this.getEkEmpId() == castOther.getEkEmpId())
				&& ((this.getEkClockInDate() == castOther.getEkClockInDate())
						|| (this.getEkClockInDate() != null && castOther.getEkClockInDate() != null
								&& this.getEkClockInDate().equals(castOther.getEkClockInDate())))
				&& ((this.getEkClockOutDateN() == castOther.getEkClockOutDateN())
						|| (this.getEkClockOutDateN() != null && castOther.getEkClockOutDateN() != null
								&& this.getEkClockOutDateN().equals(castOther.getEkClockOutDateN())))
				&& (this.getEkPcid() == castOther.getEkPcid())
				&& ((this.getEkCommentsTxN() == castOther.getEkCommentsTxN())
						|| (this.getEkCommentsTxN() != null && castOther.getEkCommentsTxN() != null
								&& this.getEkCommentsTxN().equals(castOther.getEkCommentsTxN())))
				&& (this.getEkStoreId() == castOther.getEkStoreId())
				&& ((this.getEkTaskTypeIdN() == castOther.getEkTaskTypeIdN())
						|| (this.getEkTaskTypeIdN() != null && castOther.getEkTaskTypeIdN() != null
								&& this.getEkTaskTypeIdN().equals(castOther.getEkTaskTypeIdN())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEkEmpClockInId();
		result = 37 * result + this.getEkEmpId();
		result = 37 * result + (getEkClockInDate() == null ? 0 : this.getEkClockInDate().hashCode());
		result = 37 * result + (getEkClockOutDateN() == null ? 0 : this.getEkClockOutDateN().hashCode());
		result = 37 * result + this.getEkPcid();
		result = 37 * result + (getEkCommentsTxN() == null ? 0 : this.getEkCommentsTxN().hashCode());
		result = 37 * result + this.getEkStoreId();
		result = 37 * result + (getEkTaskTypeIdN() == null ? 0 : this.getEkTaskTypeIdN().hashCode());
		return result;
	}

}
