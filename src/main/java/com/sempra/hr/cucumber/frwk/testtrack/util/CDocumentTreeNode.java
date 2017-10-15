/**
 * CDocumentTreeNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CDocumentTreeNode  extends com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap  implements java.io.Serializable {
    private java.lang.String summary;

    private java.lang.String outlineNumber;

    private java.lang.String tag;

    public CDocumentTreeNode() {
    }

    public CDocumentTreeNode(
           java.lang.String entityTableName,
           long entityRecordID,
           com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap[] childList,
           java.lang.String summary,
           java.lang.String outlineNumber,
           java.lang.String tag) {
        super(
            entityTableName,
            entityRecordID,
            childList);
        this.summary = summary;
        this.outlineNumber = outlineNumber;
        this.tag = tag;
    }


    /**
     * Gets the summary value for this CDocumentTreeNode.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this CDocumentTreeNode.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the outlineNumber value for this CDocumentTreeNode.
     * 
     * @return outlineNumber
     */
    public java.lang.String getOutlineNumber() {
        return outlineNumber;
    }


    /**
     * Sets the outlineNumber value for this CDocumentTreeNode.
     * 
     * @param outlineNumber
     */
    public void setOutlineNumber(java.lang.String outlineNumber) {
        this.outlineNumber = outlineNumber;
    }


    /**
     * Gets the tag value for this CDocumentTreeNode.
     * 
     * @return tag
     */
    public java.lang.String getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this CDocumentTreeNode.
     * 
     * @param tag
     */
    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDocumentTreeNode)) return false;
        CDocumentTreeNode other = (CDocumentTreeNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.outlineNumber==null && other.getOutlineNumber()==null) || 
             (this.outlineNumber!=null &&
              this.outlineNumber.equals(other.getOutlineNumber()))) &&
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag())));
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
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getOutlineNumber() != null) {
            _hashCode += getOutlineNumber().hashCode();
        }
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDocumentTreeNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CDocumentTreeNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outlineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outlineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag"));
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
