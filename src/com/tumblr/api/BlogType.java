
package com.tumblr.api;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlSchemaType;
import wsdarwin.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ask_page_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="theme" type="{api.tumblr.com/}themeType"/>
 *         &lt;element name="posts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="share_likes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="is_nsfw" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="likes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ask" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ask_anon" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blogType", propOrder = {
    "askPageTitle",
    "theme",
    "posts",
    "url",
    "title",
    "shareLikes",
    "isNsfw",
    "updated",
    "description",
    "name",
    "likes",
    "ask",
    "askAnon"
})
public class BlogType {

    @XmlElement(name = "ask_page_title", required = true)
    protected String askPageTitle;
    @XmlElement(required = true)
    protected ThemeType theme;
    protected int posts;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(name = "share_likes")
    protected boolean shareLikes;
    @XmlElement(name = "is_nsfw")
    protected boolean isNsfw;
    protected int updated;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String name;
    protected int likes;
    protected boolean ask;
    @XmlElement(name = "ask_anon")
    protected boolean askAnon;

    /**
     * Gets the value of the askPageTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAskPageTitle() {
        return askPageTitle;
    }

    /**
     * Sets the value of the askPageTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAskPageTitle(String value) {
        this.askPageTitle = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link ThemeType }
     *     
     */
    public ThemeType getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThemeType }
     *     
     */
    public void setTheme(ThemeType value) {
        this.theme = value;
    }

    /**
     * Gets the value of the posts property.
     * 
     */
    public int getPosts() {
        return posts;
    }

    /**
     * Sets the value of the posts property.
     * 
     */
    public void setPosts(int value) {
        this.posts = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the shareLikes property.
     * 
     */
    public boolean isShareLikes() {
        return shareLikes;
    }

    /**
     * Sets the value of the shareLikes property.
     * 
     */
    public void setShareLikes(boolean value) {
        this.shareLikes = value;
    }

    /**
     * Gets the value of the isNsfw property.
     * 
     */
    public boolean isIsNsfw() {
        return isNsfw;
    }

    /**
     * Sets the value of the isNsfw property.
     * 
     */
    public void setIsNsfw(boolean value) {
        this.isNsfw = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     */
    public int getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     */
    public void setUpdated(int value) {
        this.updated = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the likes property.
     * 
     */
    public int getLikes() {
        return likes;
    }

    /**
     * Sets the value of the likes property.
     * 
     */
    public void setLikes(int value) {
        this.likes = value;
    }

    /**
     * Gets the value of the ask property.
     * 
     */
    public boolean isAsk() {
        return ask;
    }

    /**
     * Sets the value of the ask property.
     * 
     */
    public void setAsk(boolean value) {
        this.ask = value;
    }

    /**
     * Gets the value of the askAnon property.
     * 
     */
    public boolean isAskAnon() {
        return askAnon;
    }

    /**
     * Sets the value of the askAnon property.
     * 
     */
    public void setAskAnon(boolean value) {
        this.askAnon = value;
    }

}
