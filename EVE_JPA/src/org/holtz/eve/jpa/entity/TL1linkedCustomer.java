package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TL1linkedCustomer generated by hbm2java
 */
@Entity
@Table(name = "T_L1LinkedCustomer")
public class TL1linkedCustomer implements java.io.Serializable {

	private TL1linkedCustomerId id;

	public TL1linkedCustomer() {
	}

	public TL1linkedCustomer(TL1linkedCustomerId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "l1parentId", column = @Column(name = "L1ParentID", nullable = false)),
			@AttributeOverride(name = "l1childId", column = @Column(name = "L1ChildID", nullable = false)) })
	public TL1linkedCustomerId getId() {
		return this.id;
	}

	public void setId(TL1linkedCustomerId id) {
		this.id = id;
	}

}
