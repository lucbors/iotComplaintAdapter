
package nl.hrlmr.order._1;

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
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}Contractor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "contractor" })
@XmlRootElement(name = "ContractorsList")
public class ContractorsList {

    @XmlElement(name = "Contractor", required = true)
    protected Contractor contractor;

    /**
     * Gets the value of the contractor property.
     *
     * @return
     *     possible object is
     *     {@link Contractor }
     *
     */
    public Contractor getContractor() {
        return contractor;
    }

    /**
     * Sets the value of the contractor property.
     *
     * @param value
     *     allowed object is
     *     {@link Contractor }
     *
     */
    public void setContractor(Contractor value) {
        this.contractor = value;
    }

}
