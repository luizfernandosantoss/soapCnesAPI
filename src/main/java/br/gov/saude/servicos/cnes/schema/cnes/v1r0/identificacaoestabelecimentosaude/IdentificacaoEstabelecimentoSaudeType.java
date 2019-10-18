
package br.gov.saude.servicos.cnes.schema.cnes.v1r0.identificacaoestabelecimentosaude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.saude.servicos.cnes.schema.cnes.v1r0.dadoscomplementaresestabelecimentosaude.DadosComplementaresType;
import br.gov.saude.servicos.cnes.schema.corporativo.endereco.v1r2.endereco.EnderecoType;
import br.gov.saude.servicos.cnes.schema.cnes.v1r0.dadosprincipaisestabelecimentosaude.DadosPrincipaisType;


/**
 * <p>Classe Java de IdentificacaoEstabelecimentoSaudeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IdentificacaoEstabelecimentoSaudeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadosprincipaisestabelecimentosaude}DadosPrincipais" minOccurs="0"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadoscomplementaresestabelecimentosaude}DadosComplementares" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco}EnderecoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificacaoEstabelecimentoSaudeType", propOrder = {
    "dadosPrincipais",
    "dadosComplementares",
    "endereco"
})
public class IdentificacaoEstabelecimentoSaudeType {

    @XmlElement(name = "DadosPrincipais", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosprincipaisestabelecimentosaude")
    protected DadosPrincipaisType dadosPrincipais;
    @XmlElement(name = "DadosComplementares", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadoscomplementaresestabelecimentosaude")
    protected DadosComplementaresType dadosComplementares;
    @XmlElement(required = true)
    protected EnderecoType endereco;

    /**
     * Dados Principais do Estabelecimento de Sa�de.
     * 
     * @return
     *     possible object is
     *     {@link DadosPrincipaisType }
     *     
     */
    public DadosPrincipaisType getDadosPrincipais() {
        return dadosPrincipais;
    }

    /**
     * Define o valor da propriedade dadosPrincipais.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosPrincipaisType }
     *     
     */
    public void setDadosPrincipais(DadosPrincipaisType value) {
        this.dadosPrincipais = value;
    }

    /**
     * Dados Complementares do Estabelecimento de Sa�de.
     * 
     * @return
     *     possible object is
     *     {@link DadosComplementaresType }
     *     
     */
    public DadosComplementaresType getDadosComplementares() {
        return dadosComplementares;
    }

    /**
     * Define o valor da propriedade dadosComplementares.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosComplementaresType }
     *     
     */
    public void setDadosComplementares(DadosComplementaresType value) {
        this.dadosComplementares = value;
    }

    /**
     * Obt�m o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoType }
     *     
     */
    public EnderecoType getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoType }
     *     
     */
    public void setEndereco(EnderecoType value) {
        this.endereco = value;
    }

}
