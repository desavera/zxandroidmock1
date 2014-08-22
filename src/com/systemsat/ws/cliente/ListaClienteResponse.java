
package com.systemsat.ws.cliente;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lista_ClienteResult" type="{http://systemsat.gslog.webservice/}ArrayOfCliente" minOccurs="0"/>
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
    "listaClienteResult"
})
@XmlRootElement(name = "Lista_ClienteResponse")
public class ListaClienteResponse {

    @XmlElement(name = "Lista_ClienteResult")
    protected ArrayOfCliente listaClienteResult;

    /**
     * Gets the value of the listaClienteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCliente }
     *     
     */
    public ArrayOfCliente getListaClienteResult() {
        return listaClienteResult;
    }

    /**
     * Sets the value of the listaClienteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCliente }
     *     
     */
    public void setListaClienteResult(ArrayOfCliente value) {
        this.listaClienteResult = value;
    }

}
