
package br.gov.saude.servicos.cnes.mensageria.v1r0.resultadopesquisacnesmunicipio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.saude.servicos.cnes.schema.cnes.v1r0.dadosbasicosestabelecimento.DadosBasicosEstabelecimentoType;


/**
 * <p>Classe Java de ResultadoPesquisaCnesMunicipioType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResultadoPesquisaCnesMunicipioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadosbasicosestabelecimento}DadosBasicosEstabelecimento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sumario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoPesquisaCnesMunicipioType", propOrder = {
    "dadosBasicosEstabelecimento",
    "sumario"
})
public class ResultadoPesquisaCnesMunicipioType {

    @XmlElement(name = "DadosBasicosEstabelecimento", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosbasicosestabelecimento")
    protected List<DadosBasicosEstabelecimentoType> dadosBasicosEstabelecimento;
    protected int sumario;

    /**
     * Dados B�sicos do Estabelecimento de Sa�de..Gets the value of the dadosBasicosEstabelecimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosBasicosEstabelecimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosBasicosEstabelecimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosBasicosEstabelecimentoType }
     * 
     * 
     */
    public List<DadosBasicosEstabelecimentoType> getDadosBasicosEstabelecimento() {
        if (dadosBasicosEstabelecimento == null) {
            dadosBasicosEstabelecimento = new ArrayList<DadosBasicosEstabelecimentoType>();
        }
        return this.dadosBasicosEstabelecimento;
    }

    /**
     * Obt�m o valor da propriedade sumario.
     * 
     */
    public int getSumario() {
        return sumario;
    }

    /**
     * Define o valor da propriedade sumario.
     * 
     */
    public void setSumario(int value) {
        this.sumario = value;
    }

}
