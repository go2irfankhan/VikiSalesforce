
/**
 * AnnotationPageMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.vikisolutions.www;
            

            /**
            *  AnnotationPageMap bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AnnotationPageMap
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AnnotationPageMap
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
                        * field for AnnotationType
                        */

                        
                                    protected int localAnnotationType ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAnnotationType(){
                               return localAnnotationType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AnnotationType
                               */
                               public void setAnnotationType(int param){
                            
                                            this.localAnnotationType=param;
                                    

                               }
                            

                        /**
                        * field for Duration
                        */

                        
                                    protected double localDuration ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getDuration(){
                               return localDuration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Duration
                               */
                               public void setDuration(double param){
                            
                                            this.localDuration=param;
                                    

                               }
                            

                        /**
                        * field for Height
                        */

                        
                                    protected double localHeight ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getHeight(){
                               return localHeight;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Height
                               */
                               public void setHeight(double param){
                            
                                            this.localHeight=param;
                                    

                               }
                            

                        /**
                        * field for MarkIndex
                        */

                        
                                    protected int localMarkIndex ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMarkIndex(){
                               return localMarkIndex;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarkIndex
                               */
                               public void setMarkIndex(int param){
                            
                                            this.localMarkIndex=param;
                                    

                               }
                            

                        /**
                        * field for PageNumber
                        */

                        
                                    protected int localPageNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPageNumber(){
                               return localPageNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PageNumber
                               */
                               public void setPageNumber(int param){
                            
                                            this.localPageNumber=param;
                                    

                               }
                            

                        /**
                        * field for PointIndex
                        */

                        
                                    protected int localPointIndex ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPointIndex(){
                               return localPointIndex;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PointIndex
                               */
                               public void setPointIndex(int param){
                            
                                            this.localPointIndex=param;
                                    

                               }
                            

                        /**
                        * field for StartTime
                        */

                        
                                    protected double localStartTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getStartTime(){
                               return localStartTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartTime
                               */
                               public void setStartTime(double param){
                            
                                            this.localStartTime=param;
                                    

                               }
                            

                        /**
                        * field for Type
                        */

                        
                                    protected com.vikisolutions.www.DcEnumerationsAnnotationType localType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.vikisolutions.www.DcEnumerationsAnnotationType
                           */
                           public  com.vikisolutions.www.DcEnumerationsAnnotationType getType(){
                               return localType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Type
                               */
                               public void setType(com.vikisolutions.www.DcEnumerationsAnnotationType param){
                            
                                            this.localType=param;
                                    

                               }
                            

                        /**
                        * field for Width
                        */

                        
                                    protected double localWidth ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getWidth(){
                               return localWidth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Width
                               */
                               public void setWidth(double param){
                            
                                            this.localWidth=param;
                                    

                               }
                            

                        /**
                        * field for X
                        */

                        
                                    protected double localX ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getX(){
                               return localX;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param X
                               */
                               public void setX(double param){
                            
                                            this.localX=param;
                                    

                               }
                            

                        /**
                        * field for Y
                        */

                        
                                    protected double localY ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getY(){
                               return localY;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Y
                               */
                               public void setY(double param){
                            
                                            this.localY=param;
                                    

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
                           namespacePrefix+":AnnotationPageMap",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AnnotationPageMap",
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
                                    writeStartElement(null, namespace, "AnnotationType", xmlWriter);
                             
                                               if (localAnnotationType==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AnnotationType cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAnnotationType));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "Duration", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localDuration)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Duration cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDuration));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "Height", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localHeight)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Height cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHeight));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "MarkIndex", xmlWriter);
                             
                                               if (localMarkIndex==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MarkIndex cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarkIndex));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "PageNumber", xmlWriter);
                             
                                               if (localPageNumber==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PageNumber cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageNumber));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "PointIndex", xmlWriter);
                             
                                               if (localPointIndex==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PointIndex cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointIndex));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "StartTime", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localStartTime)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("StartTime cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartTime));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");
                                            }
                                           localType.serialize(new javax.xml.namespace.QName("http://www.vikisolutions.com/","Type"),
                                               xmlWriter);
                                        
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "Width", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localWidth)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Width cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWidth));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "X", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localX)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("X cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localX));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.vikisolutions.com/";
                                    writeStartElement(null, namespace, "Y", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localY)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Y cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localY));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
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
                                                                      "AnnotationType"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAnnotationType));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "Duration"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDuration));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "Height"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHeight));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "MarkIndex"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarkIndex));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "PageNumber"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageNumber));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "PointIndex"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointIndex));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "StartTime"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartTime));
                            
                            elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "Type"));
                            
                            
                                    if (localType==null){
                                         throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");
                                    }
                                    elementList.add(localType);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "Width"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWidth));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "X"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localX));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://www.vikisolutions.com/",
                                                                      "Y"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localY));
                            

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
        public static AnnotationPageMap parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AnnotationPageMap object =
                new AnnotationPageMap();

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
                    
                            if (!"AnnotationPageMap".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AnnotationPageMap)com.vikisolutions.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","AnnotationType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"AnnotationType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAnnotationType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","Duration").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Duration" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDuration(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","Height").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Height" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHeight(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","MarkIndex").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MarkIndex" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMarkIndex(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","PageNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PageNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPageNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","PointIndex").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PointIndex" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPointIndex(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","StartTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"StartTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","Type").equals(reader.getName())){
                                
                                                object.setType(com.vikisolutions.www.DcEnumerationsAnnotationType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","Width").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Width" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWidth(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","X").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"X" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setX(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.vikisolutions.com/","Y").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Y" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setY(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
           
    