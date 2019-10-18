
package br.gov.saude.servicos.cnes.schema.cnes.v2r0.estabelecimentosaude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.cnes.schema.cnes.v1r0.identificacaoestabelecimentosaude.IdentificacaoEstabelecimentoSaudeType;


/**
 * <p>Classe Java de EstabelecimentoSaudeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EstabelecimentoSaudeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCNES">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/identificacaoestabelecimentosaude}IdentificacaoEstabelecimentoSaude" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstabelecimentoSaudeType", propOrder = {
    "codigoCNES",
    "identificacaoEstabelecimentoSaude"
})
public class EstabelecimentoSaudeType {

    @XmlElement(required = true)
    protected String codigoCNES;
    @XmlElement(name = "IdentificacaoEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/identificacaoestabelecimentosaude")
    protected IdentificacaoEstabelecimentoSaudeType identificacaoEstabelecimentoSaude;

    /**
     * Obt�m o valor da propriedade codigoCNES.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCNES() {
        return codigoCNES;
    }

    /**
     * Define o valor da propriedade codigoCNES.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCNES(String value) {
        this.codigoCNES = value;
    }

    /**
     * Identifica��o do Estabelecimento de Sa�de..
     * 
     * @return
     *     possible object is
     *     {@link IdentificacaoEstabelecimentoSaudeType }
     *     
     */
    public IdentificacaoEstabelecimentoSaudeType getIdentificacaoEstabelecimentoSaude() {
        return identificacaoEstabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade identificacaoEstabelecimentoSaude.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacaoEstabelecimentoSaudeType }
     *     
     */
    public void setIdentificacaoEstabelecimentoSaude(IdentificacaoEstabelecimentoSaudeType value) {
        this.identificacaoEstabelecimentoSaude = value;
    }

}
