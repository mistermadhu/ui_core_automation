/**
 * CFolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CFolder  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack  implements java.io.Serializable {
    private java.lang.Long createdbyuser;

    private java.lang.Boolean ispublic;

    private java.lang.Long modifiedbyuser;

    private java.lang.String locationaddedfrom;

    private java.util.Calendar datetimecreated;

    private java.util.Calendar datetimemodified;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String path;

    private java.lang.Long order;

    private java.lang.Long parentid;

    private java.lang.String foldertypename;

    private java.lang.String webview;

    private java.lang.String notes;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] notesInlineAttachList;

    private java.lang.Boolean noteseditable;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CScheduleInfo scheduleinfo;

    private java.lang.String taskboardname;

    public CFolder() {
    }

    public CFolder(
           long recordid,
           java.lang.Long createdbyuser,
           java.lang.Boolean ispublic,
           java.lang.Long modifiedbyuser,
           java.lang.String locationaddedfrom,
           java.util.Calendar datetimecreated,
           java.util.Calendar datetimemodified,
           java.lang.String name,
           java.lang.String description,
           java.lang.String path,
           java.lang.Long order,
           java.lang.Long parentid,
           java.lang.String foldertypename,
           java.lang.String webview,
           java.lang.String notes,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] notesInlineAttachList,
           java.lang.Boolean noteseditable,
           com.sempra.hr.cucumber.frwk.testtrack.util.CScheduleInfo scheduleinfo,
           java.lang.String taskboardname) {
        super(
            recordid);
        this.createdbyuser = createdbyuser;
        this.ispublic = ispublic;
        this.modifiedbyuser = modifiedbyuser;
        this.locationaddedfrom = locationaddedfrom;
        this.datetimecreated = datetimecreated;
        this.datetimemodified = datetimemodified;
        this.name = name;
        this.description = description;
        this.path = path;
        this.order = order;
        this.parentid = parentid;
        this.foldertypename = foldertypename;
        this.webview = webview;
        this.notes = notes;
        this.notesInlineAttachList = notesInlineAttachList;
        this.noteseditable = noteseditable;
        this.scheduleinfo = scheduleinfo;
        this.taskboardname = taskboardname;
    }


    /**
     * Gets the createdbyuser value for this CFolder.
     * 
     * @return createdbyuser
     */
    public java.lang.Long getCreatedbyuser() {
        return createdbyuser;
    }


    /**
     * Sets the createdbyuser value for this CFolder.
     * 
     * @param createdbyuser
     */
    public void setCreatedbyuser(java.lang.Long createdbyuser) {
        this.createdbyuser = createdbyuser;
    }


    /**
     * Gets the ispublic value for this CFolder.
     * 
     * @return ispublic
     */
    public java.lang.Boolean getIspublic() {
        return ispublic;
    }


    /**
     * Sets the ispublic value for this CFolder.
     * 
     * @param ispublic
     */
    public void setIspublic(java.lang.Boolean ispublic) {
        this.ispublic = ispublic;
    }


    /**
     * Gets the modifiedbyuser value for this CFolder.
     * 
     * @return modifiedbyuser
     */
    public java.lang.Long getModifiedbyuser() {
        return modifiedbyuser;
    }


    /**
     * Sets the modifiedbyuser value for this CFolder.
     * 
     * @param modifiedbyuser
     */
    public void setModifiedbyuser(java.lang.Long modifiedbyuser) {
        this.modifiedbyuser = modifiedbyuser;
    }


    /**
     * Gets the locationaddedfrom value for this CFolder.
     * 
     * @return locationaddedfrom
     */
    public java.lang.String getLocationaddedfrom() {
        return locationaddedfrom;
    }


    /**
     * Sets the locationaddedfrom value for this CFolder.
     * 
     * @param locationaddedfrom
     */
    public void setLocationaddedfrom(java.lang.String locationaddedfrom) {
        this.locationaddedfrom = locationaddedfrom;
    }


    /**
     * Gets the datetimecreated value for this CFolder.
     * 
     * @return datetimecreated
     */
    public java.util.Calendar getDatetimecreated() {
        return datetimecreated;
    }


    /**
     * Sets the datetimecreated value for this CFolder.
     * 
     * @param datetimecreated
     */
    public void setDatetimecreated(java.util.Calendar datetimecreated) {
        this.datetimecreated = datetimecreated;
    }


    /**
     * Gets the datetimemodified value for this CFolder.
     * 
     * @return datetimemodified
     */
    public java.util.Calendar getDatetimemodified() {
        return datetimemodified;
    }


    /**
     * Sets the datetimemodified value for this CFolder.
     * 
     * @param datetimemodified
     */
    public void setDatetimemodified(java.util.Calendar datetimemodified) {
        this.datetimemodified = datetimemodified;
    }


    /**
     * Gets the name value for this CFolder.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CFolder.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this CFolder.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CFolder.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the path value for this CFolder.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this CFolder.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the order value for this CFolder.
     * 
     * @return order
     */
    public java.lang.Long getOrder() {
        return order;
    }


    /**
     * Sets the order value for this CFolder.
     * 
     * @param order
     */
    public void setOrder(java.lang.Long order) {
        this.order = order;
    }


    /**
     * Gets the parentid value for this CFolder.
     * 
     * @return parentid
     */
    public java.lang.Long getParentid() {
        return parentid;
    }


    /**
     * Sets the parentid value for this CFolder.
     * 
     * @param parentid
     */
    public void setParentid(java.lang.Long parentid) {
        this.parentid = parentid;
    }


    /**
     * Gets the foldertypename value for this CFolder.
     * 
     * @return foldertypename
     */
    public java.lang.String getFoldertypename() {
        return foldertypename;
    }


    /**
     * Sets the foldertypename value for this CFolder.
     * 
     * @param foldertypename
     */
    public void setFoldertypename(java.lang.String foldertypename) {
        this.foldertypename = foldertypename;
    }


    /**
     * Gets the webview value for this CFolder.
     * 
     * @return webview
     */
    public java.lang.String getWebview() {
        return webview;
    }


    /**
     * Sets the webview value for this CFolder.
     * 
     * @param webview
     */
    public void setWebview(java.lang.String webview) {
        this.webview = webview;
    }


    /**
     * Gets the notes value for this CFolder.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CFolder.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesInlineAttachList value for this CFolder.
     * 
     * @return notesInlineAttachList
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] getNotesInlineAttachList() {
        return notesInlineAttachList;
    }


    /**
     * Sets the notesInlineAttachList value for this CFolder.
     * 
     * @param notesInlineAttachList
     */
    public void setNotesInlineAttachList(com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] notesInlineAttachList) {
        this.notesInlineAttachList = notesInlineAttachList;
    }


    /**
     * Gets the noteseditable value for this CFolder.
     * 
     * @return noteseditable
     */
    public java.lang.Boolean getNoteseditable() {
        return noteseditable;
    }


    /**
     * Sets the noteseditable value for this CFolder.
     * 
     * @param noteseditable
     */
    public void setNoteseditable(java.lang.Boolean noteseditable) {
        this.noteseditable = noteseditable;
    }


    /**
     * Gets the scheduleinfo value for this CFolder.
     * 
     * @return scheduleinfo
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CScheduleInfo getScheduleinfo() {
        return scheduleinfo;
    }


    /**
     * Sets the scheduleinfo value for this CFolder.
     * 
     * @param scheduleinfo
     */
    public void setScheduleinfo(com.sempra.hr.cucumber.frwk.testtrack.util.CScheduleInfo scheduleinfo) {
        this.scheduleinfo = scheduleinfo;
    }


    /**
     * Gets the taskboardname value for this CFolder.
     * 
     * @return taskboardname
     */
    public java.lang.String getTaskboardname() {
        return taskboardname;
    }


    /**
     * Sets the taskboardname value for this CFolder.
     * 
     * @param taskboardname
     */
    public void setTaskboardname(java.lang.String taskboardname) {
        this.taskboardname = taskboardname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFolder)) return false;
        CFolder other = (CFolder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdbyuser==null && other.getCreatedbyuser()==null) || 
             (this.createdbyuser!=null &&
              this.createdbyuser.equals(other.getCreatedbyuser()))) &&
            ((this.ispublic==null && other.getIspublic()==null) || 
             (this.ispublic!=null &&
              this.ispublic.equals(other.getIspublic()))) &&
            ((this.modifiedbyuser==null && other.getModifiedbyuser()==null) || 
             (this.modifiedbyuser!=null &&
              this.modifiedbyuser.equals(other.getModifiedbyuser()))) &&
            ((this.locationaddedfrom==null && other.getLocationaddedfrom()==null) || 
             (this.locationaddedfrom!=null &&
              this.locationaddedfrom.equals(other.getLocationaddedfrom()))) &&
            ((this.datetimecreated==null && other.getDatetimecreated()==null) || 
             (this.datetimecreated!=null &&
              this.datetimecreated.equals(other.getDatetimecreated()))) &&
            ((this.datetimemodified==null && other.getDatetimemodified()==null) || 
             (this.datetimemodified!=null &&
              this.datetimemodified.equals(other.getDatetimemodified()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.parentid==null && other.getParentid()==null) || 
             (this.parentid!=null &&
              this.parentid.equals(other.getParentid()))) &&
            ((this.foldertypename==null && other.getFoldertypename()==null) || 
             (this.foldertypename!=null &&
              this.foldertypename.equals(other.getFoldertypename()))) &&
            ((this.webview==null && other.getWebview()==null) || 
             (this.webview!=null &&
              this.webview.equals(other.getWebview()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesInlineAttachList==null && other.getNotesInlineAttachList()==null) || 
             (this.notesInlineAttachList!=null &&
              java.util.Arrays.equals(this.notesInlineAttachList, other.getNotesInlineAttachList()))) &&
            ((this.noteseditable==null && other.getNoteseditable()==null) || 
             (this.noteseditable!=null &&
              this.noteseditable.equals(other.getNoteseditable()))) &&
            ((this.scheduleinfo==null && other.getScheduleinfo()==null) || 
             (this.scheduleinfo!=null &&
              this.scheduleinfo.equals(other.getScheduleinfo()))) &&
            ((this.taskboardname==null && other.getTaskboardname()==null) || 
             (this.taskboardname!=null &&
              this.taskboardname.equals(other.getTaskboardname())));
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
        if (getCreatedbyuser() != null) {
            _hashCode += getCreatedbyuser().hashCode();
        }
        if (getIspublic() != null) {
            _hashCode += getIspublic().hashCode();
        }
        if (getModifiedbyuser() != null) {
            _hashCode += getModifiedbyuser().hashCode();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getParentid() != null) {
            _hashCode += getParentid().hashCode();
        }
        if (getFoldertypename() != null) {
            _hashCode += getFoldertypename().hashCode();
        }
        if (getWebview() != null) {
            _hashCode += getWebview().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesInlineAttachList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotesInlineAttachList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotesInlineAttachList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoteseditable() != null) {
            _hashCode += getNoteseditable().hashCode();
        }
        if (getScheduleinfo() != null) {
            _hashCode += getScheduleinfo().hashCode();
        }
        if (getTaskboardname() != null) {
            _hashCode += getTaskboardname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdbyuser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdbyuser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ispublic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ispublic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedbyuser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedbyuser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foldertypename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foldertypename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webview");
        elemField.setXmlName(new javax.xml.namespace.QName("", "webview"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesInlineAttachList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notesInlineAttachList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CFileAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteseditable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noteseditable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleinfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CScheduleInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskboardname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskboardname"));
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
