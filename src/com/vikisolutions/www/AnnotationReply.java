
/**
 * AnnotationReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.vikisolutions.www;
            

            /**
            *  AnnotationReply bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AnnotationReply
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AnnotationReply
                Namespace URI = http://www.vikisolutions.com/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for ExtensionData
                        */

                        
                                    protected com.vikisolutions.www.ExtensionDataObject localExtensionData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExtensionDataTracker = false ;

                           public boolean isExtensionDataSpecified(){
                               return localExtensionDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.vikisolutions.www.ExtensionDataObject
                           */
                           public  com.vikisolutions.www.ExtensionDataObject getExtensionData(){
                               return localExtensionData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExtensionData
                               */
                               public void setExtensionData(com.vikisolutions.www.ExtensionDataObject param){
                            localExtensionDataTracker = param != null;
                                   
                                            this.localExtensionData=param;
                                    

                               }
                            

                        /**
                        * field for CreatedTimestamp
                        */

                        
                                    protected java.util.Calendar localCreatedTimestamp ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreatedTimestamp(){
                               return localCreatedTimestamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreatedTimestamp
                               */
                               public void setCreatedTimestamp(java.util.Calendar param){
                            
                                            this.localCreatedTimestamp=param;
                                    

                               }
                            

                        /**
                        * field for ReplyNumber
                        */

                        
                                    protected java.lang.String localReplyNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReplyNumberTracker = false ;

                           public boolean isReplyNumberSpecified(){
                               return localReplyNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReplyNumber(){
                               return localReplyNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReplyNumber
                               */
                               public void setReplyNumber(java.lang.String param){
                            localReplyNumberTracker = param != null;
                                   
                                            this.localReplyNumber=param;
                                    

                               }
                            

                        /**
                        * field for Task
                        */

                        
                                    protected com.vikisolutions.www.Task localTask ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaskTracker = false ;

                           public boolean isTaskSpecified(){
                               return localTaskTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.vikisolutions.www.Task
                           */
                           public  com.vikisolutions.www.Task getTask(){
                               return localTask;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Task
                               */
                               public void setTask(com.vikisolutions.www.Task param){
                            localTaskTracker = param != null;
                                   
                                            this.localTask=param;
                                    

                               }
                            

                        /**
                        * field for Text
                        */

                        
                                    protected java.lang.String localText ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTextTracker = false ;

                           public boolean isTextSpecified(){
                               return localTextTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getText(){
                               return localText;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Text
                               */
                               public void setText(java.lang.String param){
                            localTextTracker = param != null;
                                   
                                            this.localText=param;
                                    

                               }
                            

                        /**
                        * field for UserAnnotationColor
                        */

                        
                                    protected java.lang.String localUserAnnotationColor ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserAnnotationColorTracker = false ;

                           public boolean isUserAnnotationColorSpecified(){
                               return localUserAnnotationColorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserAnnotationColor(){
                               return localUserAnnotationColor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserAnnotationColor
                               */
                               public void setUserAnnotationColor(java.lang.String param){
                            localUserAnnotationColorTracker = param != null;
                                   
                                            this.localUserAnnotationColor=param;
                                    

                               }
                            

                        /**
                        * field for UserFullName
                        */

                        
                                    protected java.lang.String localUserFullName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserFullNameTracker = false ;

                           public boolean isUserFullNameSpecified(){
                               return localUserFullNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserFullName(){
                               return localUserFullName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserFullName
                               */
                               public void setUserFullName(java.lang.String param){
                            localUserFullNameTracker = param != null;
                                   
                                            this.localUserFullName=param;
                                    

                               }
                            

                        /**
                        * field for UserUniqueIdentifier
                        */

                        
                                    protected java.lang.String localUserUniqueIdentifier ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserUniqueIdentifierTracker = false ;

                           public boolean isUserUniqueIdentifierSpecified(){
                               return localUserUniqueIdentifierTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserUniqueIdentifier(){
                               return localUserUniqueIdentifier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserUniqueIdentifier
                               */
                               public void setUserUniqueIdentifier(java.lang.String param){
                            localUserUniqueIdentifierTracker = param != null;
                                   
                                            this.localUserUniqueIdentifier=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.vikisolutions.com/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":AnnotationReply",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AnnotationReply",
                           xmlWriter);
                   }

               
                   }
                if (localExtensionDataTracker){
                                            if (localExtensionData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ExtensionData cannot be null!!");
                                            }
                                           localExtensionData.serialize(new javax.xml.namespace.QName("http://www.vikisolutions.com/","ExtensionData"),
                                               xmlWriter);
                                        }
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "CreatedTimestamp", xmlWriter);
                             

                                          if (localCreatedTimestamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CreatedTimestamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedTimestamp));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localReplyNumberTracker){
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "ReplyNumber", xmlWriter);
                             

                                          if (localReplyNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReplyNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReplyNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaskTracker){
                                            if (localTask==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Task cannot be null!!");
                                            }
                                           localTask.serialize(new javax.xml.namespace.QName("http://www.vikisolutions.com/","Task"),
                                               xmlWriter);
                                        } if (localTextTracker){
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "Text", xmlWriter);
                             

                                          if (localText==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Text cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localText);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserAnnotationColorTracker){
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "UserAnnotationColor", xmlWriter);
                             

                                          if (localUserAnnotationColor==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("UserAnnotationColor cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserAnnotationColor);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserFullNameTracker){
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "UserFullName", xmlWriter);
                             

                                          if (localUserFullName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("UserFullName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserFullName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserUniqueIdentifierTracker){
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "UserUniqueIdentifier", xmlWriter);
                             

                                          if (localUserUniqueIdentifier==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("UserUniqueIdentifier cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserUniqueIdentifier);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.vikisolutions.com/")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localExtensionDataTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "ExtensionData"));
                            
                            
                                    if (localExtensionData==null){
                                         throw new org.apache.axis2.databinding.ADBException("ExtensionData cannot be null!!");
                                    }
                                    elementList.add(localExtensionData);
                                }
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "CreatedTimestamp"));
                                 
                                        if (localCreatedTimestamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedTimestamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CreatedTimestamp cannot be null!!");
                                        }
                                     if (localReplyNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "ReplyNumber"));
                                 
                                        if (localReplyNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplyNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReplyNumber cannot be null!!");
                                        }
                                    } if (localTaskTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "Task"));
                            
                            
                                    if (localTask==null){
                                         throw new org.apache.axis2.databinding.ADBException("Task cannot be null!!");
                                    }
                                    elementList.add(localTask);
                                } if (localTextTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "Text"));
                                 
                                        if (localText != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localText));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Text cannot be null!!");
                                        }
                                    } if (localUserAnnotationColorTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "UserAnnotationColor"));
                                 
                                        if (localUserAnnotationColor != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserAnnotationColor));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("UserAnnotationColor cannot be null!!");
                                        }
                                    } if (localUserFullNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "UserFullName"));
                                 
                                        if (localUserFullName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserFullName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("UserFullName cannot be null!!");
                                        }
                                    } if (localUserUniqueIdentifierTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "UserUniqueIdentifier"));
                                 
                                        if (localUserUniqueIdentifier != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserUniqueIdentifier));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("UserUniqueIdentifier cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static AnnotationReply parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AnnotationReply object =
                new AnnotationReply();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"AnnotationReply".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AnnotationReply)com.vikisolutions.www.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","ExtensionData").equals(reader.getName())){
                                
                                                object.setExtensionData(com.vikisolutions.www.ExtensionDataObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","CreatedTimestamp").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CreatedTimestamp" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreatedTimestamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","ReplyNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReplyNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReplyNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","Task").equals(reader.getName())){
                                
                                                object.setTask(com.vikisolutions.www.Task.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","Text").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Text" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setText(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","UserAnnotationColor").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"UserAnnotationColor" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserAnnotationColor(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","UserFullName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"UserFullName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserFullName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","UserUniqueIdentifier").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"UserUniqueIdentifier" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserUniqueIdentifier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    