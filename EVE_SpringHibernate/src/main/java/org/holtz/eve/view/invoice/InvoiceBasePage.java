package org.holtz.eve.view.invoice;

import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.core.util.resource.locator.ResourceStreamLocator;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.holtz.eve.controller.StockItemRestController;
import org.holtz.eve.jpa.dao.StockItemDAO;
import org.holtz.eve.jpa.dao.StoreStockItemDAO;
import org.holtz.eve.jpa.dao.impl.StockItemDAOImpl;
import org.holtz.eve.jpa.dao.impl.StoreStockItemDAOImpl;
import org.holtz.eve.jpa.entity.S01InInvoice;
import org.holtz.eve.jpa.entity.S01InInvoice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Base page for component demo pages.
 * 
 * @author ronh
 */
public abstract class InvoiceBasePage extends WebPage
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private S01InInvoice selected;
	private S01InInvoice editSelected;
//	public ModalWindow editModal;
	private static final Logger log = LoggerFactory.getLogger(InvoiceBasePage.class);


	/**
	 * Constructor
	 */
	public InvoiceBasePage() {
//		add(new Label("currentUser", new PropertyModel<>(this, "session.user")));
		add(new Label("selectedLabel", new PropertyModel<>(this, "selectedItem")));
//		add(new Label("editSelectedLabel", new PropertyModel<>(this, "editSelected")));
		add(new FeedbackPanel("feedback"));

	}

	/**
	 * @return string representation of selected stock item property
	 */
	public String getSelectedItem() {
		if (selected == null)
		{
			return "No Item Selected";
		}
		else
		{
			return selected.getInInvoiceID() + " " + selected.getInInvoiceNumberTx_N() 
					+ " " + selected.getInCreationDate() + " " 
					+ selected.getInCustID();
		}
	}

//	public S01InInvoice getEditSelectedItem() {
//		editSelected = new S01InInvoice();
//
//		//   	String currentSelected = getSelectedItem(); 
//
//		// Need to get the S01InInvoice object.  In order to use Spring Context/Security
//		// This will need to be setup to use the Rest Controller.
//		//		StockItemRestController ssic = new StockItemRestController();
//		StoreStockItemDAO sid = new StoreStockItemDAOImpl();
//		int id = getSelected().getId().getZlStockItemId();
//		editSelected = sid.getStoreStockItemById(id);
//		return editSelected;
//	}
	public class ActionPanel extends Panel {
		/**
		 * @param id
		 *            component id
		 * @param model
		 *            model for contact
		 */
		public ActionPanel(String id, IModel<S01InInvoice> model) {
			super(id, model);

			add(new Link("select") {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public void onClick()
				{
					selected = (S01InInvoice)getParent().getDefaultModelObject();
					
				}


			});
			add(new Link("new") {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public void onClick()
				{
					//TODO open a new page to allow the entry of a new Invoice which can double for the edit screen
					// 
					//selected = (S01InInvoice)getParent().getDefaultModelObject();
					
				}


			});
//			add(new AjaxLink("edit") {
//				/**
//				 * 
//				 */
//				private static final long serialVersionUID = 1L;
//
//				public void onClick(AjaxRequestTarget target) {
//					selected = (S01InInvoice)getParent().getDefaultModelObject();
//					// This needs to be passed to modal window 
//					getEditSelectedItem();
//					Session session = editModal.getWebSession();
//					session.setAttribute("modalContent", editSelected);
//					StockItemDetailPanel newDetail;
//					newDetail = new StockItemDetailPanel(editModal.getContentId(), editSelected) {
//
//						@Override
//						void onCancel(AjaxRequestTarget target) {
//							// TODO Auto-generated method stub
//							
//						}
//
//						@Override
//						void onSelect(AjaxRequestTarget target, S01InInvoice selection) {
//							// TODO Auto-generated method stub
//							
//						}
//
//						@Override
//						void onSelect(AjaxRequestTarget target) {
//							// TODO Auto-generated method stub
//							
//						}
//					
//						
//					};
////					target.appendJavaScript(javascript);
//					editModal.setOutputMarkupId(true);
//					editModal.setContent(newDetail);
//					editModal.show(target);
//
//				}
//
//			});


		}
	}

	/**
	 * @return selected contact
	 */
	public S01InInvoice getSelected() {
		return selected;
	}

	/**
	 * sets selected contact
	 * 
	 * @param selected
	 */
	public void setSelected(S01InInvoice selected) {
		addStateChange();
		this.selected = selected;
	}

	public S01InInvoice getEditSelected() {
		//Get the selected S01SistockItem based on the S01InInvoiceId

		return editSelected;
	}

	public void setEditSelected(S01InInvoice editSelected) {
		addStateChange();
		//Call to Modal window?
		this.editSelected = editSelected;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
