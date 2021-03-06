package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TAmAlarmId generated by hbm2java
 */
@Embeddable
public class TAmAlarmId implements java.io.Serializable {

	private short amDataTypeId;
	private int amDataId;
	private short amPcid;

	public TAmAlarmId() {
	}

	public TAmAlarmId(short amDataTypeId, int amDataId, short amPcid) {
		this.amDataTypeId = amDataTypeId;
		this.amDataId = amDataId;
		this.amPcid = amPcid;
	}

	@Column(name = "AmDataTypeID", nullable = false)
	public short getAmDataTypeId() {
		return this.amDataTypeId;
	}

	public void setAmDataTypeId(short amDataTypeId) {
		this.amDataTypeId = amDataTypeId;
	}

	@Column(name = "AmDataID", nullable = false)
	public int getAmDataId() {
		return this.amDataId;
	}

	public void setAmDataId(int amDataId) {
		this.amDataId = amDataId;
	}

	@Column(name = "AmPCID", nullable = false)
	public short getAmPcid() {
		return this.amPcid;
	}

	public void setAmPcid(short amPcid) {
		this.amPcid = amPcid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TAmAlarmId))
			return false;
		TAmAlarmId castOther = (TAmAlarmId) other;

		return (this.getAmDataTypeId() == castOther.getAmDataTypeId())
				&& (this.getAmDataId() == castOther.getAmDataId()) && (this.getAmPcid() == castOther.getAmPcid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAmDataTypeId();
		result = 37 * result + this.getAmDataId();
		result = 37 * result + this.getAmPcid();
		return result;
	}

}
