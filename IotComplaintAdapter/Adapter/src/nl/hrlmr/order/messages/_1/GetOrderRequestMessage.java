
package nl.hrlmr.order.messages._1;

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
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}caseID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "caseID" })
@XmlRootElement(name = "GetOrder_RequestMessage")
public class GetOrderRequestMessage {

    @XmlElement(namespace = "http://hrlmr.nl/order/1.0", required = true)
    protected String caseID;

    /**
     * Gets the value of the caseID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseID() {
        return caseID;
    }

    /**
     * Sets the value of the caseID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseID(String value) {
        this.caseID = value;
    }

}
