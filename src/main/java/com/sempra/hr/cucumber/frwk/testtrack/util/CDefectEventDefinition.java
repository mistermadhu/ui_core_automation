/**
 * CDefectEventDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * Deprecated; use CEventDefinition
 */
public class CDefectEventDefinition  extends com.sempra.hr.cucumber.frwk.testtrack.util.CEventDefinition  implements java.io.Serializable {
    public CDefectEventDefinition() {
    }

    public CDefectEventDefinition(
           java.lang.String name,
           java.lang.Boolean user,
           java.lang.Boolean datetime,
           java.lang.Boolean notes,
           java.lang.Boolean resultingState,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] resultingStateValues,
           java.lang.Boolean fileattachments,
           java.lang.Boolean timeTracking,
           java.lang.Boolean timeSumOfAll,
           java.lang.Boolean timeHoursSinceLast,
           java.lang.Boolean newAssignment,
           java.lang.Boolean releaseNotes,
           java.lang.Boolean marksuspect,
           java.lang.Boolean reviewnote,
           com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFields) {
        super(
            name,
            user,
            datetime,
            notes,
            resultingState,
            resultingStateValues,
            fileattachments,
            timeTracking,
            timeSumOfAll,
            timeHoursSinceLast,
            newAssignment,
            releaseNotes,
            marksuspect,
            reviewnote,
            customFields);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDefectEventDefinition)) return false;
        CDefectEventDefinition other = (CDefectEventDefinition) obj;
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
        new org.apache.axis.description.TypeDesc(CDefectEventDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CDefectEventDefinition"));
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
