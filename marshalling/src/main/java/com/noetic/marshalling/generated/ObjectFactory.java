//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.26 at 11:54:25 AM IST 
//


package com.noetic.marshalling.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.noetic.marshalling.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Web2PayResultToken_QNAME = new QName("http://web2pay.com/5.0/2009/11/5.1.0/", "Web2PayResultToken");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.noetic.marshalling.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateToken }
     * 
     */
    public CreateToken createCreateToken() {
        return new CreateToken();
    }

    /**
     * Create an instance of {@link CreateTokenResponse }
     * 
     */
    public CreateTokenResponse createCreateTokenResponse() {
        return new CreateTokenResponse();
    }

    /**
     * Create an instance of {@link Web2PayResultToken }
     * 
     */
    public Web2PayResultToken createWeb2PayResultToken() {
        return new Web2PayResultToken();
    }

    /**
     * Create an instance of {@link ManageToken }
     * 
     */
    public ManageToken createManageToken() {
        return new ManageToken();
    }

    /**
     * Create an instance of {@link ManageTokenResponse }
     * 
     */
    public ManageTokenResponse createManageTokenResponse() {
        return new ManageTokenResponse();
    }

    /**
     * Create an instance of {@link CheckToken }
     * 
     */
    public CheckToken createCheckToken() {
        return new CheckToken();
    }

    /**
     * Create an instance of {@link CheckTokenResponse }
     * 
     */
    public CheckTokenResponse createCheckTokenResponse() {
        return new CheckTokenResponse();
    }

    /**
     * Create an instance of {@link GetToken }
     * 
     */
    public GetToken createGetToken() {
        return new GetToken();
    }

    /**
     * Create an instance of {@link GetTokenResponse }
     * 
     */
    public GetTokenResponse createGetTokenResponse() {
        return new GetTokenResponse();
    }

    /**
     * Create an instance of {@link CreateTokenCardRead }
     * 
     */
    public CreateTokenCardRead createCreateTokenCardRead() {
        return new CreateTokenCardRead();
    }

    /**
     * Create an instance of {@link CreateTokenCardReadResponse }
     * 
     */
    public CreateTokenCardReadResponse createCreateTokenCardReadResponse() {
        return new CreateTokenCardReadResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Web2PayResultToken }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Web2PayResultToken }{@code >}
     */
    @XmlElementDecl(namespace = "http://web2pay.com/5.0/2009/11/5.1.0/", name = "Web2PayResultToken")
    public JAXBElement<Web2PayResultToken> createWeb2PayResultToken(Web2PayResultToken value) {
        return new JAXBElement<Web2PayResultToken>(_Web2PayResultToken_QNAME, Web2PayResultToken.class, null, value);
    }

}