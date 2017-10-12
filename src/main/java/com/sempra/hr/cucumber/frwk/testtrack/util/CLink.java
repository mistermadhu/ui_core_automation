/**
 * CLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CLink  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack  implements java.io.Serializable {
    private java.lang.String linkDefinitionName;

    private java.lang.String comment;

    private java.lang.Boolean linkbroken;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CLinkedItem linkparent;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CLinkedItem[] childList;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CLinkHistoryItem[] historyList;

    public CLink() {
    }

    public CLink(
           long recordid,
           java.lang.String linkDefinitionName,
           java.lang.String comment,
           java.lang.Boolean linkbroken,
           com.sempra.hr.cucumber.frwk.testtrack.util.CLinkedItem linkparent,
           com.sempra.hr.cucumber.frwk.testtrack.util.CLinkedItem[] childList,
           com.sempra.hr.cucumber.frwk.testtrack.util.CLinkHistoryItem[] historyList) {
        super(
            recordid);
        this.linkDefinitionName = linkDefinitionName;
        this.comment = comment;
        this.linkbroken = linkbroken;
        this.linkparent = linkparent;
        this.childList = childList;
        this.historyList = historyList;
    }


    /**
     * Gets the linkDefinitionName value for this CLink.
     * 
     * @return linkDefinitionName
     */
    public java.lang.String getLinkDefinitionName() {
        return linkDefinitionName;
    }


    /**
     * Sets the linkDefinitionName value for this CLink.
     * 
     * @param linkDefinitionName
     */
    public void setLinkDefinitionName(java.lang.String linkDefinitionName) {
        this.linkDefinitionName = linkDefinitionName;
    }


    /**
     * Gets the comment value for this CLink.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this CLink.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the linkbroken value for this CLink.
     * 
     * @return linkbroken
     */
    public java.lang.Boolean getLinkbroken() {
        return linkbroken;
    }


    /**
     * Sets the linkbroken value for this CLink.
     * 
     * @param linkbroken
     */
    public void setLinkbroken(java.lang.Boolean linkbroken) {
        this.linkbroken = linkbroken;
    }


    /**
     * Gets the linkparent value for this CLink.
     * 
     * @return linkparent
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CLinkedItem getLinkparent() {
        return linkparent;
    }


    /**
     * Sets the linkparent value for this CLink.
     * 
     * @param linkparent
     */
    public void setLinkparent(com.sempra.hr.cucumber.frwk.testtrack.util.CLinkedItem linkparent) {
        this.linkparent = linkparent;
    }


    /**
     * Gets the childList value for this CLink.
     * 
     * @return childList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CLinkedItem[] getChildList() {
        return childList;
    }


    /**
     * Sets the childList value for this CLink.
     * 
     * @param childList
     */
    public void setChildList(com.sempra.hr.cucumber.frwk.testtrack.util.CLinkedItem[] childList) {
        this.childList = childList;
    }


    /**
     * Gets the historyList value for this CLink.
     * 
     * @return historyList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CLinkHistoryItem[] getHistoryList() {
        return historyList;
    }


    /**
     * Sets the historyList value for this CLink.
     * 
     * @param historyList
     */
    public void setHistoryList(com.sempra.hr.cucumber.frwk.testtrack.util.CLinkHistoryItem[] historyList) {
        this.historyList = historyList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLink)) return false;
        CLink other = (CLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.linkDefinitionName==null && other.getLinkDefinitionName()==null) || 
             (this.linkDefinitionName!=null &&
              this.linkDefinitionName.equals(other.getLinkDefinitionName()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.linkbroken==null && other.getLinkbroken()==null) || 
             (this.linkbroken!=null &&
              this.linkbroken.equals(other.getLinkbroken()))) &&
            ((this.linkparent==null && other.getLinkparent()==null) || 
             (this.linkparent!=null &&
              this.linkparent.equals(other.getLinkparent()))) &&
            ((this.childList==null && other.getChildList()==null) || 
             (this.childList!=null &&
              java.util.Arrays.equals(this.childList, other.getChildList()))) &&
            ((this.historyList==null && other.getHistoryList()==null) || 
             (this.historyList!=null &&
              java.util.Arrays.equals(this.historyList, other.getHistoryList())));
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
        if (getLinkDefinitionName() != null) {
            _hashCode += getLinkDefinitionName().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getLinkbroken() != null) {
            _hashCode += getLinkbroken().hashCode();
        }
        if (getLinkparent() != null) {
            _hashCode += getLinkparent().hashCode();
        }
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
        if (getHistoryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistoryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistoryList(), i);
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
        new org.apache.axis.description.TypeDesc(CLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkDefinitionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkDefinitionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkbroken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkbroken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkparent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkparent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CLinkedItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CLinkedItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CLinkHistoryItem"));
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
