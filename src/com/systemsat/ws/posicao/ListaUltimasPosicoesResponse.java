
package com.systemsat.ws.posicao;

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
 *         &lt;element name="Lista_UltimasPosicoesResult" type="{http://systemsat.gslog.webservice/}ArrayOfPosicao" minOccurs="0"/>
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
    "listaUltimasPosicoesResult"
})
@XmlRootElement(name = "Lista_UltimasPosicoesResponse")
public class ListaUltimasPosicoesResponse {

    @XmlElement(name = "Lista_UltimasPosicoesResult")
    protected ArrayOfPosicao listaUltimasPosicoesResult;

    /**
     * Gets the value of the listaUltimasPosicoesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPosicao }
     *     
     */
    public ArrayOfPosicao getListaUltimasPosicoesResult() {
        return listaUltimasPosicoesResult;
    }

    /**
     * Sets the value of the listaUltimasPosicoesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPosicao }
     *     
     */
    public void setListaUltimasPosicoesResult(ArrayOfPosicao value) {
        this.listaUltimasPosicoesResult = value;
    }

}
