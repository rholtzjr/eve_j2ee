package org.holtz.eve.view.stockitem;


import java.util.List;

import org.apache.wicket.Application;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.response.filter.EmptySrcAttributeCheckFilter;
import org.apache.wicket.response.filter.ServerAndClientTimeFilter;
import org.apache.wicket.settings.RequestCycleSettings;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.holtz.eve.jpa.entity.S01StockItemSearch;

public class StockItemApplication extends WebApplication {

	
	private StockItemDatabase stockItemDB = null;
	@Override
	public Class<? extends Page> getHomePage() {

		return DataTablePage.class; // return default page
	}
	
	@Override
	protected void init() {
		
		super.init();
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
}