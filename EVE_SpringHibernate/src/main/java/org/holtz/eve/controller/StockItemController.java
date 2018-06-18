package org.holtz.eve.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.holtz.eve.jpa.dao.StockItemDAO;
import org.holtz.eve.jpa.dao.impl.StockItemDAOImpl;
import org.holtz.eve.jpa.dao.impl.StoreStockItemDAOImpl;
import org.holtz.eve.jpa.entity.S01SistockItem;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.TSistockItem;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/stockItem")

public class StockItemController {

	private StockItemDAO stockItemDAO;
	private StoreStockItemDAOImpl storeStockItemDAO;
	private S01SistockItem stockItem;
	private Map<String, S01SistockItem> stockItemMap;
	private Map<String, List<S01StockItemSearch>> stockItemSearchListMap;
	private List<S01StockItemSearch> stockItemList;
	@Autowired
	
	public StoreStockItemDAOImpl getStoreStockItemDAO() {
		return storeStockItemDAO;
	}

	public void setStoreStockItemDAO(StoreStockItemDAOImpl storeStockItemDAO) {
		this.storeStockItemDAO = storeStockItemDAO;
	}

	public ModelAndView save(HttpServletRequest request, HttpServletResponse response, TSistockItem stockItem)
			throws Exception {
		stockItemDAO.saveStockItem(stockItem);
		return new ModelAndView("redirect:list.htm");
	}

	public ModelAndView stockItemSearch(HttpServletRequest request, HttpServletResponse response,
			TZlStoreStockItem storeStockItem) {
		return new ModelAndView("redirect:list.htm");
	}

	@RequestMapping("/jsp/stockItem/*")
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelMap modelMap = new ModelMap();
		storeStockItemDAO = new StoreStockItemDAOImpl();
		modelMap.addAttribute("stockItem", new S01StockItemSearch());
		modelMap.addAttribute("storeStockItemList", storeStockItemDAO.listAllStoreStockItem());
		return new ModelAndView("stockItem/stockItem", modelMap);
	}

	
	@RequestMapping("/getStockItem/{stockItemId}")
	public Map<String, S01SistockItem> getStockItemById(@PathVariable int stockItemId) {
		stockItemDAO = new StockItemDAOImpl();
		stockItemMap = new HashMap<String, S01SistockItem>();
		stockItem = (S01SistockItem) stockItemDAO.getStockItemById(stockItemId);
		stockItemMap.put("stockItem" + Integer.toString(stockItemId), stockItem);
		return stockItemMap;
	}


	@RequestMapping("/getStockItemSearchList")
	public Map<String, List<S01StockItemSearch>> getStockItemSearchList() {
		stockItemSearchListMap = new HashMap<String, List<S01StockItemSearch>>();
		stockItemList = stockItemDAO.getStockItemList();
		//Always do this to remove null elements in the array list
		stockItemList.removeAll(Collections.singleton(null));
		return stockItemSearchListMap;
	}

	public StockItemDAO getStockItemDAO() {
		return stockItemDAO;
	}

	public void setStockItemDAO(StockItemDAO stockItemDAO) {
		this.stockItemDAO = stockItemDAO;
	}

}
