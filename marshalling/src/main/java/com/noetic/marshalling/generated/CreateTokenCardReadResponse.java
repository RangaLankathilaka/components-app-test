//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.26 at 11:54:25 AM IST 
//


package com.noetic.marshalling.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateTokenCardReadResult" type="{http://sixcardsolutions.com/W2P/Front/Entity/2009/05/5.1.0}Web2PayResultToken" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createTokenCardReadResult"
})
@XmlRootElement(name = "CreateTokenCardReadResponse")
public class CreateTokenCardReadResponse {

    @XmlElement(name = "CreateTokenCardReadResult")
    protected Web2PayResultToken createTokenCardReadResult;

    /**
     * Gets the value of the createTokenCardReadResult property.
     * 
     * @return
     *     possible object is
     *     {@link Web2PayResultToken }
     *     
     */
    public Web2PayResultToken getCreateTokenCardReadResult() {
        return createTokenCardReadResult;
    }

    /**
     * Sets the value of the createTokenCardReadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Web2PayResultToken }
     *     
     */
    public void setCreateTokenCardReadResult(Web2PayResultToken value) {
        this.createTokenCardReadResult = value;
    }

}
