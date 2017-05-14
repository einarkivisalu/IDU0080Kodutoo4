
package ttu.idu0080.myclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ttu.idu0080.myclient2.Offerresponse;


/**
 * <p>Java class for getCourierOfferResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCourierOfferResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offer" type="{http://transport.idu0080.ttu/}offerresponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCourierOfferResponse", propOrder = {
    "offer"
})
public class GetCourierOfferResponse {

    @XmlElement(required = true)
    protected Offerresponse offer;

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link Offerresponse }
     *     
     */
    public Offerresponse getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offerresponse }
     *     
     */
    public void setOffer(Offerresponse value) {
        this.offer = value;
    }

}
