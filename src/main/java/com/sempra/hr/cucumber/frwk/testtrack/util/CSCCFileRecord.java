/**
 * CSCCFileRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * Inherits from CItemWithDBRecordID. Stores the source control information
 * about files associated with the record. Structure is an extension
 * of the CItemWithDBRecordID structure because the server tracks a unique
 * CSSCFileRecord for each source control file associated with a record.
 */
public class CSCCFileRecord  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemWithDBRecordId  implements java.io.Serializable {
    private java.lang.String mStrFileName;

    private java.lang.String mStrFixedRevision;

    private java.util.Calendar mDateFixedTimestamp;

    private java.lang.String mStrType;

    private java.lang.Long mScriptOrder;

    private java.lang.String mStrScriptState;

    public CSCCFileRecord() {
    }

    public CSCCFileRecord(
           long recordid,
           java.lang.String mStrFileName,
           java.lang.String mStrFixedRevision,
           java.util.Calendar mDateFixedTimestamp,
           java.lang.String mStrType,
           java.lang.Long mScriptOrder,
           java.lang.String mStrScriptState) {
        super(
            recordid);
        this.mStrFileName = mStrFileName;
        this.mStrFixedRevision = mStrFixedRevision;
        this.mDateFixedTimestamp = mDateFixedTimestamp;
        this.mStrType = mStrType;
        this.mScriptOrder = mScriptOrder;
        this.mStrScriptState = mStrScriptState;
    }


    /**
     * Gets the mStrFileName value for this CSCCFileRecord.
     * 
     * @return mStrFileName
     */
    public java.lang.String getMStrFileName() {
        return mStrFileName;
    }


    /**
     * Sets the mStrFileName value for this CSCCFileRecord.
     * 
     * @param mStrFileName
     */
    public void setMStrFileName(java.lang.String mStrFileName) {
        this.mStrFileName = mStrFileName;
    }


    /**
     * Gets the mStrFixedRevision value for this CSCCFileRecord.
     * 
     * @return mStrFixedRevision
     */
    public java.lang.String getMStrFixedRevision() {
        return mStrFixedRevision;
    }


    /**
     * Sets the mStrFixedRevision value for this CSCCFileRecord.
     * 
     * @param mStrFixedRevision
     */
    public void setMStrFixedRevision(java.lang.String mStrFixedRevision) {
        this.mStrFixedRevision = mStrFixedRevision;
    }


    /**
     * Gets the mDateFixedTimestamp value for this CSCCFileRecord.
     * 
     * @return mDateFixedTimestamp
     */
    public java.util.Calendar getMDateFixedTimestamp() {
        return mDateFixedTimestamp;
    }


    /**
     * Sets the mDateFixedTimestamp value for this CSCCFileRecord.
     * 
     * @param mDateFixedTimestamp
     */
    public void setMDateFixedTimestamp(java.util.Calendar mDateFixedTimestamp) {
        this.mDateFixedTimestamp = mDateFixedTimestamp;
    }


    /**
     * Gets the mStrType value for this CSCCFileRecord.
     * 
     * @return mStrType
     */
    public java.lang.String getMStrType() {
        return mStrType;
    }


    /**
     * Sets the mStrType value for this CSCCFileRecord.
     * 
     * @param mStrType
     */
    public void setMStrType(java.lang.String mStrType) {
        this.mStrType = mStrType;
    }


    /**
     * Gets the mScriptOrder value for this CSCCFileRecord.
     * 
     * @return mScriptOrder
     */
    public java.lang.Long getMScriptOrder() {
        return mScriptOrder;
    }


    /**
     * Sets the mScriptOrder value for this CSCCFileRecord.
     * 
     * @param mScriptOrder
     */
    public void setMScriptOrder(java.lang.Long mScriptOrder) {
        this.mScriptOrder = mScriptOrder;
    }


    /**
     * Gets the mStrScriptState value for this CSCCFileRecord.
     * 
     * @return mStrScriptState
     */
    public java.lang.String getMStrScriptState() {
        return mStrScriptState;
    }


    /**
     * Sets the mStrScriptState value for this CSCCFileRecord.
     * 
     * @param mStrScriptState
     */
    public void setMStrScriptState(java.lang.String mStrScriptState) {
        this.mStrScriptState = mStrScriptState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSCCFileRecord)) return false;
        CSCCFileRecord other = (CSCCFileRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mStrFileName==null && other.getMStrFileName()==null) || 
             (this.mStrFileName!=null &&
              this.mStrFileName.equals(other.getMStrFileName()))) &&
            ((this.mStrFixedRevision==null && other.getMStrFixedRevision()==null) || 
             (this.mStrFixedRevision!=null &&
              this.mStrFixedRevision.equals(other.getMStrFixedRevision()))) &&
            ((this.mDateFixedTimestamp==null && other.getMDateFixedTimestamp()==null) || 
             (this.mDateFixedTimestamp!=null &&
              this.mDateFixedTimestamp.equals(other.getMDateFixedTimestamp()))) &&
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
        if (getMStrFileName() != null) {
            _hashCode += getMStrFileName().hashCode();
        }
        if (getMStrFixedRevision() != null) {
            _hashCode += getMStrFixedRevision().hashCode();
        }
        if (getMDateFixedTimestamp() != null) {
            _hashCode += getMDateFixedTimestamp().hashCode();
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
        new org.apache.axis.description.TypeDesc(CSCCFileRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CSCCFileRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MStrFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-strFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MStrFixedRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-strFixedRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDateFixedTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m-dateFixedTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
