
package com.systemsat.ws.cliente;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.systemsat.ws.cliente package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.systemsat.ws.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaClienteResponse }
     * 
     */
    public ListaClienteResponse createListaClienteResponse() {
        return new ListaClienteResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCliente }
     * 
     */
    public ArrayOfCliente createArrayOfCliente() {
        return new ArrayOfCliente();
    }

    /**
     * Create an instance of {@link ListaCliente }
     * 
     */
    public ListaCliente createListaCliente() {
        return new ListaCliente();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

}
