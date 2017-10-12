/**
 * CProject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CProject  implements java.io.Serializable {
    private com.sempra.hr.cucumber.frwk.testtrack.util.CDatabase database;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CProjectDataOption[] options;

    private java.lang.Integer servernumber;

    public CProject() {
    }

    public CProject(
           com.sempra.hr.cucumber.frwk.testtrack.util.CDatabase database,
           com.sempra.hr.cucumber.frwk.testtrack.util.CProjectDataOption[] options,
           java.lang.Integer servernumber) {
           this.database = database;
           this.options = options;
           this.servernumber = servernumber;
    }


    /**
     * Gets the database value for this CProject.
     * 
     * @return database
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CDatabase getDatabase() {
        return database;
    }


    /**
     * Sets the database value for this CProject.
     * 
     * @param database
     */
    public void setDatabase(com.sempra.hr.cucumber.frwk.testtrack.util.CDatabase database) {
        this.database = database;
    }


    /**
     * Gets the options value for this CProject.
     * 
     * @return options
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CProjectDataOption[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this CProject.
     * 
     * @param options
     */
    public void setOptions(com.sempra.hr.cucumber.frwk.testtrack.util.CProjectDataOption[] options) {
        this.options = options;
    }


    /**
     * Gets the servernumber value for this CProject.
     * 
     * @return servernumber
     */
    public java.lang.Integer getServernumber() {
        return servernumber;
    }


    /**
     * Sets the servernumber value for this CProject.
     * 
     * @param servernumber
     */
    public void setServernumber(java.lang.Integer servernumber) {
        this.servernumber = servernumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CProject)) return false;
        CProject other = (CProject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.database==null && other.getDatabase()==null) || 
             (this.database!=null &&
              this.database.equals(other.getDatabase()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.servernumber==null && other.getServernumber()==null) || 
             (this.servernumber!=null &&
              this.servernumber.equals(other.getServernumber())));
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
        if (getDatabase() != null) {
            _hashCode += getDatabase().hashCode();
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServernumber() != null) {
            _hashCode += getServernumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CProject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CProject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("database");
        elemField.setXmlName(new javax.xml.namespace.QName("", "database"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CDatabase"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CProjectDataOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servernumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servernumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
