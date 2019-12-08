/**
 * StockPileServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hari.soapproj.service;

public class StockPileServiceServiceLocator extends org.apache.axis.client.Service implements com.hari.soapproj.service.StockPileServiceService {

    public StockPileServiceServiceLocator() {
    }


    public StockPileServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StockPileServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StockPileService
    private java.lang.String StockPileService_address = "http://localhost:8080/soap-ws-jaxws/services/StockPileService";

    public java.lang.String getStockPileServiceAddress() {
        return StockPileService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StockPileServiceWSDDServiceName = "StockPileService";

    public java.lang.String getStockPileServiceWSDDServiceName() {
        return StockPileServiceWSDDServiceName;
    }

    public void setStockPileServiceWSDDServiceName(java.lang.String name) {
        StockPileServiceWSDDServiceName = name;
    }

    public com.hari.soapproj.service.StockPileService getStockPileService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StockPileService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStockPileService(endpoint);
    }

    public com.hari.soapproj.service.StockPileService getStockPileService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hari.soapproj.service.StockPileServiceSoapBindingStub _stub = new com.hari.soapproj.service.StockPileServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getStockPileServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStockPileServiceEndpointAddress(java.lang.String address) {
        StockPileService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hari.soapproj.service.StockPileService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hari.soapproj.service.StockPileServiceSoapBindingStub _stub = new com.hari.soapproj.service.StockPileServiceSoapBindingStub(new java.net.URL(StockPileService_address), this);
                _stub.setPortName(getStockPileServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StockPileService".equals(inputPortName)) {
            return getStockPileService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.soapproj.hari.com", "StockPileServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.soapproj.hari.com", "StockPileService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StockPileService".equals(portName)) {
            setStockPileServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
