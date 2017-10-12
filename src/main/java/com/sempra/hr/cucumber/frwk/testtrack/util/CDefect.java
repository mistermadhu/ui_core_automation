/**
 * CDefect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CDefect  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack  implements java.io.Serializable {
    private java.lang.Long defectnumber;

    private java.lang.String summary;

    private java.lang.String state;

    private java.lang.String disposition;

    private java.lang.String type;

    private java.lang.String priority;

    private java.lang.String product;

    private java.lang.String component;

    private java.lang.String reference;

    private java.lang.String severity;

    private java.lang.String enteredby;

    private java.lang.String workaround;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] workaroundInlineAttachList;

    private java.util.Date dateentered;

    private java.lang.String locationaddedfrom;

    private java.util.Calendar datetimecreated;

    private java.util.Calendar datetimemodified;

    private java.lang.String createdbyuser;

    private java.lang.String modifiedbyuser;

    private java.lang.Double actualhourstofix;

    private java.lang.Double estimatedhours;

    private java.lang.Double remaininghours;

    private java.lang.Double variance;

    private java.lang.Long storypoints;

    private java.lang.Long percentdone;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CReportedByRecord[] reportedbylist;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] eventlist;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] pSCCFileList;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFieldList;

    public CDefect() {
    }

    public CDefect(
           long recordid,
           java.lang.Long defectnumber,
           java.lang.String summary,
           java.lang.String state,
           java.lang.String disposition,
           java.lang.String type,
           java.lang.String priority,
           java.lang.String product,
           java.lang.String component,
           java.lang.String reference,
           java.lang.String severity,
           java.lang.String enteredby,
           java.lang.String workaround,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] workaroundInlineAttachList,
           java.util.Date dateentered,
           java.lang.String locationaddedfrom,
           java.util.Calendar datetimecreated,
           java.util.Calendar datetimemodified,
           java.lang.String createdbyuser,
           java.lang.String modifiedbyuser,
           java.lang.Double actualhourstofix,
           java.lang.Double estimatedhours,
           java.lang.Double remaininghours,
           java.lang.Double variance,
           java.lang.Long storypoints,
           java.lang.Long percentdone,
           com.sempra.hr.cucumber.frwk.testtrack.util.CReportedByRecord[] reportedbylist,
           com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] eventlist,
           com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] pSCCFileList,
           com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFieldList) {
        super(
            recordid);
        this.defectnumber = defectnumber;
        this.summary = summary;
        this.state = state;
        this.disposition = disposition;
        this.type = type;
        this.priority = priority;
        this.product = product;
        this.component = component;
        this.reference = reference;
        this.severity = severity;
        this.enteredby = enteredby;
        this.workaround = workaround;
        this.workaroundInlineAttachList = workaroundInlineAttachList;
        this.dateentered = dateentered;
        this.locationaddedfrom = locationaddedfrom;
        this.datetimecreated = datetimecreated;
        this.datetimemodified = datetimemodified;
        this.createdbyuser = createdbyuser;
        this.modifiedbyuser = modifiedbyuser;
        this.actualhourstofix = actualhourstofix;
        this.estimatedhours = estimatedhours;
        this.remaininghours = remaininghours;
        this.variance = variance;
        this.storypoints = storypoints;
        this.percentdone = percentdone;
        this.reportedbylist = reportedbylist;
        this.eventlist = eventlist;
        this.pSCCFileList = pSCCFileList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the defectnumber value for this CDefect.
     * 
     * @return defectnumber
     */
    public java.lang.Long getDefectnumber() {
        return defectnumber;
    }


    /**
     * Sets the defectnumber value for this CDefect.
     * 
     * @param defectnumber
     */
    public void setDefectnumber(java.lang.Long defectnumber) {
        this.defectnumber = defectnumber;
    }


    /**
     * Gets the summary value for this CDefect.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this CDefect.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the state value for this CDefect.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this CDefect.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the disposition value for this CDefect.
     * 
     * @return disposition
     */
    public java.lang.String getDisposition() {
        return disposition;
    }


    /**
     * Sets the disposition value for this CDefect.
     * 
     * @param disposition
     */
    public void setDisposition(java.lang.String disposition) {
        this.disposition = disposition;
    }


    /**
     * Gets the type value for this CDefect.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CDefect.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the priority value for this CDefect.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CDefect.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the product value for this CDefect.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this CDefect.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the component value for this CDefect.
     * 
     * @return component
     */
    public java.lang.String getComponent() {
        return component;
    }


    /**
     * Sets the component value for this CDefect.
     * 
     * @param component
     */
    public void setComponent(java.lang.String component) {
        this.component = component;
    }


    /**
     * Gets the reference value for this CDefect.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this CDefect.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the severity value for this CDefect.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this CDefect.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the enteredby value for this CDefect.
     * 
     * @return enteredby
     */
    public java.lang.String getEnteredby() {
        return enteredby;
    }


    /**
     * Sets the enteredby value for this CDefect.
     * 
     * @param enteredby
     */
    public void setEnteredby(java.lang.String enteredby) {
        this.enteredby = enteredby;
    }


    /**
     * Gets the workaround value for this CDefect.
     * 
     * @return workaround
     */
    public java.lang.String getWorkaround() {
        return workaround;
    }


    /**
     * Sets the workaround value for this CDefect.
     * 
     * @param workaround
     */
    public void setWorkaround(java.lang.String workaround) {
        this.workaround = workaround;
    }


    /**
     * Gets the workaroundInlineAttachList value for this CDefect.
     * 
     * @return workaroundInlineAttachList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] getWorkaroundInlineAttachList() {
        return workaroundInlineAttachList;
    }


    /**
     * Sets the workaroundInlineAttachList value for this CDefect.
     * 
     * @param workaroundInlineAttachList
     */
    public void setWorkaroundInlineAttachList(com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] workaroundInlineAttachList) {
        this.workaroundInlineAttachList = workaroundInlineAttachList;
    }


    /**
     * Gets the dateentered value for this CDefect.
     * 
     * @return dateentered
     */
    public java.util.Date getDateentered() {
        return dateentered;
    }


    /**
     * Sets the dateentered value for this CDefect.
     * 
     * @param dateentered
     */
    public void setDateentered(java.util.Date dateentered) {
        this.dateentered = dateentered;
    }


    /**
     * Gets the locationaddedfrom value for this CDefect.
     * 
     * @return locationaddedfrom
     */
    public java.lang.String getLocationaddedfrom() {
        return locationaddedfrom;
    }


    /**
     * Sets the locationaddedfrom value for this CDefect.
     * 
     * @param locationaddedfrom
     */
    public void setLocationaddedfrom(java.lang.String locationaddedfrom) {
        this.locationaddedfrom = locationaddedfrom;
    }


    /**
     * Gets the datetimecreated value for this CDefect.
     * 
     * @return datetimecreated
     */
    public java.util.Calendar getDatetimecreated() {
        return datetimecreated;
    }


    /**
     * Sets the datetimecreated value for this CDefect.
     * 
     * @param datetimecreated
     */
    public void setDatetimecreated(java.util.Calendar datetimecreated) {
        this.datetimecreated = datetimecreated;
    }


    /**
     * Gets the datetimemodified value for this CDefect.
     * 
     * @return datetimemodified
     */
    public java.util.Calendar getDatetimemodified() {
        return datetimemodified;
    }


    /**
     * Sets the datetimemodified value for this CDefect.
     * 
     * @param datetimemodified
     */
    public void setDatetimemodified(java.util.Calendar datetimemodified) {
        this.datetimemodified = datetimemodified;
    }


    /**
     * Gets the createdbyuser value for this CDefect.
     * 
     * @return createdbyuser
     */
    public java.lang.String getCreatedbyuser() {
        return createdbyuser;
    }


    /**
     * Sets the createdbyuser value for this CDefect.
     * 
     * @param createdbyuser
     */
    public void setCreatedbyuser(java.lang.String createdbyuser) {
        this.createdbyuser = createdbyuser;
    }


    /**
     * Gets the modifiedbyuser value for this CDefect.
     * 
     * @return modifiedbyuser
     */
    public java.lang.String getModifiedbyuser() {
        return modifiedbyuser;
    }


    /**
     * Sets the modifiedbyuser value for this CDefect.
     * 
     * @param modifiedbyuser
     */
    public void setModifiedbyuser(java.lang.String modifiedbyuser) {
        this.modifiedbyuser = modifiedbyuser;
    }


    /**
     * Gets the actualhourstofix value for this CDefect.
     * 
     * @return actualhourstofix
     */
    public java.lang.Double getActualhourstofix() {
        return actualhourstofix;
    }


    /**
     * Sets the actualhourstofix value for this CDefect.
     * 
     * @param actualhourstofix
     */
    public void setActualhourstofix(java.lang.Double actualhourstofix) {
        this.actualhourstofix = actualhourstofix;
    }


    /**
     * Gets the estimatedhours value for this CDefect.
     * 
     * @return estimatedhours
     */
    public java.lang.Double getEstimatedhours() {
        return estimatedhours;
    }


    /**
     * Sets the estimatedhours value for this CDefect.
     * 
     * @param estimatedhours
     */
    public void setEstimatedhours(java.lang.Double estimatedhours) {
        this.estimatedhours = estimatedhours;
    }


    /**
     * Gets the remaininghours value for this CDefect.
     * 
     * @return remaininghours
     */
    public java.lang.Double getRemaininghours() {
        return remaininghours;
    }


    /**
     * Sets the remaininghours value for this CDefect.
     * 
     * @param remaininghours
     */
    public void setRemaininghours(java.lang.Double remaininghours) {
        this.remaininghours = remaininghours;
    }


    /**
     * Gets the variance value for this CDefect.
     * 
     * @return variance
     */
    public java.lang.Double getVariance() {
        return variance;
    }


    /**
     * Sets the variance value for this CDefect.
     * 
     * @param variance
     */
    public void setVariance(java.lang.Double variance) {
        this.variance = variance;
    }


    /**
     * Gets the storypoints value for this CDefect.
     * 
     * @return storypoints
     */
    public java.lang.Long getStorypoints() {
        return storypoints;
    }


    /**
     * Sets the storypoints value for this CDefect.
     * 
     * @param storypoints
     */
    public void setStorypoints(java.lang.Long storypoints) {
        this.storypoints = storypoints;
    }


    /**
     * Gets the percentdone value for this CDefect.
     * 
     * @return percentdone
     */
    public java.lang.Long getPercentdone() {
        return percentdone;
    }


    /**
     * Sets the percentdone value for this CDefect.
     * 
     * @param percentdone
     */
    public void setPercentdone(java.lang.Long percentdone) {
        this.percentdone = percentdone;
    }


    /**
     * Gets the reportedbylist value for this CDefect.
     * 
     * @return reportedbylist
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CReportedByRecord[] getReportedbylist() {
        return reportedbylist;
    }


    /**
     * Sets the reportedbylist value for this CDefect.
     * 
     * @param reportedbylist
     */
    public void setReportedbylist(com.sempra.hr.cucumber.frwk.testtrack.util.CReportedByRecord[] reportedbylist) {
        this.reportedbylist = reportedbylist;
    }


    /**
     * Gets the eventlist value for this CDefect.
     * 
     * @return eventlist
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] getEventlist() {
        return eventlist;
    }


    /**
     * Sets the eventlist value for this CDefect.
     * 
     * @param eventlist
     */
    public void setEventlist(com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] eventlist) {
        this.eventlist = eventlist;
    }


    /**
     * Gets the pSCCFileList value for this CDefect.
     * 
     * @return pSCCFileList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] getPSCCFileList() {
        return pSCCFileList;
    }


    /**
     * Sets the pSCCFileList value for this CDefect.
     * 
     * @param pSCCFileList
     */
    public void setPSCCFileList(com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] pSCCFileList) {
        this.pSCCFileList = pSCCFileList;
    }


    /**
     * Gets the customFieldList value for this CDefect.
     * 
     * @return customFieldList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CField[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CDefect.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDefect)) return false;
        CDefect other = (CDefect) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defectnumber==null && other.getDefectnumber()==null) || 
             (this.defectnumber!=null &&
              this.defectnumber.equals(other.getDefectnumber()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.disposition==null && other.getDisposition()==null) || 
             (this.disposition!=null &&
              this.disposition.equals(other.getDisposition()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.component==null && other.getComponent()==null) || 
             (this.component!=null &&
              this.component.equals(other.getComponent()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.enteredby==null && other.getEnteredby()==null) || 
             (this.enteredby!=null &&
              this.enteredby.equals(other.getEnteredby()))) &&
            ((this.workaround==null && other.getWorkaround()==null) || 
             (this.workaround!=null &&
              this.workaround.equals(other.getWorkaround()))) &&
            ((this.workaroundInlineAttachList==null && other.getWorkaroundInlineAttachList()==null) || 
             (this.workaroundInlineAttachList!=null &&
              java.util.Arrays.equals(this.workaroundInlineAttachList, other.getWorkaroundInlineAttachList()))) &&
            ((this.dateentered==null && other.getDateentered()==null) || 
             (this.dateentered!=null &&
              this.dateentered.equals(other.getDateentered()))) &&
            ((this.locationaddedfrom==null && other.getLocationaddedfrom()==null) || 
             (this.locationaddedfrom!=null &&
              this.locationaddedfrom.equals(other.getLocationaddedfrom()))) &&
            ((this.datetimecreated==null && other.getDatetimecreated()==null) || 
             (this.datetimecreated!=null &&
              this.datetimecreated.equals(other.getDatetimecreated()))) &&
            ((this.datetimemodified==null && other.getDatetimemodified()==null) || 
             (this.datetimemodified!=null &&
              this.datetimemodified.equals(other.getDatetimemodified()))) &&
            ((this.createdbyuser==null && other.getCreatedbyuser()==null) || 
             (this.createdbyuser!=null &&
              this.createdbyuser.equals(other.getCreatedbyuser()))) &&
            ((this.modifiedbyuser==null && other.getModifiedbyuser()==null) || 
             (this.modifiedbyuser!=null &&
              this.modifiedbyuser.equals(other.getModifiedbyuser()))) &&
            ((this.actualhourstofix==null && other.getActualhourstofix()==null) || 
             (this.actualhourstofix!=null &&
              this.actualhourstofix.equals(other.getActualhourstofix()))) &&
            ((this.estimatedhours==null && other.getEstimatedhours()==null) || 
             (this.estimatedhours!=null &&
              this.estimatedhours.equals(other.getEstimatedhours()))) &&
            ((this.remaininghours==null && other.getRemaininghours()==null) || 
             (this.remaininghours!=null &&
              this.remaininghours.equals(other.getRemaininghours()))) &&
            ((this.variance==null && other.getVariance()==null) || 
             (this.variance!=null &&
              this.variance.equals(other.getVariance()))) &&
            ((this.storypoints==null && other.getStorypoints()==null) || 
             (this.storypoints!=null &&
              this.storypoints.equals(other.getStorypoints()))) &&
            ((this.percentdone==null && other.getPercentdone()==null) || 
             (this.percentdone!=null &&
              this.percentdone.equals(other.getPercentdone()))) &&
            ((this.reportedbylist==null && other.getReportedbylist()==null) || 
             (this.reportedbylist!=null &&
              java.util.Arrays.equals(this.reportedbylist, other.getReportedbylist()))) &&
            ((this.eventlist==null && other.getEventlist()==null) || 
             (this.eventlist!=null &&
              java.util.Arrays.equals(this.eventlist, other.getEventlist()))) &&
            ((this.pSCCFileList==null && other.getPSCCFileList()==null) || 
             (this.pSCCFileList!=null &&
              java.util.Arrays.equals(this.pSCCFileList, other.getPSCCFileList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList())));
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
        if (getDefectnumber() != null) {
            _hashCode += getDefectnumber().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getDisposition() != null) {
            _hashCode += getDisposition().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getComponent() != null) {
            _hashCode += getComponent().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getEnteredby() != null) {
            _hashCode += getEnteredby().hashCode();
        }
        if (getWorkaround() != null) {
            _hashCode += getWorkaround().hashCode();
        }
        if (getWorkaroundInlineAttachList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkaroundInlineAttachList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkaroundInlineAttachList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateentered() != null) {
            _hashCode += getDateentered().hashCode();
        }
        if (getLocationaddedfrom() != null) {
            _hashCode += getLocationaddedfrom().hashCode();
        }
        if (getDatetimecreated() != null) {
            _hashCode += getDatetimecreated().hashCode();
        }
        if (getDatetimemodified() != null) {
            _hashCode += getDatetimemodified().hashCode();
        }
        if (getCreatedbyuser() != null) {
            _hashCode += getCreatedbyuser().hashCode();
        }
        if (getModifiedbyuser() != null) {
            _hashCode += getModifiedbyuser().hashCode();
        }
        if (getActualhourstofix() != null) {
            _hashCode += getActualhourstofix().hashCode();
        }
        if (getEstimatedhours() != null) {
            _hashCode += getEstimatedhours().hashCode();
        }
        if (getRemaininghours() != null) {
            _hashCode += getRemaininghours().hashCode();
        }
        if (getVariance() != null) {
            _hashCode += getVariance().hashCode();
        }
        if (getStorypoints() != null) {
            _hashCode += getStorypoints().hashCode();
        }
        if (getPercentdone() != null) {
            _hashCode += getPercentdone().hashCode();
        }
        if (getReportedbylist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportedbylist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportedbylist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventlist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventlist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventlist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPSCCFileList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPSCCFileList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPSCCFileList(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDefect.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CDefect"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defectnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary"));
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
        elemField.setFieldName("disposition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disposition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component");
        elemField.setXmlName(new javax.xml.namespace.QName("", "component"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enteredby");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enteredby"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workaround");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workaround"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workaroundInlineAttachList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workaroundInlineAttachList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFileAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateentered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateentered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationaddedfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationaddedfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datetimecreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datetimecreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datetimemodified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datetimemodified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdbyuser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdbyuser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedbyuser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedbyuser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualhourstofix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actualhourstofix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedhours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimatedhours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remaininghours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remaininghours"));
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
        elemField.setFieldName("storypoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storypoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentdone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentdone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedbylist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportedbylist"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CReportedByRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventlist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSCCFileList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pSCCFileList"));
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
