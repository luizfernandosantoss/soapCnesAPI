
package br.gov.saude.servicos.cnes.schema.cnes.v1r0.complementoestabelecimentosaude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.cnes.schema.cnes.v1r0.tipogestao.TipoGestaoType;
import br.gov.saude.servicos.cnes.schema.cnes.v1r0.tipounidade.TipoUnidadeType;


/**
 * <p>Classe Java de ComplementoEstabelecimentoSaudeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ComplementoEstabelecimentoSaudeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/tipogestao}tipoGestao"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/tipounidade}tipoUnidade"/>
 *         &lt;element name="quantidadeEstabelecimentos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplementoEstabelecimentoSaudeType", propOrder = {
    "tipoGestao",
    "tipoUnidade",
    "quantidadeEstabelecimentos"
})
public class ComplementoEstabelecimentoSaudeType {

    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/tipogestao", required = true)
    protected TipoGestaoType tipoGestao;
    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/tipounidade", required = true)
    protected TipoUnidadeType tipoUnidade;
    protected int quantidadeEstabelecimentos;

    /**
     * Obt�m o valor da propriedade tipoGestao.
     * 
     * @return
     *     possible object is
     *     {@link TipoGestaoType }
     *     
     */
    public TipoGestaoType getTipoGestao() {
        return tipoGestao;
    }

    /**
     * Define o valor da propriedade tipoGestao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoGestaoType }
     *     
     */
    public void setTipoGestao(TipoGestaoType value) {
        this.tipoGestao = value;
    }

    /**
     * Obt�m o valor da propriedade tipoUnidade.
     * 
     * @return
     *     possible object is
     *     {@link TipoUnidadeType }
     *     
     */
    public TipoUnidadeType getTipoUnidade() {
        return tipoUnidade;
    }

    /**
     * Define o valor da propriedade tipoUnidade.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUnidadeType }
     *     
     */
    public void setTipoUnidade(TipoUnidadeType value) {
        this.tipoUnidade = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeEstabelecimentos.
     * 
     */
    public int getQuantidadeEstabelecimentos() {
        return quantidadeEstabelecimentos;
    }

    /**
     * Define o valor da propriedade quantidadeEstabelecimentos.
     * 
     */
    public void setQuantidadeEstabelecimentos(int value) {
        this.quantidadeEstabelecimentos = value;
    }

}
