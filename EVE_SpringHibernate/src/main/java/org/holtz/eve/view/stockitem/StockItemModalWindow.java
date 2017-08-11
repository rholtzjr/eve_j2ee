package org.holtz.eve.view.stockitem;

import org.apache.wicket.Session;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.EmptyPanel;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;

public abstract class StockItemModalWindow extends ModalWindow {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String contentId = "modalContent";

	public StockItemModalWindow(String id, TZlStoreStockItem item) {

		super(id);

		this.setTitle("Stock Item");
		this.setAuto(true);
		this.setAutoSize(true);
		this.setOutputMarkupId(true);
//		Session session = this.getWebSession();
//		item = (TZlStoreStockItem) session.getAttribute("modalContent");
		//If null will a AJAX callback be required?  Is it really null at the time of the click event?  
		if(item == null)
			setContent(new StockItemDetailPanel(this.getContentId(), null){

				private static final long serialVersionUID = 1L;

				@Override
				void onCancel(AjaxRequestTarget target) {
					StockItemModalWindow.this.onCancel(target);
				}
				@Override
				void onSelect(AjaxRequestTarget target, TZlStoreStockItem item) 		{

					StockItemModalWindow.this.onSelect(target, item);
				}
				@Override
				void onSelect(AjaxRequestTarget target) {
					// TODO Auto-generated method stub
					StockItemModalWindow.this.onSelect(target);
				}
			});
		else  {
			this.getDefaultModel(item);
			setContent(new StockItemDetailPanel(this.getContentId(), item){

				private static final long serialVersionUID = 1L;

				@Override
				void onCancel(AjaxRequestTarget target) {

					StockItemModalWindow.this.onCancel(target);
				}
				@Override
				void onSelect(AjaxRequestTarget target, TZlStoreStockItem item) 		{

					StockItemModalWindow.this.onSelect(target, item);
				}

				@Override
				void onSelect(AjaxRequestTarget target) {
					// TODO Auto-generated method stub
					StockItemModalWindow.this.onSelect(target);
				}
			});
			
		}
	}

	private void getDefaultModel(TZlStoreStockItem item) {
		// TODO Auto-generated method stub

	}

	abstract void onCancel(AjaxRequestTarget target);

	abstract void onSelect(AjaxRequestTarget target, TZlStoreStockItem selection);

	abstract void onSelect(AjaxRequestTarget target);

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getContentId() {
		return contentId;
	}

}
