
package nl.hrlmr.complaint._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the nl.hrlmr.complaint._1 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MilestoneIdentifier_QNAME =
        new QName("http://hrlmr.nl/complaint/1.0", "milestoneIdentifier");
    private final static QName _Result_QNAME = new QName("http://hrlmr.nl/complaint/1.0", "result");
    private final static QName _Status_QNAME = new QName("http://hrlmr.nl/complaint/1.0", "status");
    private final static QName _ComplainerIdentifier_QNAME =
        new QName("http://hrlmr.nl/complaint/1.0", "complainerIdentifier");
    private final static QName _CaseIdentifier_QNAME = new QName("http://hrlmr.nl/complaint/1.0", "caseIdentifier");
    private final static QName _Decision_QNAME = new QName("http://hrlmr.nl/complaint/1.0", "decision");
    private final static QName _ActivityIdentifier_QNAME =
        new QName("http://hrlmr.nl/complaint/1.0", "activityIdentifier");
    private final static QName _ComplaintIdentifier_QNAME =
        new QName("http://hrlmr.nl/complaint/1.0", "complaintIdentifier");
    private final static QName _Gender_QNAME = new QName("http://hrlmr.nl/complaint/1.0", "gender");
    private final static QName _StageIdentifier_QNAME = new QName("http://hrlmr.nl/complaint/1.0", "stageIdentifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.hrlmr.complaint._1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComplaintDetail }
     *
     */
    public ComplaintDetail createComplaintDetail() {
        return new ComplaintDetail();
    }

    /**
     * Create an instance of {@link Complaint }
     *
     */
    public Complaint createComplaint() {
        return new Complaint();
    }

    /**
     * Create an instance of {@link Complainer }
     *
     */
    public Complainer createComplainer() {
        return new Complainer();
    }

    /**
     * Create an instance of {@link Address }
     *
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ComplaintDetail.MediaItem }
     *
     */
    public ComplaintDetail.MediaItem createComplaintDetailMediaItem() {
        return new ComplaintDetail.MediaItem();
    }

    /**
     * Create an instance of {@link Activity }
     *
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link Milestone }
     *
     */
    public Milestone createMilestone() {
        return new Milestone();
    }

    /**
     * Create an instance of {@link Email }
     *
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link Complaintfilter }
     *
     */
    public Complaintfilter createComplaintfilter() {
        return new Complaintfilter();
    }

    /**
     * Create an instance of {@link Stage }
     *
     */
    public Stage createStage() {
        return new Stage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/complaint/1.0", name = "milestoneIdentifier")
    public JAXBElement<String> createMilestoneIdentifier(String value) {
        return new JAXBElement<String>(_MilestoneIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/complaint/1.0", name = "result")
    public JAXBElement<String> createResult(String value) {
        return new JAXBElement<String>(_Result_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/complaint/1.0", name = "status")
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/complaint/1.0", name = "complainerIdentifier")
    public JAXBElement<String> createComplainerIdentifier(String value) {
        return new JAXBElement<String>(_ComplainerIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/complaint/1.0", name = "caseIdentifier")
    public JAXBElement<String> createCaseIdentifier(String value) {
        return new JAXBElement<String>(_CaseIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/complaint/1.0", name = "decision")
    public JAXBElement<String> createDecision(String value) {
        return new JAXBElement<String>(_Decision_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/complaint/1.0", name = "activityIdentifier")
    public JAXBElement<String> createActivityIdentifier(String value) {
        return new JAXBElement<String>(_ActivityIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/complaint/1.0", name = "complaintIdentifier")
    public JAXBElement<String> createComplaintIdentifier(String value) {
        return new JAXBElement<String>(_ComplaintIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/complaint/1.0", name = "gender")
    public JAXBElement<String> createGender(String value) {
        return new JAXBElement<String>(_Gender_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/complaint/1.0", name = "stageIdentifier")
    public JAXBElement<String> createStageIdentifier(String value) {
        return new JAXBElement<String>(_StageIdentifier_QNAME, String.class, null, value);
    }

}
