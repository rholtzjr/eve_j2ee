package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AspnetSchemaVersionsId generated by hbm2java
 */
@Embeddable
public class AspnetSchemaVersionsId implements java.io.Serializable {

	private String feature;
	private String compatibleSchemaVersion;

	public AspnetSchemaVersionsId() {
	}

	public AspnetSchemaVersionsId(String feature, String compatibleSchemaVersion) {
		this.feature = feature;
		this.compatibleSchemaVersion = compatibleSchemaVersion;
	}

	@Column(name = "Feature", nullable = false)
	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	@Column(name = "CompatibleSchemaVersion", nullable = false)
	public String getCompatibleSchemaVersion() {
		return this.compatibleSchemaVersion;
	}

	public void setCompatibleSchemaVersion(String compatibleSchemaVersion) {
		this.compatibleSchemaVersion = compatibleSchemaVersion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AspnetSchemaVersionsId))
			return false;
		AspnetSchemaVersionsId castOther = (AspnetSchemaVersionsId) other;

		return ((this.getFeature() == castOther.getFeature()) || (this.getFeature() != null
				&& castOther.getFeature() != null && this.getFeature().equals(castOther.getFeature())))
				&& ((this.getCompatibleSchemaVersion() == castOther.getCompatibleSchemaVersion())
						|| (this.getCompatibleSchemaVersion() != null && castOther.getCompatibleSchemaVersion() != null
								&& this.getCompatibleSchemaVersion().equals(castOther.getCompatibleSchemaVersion())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFeature() == null ? 0 : this.getFeature().hashCode());
		result = 37 * result
				+ (getCompatibleSchemaVersion() == null ? 0 : this.getCompatibleSchemaVersion().hashCode());
		return result;
	}

}
