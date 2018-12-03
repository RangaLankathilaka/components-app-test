//
// This file was domain by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.27 at 06:09:37 PM IST 
//


package com.vcc.tradefinanceportal.models.domain;

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
 *                   &lt;element name="AppResponseMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AppStatus">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AppProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AppUniqueID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="AppStatus" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="StatusDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BanksComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="BankID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DeptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ContactNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SentAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InstrumentData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "appStatus",
    "senderInfo",
    "instrumentData",
    "attachment"
})

@XmlRootElement(name = "BankMsg")
public class BankMsg {


    @XmlElement(name = "Header", required = true)
    protected BankMsg.Header header;
    @XmlElement(name = "AppStatus", required = true)
    protected BankMsg.AppStatus appStatus;
    @XmlElement(name = "SenderInfo", required = true)
    protected BankMsg.SenderInfo senderInfo;
    @XmlElement(name = "InstrumentData", required = true)
    protected BankMsg.InstrumentData instrumentData;
    @XmlElement(name = "Attachment", required = true)
    protected BankMsg.Attachment attachment;



    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link BankMsg.Header }
     *     
     */
    public BankMsg.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankMsg.Header }
     *     
     */
    public void setHeader(BankMsg.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the appStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BankMsg.AppStatus }
     *     
     */
    public BankMsg.AppStatus getAppStatus() {
        return appStatus;
    }

    /**
     * Sets the value of the appStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankMsg.AppStatus }
     *     
     */
    public void setAppStatus(BankMsg.AppStatus value) {
        this.appStatus = value;
    }

    /**
     * Gets the value of the senderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankMsg.SenderInfo }
     *     
     */
    public BankMsg.SenderInfo getSenderInfo() {
        return senderInfo;
    }

    /**
     * Sets the value of the senderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankMsg.SenderInfo }
     *     
     */
    public void setSenderInfo(BankMsg.SenderInfo value) {
        this.senderInfo = value;
    }

    /**
     * Gets the value of the instrumentData property.
     * 
     * @return
     *     possible object is
     *     {@link BankMsg.InstrumentData }
     *     
     */
    public BankMsg.InstrumentData getInstrumentData() {
        return instrumentData;
    }

    /**
     * Sets the value of the instrumentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankMsg.InstrumentData }
     *     
     */
    public void setInstrumentData(BankMsg.InstrumentData value) {
        this.instrumentData = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link BankMsg.Attachment }
     *     
     */
    public BankMsg.Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankMsg.Attachment }
     *     
     */
    public void setAttachment(BankMsg.Attachment value) {
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
     *         &lt;element name="AppProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AppUniqueID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="AppStatus" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="StatusDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BanksComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "appStatus",
        "statusDesc",
        "banksComment"
    })
    public static class AppStatus {

        @XmlElement(name = "AppProductType", required = true)
        protected String appProductType;
        @XmlElement(name = "AppUniqueID", required = true)
        protected BigInteger appUniqueID;
        @XmlElement(name = "AppStatus", required = true)
        protected BigInteger appStatus;
        @XmlElement(name = "StatusDesc", required = true)
        protected String statusDesc;
        @XmlElement(name = "BanksComment", required = true)
        protected String banksComment;

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
         * Gets the value of the appStatus property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAppStatus() {
            return appStatus;
        }

        /**
         * Sets the value of the appStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAppStatus(BigInteger value) {
            this.appStatus = value;
        }

        /**
         * Gets the value of the statusDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusDesc() {
            return statusDesc;
        }

        /**
         * Sets the value of the statusDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusDesc(String value) {
            this.statusDesc = value;
        }

        /**
         * Gets the value of the banksComment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBanksComment() {
            return banksComment;
        }

        /**
         * Sets the value of the banksComment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBanksComment(String value) {
            this.banksComment = value;
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
     *         &lt;element name="AppResponseMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "appResponseMsg",
        "releaseDate"
    })

    public static class Header {

        @XmlElement(name = "VersionNo", required = true)
        protected BigInteger versionNo;
        @XmlElement(name = "AppResponseMsg", required = true)
        protected String appResponseMsg;
        @XmlElement(name = "ReleaseDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar releaseDate;

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
         * Gets the value of the appResponseMsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppResponseMsg() {
            return appResponseMsg;
        }

        /**
         * Sets the value of the appResponseMsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppResponseMsg(String value) {
            this.appResponseMsg = value;
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
     *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
        "issueDate",
        "number",
        "expiryDate",
        "currency",
        "amount"
    })
    public static class InstrumentData {

        @XmlElement(name = "IssueDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar issueDate;
        @XmlElement(name = "Number", required = true)
        protected BigInteger number;
        @XmlElement(name = "ExpiryDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expiryDate;
        @XmlElement(name = "Currency", required = true)
        protected String currency;
        @XmlElement(name = "Amount")
        protected double amount;

        /**
         * Gets the value of the issueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getIssueDate() {
            return issueDate;
        }

        /**
         * Sets the value of the issueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setIssueDate(XMLGregorianCalendar value) {
            this.issueDate = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumber(BigInteger value) {
            this.number = value;
        }

        /**
         * Gets the value of the expiryDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpiryDate() {
            return expiryDate;
        }

        /**
         * Sets the value of the expiryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpiryDate(XMLGregorianCalendar value) {
            this.expiryDate = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         */
        public double getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         */
        public void setAmount(double value) {
            this.amount = value;
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
     *         &lt;element name="BankID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "bankID",
        "deptName",
        "contactNumber",
        "sentAt"
    })
    public static class SenderInfo {

        @XmlElement(name = "BankID", required = true)
        protected String bankID;
        @XmlElement(name = "DeptName", required = true)
        protected String deptName;
        @XmlElement(name = "ContactNumber", required = true)
        protected String contactNumber;
        @XmlElement(name = "SentAt", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar sentAt;

        /**
         * Gets the value of the bankID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankID() {
            return bankID;
        }

        /**
         * Sets the value of the bankID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankID(String value) {
            this.bankID = value;
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
