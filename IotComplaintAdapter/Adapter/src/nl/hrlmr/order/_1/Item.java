
package nl.hrlmr.order._1;

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
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}itemID" minOccurs="0"/>
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}itemDescription"/>
 *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}costPerUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "itemID", "itemDescription", "units", "costPerUnit" })
@XmlRootElement(name = "Item")
public class Item {

    protected BigInteger itemID;
    @XmlElement(required = true)
    protected String itemDescription;
    @XmlElement(required = true)
    protected BigInteger units;
    @XmlElement(required = true)
    protected String costPerUnit;

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

    /**
     * Gets the value of the units property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setUnits(BigInteger value) {
        this.units = value;
    }

    /**
     * Gets the value of the costPerUnit property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCostPerUnit() {
        return costPerUnit;
    }

    /**
     * Sets the value of the costPerUnit property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCostPerUnit(String value) {
        this.costPerUnit = value;
    }

}
