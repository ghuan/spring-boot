package com.bsoft.wsClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "CommonInterfaceSoap", targetNamespace = "http://tempuri.org/")
public interface CommonInterfaceSoap {

	/**
	 * 
	 * @param xml
	 * @return returns java.lang.String
	 */
	@WebMethod(action = "http://tempuri.org/funMain")
	@WebResult(name = "funMainResult", targetNamespace = "http://tempuri.org/")
	@RequestWrapper(localName = "funMain", targetNamespace = "http://tempuri.org/", className = "phis.source.ws.qysjwsClient.FunMain")
	@ResponseWrapper(localName = "funMainResponse", targetNamespace = "http://tempuri.org/", className = "phis.source.ws.qysjwsClient.FunMainResponse")
	public String funMain(
            @WebParam(name = "xml", targetNamespace = "http://tempuri.org/") String xml);

	/**
	 * 
	 * @param xml
	 * @param methodName
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "ExecuteMethod", action = "http://tempuri.org/ExecuteMethod")
	@WebResult(name = "ExecuteMethodResult", targetNamespace = "http://tempuri.org/")
	@RequestWrapper(localName = "ExecuteMethod", targetNamespace = "http://tempuri.org/", className = "phis.source.ws.qysjwsClient.ExecuteMethod")
	@ResponseWrapper(localName = "ExecuteMethodResponse", targetNamespace = "http://tempuri.org/", className = "phis.source.ws.qysjwsClient.ExecuteMethodResponse")
	public String executeMethod(
            @WebParam(name = "methodName", targetNamespace = "http://tempuri.org/") String methodName,
            @WebParam(name = "xml", targetNamespace = "http://tempuri.org/") String xml);

}
