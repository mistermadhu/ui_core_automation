/**
 * CDropdownField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CDropdownField  extends com.sempra.hr.cucumber.frwk.testtrack.util.CField  implements java.io.Serializable {
    private java.lang.String value;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] dropdownValues;

    public CDropdownField() {
    }

    public CDropdownField(
           long recordid,
           java.lang.String name,
           java.lang.String value,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] dropdownValues) {
        super(
            recordid,
            name);
        this.value = value;
        this.dropdownValues = dropdownValues;
    }


    /**
     * Gets the value value for this CDropdownField.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this CDropdownField.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the dropdownValues value for this CDropdownField.
     * 
     * @return dropdownValues
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] getDropdownValues() {
        return dropdownValues;
    }


    /**
     * Sets the dropdownValues value for this CDropdownField.
     * 
     * @param dropdownValues
     */
    public void setDropdownValues(com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] dropdownValues) {
        this.dropdownValues = dropdownValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDropdownField)) return false;
        CDropdownField other = (CDropdownField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.dropdownValues==null && other.getDropdownValues()==null) || 
             (this.dropdownValues!=null &&
              java.util.Arrays.equals(this.dropdownValues, other.getDropdownValues())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getDropdownValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDropdownValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDropdownValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDropdownField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CDropdownField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropdownValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropdownValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFieldValue"));
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
