package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TTaTaxBandRelationsId generated by hbm2java
 */
@Embeddable
public class TTaTaxBandRelationsId implements java.io.Serializable {

	private int taParentTaxBandId;
	private int taChildTaxBandId;

	public TTaTaxBandRelationsId() {
	}

	public TTaTaxBandRelationsId(int taParentTaxBandId, int taChildTaxBandId) {
		this.taParentTaxBandId = taParentTaxBandId;
		this.taChildTaxBandId = taChildTaxBandId;
	}

	@Column(name = "TaParentTaxBandID", nullable = false)
	public int getTaParentTaxBandId() {
		return this.taParentTaxBandId;
	}

	public void setTaParentTaxBandId(int taParentTaxBandId) {
		this.taParentTaxBandId = taParentTaxBandId;
	}

	@Column(name = "TaChildTaxBandID", nullable = false)
	public int getTaChildTaxBandId() {
		return this.taChildTaxBandId;
	}

	public void setTaChildTaxBandId(int taChildTaxBandId) {
		this.taChildTaxBandId = taChildTaxBandId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TTaTaxBandRelationsId))
			return false;
		TTaTaxBandRelationsId castOther = (TTaTaxBandRelationsId) other;

		return (this.getTaParentTaxBandId() == castOther.getTaParentTaxBandId())
				&& (this.getTaChildTaxBandId() == castOther.getTaChildTaxBandId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTaParentTaxBandId();
		result = 37 * result + this.getTaChildTaxBandId();
		return result;
	}

}
