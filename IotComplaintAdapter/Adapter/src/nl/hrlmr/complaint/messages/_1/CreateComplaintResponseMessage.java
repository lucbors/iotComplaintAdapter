
package nl.hrlmr.complaint.messages._1;

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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}complaintIdentifier"/>
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}caseIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "complaintIdentifier", "caseIdentifier" })
@XmlRootElement(name = "CreateComplaintResponseMessage")
public class CreateComplaintResponseMessage {

    @XmlElement(namespace = "http://hrlmr.nl/complaint/1.0", required = true)
    protected String complaintIdentifier;
    @XmlElement(namespace = "http://hrlmr.nl/complaint/1.0", required = true)
    protected String caseIdentifier;

    /**
     * Gets the value of the complaintIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComplaintIdentifier() {
        return complaintIdentifier;
    }

    /**
     * Sets the value of the complaintIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComplaintIdentifier(String value) {
        this.complaintIdentifier = value;
    }

    /**
     * Gets the value of the caseIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseIdentifier() {
        return caseIdentifier;
    }

    /**
     * Sets the value of the caseIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseIdentifier(String value) {
        this.caseIdentifier = value;
    }

}
