
package com.nms.ws.charging;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ChargingWebserviceImplService", targetNamespace = "http://chargingwebservice.nms.com/", wsdlLocation = "http://localhost:8080/EntertainmentWS/ChargingWebserviceImpl?wsdl")
public class ChargingWebserviceImplService
    extends Service
{

    private final static URL CHARGINGWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CHARGINGWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CHARGINGWEBSERVICEIMPLSERVICE_QNAME = new QName("http://chargingwebservice.nms.com/", "ChargingWebserviceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/EntertainmentWS/ChargingWebserviceImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CHARGINGWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CHARGINGWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ChargingWebserviceImplService() {
        super(__getWsdlLocation(), CHARGINGWEBSERVICEIMPLSERVICE_QNAME);
    }

    public ChargingWebserviceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CHARGINGWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public ChargingWebserviceImplService(URL wsdlLocation) {
        super(wsdlLocation, CHARGINGWEBSERVICEIMPLSERVICE_QNAME);
    }

    public ChargingWebserviceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CHARGINGWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public ChargingWebserviceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChargingWebserviceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ChargingWebserviceImpl
     */
    @WebEndpoint(name = "ChargingWebserviceImplPort")
    public ChargingWebserviceImpl getChargingWebserviceImplPort() {
        return super.getPort(new QName("http://chargingwebservice.nms.com/", "ChargingWebserviceImplPort"), ChargingWebserviceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChargingWebserviceImpl
     */
    @WebEndpoint(name = "ChargingWebserviceImplPort")
    public ChargingWebserviceImpl getChargingWebserviceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://chargingwebservice.nms.com/", "ChargingWebserviceImplPort"), ChargingWebserviceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CHARGINGWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CHARGINGWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CHARGINGWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
