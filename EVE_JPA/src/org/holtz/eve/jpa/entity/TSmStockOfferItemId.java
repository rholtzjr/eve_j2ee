package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TSmStockOfferItemId generated by hbm2java
 */
@Embeddable
public class TSmStockOfferItemId implements java.io.Serializable {

	private int smOfferId;
	private float smDiscountPercentFl;

	public TSmStockOfferItemId() {
	}

	public TSmStockOfferItemId(int smOfferId, float smDiscountPercentFl) {
		this.smOfferId = smOfferId;
		this.smDiscountPercentFl = smDiscountPercentFl;
	}

	@Column(name = "SmOfferID", nullable = false)
	public int getSmOfferId() {
		return this.smOfferId;
	}

	public void setSmOfferId(int smOfferId) {
		this.smOfferId = smOfferId;
	}

	@Column(name = "SmDiscountPercentFl", nullable = false, precision = 24, scale = 0)
	public float getSmDiscountPercentFl() {
		return this.smDiscountPercentFl;
	}

	public void setSmDiscountPercentFl(float smDiscountPercentFl) {
		this.smDiscountPercentFl = smDiscountPercentFl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSmStockOfferItemId))
			return false;
		TSmStockOfferItemId castOther = (TSmStockOfferItemId) other;

		return (this.getSmOfferId() == castOther.getSmOfferId())
				&& (this.getSmDiscountPercentFl() == castOther.getSmDiscountPercentFl());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSmOfferId();
		result = 37 * result + (int) this.getSmDiscountPercentFl();
		return result;
	}

}
