
package nl.hrlmr.complaint._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}milestoneIdentifier"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateReached" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isReached" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "milestoneIdentifier", "title", "dateReached", "isReached" })
@XmlRootElement(name = "milestone")
public class Milestone {

    @XmlElement(required = true)
    protected String milestoneIdentifier;
    @XmlElement(required = true)
    protected String title;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReached;
    protected boolean isReached;

    /**
     * Gets the value of the milestoneIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMilestoneIdentifier() {
        return milestoneIdentifier;
    }

    /**
     * Sets the value of the milestoneIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMilestoneIdentifier(String value) {
        this.milestoneIdentifier = value;
    }

    /**
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the dateReached property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateReached() {
        return dateReached;
    }

    /**
     * Sets the value of the dateReached property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateReached(XMLGregorianCalendar value) {
        this.dateReached = value;
    }

    /**
     * Gets the value of the isReached property.
     *
     */
    public boolean isIsReached() {
        return isReached;
    }

    /**
     * Sets the value of the isReached property.
     *
     */
    public void setIsReached(boolean value) {
        this.isReached = value;
    }

}
