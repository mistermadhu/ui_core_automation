/**
 * CTask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * Inherits from CItemToTrack. Stores task fields tracked by the TestTrack
 * Server. The addTask, editTask, getTask, and saveTask requests use
 * this structure.
 */
public class CTask  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String priority;

    private java.lang.String summary;

    private java.lang.String description;

    private java.util.Date datedue;

    private java.util.Date dateassigned;

    private java.lang.String versiondue;

    private java.lang.String assignedto;

    private java.lang.String assignedby;

    private java.lang.Long assigneddefect;

    public CTask() {
    }

    public CTask(
           long recordid,
           java.lang.String status,
           java.lang.String priority,
           java.lang.String summary,
           java.lang.String description,
           java.util.Date datedue,
           java.util.Date dateassigned,
           java.lang.String versiondue,
           java.lang.String assignedto,
           java.lang.String assignedby,
           java.lang.Long assigneddefect) {
        super(
            recordid);
        this.status = status;
        this.priority = priority;
        this.summary = summary;
        this.description = description;
        this.datedue = datedue;
        this.dateassigned = dateassigned;
        this.versiondue = versiondue;
        this.assignedto = assignedto;
        this.assignedby = assignedby;
        this.assigneddefect = assigneddefect;
    }


    /**
     * Gets the status value for this CTask.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CTask.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the priority value for this CTask.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CTask.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the summary value for this CTask.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this CTask.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the description value for this CTask.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CTask.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the datedue value for this CTask.
     * 
     * @return datedue
     */
    public java.util.Date getDatedue() {
        return datedue;
    }


    /**
     * Sets the datedue value for this CTask.
     * 
     * @param datedue
     */
    public void setDatedue(java.util.Date datedue) {
        this.datedue = datedue;
    }


    /**
     * Gets the dateassigned value for this CTask.
     * 
     * @return dateassigned
     */
    public java.util.Date getDateassigned() {
        return dateassigned;
    }


    /**
     * Sets the dateassigned value for this CTask.
     * 
     * @param dateassigned
     */
    public void setDateassigned(java.util.Date dateassigned) {
        this.dateassigned = dateassigned;
    }


    /**
     * Gets the versiondue value for this CTask.
     * 
     * @return versiondue
     */
    public java.lang.String getVersiondue() {
        return versiondue;
    }


    /**
     * Sets the versiondue value for this CTask.
     * 
     * @param versiondue
     */
    public void setVersiondue(java.lang.String versiondue) {
        this.versiondue = versiondue;
    }


    /**
     * Gets the assignedto value for this CTask.
     * 
     * @return assignedto
     */
    public java.lang.String getAssignedto() {
        return assignedto;
    }


    /**
     * Sets the assignedto value for this CTask.
     * 
     * @param assignedto
     */
    public void setAssignedto(java.lang.String assignedto) {
        this.assignedto = assignedto;
    }


    /**
     * Gets the assignedby value for this CTask.
     * 
     * @return assignedby
     */
    public java.lang.String getAssignedby() {
        return assignedby;
    }


    /**
     * Sets the assignedby value for this CTask.
     * 
     * @param assignedby
     */
    public void setAssignedby(java.lang.String assignedby) {
        this.assignedby = assignedby;
    }


    /**
     * Gets the assigneddefect value for this CTask.
     * 
     * @return assigneddefect
     */
    public java.lang.Long getAssigneddefect() {
        return assigneddefect;
    }


    /**
     * Sets the assigneddefect value for this CTask.
     * 
     * @param assigneddefect
     */
    public void setAssigneddefect(java.lang.Long assigneddefect) {
        this.assigneddefect = assigneddefect;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CTask)) return false;
        CTask other = (CTask) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.datedue==null && other.getDatedue()==null) || 
             (this.datedue!=null &&
              this.datedue.equals(other.getDatedue()))) &&
            ((this.dateassigned==null && other.getDateassigned()==null) || 
             (this.dateassigned!=null &&
              this.dateassigned.equals(other.getDateassigned()))) &&
            ((this.versiondue==null && other.getVersiondue()==null) || 
             (this.versiondue!=null &&
              this.versiondue.equals(other.getVersiondue()))) &&
            ((this.assignedto==null && other.getAssignedto()==null) || 
             (this.assignedto!=null &&
              this.assignedto.equals(other.getAssignedto()))) &&
            ((this.assignedby==null && other.getAssignedby()==null) || 
             (this.assignedby!=null &&
              this.assignedby.equals(other.getAssignedby()))) &&
            ((this.assigneddefect==null && other.getAssigneddefect()==null) || 
             (this.assigneddefect!=null &&
              this.assigneddefect.equals(other.getAssigneddefect())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDatedue() != null) {
            _hashCode += getDatedue().hashCode();
        }
        if (getDateassigned() != null) {
            _hashCode += getDateassigned().hashCode();
        }
        if (getVersiondue() != null) {
            _hashCode += getVersiondue().hashCode();
        }
        if (getAssignedto() != null) {
            _hashCode += getAssignedto().hashCode();
        }
        if (getAssignedby() != null) {
            _hashCode += getAssignedby().hashCode();
        }
        if (getAssigneddefect() != null) {
            _hashCode += getAssigneddefect().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CTask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CTask"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datedue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datedue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateassigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateassigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versiondue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versiondue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignedto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedby");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignedby"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigneddefect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigneddefect"));
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
