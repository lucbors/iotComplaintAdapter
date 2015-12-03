
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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}complainerIdentifier"/>
 *         &lt;element name="bsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}address"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}gender"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
         "complainerIdentifier", "bsn", "address", "firstName", "lastName", "phoneNumber", "gender", "dateOfBirth"
    })
@XmlRootElement(name = "complainer")
public class Complainer {

    @XmlElement(required = true)
    protected String complainerIdentifier;
    @XmlElement(required = true)
    protected String bsn;
    @XmlElement(required = true)
    protected Address address;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String phoneNumber;
    @XmlElement(required = true)
    protected String gender;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;

    /**
     * Gets the value of the complainerIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComplainerIdentifier() {
        return complainerIdentifier;
    }

    /**
     * Sets the value of the complainerIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComplainerIdentifier(String value) {
        this.complainerIdentifier = value;
    }

    /**
     * Gets the value of the bsn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBsn() {
        return bsn;
    }

    /**
     * Sets the value of the bsn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBsn(String value) {
        this.bsn = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link Address }
     *
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link Address }
     *
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the firstName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the gender property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

}
