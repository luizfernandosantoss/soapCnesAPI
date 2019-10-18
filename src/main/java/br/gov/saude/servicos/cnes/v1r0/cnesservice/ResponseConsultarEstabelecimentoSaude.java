
package br.gov.saude.servicos.cnes.v1r0.cnesservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.saude.servicos.cnes.mensageria.v1r0.resultadopesquisaestabelecimentosaude.ResultadoPesquisaEstabelecimentoSaudeType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisaestabelecimentosaude}ResultadoPesquisaEstabelecimentoSaude" minOccurs="0"/>
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
    "resultadoPesquisaEstabelecimentoSaude"
})
@XmlRootElement(name = "responseConsultarEstabelecimentoSaude")
public class ResponseConsultarEstabelecimentoSaude {

    @XmlElement(name = "ResultadoPesquisaEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisaestabelecimentosaude")
    protected ResultadoPesquisaEstabelecimentoSaudeType resultadoPesquisaEstabelecimentoSaude;

    /**
     * Obt�m o valor da propriedade resultadoPesquisaEstabelecimentoSaude.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoPesquisaEstabelecimentoSaudeType }
     *     
     */
    public ResultadoPesquisaEstabelecimentoSaudeType getResultadoPesquisaEstabelecimentoSaude() {
        return resultadoPesquisaEstabelecimentoSaude;
    }

    /**
     * Define o valor da propriedade resultadoPesquisaEstabelecimentoSaude.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoPesquisaEstabelecimentoSaudeType }
     *     
     */
    public void setResultadoPesquisaEstabelecimentoSaude(ResultadoPesquisaEstabelecimentoSaudeType value) {
        this.resultadoPesquisaEstabelecimentoSaude = value;
    }

}
