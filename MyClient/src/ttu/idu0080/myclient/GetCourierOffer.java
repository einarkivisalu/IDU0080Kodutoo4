
package ttu.idu0080.myclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCourierOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCourierOffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCourierOffer", propOrder = {
    "orderid"
})
public class GetCourierOffer {

    protected int orderid;

    /**
     * Gets the value of the orderid property.
     * 
     */
    public int getOrderid() {
        return orderid;
    }

    /**
     * Sets the value of the orderid property.
     * 
     */
    public void setOrderid(int value) {
        this.orderid = value;
    }

}
