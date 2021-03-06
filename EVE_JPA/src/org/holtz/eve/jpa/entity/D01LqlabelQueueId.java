package org.holtz.eve.jpa.entity;
// Generated Aug 4, 2017 9:16:24 AM by Hibernate Tools 4.0.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * D01LqlabelQueueId generated by hbm2java
 */
@Embeddable
public class D01LqlabelQueueId implements java.io.Serializable {

	private int lqid;
	private String lqbarcodeNoTxN;
	private String lqstockNoTxN;
	private String lqstockItemTxN;
	private String lqmanufacturerTxN;
	private String lqstockTypeTxN;
	private String lqsizeTxN;
	private String lqprimaryColorTxN;
	private String lqsecondaryColorTxN;
	private String lqpriceTxN;
	private Short lqpcidN;
	private short lqstoreId;
	private boolean lqblankBl;
	private String lqimageTxN;
	private String lqvideoTxN;
	private short lqmultiSaleQtyIn;
	private String lqdepositTxN;
	private String lqstockItem2txN;
	private String lqnotesTxN;
	private String lqprice2txN;
	private String lqprice3txN;
	private String lqprice4txN;

	public D01LqlabelQueueId() {
	}

	public D01LqlabelQueueId(int lqid, short lqstoreId, boolean lqblankBl, short lqmultiSaleQtyIn) {
		this.lqid = lqid;
		this.lqstoreId = lqstoreId;
		this.lqblankBl = lqblankBl;
		this.lqmultiSaleQtyIn = lqmultiSaleQtyIn;
	}

	public D01LqlabelQueueId(int lqid, String lqbarcodeNoTxN, String lqstockNoTxN,
			String lqstockItemTxN, String lqmanufacturerTxN, String lqstockTypeTxN,
			String lqsizeTxN, String lqprimaryColorTxN, String lqsecondaryColorTxN,
			String lqpriceTxN, Short lqpcidN, short lqstoreId, boolean lqblankBl, String lqimageTxN,
			String lqvideoTxN, short lqmultiSaleQtyIn, String lqdepositTxN, String lqstockItem2txN,
			String lqnotesTxN, String lqprice2txN, String lqprice3txN, String lqprice4txN) {
		this.lqid = lqid;
		this.lqbarcodeNoTxN = lqbarcodeNoTxN;
		this.lqstockNoTxN = lqstockNoTxN;
		this.lqstockItemTxN = lqstockItemTxN;
		this.lqmanufacturerTxN = lqmanufacturerTxN;
		this.lqstockTypeTxN = lqstockTypeTxN;
		this.lqsizeTxN = lqsizeTxN;
		this.lqprimaryColorTxN = lqprimaryColorTxN;
		this.lqsecondaryColorTxN = lqsecondaryColorTxN;
		this.lqpriceTxN = lqpriceTxN;
		this.lqpcidN = lqpcidN;
		this.lqstoreId = lqstoreId;
		this.lqblankBl = lqblankBl;
		this.lqimageTxN = lqimageTxN;
		this.lqvideoTxN = lqvideoTxN;
		this.lqmultiSaleQtyIn = lqmultiSaleQtyIn;
		this.lqdepositTxN = lqdepositTxN;
		this.lqstockItem2txN = lqstockItem2txN;
		this.lqnotesTxN = lqnotesTxN;
		this.lqprice2txN = lqprice2txN;
		this.lqprice3txN = lqprice3txN;
		this.lqprice4txN = lqprice4txN;
	}

	@Column(name = "LQID", nullable = false)
	public int getLqid() {
		return this.lqid;
	}

	public void setLqid(int lqid) {
		this.lqid = lqid;
	}

	@Column(name = "LQBarcodeNoTx_N")
	public String getLqbarcodeNoTxN() {
		return this.lqbarcodeNoTxN;
	}

	public void setLqbarcodeNoTxN(String lqbarcodeNoTxN) {
		this.lqbarcodeNoTxN = lqbarcodeNoTxN;
	}

	@Column(name = "LQStockNoTx_N")
	public String getLqstockNoTxN() {
		return this.lqstockNoTxN;
	}

	public void setLqstockNoTxN(String lqstockNoTxN) {
		this.lqstockNoTxN = lqstockNoTxN;
	}

	@Column(name = "LQStockItemTx_N")
	public String getLqstockItemTxN() {
		return this.lqstockItemTxN;
	}

	public void setLqstockItemTxN(String lqstockItemTxN) {
		this.lqstockItemTxN = lqstockItemTxN;
	}

	@Column(name = "LQManufacturerTx_N")
	public String getLqmanufacturerTxN() {
		return this.lqmanufacturerTxN;
	}

	public void setLqmanufacturerTxN(String lqmanufacturerTxN) {
		this.lqmanufacturerTxN = lqmanufacturerTxN;
	}

	@Column(name = "LQStockTypeTx_N")
	public String getLqstockTypeTxN() {
		return this.lqstockTypeTxN;
	}

	public void setLqstockTypeTxN(String lqstockTypeTxN) {
		this.lqstockTypeTxN = lqstockTypeTxN;
	}

	@Column(name = "LQSizeTx_N")
	public String getLqsizeTxN() {
		return this.lqsizeTxN;
	}

	public void setLqsizeTxN(String lqsizeTxN) {
		this.lqsizeTxN = lqsizeTxN;
	}

	@Column(name = "LQPrimaryColorTx_N")
	public String getLqprimaryColorTxN() {
		return this.lqprimaryColorTxN;
	}

	public void setLqprimaryColorTxN(String lqprimaryColorTxN) {
		this.lqprimaryColorTxN = lqprimaryColorTxN;
	}

	@Column(name = "LQSecondaryColorTx_N")
	public String getLqsecondaryColorTxN() {
		return this.lqsecondaryColorTxN;
	}

	public void setLqsecondaryColorTxN(String lqsecondaryColorTxN) {
		this.lqsecondaryColorTxN = lqsecondaryColorTxN;
	}

	@Column(name = "LQPriceTx_N")
	public String getLqpriceTxN() {
		return this.lqpriceTxN;
	}

	public void setLqpriceTxN(String lqpriceTxN) {
		this.lqpriceTxN = lqpriceTxN;
	}

	@Column(name = "LQPCID_N")
	public Short getLqpcidN() {
		return this.lqpcidN;
	}

	public void setLqpcidN(Short lqpcidN) {
		this.lqpcidN = lqpcidN;
	}

	@Column(name = "LQStoreID", nullable = false)
	public short getLqstoreId() {
		return this.lqstoreId;
	}

	public void setLqstoreId(short lqstoreId) {
		this.lqstoreId = lqstoreId;
	}

	@Column(name = "LQBlankBl", nullable = false)
	public boolean isLqblankBl() {
		return this.lqblankBl;
	}

	public void setLqblankBl(boolean lqblankBl) {
		this.lqblankBl = lqblankBl;
	}

	@Column(name = "LQImageTx_N")
	public String getLqimageTxN() {
		return this.lqimageTxN;
	}

	public void setLqimageTxN(String lqimageTxN) {
		this.lqimageTxN = lqimageTxN;
	}

	@Column(name = "LQVideoTx_N")
	public String getLqvideoTxN() {
		return this.lqvideoTxN;
	}

	public void setLqvideoTxN(String lqvideoTxN) {
		this.lqvideoTxN = lqvideoTxN;
	}

	@Column(name = "LQMultiSaleQtyIn", nullable = false)
	public short getLqmultiSaleQtyIn() {
		return this.lqmultiSaleQtyIn;
	}

	public void setLqmultiSaleQtyIn(short lqmultiSaleQtyIn) {
		this.lqmultiSaleQtyIn = lqmultiSaleQtyIn;
	}

	@Column(name = "LQDepositTx_N")
	public String getLqdepositTxN() {
		return this.lqdepositTxN;
	}

	public void setLqdepositTxN(String lqdepositTxN) {
		this.lqdepositTxN = lqdepositTxN;
	}

	@Column(name = "LQStockItem2Tx_N")
	public String getLqstockItem2txN() {
		return this.lqstockItem2txN;
	}

	public void setLqstockItem2txN(String lqstockItem2txN) {
		this.lqstockItem2txN = lqstockItem2txN;
	}

	@Column(name = "LQNotesTx_N")
	public String getLqnotesTxN() {
		return this.lqnotesTxN;
	}

	public void setLqnotesTxN(String lqnotesTxN) {
		this.lqnotesTxN = lqnotesTxN;
	}

	@Column(name = "LQPrice2Tx_N")
	public String getLqprice2txN() {
		return this.lqprice2txN;
	}

	public void setLqprice2txN(String lqprice2txN) {
		this.lqprice2txN = lqprice2txN;
	}

	@Column(name = "LQPrice3Tx_N")
	public String getLqprice3txN() {
		return this.lqprice3txN;
	}

	public void setLqprice3txN(String lqprice3txN) {
		this.lqprice3txN = lqprice3txN;
	}

	@Column(name = "LQPrice4Tx_N")
	public String getLqprice4txN() {
		return this.lqprice4txN;
	}

	public void setLqprice4txN(String lqprice4txN) {
		this.lqprice4txN = lqprice4txN;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof D01LqlabelQueueId))
			return false;
		D01LqlabelQueueId castOther = (D01LqlabelQueueId) other;

		return (this.getLqid() == castOther.getLqid())
				&& ((this.getLqbarcodeNoTxN() == castOther.getLqbarcodeNoTxN())
						|| (this.getLqbarcodeNoTxN() != null && castOther.getLqbarcodeNoTxN() != null
								&& this.getLqbarcodeNoTxN().equals(castOther.getLqbarcodeNoTxN())))
				&& ((this.getLqstockNoTxN() == castOther.getLqstockNoTxN())
						|| (this.getLqstockNoTxN() != null && castOther.getLqstockNoTxN() != null
								&& this.getLqstockNoTxN().equals(castOther.getLqstockNoTxN())))
				&& ((this.getLqstockItemTxN() == castOther.getLqstockItemTxN())
						|| (this.getLqstockItemTxN() != null && castOther.getLqstockItemTxN() != null
								&& this.getLqstockItemTxN().equals(castOther.getLqstockItemTxN())))
				&& ((this.getLqmanufacturerTxN() == castOther.getLqmanufacturerTxN())
						|| (this.getLqmanufacturerTxN() != null && castOther.getLqmanufacturerTxN() != null
								&& this.getLqmanufacturerTxN().equals(castOther.getLqmanufacturerTxN())))
				&& ((this.getLqstockTypeTxN() == castOther.getLqstockTypeTxN())
						|| (this.getLqstockTypeTxN() != null && castOther.getLqstockTypeTxN() != null
								&& this.getLqstockTypeTxN().equals(castOther.getLqstockTypeTxN())))
				&& ((this.getLqsizeTxN() == castOther.getLqsizeTxN()) || (this.getLqsizeTxN() != null
						&& castOther.getLqsizeTxN() != null && this.getLqsizeTxN().equals(castOther.getLqsizeTxN())))
				&& ((this.getLqprimaryColorTxN() == castOther.getLqprimaryColorTxN())
						|| (this.getLqprimaryColorTxN() != null && castOther.getLqprimaryColorTxN() != null
								&& this.getLqprimaryColorTxN().equals(castOther.getLqprimaryColorTxN())))
				&& ((this.getLqsecondaryColorTxN() == castOther.getLqsecondaryColorTxN())
						|| (this.getLqsecondaryColorTxN() != null && castOther.getLqsecondaryColorTxN() != null
								&& this.getLqsecondaryColorTxN().equals(castOther.getLqsecondaryColorTxN())))
				&& ((this.getLqpriceTxN() == castOther.getLqpriceTxN()) || (this.getLqpriceTxN() != null
						&& castOther.getLqpriceTxN() != null && this.getLqpriceTxN().equals(castOther.getLqpriceTxN())))
				&& ((this.getLqpcidN() == castOther.getLqpcidN()) || (this.getLqpcidN() != null
						&& castOther.getLqpcidN() != null && this.getLqpcidN().equals(castOther.getLqpcidN())))
				&& (this.getLqstoreId() == castOther.getLqstoreId()) && (this.isLqblankBl() == castOther.isLqblankBl())
				&& ((this.getLqimageTxN() == castOther.getLqimageTxN()) || (this.getLqimageTxN() != null
						&& castOther.getLqimageTxN() != null && this.getLqimageTxN().equals(castOther.getLqimageTxN())))
				&& ((this.getLqvideoTxN() == castOther.getLqvideoTxN()) || (this.getLqvideoTxN() != null
						&& castOther.getLqvideoTxN() != null && this.getLqvideoTxN().equals(castOther.getLqvideoTxN())))
				&& (this.getLqmultiSaleQtyIn() == castOther.getLqmultiSaleQtyIn())
				&& ((this.getLqdepositTxN() == castOther.getLqdepositTxN())
						|| (this.getLqdepositTxN() != null && castOther.getLqdepositTxN() != null
								&& this.getLqdepositTxN().equals(castOther.getLqdepositTxN())))
				&& ((this.getLqstockItem2txN() == castOther.getLqstockItem2txN())
						|| (this.getLqstockItem2txN() != null && castOther.getLqstockItem2txN() != null
								&& this.getLqstockItem2txN().equals(castOther.getLqstockItem2txN())))
				&& ((this.getLqnotesTxN() == castOther.getLqnotesTxN()) || (this.getLqnotesTxN() != null
						&& castOther.getLqnotesTxN() != null && this.getLqnotesTxN().equals(castOther.getLqnotesTxN())))
				&& ((this.getLqprice2txN() == castOther.getLqprice2txN())
						|| (this.getLqprice2txN() != null && castOther.getLqprice2txN() != null
								&& this.getLqprice2txN().equals(castOther.getLqprice2txN())))
				&& ((this.getLqprice3txN() == castOther.getLqprice3txN())
						|| (this.getLqprice3txN() != null && castOther.getLqprice3txN() != null
								&& this.getLqprice3txN().equals(castOther.getLqprice3txN())))
				&& ((this.getLqprice4txN() == castOther.getLqprice4txN())
						|| (this.getLqprice4txN() != null && castOther.getLqprice4txN() != null
								&& this.getLqprice4txN().equals(castOther.getLqprice4txN())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getLqid();
		result = 37 * result + (getLqbarcodeNoTxN() == null ? 0 : this.getLqbarcodeNoTxN().hashCode());
		result = 37 * result + (getLqstockNoTxN() == null ? 0 : this.getLqstockNoTxN().hashCode());
		result = 37 * result + (getLqstockItemTxN() == null ? 0 : this.getLqstockItemTxN().hashCode());
		result = 37 * result + (getLqmanufacturerTxN() == null ? 0 : this.getLqmanufacturerTxN().hashCode());
		result = 37 * result + (getLqstockTypeTxN() == null ? 0 : this.getLqstockTypeTxN().hashCode());
		result = 37 * result + (getLqsizeTxN() == null ? 0 : this.getLqsizeTxN().hashCode());
		result = 37 * result + (getLqprimaryColorTxN() == null ? 0 : this.getLqprimaryColorTxN().hashCode());
		result = 37 * result + (getLqsecondaryColorTxN() == null ? 0 : this.getLqsecondaryColorTxN().hashCode());
		result = 37 * result + (getLqpriceTxN() == null ? 0 : this.getLqpriceTxN().hashCode());
		result = 37 * result + (getLqpcidN() == null ? 0 : this.getLqpcidN().hashCode());
		result = 37 * result + this.getLqstoreId();
		result = 37 * result + (this.isLqblankBl() ? 1 : 0);
		result = 37 * result + (getLqimageTxN() == null ? 0 : this.getLqimageTxN().hashCode());
		result = 37 * result + (getLqvideoTxN() == null ? 0 : this.getLqvideoTxN().hashCode());
		result = 37 * result + this.getLqmultiSaleQtyIn();
		result = 37 * result + (getLqdepositTxN() == null ? 0 : this.getLqdepositTxN().hashCode());
		result = 37 * result + (getLqstockItem2txN() == null ? 0 : this.getLqstockItem2txN().hashCode());
		result = 37 * result + (getLqnotesTxN() == null ? 0 : this.getLqnotesTxN().hashCode());
		result = 37 * result + (getLqprice2txN() == null ? 0 : this.getLqprice2txN().hashCode());
		result = 37 * result + (getLqprice3txN() == null ? 0 : this.getLqprice3txN().hashCode());
		result = 37 * result + (getLqprice4txN() == null ? 0 : this.getLqprice4txN().hashCode());
		return result;
	}

}
