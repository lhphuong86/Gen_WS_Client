package com.tpb.paygate.ws;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2016-04-14T16:44:23.587+07:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://ws.paygate.tpb.com", name = "EBGProcessorPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface EBGProcessorPortType {

    @WebMethod(action = "urn:log")
    @Action(input = "urn:log")
    @Oneway
    @RequestWrapper(localName = "log", targetNamespace = "http://ws.paygate.tpb.com", className = "com.tpb.paygate.ws.Log")
    public void log(
        @WebParam(name = "msg", targetNamespace = "http://ws.paygate.tpb.com")
        java.lang.String msg
    );

    @WebMethod(action = "urn:processRequest")
    @Action(input = "urn:processRequest", output = "urn:processRequestResponse")
    @RequestWrapper(localName = "processRequest", targetNamespace = "http://ws.paygate.tpb.com", className = "com.tpb.paygate.ws.ProcessRequest")
    @ResponseWrapper(localName = "processRequestResponse", targetNamespace = "http://ws.paygate.tpb.com", className = "com.tpb.paygate.ws.ProcessRequestResponse")
    @WebResult(name = "return", targetNamespace = "http://ws.paygate.tpb.com")
    public java.lang.String processRequest(
        @WebParam(name = "xRefID", targetNamespace = "http://ws.paygate.tpb.com")
        java.lang.String xRefID,
        @WebParam(name = "user", targetNamespace = "http://ws.paygate.tpb.com")
        java.lang.String user,
        @WebParam(name = "password", targetNamespace = "http://ws.paygate.tpb.com")
        java.lang.String password,
        @WebParam(name = "code", targetNamespace = "http://ws.paygate.tpb.com")
        java.lang.String code,
        @WebParam(name = "message", targetNamespace = "http://ws.paygate.tpb.com")
        java.lang.String message
    );

    @WebMethod(operationName = "GetClientIP", action = "urn:GetClientIP")
    @Action(input = "urn:GetClientIP", output = "urn:GetClientIPResponse")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetClientIPResponse", targetNamespace = "http://ws.paygate.tpb.com", partName = "parameters")
    public GetClientIPResponse getClientIP();
}