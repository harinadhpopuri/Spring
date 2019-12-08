/**
 * StockPileService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hari.soapproj.service;

public interface StockPileService extends java.rmi.Remote {
    public java.lang.String remove(long id) throws java.rmi.RemoteException;
    public java.lang.String addStock(long stockId, java.lang.String stockName, float stockPrice, int quantity, float totalPrice) throws java.rmi.RemoteException;
    public java.lang.String getCurrentHoldings() throws java.rmi.RemoteException;
}
