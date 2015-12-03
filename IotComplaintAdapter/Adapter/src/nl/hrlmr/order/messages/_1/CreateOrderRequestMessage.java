
package nl.hrlmr.order.messages._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import nl.hrlmr.order._1.Order;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}Order"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "order" })
@XmlRootElement(name = "CreateOrder_RequestMessage")
public class CreateOrderRequestMessage {

    @XmlElement(name = "Order", namespace = "http://hrlmr.nl/order/1.0", required = true)
    protected Order order;

    /**
     * Gets the value of the order property.
     *
     * @return
     *     possible object is
     *     {@link Order }
     *
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     *
     * @param value
     *     allowed object is
     *     {@link Order }
     *
     */
    public void setOrder(Order value) {
        this.order = value;
    }

}
