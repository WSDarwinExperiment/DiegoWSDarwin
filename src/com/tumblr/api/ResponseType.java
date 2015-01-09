
package com.tumblr.api;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="total_posts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="posts" type="{api.tumblr.com/}postsListType"/>
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
@XmlType(name = "responseType", propOrder = {
    "totalPosts",
    "posts",
    "blog"
})
public class ResponseType {

    @XmlElement(name = "total_posts")
    protected int totalPosts;
    @XmlElement(required = true)
    protected PostsListType posts;
    @XmlElement(required = true)
    protected BlogType blog;

    /**
     * Gets the value of the totalPosts property.
     * 
     */
    public int getTotalPosts() {
        return totalPosts;
    }

    /**
     * Sets the value of the totalPosts property.
     * 
     */
    public void setTotalPosts(int value) {
        this.totalPosts = value;
    }

    /**
     * Gets the value of the posts property.
     * 
     * @return
     *     possible object is
     *     {@link PostsListType }
     *     
     */
    public PostsListType getPosts() {
        return posts;
    }

    /**
     * Sets the value of the posts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostsListType }
     *     
     */
    public void setPosts(PostsListType value) {
        this.posts = value;
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
