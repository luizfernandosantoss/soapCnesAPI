
package br.gov.saude.servicos.cnes.v1r0.cnesservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.saude.servicos.cnes.schema.cnes.v1r0.codigocnes.CodigoCNESType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes}CodigoCNES"/>
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
    "codigoCNES"
})
@XmlRootElement(name = "requestConsultarEstabelecimentoSaude")
public class RequestConsultarEstabelecimentoSaude {

    @XmlElement(name = "CodigoCNES", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes", required = true)
    protected CodigoCNESType codigoCNES;

    /**
     * Obt�m o valor da propriedade codigoCNES.
     * 
     * @return
     *     possible object is
     *     {@link CodigoCNESType }
     *     
     */
    public CodigoCNESType getCodigoCNES() {
        return codigoCNES;
    }

    /**
     * Define o valor da propriedade codigoCNES.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoCNESType }
     *     
     */
    public void setCodigoCNES(CodigoCNESType value) {
        this.codigoCNES = value;
    }

}
