package org.holtz.eve.view.customer;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;
import org.holtz.eve.jpa.entity.S01CuCust;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Base page for component demo pages.
 * 
 * @author ronh
 */
public abstract class CustomerBasePage extends WebPage
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private S01CuCust selected;
	private S01CuCust editSelected;
//	public ModalWindow editModal;
	private static final Logger log = LoggerFactory.getLogger(CustomerBasePage.class);


	/**
	 * Constructor
	 */
	public CustomerBasePage() {
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
			return selected.getCuCustID() + " " + selected.getCuFirstNameTx() 
					+ " " + selected.getCuLastNameTx() + " " 
					+ selected.getCuCustNumberTx_N();
		}
	}

//	public S01CuCust getEditSelectedItem() {
//		editSelected = new S01CuCust();
//
//		//   	String currentSelected = getSelectedItem(); 
//
//		// Need to get the S01CuCust object.  In order to use Spring Context/Security
//		// This will need to be setup to use the Rest Controller.
//		//		StockItemRestController ssic = new StockItemRestController();
//		StoreStockItemDAO sid = new StoreStockItemDAOImpl();
//		int id = getSelected().getId().getZlStockItemId();
//		editSelected = sid.getStoreStockItemById(id);
//		return editSelected;
//	}
	public class ActionPanel extends Panel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * @param id
		 *            component id
		 * @param model
		 *            model for contact
		 */
		public ActionPanel(String id, IModel<S01CuCust> model) {
			super(id, model);

			add(new Link("select") {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public void onClick()
				{
					selected = (S01CuCust)getParent().getDefaultModelObject();
					
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
					//TODO open a new page to allow the entry of a new Customer which can double for the edit screen
					// 
					//selected = (S01CuCust)getParent().getDefaultModelObject();
					
				}


			});
//			add(new AjaxLink("edit") {
//				/**
//				 * 
//				 */
//				private static final long serialVersionUID = 1L;
//
//				public void onClick(AjaxRequestTarget target) {
//					selected = (S01CuCust)getParent().getDefaultModelObject();
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
//						void onSelect(AjaxRequestTarget target, S01CuCust selection) {
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
	public S01CuCust getSelected() {
		return selected;
	}

	/**
	 * sets selected contact
	 * 
	 * @param selected
	 */
	public void setSelected(S01CuCust selected) {
		addStateChange();
		this.selected = selected;
	}

	public S01CuCust getEditSelected() {
		//Get the selected S01SistockItem based on the S01CuCustId

		return editSelected;
	}

	public void setEditSelected(S01CuCust editSelected) {
		addStateChange();
		//Call to Modal window?
		this.editSelected = editSelected;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
