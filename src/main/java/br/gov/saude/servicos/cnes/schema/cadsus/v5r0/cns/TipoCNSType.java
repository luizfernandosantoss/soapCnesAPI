
package br.gov.saude.servicos.cnes.schema.cadsus.v5r0.cns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoCNSType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoCNSType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoCNSType")
@XmlEnum
public enum TipoCNSType {

    D,
    P;

    public String value() {
        return name();
    }

    public static TipoCNSType fromValue(String v) {
        return valueOf(v);
    }

}
