package org.holtz.eve.controller;

import java.util.ArrayList;
import java.util.Collection;
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
import org.holtz.eve.jpa.entity.S01SistockItem;
import org.holtz.eve.jpa.entity.S01SistockItem;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.TSistockItem;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping("/rest/stockItem")


public class StockItemRestController extends MultiActionController {
	private StockItemDAO stockItemDAO;
	private StoreStockItemDAOImpl storeStockItemDAO;
	private TZlStoreStockItem storeStockItem;
	private S01SistockItem stockItem;
	private List<S01SistockItem> sisList;
	private List<S01StockItemSearch> stockItemList;
	private Map stockItemMap;

	@Autowired
	//@RequestMapping(value = "/stockItemList", method = RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public StoreStockItemDAOImpl getStoreStockItemDAO() {
		return storeStockItemDAO;
	}

	public void setStoreStockItemDAO(StoreStockItemDAOImpl storeStockItemDAO) {
		this.storeStockItemDAO = storeStockItemDAO;
	}

	public ModelAndView save(HttpServletRequest request,
			HttpServletResponse response, TSistockItem stockItem) throws Exception {
		stockItemDAO.saveStockItem(stockItem);
		return new ModelAndView("redirect:list.htm");
	}

	public ModelAndView stockItemSearch(HttpServletRequest request,
			HttpServletResponse response, TZlStoreStockItem storeStockItem) {
		return new ModelAndView("redirect:list.htm");
	}

	@RequestMapping(value="/list", method=RequestMethod.GET, produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public List<S01StockItemSearch> list() throws Exception {

		storeStockItemDAO = new StoreStockItemDAOImpl();
		stockItemList = storeStockItemDAO.listAllStoreStockItem();
		stockItemList.removeAll(Collections.singleton(null));
		return stockItemList;
	}

	@RequestMapping(value="/getStoreStockItem/{stockItemId}", method=RequestMethod.GET, produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE} )
	public TZlStoreStockItem getStoreStockItemById(@PathVariable int stockItemId) {
		storeStockItemDAO = new StoreStockItemDAOImpl();
		storeStockItem = storeStockItemDAO.getStoreStockItemById(stockItemId);

		return storeStockItem;

	}

	@RequestMapping(value = "/getMapStockItemById/{stockItemId}", method=RequestMethod.GET)
	public Map<String, S01SistockItem> getMapStockItemById(@PathVariable int stockItemId) {
		stockItemDAO = new StockItemDAOImpl();
		Map<String, S01SistockItem> stockItemMap = new HashMap<String, S01SistockItem>();

		sisList = stockItemDAO.getStockItemById(stockItemId);
		String key = "stockItem" + Integer.toString(stockItemId);
		stockItemMap.put(key, stockItem);
		return stockItemMap;
	}
	
	@RequestMapping(value = "/getStockItemById/{stockItemId}", method=RequestMethod.GET, produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public List<S01SistockItem> getStockItemById(@PathVariable int stockItemId) {
		stockItemDAO = new StockItemDAOImpl();
//		Map<String, S01SistockItem> stockItemMap = new HashMap<String, S01SistockItem>();

		sisList = stockItemDAO.getStockItemById(stockItemId);
		List<S01SistockItem> stockItemList = new ArrayList<S01SistockItem>();
//		stockItemList.add(stockItem);
		//		String key = "stockItem" + Integer.toString(stockItemId);
		//stockItemMap.put(key, stockItem);
		return sisList;
	}

	public StockItemDAO getStockItemDAO() {
		return stockItemDAO;
	}

	public void setStockItemDAO(StockItemDAO stockItemDAO) {
		this.stockItemDAO = stockItemDAO;
	}

	public TZlStoreStockItem getStoreStockItem() {
		return storeStockItem;
	}

	public void setStoreStockItem(TZlStoreStockItem storeStockItem) {
		this.storeStockItem = storeStockItem;
	}

	public S01SistockItem getStockItem() {
		return stockItem;
	}

	public void setStockItem(S01SistockItem stockItem) {
		this.stockItem = stockItem;
	}

	@JacksonXmlProperty(localName = "stockItemList")
	public List<S01StockItemSearch> getStockItemList() {
		return stockItemList;
	}

	public void setStockItemList(List<S01StockItemSearch> stockItemList) {
		this.stockItemList = stockItemList;
	}

	public Map<?, ?> getStockItemMap() {
		return stockItemMap;
	}

	public void setStockItemMap(Map<?, ?> stockItemMap) {
		this.stockItemMap = stockItemMap;
	}


}
