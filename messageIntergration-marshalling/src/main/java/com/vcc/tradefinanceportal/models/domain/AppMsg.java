//
// This file was domain by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.11.27 at 06:08:03 PM IST
//


package com.vcc.tradefinanceportal.models.domain;

import com.vcc.tradefinanceportal.dto.AppRelatedAppXMLDetailstest;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VersionNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="MsgType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SenderInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DeptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ContactNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SentAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NewApp">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AppProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AppUniqueID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="AppRelatedAppXMLDetailstest" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AppAmendment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AppUniqueID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="IsChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="IsCancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ChangeDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Attachment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AttachedDocCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="AttachedDocFileNames" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "header",
        "senderInfo",
        "newApp",
        "appAmendment",
        "attachment"
})
@XmlRootElement(name = "TFAPMsg")
public class AppMsg {

    @XmlElement(name = "Header", required = true)
    protected AppMsg.Header header;
    @XmlElement(name = "SenderInfo", required = true)
    protected AppMsg.SenderInfo senderInfo;
    @XmlElement(name = "NewApp", required = true)
    protected AppMsg.NewApp newApp;
    @XmlElement(name = "AppAmendment", required = true)
    protected AppMsg.AppAmendment appAmendment;
    @XmlElement(name = "Attachment", required = true)
    protected AppMsg.Attachment attachment;

    /**
     * Gets the value of the header property.
     *
     * @return
     *     possible object is
     *     {@link AppMsg.Header }
     *
     */
    public AppMsg.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     *
     * @param value
     *     allowed object is
     *     {@link AppMsg.Header }
     *
     */
    public void setHeader(AppMsg.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the senderInfo property.
     *
     * @return
     *     possible object is
     *     {@link AppMsg.SenderInfo }
     *
     */
    public AppMsg.SenderInfo getSenderInfo() {
        return senderInfo;
    }

    /**
     * Sets the value of the senderInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link AppMsg.SenderInfo }
     *
     */
    public void setSenderInfo(AppMsg.SenderInfo value) {
        this.senderInfo = value;
    }

    /**
     * Gets the value of the newApp property.
     *
     * @return
     *     possible object is
     *     {@link AppMsg.NewApp }
     *
     */
    public AppMsg.NewApp getNewApp() {
        return newApp;
    }

    /**
     * Sets the value of the newApp property.
     *
     * @param value
     *     allowed object is
     *     {@link AppMsg.NewApp }
     *
     */
    public void setNewApp(AppMsg.NewApp value) {
        this.newApp = value;
    }

    /**
     * Gets the value of the appAmendment property.
     *
     * @return
     *     possible object is
     *     {@link AppMsg.AppAmendment }
     *
     */
    public AppMsg.AppAmendment getAppAmendment() {
        return appAmendment;
    }

    /**
     * Sets the value of the appAmendment property.
     *
     * @param value
     *     allowed object is
     *     {@link AppMsg.AppAmendment }
     *
     */
    public void setAppAmendment(AppMsg.AppAmendment value) {
        this.appAmendment = value;
    }

    /**
     * Gets the value of the attachment property.
     *
     * @return
     *     possible object is
     *     {@link AppMsg.Attachment }
     *
     */
    public AppMsg.Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     *
     * @param value
     *     allowed object is
     *     {@link AppMsg.Attachment }
     *
     */
    public void setAttachment(AppMsg.Attachment value) {
        this.attachment = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AppUniqueID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="IsChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="IsCancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ChangeDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "appUniqueID",
            "isChange",
            "isCancel",
            "changeDetails"
    })
    public static class AppAmendment {

        @XmlElement(name = "AppUniqueID", required = true)
        protected BigInteger appUniqueID;
        @XmlElement(name = "IsChange")
        protected boolean isChange;
        @XmlElement(name = "IsCancel")
        protected boolean isCancel;
        @XmlElement(name = "ChangeDetails", required = true)
        protected String changeDetails;

        /**
         * Gets the value of the appUniqueID property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getAppUniqueID() {
            return appUniqueID;
        }

        /**
         * Sets the value of the appUniqueID property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setAppUniqueID(BigInteger value) {
            this.appUniqueID = value;
        }

        /**
         * Gets the value of the isChange property.
         *
         */
        public boolean isIsChange() {
            return isChange;
        }

        /**
         * Sets the value of the isChange property.
         *
         */
        public void setIsChange(boolean value) {
            this.isChange = value;
        }

        /**
         * Gets the value of the isCancel property.
         *
         */
        public boolean isIsCancel() {
            return isCancel;
        }

        /**
         * Sets the value of the isCancel property.
         *
         */
        public void setIsCancel(boolean value) {
            this.isCancel = value;
        }

        /**
         * Gets the value of the changeDetails property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getChangeDetails() {
            return changeDetails;
        }

        /**
         * Sets the value of the changeDetails property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setChangeDetails(String value) {
            this.changeDetails = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AttachedDocCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="AttachedDocFileNames" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "attachedDocCount",
            "attachedDocFileNames"
    })
    public static class Attachment {

        @XmlElement(name = "AttachedDocCount", required = true)
        protected BigInteger attachedDocCount;
        @XmlElement(name = "AttachedDocFileNames", required = true)
        protected String attachedDocFileNames;

        /**
         * Gets the value of the attachedDocCount property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getAttachedDocCount() {
            return attachedDocCount;
        }

        /**
         * Sets the value of the attachedDocCount property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setAttachedDocCount(BigInteger value) {
            this.attachedDocCount = value;
        }

        /**
         * Gets the value of the attachedDocFileNames property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAttachedDocFileNames() {
            return attachedDocFileNames;
        }

        /**
         * Sets the value of the attachedDocFileNames property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAttachedDocFileNames(String value) {
            this.attachedDocFileNames = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VersionNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="MsgType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "versionNo",
            "releaseDate",
            "msgType"
    })
    public static class Header {

        @XmlElement(name = "VersionNo", required = true)
        protected BigInteger versionNo;
        @XmlElement(name = "ReleaseDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar releaseDate;
        @XmlElement(name = "MsgType", required = true)
        protected String msgType;

        /**
         * Gets the value of the versionNo property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getVersionNo() {
            return versionNo;
        }

        /**
         * Sets the value of the versionNo property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setVersionNo(BigInteger value) {
            this.versionNo = value;
        }

        /**
         * Gets the value of the releaseDate property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getReleaseDate() {
            return releaseDate;
        }

        /**
         * Sets the value of the releaseDate property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setReleaseDate(XMLGregorianCalendar value) {
            this.releaseDate = value;
        }

        /**
         * Gets the value of the msgType property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMsgType() {
            return msgType;
        }

        /**
         * Sets the value of the msgType property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMsgType(String value) {
            this.msgType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AppProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AppUniqueID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="AppRelatedAppXMLDetailstest" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "appProductType",
            "appUniqueID",
            "appRelatedAppXMLDetails"
    })
    public static class NewApp {

        @XmlElement(name = "AppProductType", required = true)
        protected String appProductType;
        @XmlElement(name = "AppUniqueID", required = true)
        protected BigInteger appUniqueID;
        @XmlElement(name = "AppRelatedAppXMLDetails", required = true)
        protected AppRelatedAppXMLDetailstest appRelatedAppXMLDetails=new AppRelatedAppXMLDetailstest();

        /**
         * Gets the value of the appProductType property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAppProductType() {
            return appProductType;
        }

        /**
         * Sets the value of the appProductType property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAppProductType(String value) {
            this.appProductType = value;
        }

        /**
         * Gets the value of the appUniqueID property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getAppUniqueID() {
            return appUniqueID;
        }

        /**
         * Sets the value of the appUniqueID property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setAppUniqueID(BigInteger value) {
            this.appUniqueID = value;
        }

        /**
         * Gets the value of the appRelatedAppXMLDetails property.
         *
         * @return
         *     possible object is
         *     {@link Object }
         *
         */

        public AppRelatedAppXMLDetailstest getAppRelatedAppXMLDetails() {
            return appRelatedAppXMLDetails;
        }

        /**
         * Sets the value of the appRelatedAppXMLDetails property.
         *
         * @param value
         *     allowed object is
         *     {@link Object }
         *
         */
//        public void setAppRelatedAppXMLDetails(Object value) {
//            this.appRelatedAppXMLDetails = value;
//        }


        public void setAppRelatedAppXMLDetails(AppRelatedAppXMLDetailstest appRelatedAppXMLDetails) {
            this.appRelatedAppXMLDetails = appRelatedAppXMLDetails;
        }
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DeptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ContactNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SentAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "companyID",
            "deptName",
            "contactNumber",
            "sentAt"
    })
    public static class SenderInfo {

        @XmlElement(name = "CompanyID", required = true)
        protected String companyID;
        @XmlElement(name = "DeptName", required = true)
        protected String deptName;
        @XmlElement(name = "ContactNumber", required = true)
        protected String contactNumber;
        @XmlElement(name = "SentAt", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar sentAt;

        /**
         * Gets the value of the companyID property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCompanyID() {
            return companyID;
        }

        /**
         * Sets the value of the companyID property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCompanyID(String value) {
            this.companyID = value;
        }

        /**
         * Gets the value of the deptName property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDeptName() {
            return deptName;
        }

        /**
         * Sets the value of the deptName property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDeptName(String value) {
            this.deptName = value;
        }

        /**
         * Gets the value of the contactNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getContactNumber() {
            return contactNumber;
        }

        /**
         * Sets the value of the contactNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setContactNumber(String value) {
            this.contactNumber = value;
        }

        /**
         * Gets the value of the sentAt property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getSentAt() {
            return sentAt;
        }

        /**
         * Sets the value of the sentAt property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setSentAt(XMLGregorianCalendar value) {
            this.sentAt = value;
        }

    }

}
