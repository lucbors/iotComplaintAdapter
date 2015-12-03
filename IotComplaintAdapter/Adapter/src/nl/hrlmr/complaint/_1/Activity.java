
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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}activityIdentifier"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "activityIdentifier", "title", "isCompleted", "startDate" })
@XmlRootElement(name = "activity")
public class Activity {

    @XmlElement(required = true)
    protected String activityIdentifier;
    @XmlElement(required = true)
    protected String title;
    protected boolean isCompleted;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Gets the value of the activityIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActivityIdentifier() {
        return activityIdentifier;
    }

    /**
     * Sets the value of the activityIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActivityIdentifier(String value) {
        this.activityIdentifier = value;
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
     * Gets the value of the isCompleted property.
     *
     */
    public boolean isIsCompleted() {
        return isCompleted;
    }

    /**
     * Sets the value of the isCompleted property.
     *
     */
    public void setIsCompleted(boolean value) {
        this.isCompleted = value;
    }

    /**
     * Gets the value of the startDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

}
