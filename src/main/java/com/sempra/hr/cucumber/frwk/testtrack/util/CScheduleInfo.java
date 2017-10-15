/**
 * CScheduleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CScheduleInfo  implements java.io.Serializable {
    private java.util.Date startdate;

    private java.util.Date enddate;

    private java.lang.Boolean includeweekends;

    private java.lang.Long nonworkingdays;

    private java.lang.Double hoursperday;

    private java.lang.Double ptohours;

    private java.lang.Double usersavailable;

    private java.lang.Long storypoints;

    public CScheduleInfo() {
    }

    public CScheduleInfo(
           java.util.Date startdate,
           java.util.Date enddate,
           java.lang.Boolean includeweekends,
           java.lang.Long nonworkingdays,
           java.lang.Double hoursperday,
           java.lang.Double ptohours,
           java.lang.Double usersavailable,
           java.lang.Long storypoints) {
           this.startdate = startdate;
           this.enddate = enddate;
           this.includeweekends = includeweekends;
           this.nonworkingdays = nonworkingdays;
           this.hoursperday = hoursperday;
           this.ptohours = ptohours;
           this.usersavailable = usersavailable;
           this.storypoints = storypoints;
    }


    /**
     * Gets the startdate value for this CScheduleInfo.
     * 
     * @return startdate
     */
    public java.util.Date getStartdate() {
        return startdate;
    }


    /**
     * Sets the startdate value for this CScheduleInfo.
     * 
     * @param startdate
     */
    public void setStartdate(java.util.Date startdate) {
        this.startdate = startdate;
    }


    /**
     * Gets the enddate value for this CScheduleInfo.
     * 
     * @return enddate
     */
    public java.util.Date getEnddate() {
        return enddate;
    }


    /**
     * Sets the enddate value for this CScheduleInfo.
     * 
     * @param enddate
     */
    public void setEnddate(java.util.Date enddate) {
        this.enddate = enddate;
    }


    /**
     * Gets the includeweekends value for this CScheduleInfo.
     * 
     * @return includeweekends
     */
    public java.lang.Boolean getIncludeweekends() {
        return includeweekends;
    }


    /**
     * Sets the includeweekends value for this CScheduleInfo.
     * 
     * @param includeweekends
     */
    public void setIncludeweekends(java.lang.Boolean includeweekends) {
        this.includeweekends = includeweekends;
    }


    /**
     * Gets the nonworkingdays value for this CScheduleInfo.
     * 
     * @return nonworkingdays
     */
    public java.lang.Long getNonworkingdays() {
        return nonworkingdays;
    }


    /**
     * Sets the nonworkingdays value for this CScheduleInfo.
     * 
     * @param nonworkingdays
     */
    public void setNonworkingdays(java.lang.Long nonworkingdays) {
        this.nonworkingdays = nonworkingdays;
    }


    /**
     * Gets the hoursperday value for this CScheduleInfo.
     * 
     * @return hoursperday
     */
    public java.lang.Double getHoursperday() {
        return hoursperday;
    }


    /**
     * Sets the hoursperday value for this CScheduleInfo.
     * 
     * @param hoursperday
     */
    public void setHoursperday(java.lang.Double hoursperday) {
        this.hoursperday = hoursperday;
    }


    /**
     * Gets the ptohours value for this CScheduleInfo.
     * 
     * @return ptohours
     */
    public java.lang.Double getPtohours() {
        return ptohours;
    }


    /**
     * Sets the ptohours value for this CScheduleInfo.
     * 
     * @param ptohours
     */
    public void setPtohours(java.lang.Double ptohours) {
        this.ptohours = ptohours;
    }


    /**
     * Gets the usersavailable value for this CScheduleInfo.
     * 
     * @return usersavailable
     */
    public java.lang.Double getUsersavailable() {
        return usersavailable;
    }


    /**
     * Sets the usersavailable value for this CScheduleInfo.
     * 
     * @param usersavailable
     */
    public void setUsersavailable(java.lang.Double usersavailable) {
        this.usersavailable = usersavailable;
    }


    /**
     * Gets the storypoints value for this CScheduleInfo.
     * 
     * @return storypoints
     */
    public java.lang.Long getStorypoints() {
        return storypoints;
    }


    /**
     * Sets the storypoints value for this CScheduleInfo.
     * 
     * @param storypoints
     */
    public void setStorypoints(java.lang.Long storypoints) {
        this.storypoints = storypoints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CScheduleInfo)) return false;
        CScheduleInfo other = (CScheduleInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startdate==null && other.getStartdate()==null) || 
             (this.startdate!=null &&
              this.startdate.equals(other.getStartdate()))) &&
            ((this.enddate==null && other.getEnddate()==null) || 
             (this.enddate!=null &&
              this.enddate.equals(other.getEnddate()))) &&
            ((this.includeweekends==null && other.getIncludeweekends()==null) || 
             (this.includeweekends!=null &&
              this.includeweekends.equals(other.getIncludeweekends()))) &&
            ((this.nonworkingdays==null && other.getNonworkingdays()==null) || 
             (this.nonworkingdays!=null &&
              this.nonworkingdays.equals(other.getNonworkingdays()))) &&
            ((this.hoursperday==null && other.getHoursperday()==null) || 
             (this.hoursperday!=null &&
              this.hoursperday.equals(other.getHoursperday()))) &&
            ((this.ptohours==null && other.getPtohours()==null) || 
             (this.ptohours!=null &&
              this.ptohours.equals(other.getPtohours()))) &&
            ((this.usersavailable==null && other.getUsersavailable()==null) || 
             (this.usersavailable!=null &&
              this.usersavailable.equals(other.getUsersavailable()))) &&
            ((this.storypoints==null && other.getStorypoints()==null) || 
             (this.storypoints!=null &&
              this.storypoints.equals(other.getStorypoints())));
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
        if (getStartdate() != null) {
            _hashCode += getStartdate().hashCode();
        }
        if (getEnddate() != null) {
            _hashCode += getEnddate().hashCode();
        }
        if (getIncludeweekends() != null) {
            _hashCode += getIncludeweekends().hashCode();
        }
        if (getNonworkingdays() != null) {
            _hashCode += getNonworkingdays().hashCode();
        }
        if (getHoursperday() != null) {
            _hashCode += getHoursperday().hashCode();
        }
        if (getPtohours() != null) {
            _hashCode += getPtohours().hashCode();
        }
        if (getUsersavailable() != null) {
            _hashCode += getUsersavailable().hashCode();
        }
        if (getStorypoints() != null) {
            _hashCode += getStorypoints().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CScheduleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CScheduleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enddate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enddate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeweekends");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeweekends"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonworkingdays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonworkingdays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursperday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hoursperday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptohours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptohours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usersavailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usersavailable"));
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
