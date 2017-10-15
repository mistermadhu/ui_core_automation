/**
 * CTreeNodeSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CTreeNodeSoap  implements java.io.Serializable {
    private java.lang.String entityTableName;

    private long entityRecordID;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap[] childList;

    public CTreeNodeSoap() {
    }

    public CTreeNodeSoap(
           java.lang.String entityTableName,
           long entityRecordID,
           com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap[] childList) {
           this.entityTableName = entityTableName;
           this.entityRecordID = entityRecordID;
           this.childList = childList;
    }


    /**
     * Gets the entityTableName value for this CTreeNodeSoap.
     * 
     * @return entityTableName
     */
    public java.lang.String getEntityTableName() {
        return entityTableName;
    }


    /**
     * Sets the entityTableName value for this CTreeNodeSoap.
     * 
     * @param entityTableName
     */
    public void setEntityTableName(java.lang.String entityTableName) {
        this.entityTableName = entityTableName;
    }


    /**
     * Gets the entityRecordID value for this CTreeNodeSoap.
     * 
     * @return entityRecordID
     */
    public long getEntityRecordID() {
        return entityRecordID;
    }


    /**
     * Sets the entityRecordID value for this CTreeNodeSoap.
     * 
     * @param entityRecordID
     */
    public void setEntityRecordID(long entityRecordID) {
        this.entityRecordID = entityRecordID;
    }


    /**
     * Gets the childList value for this CTreeNodeSoap.
     * 
     * @return childList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap[] getChildList() {
        return childList;
    }


    /**
     * Sets the childList value for this CTreeNodeSoap.
     * 
     * @param childList
     */
    public void setChildList(com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap[] childList) {
        this.childList = childList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CTreeNodeSoap)) return false;
        CTreeNodeSoap other = (CTreeNodeSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entityTableName==null && other.getEntityTableName()==null) || 
             (this.entityTableName!=null &&
              this.entityTableName.equals(other.getEntityTableName()))) &&
            this.entityRecordID == other.getEntityRecordID() &&
            ((this.childList==null && other.getChildList()==null) || 
             (this.childList!=null &&
              java.util.Arrays.equals(this.childList, other.getChildList())));
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
        if (getEntityTableName() != null) {
            _hashCode += getEntityTableName().hashCode();
        }
        _hashCode += new Long(getEntityRecordID()).hashCode();
        if (getChildList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildList(), i);
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
        new org.apache.axis.description.TypeDesc(CTreeNodeSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CTreeNodeSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTableName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityTableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityRecordID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityRecordID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CTreeNodeSoap"));
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
