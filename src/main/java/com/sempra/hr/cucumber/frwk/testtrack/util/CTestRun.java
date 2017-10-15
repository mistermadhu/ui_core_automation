/**
 * CTestRun.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * Inherits from CItemToTrack. Stores the fields that comprise a test
 * run. NOTE: Problem statements added to test runs with the steps in
 * grid mode will be added as the last element in the grid. If you want
 * to insert problem statements (steps, comments or expected results)
 * into the grid, use the following mark up characters, which are only
 * valid if they are the first letter after a new line: Asterisk(*)-
 * indicates the beginning of a new step; Plus sign (+) - indicates the
 * expected result of the previous step; Pound sign (#) - indicates a
 * comment line; Exclamation point (!) - indicates a problem statement
 */
public class CTestRun  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack  implements java.io.Serializable {
    private java.lang.Long testrunnumber;

    private java.lang.String summary;

    private java.lang.String state;

    private java.lang.String createdbyuser;

    private java.util.Calendar datetimecreated;

    private java.lang.String locationaddedfrom;

    private java.lang.String modifiedbyuser;

    private java.util.Calendar datetimemodified;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFieldList;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] eventlist;

    private java.lang.Double actualhours;

    private java.lang.Double estimatedhours;

    private java.lang.Double remaininghours;

    private java.lang.Double variance;

    private java.lang.Long storypoints;

    private java.lang.Long percentdone;

    private java.lang.Long testcasenumber;

    private java.lang.Long testcaserecordid;

    private java.lang.String type;

    private java.lang.String testrunset;

    private java.lang.Boolean isautomated;

    private java.lang.String estimatedtime;

    private java.lang.String steps;

    private java.lang.String problemstatement;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CTestCaseVariantField[] testVariants;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentlist;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] sccFileList;

    private java.lang.String stepsmode;

    public CTestRun() {
    }

    public CTestRun(
           long recordid,
           java.lang.Long testrunnumber,
           java.lang.String summary,
           java.lang.String state,
           java.lang.String createdbyuser,
           java.util.Calendar datetimecreated,
           java.lang.String locationaddedfrom,
           java.lang.String modifiedbyuser,
           java.util.Calendar datetimemodified,
           com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFieldList,
           com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] eventlist,
           java.lang.Double actualhours,
           java.lang.Double estimatedhours,
           java.lang.Double remaininghours,
           java.lang.Double variance,
           java.lang.Long storypoints,
           java.lang.Long percentdone,
           java.lang.Long testcasenumber,
           java.lang.Long testcaserecordid,
           java.lang.String type,
           java.lang.String testrunset,
           java.lang.Boolean isautomated,
           java.lang.String estimatedtime,
           java.lang.String steps,
           java.lang.String problemstatement,
           com.sempra.hr.cucumber.frwk.testtrack.util.CTestCaseVariantField[] testVariants,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentlist,
           com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] sccFileList,
           java.lang.String stepsmode) {
        super(
            recordid);
        this.testrunnumber = testrunnumber;
        this.summary = summary;
        this.state = state;
        this.createdbyuser = createdbyuser;
        this.datetimecreated = datetimecreated;
        this.locationaddedfrom = locationaddedfrom;
        this.modifiedbyuser = modifiedbyuser;
        this.datetimemodified = datetimemodified;
        this.customFieldList = customFieldList;
        this.eventlist = eventlist;
        this.actualhours = actualhours;
        this.estimatedhours = estimatedhours;
        this.remaininghours = remaininghours;
        this.variance = variance;
        this.storypoints = storypoints;
        this.percentdone = percentdone;
        this.testcasenumber = testcasenumber;
        this.testcaserecordid = testcaserecordid;
        this.type = type;
        this.testrunset = testrunset;
        this.isautomated = isautomated;
        this.estimatedtime = estimatedtime;
        this.steps = steps;
        this.problemstatement = problemstatement;
        this.testVariants = testVariants;
        this.attachmentlist = attachmentlist;
        this.sccFileList = sccFileList;
        this.stepsmode = stepsmode;
    }


    /**
     * Gets the testrunnumber value for this CTestRun.
     * 
     * @return testrunnumber
     */
    public java.lang.Long getTestrunnumber() {
        return testrunnumber;
    }


    /**
     * Sets the testrunnumber value for this CTestRun.
     * 
     * @param testrunnumber
     */
    public void setTestrunnumber(java.lang.Long testrunnumber) {
        this.testrunnumber = testrunnumber;
    }


    /**
     * Gets the summary value for this CTestRun.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this CTestRun.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the state value for this CTestRun.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this CTestRun.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the createdbyuser value for this CTestRun.
     * 
     * @return createdbyuser
     */
    public java.lang.String getCreatedbyuser() {
        return createdbyuser;
    }


    /**
     * Sets the createdbyuser value for this CTestRun.
     * 
     * @param createdbyuser
     */
    public void setCreatedbyuser(java.lang.String createdbyuser) {
        this.createdbyuser = createdbyuser;
    }


    /**
     * Gets the datetimecreated value for this CTestRun.
     * 
     * @return datetimecreated
     */
    public java.util.Calendar getDatetimecreated() {
        return datetimecreated;
    }


    /**
     * Sets the datetimecreated value for this CTestRun.
     * 
     * @param datetimecreated
     */
    public void setDatetimecreated(java.util.Calendar datetimecreated) {
        this.datetimecreated = datetimecreated;
    }


    /**
     * Gets the locationaddedfrom value for this CTestRun.
     * 
     * @return locationaddedfrom
     */
    public java.lang.String getLocationaddedfrom() {
        return locationaddedfrom;
    }


    /**
     * Sets the locationaddedfrom value for this CTestRun.
     * 
     * @param locationaddedfrom
     */
    public void setLocationaddedfrom(java.lang.String locationaddedfrom) {
        this.locationaddedfrom = locationaddedfrom;
    }


    /**
     * Gets the modifiedbyuser value for this CTestRun.
     * 
     * @return modifiedbyuser
     */
    public java.lang.String getModifiedbyuser() {
        return modifiedbyuser;
    }


    /**
     * Sets the modifiedbyuser value for this CTestRun.
     * 
     * @param modifiedbyuser
     */
    public void setModifiedbyuser(java.lang.String modifiedbyuser) {
        this.modifiedbyuser = modifiedbyuser;
    }


    /**
     * Gets the datetimemodified value for this CTestRun.
     * 
     * @return datetimemodified
     */
    public java.util.Calendar getDatetimemodified() {
        return datetimemodified;
    }


    /**
     * Sets the datetimemodified value for this CTestRun.
     * 
     * @param datetimemodified
     */
    public void setDatetimemodified(java.util.Calendar datetimemodified) {
        this.datetimemodified = datetimemodified;
    }


    /**
     * Gets the customFieldList value for this CTestRun.
     * 
     * @return customFieldList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CField[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CTestRun.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.sempra.hr.cucumber.frwk.testtrack.util.CField[] customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the eventlist value for this CTestRun.
     * 
     * @return eventlist
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] getEventlist() {
        return eventlist;
    }


    /**
     * Sets the eventlist value for this CTestRun.
     * 
     * @param eventlist
     */
    public void setEventlist(com.sempra.hr.cucumber.frwk.testtrack.util.CEvent[] eventlist) {
        this.eventlist = eventlist;
    }


    /**
     * Gets the actualhours value for this CTestRun.
     * 
     * @return actualhours
     */
    public java.lang.Double getActualhours() {
        return actualhours;
    }


    /**
     * Sets the actualhours value for this CTestRun.
     * 
     * @param actualhours
     */
    public void setActualhours(java.lang.Double actualhours) {
        this.actualhours = actualhours;
    }


    /**
     * Gets the estimatedhours value for this CTestRun.
     * 
     * @return estimatedhours
     */
    public java.lang.Double getEstimatedhours() {
        return estimatedhours;
    }


    /**
     * Sets the estimatedhours value for this CTestRun.
     * 
     * @param estimatedhours
     */
    public void setEstimatedhours(java.lang.Double estimatedhours) {
        this.estimatedhours = estimatedhours;
    }


    /**
     * Gets the remaininghours value for this CTestRun.
     * 
     * @return remaininghours
     */
    public java.lang.Double getRemaininghours() {
        return remaininghours;
    }


    /**
     * Sets the remaininghours value for this CTestRun.
     * 
     * @param remaininghours
     */
    public void setRemaininghours(java.lang.Double remaininghours) {
        this.remaininghours = remaininghours;
    }


    /**
     * Gets the variance value for this CTestRun.
     * 
     * @return variance
     */
    public java.lang.Double getVariance() {
        return variance;
    }


    /**
     * Sets the variance value for this CTestRun.
     * 
     * @param variance
     */
    public void setVariance(java.lang.Double variance) {
        this.variance = variance;
    }


    /**
     * Gets the storypoints value for this CTestRun.
     * 
     * @return storypoints
     */
    public java.lang.Long getStorypoints() {
        return storypoints;
    }


    /**
     * Sets the storypoints value for this CTestRun.
     * 
     * @param storypoints
     */
    public void setStorypoints(java.lang.Long storypoints) {
        this.storypoints = storypoints;
    }


    /**
     * Gets the percentdone value for this CTestRun.
     * 
     * @return percentdone
     */
    public java.lang.Long getPercentdone() {
        return percentdone;
    }


    /**
     * Sets the percentdone value for this CTestRun.
     * 
     * @param percentdone
     */
    public void setPercentdone(java.lang.Long percentdone) {
        this.percentdone = percentdone;
    }


    /**
     * Gets the testcasenumber value for this CTestRun.
     * 
     * @return testcasenumber
     */
    public java.lang.Long getTestcasenumber() {
        return testcasenumber;
    }


    /**
     * Sets the testcasenumber value for this CTestRun.
     * 
     * @param testcasenumber
     */
    public void setTestcasenumber(java.lang.Long testcasenumber) {
        this.testcasenumber = testcasenumber;
    }


    /**
     * Gets the testcaserecordid value for this CTestRun.
     * 
     * @return testcaserecordid
     */
    public java.lang.Long getTestcaserecordid() {
        return testcaserecordid;
    }


    /**
     * Sets the testcaserecordid value for this CTestRun.
     * 
     * @param testcaserecordid
     */
    public void setTestcaserecordid(java.lang.Long testcaserecordid) {
        this.testcaserecordid = testcaserecordid;
    }


    /**
     * Gets the type value for this CTestRun.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CTestRun.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the testrunset value for this CTestRun.
     * 
     * @return testrunset
     */
    public java.lang.String getTestrunset() {
        return testrunset;
    }


    /**
     * Sets the testrunset value for this CTestRun.
     * 
     * @param testrunset
     */
    public void setTestrunset(java.lang.String testrunset) {
        this.testrunset = testrunset;
    }


    /**
     * Gets the isautomated value for this CTestRun.
     * 
     * @return isautomated
     */
    public java.lang.Boolean getIsautomated() {
        return isautomated;
    }


    /**
     * Sets the isautomated value for this CTestRun.
     * 
     * @param isautomated
     */
    public void setIsautomated(java.lang.Boolean isautomated) {
        this.isautomated = isautomated;
    }


    /**
     * Gets the estimatedtime value for this CTestRun.
     * 
     * @return estimatedtime
     */
    public java.lang.String getEstimatedtime() {
        return estimatedtime;
    }


    /**
     * Sets the estimatedtime value for this CTestRun.
     * 
     * @param estimatedtime
     */
    public void setEstimatedtime(java.lang.String estimatedtime) {
        this.estimatedtime = estimatedtime;
    }


    /**
     * Gets the steps value for this CTestRun.
     * 
     * @return steps
     */
    public java.lang.String getSteps() {
        return steps;
    }


    /**
     * Sets the steps value for this CTestRun.
     * 
     * @param steps
     */
    public void setSteps(java.lang.String steps) {
        this.steps = steps;
    }


    /**
     * Gets the problemstatement value for this CTestRun.
     * 
     * @return problemstatement
     */
    public java.lang.String getProblemstatement() {
        return problemstatement;
    }


    /**
     * Sets the problemstatement value for this CTestRun.
     * 
     * @param problemstatement
     */
    public void setProblemstatement(java.lang.String problemstatement) {
        this.problemstatement = problemstatement;
    }


    /**
     * Gets the testVariants value for this CTestRun.
     * 
     * @return testVariants
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTestCaseVariantField[] getTestVariants() {
        return testVariants;
    }


    /**
     * Sets the testVariants value for this CTestRun.
     * 
     * @param testVariants
     */
    public void setTestVariants(com.sempra.hr.cucumber.frwk.testtrack.util.CTestCaseVariantField[] testVariants) {
        this.testVariants = testVariants;
    }


    /**
     * Gets the attachmentlist value for this CTestRun.
     * 
     * @return attachmentlist
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] getAttachmentlist() {
        return attachmentlist;
    }


    /**
     * Sets the attachmentlist value for this CTestRun.
     * 
     * @param attachmentlist
     */
    public void setAttachmentlist(com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentlist) {
        this.attachmentlist = attachmentlist;
    }


    /**
     * Gets the sccFileList value for this CTestRun.
     * 
     * @return sccFileList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] getSccFileList() {
        return sccFileList;
    }


    /**
     * Sets the sccFileList value for this CTestRun.
     * 
     * @param sccFileList
     */
    public void setSccFileList(com.sempra.hr.cucumber.frwk.testtrack.util.CSCCFileRecord[] sccFileList) {
        this.sccFileList = sccFileList;
    }


    /**
     * Gets the stepsmode value for this CTestRun.
     * 
     * @return stepsmode
     */
    public java.lang.String getStepsmode() {
        return stepsmode;
    }


    /**
     * Sets the stepsmode value for this CTestRun.
     * 
     * @param stepsmode
     */
    public void setStepsmode(java.lang.String stepsmode) {
        this.stepsmode = stepsmode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CTestRun)) return false;
        CTestRun other = (CTestRun) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.testrunnumber==null && other.getTestrunnumber()==null) || 
             (this.testrunnumber!=null &&
              this.testrunnumber.equals(other.getTestrunnumber()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.createdbyuser==null && other.getCreatedbyuser()==null) || 
             (this.createdbyuser!=null &&
              this.createdbyuser.equals(other.getCreatedbyuser()))) &&
            ((this.datetimecreated==null && other.getDatetimecreated()==null) || 
             (this.datetimecreated!=null &&
              this.datetimecreated.equals(other.getDatetimecreated()))) &&
            ((this.locationaddedfrom==null && other.getLocationaddedfrom()==null) || 
             (this.locationaddedfrom!=null &&
              this.locationaddedfrom.equals(other.getLocationaddedfrom()))) &&
            ((this.modifiedbyuser==null && other.getModifiedbyuser()==null) || 
             (this.modifiedbyuser!=null &&
              this.modifiedbyuser.equals(other.getModifiedbyuser()))) &&
            ((this.datetimemodified==null && other.getDatetimemodified()==null) || 
             (this.datetimemodified!=null &&
              this.datetimemodified.equals(other.getDatetimemodified()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList()))) &&
            ((this.eventlist==null && other.getEventlist()==null) || 
             (this.eventlist!=null &&
              java.util.Arrays.equals(this.eventlist, other.getEventlist()))) &&
            ((this.actualhours==null && other.getActualhours()==null) || 
             (this.actualhours!=null &&
              this.actualhours.equals(other.getActualhours()))) &&
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
            ((this.testcasenumber==null && other.getTestcasenumber()==null) || 
             (this.testcasenumber!=null &&
              this.testcasenumber.equals(other.getTestcasenumber()))) &&
            ((this.testcaserecordid==null && other.getTestcaserecordid()==null) || 
             (this.testcaserecordid!=null &&
              this.testcaserecordid.equals(other.getTestcaserecordid()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.testrunset==null && other.getTestrunset()==null) || 
             (this.testrunset!=null &&
              this.testrunset.equals(other.getTestrunset()))) &&
            ((this.isautomated==null && other.getIsautomated()==null) || 
             (this.isautomated!=null &&
              this.isautomated.equals(other.getIsautomated()))) &&
            ((this.estimatedtime==null && other.getEstimatedtime()==null) || 
             (this.estimatedtime!=null &&
              this.estimatedtime.equals(other.getEstimatedtime()))) &&
            ((this.steps==null && other.getSteps()==null) || 
             (this.steps!=null &&
              this.steps.equals(other.getSteps()))) &&
            ((this.problemstatement==null && other.getProblemstatement()==null) || 
             (this.problemstatement!=null &&
              this.problemstatement.equals(other.getProblemstatement()))) &&
            ((this.testVariants==null && other.getTestVariants()==null) || 
             (this.testVariants!=null &&
              java.util.Arrays.equals(this.testVariants, other.getTestVariants()))) &&
            ((this.attachmentlist==null && other.getAttachmentlist()==null) || 
             (this.attachmentlist!=null &&
              java.util.Arrays.equals(this.attachmentlist, other.getAttachmentlist()))) &&
            ((this.sccFileList==null && other.getSccFileList()==null) || 
             (this.sccFileList!=null &&
              java.util.Arrays.equals(this.sccFileList, other.getSccFileList()))) &&
            ((this.stepsmode==null && other.getStepsmode()==null) || 
             (this.stepsmode!=null &&
              this.stepsmode.equals(other.getStepsmode())));
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
        if (getTestrunnumber() != null) {
            _hashCode += getTestrunnumber().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCreatedbyuser() != null) {
            _hashCode += getCreatedbyuser().hashCode();
        }
        if (getDatetimecreated() != null) {
            _hashCode += getDatetimecreated().hashCode();
        }
        if (getLocationaddedfrom() != null) {
            _hashCode += getLocationaddedfrom().hashCode();
        }
        if (getModifiedbyuser() != null) {
            _hashCode += getModifiedbyuser().hashCode();
        }
        if (getDatetimemodified() != null) {
            _hashCode += getDatetimemodified().hashCode();
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
        if (getActualhours() != null) {
            _hashCode += getActualhours().hashCode();
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
        if (getTestcasenumber() != null) {
            _hashCode += getTestcasenumber().hashCode();
        }
        if (getTestcaserecordid() != null) {
            _hashCode += getTestcaserecordid().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTestrunset() != null) {
            _hashCode += getTestrunset().hashCode();
        }
        if (getIsautomated() != null) {
            _hashCode += getIsautomated().hashCode();
        }
        if (getEstimatedtime() != null) {
            _hashCode += getEstimatedtime().hashCode();
        }
        if (getSteps() != null) {
            _hashCode += getSteps().hashCode();
        }
        if (getProblemstatement() != null) {
            _hashCode += getProblemstatement().hashCode();
        }
        if (getTestVariants() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTestVariants());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTestVariants(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachmentlist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachmentlist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachmentlist(), i);
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
        if (getStepsmode() != null) {
            _hashCode += getStepsmode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CTestRun.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CTestRun"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testrunnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testrunnumber"));
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
        elemField.setFieldName("createdbyuser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdbyuser"));
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
        elemField.setFieldName("locationaddedfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationaddedfrom"));
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
        elemField.setFieldName("datetimemodified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datetimemodified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("eventlist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualhours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actualhours"));
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
        elemField.setFieldName("testcasenumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testcasenumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testcaserecordid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testcaserecordid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testrunset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testrunset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isautomated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isautomated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimatedtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "steps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemstatement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "problemstatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testVariants");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testVariants"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CTestCaseVariantField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentlist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentlist"));
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
        elemField.setFieldName("stepsmode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stepsmode"));
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
