
package com.systemsat.ws.cliente;

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
@WebServiceClient(name = "Clientes", targetNamespace = "http://systemsat.gslog.webservice/", wsdlLocation = "http://www.globalsearch.com.br/webservice/clientes.asmx?wsdl")
public class Clientes
    extends Service
{

    private final static URL CLIENTES_WSDL_LOCATION;
    private final static WebServiceException CLIENTES_EXCEPTION;
    private final static QName CLIENTES_QNAME = new QName("http://systemsat.gslog.webservice/", "Clientes");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.globalsearch.com.br/webservice/clientes.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLIENTES_WSDL_LOCATION = url;
        CLIENTES_EXCEPTION = e;
    }

    public Clientes() {
        super(__getWsdlLocation(), CLIENTES_QNAME);
    }

    public Clientes(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLIENTES_QNAME, features);
    }

    public Clientes(URL wsdlLocation) {
        super(wsdlLocation, CLIENTES_QNAME);
    }

    public Clientes(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLIENTES_QNAME, features);
    }

    public Clientes(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Clientes(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ClientesSoap
     */
    @WebEndpoint(name = "ClientesSoap")
    public ClientesSoap getClientesSoap() {
        return super.getPort(new QName("http://systemsat.gslog.webservice/", "ClientesSoap"), ClientesSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClientesSoap
     */
    @WebEndpoint(name = "ClientesSoap")
    public ClientesSoap getClientesSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://systemsat.gslog.webservice/", "ClientesSoap"), ClientesSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns ClientesSoap
     */
    @WebEndpoint(name = "ClientesSoap12")
    public ClientesSoap getClientesSoap12() {
        return super.getPort(new QName("http://systemsat.gslog.webservice/", "ClientesSoap12"), ClientesSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClientesSoap
     */
    @WebEndpoint(name = "ClientesSoap12")
    public ClientesSoap getClientesSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://systemsat.gslog.webservice/", "ClientesSoap12"), ClientesSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLIENTES_EXCEPTION!= null) {
            throw CLIENTES_EXCEPTION;
        }
        return CLIENTES_WSDL_LOCATION;
    }

}
