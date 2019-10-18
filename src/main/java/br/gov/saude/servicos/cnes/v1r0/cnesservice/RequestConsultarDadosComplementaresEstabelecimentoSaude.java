
package br.gov.saude.servicos.cnes.v1r0.cnesservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.gov.saude.servicos.cnes.schema.cnes.v1r0.cmpt.CmptType;
import br.gov.saude.servicos.cnes.schema.corporativo.v1r2.municipio.MunicipioType;


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
 *         &lt;element name="MunicipioCNES" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio}MunicipioType"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/cmpt}cmpt"/>
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
    "municipioCNES",
    "cmpt"
})
@XmlRootElement(name = "requestConsultarDadosComplementaresEstabelecimentoSaude")
public class RequestConsultarDadosComplementaresEstabelecimentoSaude {

    @XmlElement(name = "MunicipioCNES", required = true)
    protected MunicipioType municipioCNES;
    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/cmpt", required = true)
    protected CmptType cmpt;

    /**
     * Obt�m o valor da propriedade municipioCNES.
     * 
     * @return
     *     possible object is
     *     {@link MunicipioType }
     *     
     */
    public MunicipioType getMunicipioCNES() {
        return municipioCNES;
    }

    /**
     * Define o valor da propriedade municipioCNES.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipioType }
     *     
     */
    public void setMunicipioCNES(MunicipioType value) {
        this.municipioCNES = value;
    }

    /**
     * Obt�m o valor da propriedade cmpt.
     * 
     * @return
     *     possible object is
     *     {@link CmptType }
     *     
     */
    public CmptType getCmpt() {
        return cmpt;
    }

    /**
     * Define o valor da propriedade cmpt.
     * 
     * @param value
     *     allowed object is
     *     {@link CmptType }
     *     
     */
    public void setCmpt(CmptType value) {
        this.cmpt = value;
    }

}
