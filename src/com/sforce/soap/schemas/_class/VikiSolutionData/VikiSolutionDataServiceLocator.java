/**
 * VikiSolutionDataServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.schemas._class.VikiSolutionData;

public class VikiSolutionDataServiceLocator extends org.apache.axis.client.Service implements com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataService {

    public VikiSolutionDataServiceLocator() {
    }


    public VikiSolutionDataServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VikiSolutionDataServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VikiSolutionData
    private java.lang.String VikiSolutionData_address = "https://ap2.salesforce.com/services/Soap/class/VikiSolutionData";

    public java.lang.String getVikiSolutionDataAddress() {
        return VikiSolutionData_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VikiSolutionDataWSDDServiceName = "VikiSolutionData";

    public java.lang.String getVikiSolutionDataWSDDServiceName() {
        return VikiSolutionDataWSDDServiceName;
    }

    public void setVikiSolutionDataWSDDServiceName(java.lang.String name) {
        VikiSolutionDataWSDDServiceName = name;
    }

    public com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataPortType getVikiSolutionData() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VikiSolutionData_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVikiSolutionData(endpoint);
    }

    public com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataPortType getVikiSolutionData(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataBindingStub _stub = new com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataBindingStub(portAddress, this);
            _stub.setPortName(getVikiSolutionDataWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVikiSolutionDataEndpointAddress(java.lang.String address) {
        VikiSolutionData_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataBindingStub _stub = new com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataBindingStub(new java.net.URL(VikiSolutionData_address), this);
                _stub.setPortName(getVikiSolutionDataWSDDServiceName());
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
        if ("VikiSolutionData".equals(inputPortName)) {
            return getVikiSolutionData();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.sforce.com/schemas/class/VikiSolutionData", "VikiSolutionDataService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.sforce.com/schemas/class/VikiSolutionData", "VikiSolutionData"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VikiSolutionData".equals(portName)) {
            setVikiSolutionDataEndpointAddress(address);
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
