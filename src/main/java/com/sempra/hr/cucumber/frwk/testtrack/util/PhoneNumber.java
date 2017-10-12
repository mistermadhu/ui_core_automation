/**
 * PhoneNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class PhoneNumber  implements java.io.Serializable {
    private java.lang.String numbertype;

    private java.lang.String phonenumber;

    public PhoneNumber() {
    }

    public PhoneNumber(
           java.lang.String numbertype,
           java.lang.String phonenumber) {
           this.numbertype = numbertype;
           this.phonenumber = phonenumber;
    }


    /**
     * Gets the numbertype value for this PhoneNumber.
     * 
     * @return numbertype
     */
    public java.lang.String getNumbertype() {
        return numbertype;
    }


    /**
     * Sets the numbertype value for this PhoneNumber.
     * 
     * @param numbertype
     */
    public void setNumbertype(java.lang.String numbertype) {
        this.numbertype = numbertype;
    }


    /**
     * Gets the phonenumber value for this PhoneNumber.
     * 
     * @return phonenumber
     */
    public java.lang.String getPhonenumber() {
        return phonenumber;
    }


    /**
     * Sets the phonenumber value for this PhoneNumber.
     * 
     * @param phonenumber
     */
    public void setPhonenumber(java.lang.String phonenumber) {
        this.phonenumber = phonenumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhoneNumber)) return false;
        PhoneNumber other = (PhoneNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numbertype==null && other.getNumbertype()==null) || 
             (this.numbertype!=null &&
              this.numbertype.equals(other.getNumbertype()))) &&
            ((this.phonenumber==null && other.getPhonenumber()==null) || 
             (this.phonenumber!=null &&
              this.phonenumber.equals(other.getPhonenumber())));
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
        if (getNumbertype() != null) {
            _hashCode += getNumbertype().hashCode();
        }
        if (getPhonenumber() != null) {
            _hashCode += getPhonenumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhoneNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "PhoneNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numbertype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numbertype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phonenumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phonenumber"));
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
