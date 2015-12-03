
package nl.hrlmr.complaint.messages._1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import nl.hrlmr.complaint._1.Complaint;


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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}complaint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "complaint" })
@XmlRootElement(name = "GetComplaintOverviewResponseMessage")
public class GetComplaintOverviewResponseMessage {

    @XmlElement(namespace = "http://hrlmr.nl/complaint/1.0")
    protected List<Complaint> complaint;

    /**
     * Gets the value of the complaint property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complaint property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplaint().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Complaint }
     *
     *
     */
    public List<Complaint> getComplaint() {
        if (complaint == null) {
            complaint = new ArrayList<Complaint>();
        }
        return this.complaint;
    }

}
