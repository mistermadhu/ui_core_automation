/**
 * CItemHyperlinkContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CItemHyperlinkContainer  implements java.io.Serializable {
    private java.lang.String ttstudioHyperlink;

    private java.lang.String httpHyperlink;

    public CItemHyperlinkContainer() {
    }

    public CItemHyperlinkContainer(
           java.lang.String ttstudioHyperlink,
           java.lang.String httpHyperlink) {
           this.ttstudioHyperlink = ttstudioHyperlink;
           this.httpHyperlink = httpHyperlink;
    }


    /**
     * Gets the ttstudioHyperlink value for this CItemHyperlinkContainer.
     * 
     * @return ttstudioHyperlink
     */
    public java.lang.String getTtstudioHyperlink() {
        return ttstudioHyperlink;
    }


    /**
     * Sets the ttstudioHyperlink value for this CItemHyperlinkContainer.
     * 
     * @param ttstudioHyperlink
     */
    public void setTtstudioHyperlink(java.lang.String ttstudioHyperlink) {
        this.ttstudioHyperlink = ttstudioHyperlink;
    }


    /**
     * Gets the httpHyperlink value for this CItemHyperlinkContainer.
     * 
     * @return httpHyperlink
     */
    public java.lang.String getHttpHyperlink() {
        return httpHyperlink;
    }


    /**
     * Sets the httpHyperlink value for this CItemHyperlinkContainer.
     * 
     * @param httpHyperlink
     */
    public void setHttpHyperlink(java.lang.String httpHyperlink) {
        this.httpHyperlink = httpHyperlink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CItemHyperlinkContainer)) return false;
        CItemHyperlinkContainer other = (CItemHyperlinkContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ttstudioHyperlink==null && other.getTtstudioHyperlink()==null) || 
             (this.ttstudioHyperlink!=null &&
              this.ttstudioHyperlink.equals(other.getTtstudioHyperlink()))) &&
            ((this.httpHyperlink==null && other.getHttpHyperlink()==null) || 
             (this.httpHyperlink!=null &&
              this.httpHyperlink.equals(other.getHttpHyperlink())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTtstudioHyperlink() != null) {
            _hashCode += getTtstudioHyperlink().hashCode();
        }
        if (getHttpHyperlink() != null) {
            _hashCode += getHttpHyperlink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CItemHyperlinkContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CItemHyperlinkContainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttstudioHyperlink");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttstudioHyperlink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpHyperlink");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpHyperlink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
