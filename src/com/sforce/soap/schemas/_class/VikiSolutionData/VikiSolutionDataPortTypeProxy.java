package com.sforce.soap.schemas._class.VikiSolutionData;

public class VikiSolutionDataPortTypeProxy implements com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataPortType {
  private String _endpoint = null;
  private com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataPortType vikiSolutionDataPortType = null;
  
  public VikiSolutionDataPortTypeProxy() {
    _initVikiSolutionDataPortTypeProxy();
  }
  
  public VikiSolutionDataPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initVikiSolutionDataPortTypeProxy();
  }
  
  private void _initVikiSolutionDataPortTypeProxy() {
    try {
      vikiSolutionDataPortType = (new com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataServiceLocator()).getVikiSolutionData();
      if (vikiSolutionDataPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)vikiSolutionDataPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)vikiSolutionDataPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (vikiSolutionDataPortType != null)
      ((javax.xml.rpc.Stub)vikiSolutionDataPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataPortType getVikiSolutionDataPortType() {
    if (vikiSolutionDataPortType == null)
      _initVikiSolutionDataPortTypeProxy();
    return vikiSolutionDataPortType;
  }
  
  public void annotationUpdateSFDC(java.lang.String data) throws java.rmi.RemoteException{
    if (vikiSolutionDataPortType == null)
      _initVikiSolutionDataPortTypeProxy();
    vikiSolutionDataPortType.annotationUpdateSFDC(data);
  }
  
  public void proofSessionClosedSFDC(java.lang.String data) throws java.rmi.RemoteException{
    if (vikiSolutionDataPortType == null)
      _initVikiSolutionDataPortTypeProxy();
    vikiSolutionDataPortType.proofSessionClosedSFDC(data);
  }
  
  public void userApprovalUpdateSFDC(java.lang.String data) throws java.rmi.RemoteException{
    if (vikiSolutionDataPortType == null)
      _initVikiSolutionDataPortTypeProxy();
    vikiSolutionDataPortType.userApprovalUpdateSFDC(data);
  }
  
  public void validateUserApprovalSFDC(java.lang.String data) throws java.rmi.RemoteException{
    if (vikiSolutionDataPortType == null)
      _initVikiSolutionDataPortTypeProxy();
    vikiSolutionDataPortType.validateUserApprovalSFDC(data);
  }
  
  
}