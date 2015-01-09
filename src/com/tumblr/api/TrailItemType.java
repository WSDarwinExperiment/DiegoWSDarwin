
package com.tumblr.api;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlType;




/**
 * <p>Java class for trailItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trailItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="post" type="{api.tumblr.com/}postType"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="blog" type="{api.tumblr.com/}blogType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trailItemType", propOrder = {
    "post",
    "comment",
    "blog"
})
public class TrailItemType {

    @XmlElement(required = true)
    protected PostType post;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected BlogType blog;

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link PostType }
     *     
     */
    public PostType getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostType }
     *     
     */
    public void setPost(PostType value) {
        this.post = value;
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

    /**
     * Gets the value of the blog property.
     * 
     * @return
     *     possible object is
     *     {@link BlogType }
     *     
     */
    public BlogType getBlog() {
        return blog;
    }

    /**
     * Sets the value of the blog property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlogType }
     *     
     */
    public void setBlog(BlogType value) {
        this.blog = value;
    }

}
