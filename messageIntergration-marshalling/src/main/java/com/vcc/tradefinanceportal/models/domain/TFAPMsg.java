//
// This file was domain by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.27 at 06:28:16 PM IST 
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
 *         &lt;element name="Subscription">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "subscription",
    "attachment"
})
@XmlRootElement(name = "TFAPMsg")
public class TFAPMsg {

    @XmlElement(name = "Header", required = true)
    protected TFAPMsg.Header header;
    @XmlElement(name = "SenderInfo", required = true)
    protected TFAPMsg.SenderInfo senderInfo;
    @XmlElement(name = "Subscription", required = true)
    protected TFAPMsg.Subscription subscription;
    @XmlElement(name = "Attachment", required = true)
    protected TFAPMsg.Attachment attachment;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link TFAPMsg.Header }
     *     
     */
    public TFAPMsg.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFAPMsg.Header }
     *     
     */
    public void setHeader(TFAPMsg.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the senderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TFAPMsg.SenderInfo }
     *     
     */
    public TFAPMsg.SenderInfo getSenderInfo() {
        return senderInfo;
    }

    /**
     * Sets the value of the senderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFAPMsg.SenderInfo }
     *     
     */
    public void setSenderInfo(TFAPMsg.SenderInfo value) {
        this.senderInfo = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link TFAPMsg.Subscription }
     *     
     */
    public TFAPMsg.Subscription getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFAPMsg.Subscription }
     *     
     */
    public void setSubscription(TFAPMsg.Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link TFAPMsg.Attachment }
     *     
     */
    public TFAPMsg.Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFAPMsg.Attachment }
     *     
     */
    public void setAttachment(TFAPMsg.Attachment value) {
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
     *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "companyName",
        "productType"
    })
    public static class Subscription {

        @XmlElement(name = "CompanyID", required = true)
        protected String companyID;
        @XmlElement(name = "CompanyName", required = true)
        protected String companyName;
        @XmlElement(name = "ProductType", required = true)
        protected String productType;

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
         * Gets the value of the companyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyName() {
            return companyName;
        }

        /**
         * Sets the value of the companyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyName(String value) {
            this.companyName = value;
        }

        /**
         * Gets the value of the productType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductType() {
            return productType;
        }

        /**
         * Sets the value of the productType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductType(String value) {
            this.productType = value;
        }

    }

}
