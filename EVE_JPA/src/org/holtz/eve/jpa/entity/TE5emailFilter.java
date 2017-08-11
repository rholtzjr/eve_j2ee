package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TE5emailFilter generated by hbm2java
 */
@Entity
@Table(name = "T_E5EmailFilter")
public class TE5emailFilter implements java.io.Serializable {

	private int e5emailFilterId;
	private TE3emailAgent TE3emailAgent;
	private String e5andOrTx;
	private String e5filterColumnTx;
	private String e5filterOpTx;
	private String e5filterValueTx;
	private int e5openBracketCountIn;
	private int e5closeBracketCountIn;

	public TE5emailFilter() {
	}

	public TE5emailFilter(int e5emailFilterId, TE3emailAgent TE3emailAgent, String e5andOrTx,
			String e5filterColumnTx, String e5filterOpTx, String e5filterValueTx,
			int e5openBracketCountIn, int e5closeBracketCountIn) {
		this.e5emailFilterId = e5emailFilterId;
		this.TE3emailAgent = TE3emailAgent;
		this.e5andOrTx = e5andOrTx;
		this.e5filterColumnTx = e5filterColumnTx;
		this.e5filterOpTx = e5filterOpTx;
		this.e5filterValueTx = e5filterValueTx;
		this.e5openBracketCountIn = e5openBracketCountIn;
		this.e5closeBracketCountIn = e5closeBracketCountIn;
	}

	@Id

	@Column(name = "E5EmailFilterID", unique = true, nullable = false)
	public int getE5emailFilterId() {
		return this.e5emailFilterId;
	}

	public void setE5emailFilterId(int e5emailFilterId) {
		this.e5emailFilterId = e5emailFilterId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "E5EmailAgentID", nullable = false)
	public TE3emailAgent getTE3emailAgent() {
		return this.TE3emailAgent;
	}

	public void setTE3emailAgent(TE3emailAgent TE3emailAgent) {
		this.TE3emailAgent = TE3emailAgent;
	}

	@Column(name = "E5AndOrTx", nullable = false)
	public String getE5andOrTx() {
		return this.e5andOrTx;
	}

	public void setE5andOrTx(String e5andOrTx) {
		this.e5andOrTx = e5andOrTx;
	}

	@Column(name = "E5FilterColumnTx", nullable = false)
	public String getE5filterColumnTx() {
		return this.e5filterColumnTx;
	}

	public void setE5filterColumnTx(String e5filterColumnTx) {
		this.e5filterColumnTx = e5filterColumnTx;
	}

	@Column(name = "E5FilterOpTx", nullable = false)
	public String getE5filterOpTx() {
		return this.e5filterOpTx;
	}

	public void setE5filterOpTx(String e5filterOpTx) {
		this.e5filterOpTx = e5filterOpTx;
	}

	@Column(name = "E5FilterValueTx", nullable = false)
	public String getE5filterValueTx() {
		return this.e5filterValueTx;
	}

	public void setE5filterValueTx(String e5filterValueTx) {
		this.e5filterValueTx = e5filterValueTx;
	}

	@Column(name = "E5OpenBracketCountIn", nullable = false)
	public int getE5openBracketCountIn() {
		return this.e5openBracketCountIn;
	}

	public void setE5openBracketCountIn(int e5openBracketCountIn) {
		this.e5openBracketCountIn = e5openBracketCountIn;
	}

	@Column(name = "E5CloseBracketCountIn", nullable = false)
	public int getE5closeBracketCountIn() {
		return this.e5closeBracketCountIn;
	}

	public void setE5closeBracketCountIn(int e5closeBracketCountIn) {
		this.e5closeBracketCountIn = e5closeBracketCountIn;
	}

}
