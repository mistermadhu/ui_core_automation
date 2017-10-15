/**
 * CRecordRowSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CRecordRowSoap  implements java.io.Serializable {
    private com.sempra.hr.cucumber.frwk.testtrack.util.CRecordData[] row;

    public CRecordRowSoap() {
    }

    public CRecordRowSoap(
           com.sempra.hr.cucumber.frwk.testtrack.util.CRecordData[] row) {
           this.row = row;
    }


    /**
     * Gets the row value for this CRecordRowSoap.
     * 
     * @return row
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRecordData[] getRow() {
        return row;
    }


    /**
     * Sets the row value for this CRecordRowSoap.
     * 
     * @param row
     */
    public void setRow(com.sempra.hr.cucumber.frwk.testtrack.util.CRecordData[] row) {
        this.row = row;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CRecordRowSoap)) return false;
        CRecordRowSoap other = (CRecordRowSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.row==null && other.getRow()==null) || 
             (this.row!=null &&
              java.util.Arrays.equals(this.row, other.getRow())));
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
        if (getRow() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRow());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRow(), i);
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
        new org.apache.axis.description.TypeDesc(CRecordRowSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CRecordRowSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("row");
        elemField.setXmlName(new javax.xml.namespace.QName("", "row"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CRecordData"));
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
