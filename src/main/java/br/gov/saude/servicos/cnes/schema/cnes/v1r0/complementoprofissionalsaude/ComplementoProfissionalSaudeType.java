
package br.gov.saude.servicos.cnes.schema.cnes.v1r0.complementoprofissionalsaude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.saude.servicos.cnes.schema.profissionalsaude.v1r0.vinculoempregaticio.VinculoEmpregaticioType;


/**
 * <p>Classe Java de ComplementoProfissionalSaudeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ComplementoProfissionalSaudeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoVinculacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/profissionalsaude/v1r0/vinculoempregaticio}vinculoempregaticio"/>
 *         &lt;element name="quantidadeProfissionaisSaude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplementoProfissionalSaudeType", propOrder = {
    "tipoVinculacao",
    "vinculoempregaticio",
    "quantidadeProfissionaisSaude"
})
public class ComplementoProfissionalSaudeType {

    @XmlElement(required = true)
    protected String tipoVinculacao;
    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/profissionalsaude/v1r0/vinculoempregaticio", required = true)
    protected VinculoEmpregaticioType vinculoempregaticio;
    protected int quantidadeProfissionaisSaude;

    /**
     * Obt�m o valor da propriedade tipoVinculacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVinculacao() {
        return tipoVinculacao;
    }

    /**
     * Define o valor da propriedade tipoVinculacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVinculacao(String value) {
        this.tipoVinculacao = value;
    }

    /**
     * V�nculo Empregat�cio.
     * 
     * @return
     *     possible object is
     *     {@link VinculoEmpregaticioType }
     *     
     */
    public VinculoEmpregaticioType getVinculoempregaticio() {
        return vinculoempregaticio;
    }

    /**
     * Define o valor da propriedade vinculoempregaticio.
     * 
     * @param value
     *     allowed object is
     *     {@link VinculoEmpregaticioType }
     *     
     */
    public void setVinculoempregaticio(VinculoEmpregaticioType value) {
        this.vinculoempregaticio = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeProfissionaisSaude.
     * 
     */
    public int getQuantidadeProfissionaisSaude() {
        return quantidadeProfissionaisSaude;
    }

    /**
     * Define o valor da propriedade quantidadeProfissionaisSaude.
     * 
     */
    public void setQuantidadeProfissionaisSaude(int value) {
        this.quantidadeProfissionaisSaude = value;
    }

}
