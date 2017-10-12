/**
 * CFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CFile  implements java.io.Serializable {
    private byte[] mPFileData;

    private java.lang.String mStrFileName;

    private java.util.Calendar mDateTimeCreated;

    private java.util.Calendar mDateTimeModified;

    public CFile() {
    }

    public CFile(
           byte[] mPFileData,
           java.lang.String mStrFileName,
           java.util.Calendar mDateTimeCreated,
           java.util.Calendar mDateTimeModified) {
           this.mPFileData = mPFileData;
           this.mStrFileName = mStrFileName;
           this.mDateTimeCreated = mDateTimeCreated;
           this.mDateTimeModified = mDateTimeModified;
    }


    /**
     * Gets the mPFileData value for this CFile.
     * 
     * @return mPFileData
     */
    public byte[] getMPFileData() {
        return mPFileData;
    }


    /**
     * Sets the mPFileData value for this CFile.
     * 
     * @param mPFileData
     */
    public void setMPFileData(byte[] mPFileData) {
        this.mPFileData = mPFileData;
    }


    /**
     * Gets the mStrFileName value for this CFile.
     * 
     * @return mStrFileName
     */
    public java.lang.String getMStrFileName() {
        return mStrFileName;
    }


    /**
     * Sets the mStrFileName value for this CFile.
     * 
     * @param mStrFileName
     */
    public void setMStrFileName(java.lang.String mStrFileName) {
        this.mStrFileName = mStrFileName;
    }


    /**
     * Gets the mDateTimeCreated value for this CFile.
     * 
     * @return mDateTimeCreated
     */
    public java.util.Calendar getMDateTimeCreated() {
        return mDateTimeCreated;
    }


    /**
     * Sets the mDateTimeCreated value for this CFile.
     * 
     * @param mDateTimeCreated
     */
    public void setMDateTimeCreated(java.util.Calendar mDateTimeCreated) {
        this.mDateTimeCreated = mDateTimeCreated;
    }


    /**
     * Gets the mDateTimeModified value for this CFile.
     * 
     * @return mDateTimeModified
     */
    public java.util.Calendar getMDateTimeModified() {
        return mDateTimeModified;
    }


    /**
     * Sets the mDateTimeModified value for this CFile.
     * 
     * @param mDateTimeModified
     */
    public void setMDateTimeModified(java.util.Calendar mDateTimeModified) {
        this.mDateTimeModified = mDateTimeModified;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFile)) return false;
        CFile other = (CFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mPFileData==null && other.getMPFileData()==null) || 
             (this.mPFileData!=null &&
              java.util.Arrays.equals(this.mPFileData, other.getMPFileData()))) &&
            ((this.mStrFileName==null && other.getMStrFileName()==null) || 
             (this.mStrFileName!=null &&
              this.mStrFileName.equals(other.getMStrFileName()))) &&
            ((this.mDateTimeCreated==null && other.getMDateTimeCreated()==null) || 
             (this.mDateTimeCreated!=null &&
              this.mDateTimeCreated.equals(other.getMDateTimeCreated()))) &&
            ((this.mDateTimeModified==null && other.getMDateTimeModified()==null) || 
             (this.mDateTimeModified!=null &&
              this.mDateTimeModified.equals(other.getMDateTimeModified())));
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
        if (getMPFileData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMPFileData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMPFileData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMStrFileName() != null) {
            _hashCode += getMStrFileName().hashCode();
        }
        if (getMDateTimeCreated() != null) {
            _hashCode += getMDateTimeCreated().hashCode();
        }
        if (getMDateTimeModified() != null) {
            _hashCode += getMDateTimeModified().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MPFileData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-pFileData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MStrFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-strFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDateTimeCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-dateTimeCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDateTimeModified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-dateTimeModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
