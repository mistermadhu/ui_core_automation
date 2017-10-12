/**
 * CFileAttachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * Stores binary data for a file attached to a CReportedByRecord.
 * The xsd:base64binary type contains two elements: _ptr and _size. The
 * _ptr member stores binary data of the file and the _size specifies
 * the length of data. When retrieving a CFileAttachment from the server,
 * caller must create a file and copy the data from the m-pFileData into
 * the file. When saving a CFileAttachment to the server, the caller
 * must copy the data from the file and place it in the m-pFileData member.
 */
public class CFileAttachment  extends com.sempra.hr.cucumber.frwk.testtrack.util.CFile  implements java.io.Serializable {
    private long mRecordid;

    private java.lang.String mStrArchiveName;

    private java.lang.String mStrType;

    private java.lang.Long mScriptOrder;

    private java.lang.String mStrScriptState;

    public CFileAttachment() {
    }

    public CFileAttachment(
           byte[] mPFileData,
           java.lang.String mStrFileName,
           java.util.Calendar mDateTimeCreated,
           java.util.Calendar mDateTimeModified,
           long mRecordid,
           java.lang.String mStrArchiveName,
           java.lang.String mStrType,
           java.lang.Long mScriptOrder,
           java.lang.String mStrScriptState) {
        super(
            mPFileData,
            mStrFileName,
            mDateTimeCreated,
            mDateTimeModified);
        this.mRecordid = mRecordid;
        this.mStrArchiveName = mStrArchiveName;
        this.mStrType = mStrType;
        this.mScriptOrder = mScriptOrder;
        this.mStrScriptState = mStrScriptState;
    }


    /**
     * Gets the mRecordid value for this CFileAttachment.
     * 
     * @return mRecordid
     */
    public long getMRecordid() {
        return mRecordid;
    }


    /**
     * Sets the mRecordid value for this CFileAttachment.
     * 
     * @param mRecordid
     */
    public void setMRecordid(long mRecordid) {
        this.mRecordid = mRecordid;
    }


    /**
     * Gets the mStrArchiveName value for this CFileAttachment.
     * 
     * @return mStrArchiveName
     */
    public java.lang.String getMStrArchiveName() {
        return mStrArchiveName;
    }


    /**
     * Sets the mStrArchiveName value for this CFileAttachment.
     * 
     * @param mStrArchiveName
     */
    public void setMStrArchiveName(java.lang.String mStrArchiveName) {
        this.mStrArchiveName = mStrArchiveName;
    }


    /**
     * Gets the mStrType value for this CFileAttachment.
     * 
     * @return mStrType
     */
    public java.lang.String getMStrType() {
        return mStrType;
    }


    /**
     * Sets the mStrType value for this CFileAttachment.
     * 
     * @param mStrType
     */
    public void setMStrType(java.lang.String mStrType) {
        this.mStrType = mStrType;
    }


    /**
     * Gets the mScriptOrder value for this CFileAttachment.
     * 
     * @return mScriptOrder
     */
    public java.lang.Long getMScriptOrder() {
        return mScriptOrder;
    }


    /**
     * Sets the mScriptOrder value for this CFileAttachment.
     * 
     * @param mScriptOrder
     */
    public void setMScriptOrder(java.lang.Long mScriptOrder) {
        this.mScriptOrder = mScriptOrder;
    }


    /**
     * Gets the mStrScriptState value for this CFileAttachment.
     * 
     * @return mStrScriptState
     */
    public java.lang.String getMStrScriptState() {
        return mStrScriptState;
    }


    /**
     * Sets the mStrScriptState value for this CFileAttachment.
     * 
     * @param mStrScriptState
     */
    public void setMStrScriptState(java.lang.String mStrScriptState) {
        this.mStrScriptState = mStrScriptState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFileAttachment)) return false;
        CFileAttachment other = (CFileAttachment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.mRecordid == other.getMRecordid() &&
            ((this.mStrArchiveName==null && other.getMStrArchiveName()==null) || 
             (this.mStrArchiveName!=null &&
              this.mStrArchiveName.equals(other.getMStrArchiveName()))) &&
            ((this.mStrType==null && other.getMStrType()==null) || 
             (this.mStrType!=null &&
              this.mStrType.equals(other.getMStrType()))) &&
            ((this.mScriptOrder==null && other.getMScriptOrder()==null) || 
             (this.mScriptOrder!=null &&
              this.mScriptOrder.equals(other.getMScriptOrder()))) &&
            ((this.mStrScriptState==null && other.getMStrScriptState()==null) || 
             (this.mStrScriptState!=null &&
              this.mStrScriptState.equals(other.getMStrScriptState())));
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
        _hashCode += new Long(getMRecordid()).hashCode();
        if (getMStrArchiveName() != null) {
            _hashCode += getMStrArchiveName().hashCode();
        }
        if (getMStrType() != null) {
            _hashCode += getMStrType().hashCode();
        }
        if (getMScriptOrder() != null) {
            _hashCode += getMScriptOrder().hashCode();
        }
        if (getMStrScriptState() != null) {
            _hashCode += getMStrScriptState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFileAttachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFileAttachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MRecordid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-recordid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MStrArchiveName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-strArchiveName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MStrType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-strType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MScriptOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-scriptOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MStrScriptState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-strScriptState"));
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
