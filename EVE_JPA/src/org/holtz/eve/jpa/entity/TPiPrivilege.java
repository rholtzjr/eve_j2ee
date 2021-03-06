package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TPiPrivilege generated by hbm2java
 */
@Entity
@Table(name = "T_PiPrivilege")
public class TPiPrivilege implements java.io.Serializable {

	private int piPrivilegeId;
	private String piPrivilegeTx;
	private short piModuleId;
	private boolean piUnavailableBl;
	private short piDisplayOrderIn;
	private Short piEve43moduleIdN;
	private Integer piEve43privIdN;
	private Boolean piIsWebPrivilege;
	private boolean piVisibleBl;
	private Set<TPjPrivilegeModules> TPjPrivilegeModuleses = new HashSet<TPjPrivilegeModules>(0);

	public TPiPrivilege() {
	}

	public TPiPrivilege(int piPrivilegeId, String piPrivilegeTx, short piModuleId, boolean piUnavailableBl,
			short piDisplayOrderIn, boolean piVisibleBl) {
		this.piPrivilegeId = piPrivilegeId;
		this.piPrivilegeTx = piPrivilegeTx;
		this.piModuleId = piModuleId;
		this.piUnavailableBl = piUnavailableBl;
		this.piDisplayOrderIn = piDisplayOrderIn;
		this.piVisibleBl = piVisibleBl;
	}

	public TPiPrivilege(int piPrivilegeId, String piPrivilegeTx, short piModuleId, boolean piUnavailableBl,
			short piDisplayOrderIn, Short piEve43moduleIdN, Integer piEve43privIdN, Boolean piIsWebPrivilege,
			boolean piVisibleBl, Set<TPjPrivilegeModules> TPjPrivilegeModuleses) {
		this.piPrivilegeId = piPrivilegeId;
		this.piPrivilegeTx = piPrivilegeTx;
		this.piModuleId = piModuleId;
		this.piUnavailableBl = piUnavailableBl;
		this.piDisplayOrderIn = piDisplayOrderIn;
		this.piEve43moduleIdN = piEve43moduleIdN;
		this.piEve43privIdN = piEve43privIdN;
		this.piIsWebPrivilege = piIsWebPrivilege;
		this.piVisibleBl = piVisibleBl;
		this.TPjPrivilegeModuleses = TPjPrivilegeModuleses;
	}

	@Id

	@Column(name = "PiPrivilegeID", unique = true, nullable = false)
	public int getPiPrivilegeId() {
		return this.piPrivilegeId;
	}

	public void setPiPrivilegeId(int piPrivilegeId) {
		this.piPrivilegeId = piPrivilegeId;
	}

	@Column(name = "PiPrivilegeTx", nullable = false)
	public String getPiPrivilegeTx() {
		return this.piPrivilegeTx;
	}

	public void setPiPrivilegeTx(String piPrivilegeTx) {
		this.piPrivilegeTx = piPrivilegeTx;
	}

	@Column(name = "PiModuleID", nullable = false)
	public short getPiModuleId() {
		return this.piModuleId;
	}

	public void setPiModuleId(short piModuleId) {
		this.piModuleId = piModuleId;
	}

	@Column(name = "PiUnavailableBl", nullable = false)
	public boolean isPiUnavailableBl() {
		return this.piUnavailableBl;
	}

	public void setPiUnavailableBl(boolean piUnavailableBl) {
		this.piUnavailableBl = piUnavailableBl;
	}

	@Column(name = "PiDisplayOrderIn", nullable = false)
	public short getPiDisplayOrderIn() {
		return this.piDisplayOrderIn;
	}

	public void setPiDisplayOrderIn(short piDisplayOrderIn) {
		this.piDisplayOrderIn = piDisplayOrderIn;
	}

	@Column(name = "PiEVE43ModuleID_N")
	public Short getPiEve43moduleIdN() {
		return this.piEve43moduleIdN;
	}

	public void setPiEve43moduleIdN(Short piEve43moduleIdN) {
		this.piEve43moduleIdN = piEve43moduleIdN;
	}

	@Column(name = "PiEVE43PrivID_N")
	public Integer getPiEve43privIdN() {
		return this.piEve43privIdN;
	}

	public void setPiEve43privIdN(Integer piEve43privIdN) {
		this.piEve43privIdN = piEve43privIdN;
	}

	@Column(name = "PiIsWebPrivilege")
	public Boolean getPiIsWebPrivilege() {
		return this.piIsWebPrivilege;
	}

	public void setPiIsWebPrivilege(Boolean piIsWebPrivilege) {
		this.piIsWebPrivilege = piIsWebPrivilege;
	}

	@Column(name = "PiVisibleBl", nullable = false)
	public boolean isPiVisibleBl() {
		return this.piVisibleBl;
	}

	public void setPiVisibleBl(boolean piVisibleBl) {
		this.piVisibleBl = piVisibleBl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TPiPrivilege")
	public Set<TPjPrivilegeModules> getTPjPrivilegeModuleses() {
		return this.TPjPrivilegeModuleses;
	}

	public void setTPjPrivilegeModuleses(Set<TPjPrivilegeModules> TPjPrivilegeModuleses) {
		this.TPjPrivilegeModuleses = TPjPrivilegeModuleses;
	}

}
