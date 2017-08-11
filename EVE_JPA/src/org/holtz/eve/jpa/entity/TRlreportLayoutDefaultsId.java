package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TRlreportLayoutDefaultsId generated by hbm2java
 */
@Embeddable
public class TRlreportLayoutDefaultsId implements java.io.Serializable {

	private int rlreportLayoutId;
	private String rlreportLayoutTx;
	private int rlreportTypeId;
	private int rlpaperSizeId;
	private short rldestinationId;
	private short rlcopiesIn;
	private boolean rllandscapeBl;
	private boolean rluseMarginsBl;
	private boolean rlunavailableBl;
	private boolean rlscaleToFitXbl;
	private boolean rlscaleToFitYbl;
	private boolean rluseDbpaperSizeBl;

	public TRlreportLayoutDefaultsId() {
	}

	public TRlreportLayoutDefaultsId(int rlreportLayoutId, String rlreportLayoutTx, int rlreportTypeId,
			int rlpaperSizeId, short rldestinationId, short rlcopiesIn, boolean rllandscapeBl, boolean rluseMarginsBl,
			boolean rlunavailableBl, boolean rlscaleToFitXbl, boolean rlscaleToFitYbl, boolean rluseDbpaperSizeBl) {
		this.rlreportLayoutId = rlreportLayoutId;
		this.rlreportLayoutTx = rlreportLayoutTx;
		this.rlreportTypeId = rlreportTypeId;
		this.rlpaperSizeId = rlpaperSizeId;
		this.rldestinationId = rldestinationId;
		this.rlcopiesIn = rlcopiesIn;
		this.rllandscapeBl = rllandscapeBl;
		this.rluseMarginsBl = rluseMarginsBl;
		this.rlunavailableBl = rlunavailableBl;
		this.rlscaleToFitXbl = rlscaleToFitXbl;
		this.rlscaleToFitYbl = rlscaleToFitYbl;
		this.rluseDbpaperSizeBl = rluseDbpaperSizeBl;
	}

	@Column(name = "RLReportLayoutID", nullable = false)
	public int getRlreportLayoutId() {
		return this.rlreportLayoutId;
	}

	public void setRlreportLayoutId(int rlreportLayoutId) {
		this.rlreportLayoutId = rlreportLayoutId;
	}

	@Column(name = "RLReportLayoutTx", nullable = false)
	public String getRlreportLayoutTx() {
		return this.rlreportLayoutTx;
	}

	public void setRlreportLayoutTx(String rlreportLayoutTx) {
		this.rlreportLayoutTx = rlreportLayoutTx;
	}

	@Column(name = "RLReportTypeID", nullable = false)
	public int getRlreportTypeId() {
		return this.rlreportTypeId;
	}

	public void setRlreportTypeId(int rlreportTypeId) {
		this.rlreportTypeId = rlreportTypeId;
	}

	@Column(name = "RLPaperSizeID", nullable = false)
	public int getRlpaperSizeId() {
		return this.rlpaperSizeId;
	}

	public void setRlpaperSizeId(int rlpaperSizeId) {
		this.rlpaperSizeId = rlpaperSizeId;
	}

	@Column(name = "RLDestinationID", nullable = false)
	public short getRldestinationId() {
		return this.rldestinationId;
	}

	public void setRldestinationId(short rldestinationId) {
		this.rldestinationId = rldestinationId;
	}

	@Column(name = "RLCopiesIn", nullable = false)
	public short getRlcopiesIn() {
		return this.rlcopiesIn;
	}

	public void setRlcopiesIn(short rlcopiesIn) {
		this.rlcopiesIn = rlcopiesIn;
	}

	@Column(name = "RLLandscapeBl", nullable = false)
	public boolean isRllandscapeBl() {
		return this.rllandscapeBl;
	}

	public void setRllandscapeBl(boolean rllandscapeBl) {
		this.rllandscapeBl = rllandscapeBl;
	}

	@Column(name = "RLUseMarginsBl", nullable = false)
	public boolean isRluseMarginsBl() {
		return this.rluseMarginsBl;
	}

	public void setRluseMarginsBl(boolean rluseMarginsBl) {
		this.rluseMarginsBl = rluseMarginsBl;
	}

	@Column(name = "RLUnavailableBl", nullable = false)
	public boolean isRlunavailableBl() {
		return this.rlunavailableBl;
	}

	public void setRlunavailableBl(boolean rlunavailableBl) {
		this.rlunavailableBl = rlunavailableBl;
	}

	@Column(name = "RLScaleToFitXBl", nullable = false)
	public boolean isRlscaleToFitXbl() {
		return this.rlscaleToFitXbl;
	}

	public void setRlscaleToFitXbl(boolean rlscaleToFitXbl) {
		this.rlscaleToFitXbl = rlscaleToFitXbl;
	}

	@Column(name = "RLScaleToFitYBl", nullable = false)
	public boolean isRlscaleToFitYbl() {
		return this.rlscaleToFitYbl;
	}

	public void setRlscaleToFitYbl(boolean rlscaleToFitYbl) {
		this.rlscaleToFitYbl = rlscaleToFitYbl;
	}

	@Column(name = "RLUseDBPaperSizeBl", nullable = false)
	public boolean isRluseDbpaperSizeBl() {
		return this.rluseDbpaperSizeBl;
	}

	public void setRluseDbpaperSizeBl(boolean rluseDbpaperSizeBl) {
		this.rluseDbpaperSizeBl = rluseDbpaperSizeBl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TRlreportLayoutDefaultsId))
			return false;
		TRlreportLayoutDefaultsId castOther = (TRlreportLayoutDefaultsId) other;

		return (this.getRlreportLayoutId() == castOther.getRlreportLayoutId())
				&& ((this.getRlreportLayoutTx() == castOther.getRlreportLayoutTx())
						|| (this.getRlreportLayoutTx() != null && castOther.getRlreportLayoutTx() != null
								&& this.getRlreportLayoutTx().equals(castOther.getRlreportLayoutTx())))
				&& (this.getRlreportTypeId() == castOther.getRlreportTypeId())
				&& (this.getRlpaperSizeId() == castOther.getRlpaperSizeId())
				&& (this.getRldestinationId() == castOther.getRldestinationId())
				&& (this.getRlcopiesIn() == castOther.getRlcopiesIn())
				&& (this.isRllandscapeBl() == castOther.isRllandscapeBl())
				&& (this.isRluseMarginsBl() == castOther.isRluseMarginsBl())
				&& (this.isRlunavailableBl() == castOther.isRlunavailableBl())
				&& (this.isRlscaleToFitXbl() == castOther.isRlscaleToFitXbl())
				&& (this.isRlscaleToFitYbl() == castOther.isRlscaleToFitYbl())
				&& (this.isRluseDbpaperSizeBl() == castOther.isRluseDbpaperSizeBl());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRlreportLayoutId();
		result = 37 * result + (getRlreportLayoutTx() == null ? 0 : this.getRlreportLayoutTx().hashCode());
		result = 37 * result + this.getRlreportTypeId();
		result = 37 * result + this.getRlpaperSizeId();
		result = 37 * result + this.getRldestinationId();
		result = 37 * result + this.getRlcopiesIn();
		result = 37 * result + (this.isRllandscapeBl() ? 1 : 0);
		result = 37 * result + (this.isRluseMarginsBl() ? 1 : 0);
		result = 37 * result + (this.isRlunavailableBl() ? 1 : 0);
		result = 37 * result + (this.isRlscaleToFitXbl() ? 1 : 0);
		result = 37 * result + (this.isRlscaleToFitYbl() ? 1 : 0);
		result = 37 * result + (this.isRluseDbpaperSizeBl() ? 1 : 0);
		return result;
	}

}
