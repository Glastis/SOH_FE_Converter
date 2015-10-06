//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2015.10.06 � 02:17:29 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}geosphere"/>
 *         &lt;element ref="{}hydrosphere" minOccurs="0"/>
 *         &lt;element ref="{}atmosphere"/>
 *         &lt;element ref="{}biosphere" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="bodyType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="orbit" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="planetId" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="zone" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "geosphere",
    "hydrosphere",
    "atmosphere",
    "biosphere"
})
@XmlRootElement(name = "planet")
public class Planet {

    @XmlElement(required = true)
    protected Geosphere geosphere;
    protected Hydrosphere hydrosphere;
    @XmlElement(required = true)
    protected Atmosphere atmosphere;
    protected Biosphere biosphere;
    @XmlAttribute(name = "bodyType", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String bodyType;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "orbit", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String orbit;
    @XmlAttribute(name = "planetId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String planetId;
    @XmlAttribute(name = "zone", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String zone;

    /**
     * Obtient la valeur de la propri�t� geosphere.
     * 
     * @return
     *     possible object is
     *     {@link Geosphere }
     *     
     */
    public Geosphere getGeosphere() {
        return geosphere;
    }

    /**
     * D�finit la valeur de la propri�t� geosphere.
     * 
     * @param value
     *     allowed object is
     *     {@link Geosphere }
     *     
     */
    public void setGeosphere(Geosphere value) {
        this.geosphere = value;
    }

    /**
     * Obtient la valeur de la propri�t� hydrosphere.
     * 
     * @return
     *     possible object is
     *     {@link Hydrosphere }
     *     
     */
    public Hydrosphere getHydrosphere() {
        return hydrosphere;
    }

    /**
     * D�finit la valeur de la propri�t� hydrosphere.
     * 
     * @param value
     *     allowed object is
     *     {@link Hydrosphere }
     *     
     */
    public void setHydrosphere(Hydrosphere value) {
        this.hydrosphere = value;
    }

    /**
     * Obtient la valeur de la propri�t� atmosphere.
     * 
     * @return
     *     possible object is
     *     {@link Atmosphere }
     *     
     */
    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    /**
     * D�finit la valeur de la propri�t� atmosphere.
     * 
     * @param value
     *     allowed object is
     *     {@link Atmosphere }
     *     
     */
    public void setAtmosphere(Atmosphere value) {
        this.atmosphere = value;
    }

    /**
     * Obtient la valeur de la propri�t� biosphere.
     * 
     * @return
     *     possible object is
     *     {@link Biosphere }
     *     
     */
    public Biosphere getBiosphere() {
        return biosphere;
    }

    /**
     * D�finit la valeur de la propri�t� biosphere.
     * 
     * @param value
     *     allowed object is
     *     {@link Biosphere }
     *     
     */
    public void setBiosphere(Biosphere value) {
        this.biosphere = value;
    }

    /**
     * Obtient la valeur de la propri�t� bodyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     * D�finit la valeur de la propri�t� bodyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyType(String value) {
        this.bodyType = value;
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
     * Obtient la valeur de la propri�t� orbit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrbit() {
        return orbit;
    }

    /**
     * D�finit la valeur de la propri�t� orbit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrbit(String value) {
        this.orbit = value;
    }

    /**
     * Obtient la valeur de la propri�t� planetId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanetId() {
        return planetId;
    }

    /**
     * D�finit la valeur de la propri�t� planetId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanetId(String value) {
        this.planetId = value;
    }

    /**
     * Obtient la valeur de la propri�t� zone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * D�finit la valeur de la propri�t� zone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

}
