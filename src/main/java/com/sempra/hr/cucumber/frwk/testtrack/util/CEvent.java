/**
 * CEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * The base used for all events. All events extend this structure.
 */
public class CEvent  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemWithDBRecordId  implements java.io.Serializable {
    private java.lang.String user;

    private java.util.Calendar date;

    private java.lang.String notes;

    private short eventaddorder;

    private java.lang.String name;

    private java.lang.Long parenteventid;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentlist;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CField[] fieldlist;

    private java.lang.String resultingstate;

    private java.lang.Double hours;

    private java.lang.String[] assigntolist;

    private java.lang.String releasenotesversion;

    private java.lang.String generatedeventtype;

    private java.lang.String generatedbyname;

    private java.lang.Double totaltimespent;

    private java.lang.String overrideuser;

    private java.lang.Boolean marksuspect;

    public CEvent() {
    }

    public CEvent(
           long recordid,
           java.lang.String user,
           java.util.Calendar date,
           java.lang.String notes,
           short eventaddorder,
           java.lang.String name,
           java.lang.Long parenteventid,
           com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentlist,
           com.sempra.hr.cucumber.frwk.testtrack.util.CField[] fieldlist,
           java.lang.String resultingstate,
           java.lang.Double hours,
           java.lang.String[] assigntolist,
           java.lang.String releasenotesversion,
           java.lang.String generatedeventtype,
           java.lang.String generatedbyname,
           java.lang.Double totaltimespent,
           java.lang.String overrideuser,
           java.lang.Boolean marksuspect) {
        super(
            recordid);
        this.user = user;
        this.date = date;
        this.notes = notes;
        this.eventaddorder = eventaddorder;
        this.name = name;
        this.parenteventid = parenteventid;
        this.attachmentlist = attachmentlist;
        this.fieldlist = fieldlist;
        this.resultingstate = resultingstate;
        this.hours = hours;
        this.assigntolist = assigntolist;
        this.releasenotesversion = releasenotesversion;
        this.generatedeventtype = generatedeventtype;
        this.generatedbyname = generatedbyname;
        this.totaltimespent = totaltimespent;
        this.overrideuser = overrideuser;
        this.marksuspect = marksuspect;
    }


    /**
     * Gets the user value for this CEvent.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this CEvent.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the date value for this CEvent.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this CEvent.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the notes value for this CEvent.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CEvent.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the eventaddorder value for this CEvent.
     * 
     * @return eventaddorder
     */
    public short getEventaddorder() {
        return eventaddorder;
    }


    /**
     * Sets the eventaddorder value for this CEvent.
     * 
     * @param eventaddorder
     */
    public void setEventaddorder(short eventaddorder) {
        this.eventaddorder = eventaddorder;
    }


    /**
     * Gets the name value for this CEvent.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CEvent.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parenteventid value for this CEvent.
     * 
     * @return parenteventid
     */
    public java.lang.Long getParenteventid() {
        return parenteventid;
    }


    /**
     * Sets the parenteventid value for this CEvent.
     * 
     * @param parenteventid
     */
    public void setParenteventid(java.lang.Long parenteventid) {
        this.parenteventid = parenteventid;
    }


    /**
     * Gets the attachmentlist value for this CEvent.
     * 
     * @return attachmentlist
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] getAttachmentlist() {
        return attachmentlist;
    }


    /**
     * Sets the attachmentlist value for this CEvent.
     * 
     * @param attachmentlist
     */
    public void setAttachmentlist(com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment[] attachmentlist) {
        this.attachmentlist = attachmentlist;
    }


    /**
     * Gets the fieldlist value for this CEvent.
     * 
     * @return fieldlist
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CField[] getFieldlist() {
        return fieldlist;
    }


    /**
     * Sets the fieldlist value for this CEvent.
     * 
     * @param fieldlist
     */
    public void setFieldlist(com.sempra.hr.cucumber.frwk.testtrack.util.CField[] fieldlist) {
        this.fieldlist = fieldlist;
    }


    /**
     * Gets the resultingstate value for this CEvent.
     * 
     * @return resultingstate
     */
    public java.lang.String getResultingstate() {
        return resultingstate;
    }


    /**
     * Sets the resultingstate value for this CEvent.
     * 
     * @param resultingstate
     */
    public void setResultingstate(java.lang.String resultingstate) {
        this.resultingstate = resultingstate;
    }


    /**
     * Gets the hours value for this CEvent.
     * 
     * @return hours
     */
    public java.lang.Double getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this CEvent.
     * 
     * @param hours
     */
    public void setHours(java.lang.Double hours) {
        this.hours = hours;
    }


    /**
     * Gets the assigntolist value for this CEvent.
     * 
     * @return assigntolist
     */
    public java.lang.String[] getAssigntolist() {
        return assigntolist;
    }


    /**
     * Sets the assigntolist value for this CEvent.
     * 
     * @param assigntolist
     */
    public void setAssigntolist(java.lang.String[] assigntolist) {
        this.assigntolist = assigntolist;
    }


    /**
     * Gets the releasenotesversion value for this CEvent.
     * 
     * @return releasenotesversion
     */
    public java.lang.String getReleasenotesversion() {
        return releasenotesversion;
    }


    /**
     * Sets the releasenotesversion value for this CEvent.
     * 
     * @param releasenotesversion
     */
    public void setReleasenotesversion(java.lang.String releasenotesversion) {
        this.releasenotesversion = releasenotesversion;
    }


    /**
     * Gets the generatedeventtype value for this CEvent.
     * 
     * @return generatedeventtype
     */
    public java.lang.String getGeneratedeventtype() {
        return generatedeventtype;
    }


    /**
     * Sets the generatedeventtype value for this CEvent.
     * 
     * @param generatedeventtype
     */
    public void setGeneratedeventtype(java.lang.String generatedeventtype) {
        this.generatedeventtype = generatedeventtype;
    }


    /**
     * Gets the generatedbyname value for this CEvent.
     * 
     * @return generatedbyname
     */
    public java.lang.String getGeneratedbyname() {
        return generatedbyname;
    }


    /**
     * Sets the generatedbyname value for this CEvent.
     * 
     * @param generatedbyname
     */
    public void setGeneratedbyname(java.lang.String generatedbyname) {
        this.generatedbyname = generatedbyname;
    }


    /**
     * Gets the totaltimespent value for this CEvent.
     * 
     * @return totaltimespent
     */
    public java.lang.Double getTotaltimespent() {
        return totaltimespent;
    }


    /**
     * Sets the totaltimespent value for this CEvent.
     * 
     * @param totaltimespent
     */
    public void setTotaltimespent(java.lang.Double totaltimespent) {
        this.totaltimespent = totaltimespent;
    }


    /**
     * Gets the overrideuser value for this CEvent.
     * 
     * @return overrideuser
     */
    public java.lang.String getOverrideuser() {
        return overrideuser;
    }


    /**
     * Sets the overrideuser value for this CEvent.
     * 
     * @param overrideuser
     */
    public void setOverrideuser(java.lang.String overrideuser) {
        this.overrideuser = overrideuser;
    }


    /**
     * Gets the marksuspect value for this CEvent.
     * 
     * @return marksuspect
     */
    public java.lang.Boolean getMarksuspect() {
        return marksuspect;
    }


    /**
     * Sets the marksuspect value for this CEvent.
     * 
     * @param marksuspect
     */
    public void setMarksuspect(java.lang.Boolean marksuspect) {
        this.marksuspect = marksuspect;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CEvent)) return false;
        CEvent other = (CEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            this.eventaddorder == other.getEventaddorder() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parenteventid==null && other.getParenteventid()==null) || 
             (this.parenteventid!=null &&
              this.parenteventid.equals(other.getParenteventid()))) &&
            ((this.attachmentlist==null && other.getAttachmentlist()==null) || 
             (this.attachmentlist!=null &&
              java.util.Arrays.equals(this.attachmentlist, other.getAttachmentlist()))) &&
            ((this.fieldlist==null && other.getFieldlist()==null) || 
             (this.fieldlist!=null &&
              java.util.Arrays.equals(this.fieldlist, other.getFieldlist()))) &&
            ((this.resultingstate==null && other.getResultingstate()==null) || 
             (this.resultingstate!=null &&
              this.resultingstate.equals(other.getResultingstate()))) &&
            ((this.hours==null && other.getHours()==null) || 
             (this.hours!=null &&
              this.hours.equals(other.getHours()))) &&
            ((this.assigntolist==null && other.getAssigntolist()==null) || 
             (this.assigntolist!=null &&
              java.util.Arrays.equals(this.assigntolist, other.getAssigntolist()))) &&
            ((this.releasenotesversion==null && other.getReleasenotesversion()==null) || 
             (this.releasenotesversion!=null &&
              this.releasenotesversion.equals(other.getReleasenotesversion()))) &&
            ((this.generatedeventtype==null && other.getGeneratedeventtype()==null) || 
             (this.generatedeventtype!=null &&
              this.generatedeventtype.equals(other.getGeneratedeventtype()))) &&
            ((this.generatedbyname==null && other.getGeneratedbyname()==null) || 
             (this.generatedbyname!=null &&
              this.generatedbyname.equals(other.getGeneratedbyname()))) &&
            ((this.totaltimespent==null && other.getTotaltimespent()==null) || 
             (this.totaltimespent!=null &&
              this.totaltimespent.equals(other.getTotaltimespent()))) &&
            ((this.overrideuser==null && other.getOverrideuser()==null) || 
             (this.overrideuser!=null &&
              this.overrideuser.equals(other.getOverrideuser()))) &&
            ((this.marksuspect==null && other.getMarksuspect()==null) || 
             (this.marksuspect!=null &&
              this.marksuspect.equals(other.getMarksuspect())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        _hashCode += getEventaddorder();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParenteventid() != null) {
            _hashCode += getParenteventid().hashCode();
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
        if (getFieldlist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldlist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldlist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResultingstate() != null) {
            _hashCode += getResultingstate().hashCode();
        }
        if (getHours() != null) {
            _hashCode += getHours().hashCode();
        }
        if (getAssigntolist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssigntolist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssigntolist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReleasenotesversion() != null) {
            _hashCode += getReleasenotesversion().hashCode();
        }
        if (getGeneratedeventtype() != null) {
            _hashCode += getGeneratedeventtype().hashCode();
        }
        if (getGeneratedbyname() != null) {
            _hashCode += getGeneratedbyname().hashCode();
        }
        if (getTotaltimespent() != null) {
            _hashCode += getTotaltimespent().hashCode();
        }
        if (getOverrideuser() != null) {
            _hashCode += getOverrideuser().hashCode();
        }
        if (getMarksuspect() != null) {
            _hashCode += getMarksuspect().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("eventaddorder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventaddorder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parenteventid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parenteventid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("fieldlist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultingstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultingstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigntolist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigntolist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releasenotesversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releasenotesversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generatedeventtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generatedeventtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generatedbyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generatedbyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaltimespent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totaltimespent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideuser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overrideuser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marksuspect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marksuspect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
