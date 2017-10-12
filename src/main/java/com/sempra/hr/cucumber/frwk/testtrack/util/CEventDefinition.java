/**
 * CEventDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * Contains all information needed to define a CEvent object. It contains
 * a list of xsd:boolean members that indicate which event fields are
 * present for this particular event. This is a read-only object.
 */
public class CEventDefinition  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Boolean user;

    private java.lang.Boolean datetime;

    private java.lang.Boolean notes;

    private java.lang.Boolean resultingState;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] resultingStateValues;

    private java.lang.Boolean fileattachments;

    private java.lang.Boolean timeTracking;

    private java.lang.Boolean timeSumOfAll;

    private java.lang.Boolean timeHoursSinceLast;

    private java.lang.Boolean newAssignment;

    private java.lang.Boolean releaseNotes;

    private java.lang.Boolean marksuspect;

    private java.lang.Boolean reviewnote;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFields;

    public CEventDefinition() {
    }

    public CEventDefinition(
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
           this.name = name;
           this.user = user;
           this.datetime = datetime;
           this.notes = notes;
           this.resultingState = resultingState;
           this.resultingStateValues = resultingStateValues;
           this.fileattachments = fileattachments;
           this.timeTracking = timeTracking;
           this.timeSumOfAll = timeSumOfAll;
           this.timeHoursSinceLast = timeHoursSinceLast;
           this.newAssignment = newAssignment;
           this.releaseNotes = releaseNotes;
           this.marksuspect = marksuspect;
           this.reviewnote = reviewnote;
           this.customFields = customFields;
    }


    /**
     * Gets the name value for this CEventDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CEventDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the user value for this CEventDefinition.
     * 
     * @return user
     */
    public java.lang.Boolean getUser() {
        return user;
    }


    /**
     * Sets the user value for this CEventDefinition.
     * 
     * @param user
     */
    public void setUser(java.lang.Boolean user) {
        this.user = user;
    }


    /**
     * Gets the datetime value for this CEventDefinition.
     * 
     * @return datetime
     */
    public java.lang.Boolean getDatetime() {
        return datetime;
    }


    /**
     * Sets the datetime value for this CEventDefinition.
     * 
     * @param datetime
     */
    public void setDatetime(java.lang.Boolean datetime) {
        this.datetime = datetime;
    }


    /**
     * Gets the notes value for this CEventDefinition.
     * 
     * @return notes
     */
    public java.lang.Boolean getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CEventDefinition.
     * 
     * @param notes
     */
    public void setNotes(java.lang.Boolean notes) {
        this.notes = notes;
    }


    /**
     * Gets the resultingState value for this CEventDefinition.
     * 
     * @return resultingState
     */
    public java.lang.Boolean getResultingState() {
        return resultingState;
    }


    /**
     * Sets the resultingState value for this CEventDefinition.
     * 
     * @param resultingState
     */
    public void setResultingState(java.lang.Boolean resultingState) {
        this.resultingState = resultingState;
    }


    /**
     * Gets the resultingStateValues value for this CEventDefinition.
     * 
     * @return resultingStateValues
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] getResultingStateValues() {
        return resultingStateValues;
    }


    /**
     * Sets the resultingStateValues value for this CEventDefinition.
     * 
     * @param resultingStateValues
     */
    public void setResultingStateValues(com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] resultingStateValues) {
        this.resultingStateValues = resultingStateValues;
    }


    /**
     * Gets the fileattachments value for this CEventDefinition.
     * 
     * @return fileattachments
     */
    public java.lang.Boolean getFileattachments() {
        return fileattachments;
    }


    /**
     * Sets the fileattachments value for this CEventDefinition.
     * 
     * @param fileattachments
     */
    public void setFileattachments(java.lang.Boolean fileattachments) {
        this.fileattachments = fileattachments;
    }


    /**
     * Gets the timeTracking value for this CEventDefinition.
     * 
     * @return timeTracking
     */
    public java.lang.Boolean getTimeTracking() {
        return timeTracking;
    }


    /**
     * Sets the timeTracking value for this CEventDefinition.
     * 
     * @param timeTracking
     */
    public void setTimeTracking(java.lang.Boolean timeTracking) {
        this.timeTracking = timeTracking;
    }


    /**
     * Gets the timeSumOfAll value for this CEventDefinition.
     * 
     * @return timeSumOfAll
     */
    public java.lang.Boolean getTimeSumOfAll() {
        return timeSumOfAll;
    }


    /**
     * Sets the timeSumOfAll value for this CEventDefinition.
     * 
     * @param timeSumOfAll
     */
    public void setTimeSumOfAll(java.lang.Boolean timeSumOfAll) {
        this.timeSumOfAll = timeSumOfAll;
    }


    /**
     * Gets the timeHoursSinceLast value for this CEventDefinition.
     * 
     * @return timeHoursSinceLast
     */
    public java.lang.Boolean getTimeHoursSinceLast() {
        return timeHoursSinceLast;
    }


    /**
     * Sets the timeHoursSinceLast value for this CEventDefinition.
     * 
     * @param timeHoursSinceLast
     */
    public void setTimeHoursSinceLast(java.lang.Boolean timeHoursSinceLast) {
        this.timeHoursSinceLast = timeHoursSinceLast;
    }


    /**
     * Gets the newAssignment value for this CEventDefinition.
     * 
     * @return newAssignment
     */
    public java.lang.Boolean getNewAssignment() {
        return newAssignment;
    }


    /**
     * Sets the newAssignment value for this CEventDefinition.
     * 
     * @param newAssignment
     */
    public void setNewAssignment(java.lang.Boolean newAssignment) {
        this.newAssignment = newAssignment;
    }


    /**
     * Gets the releaseNotes value for this CEventDefinition.
     * 
     * @return releaseNotes
     */
    public java.lang.Boolean getReleaseNotes() {
        return releaseNotes;
    }


    /**
     * Sets the releaseNotes value for this CEventDefinition.
     * 
     * @param releaseNotes
     */
    public void setReleaseNotes(java.lang.Boolean releaseNotes) {
        this.releaseNotes = releaseNotes;
    }


    /**
     * Gets the marksuspect value for this CEventDefinition.
     * 
     * @return marksuspect
     */
    public java.lang.Boolean getMarksuspect() {
        return marksuspect;
    }


    /**
     * Sets the marksuspect value for this CEventDefinition.
     * 
     * @param marksuspect
     */
    public void setMarksuspect(java.lang.Boolean marksuspect) {
        this.marksuspect = marksuspect;
    }


    /**
     * Gets the reviewnote value for this CEventDefinition.
     * 
     * @return reviewnote
     */
    public java.lang.Boolean getReviewnote() {
        return reviewnote;
    }


    /**
     * Sets the reviewnote value for this CEventDefinition.
     * 
     * @param reviewnote
     */
    public void setReviewnote(java.lang.Boolean reviewnote) {
        this.reviewnote = reviewnote;
    }


    /**
     * Gets the customFields value for this CEventDefinition.
     * 
     * @return customFields
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CField[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this CEventDefinition.
     * 
     * @param customFields
     */
    public void setCustomFields(com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFields) {
        this.customFields = customFields;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CEventDefinition)) return false;
        CEventDefinition other = (CEventDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.datetime==null && other.getDatetime()==null) || 
             (this.datetime!=null &&
              this.datetime.equals(other.getDatetime()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.resultingState==null && other.getResultingState()==null) || 
             (this.resultingState!=null &&
              this.resultingState.equals(other.getResultingState()))) &&
            ((this.resultingStateValues==null && other.getResultingStateValues()==null) || 
             (this.resultingStateValues!=null &&
              java.util.Arrays.equals(this.resultingStateValues, other.getResultingStateValues()))) &&
            ((this.fileattachments==null && other.getFileattachments()==null) || 
             (this.fileattachments!=null &&
              this.fileattachments.equals(other.getFileattachments()))) &&
            ((this.timeTracking==null && other.getTimeTracking()==null) || 
             (this.timeTracking!=null &&
              this.timeTracking.equals(other.getTimeTracking()))) &&
            ((this.timeSumOfAll==null && other.getTimeSumOfAll()==null) || 
             (this.timeSumOfAll!=null &&
              this.timeSumOfAll.equals(other.getTimeSumOfAll()))) &&
            ((this.timeHoursSinceLast==null && other.getTimeHoursSinceLast()==null) || 
             (this.timeHoursSinceLast!=null &&
              this.timeHoursSinceLast.equals(other.getTimeHoursSinceLast()))) &&
            ((this.newAssignment==null && other.getNewAssignment()==null) || 
             (this.newAssignment!=null &&
              this.newAssignment.equals(other.getNewAssignment()))) &&
            ((this.releaseNotes==null && other.getReleaseNotes()==null) || 
             (this.releaseNotes!=null &&
              this.releaseNotes.equals(other.getReleaseNotes()))) &&
            ((this.marksuspect==null && other.getMarksuspect()==null) || 
             (this.marksuspect!=null &&
              this.marksuspect.equals(other.getMarksuspect()))) &&
            ((this.reviewnote==null && other.getReviewnote()==null) || 
             (this.reviewnote!=null &&
              this.reviewnote.equals(other.getReviewnote()))) &&
            ((this.customFields==null && other.getCustomFields()==null) || 
             (this.customFields!=null &&
              java.util.Arrays.equals(this.customFields, other.getCustomFields())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getDatetime() != null) {
            _hashCode += getDatetime().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getResultingState() != null) {
            _hashCode += getResultingState().hashCode();
        }
        if (getResultingStateValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultingStateValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultingStateValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileattachments() != null) {
            _hashCode += getFileattachments().hashCode();
        }
        if (getTimeTracking() != null) {
            _hashCode += getTimeTracking().hashCode();
        }
        if (getTimeSumOfAll() != null) {
            _hashCode += getTimeSumOfAll().hashCode();
        }
        if (getTimeHoursSinceLast() != null) {
            _hashCode += getTimeHoursSinceLast().hashCode();
        }
        if (getNewAssignment() != null) {
            _hashCode += getNewAssignment().hashCode();
        }
        if (getReleaseNotes() != null) {
            _hashCode += getReleaseNotes().hashCode();
        }
        if (getMarksuspect() != null) {
            _hashCode += getMarksuspect().hashCode();
        }
        if (getReviewnote() != null) {
            _hashCode += getReviewnote().hashCode();
        }
        if (getCustomFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFields(), i);
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
        new org.apache.axis.description.TypeDesc(CEventDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CEventDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultingState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultingState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultingStateValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultingStateValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileattachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileattachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeTracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSumOfAll");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeSumOfAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeHoursSinceLast");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeHoursSinceLast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marksuspect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marksuspect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewnote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reviewnote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CField"));
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
