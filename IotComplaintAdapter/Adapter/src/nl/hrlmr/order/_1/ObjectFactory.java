
package nl.hrlmr.order._1;

import java.math.BigInteger;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the nl.hrlmr.order._1 package.
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

    private final static QName _LastUpdateDate_QNAME = new QName("http://hrlmr.nl/order/1.0", "lastUpdateDate");
    private final static QName _ContractorName_QNAME = new QName("http://hrlmr.nl/order/1.0", "contractorName");
    private final static QName _Description_QNAME = new QName("http://hrlmr.nl/order/1.0", "Description");
    private final static QName _ItemID_QNAME = new QName("http://hrlmr.nl/order/1.0", "itemID");
    private final static QName _OrderID_QNAME = new QName("http://hrlmr.nl/order/1.0", "orderID");
    private final static QName _CreateDate_QNAME = new QName("http://hrlmr.nl/order/1.0", "createDate");
    private final static QName _CaseID_QNAME = new QName("http://hrlmr.nl/order/1.0", "caseID");
    private final static QName _CostPerUnit_QNAME = new QName("http://hrlmr.nl/order/1.0", "costPerUnit");
    private final static QName _ItemDescription_QNAME = new QName("http://hrlmr.nl/order/1.0", "itemDescription");
    private final static QName _ContractorID_QNAME = new QName("http://hrlmr.nl/order/1.0", "contractorID");
    private final static QName _Status_QNAME = new QName("http://hrlmr.nl/order/1.0", "Status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.hrlmr.order._1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Order }
     *
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Order.ListOfOrderItems }
     *
     */
    public Order.ListOfOrderItems createOrderListOfOrderItems() {
        return new Order.ListOfOrderItems();
    }

    /**
     * Create an instance of {@link ContractorsList }
     *
     */
    public ContractorsList createContractorsList() {
        return new ContractorsList();
    }

    /**
     * Create an instance of {@link Contractor }
     *
     */
    public Contractor createContractor() {
        return new Contractor();
    }

    /**
     * Create an instance of {@link ItemsList }
     *
     */
    public ItemsList createItemsList() {
        return new ItemsList();
    }

    /**
     * Create an instance of {@link Item }
     *
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Order.ListOfOrderItems.OrderItem }
     *
     */
    public Order.ListOfOrderItems.OrderItem createOrderListOfOrderItemsOrderItem() {
        return new Order.ListOfOrderItems.OrderItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/order/1.0", name = "lastUpdateDate")
    public JAXBElement<XMLGregorianCalendar> createLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastUpdateDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/order/1.0", name = "contractorName")
    public JAXBElement<String> createContractorName(String value) {
        return new JAXBElement<String>(_ContractorName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/order/1.0", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/order/1.0", name = "itemID")
    public JAXBElement<BigInteger> createItemID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ItemID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/order/1.0", name = "orderID")
    public JAXBElement<BigInteger> createOrderID(BigInteger value) {
        return new JAXBElement<BigInteger>(_OrderID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/order/1.0", name = "createDate")
    public JAXBElement<XMLGregorianCalendar> createCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/order/1.0", name = "caseID")
    public JAXBElement<String> createCaseID(String value) {
        return new JAXBElement<String>(_CaseID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/order/1.0", name = "costPerUnit")
    public JAXBElement<String> createCostPerUnit(String value) {
        return new JAXBElement<String>(_CostPerUnit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/order/1.0", name = "itemDescription")
    public JAXBElement<String> createItemDescription(String value) {
        return new JAXBElement<String>(_ItemDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/order/1.0", name = "contractorID")
    public JAXBElement<BigInteger> createContractorID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ContractorID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://hrlmr.nl/order/1.0", name = "Status")
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

}
