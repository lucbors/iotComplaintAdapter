
package nl.hrlmr.order.messages._1;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}itemID"/>
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}itemDescription"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "itemID", "itemDescription" })
@XmlRootElement(name = "GetItems_RequestMessage")
public class GetItemsRequestMessage {

    @XmlElement(namespace = "http://hrlmr.nl/order/1.0", required = true)
    protected BigInteger itemID;
    @XmlElement(namespace = "http://hrlmr.nl/order/1.0", required = true)
    protected String itemDescription;

    /**
     * Gets the value of the itemID property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setItemID(BigInteger value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the itemDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

}
