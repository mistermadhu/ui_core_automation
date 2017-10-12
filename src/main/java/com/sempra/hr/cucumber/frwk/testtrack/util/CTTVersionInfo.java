/**
 * CTTVersionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * Contains TestTrack Server and CGI version information.
 */
public class CTTVersionInfo  implements java.io.Serializable {
    private java.lang.String serverVersion;

    private java.lang.String cgiVersion;

    public CTTVersionInfo() {
    }

    public CTTVersionInfo(
           java.lang.String serverVersion,
           java.lang.String cgiVersion) {
           this.serverVersion = serverVersion;
           this.cgiVersion = cgiVersion;
    }


    /**
     * Gets the serverVersion value for this CTTVersionInfo.
     * 
     * @return serverVersion
     */
    public java.lang.String getServerVersion() {
        return serverVersion;
    }


    /**
     * Sets the serverVersion value for this CTTVersionInfo.
     * 
     * @param serverVersion
     */
    public void setServerVersion(java.lang.String serverVersion) {
        this.serverVersion = serverVersion;
    }


    /**
     * Gets the cgiVersion value for this CTTVersionInfo.
     * 
     * @return cgiVersion
     */
    public java.lang.String getCgiVersion() {
        return cgiVersion;
    }


    /**
     * Sets the cgiVersion value for this CTTVersionInfo.
     * 
     * @param cgiVersion
     */
    public void setCgiVersion(java.lang.String cgiVersion) {
        this.cgiVersion = cgiVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CTTVersionInfo)) return false;
        CTTVersionInfo other = (CTTVersionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serverVersion==null && other.getServerVersion()==null) || 
             (this.serverVersion!=null &&
              this.serverVersion.equals(other.getServerVersion()))) &&
            ((this.cgiVersion==null && other.getCgiVersion()==null) || 
             (this.cgiVersion!=null &&
              this.cgiVersion.equals(other.getCgiVersion())));
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
        if (getServerVersion() != null) {
            _hashCode += getServerVersion().hashCode();
        }
        if (getCgiVersion() != null) {
            _hashCode += getCgiVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CTTVersionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CTTVersionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cgiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cgiVersion"));
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
