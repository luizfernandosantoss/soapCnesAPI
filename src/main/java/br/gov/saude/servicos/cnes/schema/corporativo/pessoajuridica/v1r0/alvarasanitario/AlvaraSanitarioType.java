
package br.gov.saude.servicos.cnes.schema.corporativo.pessoajuridica.v1r0.alvarasanitario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de AlvaraSanitarioType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AlvaraSanitarioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroAlvara" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dataVigenciaInicial" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataVigenciaFinal" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlvaraSanitarioType", propOrder = {
    "numeroAlvara",
    "dataVigenciaInicial",
    "dataVigenciaFinal"
})
public class AlvaraSanitarioType {

    protected String numeroAlvara;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVigenciaInicial;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVigenciaFinal;

    /**
     * Obt�m o valor da propriedade numeroAlvara.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAlvara() {
        return numeroAlvara;
    }

    /**
     * Define o valor da propriedade numeroAlvara.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAlvara(String value) {
        this.numeroAlvara = value;
    }

    /**
     * Obt�m o valor da propriedade dataVigenciaInicial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVigenciaInicial() {
        return dataVigenciaInicial;
    }

    /**
     * Define o valor da propriedade dataVigenciaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVigenciaInicial(XMLGregorianCalendar value) {
        this.dataVigenciaInicial = value;
    }

    /**
     * Obt�m o valor da propriedade dataVigenciaFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVigenciaFinal() {
        return dataVigenciaFinal;
    }

    /**
     * Define o valor da propriedade dataVigenciaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVigenciaFinal(XMLGregorianCalendar value) {
        this.dataVigenciaFinal = value;
    }

}
