
package br.gov.saude.servicos.cnes.mensageria.v1r0.resultadoslocalizacaoestabelecimentosaude;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadoslocalizacaoestabelecimentosaude package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResultadosLocalizacaoEstabelecimentoSaude_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadoslocalizacaoestabelecimentosaude", "ResultadosLocalizacaoEstabelecimentoSaude");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.wsdl.mensageria.v1r0.resultadoslocalizacaoestabelecimentosaude
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultadosLocalizacaoEstabelecimentoSaudeType }
     * 
     */
    public ResultadosLocalizacaoEstabelecimentoSaudeType createResultadosLocalizacaoEstabelecimentoSaudeType() {
        return new ResultadosLocalizacaoEstabelecimentoSaudeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadosLocalizacaoEstabelecimentoSaudeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadoslocalizacaoestabelecimentosaude", name = "ResultadosLocalizacaoEstabelecimentoSaude")
    public JAXBElement<ResultadosLocalizacaoEstabelecimentoSaudeType> createResultadosLocalizacaoEstabelecimentoSaude(ResultadosLocalizacaoEstabelecimentoSaudeType value) {
        return new JAXBElement<ResultadosLocalizacaoEstabelecimentoSaudeType>(_ResultadosLocalizacaoEstabelecimentoSaude_QNAME, ResultadosLocalizacaoEstabelecimentoSaudeType.class, null, value);
    }

}
