//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2015.10.06 � 02:17:29 PM CEST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="abundance" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="abundanceZone1" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="abundanceZone2" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="abundanceZone3" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="quality" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="qualityZone1" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="qualityZone2" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="qualityZone3" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "resource")
public class Resource {

    @XmlAttribute(name = "abundance")
    protected BigInteger abundance;
    @XmlAttribute(name = "abundanceZone1")
    protected BigInteger abundanceZone1;
    @XmlAttribute(name = "abundanceZone2")
    protected BigInteger abundanceZone2;
    @XmlAttribute(name = "abundanceZone3")
    protected BigInteger abundanceZone3;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "quality")
    protected BigInteger quality;
    @XmlAttribute(name = "qualityZone1")
    protected BigInteger qualityZone1;
    @XmlAttribute(name = "qualityZone2")
    protected BigInteger qualityZone2;
    @XmlAttribute(name = "qualityZone3")
    protected BigInteger qualityZone3;

    /**
     * Obtient la valeur de la propri�t� abundance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAbundance() {
        return abundance;
    }

    /**
     * D�finit la valeur de la propri�t� abundance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAbundance(BigInteger value) {
        this.abundance = value;
    }

    /**
     * Obtient la valeur de la propri�t� abundanceZone1.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAbundanceZone1() {
        return abundanceZone1;
    }

    /**
     * D�finit la valeur de la propri�t� abundanceZone1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAbundanceZone1(BigInteger value) {
        this.abundanceZone1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� abundanceZone2.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAbundanceZone2() {
        return abundanceZone2;
    }

    /**
     * D�finit la valeur de la propri�t� abundanceZone2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAbundanceZone2(BigInteger value) {
        this.abundanceZone2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� abundanceZone3.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAbundanceZone3() {
        return abundanceZone3;
    }

    /**
     * D�finit la valeur de la propri�t� abundanceZone3.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAbundanceZone3(BigInteger value) {
        this.abundanceZone3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� name.
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
     * D�finit la valeur de la propri�t� name.
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
     * Obtient la valeur de la propri�t� quality.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuality() {
        return quality;
    }

    /**
     * D�finit la valeur de la propri�t� quality.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuality(BigInteger value) {
        this.quality = value;
    }

    /**
     * Obtient la valeur de la propri�t� qualityZone1.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQualityZone1() {
        return qualityZone1;
    }

    /**
     * D�finit la valeur de la propri�t� qualityZone1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQualityZone1(BigInteger value) {
        this.qualityZone1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� qualityZone2.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQualityZone2() {
        return qualityZone2;
    }

    /**
     * D�finit la valeur de la propri�t� qualityZone2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQualityZone2(BigInteger value) {
        this.qualityZone2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� qualityZone3.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQualityZone3() {
        return qualityZone3;
    }

    /**
     * D�finit la valeur de la propri�t� qualityZone3.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQualityZone3(BigInteger value) {
        this.qualityZone3 = value;
    }

}
