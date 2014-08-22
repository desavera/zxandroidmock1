
package com.systemsat.ws.posicao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Posicao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Posicao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Posicao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdentificacaoMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Anotacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAlerta" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DescricaoVeiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentificacaoVeiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescricaoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Direcao" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Velocidade" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RPM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Odometro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Ignicao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Temperatura" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NivelBateria" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="UnidadeBateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NivelSinal" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="NumeroSatelite" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="StatusEntradas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusSaidas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataGPS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DataServidor" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Localizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Horimetro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Posicao", propOrder = {
    "idPosicao",
    "identificacaoMotorista",
    "nomeMotorista",
    "observacao",
    "anotacao",
    "isAlerta",
    "descricaoVeiculo",
    "identificacaoVeiculo",
    "placa",
    "nomeCliente",
    "descricaoEvento",
    "numeroSerie",
    "latitude",
    "longitude",
    "direcao",
    "velocidade",
    "rpm",
    "odometro",
    "ignicao",
    "temperatura",
    "altitude",
    "nivelBateria",
    "unidadeBateria",
    "nivelSinal",
    "numeroSatelite",
    "statusEntradas",
    "statusSaidas",
    "dataGPS",
    "dataServidor",
    "localizacao",
    "horimetro"
})
public class Posicao {

    @XmlElement(name = "Id_Posicao")
    protected int idPosicao;
    @XmlElement(name = "IdentificacaoMotorista")
    protected String identificacaoMotorista;
    @XmlElement(name = "NomeMotorista")
    protected String nomeMotorista;
    @XmlElement(name = "Observacao")
    protected String observacao;
    @XmlElement(name = "Anotacao")
    protected String anotacao;
    protected boolean isAlerta;
    @XmlElement(name = "DescricaoVeiculo")
    protected String descricaoVeiculo;
    @XmlElement(name = "IdentificacaoVeiculo")
    protected String identificacaoVeiculo;
    @XmlElement(name = "Placa")
    protected String placa;
    @XmlElement(name = "NomeCliente")
    protected String nomeCliente;
    @XmlElement(name = "DescricaoEvento")
    protected String descricaoEvento;
    @XmlElement(name = "NumeroSerie")
    protected String numeroSerie;
    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "Direcao")
    protected double direcao;
    @XmlElement(name = "Velocidade")
    protected double velocidade;
    @XmlElement(name = "RPM")
    protected double rpm;
    @XmlElement(name = "Odometro")
    protected double odometro;
    @XmlElement(name = "Ignicao")
    protected boolean ignicao;
    @XmlElement(name = "Temperatura", required = true, type = Double.class, nillable = true)
    protected Double temperatura;
    @XmlElement(name = "Altitude")
    protected double altitude;
    @XmlElement(name = "NivelBateria", required = true, type = Short.class, nillable = true)
    @XmlSchemaType(name = "unsignedByte")
    protected Short nivelBateria;
    @XmlElement(name = "UnidadeBateria")
    protected String unidadeBateria;
    @XmlElement(name = "NivelSinal")
    @XmlSchemaType(name = "unsignedByte")
    protected short nivelSinal;
    @XmlElement(name = "NumeroSatelite")
    @XmlSchemaType(name = "unsignedByte")
    protected short numeroSatelite;
    @XmlElement(name = "StatusEntradas")
    protected String statusEntradas;
    @XmlElement(name = "StatusSaidas")
    protected String statusSaidas;
    @XmlElement(name = "DataGPS", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataGPS;
    @XmlElement(name = "DataServidor", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataServidor;
    @XmlElement(name = "Localizacao")
    protected String localizacao;
    @XmlElement(name = "Horimetro")
    protected int horimetro;

    /**
     * Gets the value of the idPosicao property.
     * 
     */
    public int getIdPosicao() {
        return idPosicao;
    }

    /**
     * Sets the value of the idPosicao property.
     * 
     */
    public void setIdPosicao(int value) {
        this.idPosicao = value;
    }

    /**
     * Gets the value of the identificacaoMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoMotorista() {
        return identificacaoMotorista;
    }

    /**
     * Sets the value of the identificacaoMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoMotorista(String value) {
        this.identificacaoMotorista = value;
    }

    /**
     * Gets the value of the nomeMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMotorista() {
        return nomeMotorista;
    }

    /**
     * Sets the value of the nomeMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMotorista(String value) {
        this.nomeMotorista = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Gets the value of the anotacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotacao() {
        return anotacao;
    }

    /**
     * Sets the value of the anotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotacao(String value) {
        this.anotacao = value;
    }

    /**
     * Gets the value of the isAlerta property.
     * 
     */
    public boolean isIsAlerta() {
        return isAlerta;
    }

    /**
     * Sets the value of the isAlerta property.
     * 
     */
    public void setIsAlerta(boolean value) {
        this.isAlerta = value;
    }

    /**
     * Gets the value of the descricaoVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoVeiculo() {
        return descricaoVeiculo;
    }

    /**
     * Sets the value of the descricaoVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoVeiculo(String value) {
        this.descricaoVeiculo = value;
    }

    /**
     * Gets the value of the identificacaoVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoVeiculo() {
        return identificacaoVeiculo;
    }

    /**
     * Sets the value of the identificacaoVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoVeiculo(String value) {
        this.identificacaoVeiculo = value;
    }

    /**
     * Gets the value of the placa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Sets the value of the placa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Gets the value of the nomeCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Sets the value of the nomeCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCliente(String value) {
        this.nomeCliente = value;
    }

    /**
     * Gets the value of the descricaoEvento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    /**
     * Sets the value of the descricaoEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoEvento(String value) {
        this.descricaoEvento = value;
    }

    /**
     * Gets the value of the numeroSerie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Sets the value of the numeroSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSerie(String value) {
        this.numeroSerie = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the direcao property.
     * 
     */
    public double getDirecao() {
        return direcao;
    }

    /**
     * Sets the value of the direcao property.
     * 
     */
    public void setDirecao(double value) {
        this.direcao = value;
    }

    /**
     * Gets the value of the velocidade property.
     * 
     */
    public double getVelocidade() {
        return velocidade;
    }

    /**
     * Sets the value of the velocidade property.
     * 
     */
    public void setVelocidade(double value) {
        this.velocidade = value;
    }

    /**
     * Gets the value of the rpm property.
     * 
     */
    public double getRPM() {
        return rpm;
    }

    /**
     * Sets the value of the rpm property.
     * 
     */
    public void setRPM(double value) {
        this.rpm = value;
    }

    /**
     * Gets the value of the odometro property.
     * 
     */
    public double getOdometro() {
        return odometro;
    }

    /**
     * Sets the value of the odometro property.
     * 
     */
    public void setOdometro(double value) {
        this.odometro = value;
    }

    /**
     * Gets the value of the ignicao property.
     * 
     */
    public boolean isIgnicao() {
        return ignicao;
    }

    /**
     * Sets the value of the ignicao property.
     * 
     */
    public void setIgnicao(boolean value) {
        this.ignicao = value;
    }

    /**
     * Gets the value of the temperatura property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTemperatura() {
        return temperatura;
    }

    /**
     * Sets the value of the temperatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTemperatura(Double value) {
        this.temperatura = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     */
    public void setAltitude(double value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the nivelBateria property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNivelBateria() {
        return nivelBateria;
    }

    /**
     * Sets the value of the nivelBateria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNivelBateria(Short value) {
        this.nivelBateria = value;
    }

    /**
     * Gets the value of the unidadeBateria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeBateria() {
        return unidadeBateria;
    }

    /**
     * Sets the value of the unidadeBateria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeBateria(String value) {
        this.unidadeBateria = value;
    }

    /**
     * Gets the value of the nivelSinal property.
     * 
     */
    public short getNivelSinal() {
        return nivelSinal;
    }

    /**
     * Sets the value of the nivelSinal property.
     * 
     */
    public void setNivelSinal(short value) {
        this.nivelSinal = value;
    }

    /**
     * Gets the value of the numeroSatelite property.
     * 
     */
    public short getNumeroSatelite() {
        return numeroSatelite;
    }

    /**
     * Sets the value of the numeroSatelite property.
     * 
     */
    public void setNumeroSatelite(short value) {
        this.numeroSatelite = value;
    }

    /**
     * Gets the value of the statusEntradas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusEntradas() {
        return statusEntradas;
    }

    /**
     * Sets the value of the statusEntradas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusEntradas(String value) {
        this.statusEntradas = value;
    }

    /**
     * Gets the value of the statusSaidas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSaidas() {
        return statusSaidas;
    }

    /**
     * Sets the value of the statusSaidas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSaidas(String value) {
        this.statusSaidas = value;
    }

    /**
     * Gets the value of the dataGPS property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataGPS() {
        return dataGPS;
    }

    /**
     * Sets the value of the dataGPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataGPS(XMLGregorianCalendar value) {
        this.dataGPS = value;
    }

    /**
     * Gets the value of the dataServidor property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataServidor() {
        return dataServidor;
    }

    /**
     * Sets the value of the dataServidor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataServidor(XMLGregorianCalendar value) {
        this.dataServidor = value;
    }

    /**
     * Gets the value of the localizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * Sets the value of the localizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizacao(String value) {
        this.localizacao = value;
    }

    /**
     * Gets the value of the horimetro property.
     * 
     */
    public int getHorimetro() {
        return horimetro;
    }

    /**
     * Sets the value of the horimetro property.
     * 
     */
    public void setHorimetro(int value) {
        this.horimetro = value;
    }

}
