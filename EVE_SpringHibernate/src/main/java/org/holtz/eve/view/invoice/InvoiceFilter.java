package org.holtz.eve.view.invoice;

import java.io.Serializable;
import java.sql.Timestamp;

public class InvoiceFilter implements Serializable
{
    private String invId;
    private Timestamp invCreateDate;
    private String invCustId;
    private String invNumber_Tx_N;
	public String getInvId() {
		return invId;
	}
	public void setInvId(String invId) {
		this.invId = invId;
	}
	public Timestamp getInvCreateDate() {
		return invCreateDate;
	}
	public void setInvCreateDate(Timestamp invCreateDate) {
		this.invCreateDate = invCreateDate;
	}
	public String getInvCustId() {
		return invCustId;
	}
	public void setInvCustId(String invCustId) {
		this.invCustId = invCustId;
	}
	public String getInvNumber_Tx_N() {
		return invNumber_Tx_N;
	}
	public void setInvNumber_Tx_N(String invNumber_Tx_N) {
		this.invNumber_Tx_N = invNumber_Tx_N;
	}
	
    
    
 
 
}