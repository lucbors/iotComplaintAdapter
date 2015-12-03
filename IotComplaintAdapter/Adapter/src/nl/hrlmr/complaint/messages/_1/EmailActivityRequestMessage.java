
package nl.hrlmr.complaint.messages._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import nl.hrlmr.complaint._1.Email;


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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}caseIdentifier"/>
 *         &lt;element name="user" type="{http://hrlmr.nl/complaint/1.0}userNameType"/>
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}email"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "caseIdentifier", "user", "email" })
@XmlRootElement(name = "EmailActivityRequestMessage")
public class EmailActivityRequestMessage {

    @XmlElement(namespace = "http://hrlmr.nl/complaint/1.0", required = true)
    protected String caseIdentifier;
    @XmlElement(required = true)
    protected String user;
    @XmlElement(namespace = "http://hrlmr.nl/complaint/1.0", required = true)
    protected Email email;

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

    /**
     * Gets the value of the user property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link Email }
     *
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link Email }
     *
     */
    public void setEmail(Email value) {
        this.email = value;
    }

}
