
package br.gov.saude.servicos.cnes.schema.profissionalsaude.v1r0.profissionalsaude;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.saude.servicos.cnes.schema.cadsus.v5r0.cns.CNSType;
import br.gov.saude.servicos.cnes.schema.cnes.v2r0.estabelecimentosaude.EstabelecimentoSaudeType;
import br.gov.saude.servicos.cnes.schema.corporativo.documento.v1r2.cpf.CPFType;
import br.gov.saude.servicos.cnes.schema.corporativo.endereco.v1r2.endereco.EnderecoType;
import br.gov.saude.servicos.cnes.schema.corporativo.pessoafisica.v1r2.nomecompleto.NomeCompletoType;
import br.gov.saude.servicos.cnes.schema.corporativo.v1r2.email.EmailType;
import br.gov.saude.servicos.cnes.schema.profissionalsaude.v1r0.cbo.CBOType;


/**
 * <p>Classe Java de ProfissionalSaudeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProfissionalSaudeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto}NomeCompletoType"/>
 *         &lt;element name="CNS" type="{http://servicos.saude.gov.br/schema/cadsus/v5r0/cns}CNSType"/>
 *         &lt;element name="CPF" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf}CPFType"/>
 *         &lt;element name="CBO" type="{http://servicos.saude.gov.br/schema/profissionalsaude/v1r0/cbo}CBOType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CNES" type="{http://servicos.saude.gov.br/schema/cnes/v2r0/estabelecimentosaude}EstabelecimentoSaudeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/email}EmailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Endereco" type="{http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco}EnderecoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfissionalSaudeType", propOrder = {
    "dataAtualizacao",
    "nome",
    "cns",
    "cpf",
    "cbo",
    "cnes",
    "email",
    "endereco"
})
public class ProfissionalSaudeType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAtualizacao;
    @XmlElement(name = "Nome", required = true)
    protected NomeCompletoType nome;
    @XmlElement(name = "CNS", required = true)
    protected CNSType cns;
    @XmlElement(name = "CPF", required = true)
    protected CPFType cpf;
    @XmlElement(name = "CBO")
    protected List<CBOType> cbo;
    @XmlElement(name = "CNES")
    protected List<EstabelecimentoSaudeType> cnes;
    @XmlElement(name = "Email")
    protected List<EmailType> email;
    @XmlElement(name = "Endereco")
    protected List<EnderecoType> endereco;

    /**
     * Obt�m o valor da propriedade dataAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Define o valor da propriedade dataAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtualizacao(XMLGregorianCalendar value) {
        this.dataAtualizacao = value;
    }

    /**
     * Obt�m o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link NomeCompletoType }
     *     
     */
    public NomeCompletoType getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeCompletoType }
     *     
     */
    public void setNome(NomeCompletoType value) {
        this.nome = value;
    }

    /**
     * Obt�m o valor da propriedade cns.
     * 
     * @return
     *     possible object is
     *     {@link CNSType }
     *     
     */
    public CNSType getCNS() {
        return cns;
    }

    /**
     * Define o valor da propriedade cns.
     * 
     * @param value
     *     allowed object is
     *     {@link CNSType }
     *     
     */
    public void setCNS(CNSType value) {
        this.cns = value;
    }

    /**
     * Obt�m o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link CPFType }
     *     
     */
    public CPFType getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link CPFType }
     *     
     */
    public void setCPF(CPFType value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the cbo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cbo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCBO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CBOType }
     * 
     * 
     */
    public List<CBOType> getCBO() {
        if (cbo == null) {
            cbo = new ArrayList<CBOType>();
        }
        return this.cbo;
    }

    /**
     * Gets the value of the cnes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cnes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCNES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstabelecimentoSaudeType }
     * 
     * 
     */
    public List<EstabelecimentoSaudeType> getCNES() {
        if (cnes == null) {
            cnes = new ArrayList<EstabelecimentoSaudeType>();
        }
        return this.cnes;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

    /**
     * Gets the value of the endereco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endereco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndereco().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnderecoType }
     * 
     * 
     */
    public List<EnderecoType> getEndereco() {
        if (endereco == null) {
            endereco = new ArrayList<EnderecoType>();
        }
        return this.endereco;
    }

}
