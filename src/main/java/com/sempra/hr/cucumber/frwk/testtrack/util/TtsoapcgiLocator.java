/**
 * TtsoapcgiLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class TtsoapcgiLocator extends org.apache.axis.client.Service implements com.sempra.hr.cucumber.frwk.testtrack.util.Ttsoapcgi {

/**
 * Returns ttstudio and http hyperlinks for a specified item.
 */

    public TtsoapcgiLocator() {
    }


    public TtsoapcgiLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TtsoapcgiLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ttsoapcgi
    private java.lang.String ttsoapcgi_address = "http://sempra.seapine.net:443/Scripts/ttsoapcgi.exe";

    public java.lang.String getttsoapcgiAddress() {
        return ttsoapcgi_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ttsoapcgiWSDDServiceName = "ttsoapcgi";

    public java.lang.String getttsoapcgiWSDDServiceName() {
        return ttsoapcgiWSDDServiceName;
    }

    public void setttsoapcgiWSDDServiceName(java.lang.String name) {
        ttsoapcgiWSDDServiceName = name;
    }

    public com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiPortType getttsoapcgi() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ttsoapcgi_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getttsoapcgi(endpoint);
    }

    public com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiPortType getttsoapcgi(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiStub _stub = new com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiStub(portAddress, this);
            _stub.setPortName(getttsoapcgiWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setttsoapcgiEndpointAddress(java.lang.String address) {
        ttsoapcgi_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiStub _stub = new com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiStub(new java.net.URL(ttsoapcgi_address), this);
                _stub.setPortName(getttsoapcgiWSDDServiceName());
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
        if ("ttsoapcgi".equals(inputPortName)) {
            return getttsoapcgi();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:testtrack-interface", "ttsoapcgi");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:testtrack-interface", "ttsoapcgi"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ttsoapcgi".equals(portName)) {
            setttsoapcgiEndpointAddress(address);
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
