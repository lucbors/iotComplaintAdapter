
package nl.hrlmr.complaint.messages._1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import nl.hrlmr.complaint._1.Stage;


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
 *         &lt;element ref="{http://hrlmr.nl/complaint/1.0}stage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "stage" })
@XmlRootElement(name = "GetStageOverviewResponseMessage")
public class GetStageOverviewResponseMessage {

    @XmlElement(namespace = "http://hrlmr.nl/complaint/1.0")
    protected List<Stage> stage;

    /**
     * Gets the value of the stage property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stage property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStage().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stage }
     *
     *
     */
    public List<Stage> getStage() {
        if (stage == null) {
            stage = new ArrayList<Stage>();
        }
        return this.stage;
    }

}
