package org.holtz.eve.view;


import java.util.List;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.response.filter.EmptySrcAttributeCheckFilter;
import org.apache.wicket.response.filter.ServerAndClientTimeFilter;
import org.apache.wicket.settings.RequestCycleSettings;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.holtz.eve.jpa.entity.S01CuCust;
import org.holtz.eve.jpa.entity.S01InInvoice;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.view.customer.CustomerDatabase;
import org.holtz.eve.view.invoice.InvoiceDatabase;
import org.holtz.eve.view.stockitemSearch.StockItemDatabase;

public class EveApplication extends WebApplication {

	
	private StockItemDatabase stockItemDB = null;
	private CustomerDatabase custItemDB = null;
	private InvoiceDatabase invItemDB = null;
	@Override
	public Class<? extends Page> getHomePage() {

		return Index.class;
		//return StockItemSearchDataTablePage.class; // return default page
	}
	
	@Override
	protected void init() {
		
		super.init();
	//	getResourceSettings().setResourceStreamLocator(new WebResourceStreamLocator()); 
		getDebugSettings().setDevelopmentUtilitiesEnabled(true);
		 getDebugSettings().setOutputMarkupContainerClassName(true);
		 getRequestCycleSettings().addResponseFilter(new ServerAndClientTimeFilter());
		 getMarkupSettings().setStripWicketTags(false);
		 getComponentInstantiationListeners().add(new SpringComponentInjector(this));
		 RequestCycleSettings rcsRequestCycleSettings = getRequestCycleSettings();
		 rcsRequestCycleSettings.addResponseFilter(new EmptySrcAttributeCheckFilter());
		 getRequestCycleSettings().setRenderStrategy(RequestCycleSettings.RenderStrategy.ONE_PASS_RENDER);
	}
	
	public StockItemDatabase getStockItemDB(List<S01StockItemSearch> list)
	{
	   return stockItemDB = new StockItemDatabase(list);
	}
	public CustomerDatabase getCustItemDB(List<S01CuCust> list)
	{
	   return custItemDB = new CustomerDatabase(list);
	}
	public InvoiceDatabase getInvoiceDB(List<S01InInvoice> list)
	{
	   return invItemDB = new InvoiceDatabase(list);
	}
}