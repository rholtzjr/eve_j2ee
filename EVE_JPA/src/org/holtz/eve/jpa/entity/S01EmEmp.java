package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * S01EmEmp generated by hbm2java
 */
@Entity
@Table(name = "s01_EmEmp")
public class S01EmEmp implements java.io.Serializable {

	private S01EmEmpId id;

	public S01EmEmp() {
	}

	public S01EmEmp(S01EmEmpId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "emEmpId", column = @Column(name = "EmEmpID", nullable = false)),
			@AttributeOverride(name = "emInitialsTxN", column = @Column(name = "EmInitialsTx_N")),
			@AttributeOverride(name = "emInstructorNoTxN", column = @Column(name = "EmInstructorNoTx_N")),
			@AttributeOverride(name = "emInstructorBl", column = @Column(name = "EmInstructorBl", nullable = false)),
			@AttributeOverride(name = "emTechnicianBl", column = @Column(name = "EmTechnicianBl", nullable = false)),
			@AttributeOverride(name = "emUserBl", column = @Column(name = "EmUserBl", nullable = false)),
			@AttributeOverride(name = "emPasswordTxN", column = @Column(name = "EmPasswordTx_N")),
			@AttributeOverride(name = "emSsntxN", column = @Column(name = "EmSSNTx_N")),
			@AttributeOverride(name = "emPadikeyTxN", column = @Column(name = "EmPADIKeyTx_N")),
			@AttributeOverride(name = "emCommissionRateFl", column = @Column(name = "EmCommissionRateFl", nullable = false, precision = 24, scale = 0)),
			@AttributeOverride(name = "emForeColorIn", column = @Column(name = "EmForeColorIn", nullable = false)),
			@AttributeOverride(name = "emBackColorIn", column = @Column(name = "EmBackColorIn", nullable = false)),
			@AttributeOverride(name = "emNotesTxN", column = @Column(name = "EmNotesTx_N")),
			@AttributeOverride(name = "emUrltxN", column = @Column(name = "EmURLTx_N")),
			@AttributeOverride(name = "emUnavailableBl", column = @Column(name = "EmUnavailableBl", nullable = false)),
			@AttributeOverride(name = "emAgentCommissionRateFl", column = @Column(name = "EmAgentCommissionRateFl", nullable = false, precision = 24, scale = 0)),
			@AttributeOverride(name = "emPrevLastLoginDateN", column = @Column(name = "EmPrevLastLoginDate_N", length = 23)),
			@AttributeOverride(name = "emLastLoginDateN", column = @Column(name = "EmLastLoginDate_N", length = 23)),
			@AttributeOverride(name = "emTechNoTxN", column = @Column(name = "EmTechNoTx_N")),
			@AttributeOverride(name = "emPreferredUiidN", column = @Column(name = "EmPreferredUIID_N")) })
	public S01EmEmpId getId() {
		return this.id;
	}

	public void setId(S01EmEmpId id) {
		this.id = id;
	}

}
