
package com.tumblr.api;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for exifType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exifType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Camera" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Exposure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FocalLength" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ISO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Aperture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exifType", propOrder = {
    "camera",
    "exposure",
    "focalLength",
    "iso",
    "aperture"
})
public class ExifType {

    @XmlElement(name = "Camera", required = true)
    protected String camera;
    @XmlElement(name = "Exposure", required = true)
    protected String exposure;
    @XmlElement(name = "FocalLength", required = true)
    protected String focalLength;
    @XmlElement(name = "ISO")
    protected int iso;
    @XmlElement(name = "Aperture", required = true)
    protected String aperture;

    /**
     * Gets the value of the camera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamera() {
        return camera;
    }

    /**
     * Sets the value of the camera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamera(String value) {
        this.camera = value;
    }

    /**
     * Gets the value of the exposure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExposure(String value) {
        this.exposure = value;
    }

    /**
     * Gets the value of the focalLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocalLength() {
        return focalLength;
    }

    /**
     * Sets the value of the focalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocalLength(String value) {
        this.focalLength = value;
    }

    /**
     * Gets the value of the iso property.
     * 
     */
    public int getISO() {
        return iso;
    }

    /**
     * Sets the value of the iso property.
     * 
     */
    public void setISO(int value) {
        this.iso = value;
    }

    /**
     * Gets the value of the aperture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAperture() {
        return aperture;
    }

    /**
     * Sets the value of the aperture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAperture(String value) {
        this.aperture = value;
    }

}
