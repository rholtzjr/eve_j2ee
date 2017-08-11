package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TRsreportSectionDefaults generated by hbm2java
 */
@Entity
@Table(name = "T_RSReportSectionDefaults")
public class TRsreportSectionDefaults implements java.io.Serializable {

	private TRsreportSectionDefaultsId id;

	public TRsreportSectionDefaults() {
	}

	public TRsreportSectionDefaults(TRsreportSectionDefaultsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "rsreportSectionId", column = @Column(name = "RSReportSectionID", nullable = false)),
			@AttributeOverride(name = "rsreportSectionTx", column = @Column(name = "RSReportSectionTx", nullable = false)),
			@AttributeOverride(name = "rsreportLayoutId", column = @Column(name = "RSReportLayoutID", nullable = false)),
			@AttributeOverride(name = "rssectionTypeId", column = @Column(name = "RSSectionTypeID", nullable = false)),
			@AttributeOverride(name = "rsdesignOrderIn", column = @Column(name = "RSDesignOrderIn", nullable = false)),
			@AttributeOverride(name = "rsruntimeOrderIn", column = @Column(name = "RSRuntimeOrderIn", nullable = false)),
			@AttributeOverride(name = "rsheightIn", column = @Column(name = "RSHeightIn", nullable = false)),
			@AttributeOverride(name = "rsunavailableBl", column = @Column(name = "RSUnavailableBl", nullable = false)),
			@AttributeOverride(name = "xcxcxc", column = @Column(name = "XCXCXC")),
			@AttributeOverride(name = "rssectionHeaderId", column = @Column(name = "RSSectionHeaderID", nullable = false)) })
	public TRsreportSectionDefaultsId getId() {
		return this.id;
	}

	public void setId(TRsreportSectionDefaultsId id) {
		this.id = id;
	}

}
