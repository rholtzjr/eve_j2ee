package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TEpempPrivilege generated by hbm2java
 */
@Entity
@Table(name = "T_EPEmpPrivilege")
public class TEpempPrivilege implements java.io.Serializable {

	private TEpempPrivilegeId id;
	private TEmEmp TEmEmp;

	public TEpempPrivilege() {
	}

	public TEpempPrivilege(TEpempPrivilegeId id, TEmEmp TEmEmp) {
		this.id = id;
		this.TEmEmp = TEmEmp;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "epempId", column = @Column(name = "EPEmpID", nullable = false)),
			@AttributeOverride(name = "epprivilegeId", column = @Column(name = "EPPrivilegeID", nullable = false)) })
	public TEpempPrivilegeId getId() {
		return this.id;
	}

	public void setId(TEpempPrivilegeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EPEmpID", nullable = false, insertable = false, updatable = false)
	public TEmEmp getTEmEmp() {
		return this.TEmEmp;
	}

	public void setTEmEmp(TEmEmp TEmEmp) {
		this.TEmEmp = TEmEmp;
	}

}
