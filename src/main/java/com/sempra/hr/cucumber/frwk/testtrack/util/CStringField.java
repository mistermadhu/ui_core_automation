/**
 * CStringField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CStringField  extends com.sempra.hr.cucumber.frwk.testtrack.util.CField  implements java.io.Serializable {
    private java.lang.String value;

    private java.lang.Boolean isMultilineString;

    private java.lang.Boolean containsFormatting;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] inlineAttachmentList;

    public CStringField() {
    }

    public CStringField(
           long recordid,
           java.lang.String name,
           java.lang.String value,
           java.lang.Boolean isMultilineString,
           java.lang.Boolean containsFormatting,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] inlineAttachmentList) {
        super(
            recordid,
            name);
        this.value = value;
        this.isMultilineString = isMultilineString;
        this.containsFormatting = containsFormatting;
        this.inlineAttachmentList = inlineAttachmentList;
    }


    /**
     * Gets the value value for this CStringField.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this CStringField.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the isMultilineString value for this CStringField.
     * 
     * @return isMultilineString
     */
    public java.lang.Boolean getIsMultilineString() {
        return isMultilineString;
    }


    /**
     * Sets the isMultilineString value for this CStringField.
     * 
     * @param isMultilineString
     */
    public void setIsMultilineString(java.lang.Boolean isMultilineString) {
        this.isMultilineString = isMultilineString;
    }


    /**
     * Gets the containsFormatting value for this CStringField.
     * 
     * @return containsFormatting
     */
    public java.lang.Boolean getContainsFormatting() {
        return containsFormatting;
    }


    /**
     * Sets the containsFormatting value for this CStringField.
     * 
     * @param containsFormatting
     */
    public void setContainsFormatting(java.lang.Boolean containsFormatting) {
        this.containsFormatting = containsFormatting;
    }


    /**
     * Gets the inlineAttachmentList value for this CStringField.
     * 
     * @return inlineAttachmentList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] getInlineAttachmentList() {
        return inlineAttachmentList;
    }


    /**
     * Sets the inlineAttachmentList value for this CStringField.
     * 
     * @param inlineAttachmentList
     */
    public void setInlineAttachmentList(com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] inlineAttachmentList) {
        this.inlineAttachmentList = inlineAttachmentList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CStringField)) return false;
        CStringField other = (CStringField) obj;
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
            ((this.isMultilineString==null && other.getIsMultilineString()==null) || 
             (this.isMultilineString!=null &&
              this.isMultilineString.equals(other.getIsMultilineString()))) &&
            ((this.containsFormatting==null && other.getContainsFormatting()==null) || 
             (this.containsFormatting!=null &&
              this.containsFormatting.equals(other.getContainsFormatting()))) &&
            ((this.inlineAttachmentList==null && other.getInlineAttachmentList()==null) || 
             (this.inlineAttachmentList!=null &&
              java.util.Arrays.equals(this.inlineAttachmentList, other.getInlineAttachmentList())));
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
        if (getIsMultilineString() != null) {
            _hashCode += getIsMultilineString().hashCode();
        }
        if (getContainsFormatting() != null) {
            _hashCode += getContainsFormatting().hashCode();
        }
        if (getInlineAttachmentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInlineAttachmentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInlineAttachmentList(), i);
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
        new org.apache.axis.description.TypeDesc(CStringField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CStringField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMultilineString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isMultilineString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containsFormatting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "containsFormatting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inlineAttachmentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inlineAttachmentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFileAttachment"));
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
