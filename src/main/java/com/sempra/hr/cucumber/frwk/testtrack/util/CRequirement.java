/**
 * CRequirement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CRequirement  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack  implements java.io.Serializable {
    private java.lang.Long number;

    private java.lang.String type;

    private java.lang.String summary;

    private java.lang.String tag;

    private java.util.Date dateEntered;

    private java.lang.String enteredBy;

    private java.lang.String importance;

    private java.lang.String description;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] descriptionInlineAttachList;

    private java.lang.String state;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentList;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] sccFileList;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFieldList;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] eventList;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CVersionInfo[] versionList;

    private java.util.Calendar dateTimeCreated;

    private java.lang.String createdByUser;

    private java.lang.String locationAddedFrom;

    private java.lang.String modifiedByUser;

    private java.util.Calendar dateTimeModified;

    private java.lang.Double actualHours;

    private java.lang.Double estimatedHours;

    private java.lang.Double remainingHours;

    private java.lang.Double variance;

    private java.lang.Long storyPoints;

    private java.lang.Long percentDone;

    public CRequirement() {
    }

    public CRequirement(
           long recordid,
           java.lang.Long number,
           java.lang.String type,
           java.lang.String summary,
           java.lang.String tag,
           java.util.Date dateEntered,
           java.lang.String enteredBy,
           java.lang.String importance,
           java.lang.String description,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] descriptionInlineAttachList,
           java.lang.String state,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentList,
           com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] sccFileList,
           com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFieldList,
           com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] eventList,
           com.sempra.hr.cucumber.frwk.testtrack.util.CVersionInfo[] versionList,
           java.util.Calendar dateTimeCreated,
           java.lang.String createdByUser,
           java.lang.String locationAddedFrom,
           java.lang.String modifiedByUser,
           java.util.Calendar dateTimeModified,
           java.lang.Double actualHours,
           java.lang.Double estimatedHours,
           java.lang.Double remainingHours,
           java.lang.Double variance,
           java.lang.Long storyPoints,
           java.lang.Long percentDone) {
        super(
            recordid);
        this.number = number;
        this.type = type;
        this.summary = summary;
        this.tag = tag;
        this.dateEntered = dateEntered;
        this.enteredBy = enteredBy;
        this.importance = importance;
        this.description = description;
        this.descriptionInlineAttachList = descriptionInlineAttachList;
        this.state = state;
        this.attachmentList = attachmentList;
        this.sccFileList = sccFileList;
        this.customFieldList = customFieldList;
        this.eventList = eventList;
        this.versionList = versionList;
        this.dateTimeCreated = dateTimeCreated;
        this.createdByUser = createdByUser;
        this.locationAddedFrom = locationAddedFrom;
        this.modifiedByUser = modifiedByUser;
        this.dateTimeModified = dateTimeModified;
        this.actualHours = actualHours;
        this.estimatedHours = estimatedHours;
        this.remainingHours = remainingHours;
        this.variance = variance;
        this.storyPoints = storyPoints;
        this.percentDone = percentDone;
    }


    /**
     * Gets the number value for this CRequirement.
     * 
     * @return number
     */
    public java.lang.Long getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CRequirement.
     * 
     * @param number
     */
    public void setNumber(java.lang.Long number) {
        this.number = number;
    }


    /**
     * Gets the type value for this CRequirement.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CRequirement.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the summary value for this CRequirement.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this CRequirement.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the tag value for this CRequirement.
     * 
     * @return tag
     */
    public java.lang.String getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this CRequirement.
     * 
     * @param tag
     */
    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }


    /**
     * Gets the dateEntered value for this CRequirement.
     * 
     * @return dateEntered
     */
    public java.util.Date getDateEntered() {
        return dateEntered;
    }


    /**
     * Sets the dateEntered value for this CRequirement.
     * 
     * @param dateEntered
     */
    public void setDateEntered(java.util.Date dateEntered) {
        this.dateEntered = dateEntered;
    }


    /**
     * Gets the enteredBy value for this CRequirement.
     * 
     * @return enteredBy
     */
    public java.lang.String getEnteredBy() {
        return enteredBy;
    }


    /**
     * Sets the enteredBy value for this CRequirement.
     * 
     * @param enteredBy
     */
    public void setEnteredBy(java.lang.String enteredBy) {
        this.enteredBy = enteredBy;
    }


    /**
     * Gets the importance value for this CRequirement.
     * 
     * @return importance
     */
    public java.lang.String getImportance() {
        return importance;
    }


    /**
     * Sets the importance value for this CRequirement.
     * 
     * @param importance
     */
    public void setImportance(java.lang.String importance) {
        this.importance = importance;
    }


    /**
     * Gets the description value for this CRequirement.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CRequirement.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the descriptionInlineAttachList value for this CRequirement.
     * 
     * @return descriptionInlineAttachList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] getDescriptionInlineAttachList() {
        return descriptionInlineAttachList;
    }


    /**
     * Sets the descriptionInlineAttachList value for this CRequirement.
     * 
     * @param descriptionInlineAttachList
     */
    public void setDescriptionInlineAttachList(com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] descriptionInlineAttachList) {
        this.descriptionInlineAttachList = descriptionInlineAttachList;
    }


    /**
     * Gets the state value for this CRequirement.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this CRequirement.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the attachmentList value for this CRequirement.
     * 
     * @return attachmentList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] getAttachmentList() {
        return attachmentList;
    }


    /**
     * Sets the attachmentList value for this CRequirement.
     * 
     * @param attachmentList
     */
    public void setAttachmentList(com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentList) {
        this.attachmentList = attachmentList;
    }


    /**
     * Gets the sccFileList value for this CRequirement.
     * 
     * @return sccFileList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] getSccFileList() {
        return sccFileList;
    }


    /**
     * Sets the sccFileList value for this CRequirement.
     * 
     * @param sccFileList
     */
    public void setSccFileList(com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] sccFileList) {
        this.sccFileList = sccFileList;
    }


    /**
     * Gets the customFieldList value for this CRequirement.
     * 
     * @return customFieldList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CField[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CRequirement.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the eventList value for this CRequirement.
     * 
     * @return eventList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] getEventList() {
        return eventList;
    }


    /**
     * Sets the eventList value for this CRequirement.
     * 
     * @param eventList
     */
    public void setEventList(com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] eventList) {
        this.eventList = eventList;
    }


    /**
     * Gets the versionList value for this CRequirement.
     * 
     * @return versionList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CVersionInfo[] getVersionList() {
        return versionList;
    }


    /**
     * Sets the versionList value for this CRequirement.
     * 
     * @param versionList
     */
    public void setVersionList(com.sempra.hr.cucumber.frwk.testtrack.util.CVersionInfo[] versionList) {
        this.versionList = versionList;
    }


    /**
     * Gets the dateTimeCreated value for this CRequirement.
     * 
     * @return dateTimeCreated
     */
    public java.util.Calendar getDateTimeCreated() {
        return dateTimeCreated;
    }


    /**
     * Sets the dateTimeCreated value for this CRequirement.
     * 
     * @param dateTimeCreated
     */
    public void setDateTimeCreated(java.util.Calendar dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }


    /**
     * Gets the createdByUser value for this CRequirement.
     * 
     * @return createdByUser
     */
    public java.lang.String getCreatedByUser() {
        return createdByUser;
    }


    /**
     * Sets the createdByUser value for this CRequirement.
     * 
     * @param createdByUser
     */
    public void setCreatedByUser(java.lang.String createdByUser) {
        this.createdByUser = createdByUser;
    }


    /**
     * Gets the locationAddedFrom value for this CRequirement.
     * 
     * @return locationAddedFrom
     */
    public java.lang.String getLocationAddedFrom() {
        return locationAddedFrom;
    }


    /**
     * Sets the locationAddedFrom value for this CRequirement.
     * 
     * @param locationAddedFrom
     */
    public void setLocationAddedFrom(java.lang.String locationAddedFrom) {
        this.locationAddedFrom = locationAddedFrom;
    }


    /**
     * Gets the modifiedByUser value for this CRequirement.
     * 
     * @return modifiedByUser
     */
    public java.lang.String getModifiedByUser() {
        return modifiedByUser;
    }


    /**
     * Sets the modifiedByUser value for this CRequirement.
     * 
     * @param modifiedByUser
     */
    public void setModifiedByUser(java.lang.String modifiedByUser) {
        this.modifiedByUser = modifiedByUser;
    }


    /**
     * Gets the dateTimeModified value for this CRequirement.
     * 
     * @return dateTimeModified
     */
    public java.util.Calendar getDateTimeModified() {
        return dateTimeModified;
    }


    /**
     * Sets the dateTimeModified value for this CRequirement.
     * 
     * @param dateTimeModified
     */
    public void setDateTimeModified(java.util.Calendar dateTimeModified) {
        this.dateTimeModified = dateTimeModified;
    }


    /**
     * Gets the actualHours value for this CRequirement.
     * 
     * @return actualHours
     */
    public java.lang.Double getActualHours() {
        return actualHours;
    }


    /**
     * Sets the actualHours value for this CRequirement.
     * 
     * @param actualHours
     */
    public void setActualHours(java.lang.Double actualHours) {
        this.actualHours = actualHours;
    }


    /**
     * Gets the estimatedHours value for this CRequirement.
     * 
     * @return estimatedHours
     */
    public java.lang.Double getEstimatedHours() {
        return estimatedHours;
    }


    /**
     * Sets the estimatedHours value for this CRequirement.
     * 
     * @param estimatedHours
     */
    public void setEstimatedHours(java.lang.Double estimatedHours) {
        this.estimatedHours = estimatedHours;
    }


    /**
     * Gets the remainingHours value for this CRequirement.
     * 
     * @return remainingHours
     */
    public java.lang.Double getRemainingHours() {
        return remainingHours;
    }


    /**
     * Sets the remainingHours value for this CRequirement.
     * 
     * @param remainingHours
     */
    public void setRemainingHours(java.lang.Double remainingHours) {
        this.remainingHours = remainingHours;
    }


    /**
     * Gets the variance value for this CRequirement.
     * 
     * @return variance
     */
    public java.lang.Double getVariance() {
        return variance;
    }


    /**
     * Sets the variance value for this CRequirement.
     * 
     * @param variance
     */
    public void setVariance(java.lang.Double variance) {
        this.variance = variance;
    }


    /**
     * Gets the storyPoints value for this CRequirement.
     * 
     * @return storyPoints
     */
    public java.lang.Long getStoryPoints() {
        return storyPoints;
    }


    /**
     * Sets the storyPoints value for this CRequirement.
     * 
     * @param storyPoints
     */
    public void setStoryPoints(java.lang.Long storyPoints) {
        this.storyPoints = storyPoints;
    }


    /**
     * Gets the percentDone value for this CRequirement.
     * 
     * @return percentDone
     */
    public java.lang.Long getPercentDone() {
        return percentDone;
    }


    /**
     * Sets the percentDone value for this CRequirement.
     * 
     * @param percentDone
     */
    public void setPercentDone(java.lang.Long percentDone) {
        this.percentDone = percentDone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CRequirement)) return false;
        CRequirement other = (CRequirement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag()))) &&
            ((this.dateEntered==null && other.getDateEntered()==null) || 
             (this.dateEntered!=null &&
              this.dateEntered.equals(other.getDateEntered()))) &&
            ((this.enteredBy==null && other.getEnteredBy()==null) || 
             (this.enteredBy!=null &&
              this.enteredBy.equals(other.getEnteredBy()))) &&
            ((this.importance==null && other.getImportance()==null) || 
             (this.importance!=null &&
              this.importance.equals(other.getImportance()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.descriptionInlineAttachList==null && other.getDescriptionInlineAttachList()==null) || 
             (this.descriptionInlineAttachList!=null &&
              java.util.Arrays.equals(this.descriptionInlineAttachList, other.getDescriptionInlineAttachList()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.attachmentList==null && other.getAttachmentList()==null) || 
             (this.attachmentList!=null &&
              java.util.Arrays.equals(this.attachmentList, other.getAttachmentList()))) &&
            ((this.sccFileList==null && other.getSccFileList()==null) || 
             (this.sccFileList!=null &&
              java.util.Arrays.equals(this.sccFileList, other.getSccFileList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList()))) &&
            ((this.eventList==null && other.getEventList()==null) || 
             (this.eventList!=null &&
              java.util.Arrays.equals(this.eventList, other.getEventList()))) &&
            ((this.versionList==null && other.getVersionList()==null) || 
             (this.versionList!=null &&
              java.util.Arrays.equals(this.versionList, other.getVersionList()))) &&
            ((this.dateTimeCreated==null && other.getDateTimeCreated()==null) || 
             (this.dateTimeCreated!=null &&
              this.dateTimeCreated.equals(other.getDateTimeCreated()))) &&
            ((this.createdByUser==null && other.getCreatedByUser()==null) || 
             (this.createdByUser!=null &&
              this.createdByUser.equals(other.getCreatedByUser()))) &&
            ((this.locationAddedFrom==null && other.getLocationAddedFrom()==null) || 
             (this.locationAddedFrom!=null &&
              this.locationAddedFrom.equals(other.getLocationAddedFrom()))) &&
            ((this.modifiedByUser==null && other.getModifiedByUser()==null) || 
             (this.modifiedByUser!=null &&
              this.modifiedByUser.equals(other.getModifiedByUser()))) &&
            ((this.dateTimeModified==null && other.getDateTimeModified()==null) || 
             (this.dateTimeModified!=null &&
              this.dateTimeModified.equals(other.getDateTimeModified()))) &&
            ((this.actualHours==null && other.getActualHours()==null) || 
             (this.actualHours!=null &&
              this.actualHours.equals(other.getActualHours()))) &&
            ((this.estimatedHours==null && other.getEstimatedHours()==null) || 
             (this.estimatedHours!=null &&
              this.estimatedHours.equals(other.getEstimatedHours()))) &&
            ((this.remainingHours==null && other.getRemainingHours()==null) || 
             (this.remainingHours!=null &&
              this.remainingHours.equals(other.getRemainingHours()))) &&
            ((this.variance==null && other.getVariance()==null) || 
             (this.variance!=null &&
              this.variance.equals(other.getVariance()))) &&
            ((this.storyPoints==null && other.getStoryPoints()==null) || 
             (this.storyPoints!=null &&
              this.storyPoints.equals(other.getStoryPoints()))) &&
            ((this.percentDone==null && other.getPercentDone()==null) || 
             (this.percentDone!=null &&
              this.percentDone.equals(other.getPercentDone())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        if (getDateEntered() != null) {
            _hashCode += getDateEntered().hashCode();
        }
        if (getEnteredBy() != null) {
            _hashCode += getEnteredBy().hashCode();
        }
        if (getImportance() != null) {
            _hashCode += getImportance().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDescriptionInlineAttachList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescriptionInlineAttachList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescriptionInlineAttachList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getAttachmentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachmentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachmentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSccFileList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSccFileList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSccFileList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateTimeCreated() != null) {
            _hashCode += getDateTimeCreated().hashCode();
        }
        if (getCreatedByUser() != null) {
            _hashCode += getCreatedByUser().hashCode();
        }
        if (getLocationAddedFrom() != null) {
            _hashCode += getLocationAddedFrom().hashCode();
        }
        if (getModifiedByUser() != null) {
            _hashCode += getModifiedByUser().hashCode();
        }
        if (getDateTimeModified() != null) {
            _hashCode += getDateTimeModified().hashCode();
        }
        if (getActualHours() != null) {
            _hashCode += getActualHours().hashCode();
        }
        if (getEstimatedHours() != null) {
            _hashCode += getEstimatedHours().hashCode();
        }
        if (getRemainingHours() != null) {
            _hashCode += getRemainingHours().hashCode();
        }
        if (getVariance() != null) {
            _hashCode += getVariance().hashCode();
        }
        if (getStoryPoints() != null) {
            _hashCode += getStoryPoints().hashCode();
        }
        if (getPercentDone() != null) {
            _hashCode += getPercentDone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CRequirement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CRequirement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateEntered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateEntered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enteredBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enteredBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importance"));
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
        elemField.setFieldName("descriptionInlineAttachList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptionInlineAttachList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFileAttachment"));
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
        elemField.setFieldName("attachmentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFileAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sccFileList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sccFileList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CSCCFileRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CVersionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTimeCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAddedFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationAddedFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeModified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTimeModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualHours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actualHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedHours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimatedHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingHours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainingHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storyPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storyPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentDone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentDone"));
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
