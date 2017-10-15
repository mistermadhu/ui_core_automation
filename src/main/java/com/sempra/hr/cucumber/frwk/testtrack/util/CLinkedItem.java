/**
 * CLinkedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * Inherits from COrderedItemWithDBRecordID. Extends the COrderedItemWithDBRecordID
 * structure and stores information about an item that is in a link.
 * NOTE: entityType is deprecated; use tablename.
 */
public class CLinkedItem  extends com.sempra.hr.cucumber.frwk.testtrack.util.COrderedItemWithDBRecordId  implements java.io.Serializable {
    private java.lang.Long entityType;

    private java.lang.String tablename;

    private long entityID;

    private java.lang.String number;

    private java.lang.String summary;

    private java.lang.String status;

    private java.lang.String state;

    private java.lang.Boolean issuspect;

    public CLinkedItem() {
    }

    public CLinkedItem(
           long recordid,
           long order,
           java.lang.Long entityType,
           java.lang.String tablename,
           long entityID,
           java.lang.String number,
           java.lang.String summary,
           java.lang.String status,
           java.lang.String state,
           java.lang.Boolean issuspect) {
        super(
            recordid,
            order);
        this.entityType = entityType;
        this.tablename = tablename;
        this.entityID = entityID;
        this.number = number;
        this.summary = summary;
        this.status = status;
        this.state = state;
        this.issuspect = issuspect;
    }


    /**
     * Gets the entityType value for this CLinkedItem.
     * 
     * @return entityType
     */
    public java.lang.Long getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this CLinkedItem.
     * 
     * @param entityType
     */
    public void setEntityType(java.lang.Long entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the tablename value for this CLinkedItem.
     * 
     * @return tablename
     */
    public java.lang.String getTablename() {
        return tablename;
    }


    /**
     * Sets the tablename value for this CLinkedItem.
     * 
     * @param tablename
     */
    public void setTablename(java.lang.String tablename) {
        this.tablename = tablename;
    }


    /**
     * Gets the entityID value for this CLinkedItem.
     * 
     * @return entityID
     */
    public long getEntityID() {
        return entityID;
    }


    /**
     * Sets the entityID value for this CLinkedItem.
     * 
     * @param entityID
     */
    public void setEntityID(long entityID) {
        this.entityID = entityID;
    }


    /**
     * Gets the number value for this CLinkedItem.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CLinkedItem.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the summary value for this CLinkedItem.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this CLinkedItem.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the status value for this CLinkedItem.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CLinkedItem.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the state value for this CLinkedItem.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this CLinkedItem.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the issuspect value for this CLinkedItem.
     * 
     * @return issuspect
     */
    public java.lang.Boolean getIssuspect() {
        return issuspect;
    }


    /**
     * Sets the issuspect value for this CLinkedItem.
     * 
     * @param issuspect
     */
    public void setIssuspect(java.lang.Boolean issuspect) {
        this.issuspect = issuspect;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CLinkedItem)) return false;
        CLinkedItem other = (CLinkedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.tablename==null && other.getTablename()==null) || 
             (this.tablename!=null &&
              this.tablename.equals(other.getTablename()))) &&
            this.entityID == other.getEntityID() &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.issuspect==null && other.getIssuspect()==null) || 
             (this.issuspect!=null &&
              this.issuspect.equals(other.getIssuspect())));
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
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getTablename() != null) {
            _hashCode += getTablename().hashCode();
        }
        _hashCode += new Long(getEntityID()).hashCode();
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getIssuspect() != null) {
            _hashCode += getIssuspect().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CLinkedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CLinkedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tablename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tablename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuspect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuspect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
