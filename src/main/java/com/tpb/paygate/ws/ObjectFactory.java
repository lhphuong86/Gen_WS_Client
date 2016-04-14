
package com.tpb.paygate.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tpb.paygate.ws package. 
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

    private final static QName _ProcessRequestCode_QNAME = new QName("http://ws.paygate.tpb.com", "code");
    private final static QName _ProcessRequestPassword_QNAME = new QName("http://ws.paygate.tpb.com", "password");
    private final static QName _ProcessRequestUser_QNAME = new QName("http://ws.paygate.tpb.com", "user");
    private final static QName _ProcessRequestMessage_QNAME = new QName("http://ws.paygate.tpb.com", "message");
    private final static QName _ProcessRequestXRefID_QNAME = new QName("http://ws.paygate.tpb.com", "xRefID");
    private final static QName _GetClientIPResponseReturn_QNAME = new QName("http://ws.paygate.tpb.com", "return");
    private final static QName _LogMsg_QNAME = new QName("http://ws.paygate.tpb.com", "msg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tpb.paygate.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessRequest }
     * 
     */
    public ProcessRequest createProcessRequest() {
        return new ProcessRequest();
    }

    /**
     * Create an instance of {@link GetClientIPResponse }
     * 
     */
    public GetClientIPResponse createGetClientIPResponse() {
        return new GetClientIPResponse();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link ProcessRequestResponse }
     * 
     */
    public ProcessRequestResponse createProcessRequestResponse() {
        return new ProcessRequestResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.paygate.tpb.com", name = "code", scope = ProcessRequest.class)
    public JAXBElement<String> createProcessRequestCode(String value) {
        return new JAXBElement<String>(_ProcessRequestCode_QNAME, String.class, ProcessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.paygate.tpb.com", name = "password", scope = ProcessRequest.class)
    public JAXBElement<String> createProcessRequestPassword(String value) {
        return new JAXBElement<String>(_ProcessRequestPassword_QNAME, String.class, ProcessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.paygate.tpb.com", name = "user", scope = ProcessRequest.class)
    public JAXBElement<String> createProcessRequestUser(String value) {
        return new JAXBElement<String>(_ProcessRequestUser_QNAME, String.class, ProcessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.paygate.tpb.com", name = "message", scope = ProcessRequest.class)
    public JAXBElement<String> createProcessRequestMessage(String value) {
        return new JAXBElement<String>(_ProcessRequestMessage_QNAME, String.class, ProcessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.paygate.tpb.com", name = "xRefID", scope = ProcessRequest.class)
    public JAXBElement<String> createProcessRequestXRefID(String value) {
        return new JAXBElement<String>(_ProcessRequestXRefID_QNAME, String.class, ProcessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.paygate.tpb.com", name = "return", scope = GetClientIPResponse.class)
    public JAXBElement<String> createGetClientIPResponseReturn(String value) {
        return new JAXBElement<String>(_GetClientIPResponseReturn_QNAME, String.class, GetClientIPResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.paygate.tpb.com", name = "msg", scope = Log.class)
    public JAXBElement<String> createLogMsg(String value) {
        return new JAXBElement<String>(_LogMsg_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.paygate.tpb.com", name = "return", scope = ProcessRequestResponse.class)
    public JAXBElement<String> createProcessRequestResponseReturn(String value) {
        return new JAXBElement<String>(_GetClientIPResponseReturn_QNAME, String.class, ProcessRequestResponse.class, value);
    }

}
