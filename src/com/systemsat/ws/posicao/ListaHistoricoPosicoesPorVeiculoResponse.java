
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
 *         &lt;element name="Lista_HistoricoPosicoesPorVeiculoResult" type="{http://systemsat.gslog.webservice/}ArrayOfPosicao" minOccurs="0"/>
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
    "listaHistoricoPosicoesPorVeiculoResult"
})
@XmlRootElement(name = "Lista_HistoricoPosicoesPorVeiculoResponse")
public class ListaHistoricoPosicoesPorVeiculoResponse {

    @XmlElement(name = "Lista_HistoricoPosicoesPorVeiculoResult")
    protected ArrayOfPosicao listaHistoricoPosicoesPorVeiculoResult;

    /**
     * Gets the value of the listaHistoricoPosicoesPorVeiculoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPosicao }
     *     
     */
    public ArrayOfPosicao getListaHistoricoPosicoesPorVeiculoResult() {
        return listaHistoricoPosicoesPorVeiculoResult;
    }

    /**
     * Sets the value of the listaHistoricoPosicoesPorVeiculoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPosicao }
     *     
     */
    public void setListaHistoricoPosicoesPorVeiculoResult(ArrayOfPosicao value) {
        this.listaHistoricoPosicoesPorVeiculoResult = value;
    }

}
