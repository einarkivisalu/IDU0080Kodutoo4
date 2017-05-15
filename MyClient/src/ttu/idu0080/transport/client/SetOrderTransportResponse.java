
package ttu.idu0080.transport.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setOrderTransportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setOrderTransportResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transportid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOrderTransportResponse", propOrder = {
    "transportid"
})
public class SetOrderTransportResponse {

    @XmlElement(required = true)
    protected String transportid;

    /**
     * Gets the value of the transportid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportid() {
        return transportid;
    }

    /**
     * Sets the value of the transportid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportid(String value) {
        this.transportid = value;
    }

}
