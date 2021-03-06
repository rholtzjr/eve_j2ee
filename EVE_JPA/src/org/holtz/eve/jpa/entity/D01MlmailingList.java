package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * D01MlmailingList generated by hbm2java
 */
@Entity
@Table(name = "d01_MLMailingList")
public class D01MlmailingList implements java.io.Serializable {

	private D01MlmailingListId id;

	public D01MlmailingList() {
	}

	public D01MlmailingList(D01MlmailingListId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "mlmailingListId", column = @Column(name = "MLMailingListID", nullable = false)),
			@AttributeOverride(name = "mlmailingListTx", column = @Column(name = "MLMailingListTx", nullable = false)),
			@AttributeOverride(name = "mlunavailableBl", column = @Column(name = "MLUnavailableBl", nullable = false)),
			@AttributeOverride(name = "mllastUpdatedDate", column = @Column(name = "MLLastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "mlrequiredBl", column = @Column(name = "MLRequiredBl", nullable = false)),
			@AttributeOverride(name = "mlcreationDate", column = @Column(name = "MLCreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "mlshowInEolbl", column = @Column(name = "MLShowInEOLBl", nullable = false)) })
	public D01MlmailingListId getId() {
		return this.id;
	}

	public void setId(D01MlmailingListId id) {
		this.id = id;
	}

}
