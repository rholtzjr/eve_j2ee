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
 * TIrinvoiceRelation generated by hbm2java
 */
@Entity
@Table(name = "T_IRInvoiceRelation")
public class TIrinvoiceRelation implements java.io.Serializable {

	private TIrinvoiceRelationId id;
	private TInInvoice TInInvoiceByIrparentInvoiceId;
	private TInInvoice TInInvoiceByIrchildInvoiceId;

	public TIrinvoiceRelation() {
	}

	public TIrinvoiceRelation(TIrinvoiceRelationId id, TInInvoice TInInvoiceByIrparentInvoiceId,
			TInInvoice TInInvoiceByIrchildInvoiceId) {
		this.id = id;
		this.TInInvoiceByIrparentInvoiceId = TInInvoiceByIrparentInvoiceId;
		this.TInInvoiceByIrchildInvoiceId = TInInvoiceByIrchildInvoiceId;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "irparentInvoiceId", column = @Column(name = "IRParentInvoiceID", nullable = false)),
			@AttributeOverride(name = "irchildInvoiceId", column = @Column(name = "IRChildInvoiceID", nullable = false)),
			@AttributeOverride(name = "irrelationTypeId", column = @Column(name = "IRRelationTypeID", nullable = false)) })
	public TIrinvoiceRelationId getId() {
		return this.id;
	}

	public void setId(TIrinvoiceRelationId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IRParentInvoiceID", nullable = false, insertable = false, updatable = false)
	public TInInvoice getTInInvoiceByIrparentInvoiceId() {
		return this.TInInvoiceByIrparentInvoiceId;
	}

	public void setTInInvoiceByIrparentInvoiceId(TInInvoice TInInvoiceByIrparentInvoiceId) {
		this.TInInvoiceByIrparentInvoiceId = TInInvoiceByIrparentInvoiceId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IRChildInvoiceID", nullable = false, insertable = false, updatable = false)
	public TInInvoice getTInInvoiceByIrchildInvoiceId() {
		return this.TInInvoiceByIrchildInvoiceId;
	}

	public void setTInInvoiceByIrchildInvoiceId(TInInvoice TInInvoiceByIrchildInvoiceId) {
		this.TInInvoiceByIrchildInvoiceId = TInInvoiceByIrchildInvoiceId;
	}

}
