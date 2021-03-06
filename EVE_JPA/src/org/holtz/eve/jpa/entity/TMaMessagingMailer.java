package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMaMessagingMailer generated by hbm2java
 */
@Entity
@Table(name = "T_MaMessagingMailer")
public class TMaMessagingMailer implements java.io.Serializable {

	private int maMailerId;
	private String maMailerNameTx;
	private String maToListTxN;
	private String maCcListTxN;
	private String maFromNameTx;
	private String maFromEmailTx;
	private String maSubjectTx;
	private String maMessageBodyTx;
	private boolean maIsHtmlbl;

	public TMaMessagingMailer() {
	}

	public TMaMessagingMailer(int maMailerId, String maMailerNameTx, String maFromNameTx,
			String maFromEmailTx, String maSubjectTx, String maMessageBodyTx, boolean maIsHtmlbl) {
		this.maMailerId = maMailerId;
		this.maMailerNameTx = maMailerNameTx;
		this.maFromNameTx = maFromNameTx;
		this.maFromEmailTx = maFromEmailTx;
		this.maSubjectTx = maSubjectTx;
		this.maMessageBodyTx = maMessageBodyTx;
		this.maIsHtmlbl = maIsHtmlbl;
	}

	public TMaMessagingMailer(int maMailerId, String maMailerNameTx, String maToListTxN,
			String maCcListTxN, String maFromNameTx, String maFromEmailTx, String maSubjectTx,
			String maMessageBodyTx, boolean maIsHtmlbl) {
		this.maMailerId = maMailerId;
		this.maMailerNameTx = maMailerNameTx;
		this.maToListTxN = maToListTxN;
		this.maCcListTxN = maCcListTxN;
		this.maFromNameTx = maFromNameTx;
		this.maFromEmailTx = maFromEmailTx;
		this.maSubjectTx = maSubjectTx;
		this.maMessageBodyTx = maMessageBodyTx;
		this.maIsHtmlbl = maIsHtmlbl;
	}

	@Id

	@Column(name = "MaMailerID", unique = true, nullable = false)
	public int getMaMailerId() {
		return this.maMailerId;
	}

	public void setMaMailerId(int maMailerId) {
		this.maMailerId = maMailerId;
	}

	@Column(name = "MaMailerNameTx", nullable = false)
	public String getMaMailerNameTx() {
		return this.maMailerNameTx;
	}

	public void setMaMailerNameTx(String maMailerNameTx) {
		this.maMailerNameTx = maMailerNameTx;
	}

	@Column(name = "MaToListTx_N")
	public String getMaToListTxN() {
		return this.maToListTxN;
	}

	public void setMaToListTxN(String maToListTxN) {
		this.maToListTxN = maToListTxN;
	}

	@Column(name = "MaCcListTx_N")
	public String getMaCcListTxN() {
		return this.maCcListTxN;
	}

	public void setMaCcListTxN(String maCcListTxN) {
		this.maCcListTxN = maCcListTxN;
	}

	@Column(name = "MaFromNameTx", nullable = false)
	public String getMaFromNameTx() {
		return this.maFromNameTx;
	}

	public void setMaFromNameTx(String maFromNameTx) {
		this.maFromNameTx = maFromNameTx;
	}

	@Column(name = "MaFromEmailTx", nullable = false)
	public String getMaFromEmailTx() {
		return this.maFromEmailTx;
	}

	public void setMaFromEmailTx(String maFromEmailTx) {
		this.maFromEmailTx = maFromEmailTx;
	}

	@Column(name = "MaSubjectTx", nullable = false)
	public String getMaSubjectTx() {
		return this.maSubjectTx;
	}

	public void setMaSubjectTx(String maSubjectTx) {
		this.maSubjectTx = maSubjectTx;
	}

	@Column(name = "MaMessageBodyTx", nullable = false)
	public String getMaMessageBodyTx() {
		return this.maMessageBodyTx;
	}

	public void setMaMessageBodyTx(String maMessageBodyTx) {
		this.maMessageBodyTx = maMessageBodyTx;
	}

	@Column(name = "MaIsHTMLBl", nullable = false)
	public boolean isMaIsHtmlbl() {
		return this.maIsHtmlbl;
	}

	public void setMaIsHtmlbl(boolean maIsHtmlbl) {
		this.maIsHtmlbl = maIsHtmlbl;
	}

}
