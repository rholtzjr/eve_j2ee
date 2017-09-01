package org.holtz.eve.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the aq_CustModuleView database table.
 * 
 */
@Entity
@Table(name="aq_CustModuleView")
@NamedQuery(name="AqCustModuleView.findAll", query="SELECT a FROM AqCustModuleView a")
public class AqCustModuleView implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CsCourseID")
	private Integer csCourseID;
	
	@Column(name="CuCustId")
	private Integer cuCustId;

	@Column(name="CzAttendedBl")
	private Boolean czAttendedBl;

	@Column(name="CzNotesTx_N")
	private String czNotesTx_N;

	@Column(name="CzScoreTx_N")
	private String czScoreTx_N;

	@Column(name="LcLocationId")
	private Integer lcLocationId;

	@Column(name="LcLocationNameTx")
	private String lcLocationNameTx;

	@Column(name="MoEndDate_N")
	private Timestamp moEndDate_N;
	@Id
	@Column(name="MoModuleID")
	private Integer moModuleID;

	@Column(name="MoModuleTypeID")
	private Integer moModuleTypeID;

	@Column(name="MoStartDate_N")
	private Timestamp moStartDate_N;

	@Column(name="MtModuleNameTx")
	private String mtModuleNameTx;

	public AqCustModuleView() {
	}

	public Integer getCsCourseID() {
		return this.csCourseID;
	}

	public void setCsCourseID(Integer csCourseID) {
		this.csCourseID = csCourseID;
	}

	public Integer getCuCustId() {
		return this.cuCustId;
	}

	public void setCuCustId(Integer cuCustId) {
		this.cuCustId = cuCustId;
	}

	public Boolean getCzAttendedBl() {
		return this.czAttendedBl;
	}

	public void setCzAttendedBl(Boolean czAttendedBl) {
		this.czAttendedBl = czAttendedBl;
	}

	public String getCzNotesTx_N() {
		return this.czNotesTx_N;
	}

	public void setCzNotesTx_N(String czNotesTx_N) {
		this.czNotesTx_N = czNotesTx_N;
	}

	public String getCzScoreTx_N() {
		return this.czScoreTx_N;
	}

	public void setCzScoreTx_N(String czScoreTx_N) {
		this.czScoreTx_N = czScoreTx_N;
	}

	public Integer getLcLocationId() {
		return this.lcLocationId;
	}

	public void setLcLocationId(Integer lcLocationId) {
		this.lcLocationId = lcLocationId;
	}

	public String getLcLocationNameTx() {
		return this.lcLocationNameTx;
	}

	public void setLcLocationNameTx(String lcLocationNameTx) {
		this.lcLocationNameTx = lcLocationNameTx;
	}

	public Timestamp getMoEndDate_N() {
		return this.moEndDate_N;
	}

	public void setMoEndDate_N(Timestamp moEndDate_N) {
		this.moEndDate_N = moEndDate_N;
	}

	public Integer getMoModuleID() {
		return this.moModuleID;
	}

	public void setMoModuleID(Integer moModuleID) {
		this.moModuleID = moModuleID;
	}

	public Integer getMoModuleTypeID() {
		return this.moModuleTypeID;
	}

	public void setMoModuleTypeID(Integer moModuleTypeID) {
		this.moModuleTypeID = moModuleTypeID;
	}

	public Timestamp getMoStartDate_N() {
		return this.moStartDate_N;
	}

	public void setMoStartDate_N(Timestamp moStartDate_N) {
		this.moStartDate_N = moStartDate_N;
	}

	public String getMtModuleNameTx() {
		return this.mtModuleNameTx;
	}

	public void setMtModuleNameTx(String mtModuleNameTx) {
		this.mtModuleNameTx = mtModuleNameTx;
	}

}