package org.holtz.eve.view.stockitemSearch;

import org.apache.wicket.Session;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StockItemDetailPanel extends Panel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String zlStoreStockItemId;
	private String zlNoInStockInX;
	private String zlNoInStockIn;
	private String zlNoInStocklnX;
	private String zlMinStock2in;
	private String zlMinStock1in;
	private String zlMaxStock2in;
	private String zlMaxStock1in;
	private String zlForUploadBl;
	private String zlDisplayOnWebBl;
	private String zlAvgCostPriceMn;
	private String zlNoOnOrderIn;
	private String zlNoOnOrderInX;
	
	
	private static final Logger log = LoggerFactory.getLogger(StockItemDetailPanel.class);
	
	public StockItemDetailPanel(String contentId, TZlStoreStockItem item) {
        super(contentId);
//        Session session = this.getWebSession();
//        item = (TZlStoreStockItem)session.getAttribute("modalContent");
        
        // Create the form, to use later for the buttons
        setOutputMarkupId(true);
        setOutputMarkupPlaceholderTag(true);
        Form<?> editForm = new Form<>("editForm");
        
        editForm.setMultiPart(true);

        if(item != null) { 		
        	editForm.addOrReplace(new TextField<>("sistockItemId", new PropertyModel<Object>(item, "TSistockItem.sistockItemId")));
        	editForm.addOrReplace(new TextField<>("zlStoreStockItemId", new PropertyModel<Object>(item, "zlStoreStockItemId"))); 
			editForm.addOrReplace(new TextField<>("zlNoOnOrderInX", new PropertyModel<Object>(item, "zlNoOnOrderInX")));
			editForm.addOrReplace(new TextField<>("zlNoOnOrderIn", new PropertyModel<Object>(item, "zlNoOnOrderIn")));
			editForm.addOrReplace(new TextField<>("zlNoInStockInX", new PropertyModel<Object>(item, "zlNoInStockInX")));
			editForm.addOrReplace(new TextField<>("zlNoInStockIn", new PropertyModel<Object>(item, "zlNoInStockIn")));
			editForm.addOrReplace(new TextField<>("zlMinStock2in", new PropertyModel<Object>(item, "zlMinStock2in")));
			editForm.addOrReplace(new TextField<>("zlMinStock1in", new PropertyModel<Object>(item, "zlMinStock1in")));
			editForm.addOrReplace(new TextField<>("zlMaxStock2in", new PropertyModel<Object>(item, "zlMaxStock2in")));
			editForm.addOrReplace(new TextField<>("zlMaxStock1in", new PropertyModel<Object>(item, "zlMaxStock1in")));
			editForm.addOrReplace(new TextField<>("zlForUploadBl", new PropertyModel<Object>(item, "zlForUploadBl")));
			editForm.addOrReplace(new TextField<>("zlDisplayOnWebBl", new PropertyModel<Object>(item, "zlDisplayOnWebBl")));
			editForm.addOrReplace(new TextField<>("zlAvgCostPriceMn", new PropertyModel<Object>(item, "zlAvgCostPriceMn")));
	 	    
			editForm.addOrReplace(new AjaxButton("close") {
				public void onSubmit(AjaxRequestTarget target, String contentId) {
					onCancel(target);
				
				}
			});
			editForm.addOrReplace(new AjaxButton("save") {
				public void onSubmit(AjaxRequestTarget target, TZlStoreStockItem item) {
					onSelect(target, item);
				}
			});
			if(log.isDebugEnabled()) {
				log.debug("modalContent:items found: " + item.toString());
			}
        }
        
        // Add some example 'selection' methods, to show as example
        // You can also use a full fledged form, I left that as an
        // exercise for the reader :-)
    // Add a cancel / close button.
    
    addOrReplace(editForm);
    
    
    }
	
	void onCancel(AjaxRequestTarget target) 
	{
		
	}
    void onSelect(AjaxRequestTarget target, TZlStoreStockItem selection) 
    {
    
    }
    void onSelect(AjaxRequestTarget target)
    {
    	
    }
    public String getZlStoreStockItemId() {
		return zlStoreStockItemId;
	}
	public void setZlStoreStockItemId(String zlStoreStockItemId) {
		this.zlStoreStockItemId = zlStoreStockItemId;
	}

	public String getZlNoInStockInX() {
		return zlNoInStockInX;
	}

	public void setZlNoInStockInX(String zlNoInStockInX) {
		this.zlNoInStockInX = zlNoInStockInX;
	}

	public String getZlNoInStockIn() {
		return zlNoInStockIn;
	}

	public void setZlNoInStockIn(String zlNoInStockIn) {
		this.zlNoInStockIn = zlNoInStockIn;
	}

	public String getZlNoInStocklnX() {
		return zlNoInStocklnX;
	}

	public void setZlNoInStocklnX(String zlNoInStocklnX) {
		this.zlNoInStocklnX = zlNoInStocklnX;
	}

	public String getZlNoOnOrderIn() {
		return zlNoOnOrderIn;
	}

	public void setZlNoOnOrderIn(String zlNoOnOrderIn) {
		this.zlNoOnOrderIn = zlNoOnOrderIn;
	}

	public String getZlNoOnOrderInX() {
		return zlNoOnOrderInX;
	}

	public void setZlNoOnOrderInX(String zlNoOnOrderInX) {
		this.zlNoOnOrderInX = zlNoOnOrderInX;
	}

	public static Logger getLog() {
		return log;
	}

	public String getZlMinStock2in() {
		return zlMinStock2in;
	}
	public void setZlMinStock2in(String zlMinStock2in) {
		this.zlMinStock2in = zlMinStock2in;
	}
	public String getZlMinStock1in() {
		return zlMinStock1in;
	}
	public void setZlMinStock1in(String zlMinStock1in) {
		this.zlMinStock1in = zlMinStock1in;
	}
	public String getZlMaxStock2in() {
		return zlMaxStock2in;
	}
	public void setZlMaxStock2in(String zlMaxStock2in) {
		this.zlMaxStock2in = zlMaxStock2in;
	}
	public String getZlMaxStock1in() {
		return zlMaxStock1in;
	}
	public void setZlMaxStock1in(String zlMaxStock1in) {
		this.zlMaxStock1in = zlMaxStock1in;
	}
	public String getZlForUploadBl() {
		return zlForUploadBl;
	}
	public void setZlForUploadBl(String zlForUploadBl) {
		this.zlForUploadBl = zlForUploadBl;
	}
	public String getZlDisplayOnWebBl() {
		return zlDisplayOnWebBl;
	}
	public void setZlDisplayOnWebBl(String zlDisplayOnWebBl) {
		this.zlDisplayOnWebBl = zlDisplayOnWebBl;
	}
	public String getZlAvgCostPriceMn() {
		return zlAvgCostPriceMn;
	}
	public void setZlAvgCostPriceMn(String zlAvgCostPriceMn) {
		this.zlAvgCostPriceMn = zlAvgCostPriceMn;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
