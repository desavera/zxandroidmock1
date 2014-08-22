
package com.systemsat.ws.posicao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPosicao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPosicao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Posicao" type="{http://systemsat.gslog.webservice/}Posicao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPosicao", propOrder = {
    "posicao"
})
public class ArrayOfPosicao {

    @XmlElement(name = "Posicao", nillable = true)
    protected List<Posicao> posicao;

    /**
     * Gets the value of the posicao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posicao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosicao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Posicao }
     * 
     * 
     */
    public List<Posicao> getPosicao() {
        if (posicao == null) {
            posicao = new ArrayList<Posicao>();
        }
        return this.posicao;
    }

}
