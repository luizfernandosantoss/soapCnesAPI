
package br.gov.saude.servicos.cnes.schema.cnes.v1r0.cmpt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cmptType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cmptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmpt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="6"/>
 *               &lt;maxLength value="6"/>
 *               &lt;pattern value="[0-9]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmptType", propOrder = {
    "cmpt"
})
public class CmptType {

    @XmlElement(required = true)
    protected String cmpt;

    /**
     * Obt�m o valor da propriedade cmpt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpt() {
        return cmpt;
    }

    /**
     * Define o valor da propriedade cmpt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpt(String value) {
        this.cmpt = value;
    }

}
