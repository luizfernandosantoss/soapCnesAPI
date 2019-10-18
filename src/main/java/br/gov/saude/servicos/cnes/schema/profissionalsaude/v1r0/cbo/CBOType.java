
package br.gov.saude.servicos.cnes.schema.profissionalsaude.v1r0.cbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CBOType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CBOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCBO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descricaoCBO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBOType", propOrder = {
    "codigoCBO",
    "descricaoCBO"
})
public class CBOType {

    @XmlElement(required = true)
    protected String codigoCBO;
    protected String descricaoCBO;

    /**
     * Obt�m o valor da propriedade codigoCBO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCBO() {
        return codigoCBO;
    }

    /**
     * Define o valor da propriedade codigoCBO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCBO(String value) {
        this.codigoCBO = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoCBO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoCBO() {
        return descricaoCBO;
    }

    /**
     * Define o valor da propriedade descricaoCBO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoCBO(String value) {
        this.descricaoCBO = value;
    }

}
