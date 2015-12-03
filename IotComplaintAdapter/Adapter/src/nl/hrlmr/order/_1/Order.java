
package nl.hrlmr.order._1;

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
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}orderID" minOccurs="0"/>
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}caseID"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}contractorID"/>
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}contractorName" minOccurs="0"/>
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}createDate" minOccurs="0"/>
 *         &lt;element ref="{http://hrlmr.nl/order/1.0}lastUpdateDate" minOccurs="0"/>
 *         &lt;element name="expectedCompletionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ListOfOrderItems">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrderItem">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://hrlmr.nl/order/1.0}itemID"/>
 *                             &lt;element ref="{http://hrlmr.nl/order/1.0}itemDescription" minOccurs="0"/>
 *                             &lt;element name="orderUnits" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="remainingUnits" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element ref="{http://hrlmr.nl/order/1.0}costPerUnit" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
         "orderID", "caseID", "user", "contractorID", "contractorName", "createDate", "lastUpdateDate",
         "expectedCompletionDate", "orderNumber", "listOfOrderItems"
    })
@XmlRootElement(name = "Order")
public class Order {

    protected BigInteger orderID;
    @XmlElement(required = true)
    protected String caseID;
    protected String user;
    @XmlElement(required = true)
    protected BigInteger contractorID;
    protected String contractorName;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedCompletionDate;
    @XmlElement(required = true)
    protected String orderNumber;
    @XmlElement(name = "ListOfOrderItems", required = true)
    protected Order.ListOfOrderItems listOfOrderItems;

    /**
     * Gets the value of the orderID property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setOrderID(BigInteger value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the caseID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaseID() {
        return caseID;
    }

    /**
     * Sets the value of the caseID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaseID(String value) {
        this.caseID = value;
    }

    /**
     * Gets the value of the user property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the contractorID property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getContractorID() {
        return contractorID;
    }

    /**
     * Sets the value of the contractorID property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setContractorID(BigInteger value) {
        this.contractorID = value;
    }

    /**
     * Gets the value of the contractorName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContractorName() {
        return contractorName;
    }

    /**
     * Sets the value of the contractorName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContractorName(String value) {
        this.contractorName = value;
    }

    /**
     * Gets the value of the createDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the expectedCompletionDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExpectedCompletionDate() {
        return expectedCompletionDate;
    }

    /**
     * Sets the value of the expectedCompletionDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExpectedCompletionDate(XMLGregorianCalendar value) {
        this.expectedCompletionDate = value;
    }

    /**
     * Gets the value of the orderNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the listOfOrderItems property.
     *
     * @return
     *     possible object is
     *     {@link Order.ListOfOrderItems }
     *
     */
    public Order.ListOfOrderItems getListOfOrderItems() {
        return listOfOrderItems;
    }

    /**
     * Sets the value of the listOfOrderItems property.
     *
     * @param value
     *     allowed object is
     *     {@link Order.ListOfOrderItems }
     *
     */
    public void setListOfOrderItems(Order.ListOfOrderItems value) {
        this.listOfOrderItems = value;
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
     *         &lt;element name="OrderItem">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://hrlmr.nl/order/1.0}itemID"/>
     *                   &lt;element ref="{http://hrlmr.nl/order/1.0}itemDescription" minOccurs="0"/>
     *                   &lt;element name="orderUnits" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="remainingUnits" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element ref="{http://hrlmr.nl/order/1.0}costPerUnit" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = { "orderItem" })
    public static class ListOfOrderItems {

        @XmlElement(name = "OrderItem", required = true)
        protected Order.ListOfOrderItems.OrderItem orderItem;

        /**
         * Gets the value of the orderItem property.
         *
         * @return
         *     possible object is
         *     {@link Order.ListOfOrderItems.OrderItem }
         *
         */
        public Order.ListOfOrderItems.OrderItem getOrderItem() {
            return orderItem;
        }

        /**
         * Sets the value of the orderItem property.
         *
         * @param value
         *     allowed object is
         *     {@link Order.ListOfOrderItems.OrderItem }
         *
         */
        public void setOrderItem(Order.ListOfOrderItems.OrderItem value) {
            this.orderItem = value;
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
         *         &lt;element ref="{http://hrlmr.nl/order/1.0}itemID"/>
         *         &lt;element ref="{http://hrlmr.nl/order/1.0}itemDescription" minOccurs="0"/>
         *         &lt;element name="orderUnits" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="remainingUnits" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element ref="{http://hrlmr.nl/order/1.0}costPerUnit" minOccurs="0"/>
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
                 "itemID", "itemDescription", "orderUnits", "remainingUnits", "price", "costPerUnit" })
        public static class OrderItem {

            @XmlElement(required = true)
            protected BigInteger itemID;
            protected String itemDescription;
            @XmlElement(required = true)
            protected BigInteger orderUnits;
            @XmlElement(required = true)
            protected BigInteger remainingUnits;
            @XmlElement(required = true)
            protected String price;
            protected String costPerUnit;

            /**
             * Gets the value of the itemID property.
             *
             * @return
             *     possible object is
             *     {@link BigInteger }
             *
             */
            public BigInteger getItemID() {
                return itemID;
            }

            /**
             * Sets the value of the itemID property.
             *
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *
             */
            public void setItemID(BigInteger value) {
                this.itemID = value;
            }

            /**
             * Gets the value of the itemDescription property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getItemDescription() {
                return itemDescription;
            }

            /**
             * Sets the value of the itemDescription property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setItemDescription(String value) {
                this.itemDescription = value;
            }

            /**
             * Gets the value of the orderUnits property.
             *
             * @return
             *     possible object is
             *     {@link BigInteger }
             *
             */
            public BigInteger getOrderUnits() {
                return orderUnits;
            }

            /**
             * Sets the value of the orderUnits property.
             *
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *
             */
            public void setOrderUnits(BigInteger value) {
                this.orderUnits = value;
            }

            /**
             * Gets the value of the remainingUnits property.
             *
             * @return
             *     possible object is
             *     {@link BigInteger }
             *
             */
            public BigInteger getRemainingUnits() {
                return remainingUnits;
            }

            /**
             * Sets the value of the remainingUnits property.
             *
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *
             */
            public void setRemainingUnits(BigInteger value) {
                this.remainingUnits = value;
            }

            /**
             * Gets the value of the price property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPrice(String value) {
                this.price = value;
            }

            /**
             * Gets the value of the costPerUnit property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCostPerUnit() {
                return costPerUnit;
            }

            /**
             * Sets the value of the costPerUnit property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCostPerUnit(String value) {
                this.costPerUnit = value;
            }

        }

    }

}
