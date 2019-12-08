package com.hari.soapproj.service;

public class StockPileServiceProxy implements com.hari.soapproj.service.StockPileService {
  private String _endpoint = null;
  private com.hari.soapproj.service.StockPileService stockPileService = null;
  
  public StockPileServiceProxy() {
    _initStockPileServiceProxy();
  }
  
  public StockPileServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initStockPileServiceProxy();
  }
  
  private void _initStockPileServiceProxy() {
    try {
      stockPileService = (new com.hari.soapproj.service.StockPileServiceServiceLocator()).getStockPileService();
      if (stockPileService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stockPileService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stockPileService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stockPileService != null)
      ((javax.xml.rpc.Stub)stockPileService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hari.soapproj.service.StockPileService getStockPileService() {
    if (stockPileService == null)
      _initStockPileServiceProxy();
    return stockPileService;
  }
  
  public java.lang.String remove(long id) throws java.rmi.RemoteException{
    if (stockPileService == null)
      _initStockPileServiceProxy();
    return stockPileService.remove(id);
  }
  
  public java.lang.String addStock(long stockId, java.lang.String stockName, float stockPrice, int quantity, float totalPrice) throws java.rmi.RemoteException{
    if (stockPileService == null)
      _initStockPileServiceProxy();
    return stockPileService.addStock(stockId, stockName, stockPrice, quantity, totalPrice);
  }
  
  public java.lang.String getCurrentHoldings() throws java.rmi.RemoteException{
    if (stockPileService == null)
      _initStockPileServiceProxy();
    return stockPileService.getCurrentHoldings();
  }
  
  
}