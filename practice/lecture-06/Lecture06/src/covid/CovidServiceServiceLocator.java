/**
 * CovidServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package covid;

public class CovidServiceServiceLocator extends org.apache.axis.client.Service implements covid.CovidServiceService {

    public CovidServiceServiceLocator() {
    }


    public CovidServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CovidServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CovidServicePort
    private java.lang.String CovidServicePort_address = "http://localhost:8080/mariami_chakhvadze_war_exploded/covid";

    public java.lang.String getCovidServicePortAddress() {
        return CovidServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CovidServicePortWSDDServiceName = "CovidServicePort";

    public java.lang.String getCovidServicePortWSDDServiceName() {
        return CovidServicePortWSDDServiceName;
    }

    public void setCovidServicePortWSDDServiceName(java.lang.String name) {
        CovidServicePortWSDDServiceName = name;
    }

    public covid.CovidService getCovidServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CovidServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCovidServicePort(endpoint);
    }

    public covid.CovidService getCovidServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            covid.CovidServicePortBindingStub _stub = new covid.CovidServicePortBindingStub(portAddress, this);
            _stub.setPortName(getCovidServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCovidServicePortEndpointAddress(java.lang.String address) {
        CovidServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (covid.CovidService.class.isAssignableFrom(serviceEndpointInterface)) {
                covid.CovidServicePortBindingStub _stub = new covid.CovidServicePortBindingStub(new java.net.URL(CovidServicePort_address), this);
                _stub.setPortName(getCovidServicePortWSDDServiceName());
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
        if ("CovidServicePort".equals(inputPortName)) {
            return getCovidServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "CovidServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "CovidServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CovidServicePort".equals(portName)) {
            setCovidServicePortEndpointAddress(address);
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
