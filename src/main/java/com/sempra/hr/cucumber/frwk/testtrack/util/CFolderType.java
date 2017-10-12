/**
 * CFolderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CFolderType  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String description;

    private java.lang.Boolean allowweb;

    private java.lang.Boolean allowdetails;

    private java.lang.Boolean releaseplanning;

    private java.lang.Boolean isactive;

    private java.lang.Boolean taskboardenabled;

    private java.lang.String defaulttaskboardname;

    public CFolderType() {
    }

    public CFolderType(
           long recordid,
           java.lang.String name,
           java.lang.String description,
           java.lang.Boolean allowweb,
           java.lang.Boolean allowdetails,
           java.lang.Boolean releaseplanning,
           java.lang.Boolean isactive,
           java.lang.Boolean taskboardenabled,
           java.lang.String defaulttaskboardname) {
        super(
            recordid);
        this.name = name;
        this.description = description;
        this.allowweb = allowweb;
        this.allowdetails = allowdetails;
        this.releaseplanning = releaseplanning;
        this.isactive = isactive;
        this.taskboardenabled = taskboardenabled;
        this.defaulttaskboardname = defaulttaskboardname;
    }


    /**
     * Gets the name value for this CFolderType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CFolderType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this CFolderType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CFolderType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the allowweb value for this CFolderType.
     * 
     * @return allowweb
     */
    public java.lang.Boolean getAllowweb() {
        return allowweb;
    }


    /**
     * Sets the allowweb value for this CFolderType.
     * 
     * @param allowweb
     */
    public void setAllowweb(java.lang.Boolean allowweb) {
        this.allowweb = allowweb;
    }


    /**
     * Gets the allowdetails value for this CFolderType.
     * 
     * @return allowdetails
     */
    public java.lang.Boolean getAllowdetails() {
        return allowdetails;
    }


    /**
     * Sets the allowdetails value for this CFolderType.
     * 
     * @param allowdetails
     */
    public void setAllowdetails(java.lang.Boolean allowdetails) {
        this.allowdetails = allowdetails;
    }


    /**
     * Gets the releaseplanning value for this CFolderType.
     * 
     * @return releaseplanning
     */
    public java.lang.Boolean getReleaseplanning() {
        return releaseplanning;
    }


    /**
     * Sets the releaseplanning value for this CFolderType.
     * 
     * @param releaseplanning
     */
    public void setReleaseplanning(java.lang.Boolean releaseplanning) {
        this.releaseplanning = releaseplanning;
    }


    /**
     * Gets the isactive value for this CFolderType.
     * 
     * @return isactive
     */
    public java.lang.Boolean getIsactive() {
        return isactive;
    }


    /**
     * Sets the isactive value for this CFolderType.
     * 
     * @param isactive
     */
    public void setIsactive(java.lang.Boolean isactive) {
        this.isactive = isactive;
    }


    /**
     * Gets the taskboardenabled value for this CFolderType.
     * 
     * @return taskboardenabled
     */
    public java.lang.Boolean getTaskboardenabled() {
        return taskboardenabled;
    }


    /**
     * Sets the taskboardenabled value for this CFolderType.
     * 
     * @param taskboardenabled
     */
    public void setTaskboardenabled(java.lang.Boolean taskboardenabled) {
        this.taskboardenabled = taskboardenabled;
    }


    /**
     * Gets the defaulttaskboardname value for this CFolderType.
     * 
     * @return defaulttaskboardname
     */
    public java.lang.String getDefaulttaskboardname() {
        return defaulttaskboardname;
    }


    /**
     * Sets the defaulttaskboardname value for this CFolderType.
     * 
     * @param defaulttaskboardname
     */
    public void setDefaulttaskboardname(java.lang.String defaulttaskboardname) {
        this.defaulttaskboardname = defaulttaskboardname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFolderType)) return false;
        CFolderType other = (CFolderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.allowweb==null && other.getAllowweb()==null) || 
             (this.allowweb!=null &&
              this.allowweb.equals(other.getAllowweb()))) &&
            ((this.allowdetails==null && other.getAllowdetails()==null) || 
             (this.allowdetails!=null &&
              this.allowdetails.equals(other.getAllowdetails()))) &&
            ((this.releaseplanning==null && other.getReleaseplanning()==null) || 
             (this.releaseplanning!=null &&
              this.releaseplanning.equals(other.getReleaseplanning()))) &&
            ((this.isactive==null && other.getIsactive()==null) || 
             (this.isactive!=null &&
              this.isactive.equals(other.getIsactive()))) &&
            ((this.taskboardenabled==null && other.getTaskboardenabled()==null) || 
             (this.taskboardenabled!=null &&
              this.taskboardenabled.equals(other.getTaskboardenabled()))) &&
            ((this.defaulttaskboardname==null && other.getDefaulttaskboardname()==null) || 
             (this.defaulttaskboardname!=null &&
              this.defaulttaskboardname.equals(other.getDefaulttaskboardname())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAllowweb() != null) {
            _hashCode += getAllowweb().hashCode();
        }
        if (getAllowdetails() != null) {
            _hashCode += getAllowdetails().hashCode();
        }
        if (getReleaseplanning() != null) {
            _hashCode += getReleaseplanning().hashCode();
        }
        if (getIsactive() != null) {
            _hashCode += getIsactive().hashCode();
        }
        if (getTaskboardenabled() != null) {
            _hashCode += getTaskboardenabled().hashCode();
        }
        if (getDefaulttaskboardname() != null) {
            _hashCode += getDefaulttaskboardname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFolderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFolderType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowweb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowweb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowdetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowdetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseplanning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseplanning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isactive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskboardenabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskboardenabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaulttaskboardname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaulttaskboardname"));
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
