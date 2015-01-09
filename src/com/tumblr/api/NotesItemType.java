
package com.tumblr.api;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlSchemaType;
import wsdarwin.javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for notesItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notesItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="blog_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="added_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="blog_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="post_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notesItemType", propOrder = {
    "timestamp",
    "blogName",
    "addedText",
    "blogUrl",
    "type",
    "postId"
})
public class NotesItemType {

    protected int timestamp;
    @XmlElement(name = "blog_name", required = true)
    protected String blogName;
    @XmlElement(name = "added_text", required = true)
    protected String addedText;
    @XmlElement(name = "blog_url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String blogUrl;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "post_id")
    protected long postId;

    /**
     * Gets the value of the timestamp property.
     * 
     */
    public int getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     */
    public void setTimestamp(int value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the blogName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlogName() {
        return blogName;
    }

    /**
     * Sets the value of the blogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlogName(String value) {
        this.blogName = value;
    }

    /**
     * Gets the value of the addedText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedText() {
        return addedText;
    }

    /**
     * Sets the value of the addedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedText(String value) {
        this.addedText = value;
    }

    /**
     * Gets the value of the blogUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlogUrl() {
        return blogUrl;
    }

    /**
     * Sets the value of the blogUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlogUrl(String value) {
        this.blogUrl = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the postId property.
     * 
     */
    public long getPostId() {
        return postId;
    }

    /**
     * Sets the value of the postId property.
     * 
     */
    public void setPostId(long value) {
        this.postId = value;
    }

}
