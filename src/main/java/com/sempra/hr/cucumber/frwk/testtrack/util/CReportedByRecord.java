/**
 * CReportedByRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CReportedByRecord  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemWithDBRecordId  implements java.io.Serializable {
    private java.lang.String foundby;

    private java.util.Date datefound;

    private java.lang.String contactinfo;

    private java.lang.String foundinversion;

    private java.lang.String comments;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] commentsInlineAttachList;

    private java.lang.String reproduced;

    private java.lang.String reproducedsteps;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] reproStepsInlineAttachList;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CSystem standardtestconfig;

    private java.lang.String otherhardwaresoftware;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] otherHWSWInlineAttachList;

    private java.lang.Short testconfigtype;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentlist;

    private short showorder;

    public CReportedByRecord() {
    }

    public CReportedByRecord(
           long recordid,
           java.lang.String foundby,
           java.util.Date datefound,
           java.lang.String contactinfo,
           java.lang.String foundinversion,
           java.lang.String comments,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] commentsInlineAttachList,
           java.lang.String reproduced,
           java.lang.String reproducedsteps,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] reproStepsInlineAttachList,
           com.sempra.hr.cucumber.frwk.testtrack.util.CSystem standardtestconfig,
           java.lang.String otherhardwaresoftware,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] otherHWSWInlineAttachList,
           java.lang.Short testconfigtype,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentlist,
           short showorder) {
        super(
            recordid);
        this.foundby = foundby;
        this.datefound = datefound;
        this.contactinfo = contactinfo;
        this.foundinversion = foundinversion;
        this.comments = comments;
        this.commentsInlineAttachList = commentsInlineAttachList;
        this.reproduced = reproduced;
        this.reproducedsteps = reproducedsteps;
        this.reproStepsInlineAttachList = reproStepsInlineAttachList;
        this.standardtestconfig = standardtestconfig;
        this.otherhardwaresoftware = otherhardwaresoftware;
        this.otherHWSWInlineAttachList = otherHWSWInlineAttachList;
        this.testconfigtype = testconfigtype;
        this.attachmentlist = attachmentlist;
        this.showorder = showorder;
    }


    /**
     * Gets the foundby value for this CReportedByRecord.
     * 
     * @return foundby
     */
    public java.lang.String getFoundby() {
        return foundby;
    }


    /**
     * Sets the foundby value for this CReportedByRecord.
     * 
     * @param foundby
     */
    public void setFoundby(java.lang.String foundby) {
        this.foundby = foundby;
    }


    /**
     * Gets the datefound value for this CReportedByRecord.
     * 
     * @return datefound
     */
    public java.util.Date getDatefound() {
        return datefound;
    }


    /**
     * Sets the datefound value for this CReportedByRecord.
     * 
     * @param datefound
     */
    public void setDatefound(java.util.Date datefound) {
        this.datefound = datefound;
    }


    /**
     * Gets the contactinfo value for this CReportedByRecord.
     * 
     * @return contactinfo
     */
    public java.lang.String getContactinfo() {
        return contactinfo;
    }


    /**
     * Sets the contactinfo value for this CReportedByRecord.
     * 
     * @param contactinfo
     */
    public void setContactinfo(java.lang.String contactinfo) {
        this.contactinfo = contactinfo;
    }


    /**
     * Gets the foundinversion value for this CReportedByRecord.
     * 
     * @return foundinversion
     */
    public java.lang.String getFoundinversion() {
        return foundinversion;
    }


    /**
     * Sets the foundinversion value for this CReportedByRecord.
     * 
     * @param foundinversion
     */
    public void setFoundinversion(java.lang.String foundinversion) {
        this.foundinversion = foundinversion;
    }


    /**
     * Gets the comments value for this CReportedByRecord.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this CReportedByRecord.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the commentsInlineAttachList value for this CReportedByRecord.
     * 
     * @return commentsInlineAttachList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] getCommentsInlineAttachList() {
        return commentsInlineAttachList;
    }


    /**
     * Sets the commentsInlineAttachList value for this CReportedByRecord.
     * 
     * @param commentsInlineAttachList
     */
    public void setCommentsInlineAttachList(com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] commentsInlineAttachList) {
        this.commentsInlineAttachList = commentsInlineAttachList;
    }


    /**
     * Gets the reproduced value for this CReportedByRecord.
     * 
     * @return reproduced
     */
    public java.lang.String getReproduced() {
        return reproduced;
    }


    /**
     * Sets the reproduced value for this CReportedByRecord.
     * 
     * @param reproduced
     */
    public void setReproduced(java.lang.String reproduced) {
        this.reproduced = reproduced;
    }


    /**
     * Gets the reproducedsteps value for this CReportedByRecord.
     * 
     * @return reproducedsteps
     */
    public java.lang.String getReproducedsteps() {
        return reproducedsteps;
    }


    /**
     * Sets the reproducedsteps value for this CReportedByRecord.
     * 
     * @param reproducedsteps
     */
    public void setReproducedsteps(java.lang.String reproducedsteps) {
        this.reproducedsteps = reproducedsteps;
    }


    /**
     * Gets the reproStepsInlineAttachList value for this CReportedByRecord.
     * 
     * @return reproStepsInlineAttachList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] getReproStepsInlineAttachList() {
        return reproStepsInlineAttachList;
    }


    /**
     * Sets the reproStepsInlineAttachList value for this CReportedByRecord.
     * 
     * @param reproStepsInlineAttachList
     */
    public void setReproStepsInlineAttachList(com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] reproStepsInlineAttachList) {
        this.reproStepsInlineAttachList = reproStepsInlineAttachList;
    }


    /**
     * Gets the standardtestconfig value for this CReportedByRecord.
     * 
     * @return standardtestconfig
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CSystem getStandardtestconfig() {
        return standardtestconfig;
    }


    /**
     * Sets the standardtestconfig value for this CReportedByRecord.
     * 
     * @param standardtestconfig
     */
    public void setStandardtestconfig(com.sempra.hr.cucumber.frwk.testtrack.util.CSystem standardtestconfig) {
        this.standardtestconfig = standardtestconfig;
    }


    /**
     * Gets the otherhardwaresoftware value for this CReportedByRecord.
     * 
     * @return otherhardwaresoftware
     */
    public java.lang.String getOtherhardwaresoftware() {
        return otherhardwaresoftware;
    }


    /**
     * Sets the otherhardwaresoftware value for this CReportedByRecord.
     * 
     * @param otherhardwaresoftware
     */
    public void setOtherhardwaresoftware(java.lang.String otherhardwaresoftware) {
        this.otherhardwaresoftware = otherhardwaresoftware;
    }


    /**
     * Gets the otherHWSWInlineAttachList value for this CReportedByRecord.
     * 
     * @return otherHWSWInlineAttachList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] getOtherHWSWInlineAttachList() {
        return otherHWSWInlineAttachList;
    }


    /**
     * Sets the otherHWSWInlineAttachList value for this CReportedByRecord.
     * 
     * @param otherHWSWInlineAttachList
     */
    public void setOtherHWSWInlineAttachList(com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] otherHWSWInlineAttachList) {
        this.otherHWSWInlineAttachList = otherHWSWInlineAttachList;
    }


    /**
     * Gets the testconfigtype value for this CReportedByRecord.
     * 
     * @return testconfigtype
     */
    public java.lang.Short getTestconfigtype() {
        return testconfigtype;
    }


    /**
     * Sets the testconfigtype value for this CReportedByRecord.
     * 
     * @param testconfigtype
     */
    public void setTestconfigtype(java.lang.Short testconfigtype) {
        this.testconfigtype = testconfigtype;
    }


    /**
     * Gets the attachmentlist value for this CReportedByRecord.
     * 
     * @return attachmentlist
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] getAttachmentlist() {
        return attachmentlist;
    }


    /**
     * Sets the attachmentlist value for this CReportedByRecord.
     * 
     * @param attachmentlist
     */
    public void setAttachmentlist(com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentlist) {
        this.attachmentlist = attachmentlist;
    }


    /**
     * Gets the showorder value for this CReportedByRecord.
     * 
     * @return showorder
     */
    public short getShoworder() {
        return showorder;
    }


    /**
     * Sets the showorder value for this CReportedByRecord.
     * 
     * @param showorder
     */
    public void setShoworder(short showorder) {
        this.showorder = showorder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CReportedByRecord)) return false;
        CReportedByRecord other = (CReportedByRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.foundby==null && other.getFoundby()==null) || 
             (this.foundby!=null &&
              this.foundby.equals(other.getFoundby()))) &&
            ((this.datefound==null && other.getDatefound()==null) || 
             (this.datefound!=null &&
              this.datefound.equals(other.getDatefound()))) &&
            ((this.contactinfo==null && other.getContactinfo()==null) || 
             (this.contactinfo!=null &&
              this.contactinfo.equals(other.getContactinfo()))) &&
            ((this.foundinversion==null && other.getFoundinversion()==null) || 
             (this.foundinversion!=null &&
              this.foundinversion.equals(other.getFoundinversion()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.commentsInlineAttachList==null && other.getCommentsInlineAttachList()==null) || 
             (this.commentsInlineAttachList!=null &&
              java.util.Arrays.equals(this.commentsInlineAttachList, other.getCommentsInlineAttachList()))) &&
            ((this.reproduced==null && other.getReproduced()==null) || 
             (this.reproduced!=null &&
              this.reproduced.equals(other.getReproduced()))) &&
            ((this.reproducedsteps==null && other.getReproducedsteps()==null) || 
             (this.reproducedsteps!=null &&
              this.reproducedsteps.equals(other.getReproducedsteps()))) &&
            ((this.reproStepsInlineAttachList==null && other.getReproStepsInlineAttachList()==null) || 
             (this.reproStepsInlineAttachList!=null &&
              java.util.Arrays.equals(this.reproStepsInlineAttachList, other.getReproStepsInlineAttachList()))) &&
            ((this.standardtestconfig==null && other.getStandardtestconfig()==null) || 
             (this.standardtestconfig!=null &&
              this.standardtestconfig.equals(other.getStandardtestconfig()))) &&
            ((this.otherhardwaresoftware==null && other.getOtherhardwaresoftware()==null) || 
             (this.otherhardwaresoftware!=null &&
              this.otherhardwaresoftware.equals(other.getOtherhardwaresoftware()))) &&
            ((this.otherHWSWInlineAttachList==null && other.getOtherHWSWInlineAttachList()==null) || 
             (this.otherHWSWInlineAttachList!=null &&
              java.util.Arrays.equals(this.otherHWSWInlineAttachList, other.getOtherHWSWInlineAttachList()))) &&
            ((this.testconfigtype==null && other.getTestconfigtype()==null) || 
             (this.testconfigtype!=null &&
              this.testconfigtype.equals(other.getTestconfigtype()))) &&
            ((this.attachmentlist==null && other.getAttachmentlist()==null) || 
             (this.attachmentlist!=null &&
              java.util.Arrays.equals(this.attachmentlist, other.getAttachmentlist()))) &&
            this.showorder == other.getShoworder();
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
        if (getFoundby() != null) {
            _hashCode += getFoundby().hashCode();
        }
        if (getDatefound() != null) {
            _hashCode += getDatefound().hashCode();
        }
        if (getContactinfo() != null) {
            _hashCode += getContactinfo().hashCode();
        }
        if (getFoundinversion() != null) {
            _hashCode += getFoundinversion().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCommentsInlineAttachList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommentsInlineAttachList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommentsInlineAttachList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReproduced() != null) {
            _hashCode += getReproduced().hashCode();
        }
        if (getReproducedsteps() != null) {
            _hashCode += getReproducedsteps().hashCode();
        }
        if (getReproStepsInlineAttachList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReproStepsInlineAttachList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReproStepsInlineAttachList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStandardtestconfig() != null) {
            _hashCode += getStandardtestconfig().hashCode();
        }
        if (getOtherhardwaresoftware() != null) {
            _hashCode += getOtherhardwaresoftware().hashCode();
        }
        if (getOtherHWSWInlineAttachList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherHWSWInlineAttachList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherHWSWInlineAttachList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTestconfigtype() != null) {
            _hashCode += getTestconfigtype().hashCode();
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
        _hashCode += getShoworder();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CReportedByRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CReportedByRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foundby");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foundby"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datefound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datefound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactinfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foundinversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foundinversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentsInlineAttachList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commentsInlineAttachList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFileAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reproduced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reproduced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reproducedsteps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reproducedsteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reproStepsInlineAttachList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reproStepsInlineAttachList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFileAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardtestconfig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "standardtestconfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CSystem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherhardwaresoftware");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherhardwaresoftware"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherHWSWInlineAttachList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherHWSWInlineAttachList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFileAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testconfigtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testconfigtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentlist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFileAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showorder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showorder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
