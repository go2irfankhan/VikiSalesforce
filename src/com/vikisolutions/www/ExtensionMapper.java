
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.vikisolutions.www;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "Annotation".equals(typeName)){
                   
                            return  com.vikisolutions.www.Annotation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "ExtensionDataObject".equals(typeName)){
                   
                            return  com.vikisolutions.www.ExtensionDataObject.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "Task".equals(typeName)){
                   
                            return  com.vikisolutions.www.Task.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "ApprovalState".equals(typeName)){
                   
                            return  com.vikisolutions.www.ApprovalState.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "ArrayOfApprovalReason".equals(typeName)){
                   
                            return  com.vikisolutions.www.ArrayOfApprovalReason.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "ArrayOfAnnotationReply".equals(typeName)){
                   
                            return  com.vikisolutions.www.ArrayOfAnnotationReply.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "AnnotationPageMap".equals(typeName)){
                   
                            return  com.vikisolutions.www.AnnotationPageMap.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "ArrayOfAnnotationMark".equals(typeName)){
                   
                            return  com.vikisolutions.www.ArrayOfAnnotationMark.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "UserInformation".equals(typeName)){
                   
                            return  com.vikisolutions.www.UserInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "ApprovalReason".equals(typeName)){
                   
                            return  com.vikisolutions.www.ApprovalReason.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "EnumerationsDocumentType".equals(typeName)){
                   
                            return  com.vikisolutions.www.EnumerationsDocumentType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "ProofFile".equals(typeName)){
                   
                            return  com.vikisolutions.www.ProofFile.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "dcEnumerationsAnnotationType".equals(typeName)){
                   
                            return  com.vikisolutions.www.DcEnumerationsAnnotationType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "AnnotationMark".equals(typeName)){
                   
                            return  com.vikisolutions.www.AnnotationMark.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "UserTimeZone".equals(typeName)){
                   
                            return  com.vikisolutions.www.UserTimeZone.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "DateTimeOffset".equals(typeName)){
                   
                            return  com.vikisolutions.www.DateTimeOffset.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "AnnotationOperation".equals(typeName)){
                   
                            return  com.vikisolutions.www.AnnotationOperation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "ArrayOfAnnotationPageMap".equals(typeName)){
                   
                            return  com.vikisolutions.www.ArrayOfAnnotationPageMap.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.vikisolutions.com/".equals(namespaceURI) &&
                  "AnnotationReply".equals(typeName)){
                   
                            return  com.vikisolutions.www.AnnotationReply.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    