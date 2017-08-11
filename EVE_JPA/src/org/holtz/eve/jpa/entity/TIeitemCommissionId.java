package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TIeitemCommissionId generated by hbm2java
 */
@Embeddable
public class TIeitemCommissionId implements java.io.Serializable {

	private int ieinvoiceItemId;
	private int iecommissionEmpId;

	public TIeitemCommissionId() {
	}

	public TIeitemCommissionId(int ieinvoiceItemId, int iecommissionEmpId) {
		this.ieinvoiceItemId = ieinvoiceItemId;
		this.iecommissionEmpId = iecommissionEmpId;
	}

	@Column(name = "IEInvoiceItemID", nullable = false)
	public int getIeinvoiceItemId() {
		return this.ieinvoiceItemId;
	}

	public void setIeinvoiceItemId(int ieinvoiceItemId) {
		this.ieinvoiceItemId = ieinvoiceItemId;
	}

	@Column(name = "IECommissionEmpID", nullable = false)
	public int getIecommissionEmpId() {
		return this.iecommissionEmpId;
	}

	public void setIecommissionEmpId(int iecommissionEmpId) {
		this.iecommissionEmpId = iecommissionEmpId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TIeitemCommissionId))
			return false;
		TIeitemCommissionId castOther = (TIeitemCommissionId) other;

		return (this.getIeinvoiceItemId() == castOther.getIeinvoiceItemId())
				&& (this.getIecommissionEmpId() == castOther.getIecommissionEmpId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIeinvoiceItemId();
		result = 37 * result + this.getIecommissionEmpId();
		return result;
	}

}
