/**
 * CVersionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CVersionInfo  implements java.io.Serializable {
    private java.lang.Long versionNumber;

    private java.lang.String createdByUser;

    private java.lang.String dateTimeCreated;

    public CVersionInfo() {
    }

    public CVersionInfo(
           java.lang.Long versionNumber,
           java.lang.String createdByUser,
           java.lang.String dateTimeCreated) {
           this.versionNumber = versionNumber;
           this.createdByUser = createdByUser;
           this.dateTimeCreated = dateTimeCreated;
    }


    /**
     * Gets the versionNumber value for this CVersionInfo.
     * 
     * @return versionNumber
     */
    public java.lang.Long getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this CVersionInfo.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(java.lang.Long versionNumber) {
        this.versionNumber = versionNumber;
    }


    /**
     * Gets the createdByUser value for this CVersionInfo.
     * 
     * @return createdByUser
     */
    public java.lang.String getCreatedByUser() {
        return createdByUser;
    }


    /**
     * Sets the createdByUser value for this CVersionInfo.
     * 
     * @param createdByUser
     */
    public void setCreatedByUser(java.lang.String createdByUser) {
        this.createdByUser = createdByUser;
    }


    /**
     * Gets the dateTimeCreated value for this CVersionInfo.
     * 
     * @return dateTimeCreated
     */
    public java.lang.String getDateTimeCreated() {
        return dateTimeCreated;
    }


    /**
     * Sets the dateTimeCreated value for this CVersionInfo.
     * 
     * @param dateTimeCreated
     */
    public void setDateTimeCreated(java.lang.String dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CVersionInfo)) return false;
        CVersionInfo other = (CVersionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber()))) &&
            ((this.createdByUser==null && other.getCreatedByUser()==null) || 
             (this.createdByUser!=null &&
              this.createdByUser.equals(other.getCreatedByUser()))) &&
            ((this.dateTimeCreated==null && other.getDateTimeCreated()==null) || 
             (this.dateTimeCreated!=null &&
              this.dateTimeCreated.equals(other.getDateTimeCreated())));
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
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        if (getCreatedByUser() != null) {
            _hashCode += getCreatedByUser().hashCode();
        }
        if (getDateTimeCreated() != null) {
            _hashCode += getDateTimeCreated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CVersionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CVersionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTimeCreated"));
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
