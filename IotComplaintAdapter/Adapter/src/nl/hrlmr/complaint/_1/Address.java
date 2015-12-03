
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
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="housenumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "street", "housenumber", "zipcode", "city", "country" })
@XmlRootElement(name = "address")
public class Address {

    @XmlElement(required = true)
    protected String street;
    @XmlElement(required = true)
    protected String housenumber;
    @XmlElement(required = true)
    protected String zipcode;
    @XmlElement(required = true)
    protected String city;
    protected String country;

    /**
     * Gets the value of the street property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the housenumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHousenumber() {
        return housenumber;
    }

    /**
     * Sets the value of the housenumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHousenumber(String value) {
        this.housenumber = value;
    }

    /**
     * Gets the value of the zipcode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
