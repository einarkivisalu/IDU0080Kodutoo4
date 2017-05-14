
package ttu.idu0080.transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setOrderTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setOrderTransport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOrderTransport", propOrder = {
    "offerid"
})
public class SetOrderTransport {

    @XmlElement(required = true)
    protected String offerid;

    /**
     * Gets the value of the offerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferid() {
        return offerid;
    }

    /**
     * Sets the value of the offerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferid(String value) {
        this.offerid = value;
    }

}
