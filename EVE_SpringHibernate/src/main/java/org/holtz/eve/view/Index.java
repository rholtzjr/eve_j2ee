package org.holtz.eve.view;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.view.stockitemSearch.StockItemSearchDataTablePage;

public class Index extends WebPage {
//	private S01StockItemSearch stockItemSearch;
	public Index() {
        add(new Link("stockItemSearchLink")
        {
            @Override
            public void onClick()
            {
                setResponsePage(new StockItemSearchDataTablePage());
            }
        });
	}
	public Index(IModel<?> model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	public Index(PageParameters parameters) {
		super(parameters);
		// TODO Auto-generated constructor stub
	}

}
