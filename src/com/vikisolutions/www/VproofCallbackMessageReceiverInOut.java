
/**
 * VproofCallbackMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.vikisolutions.www;

        /**
        *  VproofCallbackMessageReceiverInOut message receiver
        */

        public class VproofCallbackMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        VproofCallbackSkeleton skel = (VproofCallbackSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("userApprovalUpdate".equals(methodName)){
                
                com.vikisolutions.www.UserApprovalUpdateResponse userApprovalUpdateResponse1 = null;
	                        com.vikisolutions.www.UserApprovalUpdate wrappedParam =
                                                             (com.vikisolutions.www.UserApprovalUpdate)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.vikisolutions.www.UserApprovalUpdate.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               userApprovalUpdateResponse1 =
                                                   
                                                   
                                                         skel.userApprovalUpdate(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), userApprovalUpdateResponse1, false, new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                    "userApprovalUpdate"));
                                    } else 

            if("validateUserApproval".equals(methodName)){
                
                com.vikisolutions.www.ValidateUserApprovalResponse validateUserApprovalResponse3 = null;
	                        com.vikisolutions.www.ValidateUserApproval wrappedParam =
                                                             (com.vikisolutions.www.ValidateUserApproval)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.vikisolutions.www.ValidateUserApproval.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validateUserApprovalResponse3 =
                                                   
                                                   
                                                         skel.validateUserApproval(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validateUserApprovalResponse3, false, new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                    "validateUserApproval"));
                                    } else 

            if("proofSessionClosed".equals(methodName)){
                
                com.vikisolutions.www.ProofSessionClosedResponse proofSessionClosedResponse5 = null;
	                        com.vikisolutions.www.ProofSessionClosed wrappedParam =
                                                             (com.vikisolutions.www.ProofSessionClosed)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.vikisolutions.www.ProofSessionClosed.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               proofSessionClosedResponse5 =
                                                   
                                                   
                                                         skel.proofSessionClosed(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), proofSessionClosedResponse5, false, new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                    "proofSessionClosed"));
                                    } else 

            if("annotationUpdate".equals(methodName)){
                
                com.vikisolutions.www.AnnotationUpdateResponse annotationUpdateResponse7 = null;
	                        com.vikisolutions.www.AnnotationUpdate wrappedParam =
                                                             (com.vikisolutions.www.AnnotationUpdate)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.vikisolutions.www.AnnotationUpdate.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               annotationUpdateResponse7 =
                                                   
                                                   
                                                         skel.annotationUpdate(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), annotationUpdateResponse7, false, new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                    "annotationUpdate"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.vikisolutions.www.UserApprovalUpdate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.vikisolutions.www.UserApprovalUpdate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.vikisolutions.www.UserApprovalUpdateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.vikisolutions.www.UserApprovalUpdateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.vikisolutions.www.ValidateUserApproval param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.vikisolutions.www.ValidateUserApproval.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.vikisolutions.www.ValidateUserApprovalResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.vikisolutions.www.ValidateUserApprovalResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.vikisolutions.www.ProofSessionClosed param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.vikisolutions.www.ProofSessionClosed.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.vikisolutions.www.ProofSessionClosedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.vikisolutions.www.ProofSessionClosedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.vikisolutions.www.AnnotationUpdate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.vikisolutions.www.AnnotationUpdate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.vikisolutions.www.AnnotationUpdateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.vikisolutions.www.AnnotationUpdateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.vikisolutions.www.UserApprovalUpdateResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.vikisolutions.www.UserApprovalUpdateResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.vikisolutions.www.UserApprovalUpdateResponse wrapUserApprovalUpdate(){
                                com.vikisolutions.www.UserApprovalUpdateResponse wrappedElement = new com.vikisolutions.www.UserApprovalUpdateResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.vikisolutions.www.ValidateUserApprovalResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.vikisolutions.www.ValidateUserApprovalResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.vikisolutions.www.ValidateUserApprovalResponse wrapValidateUserApproval(){
                                com.vikisolutions.www.ValidateUserApprovalResponse wrappedElement = new com.vikisolutions.www.ValidateUserApprovalResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.vikisolutions.www.ProofSessionClosedResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.vikisolutions.www.ProofSessionClosedResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.vikisolutions.www.ProofSessionClosedResponse wrapProofSessionClosed(){
                                com.vikisolutions.www.ProofSessionClosedResponse wrappedElement = new com.vikisolutions.www.ProofSessionClosedResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.vikisolutions.www.AnnotationUpdateResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.vikisolutions.www.AnnotationUpdateResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.vikisolutions.www.AnnotationUpdateResponse wrapAnnotationUpdate(){
                                com.vikisolutions.www.AnnotationUpdateResponse wrappedElement = new com.vikisolutions.www.AnnotationUpdateResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.vikisolutions.www.UserApprovalUpdate.class.equals(type)){
                
                           return com.vikisolutions.www.UserApprovalUpdate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.vikisolutions.www.UserApprovalUpdateResponse.class.equals(type)){
                
                           return com.vikisolutions.www.UserApprovalUpdateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.vikisolutions.www.ValidateUserApproval.class.equals(type)){
                
                           return com.vikisolutions.www.ValidateUserApproval.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.vikisolutions.www.ValidateUserApprovalResponse.class.equals(type)){
                
                           return com.vikisolutions.www.ValidateUserApprovalResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.vikisolutions.www.ProofSessionClosed.class.equals(type)){
                
                           return com.vikisolutions.www.ProofSessionClosed.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.vikisolutions.www.ProofSessionClosedResponse.class.equals(type)){
                
                           return com.vikisolutions.www.ProofSessionClosedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.vikisolutions.www.AnnotationUpdate.class.equals(type)){
                
                           return com.vikisolutions.www.AnnotationUpdate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.vikisolutions.www.AnnotationUpdateResponse.class.equals(type)){
                
                           return com.vikisolutions.www.AnnotationUpdateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    