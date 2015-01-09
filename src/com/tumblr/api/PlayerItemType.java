
package com.tumblr.api;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlType;




/**
 * <p>Java class for playerItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="playerItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="embed_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "playerItemType", propOrder = {
    "width",
    "embedCode"
})
public class PlayerItemType {

    protected int width;
    @XmlElement(name = "embed_code", required = true)
    protected String embedCode;

    /**
     * Gets the value of the width property.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Gets the value of the embedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbedCode() {
        return embedCode;
    }

    /**
     * Sets the value of the embedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbedCode(String value) {
        this.embedCode = value;
    }

}
