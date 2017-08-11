package org.holtz.eve.view.stockitem;

import java.io.Serializable;
import java.util.Date;

public class StockItemFilter implements Serializable
{
    private String stockItemId;
    private String stockItemName;
    private String stockItemSupplier;
    private String stockItemBarcode;
    
    
    public String getStockItemId() {
		return stockItemId;
	}
	public void setStockItemId(String stockItemId) {
		this.stockItemId = stockItemId;
	}
	public String getStockItemName() {
		return stockItemName;
	}
	public void setStockItemName(String stockItemName) {
		this.stockItemName = stockItemName;
	}
	public String getStockItemSupplier() {
		return stockItemSupplier;
	}
	public void setStockItemSupplier(String stockItemSupplier) {
		this.stockItemSupplier = stockItemSupplier;
	}
	public String getStockItemBarcode() {
		return stockItemBarcode;
	}
	public void setStockItemBarcode(String stockItemBarcode) {
		this.stockItemBarcode = stockItemBarcode;
	}
	public String getStockItemIdFrom()
    {
        return stockItemId;
    }
 
}