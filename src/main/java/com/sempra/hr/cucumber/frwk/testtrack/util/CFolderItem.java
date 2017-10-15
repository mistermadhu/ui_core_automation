/**
 * CFolderItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CFolderItem  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemWithDBRecordId  implements java.io.Serializable {
    private java.lang.String entitytablename;

    private long entityrecordid;

    private java.lang.Long rank;

    public CFolderItem() {
    }

    public CFolderItem(
           long recordid,
           java.lang.String entitytablename,
           long entityrecordid,
           java.lang.Long rank) {
        super(
            recordid);
        this.entitytablename = entitytablename;
        this.entityrecordid = entityrecordid;
        this.rank = rank;
    }


    /**
     * Gets the entitytablename value for this CFolderItem.
     * 
     * @return entitytablename
     */
    public java.lang.String getEntitytablename() {
        return entitytablename;
    }


    /**
     * Sets the entitytablename value for this CFolderItem.
     * 
     * @param entitytablename
     */
    public void setEntitytablename(java.lang.String entitytablename) {
        this.entitytablename = entitytablename;
    }


    /**
     * Gets the entityrecordid value for this CFolderItem.
     * 
     * @return entityrecordid
     */
    public long getEntityrecordid() {
        return entityrecordid;
    }


    /**
     * Sets the entityrecordid value for this CFolderItem.
     * 
     * @param entityrecordid
     */
    public void setEntityrecordid(long entityrecordid) {
        this.entityrecordid = entityrecordid;
    }


    /**
     * Gets the rank value for this CFolderItem.
     * 
     * @return rank
     */
    public java.lang.Long getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this CFolderItem.
     * 
     * @param rank
     */
    public void setRank(java.lang.Long rank) {
        this.rank = rank;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFolderItem)) return false;
        CFolderItem other = (CFolderItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entitytablename==null && other.getEntitytablename()==null) || 
             (this.entitytablename!=null &&
              this.entitytablename.equals(other.getEntitytablename()))) &&
            this.entityrecordid == other.getEntityrecordid() &&
            ((this.rank==null && other.getRank()==null) || 
             (this.rank!=null &&
              this.rank.equals(other.getRank())));
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
        if (getEntitytablename() != null) {
            _hashCode += getEntitytablename().hashCode();
        }
        _hashCode += new Long(getEntityrecordid()).hashCode();
        if (getRank() != null) {
            _hashCode += getRank().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFolderItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFolderItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitytablename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entitytablename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityrecordid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityrecordid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
