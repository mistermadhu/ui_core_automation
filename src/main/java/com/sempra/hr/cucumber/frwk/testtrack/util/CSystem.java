/**
 * CSystem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public class CSystem  extends com.sempra.hr.cucumber.frwk.testtrack.util.CSystemBase  implements java.io.Serializable {
    private java.lang.String computermodel;

    private java.lang.String computerbrand;

    private java.lang.String cputype;

    private java.lang.String cpuspeed;

    private java.lang.String harddisktype;

    private java.lang.String harddisksize;

    private java.lang.String ramsize;

    private java.lang.String romsize;

    private java.lang.String osname;

    private java.lang.String osversion;

    private java.lang.String videoname;

    private java.lang.Boolean hascdrom;

    private java.lang.String cdrommodel;

    private java.lang.Boolean hasscanner;

    private java.lang.String scannermodel;

    private java.lang.Boolean hasmodem;

    private java.lang.String modemmodel;

    private java.lang.Boolean hasprinter;

    private java.lang.String printermodel;

    private java.lang.String otherhardware;

    private java.lang.Boolean hasmultiplemonitors;

    public CSystem() {
    }

    public CSystem(
           long recordid,
           java.lang.String systemname,
           java.lang.String computermodel,
           java.lang.String computerbrand,
           java.lang.String cputype,
           java.lang.String cpuspeed,
           java.lang.String harddisktype,
           java.lang.String harddisksize,
           java.lang.String ramsize,
           java.lang.String romsize,
           java.lang.String osname,
           java.lang.String osversion,
           java.lang.String videoname,
           java.lang.Boolean hascdrom,
           java.lang.String cdrommodel,
           java.lang.Boolean hasscanner,
           java.lang.String scannermodel,
           java.lang.Boolean hasmodem,
           java.lang.String modemmodel,
           java.lang.Boolean hasprinter,
           java.lang.String printermodel,
           java.lang.String otherhardware,
           java.lang.Boolean hasmultiplemonitors) {
        super(
            recordid,
            systemname);
        this.computermodel = computermodel;
        this.computerbrand = computerbrand;
        this.cputype = cputype;
        this.cpuspeed = cpuspeed;
        this.harddisktype = harddisktype;
        this.harddisksize = harddisksize;
        this.ramsize = ramsize;
        this.romsize = romsize;
        this.osname = osname;
        this.osversion = osversion;
        this.videoname = videoname;
        this.hascdrom = hascdrom;
        this.cdrommodel = cdrommodel;
        this.hasscanner = hasscanner;
        this.scannermodel = scannermodel;
        this.hasmodem = hasmodem;
        this.modemmodel = modemmodel;
        this.hasprinter = hasprinter;
        this.printermodel = printermodel;
        this.otherhardware = otherhardware;
        this.hasmultiplemonitors = hasmultiplemonitors;
    }


    /**
     * Gets the computermodel value for this CSystem.
     * 
     * @return computermodel
     */
    public java.lang.String getComputermodel() {
        return computermodel;
    }


    /**
     * Sets the computermodel value for this CSystem.
     * 
     * @param computermodel
     */
    public void setComputermodel(java.lang.String computermodel) {
        this.computermodel = computermodel;
    }


    /**
     * Gets the computerbrand value for this CSystem.
     * 
     * @return computerbrand
     */
    public java.lang.String getComputerbrand() {
        return computerbrand;
    }


    /**
     * Sets the computerbrand value for this CSystem.
     * 
     * @param computerbrand
     */
    public void setComputerbrand(java.lang.String computerbrand) {
        this.computerbrand = computerbrand;
    }


    /**
     * Gets the cputype value for this CSystem.
     * 
     * @return cputype
     */
    public java.lang.String getCputype() {
        return cputype;
    }


    /**
     * Sets the cputype value for this CSystem.
     * 
     * @param cputype
     */
    public void setCputype(java.lang.String cputype) {
        this.cputype = cputype;
    }


    /**
     * Gets the cpuspeed value for this CSystem.
     * 
     * @return cpuspeed
     */
    public java.lang.String getCpuspeed() {
        return cpuspeed;
    }


    /**
     * Sets the cpuspeed value for this CSystem.
     * 
     * @param cpuspeed
     */
    public void setCpuspeed(java.lang.String cpuspeed) {
        this.cpuspeed = cpuspeed;
    }


    /**
     * Gets the harddisktype value for this CSystem.
     * 
     * @return harddisktype
     */
    public java.lang.String getHarddisktype() {
        return harddisktype;
    }


    /**
     * Sets the harddisktype value for this CSystem.
     * 
     * @param harddisktype
     */
    public void setHarddisktype(java.lang.String harddisktype) {
        this.harddisktype = harddisktype;
    }


    /**
     * Gets the harddisksize value for this CSystem.
     * 
     * @return harddisksize
     */
    public java.lang.String getHarddisksize() {
        return harddisksize;
    }


    /**
     * Sets the harddisksize value for this CSystem.
     * 
     * @param harddisksize
     */
    public void setHarddisksize(java.lang.String harddisksize) {
        this.harddisksize = harddisksize;
    }


    /**
     * Gets the ramsize value for this CSystem.
     * 
     * @return ramsize
     */
    public java.lang.String getRamsize() {
        return ramsize;
    }


    /**
     * Sets the ramsize value for this CSystem.
     * 
     * @param ramsize
     */
    public void setRamsize(java.lang.String ramsize) {
        this.ramsize = ramsize;
    }


    /**
     * Gets the romsize value for this CSystem.
     * 
     * @return romsize
     */
    public java.lang.String getRomsize() {
        return romsize;
    }


    /**
     * Sets the romsize value for this CSystem.
     * 
     * @param romsize
     */
    public void setRomsize(java.lang.String romsize) {
        this.romsize = romsize;
    }


    /**
     * Gets the osname value for this CSystem.
     * 
     * @return osname
     */
    public java.lang.String getOsname() {
        return osname;
    }


    /**
     * Sets the osname value for this CSystem.
     * 
     * @param osname
     */
    public void setOsname(java.lang.String osname) {
        this.osname = osname;
    }


    /**
     * Gets the osversion value for this CSystem.
     * 
     * @return osversion
     */
    public java.lang.String getOsversion() {
        return osversion;
    }


    /**
     * Sets the osversion value for this CSystem.
     * 
     * @param osversion
     */
    public void setOsversion(java.lang.String osversion) {
        this.osversion = osversion;
    }


    /**
     * Gets the videoname value for this CSystem.
     * 
     * @return videoname
     */
    public java.lang.String getVideoname() {
        return videoname;
    }


    /**
     * Sets the videoname value for this CSystem.
     * 
     * @param videoname
     */
    public void setVideoname(java.lang.String videoname) {
        this.videoname = videoname;
    }


    /**
     * Gets the hascdrom value for this CSystem.
     * 
     * @return hascdrom
     */
    public java.lang.Boolean getHascdrom() {
        return hascdrom;
    }


    /**
     * Sets the hascdrom value for this CSystem.
     * 
     * @param hascdrom
     */
    public void setHascdrom(java.lang.Boolean hascdrom) {
        this.hascdrom = hascdrom;
    }


    /**
     * Gets the cdrommodel value for this CSystem.
     * 
     * @return cdrommodel
     */
    public java.lang.String getCdrommodel() {
        return cdrommodel;
    }


    /**
     * Sets the cdrommodel value for this CSystem.
     * 
     * @param cdrommodel
     */
    public void setCdrommodel(java.lang.String cdrommodel) {
        this.cdrommodel = cdrommodel;
    }


    /**
     * Gets the hasscanner value for this CSystem.
     * 
     * @return hasscanner
     */
    public java.lang.Boolean getHasscanner() {
        return hasscanner;
    }


    /**
     * Sets the hasscanner value for this CSystem.
     * 
     * @param hasscanner
     */
    public void setHasscanner(java.lang.Boolean hasscanner) {
        this.hasscanner = hasscanner;
    }


    /**
     * Gets the scannermodel value for this CSystem.
     * 
     * @return scannermodel
     */
    public java.lang.String getScannermodel() {
        return scannermodel;
    }


    /**
     * Sets the scannermodel value for this CSystem.
     * 
     * @param scannermodel
     */
    public void setScannermodel(java.lang.String scannermodel) {
        this.scannermodel = scannermodel;
    }


    /**
     * Gets the hasmodem value for this CSystem.
     * 
     * @return hasmodem
     */
    public java.lang.Boolean getHasmodem() {
        return hasmodem;
    }


    /**
     * Sets the hasmodem value for this CSystem.
     * 
     * @param hasmodem
     */
    public void setHasmodem(java.lang.Boolean hasmodem) {
        this.hasmodem = hasmodem;
    }


    /**
     * Gets the modemmodel value for this CSystem.
     * 
     * @return modemmodel
     */
    public java.lang.String getModemmodel() {
        return modemmodel;
    }


    /**
     * Sets the modemmodel value for this CSystem.
     * 
     * @param modemmodel
     */
    public void setModemmodel(java.lang.String modemmodel) {
        this.modemmodel = modemmodel;
    }


    /**
     * Gets the hasprinter value for this CSystem.
     * 
     * @return hasprinter
     */
    public java.lang.Boolean getHasprinter() {
        return hasprinter;
    }


    /**
     * Sets the hasprinter value for this CSystem.
     * 
     * @param hasprinter
     */
    public void setHasprinter(java.lang.Boolean hasprinter) {
        this.hasprinter = hasprinter;
    }


    /**
     * Gets the printermodel value for this CSystem.
     * 
     * @return printermodel
     */
    public java.lang.String getPrintermodel() {
        return printermodel;
    }


    /**
     * Sets the printermodel value for this CSystem.
     * 
     * @param printermodel
     */
    public void setPrintermodel(java.lang.String printermodel) {
        this.printermodel = printermodel;
    }


    /**
     * Gets the otherhardware value for this CSystem.
     * 
     * @return otherhardware
     */
    public java.lang.String getOtherhardware() {
        return otherhardware;
    }


    /**
     * Sets the otherhardware value for this CSystem.
     * 
     * @param otherhardware
     */
    public void setOtherhardware(java.lang.String otherhardware) {
        this.otherhardware = otherhardware;
    }


    /**
     * Gets the hasmultiplemonitors value for this CSystem.
     * 
     * @return hasmultiplemonitors
     */
    public java.lang.Boolean getHasmultiplemonitors() {
        return hasmultiplemonitors;
    }


    /**
     * Sets the hasmultiplemonitors value for this CSystem.
     * 
     * @param hasmultiplemonitors
     */
    public void setHasmultiplemonitors(java.lang.Boolean hasmultiplemonitors) {
        this.hasmultiplemonitors = hasmultiplemonitors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSystem)) return false;
        CSystem other = (CSystem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.computermodel==null && other.getComputermodel()==null) || 
             (this.computermodel!=null &&
              this.computermodel.equals(other.getComputermodel()))) &&
            ((this.computerbrand==null && other.getComputerbrand()==null) || 
             (this.computerbrand!=null &&
              this.computerbrand.equals(other.getComputerbrand()))) &&
            ((this.cputype==null && other.getCputype()==null) || 
             (this.cputype!=null &&
              this.cputype.equals(other.getCputype()))) &&
            ((this.cpuspeed==null && other.getCpuspeed()==null) || 
             (this.cpuspeed!=null &&
              this.cpuspeed.equals(other.getCpuspeed()))) &&
            ((this.harddisktype==null && other.getHarddisktype()==null) || 
             (this.harddisktype!=null &&
              this.harddisktype.equals(other.getHarddisktype()))) &&
            ((this.harddisksize==null && other.getHarddisksize()==null) || 
             (this.harddisksize!=null &&
              this.harddisksize.equals(other.getHarddisksize()))) &&
            ((this.ramsize==null && other.getRamsize()==null) || 
             (this.ramsize!=null &&
              this.ramsize.equals(other.getRamsize()))) &&
            ((this.romsize==null && other.getRomsize()==null) || 
             (this.romsize!=null &&
              this.romsize.equals(other.getRomsize()))) &&
            ((this.osname==null && other.getOsname()==null) || 
             (this.osname!=null &&
              this.osname.equals(other.getOsname()))) &&
            ((this.osversion==null && other.getOsversion()==null) || 
             (this.osversion!=null &&
              this.osversion.equals(other.getOsversion()))) &&
            ((this.videoname==null && other.getVideoname()==null) || 
             (this.videoname!=null &&
              this.videoname.equals(other.getVideoname()))) &&
            ((this.hascdrom==null && other.getHascdrom()==null) || 
             (this.hascdrom!=null &&
              this.hascdrom.equals(other.getHascdrom()))) &&
            ((this.cdrommodel==null && other.getCdrommodel()==null) || 
             (this.cdrommodel!=null &&
              this.cdrommodel.equals(other.getCdrommodel()))) &&
            ((this.hasscanner==null && other.getHasscanner()==null) || 
             (this.hasscanner!=null &&
              this.hasscanner.equals(other.getHasscanner()))) &&
            ((this.scannermodel==null && other.getScannermodel()==null) || 
             (this.scannermodel!=null &&
              this.scannermodel.equals(other.getScannermodel()))) &&
            ((this.hasmodem==null && other.getHasmodem()==null) || 
             (this.hasmodem!=null &&
              this.hasmodem.equals(other.getHasmodem()))) &&
            ((this.modemmodel==null && other.getModemmodel()==null) || 
             (this.modemmodel!=null &&
              this.modemmodel.equals(other.getModemmodel()))) &&
            ((this.hasprinter==null && other.getHasprinter()==null) || 
             (this.hasprinter!=null &&
              this.hasprinter.equals(other.getHasprinter()))) &&
            ((this.printermodel==null && other.getPrintermodel()==null) || 
             (this.printermodel!=null &&
              this.printermodel.equals(other.getPrintermodel()))) &&
            ((this.otherhardware==null && other.getOtherhardware()==null) || 
             (this.otherhardware!=null &&
              this.otherhardware.equals(other.getOtherhardware()))) &&
            ((this.hasmultiplemonitors==null && other.getHasmultiplemonitors()==null) || 
             (this.hasmultiplemonitors!=null &&
              this.hasmultiplemonitors.equals(other.getHasmultiplemonitors())));
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
        if (getComputermodel() != null) {
            _hashCode += getComputermodel().hashCode();
        }
        if (getComputerbrand() != null) {
            _hashCode += getComputerbrand().hashCode();
        }
        if (getCputype() != null) {
            _hashCode += getCputype().hashCode();
        }
        if (getCpuspeed() != null) {
            _hashCode += getCpuspeed().hashCode();
        }
        if (getHarddisktype() != null) {
            _hashCode += getHarddisktype().hashCode();
        }
        if (getHarddisksize() != null) {
            _hashCode += getHarddisksize().hashCode();
        }
        if (getRamsize() != null) {
            _hashCode += getRamsize().hashCode();
        }
        if (getRomsize() != null) {
            _hashCode += getRomsize().hashCode();
        }
        if (getOsname() != null) {
            _hashCode += getOsname().hashCode();
        }
        if (getOsversion() != null) {
            _hashCode += getOsversion().hashCode();
        }
        if (getVideoname() != null) {
            _hashCode += getVideoname().hashCode();
        }
        if (getHascdrom() != null) {
            _hashCode += getHascdrom().hashCode();
        }
        if (getCdrommodel() != null) {
            _hashCode += getCdrommodel().hashCode();
        }
        if (getHasscanner() != null) {
            _hashCode += getHasscanner().hashCode();
        }
        if (getScannermodel() != null) {
            _hashCode += getScannermodel().hashCode();
        }
        if (getHasmodem() != null) {
            _hashCode += getHasmodem().hashCode();
        }
        if (getModemmodel() != null) {
            _hashCode += getModemmodel().hashCode();
        }
        if (getHasprinter() != null) {
            _hashCode += getHasprinter().hashCode();
        }
        if (getPrintermodel() != null) {
            _hashCode += getPrintermodel().hashCode();
        }
        if (getOtherhardware() != null) {
            _hashCode += getOtherhardware().hashCode();
        }
        if (getHasmultiplemonitors() != null) {
            _hashCode += getHasmultiplemonitors().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSystem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:testtrack-interface", "CSystem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computermodel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "computermodel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computerbrand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "computerbrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cputype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cputype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuspeed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpuspeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("harddisktype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "harddisktype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("harddisksize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "harddisksize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ramsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ramsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("romsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "romsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hascdrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hascdrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdrommodel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdrommodel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasscanner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasscanner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scannermodel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scannermodel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasmodem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasmodem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modemmodel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modemmodel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasprinter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasprinter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printermodel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printermodel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherhardware");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherhardware"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasmultiplemonitors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasmultiplemonitors"));
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
