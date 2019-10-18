
package br.gov.saude.servicos.cnes.schema.cnes.v1r0.equipamento;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.saude.servicos.cnes.schema.cnes.v1r0.tipoequipamento.TipoEquipamentoType;


/**
 * <p>Classe Java de EquipamentoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipamentoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/tipoequipamento}tipoEquipamento"/>
 *         &lt;element name="destinacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantidadeEquipamento" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="quantidadeUso" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TpSUS" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/equipamento}indicadorSUSType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipamentoType", propOrder = {
    "codigo",
    "descricao",
    "tipoEquipamento",
    "destinacao",
    "quantidadeEquipamento",
    "quantidadeUso",
    "tpSUS"
})
public class EquipamentoType {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String descricao;
    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/tipoequipamento", required = true)
    protected TipoEquipamentoType tipoEquipamento;
    protected String destinacao;
    protected BigInteger quantidadeEquipamento;
    protected BigInteger quantidadeUso;
    @XmlElement(name = "TpSUS")
    protected IndicadorSUSType tpSUS;

    /**
     * Obt�m o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obt�m o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Tipo de Equipamento do Estabelecimento de Sa�de..
     * 
     * @return
     *     possible object is
     *     {@link TipoEquipamentoType }
     *     
     */
    public TipoEquipamentoType getTipoEquipamento() {
        return tipoEquipamento;
    }

    /**
     * Define o valor da propriedade tipoEquipamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEquipamentoType }
     *     
     */
    public void setTipoEquipamento(TipoEquipamentoType value) {
        this.tipoEquipamento = value;
    }

    /**
     * Obt�m o valor da propriedade destinacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinacao() {
        return destinacao;
    }

    /**
     * Define o valor da propriedade destinacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinacao(String value) {
        this.destinacao = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeEquipamento.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidadeEquipamento() {
        return quantidadeEquipamento;
    }

    /**
     * Define o valor da propriedade quantidadeEquipamento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidadeEquipamento(BigInteger value) {
        this.quantidadeEquipamento = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeUso.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidadeUso() {
        return quantidadeUso;
    }

    /**
     * Define o valor da propriedade quantidadeUso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidadeUso(BigInteger value) {
        this.quantidadeUso = value;
    }

    /**
     * Obt�m o valor da propriedade tpSUS.
     * 
     * @return
     *     possible object is
     *     {@link IndicadorSUSType }
     *     
     */
    public IndicadorSUSType getTpSUS() {
        return tpSUS;
    }

    /**
     * Define o valor da propriedade tpSUS.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicadorSUSType }
     *     
     */
    public void setTpSUS(IndicadorSUSType value) {
        this.tpSUS = value;
    }

}
