/**
 * 
 */
package com.hari.soapproj.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.hari.soapproj.pojo.Stock;

/**
 * @author hpopuri
 *
 */
@WebService
public class StockPileService {
	private Map<Long, Stock> currentHoldings = new HashMap<Long,Stock>();
	
	@WebMethod(operationName="holdings")
	public List<Stock> getCurrentHoldings() {
		List<Stock> stocks =  null;
		if(!currentHoldings.isEmpty()) {
			stocks = (List<Stock>) currentHoldings.values();
		}
		
		return stocks;
	}
	
	@WebMethod(operationName="add")
	public String addStock(long stockId, String stockName, float stockPrice, int quantity ,float totalPrice) {
		
		
		if(!currentHoldings.isEmpty() && currentHoldings.containsKey(stockId)) {
			Stock stock = currentHoldings.get(stockId);
			int total = stock.getQuantity()+quantity;
			stock.setQuantity(stock.getQuantity()+quantity);
			stock.setTotalPrice(stock.getTotalPrice()+ totalPrice);
			float avgPrice = stock.getTotalPrice()/total;
			stock.setAvgPrice(avgPrice);
			currentHoldings.put(stockId, stock);
			
		}else {
			Stock s = new Stock();
			s.setId(stockId);
			s.setName(stockName);
			s.setAvgPrice(stockPrice);
			s.setQuantity(quantity);
			s.setTotalPrice(totalPrice);
			currentHoldings.put(stockId, s);
				
		}
		return "Sku added sucessfully";
	}
	
	@WebMethod(operationName="RemoveStock")
	public String remove(long id) {
		currentHoldings.remove(id);
		
		return "Sku removed successfully";
	}
}

