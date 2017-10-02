package org.holtz.eve.view.stockitemSearch;

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
import org.holtz.eve.jpa.dao.TZlStoreStockItemDAO;
import org.holtz.eve.jpa.dao.impl.StockItemDAOImpl;
import org.holtz.eve.jpa.dao.impl.StoreStockItemDAOImpl;
import org.holtz.eve.jpa.dao.impl.TZlStoreStockItemDAOImpl;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Base page for component demo pages.
 * 
 * @author ronh
 */
public abstract class StockItemBasePage extends WebPage
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private S01StockItemSearch selected;
	private TZlStoreStockItem editSelected;
	public ModalWindow editModal;
	private static final Logger log = LoggerFactory.getLogger(StockItemBasePage.class);


	/**
	 * Constructor
	 */
	public StockItemBasePage() {
//		add(new Label("currentUser", new PropertyModel<>(this, "session.user")));
		add(new Label("selectedLabel", new PropertyModel<>(this, "selectedItem")));
		add(new Label("editSelectedLabel", new PropertyModel<>(this, "editSelected")));
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
			return selected.getSIStockItemID() + " " + selected.getSIStockItemTx();
		}
	}

	public TZlStoreStockItem getEditSelectedItem() {
		editSelected = new TZlStoreStockItem();

		//   	String currentSelected = getSelectedItem(); 

		// Need to get the TZlStoreStockItem object.  In order to use Spring Context/Security
		// This will need to be setup to use the Rest Controller.
		//		StockItemRestController ssic = new StockItemRestController();
		TZlStoreStockItemDAO sid = new TZlStoreStockItemDAOImpl();
		int id = getSelected().getZlStockItemID();
		editSelected = sid.getStockItemById(id);
		return editSelected;
	}
	public class ActionPanel extends Panel {
		/**
		 * @param id
		 *            component id
		 * @param model
		 *            model for contact
		 */
		public ActionPanel(String id, IModel<S01StockItemSearch> model) {
			super(id, model);

			add(new Link("select") {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public void onClick()
				{
					selected = (S01StockItemSearch)getParent().getDefaultModelObject();
					
				}


			});
			add(new AjaxLink("edit") {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public void onClick(AjaxRequestTarget target) {
					selected = (S01StockItemSearch)getParent().getDefaultModelObject();
					// This needs to be passed to modal window 
					getEditSelectedItem();
					Session session = editModal.getWebSession();
					session.setAttribute("modalContent", editSelected);
					StockItemDetailPanel newDetail;
					newDetail = new StockItemDetailPanel(editModal.getContentId(), editSelected) {

						@Override
						void onCancel(AjaxRequestTarget target) {
							// TODO Auto-generated method stub
							
						}

						@Override
						void onSelect(AjaxRequestTarget target, TZlStoreStockItem selection) {
							// TODO Auto-generated method stub
							
						}

						@Override
						void onSelect(AjaxRequestTarget target) {
							// TODO Auto-generated method stub
							
						}
					
						
					};
//					target.appendJavaScript(javascript);
					editModal.setOutputMarkupId(true);
					editModal.setContent(newDetail);
					editModal.show(target);

				}

			});


		}
	}

	/**
	 * @return selected contact
	 */
	public S01StockItemSearch getSelected() {
		return selected;
	}

	/**
	 * sets selected contact
	 * 
	 * @param selected
	 */
	public void setSelected(S01StockItemSearch selected) {
		addStateChange();
		this.selected = selected;
	}

	public TZlStoreStockItem getEditSelected() {
		//Get the selected S01SistockItem based on the S01StockItemSearchId

		return editSelected;
	}

	public void setEditSelected(TZlStoreStockItem editSelected) {
		addStateChange();
		
		this.editSelected = editSelected;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
