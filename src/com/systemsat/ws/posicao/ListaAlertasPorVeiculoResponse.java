
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
 *         &lt;element name="Lista_AlertasPorVeiculoResult" type="{http://systemsat.gslog.webservice/}ArrayOfPosicao" minOccurs="0"/>
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
    "listaAlertasPorVeiculoResult"
})
@XmlRootElement(name = "Lista_AlertasPorVeiculoResponse")
public class ListaAlertasPorVeiculoResponse {

    @XmlElement(name = "Lista_AlertasPorVeiculoResult")
    protected ArrayOfPosicao listaAlertasPorVeiculoResult;

    /**
     * Gets the value of the listaAlertasPorVeiculoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPosicao }
     *     
     */
    public ArrayOfPosicao getListaAlertasPorVeiculoResult() {
        return listaAlertasPorVeiculoResult;
    }

    /**
     * Sets the value of the listaAlertasPorVeiculoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPosicao }
     *     
     */
    public void setListaAlertasPorVeiculoResult(ArrayOfPosicao value) {
        this.listaAlertasPorVeiculoResult = value;
    }

}
