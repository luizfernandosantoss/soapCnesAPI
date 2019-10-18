
package br.gov.saude.servicos.cnes.schema.cnes.v1r0.dadosprincipaisestabelecimentosaude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.cnes.schema.cnes.v1r0.atividadeensino.AtividadeEnsinoType;
import br.gov.saude.servicos.cnes.schema.cnes.v1r0.tipoestabelecimentosaude.TipoEstabelecimentoSaudeType;


/**
 * <p>Classe Java de DadosPrincipaisType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosPrincipaisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/tipoestabelecimentosaude}TipoEstabelecimentoSaude"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/atividadeensino}AtividadeEnsino"/>
 *         &lt;element name="sitioInternet" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="150"/>
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
@XmlType(name = "DadosPrincipaisType", propOrder = {
    "tipoEstabelecimentoSaude",
    "atividadeEnsino",
    "sitioInternet"
})
public class DadosPrincipaisType {

    @XmlElement(name = "TipoEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/tipoestabelecimentosaude", required = true)
    protected TipoEstabelecimentoSaudeType tipoEstabelecimentoSaude;
    @XmlElement(name = "AtividadeEnsino", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/atividadeensino", required = true)
    protected AtividadeEnsinoType atividadeEnsino;
    protected String sitioInternet;

    /**
     * Tipo do Estabelecimento de Sa�de..
     * 
     * @return
     *     possible object is
     *     {@link TipoEstabelecimentoSaudeType }
     *     
     */
    public TipoEstabelecimentoSaudeType getTipoEstabelecimentoSaude() {
        return tipoEstabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade tipoEstabelecimentoSaude.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstabelecimentoSaudeType }
     *     
     */
    public void setTipoEstabelecimentoSaude(TipoEstabelecimentoSaudeType value) {
        this.tipoEstabelecimentoSaude = value;
    }

    /**
     * Atividade de Ensino..
     * 
     * @return
     *     possible object is
     *     {@link AtividadeEnsinoType }
     *     
     */
    public AtividadeEnsinoType getAtividadeEnsino() {
        return atividadeEnsino;
    }

    /**
     * Define o valor da propriedade atividadeEnsino.
     * 
     * @param value
     *     allowed object is
     *     {@link AtividadeEnsinoType }
     *     
     */
    public void setAtividadeEnsino(AtividadeEnsinoType value) {
        this.atividadeEnsino = value;
    }

    /**
     * Obt�m o valor da propriedade sitioInternet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitioInternet() {
        return sitioInternet;
    }

    /**
     * Define o valor da propriedade sitioInternet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitioInternet(String value) {
        this.sitioInternet = value;
    }

}
