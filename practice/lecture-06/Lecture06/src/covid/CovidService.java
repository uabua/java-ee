/**
 * CovidService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package covid;

public interface CovidService extends java.rmi.Remote {
    public covid.Covid[] getStatistic() throws java.rmi.RemoteException;
    public covid.Covid getCountryStatistic(java.lang.String arg0) throws java.rmi.RemoteException;
    public int getTotalConfirmed() throws java.rmi.RemoteException;
    public int getTotalDeath() throws java.rmi.RemoteException;
    public int getTotalRecovery() throws java.rmi.RemoteException;
}
