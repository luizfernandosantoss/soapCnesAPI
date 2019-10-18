
package br.gov.saude.servicos.cnes.schema.corporativo.endereco.v1r1.tipologradouro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoLogradouroType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TipoLogradouroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTipoLogradouro">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *               &lt;pattern value="[0-9]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descricaoTipoLogradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoLogradouroType", propOrder = {
    "codigoTipoLogradouro",
    "descricaoTipoLogradouro"
})
public class TipoLogradouroType {

    @XmlElement(required = true)
    protected String codigoTipoLogradouro;
    protected String descricaoTipoLogradouro;

    /**
     * Obt�m o valor da propriedade codigoTipoLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoLogradouro() {
        return codigoTipoLogradouro;
    }

    /**
     * Define o valor da propriedade codigoTipoLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoLogradouro(String value) {
        this.codigoTipoLogradouro = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoTipoLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoTipoLogradouro() {
        return descricaoTipoLogradouro;
    }

    /**
     * Define o valor da propriedade descricaoTipoLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoTipoLogradouro(String value) {
        this.descricaoTipoLogradouro = value;
    }

}
