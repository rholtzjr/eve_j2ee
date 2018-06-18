package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01PcpcId generated by hbm2java
 */
@Embeddable
public class S01PcpcId implements java.io.Serializable {

	private short pcid;
	private String pcnameTx;
	private short pcstoreId;
	private Date pclastUpdatedDate;
	private boolean pccashDrawerBl;
	private double pcopeningBalanceMn;
	private String pcnumberTxN;
	private Date pccreationDate;
	private boolean pcunavailableBl;
	private Date pcrefreshDateN;
	private Integer pcuiconfigIdN;
	private Integer pcstoreViewIdN;
	private String pcaliasTxN;
	private String pcstationNoTxN;

	public S01PcpcId() {
	}

	public S01PcpcId(short pcid, String pcnameTx, short pcstoreId, Date pclastUpdatedDate, boolean pccashDrawerBl,
			double pcopeningBalanceMn, Date pccreationDate, boolean pcunavailableBl) {
		this.pcid = pcid;
		this.pcnameTx = pcnameTx;
		this.pcstoreId = pcstoreId;
		this.pclastUpdatedDate = pclastUpdatedDate;
		this.pccashDrawerBl = pccashDrawerBl;
		this.pcopeningBalanceMn = pcopeningBalanceMn;
		this.pccreationDate = pccreationDate;
		this.pcunavailableBl = pcunavailableBl;
	}

	public S01PcpcId(short pcid, String pcnameTx, short pcstoreId, Date pclastUpdatedDate, boolean pccashDrawerBl,
			double pcopeningBalanceMn, String pcnumberTxN, Date pccreationDate, boolean pcunavailableBl,
			Date pcrefreshDateN, Integer pcuiconfigIdN, Integer pcstoreViewIdN, String pcaliasTxN,
			String pcstationNoTxN) {
		this.pcid = pcid;
		this.pcnameTx = pcnameTx;
		this.pcstoreId = pcstoreId;
		this.pclastUpdatedDate = pclastUpdatedDate;
		this.pccashDrawerBl = pccashDrawerBl;
		this.pcopeningBalanceMn = pcopeningBalanceMn;
		this.pcnumberTxN = pcnumberTxN;
		this.pccreationDate = pccreationDate;
		this.pcunavailableBl = pcunavailableBl;
		this.pcrefreshDateN = pcrefreshDateN;
		this.pcuiconfigIdN = pcuiconfigIdN;
		this.pcstoreViewIdN = pcstoreViewIdN;
		this.pcaliasTxN = pcaliasTxN;
		this.pcstationNoTxN = pcstationNoTxN;
	}

	@Column(name = "PCID", nullable = false)
	public short getPcid() {
		return this.pcid;
	}

	public void setPcid(short pcid) {
		this.pcid = pcid;
	}

	@Column(name = "PCNameTx", nullable = false)
	public String getPcnameTx() {
		return this.pcnameTx;
	}

	public void setPcnameTx(String pcnameTx) {
		this.pcnameTx = pcnameTx;
	}

	@Column(name = "PCStoreID", nullable = false)
	public short getPcstoreId() {
		return this.pcstoreId;
	}

	public void setPcstoreId(short pcstoreId) {
		this.pcstoreId = pcstoreId;
	}

	@Column(name = "PCLastUpdatedDate", nullable = false, length = 23)
	public Date getPclastUpdatedDate() {
		return this.pclastUpdatedDate;
	}

	public void setPclastUpdatedDate(Date pclastUpdatedDate) {
		this.pclastUpdatedDate = pclastUpdatedDate;
	}

	@Column(name = "PCCashDrawerBl", nullable = false)
	public boolean isPccashDrawerBl() {
		return this.pccashDrawerBl;
	}

	public void setPccashDrawerBl(boolean pccashDrawerBl) {
		this.pccashDrawerBl = pccashDrawerBl;
	}

	@Column(name = "PCOpeningBalanceMn", nullable = false, precision = 53, scale = 0)
	public double getPcopeningBalanceMn() {
		return this.pcopeningBalanceMn;
	}

	public void setPcopeningBalanceMn(double pcopeningBalanceMn) {
		this.pcopeningBalanceMn = pcopeningBalanceMn;
	}

	@Column(name = "PCNumberTx_N")
	public String getPcnumberTxN() {
		return this.pcnumberTxN;
	}

	public void setPcnumberTxN(String pcnumberTxN) {
		this.pcnumberTxN = pcnumberTxN;
	}

	@Column(name = "PCCreationDate", nullable = false, length = 23)
	public Date getPccreationDate() {
		return this.pccreationDate;
	}

	public void setPccreationDate(Date pccreationDate) {
		this.pccreationDate = pccreationDate;
	}

	@Column(name = "PCUnavailableBl", nullable = false)
	public boolean isPcunavailableBl() {
		return this.pcunavailableBl;
	}

	public void setPcunavailableBl(boolean pcunavailableBl) {
		this.pcunavailableBl = pcunavailableBl;
	}

	@Column(name = "PCRefreshDate_N", length = 23)
	public Date getPcrefreshDateN() {
		return this.pcrefreshDateN;
	}

	public void setPcrefreshDateN(Date pcrefreshDateN) {
		this.pcrefreshDateN = pcrefreshDateN;
	}

	@Column(name = "PCUIConfigID_N")
	public Integer getPcuiconfigIdN() {
		return this.pcuiconfigIdN;
	}

	public void setPcuiconfigIdN(Integer pcuiconfigIdN) {
		this.pcuiconfigIdN = pcuiconfigIdN;
	}

	@Column(name = "PCStoreViewID_N")
	public Integer getPcstoreViewIdN() {
		return this.pcstoreViewIdN;
	}

	public void setPcstoreViewIdN(Integer pcstoreViewIdN) {
		this.pcstoreViewIdN = pcstoreViewIdN;
	}

	@Column(name = "PCAliasTx_N")
	public String getPcaliasTxN() {
		return this.pcaliasTxN;
	}

	public void setPcaliasTxN(String pcaliasTxN) {
		this.pcaliasTxN = pcaliasTxN;
	}

	@Column(name = "PCStationNoTx_N")
	public String getPcstationNoTxN() {
		return this.pcstationNoTxN;
	}

	public void setPcstationNoTxN(String pcstationNoTxN) {
		this.pcstationNoTxN = pcstationNoTxN;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01PcpcId))
			return false;
		S01PcpcId castOther = (S01PcpcId) other;

		return (this.getPcid() == castOther.getPcid())
				&& ((this.getPcnameTx() == castOther.getPcnameTx()) || (this.getPcnameTx() != null
						&& castOther.getPcnameTx() != null && this.getPcnameTx().equals(castOther.getPcnameTx())))
				&& (this.getPcstoreId() == castOther.getPcstoreId())
				&& ((this.getPclastUpdatedDate() == castOther.getPclastUpdatedDate())
						|| (this.getPclastUpdatedDate() != null && castOther.getPclastUpdatedDate() != null
								&& this.getPclastUpdatedDate().equals(castOther.getPclastUpdatedDate())))
				&& (this.isPccashDrawerBl() == castOther.isPccashDrawerBl())
				&& (this.getPcopeningBalanceMn() == castOther.getPcopeningBalanceMn())
				&& ((this.getPcnumberTxN() == castOther.getPcnumberTxN())
						|| (this.getPcnumberTxN() != null && castOther.getPcnumberTxN() != null
								&& this.getPcnumberTxN().equals(castOther.getPcnumberTxN())))
				&& ((this.getPccreationDate() == castOther.getPccreationDate())
						|| (this.getPccreationDate() != null && castOther.getPccreationDate() != null
								&& this.getPccreationDate().equals(castOther.getPccreationDate())))
				&& (this.isPcunavailableBl() == castOther.isPcunavailableBl())
				&& ((this.getPcrefreshDateN() == castOther.getPcrefreshDateN())
						|| (this.getPcrefreshDateN() != null && castOther.getPcrefreshDateN() != null
								&& this.getPcrefreshDateN().equals(castOther.getPcrefreshDateN())))
				&& ((this.getPcuiconfigIdN() == castOther.getPcuiconfigIdN())
						|| (this.getPcuiconfigIdN() != null && castOther.getPcuiconfigIdN() != null
								&& this.getPcuiconfigIdN().equals(castOther.getPcuiconfigIdN())))
				&& ((this.getPcstoreViewIdN() == castOther.getPcstoreViewIdN())
						|| (this.getPcstoreViewIdN() != null && castOther.getPcstoreViewIdN() != null
								&& this.getPcstoreViewIdN().equals(castOther.getPcstoreViewIdN())))
				&& ((this.getPcaliasTxN() == castOther.getPcaliasTxN()) || (this.getPcaliasTxN() != null
						&& castOther.getPcaliasTxN() != null && this.getPcaliasTxN().equals(castOther.getPcaliasTxN())))
				&& ((this.getPcstationNoTxN() == castOther.getPcstationNoTxN())
						|| (this.getPcstationNoTxN() != null && castOther.getPcstationNoTxN() != null
								&& this.getPcstationNoTxN().equals(castOther.getPcstationNoTxN())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPcid();
		result = 37 * result + (getPcnameTx() == null ? 0 : this.getPcnameTx().hashCode());
		result = 37 * result + this.getPcstoreId();
		result = 37 * result + (getPclastUpdatedDate() == null ? 0 : this.getPclastUpdatedDate().hashCode());
		result = 37 * result + (this.isPccashDrawerBl() ? 1 : 0);
		result = 37 * result + (int) this.getPcopeningBalanceMn();
		result = 37 * result + (getPcnumberTxN() == null ? 0 : this.getPcnumberTxN().hashCode());
		result = 37 * result + (getPccreationDate() == null ? 0 : this.getPccreationDate().hashCode());
		result = 37 * result + (this.isPcunavailableBl() ? 1 : 0);
		result = 37 * result + (getPcrefreshDateN() == null ? 0 : this.getPcrefreshDateN().hashCode());
		result = 37 * result + (getPcuiconfigIdN() == null ? 0 : this.getPcuiconfigIdN().hashCode());
		result = 37 * result + (getPcstoreViewIdN() == null ? 0 : this.getPcstoreViewIdN().hashCode());
		result = 37 * result + (getPcaliasTxN() == null ? 0 : this.getPcaliasTxN().hashCode());
		result = 37 * result + (getPcstationNoTxN() == null ? 0 : this.getPcstationNoTxN().hashCode());
		return result;
	}

}
