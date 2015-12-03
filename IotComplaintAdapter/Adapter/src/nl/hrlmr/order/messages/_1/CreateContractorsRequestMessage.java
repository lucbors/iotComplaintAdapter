
package nl.hrlmr.order.messages._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import nl.hrlmr.order._1.ContractorsList;


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
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}ContractorsList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "contractorsList" })
@XmlRootElement(name = "CreateContractors_RequestMessage")
public class CreateContractorsRequestMessage {

    @XmlElement(name = "ContractorsList", namespace = "http://hrlmr.nl/order/1.0", required = true)
    protected ContractorsList contractorsList;

    /**
     * Gets the value of the contractorsList property.
     *
     * @return
     *     possible object is
     *     {@link ContractorsList }
     *
     */
    public ContractorsList getContractorsList() {
        return contractorsList;
    }

    /**
     * Sets the value of the contractorsList property.
     *
     * @param value
     *     allowed object is
     *     {@link ContractorsList }
     *
     */
    public void setContractorsList(ContractorsList value) {
        this.contractorsList = value;
    }

}
