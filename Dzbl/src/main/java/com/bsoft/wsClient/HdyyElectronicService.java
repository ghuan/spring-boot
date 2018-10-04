package com.bsoft.wsClient;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * HdyyElectronicService service = new HdyyElectronicService();
 * HdyyElectronicServicePortType portType = service.getHdyyElectronicServiceHttpSoap11Endpoint();
 * portType.doRequestWithXML(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "HdyyElectronicService", targetNamespace = "http://service.eastpharm.com.cn", wsdlLocation = "http://192.46.119.198:8080/axis2/services/HdyyElectronicService?wsdl")
public class HdyyElectronicService extends Service {

	private final static URL HDYYELECTRONICSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(HdyyElectronicService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = HdyyElectronicService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://192.46.119.198:8080/axis2/services/HdyyElectronicService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://192.46.119.198:8080/axis2/services/HdyyElectronicService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		HDYYELECTRONICSERVICE_WSDL_LOCATION = url;
	}

	public HdyyElectronicService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public HdyyElectronicService() {
		super(HDYYELECTRONICSERVICE_WSDL_LOCATION, new QName(
				"http://service.eastpharm.com.cn", "HdyyElectronicService"));
	}

	/**
	 * 
	 * @return returns HdyyElectronicServicePortType
	 */
	@WebEndpoint(name = "HdyyElectronicServiceHttpSoap11Endpoint")
	public HdyyElectronicServicePortType getHdyyElectronicServiceHttpSoap11Endpoint() {
		return super.getPort(new QName("http://service.eastpharm.com.cn",
				"HdyyElectronicServiceHttpSoap11Endpoint"),
				HdyyElectronicServicePortType.class);
	}

	/**
	 * 
	 * @return returns HdyyElectronicServicePortType
	 */
	@WebEndpoint(name = "HdyyElectronicServiceHttpSoap12Endpoint")
	public HdyyElectronicServicePortType getHdyyElectronicServiceHttpSoap12Endpoint() {
		return super.getPort(new QName("http://service.eastpharm.com.cn",
				"HdyyElectronicServiceHttpSoap12Endpoint"),
				HdyyElectronicServicePortType.class);
	}

	/**
	 * 
	 * @return returns HdyyElectronicServicePortType
	 */
	@WebEndpoint(name = "HdyyElectronicServiceHttpEndpoint")
	public HdyyElectronicServicePortType getHdyyElectronicServiceHttpEndpoint() {
		return super.getPort(new QName("http://service.eastpharm.com.cn",
				"HdyyElectronicServiceHttpEndpoint"),
				HdyyElectronicServicePortType.class);
	}

}