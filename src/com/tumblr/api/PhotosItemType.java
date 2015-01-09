
package com.tumblr.api;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for photosItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="photosItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exif" type="{api.tumblr.com/}exifType"/>
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="original_size" type="{api.tumblr.com/}original_sizeType"/>
 *         &lt;element name="alt_sizes" type="{api.tumblr.com/}alt_sizesListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "photosItemType", propOrder = {
    "exif",
    "caption",
    "originalSize",
    "altSizes"
})
public class PhotosItemType {

    @XmlElement(required = true)
    protected ExifType exif;
    @XmlElement(required = true)
    protected String caption;
    @XmlElement(name = "original_size", required = true)
    protected OriginalSizeType originalSize;
    @XmlElement(name = "alt_sizes", required = true)
    protected AltSizesListType altSizes;

    /**
     * Gets the value of the exif property.
     * 
     * @return
     *     possible object is
     *     {@link ExifType }
     *     
     */
    public ExifType getExif() {
        return exif;
    }

    /**
     * Sets the value of the exif property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExifType }
     *     
     */
    public void setExif(ExifType value) {
        this.exif = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the originalSize property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalSizeType }
     *     
     */
    public OriginalSizeType getOriginalSize() {
        return originalSize;
    }

    /**
     * Sets the value of the originalSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalSizeType }
     *     
     */
    public void setOriginalSize(OriginalSizeType value) {
        this.originalSize = value;
    }

    /**
     * Gets the value of the altSizes property.
     * 
     * @return
     *     possible object is
     *     {@link AltSizesListType }
     *     
     */
    public AltSizesListType getAltSizes() {
        return altSizes;
    }

    /**
     * Sets the value of the altSizes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltSizesListType }
     *     
     */
    public void setAltSizes(AltSizesListType value) {
        this.altSizes = value;
    }

}
