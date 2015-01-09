
package com.tumblr.api;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reblogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reblogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tree_html" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trail" type="{api.tumblr.com/}trailListType"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reblogType", propOrder = {
    "treeHtml",
    "trail",
    "comment"
})
public class ReblogType {

    @XmlElement(name = "tree_html", required = true)
    protected String treeHtml;
    @XmlElement(required = true)
    protected TrailListType trail;
    @XmlElement(required = true)
    protected String comment;

    /**
     * Gets the value of the treeHtml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreeHtml() {
        return treeHtml;
    }

    /**
     * Sets the value of the treeHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreeHtml(String value) {
        this.treeHtml = value;
    }

    /**
     * Gets the value of the trail property.
     * 
     * @return
     *     possible object is
     *     {@link TrailListType }
     *     
     */
    public TrailListType getTrail() {
        return trail;
    }

    /**
     * Sets the value of the trail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrailListType }
     *     
     */
    public void setTrail(TrailListType value) {
        this.trail = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
