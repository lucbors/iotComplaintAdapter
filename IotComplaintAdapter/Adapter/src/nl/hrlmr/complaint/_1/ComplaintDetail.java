
package nl.hrlmr.complaint._1;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}complaint"/>
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}complainer"/>
 *         &lt;element name="feedback" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}decision" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="object" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}result" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mediaItem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
         "complaint", "complainer", "feedback", "decision", "description", "object", "result", "mediaItem" })
@XmlRootElement(name = "complaintDetail")
public class ComplaintDetail {

    @XmlElement(required = true)
    protected Complaint complaint;
    @XmlElement(required = true)
    protected Complainer complainer;
    protected List<String> feedback;
    protected String decision;
    protected String description;
    protected String object;
    protected List<String> result;
    protected List<ComplaintDetail.MediaItem> mediaItem;

    /**
     * Gets the value of the complaint property.
     *
     * @return
     *     possible object is
     *     {@link Complaint }
     *
     */
    public Complaint getComplaint() {
        return complaint;
    }

    /**
     * Sets the value of the complaint property.
     *
     * @param value
     *     allowed object is
     *     {@link Complaint }
     *
     */
    public void setComplaint(Complaint value) {
        this.complaint = value;
    }

    /**
     * Gets the value of the complainer property.
     *
     * @return
     *     possible object is
     *     {@link Complainer }
     *
     */
    public Complainer getComplainer() {
        return complainer;
    }

    /**
     * Sets the value of the complainer property.
     *
     * @param value
     *     allowed object is
     *     {@link Complainer }
     *
     */
    public void setComplainer(Complainer value) {
        this.complainer = value;
    }

    /**
     * Gets the value of the feedback property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedback property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedback().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getFeedback() {
        if (feedback == null) {
            feedback = new ArrayList<String>();
        }
        return this.feedback;
    }

    /**
     * Gets the value of the decision property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDecision(String value) {
        this.decision = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the object property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setObject(String value) {
        this.object = value;
    }

    /**
     * Gets the value of the result property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getResult() {
        if (result == null) {
            result = new ArrayList<String>();
        }
        return this.result;
    }

    /**
     * Gets the value of the mediaItem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaItem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplaintDetail.MediaItem }
     *
     *
     */
    public List<ComplaintDetail.MediaItem> getMediaItem() {
        if (mediaItem == null) {
            mediaItem = new ArrayList<ComplaintDetail.MediaItem>();
        }
        return this.mediaItem;
    }


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
     *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "reference" })
    public static class MediaItem {

        @XmlElement(required = true)
        protected String reference;

        /**
         * Gets the value of the reference property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setReference(String value) {
            this.reference = value;
        }

    }

}
