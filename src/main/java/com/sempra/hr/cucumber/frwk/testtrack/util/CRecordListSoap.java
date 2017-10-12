/**
 * CRecordListSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CRecordListSoap  implements java.io.Serializable {
    private com.sempra.hr.cucumber.frwk.testtrack.util.CTableColumn[] columnlist;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CRecordRowSoap[] records;

    public CRecordListSoap() {
    }

    public CRecordListSoap(
           com.sempra.hr.cucumber.frwk.testtrack.util.CTableColumn[] columnlist,
           com.sempra.hr.cucumber.frwk.testtrack.util.CRecordRowSoap[] records) {
           this.columnlist = columnlist;
           this.records = records;
    }


    /**
     * Gets the columnlist value for this CRecordListSoap.
     * 
     * @return columnlist
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTableColumn[] getColumnlist() {
        return columnlist;
    }


    /**
     * Sets the columnlist value for this CRecordListSoap.
     * 
     * @param columnlist
     */
    public void setColumnlist(com.sempra.hr.cucumber.frwk.testtrack.util.CTableColumn[] columnlist) {
        this.columnlist = columnlist;
    }


    /**
     * Gets the records value for this CRecordListSoap.
     * 
     * @return records
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRecordRowSoap[] getRecords() {
        return records;
    }


    /**
     * Sets the records value for this CRecordListSoap.
     * 
     * @param records
     */
    public void setRecords(com.sempra.hr.cucumber.frwk.testtrack.util.CRecordRowSoap[] records) {
        this.records = records;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CRecordListSoap)) return false;
        CRecordListSoap other = (CRecordListSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.columnlist==null && other.getColumnlist()==null) || 
             (this.columnlist!=null &&
              java.util.Arrays.equals(this.columnlist, other.getColumnlist()))) &&
            ((this.records==null && other.getRecords()==null) || 
             (this.records!=null &&
              java.util.Arrays.equals(this.records, other.getRecords())));
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
        if (getColumnlist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumnlist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumnlist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecords(), i);
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
        new org.apache.axis.description.TypeDesc(CRecordListSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CRecordListSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnlist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CTableColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("records");
        elemField.setXmlName(new javax.xml.namespace.QName("", "records"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CRecordRowSoap"));
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
