
package nl.hrlmr.complaint._1;

import java.math.BigInteger;

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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}complaintIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}caseIdentifier" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}status"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://hrlmr.nl/complaint/1.0}userNameType" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="latestEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
         "complaintIdentifier", "caseIdentifier", "title", "type", "status", "location", "latitude", "longitude",
         "priority", "owner", "createdDate", "dueDate", "latestEvent"
    })
@XmlRootElement(name = "complaint")
public class Complaint {

    protected String complaintIdentifier;
    protected String caseIdentifier;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String status;
    protected String location;
    protected Float latitude;
    protected Float longitude;
    protected BigInteger priority;
    protected String owner;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    protected String latestEvent;

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
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the location property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the latitude property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setLatitude(Float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setLongitude(Float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the priority property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the owner property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the createdDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the latestEvent property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLatestEvent() {
        return latestEvent;
    }

    /**
     * Sets the value of the latestEvent property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLatestEvent(String value) {
        this.latestEvent = value;
    }

}
