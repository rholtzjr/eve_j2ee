package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * S01AcAccount generated by hbm2java
 */
@Entity
@Table(name = "s01_AcAccount")
public class S01AcAccount implements java.io.Serializable {

	private S01AcAccountId id;

	public S01AcAccount() {
	}

	public S01AcAccount(S01AcAccountId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "acAccountId", column = @Column(name = "AcAccountID", nullable = false)),
			@AttributeOverride(name = "acAccountTypeId", column = @Column(name = "AcAccountTypeID", nullable = false)),
			@AttributeOverride(name = "acCustId", column = @Column(name = "AcCustID", nullable = false)),
			@AttributeOverride(name = "acAccountNameTx", column = @Column(name = "AcAccountNameTx", nullable = false)),
			@AttributeOverride(name = "acCreationDate", column = @Column(name = "AcCreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "acCreditLimitMn", column = @Column(name = "AcCreditLimitMn", nullable = false, scale = 4)),
			@AttributeOverride(name = "acCostCenterId", column = @Column(name = "AcCostCenterID", nullable = false)),
			@AttributeOverride(name = "acClosedDateN", column = @Column(name = "AcClosedDate_N", length = 23)),
			@AttributeOverride(name = "acLastUpdatedDate", column = @Column(name = "AcLastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "acCurrencyId", column = @Column(name = "AcCurrencyID", nullable = false)),
			@AttributeOverride(name = "acExchangeRateFl", column = @Column(name = "AcExchangeRateFl", nullable = false, precision = 24, scale = 0)),
			@AttributeOverride(name = "acBalanceMn", column = @Column(name = "AcBalanceMn", nullable = false, scale = 4)),
			@AttributeOverride(name = "acStoreId", column = @Column(name = "AcStoreID", nullable = false)) })
	public S01AcAccountId getId() {
		return this.id;
	}

	public void setId(S01AcAccountId id) {
		this.id = id;
	}

}
