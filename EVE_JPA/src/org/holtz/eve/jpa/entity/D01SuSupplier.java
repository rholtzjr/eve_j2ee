package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * D01SuSupplier generated by hbm2java
 */
@Entity
@Table(name = "d01_SuSupplier")
public class D01SuSupplier implements java.io.Serializable {

	private D01SuSupplierId id;

	public D01SuSupplier() {
	}

	public D01SuSupplier(D01SuSupplierId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "suSupplierId", column = @Column(name = "SuSupplierID", nullable = false)),
			@AttributeOverride(name = "suSupplierTx", column = @Column(name = "SuSupplierTx", nullable = false)),
			@AttributeOverride(name = "suContactTxN", column = @Column(name = "SuContactTx_N")),
			@AttributeOverride(name = "suSalesmanTxN", column = @Column(name = "SuSalesmanTx_N")),
			@AttributeOverride(name = "suAddress1txN", column = @Column(name = "SuAddress1Tx_N")),
			@AttributeOverride(name = "suAddress2txN", column = @Column(name = "SuAddress2Tx_N")),
			@AttributeOverride(name = "suAddress3txN", column = @Column(name = "SuAddress3Tx_N")),
			@AttributeOverride(name = "suAddress4txN", column = @Column(name = "SuAddress4Tx_N")),
			@AttributeOverride(name = "suPostcodeTxN", column = @Column(name = "SuPostcodeTx_N")),
			@AttributeOverride(name = "suCountryTxN", column = @Column(name = "SuCountryTx_N")),
			@AttributeOverride(name = "suTelephone1txN", column = @Column(name = "SuTelephone1Tx_N")),
			@AttributeOverride(name = "suTelephone2txN", column = @Column(name = "SuTelephone2Tx_N")),
			@AttributeOverride(name = "suFaxTxN", column = @Column(name = "SuFaxTx_N")),
			@AttributeOverride(name = "suEmailTxN", column = @Column(name = "SuEMailTx_N")),
			@AttributeOverride(name = "suWebTxN", column = @Column(name = "SuWebTx_N")),
			@AttributeOverride(name = "suUnavailableBl", column = @Column(name = "SuUnavailableBl", nullable = false)),
			@AttributeOverride(name = "suLastUpdatedDate", column = @Column(name = "SuLastUpdatedDate", nullable = false, length = 23)),
			@AttributeOverride(name = "suRequiredBl", column = @Column(name = "SuRequiredBl", nullable = false)),
			@AttributeOverride(name = "suCreationDate", column = @Column(name = "SuCreationDate", nullable = false, length = 23)),
			@AttributeOverride(name = "suB2bfnTxN", column = @Column(name = "SuB2BFnTx_N")),
			@AttributeOverride(name = "suB2bemailTxN", column = @Column(name = "SuB2BEmailTx_N")),
			@AttributeOverride(name = "suContact2txN", column = @Column(name = "SuContact2Tx_N")),
			@AttributeOverride(name = "suContact3txN", column = @Column(name = "SuContact3Tx_N")),
			@AttributeOverride(name = "suNotesTxN", column = @Column(name = "SuNotesTx_N")),
			@AttributeOverride(name = "suDisplayOrderIn", column = @Column(name = "SuDisplayOrderIn", nullable = false)) })
	public D01SuSupplierId getId() {
		return this.id;
	}

	public void setId(D01SuSupplierId id) {
		this.id = id;
	}

}
