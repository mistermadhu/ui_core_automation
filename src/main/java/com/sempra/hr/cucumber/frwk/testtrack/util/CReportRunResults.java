/**
 * CReportRunResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CReportRunResults  implements java.io.Serializable {
    private com.sempra.hr.cucumber.frwk.testtrack.util.CFile[] mFileList;

    public CReportRunResults() {
    }

    public CReportRunResults(
           com.sempra.hr.cucumber.frwk.testtrack.util.CFile[] mFileList) {
           this.mFileList = mFileList;
    }


    /**
     * Gets the mFileList value for this CReportRunResults.
     * 
     * @return mFileList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFile[] getMFileList() {
        return mFileList;
    }


    /**
     * Sets the mFileList value for this CReportRunResults.
     * 
     * @param mFileList
     */
    public void setMFileList(com.sempra.hr.cucumber.frwk.testtrack.util.CFile[] mFileList) {
        this.mFileList = mFileList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CReportRunResults)) return false;
        CReportRunResults other = (CReportRunResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mFileList==null && other.getMFileList()==null) || 
             (this.mFileList!=null &&
              java.util.Arrays.equals(this.mFileList, other.getMFileList())));
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
        if (getMFileList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMFileList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMFileList(), i);
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
        new org.apache.axis.description.TypeDesc(CReportRunResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CReportRunResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MFileList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-FileList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFile"));
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
