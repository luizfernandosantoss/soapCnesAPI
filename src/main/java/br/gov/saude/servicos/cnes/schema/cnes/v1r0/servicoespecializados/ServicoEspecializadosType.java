
package br.gov.saude.servicos.cnes.schema.cnes.v1r0.servicoespecializados;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.saude.servicos.cnes.schema.cnes.v1r0.servicoespecializado.ServicoEspecializadoType;


/**
 * <p>Classe Java de ServicoEspecializadosType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServicoEspecializadosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="servicoespecializado" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/servicoespecializado}ServicoEspecializadoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicoEspecializadosType", propOrder = {
    "servicoespecializado"
})
public class ServicoEspecializadosType {

    @XmlElement(required = true)
    protected List<ServicoEspecializadoType> servicoespecializado;

    /**
     * Gets the value of the servicoespecializado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicoespecializado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicoespecializado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicoEspecializadoType }
     * 
     * 
     */
    public List<ServicoEspecializadoType> getServicoespecializado() {
        if (servicoespecializado == null) {
            servicoespecializado = new ArrayList<ServicoEspecializadoType>();
        }
        return this.servicoespecializado;
    }

}
