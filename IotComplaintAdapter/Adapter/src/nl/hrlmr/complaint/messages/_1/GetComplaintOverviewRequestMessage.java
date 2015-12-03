
package nl.hrlmr.complaint.messages._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import nl.hrlmr.complaint._1.Complaintfilter;


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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}complaintfilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "complaintfilter" })
@XmlRootElement(name = "GetComplaintOverviewRequestMessage")
public class GetComplaintOverviewRequestMessage {

    @XmlElement(namespace = "http://hrlmr.nl/complaint/1.0", required = true)
    protected Complaintfilter complaintfilter;

    /**
     * Gets the value of the complaintfilter property.
     *
     * @return
     *     possible object is
     *     {@link Complaintfilter }
     *
     */
    public Complaintfilter getComplaintfilter() {
        return complaintfilter;
    }

    /**
     * Sets the value of the complaintfilter property.
     *
     * @param value
     *     allowed object is
     *     {@link Complaintfilter }
     *
     */
    public void setComplaintfilter(Complaintfilter value) {
        this.complaintfilter = value;
    }

}
