
package service.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for table complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="table">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ispol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otvet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="razmer" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tarif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ysluga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "table", propOrder = {
    "ispol",
    "name",
    "otvet",
    "price",
    "razmer",
    "tarif",
    "ysluga"
})
public class Table {

    protected String ispol;
    protected String name;
    protected String otvet;
    protected double price;
    protected double razmer;
    protected String tarif;
    protected String ysluga;

    /**
     * Gets the value of the ispol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIspol() {
        return ispol;
    }

    /**
     * Sets the value of the ispol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIspol(String value) {
        this.ispol = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the otvet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtvet() {
        return otvet;
    }

    /**
     * Sets the value of the otvet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtvet(String value) {
        this.otvet = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the razmer property.
     * 
     */
    public double getRazmer() {
        return razmer;
    }

    /**
     * Sets the value of the razmer property.
     * 
     */
    public void setRazmer(double value) {
        this.razmer = value;
    }

    /**
     * Gets the value of the tarif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarif() {
        return tarif;
    }

    /**
     * Sets the value of the tarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarif(String value) {
        this.tarif = value;
    }

    /**
     * Gets the value of the ysluga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsluga() {
        return ysluga;
    }

    /**
     * Sets the value of the ysluga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsluga(String value) {
        this.ysluga = value;
    }

}
