
package nl.hrlmr.order.messages._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import nl.hrlmr.order._1.ItemsList;


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
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}ItemsList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "itemsList" })
@XmlRootElement(name = "CreateItems_RequestMessage")
public class CreateItemsRequestMessage {

    @XmlElement(name = "ItemsList", namespace = "http://hrlmr.nl/order/1.0", required = true)
    protected ItemsList itemsList;

    /**
     * Gets the value of the itemsList property.
     *
     * @return
     *     possible object is
     *     {@link ItemsList }
     *
     */
    public ItemsList getItemsList() {
        return itemsList;
    }

    /**
     * Sets the value of the itemsList property.
     *
     * @param value
     *     allowed object is
     *     {@link ItemsList }
     *
     */
    public void setItemsList(ItemsList value) {
        this.itemsList = value;
    }

}
