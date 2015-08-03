
/**
 * AnnotationMark.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.vikisolutions.www;
            

            /**
            *  AnnotationMark bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AnnotationMark
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AnnotationMark
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
                        * field for AnnotationPageMaps
                        */

                        
                                    protected com.vikisolutions.www.ArrayOfAnnotationPageMap localAnnotationPageMaps ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotationPageMapsTracker = false ;

                           public boolean isAnnotationPageMapsSpecified(){
                               return localAnnotationPageMapsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.vikisolutions.www.ArrayOfAnnotationPageMap
                           */
                           public  com.vikisolutions.www.ArrayOfAnnotationPageMap getAnnotationPageMaps(){
                               return localAnnotationPageMaps;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AnnotationPageMaps
                               */
                               public void setAnnotationPageMaps(com.vikisolutions.www.ArrayOfAnnotationPageMap param){
                            localAnnotationPageMapsTracker = param != null;
                                   
                                            this.localAnnotationPageMaps=param;
                                    

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
                        * field for UserInformation
                        */

                        
                                    protected com.vikisolutions.www.UserInformation localUserInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserInformationTracker = false ;

                           public boolean isUserInformationSpecified(){
                               return localUserInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.vikisolutions.www.UserInformation
                           */
                           public  com.vikisolutions.www.UserInformation getUserInformation(){
                               return localUserInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserInformation
                               */
                               public void setUserInformation(com.vikisolutions.www.UserInformation param){
                            localUserInformationTracker = param != null;
                                   
                                            this.localUserInformation=param;
                                    

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
                           namespacePrefix+":AnnotationMark",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AnnotationMark",
                           xmlWriter);
                   }

               
                   }
                if (localExtensionDataTracker){
                                            if (localExtensionData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ExtensionData cannot be null!!");
                                            }
                                           localExtensionData.serialize(new javax.xml.namespace.QName("http://www.vikisolutions.com/","ExtensionData"),
                                               xmlWriter);
                                        } if (localAnnotationPageMapsTracker){
                                            if (localAnnotationPageMaps==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AnnotationPageMaps cannot be null!!");
                                            }
                                           localAnnotationPageMaps.serialize(new javax.xml.namespace.QName("http://www.vikisolutions.com/","AnnotationPageMaps"),
                                               xmlWriter);
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
                             } if (localUserInformationTracker){
                                            if (localUserInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UserInformation cannot be null!!");
                                            }
                                           localUserInformation.serialize(new javax.xml.namespace.QName("http://www.vikisolutions.com/","UserInformation"),
                                               xmlWriter);
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
                                } if (localAnnotationPageMapsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "AnnotationPageMaps"));
                            
                            
                                    if (localAnnotationPageMaps==null){
                                         throw new org.apache.axis2.databinding.ADBException("AnnotationPageMaps cannot be null!!");
                                    }
                                    elementList.add(localAnnotationPageMaps);
                                } if (localUserAnnotationColorTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "UserAnnotationColor"));
                                 
                                        if (localUserAnnotationColor != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserAnnotationColor));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("UserAnnotationColor cannot be null!!");
                                        }
                                    } if (localUserInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "UserInformation"));
                            
                            
                                    if (localUserInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("UserInformation cannot be null!!");
                                    }
                                    elementList.add(localUserInformation);
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
        public static AnnotationMark parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AnnotationMark object =
                new AnnotationMark();

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
                    
                            if (!"AnnotationMark".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AnnotationMark)com.vikisolutions.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","AnnotationPageMaps").equals(reader.getName())){
                                
                                                object.setAnnotationPageMaps(com.vikisolutions.www.ArrayOfAnnotationPageMap.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","UserInformation").equals(reader.getName())){
                                
                                                object.setUserInformation(com.vikisolutions.www.UserInformation.Factory.parse(reader));
                                              
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
           
    