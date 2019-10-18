
package br.gov.saude.servicos.cnes.schema.corporativo.endereco.v1r1.bairro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.saude.servicos.schema.corporativo.endereco.v1r1.bairro package. 
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

    private final static QName _Bairro_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/bairro", "Bairro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.saude.servicos.schema.corporativo.endereco.v1r1.bairro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BairroType }
     * 
     */
    public BairroType createBairroType() {
        return new BairroType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BairroType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/bairro", name = "Bairro")
    public JAXBElement<BairroType> createBairro(BairroType value) {
        return new JAXBElement<BairroType>(_Bairro_QNAME, BairroType.class, null, value);
    }

}
