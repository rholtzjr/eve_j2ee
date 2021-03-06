package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CmrcPostageCharges generated by hbm2java
 */
@Entity
@Table(name = "CMRC_PostageCharges")
public class CmrcPostageCharges implements java.io.Serializable {

	private CmrcPostageChargesId id;

	public CmrcPostageCharges() {
	}

	public CmrcPostageCharges(CmrcPostageChargesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "lowerEnd", column = @Column(name = "LowerEnd")),
			@AttributeOverride(name = "upperEnd", column = @Column(name = "UpperEnd")),
			@AttributeOverride(name = "charge", column = @Column(name = "Charge")) })
	public CmrcPostageChargesId getId() {
		return this.id;
	}

	public void setId(CmrcPostageChargesId id) {
		this.id = id;
	}

}
