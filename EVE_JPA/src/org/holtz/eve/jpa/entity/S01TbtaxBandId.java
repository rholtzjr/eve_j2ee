package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * S01TbtaxBandId generated by hbm2java
 */
@Embeddable
public class S01TbtaxBandId implements java.io.Serializable {

	private int tbtaxBandId;
	private String tbtaxBandTx;
	private float tbtaxRateFl;
	private boolean tbunavailableBl;
	private Date tblastUpdatedDate;
	private boolean tbrequiredBl;
	private Integer tbglaccountIdN;
	private Integer tbsupplierIdN;
	private Date tbcreationDate;
	private boolean tballowExemptionBl;
	private Integer tbnonSalesAccountIdN;

	public S01TbtaxBandId() {
	}

	public S01TbtaxBandId(int tbtaxBandId, String tbtaxBandTx, float tbtaxRateFl, boolean tbunavailableBl,
			Date tblastUpdatedDate, boolean tbrequiredBl, Date tbcreationDate, boolean tballowExemptionBl) {
		this.tbtaxBandId = tbtaxBandId;
		this.tbtaxBandTx = tbtaxBandTx;
		this.tbtaxRateFl = tbtaxRateFl;
		this.tbunavailableBl = tbunavailableBl;
		this.tblastUpdatedDate = tblastUpdatedDate;
		this.tbrequiredBl = tbrequiredBl;
		this.tbcreationDate = tbcreationDate;
		this.tballowExemptionBl = tballowExemptionBl;
	}

	public S01TbtaxBandId(int tbtaxBandId, String tbtaxBandTx, float tbtaxRateFl, boolean tbunavailableBl,
			Date tblastUpdatedDate, boolean tbrequiredBl, Integer tbglaccountIdN, Integer tbsupplierIdN,
			Date tbcreationDate, boolean tballowExemptionBl, Integer tbnonSalesAccountIdN) {
		this.tbtaxBandId = tbtaxBandId;
		this.tbtaxBandTx = tbtaxBandTx;
		this.tbtaxRateFl = tbtaxRateFl;
		this.tbunavailableBl = tbunavailableBl;
		this.tblastUpdatedDate = tblastUpdatedDate;
		this.tbrequiredBl = tbrequiredBl;
		this.tbglaccountIdN = tbglaccountIdN;
		this.tbsupplierIdN = tbsupplierIdN;
		this.tbcreationDate = tbcreationDate;
		this.tballowExemptionBl = tballowExemptionBl;
		this.tbnonSalesAccountIdN = tbnonSalesAccountIdN;
	}

	@Column(name = "TBTaxBandID", nullable = false)
	public int getTbtaxBandId() {
		return this.tbtaxBandId;
	}

	public void setTbtaxBandId(int tbtaxBandId) {
		this.tbtaxBandId = tbtaxBandId;
	}

	@Column(name = "TBTaxBandTx", nullable = false)
	public String getTbtaxBandTx() {
		return this.tbtaxBandTx;
	}

	public void setTbtaxBandTx(String tbtaxBandTx) {
		this.tbtaxBandTx = tbtaxBandTx;
	}

	@Column(name = "TBTaxRateFl", nullable = false, precision = 24, scale = 0)
	public float getTbtaxRateFl() {
		return this.tbtaxRateFl;
	}

	public void setTbtaxRateFl(float tbtaxRateFl) {
		this.tbtaxRateFl = tbtaxRateFl;
	}

	@Column(name = "TBUnavailableBl", nullable = false)
	public boolean isTbunavailableBl() {
		return this.tbunavailableBl;
	}

	public void setTbunavailableBl(boolean tbunavailableBl) {
		this.tbunavailableBl = tbunavailableBl;
	}

	@Column(name = "TBLastUpdatedDate", nullable = false, length = 23)
	public Date getTblastUpdatedDate() {
		return this.tblastUpdatedDate;
	}

	public void setTblastUpdatedDate(Date tblastUpdatedDate) {
		this.tblastUpdatedDate = tblastUpdatedDate;
	}

	@Column(name = "TBRequiredBl", nullable = false)
	public boolean isTbrequiredBl() {
		return this.tbrequiredBl;
	}

	public void setTbrequiredBl(boolean tbrequiredBl) {
		this.tbrequiredBl = tbrequiredBl;
	}

	@Column(name = "TBGLAccountID_N")
	public Integer getTbglaccountIdN() {
		return this.tbglaccountIdN;
	}

	public void setTbglaccountIdN(Integer tbglaccountIdN) {
		this.tbglaccountIdN = tbglaccountIdN;
	}

	@Column(name = "TBSupplierID_N")
	public Integer getTbsupplierIdN() {
		return this.tbsupplierIdN;
	}

	public void setTbsupplierIdN(Integer tbsupplierIdN) {
		this.tbsupplierIdN = tbsupplierIdN;
	}

	@Column(name = "TBCreationDate", nullable = false, length = 23)
	public Date getTbcreationDate() {
		return this.tbcreationDate;
	}

	public void setTbcreationDate(Date tbcreationDate) {
		this.tbcreationDate = tbcreationDate;
	}

	@Column(name = "TBAllowExemptionBl", nullable = false)
	public boolean isTballowExemptionBl() {
		return this.tballowExemptionBl;
	}

	public void setTballowExemptionBl(boolean tballowExemptionBl) {
		this.tballowExemptionBl = tballowExemptionBl;
	}

	@Column(name = "TBNonSalesAccountID_N")
	public Integer getTbnonSalesAccountIdN() {
		return this.tbnonSalesAccountIdN;
	}

	public void setTbnonSalesAccountIdN(Integer tbnonSalesAccountIdN) {
		this.tbnonSalesAccountIdN = tbnonSalesAccountIdN;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof S01TbtaxBandId))
			return false;
		S01TbtaxBandId castOther = (S01TbtaxBandId) other;

		return (this.getTbtaxBandId() == castOther.getTbtaxBandId())
				&& ((this.getTbtaxBandTx() == castOther.getTbtaxBandTx())
						|| (this.getTbtaxBandTx() != null && castOther.getTbtaxBandTx() != null
								&& this.getTbtaxBandTx().equals(castOther.getTbtaxBandTx())))
				&& (this.getTbtaxRateFl() == castOther.getTbtaxRateFl())
				&& (this.isTbunavailableBl() == castOther.isTbunavailableBl())
				&& ((this.getTblastUpdatedDate() == castOther.getTblastUpdatedDate())
						|| (this.getTblastUpdatedDate() != null && castOther.getTblastUpdatedDate() != null
								&& this.getTblastUpdatedDate().equals(castOther.getTblastUpdatedDate())))
				&& (this.isTbrequiredBl() == castOther.isTbrequiredBl())
				&& ((this.getTbglaccountIdN() == castOther.getTbglaccountIdN())
						|| (this.getTbglaccountIdN() != null && castOther.getTbglaccountIdN() != null
								&& this.getTbglaccountIdN().equals(castOther.getTbglaccountIdN())))
				&& ((this.getTbsupplierIdN() == castOther.getTbsupplierIdN())
						|| (this.getTbsupplierIdN() != null && castOther.getTbsupplierIdN() != null
								&& this.getTbsupplierIdN().equals(castOther.getTbsupplierIdN())))
				&& ((this.getTbcreationDate() == castOther.getTbcreationDate())
						|| (this.getTbcreationDate() != null && castOther.getTbcreationDate() != null
								&& this.getTbcreationDate().equals(castOther.getTbcreationDate())))
				&& (this.isTballowExemptionBl() == castOther.isTballowExemptionBl())
				&& ((this.getTbnonSalesAccountIdN() == castOther.getTbnonSalesAccountIdN())
						|| (this.getTbnonSalesAccountIdN() != null && castOther.getTbnonSalesAccountIdN() != null
								&& this.getTbnonSalesAccountIdN().equals(castOther.getTbnonSalesAccountIdN())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTbtaxBandId();
		result = 37 * result + (getTbtaxBandTx() == null ? 0 : this.getTbtaxBandTx().hashCode());
		result = 37 * result + (int) this.getTbtaxRateFl();
		result = 37 * result + (this.isTbunavailableBl() ? 1 : 0);
		result = 37 * result + (getTblastUpdatedDate() == null ? 0 : this.getTblastUpdatedDate().hashCode());
		result = 37 * result + (this.isTbrequiredBl() ? 1 : 0);
		result = 37 * result + (getTbglaccountIdN() == null ? 0 : this.getTbglaccountIdN().hashCode());
		result = 37 * result + (getTbsupplierIdN() == null ? 0 : this.getTbsupplierIdN().hashCode());
		result = 37 * result + (getTbcreationDate() == null ? 0 : this.getTbcreationDate().hashCode());
		result = 37 * result + (this.isTballowExemptionBl() ? 1 : 0);
		result = 37 * result + (getTbnonSalesAccountIdN() == null ? 0 : this.getTbnonSalesAccountIdN().hashCode());
		return result;
	}

}
