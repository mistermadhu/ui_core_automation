/**
 * CUserLicense.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * Contains Seapine License Server user license information.
 */
public class CUserLicense  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Integer numberUsed;

    private java.lang.Integer numberTotal;

    public CUserLicense() {
    }

    public CUserLicense(
           java.lang.String name,
           java.lang.Integer numberUsed,
           java.lang.Integer numberTotal) {
           this.name = name;
           this.numberUsed = numberUsed;
           this.numberTotal = numberTotal;
    }


    /**
     * Gets the name value for this CUserLicense.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CUserLicense.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numberUsed value for this CUserLicense.
     * 
     * @return numberUsed
     */
    public java.lang.Integer getNumberUsed() {
        return numberUsed;
    }


    /**
     * Sets the numberUsed value for this CUserLicense.
     * 
     * @param numberUsed
     */
    public void setNumberUsed(java.lang.Integer numberUsed) {
        this.numberUsed = numberUsed;
    }


    /**
     * Gets the numberTotal value for this CUserLicense.
     * 
     * @return numberTotal
     */
    public java.lang.Integer getNumberTotal() {
        return numberTotal;
    }


    /**
     * Sets the numberTotal value for this CUserLicense.
     * 
     * @param numberTotal
     */
    public void setNumberTotal(java.lang.Integer numberTotal) {
        this.numberTotal = numberTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CUserLicense)) return false;
        CUserLicense other = (CUserLicense) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.numberUsed==null && other.getNumberUsed()==null) || 
             (this.numberUsed!=null &&
              this.numberUsed.equals(other.getNumberUsed()))) &&
            ((this.numberTotal==null && other.getNumberTotal()==null) || 
             (this.numberTotal!=null &&
              this.numberTotal.equals(other.getNumberTotal())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumberUsed() != null) {
            _hashCode += getNumberUsed().hashCode();
        }
        if (getNumberTotal() != null) {
            _hashCode += getNumberTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CUserLicense.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CUserLicense"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
