
package br.gov.saude.servicos.cnes.schema.cnes.v1r0.servicoclassificacoes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.saude.servicos.cnes.schema.cnes.v1r0.servicoclassificacao.ServicoClassificacaoType;


/**
 * <p>Classe Java de ServicoClassificacoesType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServicoClassificacoesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="servicoclassificacao" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/servicoclassificacao}ServicoClassificacaoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicoClassificacoesType", propOrder = {
    "servicoclassificacao"
})
public class ServicoClassificacoesType {

    @XmlElement(required = true)
    protected List<ServicoClassificacaoType> servicoclassificacao;

    /**
     * Gets the value of the servicoclassificacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicoclassificacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicoclassificacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicoClassificacaoType }
     * 
     * 
     */
    public List<ServicoClassificacaoType> getServicoclassificacao() {
        if (servicoclassificacao == null) {
            servicoclassificacao = new ArrayList<ServicoClassificacaoType>();
        }
        return this.servicoclassificacao;
    }

}
