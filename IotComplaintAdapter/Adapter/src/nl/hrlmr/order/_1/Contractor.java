
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
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}contractorID" minOccurs="0"/>
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}contractorName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "contractorID", "contractorName" })
@XmlRootElement(name = "Contractor")
public class Contractor {

    protected BigInteger contractorID;
    @XmlElement(required = true)
    protected String contractorName;

    /**
     * Gets the value of the contractorID property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getContractorID() {
        return contractorID;
    }

    /**
     * Sets the value of the contractorID property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setContractorID(BigInteger value) {
        this.contractorID = value;
    }

    /**
     * Gets the value of the contractorName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContractorName() {
        return contractorName;
    }

    /**
     * Sets the value of the contractorName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContractorName(String value) {
        this.contractorName = value;
    }

}
