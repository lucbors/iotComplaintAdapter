
package nl.hrlmr.complaint.messages._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import nl.hrlmr.complaint._1.ComplaintDetail;


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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}complaintDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "complaintDetail" })
@XmlRootElement(name = "CreateComplaintRequestMessage")
public class CreateComplaintRequestMessage {

    @XmlElement(namespace = "http://hrlmr.nl/complaint/1.0", required = true)
    protected ComplaintDetail complaintDetail;

    /**
     * Gets the value of the complaintDetail property.
     *
     * @return
     *     possible object is
     *     {@link ComplaintDetail }
     *
     */
    public ComplaintDetail getComplaintDetail() {
        return complaintDetail;
    }

    /**
     * Sets the value of the complaintDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link ComplaintDetail }
     *
     */
    public void setComplaintDetail(ComplaintDetail value) {
        this.complaintDetail = value;
    }

}
