
package br.gov.saude.servicos.cnes.mensageria.v1r0.resultadopesquisadadoscomplementarescnes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SumarioDadosComplementaresType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SumarioDadosComplementaresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantidadeEstabelecimentosSaude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantidadeEsferasAdministrativas" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "SumarioDadosComplementaresType", propOrder = {
    "quantidadeEstabelecimentosSaude",
    "quantidadeEsferasAdministrativas",
    "quantidadeProfissionaisSaude"
})
public class SumarioDadosComplementaresType {

    protected int quantidadeEstabelecimentosSaude;
    protected int quantidadeEsferasAdministrativas;
    protected int quantidadeProfissionaisSaude;

    /**
     * Obt�m o valor da propriedade quantidadeEstabelecimentosSaude.
     * 
     */
    public int getQuantidadeEstabelecimentosSaude() {
        return quantidadeEstabelecimentosSaude;
    }

    /**
     * Define o valor da propriedade quantidadeEstabelecimentosSaude.
     * 
     */
    public void setQuantidadeEstabelecimentosSaude(int value) {
        this.quantidadeEstabelecimentosSaude = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeEsferasAdministrativas.
     * 
     */
    public int getQuantidadeEsferasAdministrativas() {
        return quantidadeEsferasAdministrativas;
    }

    /**
     * Define o valor da propriedade quantidadeEsferasAdministrativas.
     * 
     */
    public void setQuantidadeEsferasAdministrativas(int value) {
        this.quantidadeEsferasAdministrativas = value;
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
