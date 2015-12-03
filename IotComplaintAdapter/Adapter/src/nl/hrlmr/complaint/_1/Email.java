
package nl.hrlmr.complaint._1;

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
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mailBody" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "to", "cc", "subject", "mailBody" })
@XmlRootElement(name = "email")
public class Email {

    @XmlElement(required = true)
    protected String to;
    protected String cc;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected String mailBody;

    /**
     * Gets the value of the to property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the cc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCc() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCc(String value) {
        this.cc = value;
    }

    /**
     * Gets the value of the subject property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the mailBody property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMailBody() {
        return mailBody;
    }

    /**
     * Sets the value of the mailBody property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMailBody(String value) {
        this.mailBody = value;
    }

}
