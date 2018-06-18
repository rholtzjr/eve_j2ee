package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TBbcoolbarId generated by hbm2java
 */
@Embeddable
public class TBbcoolbarId implements java.io.Serializable {

	private short bbcoolbarId;
	private String bbcoolbarTx;

	public TBbcoolbarId() {
	}

	public TBbcoolbarId(short bbcoolbarId, String bbcoolbarTx) {
		this.bbcoolbarId = bbcoolbarId;
		this.bbcoolbarTx = bbcoolbarTx;
	}

	@Column(name = "BBCoolbarID", nullable = false)
	public short getBbcoolbarId() {
		return this.bbcoolbarId;
	}

	public void setBbcoolbarId(short bbcoolbarId) {
		this.bbcoolbarId = bbcoolbarId;
	}

	@Column(name = "BBCoolbarTx", nullable = false)
	public String getBbcoolbarTx() {
		return this.bbcoolbarTx;
	}

	public void setBbcoolbarTx(String bbcoolbarTx) {
		this.bbcoolbarTx = bbcoolbarTx;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TBbcoolbarId))
			return false;
		TBbcoolbarId castOther = (TBbcoolbarId) other;

		return (this.getBbcoolbarId() == castOther.getBbcoolbarId())
				&& ((this.getBbcoolbarTx() == castOther.getBbcoolbarTx())
						|| (this.getBbcoolbarTx() != null && castOther.getBbcoolbarTx() != null
								&& this.getBbcoolbarTx().equals(castOther.getBbcoolbarTx())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBbcoolbarId();
		result = 37 * result + (getBbcoolbarTx() == null ? 0 : this.getBbcoolbarTx().hashCode());
		return result;
	}

}
