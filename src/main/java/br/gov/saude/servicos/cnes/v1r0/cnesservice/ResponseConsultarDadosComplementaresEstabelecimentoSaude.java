
package br.gov.saude.servicos.cnes.v1r0.cnesservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.saude.servicos.cnes.mensageria.v1r0.resultadopesquisadadoscomplementarescnes.ResultadoPesquisaDadosComplementaresCnesType;


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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisadadoscomplementarescnes}ResultadoPesquisaDadosComplementaresCnes" minOccurs="0"/>
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
    "resultadoPesquisaDadosComplementaresCnes"
})
@XmlRootElement(name = "responseConsultarDadosComplementaresEstabelecimentoSaude")
public class ResponseConsultarDadosComplementaresEstabelecimentoSaude {

    @XmlElement(name = "ResultadoPesquisaDadosComplementaresCnes", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadopesquisadadoscomplementarescnes")
    protected ResultadoPesquisaDadosComplementaresCnesType resultadoPesquisaDadosComplementaresCnes;

    /**
     * Obt�m o valor da propriedade resultadoPesquisaDadosComplementaresCnes.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoPesquisaDadosComplementaresCnesType }
     *     
     */
    public ResultadoPesquisaDadosComplementaresCnesType getResultadoPesquisaDadosComplementaresCnes() {
        return resultadoPesquisaDadosComplementaresCnes;
    }

    /**
     * Define o valor da propriedade resultadoPesquisaDadosComplementaresCnes.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoPesquisaDadosComplementaresCnesType }
     *     
     */
    public void setResultadoPesquisaDadosComplementaresCnes(ResultadoPesquisaDadosComplementaresCnesType value) {
        this.resultadoPesquisaDadosComplementaresCnes = value;
    }

}
