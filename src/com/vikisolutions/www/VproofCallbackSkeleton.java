/**
 * VproofCallbackSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.vikisolutions.www;

import java.net.URL;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.sforce.soap.partner.LoginResult;
import com.sforce.soap.partner.SessionHeader;
import com.sforce.soap.partner.SforceServiceLocator;
import com.sforce.soap.partner.SoapBindingStub;
import com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataBindingStub;
import com.sforce.soap.schemas._class.VikiSolutionData.VikiSolutionDataServiceLocator;;

/**
 * VproofCallbackSkeleton java skeleton for the axisService
 */
public class VproofCallbackSkeleton {

	Logger LOG = Logger.getLogger(VproofCallbackSkeleton.class);
	/**
	 * Auto generated method signature
	 * 
	 * @param userApprovalUpdate
	 * @return userApprovalUpdateResponse
	 */

	@SuppressWarnings("unchecked")
	public com.vikisolutions.www.UserApprovalUpdateResponse userApprovalUpdate(com.vikisolutions.www.UserApprovalUpdate userApprovalUpdate) {
		
		System.out.println("method userApprovalUpdate called");
		
		 LOG.error("Inside UserApprovalUpdate");
    	 LOG.error("====="+userApprovalUpdate.getApprovalState());
    	 
    	 String externalId = userApprovalUpdate.getProofFile().getExternalId();
    	 String proofFile = userApprovalUpdate.getProofFile().getPathFilename();
    	 String userFullName = userApprovalUpdate.getUserFullName();
    	 String userUid = userApprovalUpdate.getUserUniqueIdentifier();
    	
    	 ApprovalState approvalState = userApprovalUpdate.getApprovalState();
    	 String approvalComment = approvalState.getComment();
    	 String approvalName = approvalState.getName();
    	 String approvalValue = approvalState.getValue()+"";
    	// String approvalTimestamp = approvalState.getTimestamp().getDateTime().toString();
    	 
 		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy h:mm a");
 		String approvalTimestamp = sdf.format(approvalState.getTimestamp().getDateTime().getTimeInMillis());
 		
    	 
    	 JSONObject jsonObj = new JSONObject();
    	 jsonObj.put("requestId", externalId);
    	 jsonObj.put("category", "Status");
    	 jsonObj.put("proofFile", proofFile);                	 
    	 jsonObj.put("userUid", userUid);
    	 jsonObj.put("userFullName", userFullName);
    	 jsonObj.put("approvalComment", approvalComment);
    	 jsonObj.put("approvalName", approvalName);
    	 jsonObj.put("approvalValue", approvalValue);
    	 jsonObj.put("approvalTimestamp", approvalTimestamp.toString());                	
    	 jsonObj.put("annotationOperation", "");
    	 jsonObj.put("annotationId", "");
    	 jsonObj.put("annotationText", "");  
    	 jsonObj.put("replyAnnotations", "");
    	 jsonObj.put("createdTimestamp", "");
    	 
    	 
		try {
			SoapBindingStub bind;
			bind = (SoapBindingStub) new SforceServiceLocator().getSoap();
		
			LoginResult lr = bind.login("vikisolution.ik@appcino.account", "irfan@123eTzoVASmth8aQhFvfx7XQb4AM");
			
			SessionHeader sh = new SessionHeader();
			sh.setSessionId(lr.getSessionId());
			
			VikiSolutionDataServiceLocator locator = new VikiSolutionDataServiceLocator();
			URL url = new URL(locator.getVikiSolutionDataAddress());
			
			VikiSolutionDataBindingStub stub = new VikiSolutionDataBindingStub(url, locator);
			
			stub.setHeader(locator.getVikiSolutionDataAddress(), "SessionHeader", sh);
			
			stub.userApprovalUpdateSFDC(jsonObj.toString());
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

		//throw new java.lang.UnsupportedOperationException("Please implement "+ this.getClass().getName() + "#userApprovalUpdate");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param validateUserApproval
	 * @return validateUserApprovalResponse
	 */

	public com.vikisolutions.www.ValidateUserApprovalResponse validateUserApproval(com.vikisolutions.www.ValidateUserApproval validateUserApproval) {
		// TODO : fill this with the necessary business logic
		
		 LOG.error("Inside ValidateUserApproval");
    	 LOG.error("====="+validateUserApproval.getAuthorizeApproval());
		
		System.out.println("method validateUserApproval called");
		return null;
		
		//throw new java.lang.UnsupportedOperationException("Please implement "+ this.getClass().getName() + "#validateUserApproval");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param proofSessionClosed
	 * @return proofSessionClosedResponse
	 */

	public com.vikisolutions.www.ProofSessionClosedResponse proofSessionClosed(com.vikisolutions.www.ProofSessionClosed proofSessionClosed) {
		// TODO : fill this with the necessary business logic
		
		 LOG.error("Inside ProofSessionClosed");
    	 LOG.error("====="+proofSessionClosed.getProofSessionId());
		
		System.out.println("method proofSessionClosed called");
		return null;
		
		//throw new java.lang.UnsupportedOperationException("Please implement "+ this.getClass().getName() + "#proofSessionClosed");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param annotationUpdate
	 * @return annotationUpdateResponse
	 */

	@SuppressWarnings("unchecked")
	public com.vikisolutions.www.AnnotationUpdateResponse annotationUpdate(com.vikisolutions.www.AnnotationUpdate annotationUpdate) {
		
		System.out.println("method annotationUpdateSFDC called first");
		
		//TODO : fill this with the necessary business logic
	   	 LOG.error("Inside AnnotationUpdate");
	   	 LOG.error("====="+annotationUpdate.getAnnotation());
	   
	   	 
	   	 String externalId = annotationUpdate.getProofFile().getExternalId();
	   	 String proofFile = annotationUpdate.getProofFile().getPathFilename();                	 
	   	 String annotationOperation = annotationUpdate.getOperation().getValue();
	   	 
	   		   	 
	   	 Annotation annotation = annotationUpdate.getAnnotation();
	   	 String annotationId = annotation.getAnnotationNumber()+"";
	   	 
	   	 JSONArray replyArray = new JSONArray();
	   	 if(annotation.getAnnotationReplies()!=null)
	   	 {	 
	       	 AnnotationReply reply[] = annotation.getAnnotationReplies().getAnnotationReply();                	 
	       	 if(reply!=null)
	       	 {	 
	           	 for(int i=0;i<reply.length;i++)
	           	 {
	           		 JSONObject jsonReply = new JSONObject();
	           		 jsonReply.put("replyAnnotationId",reply[i].getReplyNumber());
	           		 jsonReply.put("replyAnnotationText",reply[i].getText());               		 
	           		 replyArray.add(jsonReply);
	           	 }
	       	 }	 
	   	 }	 
	   	 
	   	 String annotationText = annotation.getText();
	   	 String userUid =  annotation.getUserUniqueIdentifier();
	   	 String userFullName =  annotation.getUserFullName();
	   	 //String createdTimestamp = annotation.getCreatedTimestamp().toString();
	   	 
	   	 SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy h:mm a");
	 		 String createdTimestamp = sdf.format(annotation.getCreatedTimestamp().getTimeInMillis());
	   	 
	   	 JSONObject jsonObj = new JSONObject();                	 
	   	 jsonObj.put("requestId", externalId);
	   	 jsonObj.put("category", "Operation");
	   	 jsonObj.put("proofFile", proofFile);
	   	 jsonObj.put("annotationOperation", annotationOperation);
	   	 jsonObj.put("annotationId", annotationId);
	   	 jsonObj.put("annotationText", annotationText);
	   	 jsonObj.put("replyAnnotations", replyArray);
	   	 jsonObj.put("userUid", userUid);
	   	 jsonObj.put("userFullName", userFullName);
	   	 jsonObj.put("createdTimestamp", createdTimestamp.toString());
	   	 jsonObj.put("approvalComment", "");
	   	 jsonObj.put("approvalName", "");
	   	 jsonObj.put("approvalValue", "");
	   	 jsonObj.put("approvalTimestamp", "");
	   	 
	   	try {
			SoapBindingStub bind;
			bind = (SoapBindingStub) new SforceServiceLocator().getSoap();
		
			LoginResult lr = bind.login("vikisolution.ik@appcino.account", "irfan@123eTzoVASmth8aQhFvfx7XQb4AM");
			
			SessionHeader sh = new SessionHeader();
			sh.setSessionId(lr.getSessionId());
			
			VikiSolutionDataServiceLocator locator = new VikiSolutionDataServiceLocator();
			URL url = new URL(locator.getVikiSolutionDataAddress());
			
			VikiSolutionDataBindingStub stub = new VikiSolutionDataBindingStub(url, locator);
			
			stub.setHeader(locator.getVikiSolutionDataAddress(), "SessionHeader", sh);
			
			System.out.println("SFDC method annotationUpdateSFDC called");
			stub.annotationUpdateSFDC(jsonObj.toString());
			System.out.println("SFDC method annotationUpdateSFDC call complete");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	   	
	   	System.out.println("method annotationUpdateSFDC called last");
	    LOG.error("AnnotationUpdate End");
		
		return null;
		
		//throw new java.lang.UnsupportedOperationException("Please implement "+ this.getClass().getName() + "#annotationUpdate");
	}

}
