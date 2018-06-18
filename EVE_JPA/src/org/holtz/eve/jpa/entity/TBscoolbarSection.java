package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TBscoolbarSection generated by hbm2java
 */
@Entity
@Table(name = "T_BSCoolbarSection")
public class TBscoolbarSection implements java.io.Serializable {

	private int bscoolbarSectionId;
	private String bscoolbarSectionTx;
	private boolean bsuseLookupBl;
	private int bsappendMethodId;
	private short bsappendDataTypeId;
	private short bsdataTypeId;
	private short bscoolbarId;
	private short bsorderIn;
	private boolean bsfirstLetterOnlyBl;

	public TBscoolbarSection() {
	}

	public TBscoolbarSection(int bscoolbarSectionId, String bscoolbarSectionTx, boolean bsuseLookupBl,
			int bsappendMethodId, short bsappendDataTypeId, short bsdataTypeId, short bscoolbarId, short bsorderIn,
			boolean bsfirstLetterOnlyBl) {
		this.bscoolbarSectionId = bscoolbarSectionId;
		this.bscoolbarSectionTx = bscoolbarSectionTx;
		this.bsuseLookupBl = bsuseLookupBl;
		this.bsappendMethodId = bsappendMethodId;
		this.bsappendDataTypeId = bsappendDataTypeId;
		this.bsdataTypeId = bsdataTypeId;
		this.bscoolbarId = bscoolbarId;
		this.bsorderIn = bsorderIn;
		this.bsfirstLetterOnlyBl = bsfirstLetterOnlyBl;
	}

	@Id

	@Column(name = "BSCoolbarSectionID", unique = true, nullable = false)
	public int getBscoolbarSectionId() {
		return this.bscoolbarSectionId;
	}

	public void setBscoolbarSectionId(int bscoolbarSectionId) {
		this.bscoolbarSectionId = bscoolbarSectionId;
	}

	@Column(name = "BSCoolbarSectionTx", nullable = false)
	public String getBscoolbarSectionTx() {
		return this.bscoolbarSectionTx;
	}

	public void setBscoolbarSectionTx(String bscoolbarSectionTx) {
		this.bscoolbarSectionTx = bscoolbarSectionTx;
	}

	@Column(name = "BSUseLookupBl", nullable = false)
	public boolean isBsuseLookupBl() {
		return this.bsuseLookupBl;
	}

	public void setBsuseLookupBl(boolean bsuseLookupBl) {
		this.bsuseLookupBl = bsuseLookupBl;
	}

	@Column(name = "BSAppendMethodID", nullable = false)
	public int getBsappendMethodId() {
		return this.bsappendMethodId;
	}

	public void setBsappendMethodId(int bsappendMethodId) {
		this.bsappendMethodId = bsappendMethodId;
	}

	@Column(name = "BSAppendDataTypeID", nullable = false)
	public short getBsappendDataTypeId() {
		return this.bsappendDataTypeId;
	}

	public void setBsappendDataTypeId(short bsappendDataTypeId) {
		this.bsappendDataTypeId = bsappendDataTypeId;
	}

	@Column(name = "BSDataTypeID", nullable = false)
	public short getBsdataTypeId() {
		return this.bsdataTypeId;
	}

	public void setBsdataTypeId(short bsdataTypeId) {
		this.bsdataTypeId = bsdataTypeId;
	}

	@Column(name = "BSCoolbarID", nullable = false)
	public short getBscoolbarId() {
		return this.bscoolbarId;
	}

	public void setBscoolbarId(short bscoolbarId) {
		this.bscoolbarId = bscoolbarId;
	}

	@Column(name = "BSOrderIn", nullable = false)
	public short getBsorderIn() {
		return this.bsorderIn;
	}

	public void setBsorderIn(short bsorderIn) {
		this.bsorderIn = bsorderIn;
	}

	@Column(name = "BSFirstLetterOnlyBl", nullable = false)
	public boolean isBsfirstLetterOnlyBl() {
		return this.bsfirstLetterOnlyBl;
	}

	public void setBsfirstLetterOnlyBl(boolean bsfirstLetterOnlyBl) {
		this.bsfirstLetterOnlyBl = bsfirstLetterOnlyBl;
	}

}
