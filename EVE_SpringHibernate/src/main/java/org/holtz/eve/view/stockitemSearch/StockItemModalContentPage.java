package org.holtz.eve.view.stockitemSearch;

import org.apache.wicket.PageReference;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class StockItemModalContentPage extends WebPage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StockItemModalContentPage(final PageReference modalWindowPage, final ModalWindow window) {
		
//		String passValue = ((StockItemSearchDataTablePage) modalWindowPage.getPage()).getEditModal().getMarkupId();
//		final Label modalPage = new Label("modalPage", new Model<>(""));
//		modalPage.setOutputMarkupId(true);
//        add(modalPage);

	}

	public StockItemModalContentPage(IModel<?> model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	public StockItemModalContentPage(PageParameters parameters) {
		super(parameters);
		// TODO Auto-generated constructor stub
	}

}
