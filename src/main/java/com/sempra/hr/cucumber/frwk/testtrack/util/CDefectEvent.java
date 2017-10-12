/**
 * CDefectEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * Deprecated; use CEvent
 */
public class CDefectEvent  extends com.sempra.hr.cucumber.frwk.testtrack.util.CEvent  implements java.io.Serializable {
    public CDefectEvent() {
    }

    public CDefectEvent(
           long recordid,
           java.lang.String user,
           java.util.Calendar date,
           java.lang.String notes,
           short eventaddorder,
           java.lang.String name,
           java.lang.Long parenteventid,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentlist,
           com.sempra.hr.cucumber.frwk.testtrack.util.CField[] fieldlist,
           java.lang.String resultingstate,
           java.lang.Double hours,
           java.lang.String[] assigntolist,
           java.lang.String releasenotesversion,
           java.lang.String generatedeventtype,
           java.lang.String generatedbyname,
           java.lang.Double totaltimespent,
           java.lang.String overrideuser,
           java.lang.Boolean marksuspect) {
        super(
            recordid,
            user,
            date,
            notes,
            eventaddorder,
            name,
            parenteventid,
            attachmentlist,
            fieldlist,
            resultingstate,
            hours,
            assigntolist,
            releasenotesversion,
            generatedeventtype,
            generatedbyname,
            totaltimespent,
            overrideuser,
            marksuspect);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDefectEvent)) return false;
        CDefectEvent other = (CDefectEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDefectEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CDefectEvent"));
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
