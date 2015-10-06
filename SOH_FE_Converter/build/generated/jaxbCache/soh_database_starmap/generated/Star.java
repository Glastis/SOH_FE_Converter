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
 *         &lt;element ref="{}resource"/>
 *       &lt;/sequence>
 *       &lt;attribute name="diameter" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="hab" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="orbit" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="shell" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="spectralClass" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="starId" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resource"
})
@XmlRootElement(name = "star")
public class Star {

    @XmlElement(required = true)
    protected Resource resource;
    @XmlAttribute(name = "diameter", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String diameter;
    @XmlAttribute(name = "hab", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String hab;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "orbit", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String orbit;
    @XmlAttribute(name = "shell", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String shell;
    @XmlAttribute(name = "size", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String size;
    @XmlAttribute(name = "spectralClass")
    @XmlSchemaType(name = "anySimpleType")
    protected String spectralClass;
    @XmlAttribute(name = "starId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String starId;

    /**
     * Obtient la valeur de la propri�t� resource.
     * 
     * @return
     *     possible object is
     *     {@link Resource }
     *     
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * D�finit la valeur de la propri�t� resource.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource }
     *     
     */
    public void setResource(Resource value) {
        this.resource = value;
    }

    /**
     * Obtient la valeur de la propri�t� diameter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiameter() {
        return diameter;
    }

    /**
     * D�finit la valeur de la propri�t� diameter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiameter(String value) {
        this.diameter = value;
    }

    /**
     * Obtient la valeur de la propri�t� hab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHab() {
        return hab;
    }

    /**
     * D�finit la valeur de la propri�t� hab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHab(String value) {
        this.hab = value;
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
     * Obtient la valeur de la propri�t� shell.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShell() {
        return shell;
    }

    /**
     * D�finit la valeur de la propri�t� shell.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShell(String value) {
        this.shell = value;
    }

    /**
     * Obtient la valeur de la propri�t� size.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * D�finit la valeur de la propri�t� size.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Obtient la valeur de la propri�t� spectralClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpectralClass() {
        return spectralClass;
    }

    /**
     * D�finit la valeur de la propri�t� spectralClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpectralClass(String value) {
        this.spectralClass = value;
    }

    /**
     * Obtient la valeur de la propri�t� starId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarId() {
        return starId;
    }

    /**
     * D�finit la valeur de la propri�t� starId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarId(String value) {
        this.starId = value;
    }

}
