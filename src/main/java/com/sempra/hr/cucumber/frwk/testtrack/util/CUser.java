/**
 * CUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;


/**
 * Inherits from CItemToTrack. Contains all user object fields stored
 * in TestTrack. Used by the addUser, editUser, getUser, saveUser, addCustomer,
 * editCustomer, getCustomer and saveCustomer requests. Use getDropdownFieldValuesForTable
 * to get the allowed values for the security group and email type fields.
 */
public class CUser  extends com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack  implements java.io.Serializable {
    private java.lang.String firstname;

    private java.lang.String middleinitials;

    private java.lang.String lastname;

    private java.lang.String usergroupname;

    private java.lang.String company;

    private java.lang.String division;

    private java.lang.String department;

    private java.lang.String emailtype;

    private java.lang.String emailaddress;

    private java.lang.Boolean isactive;

    private java.lang.Boolean iscustomer;

    private java.lang.Boolean isglobal;

    private java.lang.Boolean isactiveglobal;

    private java.lang.String userLicense;

    private java.lang.String userLicenseTCM;

    private java.lang.String userLicenseRM;

    private java.lang.String userLicenseRMReviewer;

    private java.lang.String userLicenseSuite;

    private java.lang.String password;

    private java.lang.String loginname;

    private com.sempra.hr.cucumber.frwk.testtrack.util.PhoneNumber phoneone;

    private com.sempra.hr.cucumber.frwk.testtrack.util.PhoneNumber phonetwo;

    private java.lang.String notes;

    private java.lang.Boolean betasite;

    private java.lang.String address;

    private com.sempra.hr.cucumber.frwk.testtrack.util.CSystem testconfig;

    public CUser() {
    }

    public CUser(
           long recordid,
           java.lang.String firstname,
           java.lang.String middleinitials,
           java.lang.String lastname,
           java.lang.String usergroupname,
           java.lang.String company,
           java.lang.String division,
           java.lang.String department,
           java.lang.String emailtype,
           java.lang.String emailaddress,
           java.lang.Boolean isactive,
           java.lang.Boolean iscustomer,
           java.lang.Boolean isglobal,
           java.lang.Boolean isactiveglobal,
           java.lang.String userLicense,
           java.lang.String userLicenseTCM,
           java.lang.String userLicenseRM,
           java.lang.String userLicenseRMReviewer,
           java.lang.String userLicenseSuite,
           java.lang.String password,
           java.lang.String loginname,
           com.sempra.hr.cucumber.frwk.testtrack.util.PhoneNumber phoneone,
           com.sempra.hr.cucumber.frwk.testtrack.util.PhoneNumber phonetwo,
           java.lang.String notes,
           java.lang.Boolean betasite,
           java.lang.String address,
           com.sempra.hr.cucumber.frwk.testtrack.util.CSystem testconfig) {
        super(
            recordid);
        this.firstname = firstname;
        this.middleinitials = middleinitials;
        this.lastname = lastname;
        this.usergroupname = usergroupname;
        this.company = company;
        this.division = division;
        this.department = department;
        this.emailtype = emailtype;
        this.emailaddress = emailaddress;
        this.isactive = isactive;
        this.iscustomer = iscustomer;
        this.isglobal = isglobal;
        this.isactiveglobal = isactiveglobal;
        this.userLicense = userLicense;
        this.userLicenseTCM = userLicenseTCM;
        this.userLicenseRM = userLicenseRM;
        this.userLicenseRMReviewer = userLicenseRMReviewer;
        this.userLicenseSuite = userLicenseSuite;
        this.password = password;
        this.loginname = loginname;
        this.phoneone = phoneone;
        this.phonetwo = phonetwo;
        this.notes = notes;
        this.betasite = betasite;
        this.address = address;
        this.testconfig = testconfig;
    }


    /**
     * Gets the firstname value for this CUser.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this CUser.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }


    /**
     * Gets the middleinitials value for this CUser.
     * 
     * @return middleinitials
     */
    public java.lang.String getMiddleinitials() {
        return middleinitials;
    }


    /**
     * Sets the middleinitials value for this CUser.
     * 
     * @param middleinitials
     */
    public void setMiddleinitials(java.lang.String middleinitials) {
        this.middleinitials = middleinitials;
    }


    /**
     * Gets the lastname value for this CUser.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this CUser.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }


    /**
     * Gets the usergroupname value for this CUser.
     * 
     * @return usergroupname
     */
    public java.lang.String getUsergroupname() {
        return usergroupname;
    }


    /**
     * Sets the usergroupname value for this CUser.
     * 
     * @param usergroupname
     */
    public void setUsergroupname(java.lang.String usergroupname) {
        this.usergroupname = usergroupname;
    }


    /**
     * Gets the company value for this CUser.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this CUser.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the division value for this CUser.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this CUser.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the department value for this CUser.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this CUser.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the emailtype value for this CUser.
     * 
     * @return emailtype
     */
    public java.lang.String getEmailtype() {
        return emailtype;
    }


    /**
     * Sets the emailtype value for this CUser.
     * 
     * @param emailtype
     */
    public void setEmailtype(java.lang.String emailtype) {
        this.emailtype = emailtype;
    }


    /**
     * Gets the emailaddress value for this CUser.
     * 
     * @return emailaddress
     */
    public java.lang.String getEmailaddress() {
        return emailaddress;
    }


    /**
     * Sets the emailaddress value for this CUser.
     * 
     * @param emailaddress
     */
    public void setEmailaddress(java.lang.String emailaddress) {
        this.emailaddress = emailaddress;
    }


    /**
     * Gets the isactive value for this CUser.
     * 
     * @return isactive
     */
    public java.lang.Boolean getIsactive() {
        return isactive;
    }


    /**
     * Sets the isactive value for this CUser.
     * 
     * @param isactive
     */
    public void setIsactive(java.lang.Boolean isactive) {
        this.isactive = isactive;
    }


    /**
     * Gets the iscustomer value for this CUser.
     * 
     * @return iscustomer
     */
    public java.lang.Boolean getIscustomer() {
        return iscustomer;
    }


    /**
     * Sets the iscustomer value for this CUser.
     * 
     * @param iscustomer
     */
    public void setIscustomer(java.lang.Boolean iscustomer) {
        this.iscustomer = iscustomer;
    }


    /**
     * Gets the isglobal value for this CUser.
     * 
     * @return isglobal
     */
    public java.lang.Boolean getIsglobal() {
        return isglobal;
    }


    /**
     * Sets the isglobal value for this CUser.
     * 
     * @param isglobal
     */
    public void setIsglobal(java.lang.Boolean isglobal) {
        this.isglobal = isglobal;
    }


    /**
     * Gets the isactiveglobal value for this CUser.
     * 
     * @return isactiveglobal
     */
    public java.lang.Boolean getIsactiveglobal() {
        return isactiveglobal;
    }


    /**
     * Sets the isactiveglobal value for this CUser.
     * 
     * @param isactiveglobal
     */
    public void setIsactiveglobal(java.lang.Boolean isactiveglobal) {
        this.isactiveglobal = isactiveglobal;
    }


    /**
     * Gets the userLicense value for this CUser.
     * 
     * @return userLicense
     */
    public java.lang.String getUserLicense() {
        return userLicense;
    }


    /**
     * Sets the userLicense value for this CUser.
     * 
     * @param userLicense
     */
    public void setUserLicense(java.lang.String userLicense) {
        this.userLicense = userLicense;
    }


    /**
     * Gets the userLicenseTCM value for this CUser.
     * 
     * @return userLicenseTCM
     */
    public java.lang.String getUserLicenseTCM() {
        return userLicenseTCM;
    }


    /**
     * Sets the userLicenseTCM value for this CUser.
     * 
     * @param userLicenseTCM
     */
    public void setUserLicenseTCM(java.lang.String userLicenseTCM) {
        this.userLicenseTCM = userLicenseTCM;
    }


    /**
     * Gets the userLicenseRM value for this CUser.
     * 
     * @return userLicenseRM
     */
    public java.lang.String getUserLicenseRM() {
        return userLicenseRM;
    }


    /**
     * Sets the userLicenseRM value for this CUser.
     * 
     * @param userLicenseRM
     */
    public void setUserLicenseRM(java.lang.String userLicenseRM) {
        this.userLicenseRM = userLicenseRM;
    }


    /**
     * Gets the userLicenseRMReviewer value for this CUser.
     * 
     * @return userLicenseRMReviewer
     */
    public java.lang.String getUserLicenseRMReviewer() {
        return userLicenseRMReviewer;
    }


    /**
     * Sets the userLicenseRMReviewer value for this CUser.
     * 
     * @param userLicenseRMReviewer
     */
    public void setUserLicenseRMReviewer(java.lang.String userLicenseRMReviewer) {
        this.userLicenseRMReviewer = userLicenseRMReviewer;
    }


    /**
     * Gets the userLicenseSuite value for this CUser.
     * 
     * @return userLicenseSuite
     */
    public java.lang.String getUserLicenseSuite() {
        return userLicenseSuite;
    }


    /**
     * Sets the userLicenseSuite value for this CUser.
     * 
     * @param userLicenseSuite
     */
    public void setUserLicenseSuite(java.lang.String userLicenseSuite) {
        this.userLicenseSuite = userLicenseSuite;
    }


    /**
     * Gets the password value for this CUser.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CUser.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the loginname value for this CUser.
     * 
     * @return loginname
     */
    public java.lang.String getLoginname() {
        return loginname;
    }


    /**
     * Sets the loginname value for this CUser.
     * 
     * @param loginname
     */
    public void setLoginname(java.lang.String loginname) {
        this.loginname = loginname;
    }


    /**
     * Gets the phoneone value for this CUser.
     * 
     * @return phoneone
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.PhoneNumber getPhoneone() {
        return phoneone;
    }


    /**
     * Sets the phoneone value for this CUser.
     * 
     * @param phoneone
     */
    public void setPhoneone(com.sempra.hr.cucumber.frwk.testtrack.util.PhoneNumber phoneone) {
        this.phoneone = phoneone;
    }


    /**
     * Gets the phonetwo value for this CUser.
     * 
     * @return phonetwo
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.PhoneNumber getPhonetwo() {
        return phonetwo;
    }


    /**
     * Sets the phonetwo value for this CUser.
     * 
     * @param phonetwo
     */
    public void setPhonetwo(com.sempra.hr.cucumber.frwk.testtrack.util.PhoneNumber phonetwo) {
        this.phonetwo = phonetwo;
    }


    /**
     * Gets the notes value for this CUser.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CUser.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the betasite value for this CUser.
     * 
     * @return betasite
     */
    public java.lang.Boolean getBetasite() {
        return betasite;
    }


    /**
     * Sets the betasite value for this CUser.
     * 
     * @param betasite
     */
    public void setBetasite(java.lang.Boolean betasite) {
        this.betasite = betasite;
    }


    /**
     * Gets the address value for this CUser.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CUser.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the testconfig value for this CUser.
     * 
     * @return testconfig
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CSystem getTestconfig() {
        return testconfig;
    }


    /**
     * Sets the testconfig value for this CUser.
     * 
     * @param testconfig
     */
    public void setTestconfig(com.sempra.hr.cucumber.frwk.testtrack.util.CSystem testconfig) {
        this.testconfig = testconfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CUser)) return false;
        CUser other = (CUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.firstname==null && other.getFirstname()==null) || 
             (this.firstname!=null &&
              this.firstname.equals(other.getFirstname()))) &&
            ((this.middleinitials==null && other.getMiddleinitials()==null) || 
             (this.middleinitials!=null &&
              this.middleinitials.equals(other.getMiddleinitials()))) &&
            ((this.lastname==null && other.getLastname()==null) || 
             (this.lastname!=null &&
              this.lastname.equals(other.getLastname()))) &&
            ((this.usergroupname==null && other.getUsergroupname()==null) || 
             (this.usergroupname!=null &&
              this.usergroupname.equals(other.getUsergroupname()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.emailtype==null && other.getEmailtype()==null) || 
             (this.emailtype!=null &&
              this.emailtype.equals(other.getEmailtype()))) &&
            ((this.emailaddress==null && other.getEmailaddress()==null) || 
             (this.emailaddress!=null &&
              this.emailaddress.equals(other.getEmailaddress()))) &&
            ((this.isactive==null && other.getIsactive()==null) || 
             (this.isactive!=null &&
              this.isactive.equals(other.getIsactive()))) &&
            ((this.iscustomer==null && other.getIscustomer()==null) || 
             (this.iscustomer!=null &&
              this.iscustomer.equals(other.getIscustomer()))) &&
            ((this.isglobal==null && other.getIsglobal()==null) || 
             (this.isglobal!=null &&
              this.isglobal.equals(other.getIsglobal()))) &&
            ((this.isactiveglobal==null && other.getIsactiveglobal()==null) || 
             (this.isactiveglobal!=null &&
              this.isactiveglobal.equals(other.getIsactiveglobal()))) &&
            ((this.userLicense==null && other.getUserLicense()==null) || 
             (this.userLicense!=null &&
              this.userLicense.equals(other.getUserLicense()))) &&
            ((this.userLicenseTCM==null && other.getUserLicenseTCM()==null) || 
             (this.userLicenseTCM!=null &&
              this.userLicenseTCM.equals(other.getUserLicenseTCM()))) &&
            ((this.userLicenseRM==null && other.getUserLicenseRM()==null) || 
             (this.userLicenseRM!=null &&
              this.userLicenseRM.equals(other.getUserLicenseRM()))) &&
            ((this.userLicenseRMReviewer==null && other.getUserLicenseRMReviewer()==null) || 
             (this.userLicenseRMReviewer!=null &&
              this.userLicenseRMReviewer.equals(other.getUserLicenseRMReviewer()))) &&
            ((this.userLicenseSuite==null && other.getUserLicenseSuite()==null) || 
             (this.userLicenseSuite!=null &&
              this.userLicenseSuite.equals(other.getUserLicenseSuite()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.loginname==null && other.getLoginname()==null) || 
             (this.loginname!=null &&
              this.loginname.equals(other.getLoginname()))) &&
            ((this.phoneone==null && other.getPhoneone()==null) || 
             (this.phoneone!=null &&
              this.phoneone.equals(other.getPhoneone()))) &&
            ((this.phonetwo==null && other.getPhonetwo()==null) || 
             (this.phonetwo!=null &&
              this.phonetwo.equals(other.getPhonetwo()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.betasite==null && other.getBetasite()==null) || 
             (this.betasite!=null &&
              this.betasite.equals(other.getBetasite()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.testconfig==null && other.getTestconfig()==null) || 
             (this.testconfig!=null &&
              this.testconfig.equals(other.getTestconfig())));
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
        if (getFirstname() != null) {
            _hashCode += getFirstname().hashCode();
        }
        if (getMiddleinitials() != null) {
            _hashCode += getMiddleinitials().hashCode();
        }
        if (getLastname() != null) {
            _hashCode += getLastname().hashCode();
        }
        if (getUsergroupname() != null) {
            _hashCode += getUsergroupname().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getEmailtype() != null) {
            _hashCode += getEmailtype().hashCode();
        }
        if (getEmailaddress() != null) {
            _hashCode += getEmailaddress().hashCode();
        }
        if (getIsactive() != null) {
            _hashCode += getIsactive().hashCode();
        }
        if (getIscustomer() != null) {
            _hashCode += getIscustomer().hashCode();
        }
        if (getIsglobal() != null) {
            _hashCode += getIsglobal().hashCode();
        }
        if (getIsactiveglobal() != null) {
            _hashCode += getIsactiveglobal().hashCode();
        }
        if (getUserLicense() != null) {
            _hashCode += getUserLicense().hashCode();
        }
        if (getUserLicenseTCM() != null) {
            _hashCode += getUserLicenseTCM().hashCode();
        }
        if (getUserLicenseRM() != null) {
            _hashCode += getUserLicenseRM().hashCode();
        }
        if (getUserLicenseRMReviewer() != null) {
            _hashCode += getUserLicenseRMReviewer().hashCode();
        }
        if (getUserLicenseSuite() != null) {
            _hashCode += getUserLicenseSuite().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getLoginname() != null) {
            _hashCode += getLoginname().hashCode();
        }
        if (getPhoneone() != null) {
            _hashCode += getPhoneone().hashCode();
        }
        if (getPhonetwo() != null) {
            _hashCode += getPhonetwo().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getBetasite() != null) {
            _hashCode += getBetasite().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getTestconfig() != null) {
            _hashCode += getTestconfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleinitials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "middleinitials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usergroupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usergroupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("", "division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isactive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iscustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iscustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isglobal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isglobal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isactiveglobal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isactiveglobal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicenseTCM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLicenseTCM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicenseRM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLicenseRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicenseRMReviewer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLicenseRMReviewer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicenseSuite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLicenseSuite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "PhoneNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phonetwo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phonetwo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "PhoneNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betasite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betasite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testconfig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testconfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CSystem"));
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
