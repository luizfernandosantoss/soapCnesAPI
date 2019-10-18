
package br.gov.saude.servicos.cnes.mensageria.v1r0.resultadopesquisaestabelecimentosaude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SumarioEstabelecimentoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SumarioEstabelecimentoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantidadeProfissionaisSaude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantidadeCBOS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantidadeLeitos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantidadeHabilitacoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantidadeEquipamentos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantidadeSamus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumarioEstabelecimentoType", propOrder = {
    "quantidadeProfissionaisSaude",
    "quantidadeCBOS",
    "quantidadeLeitos",
    "quantidadeHabilitacoes",
    "quantidadeEquipamentos",
    "quantidadeSamus"
})
public class SumarioEstabelecimentoType {

    protected int quantidadeProfissionaisSaude;
    protected int quantidadeCBOS;
    protected int quantidadeLeitos;
    protected int quantidadeHabilitacoes;
    protected int quantidadeEquipamentos;
    protected int quantidadeSamus;

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

    /**
     * Obt�m o valor da propriedade quantidadeCBOS.
     * 
     */
    public int getQuantidadeCBOS() {
        return quantidadeCBOS;
    }

    /**
     * Define o valor da propriedade quantidadeCBOS.
     * 
     */
    public void setQuantidadeCBOS(int value) {
        this.quantidadeCBOS = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeLeitos.
     * 
     */
    public int getQuantidadeLeitos() {
        return quantidadeLeitos;
    }

    /**
     * Define o valor da propriedade quantidadeLeitos.
     * 
     */
    public void setQuantidadeLeitos(int value) {
        this.quantidadeLeitos = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeHabilitacoes.
     * 
     */
    public int getQuantidadeHabilitacoes() {
        return quantidadeHabilitacoes;
    }

    /**
     * Define o valor da propriedade quantidadeHabilitacoes.
     * 
     */
    public void setQuantidadeHabilitacoes(int value) {
        this.quantidadeHabilitacoes = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeEquipamentos.
     * 
     */
    public int getQuantidadeEquipamentos() {
        return quantidadeEquipamentos;
    }

    /**
     * Define o valor da propriedade quantidadeEquipamentos.
     * 
     */
    public void setQuantidadeEquipamentos(int value) {
        this.quantidadeEquipamentos = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeSamus.
     * 
     */
    public int getQuantidadeSamus() {
        return quantidadeSamus;
    }

    /**
     * Define o valor da propriedade quantidadeSamus.
     * 
     */
    public void setQuantidadeSamus(int value) {
        this.quantidadeSamus = value;
    }

}
