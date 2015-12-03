
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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}stageIdentifier"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "stageIdentifier", "title", "startDate", "isCompleted" })
@XmlRootElement(name = "stage")
public class Stage {

    @XmlElement(required = true)
    protected String stageIdentifier;
    @XmlElement(required = true)
    protected String title;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected boolean isCompleted;

    /**
     * Gets the value of the stageIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStageIdentifier() {
        return stageIdentifier;
    }

    /**
     * Sets the value of the stageIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStageIdentifier(String value) {
        this.stageIdentifier = value;
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

}
