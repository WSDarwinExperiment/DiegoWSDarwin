
package com.tumblr.api;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlSchemaType;
import wsdarwin.javax.xml.bind.annotation.XmlType;




/**
 * <p>Java class for themeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="themeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="body_font" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="header_image" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="header_stretch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="header_focus_height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="show_header_image" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="title_font_weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="header_image_focused" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="show_avatar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="header_full_height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="link_color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="show_title" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="title_font" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="header_focus_width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="header_bounds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="header_full_width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="avatar_shape" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title_color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="header_image_scaled" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="show_description" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="background_color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "themeType", propOrder = {
    "bodyFont",
    "headerImage",
    "headerStretch",
    "headerFocusHeight",
    "showHeaderImage",
    "titleFontWeight",
    "headerImageFocused",
    "showAvatar",
    "headerFullHeight",
    "linkColor",
    "showTitle",
    "titleFont",
    "headerFocusWidth",
    "headerBounds",
    "headerFullWidth",
    "avatarShape",
    "titleColor",
    "headerImageScaled",
    "showDescription",
    "backgroundColor"
})
public class ThemeType {

    @XmlElement(name = "body_font", required = true)
    protected String bodyFont;
    @XmlElement(name = "header_image", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String headerImage;
    @XmlElement(name = "header_stretch")
    protected boolean headerStretch;
    @XmlElement(name = "header_focus_height")
    protected int headerFocusHeight;
    @XmlElement(name = "show_header_image")
    protected boolean showHeaderImage;
    @XmlElement(name = "title_font_weight", required = true)
    protected String titleFontWeight;
    @XmlElement(name = "header_image_focused", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String headerImageFocused;
    @XmlElement(name = "show_avatar")
    protected boolean showAvatar;
    @XmlElement(name = "header_full_height")
    protected int headerFullHeight;
    @XmlElement(name = "link_color", required = true)
    protected String linkColor;
    @XmlElement(name = "show_title")
    protected boolean showTitle;
    @XmlElement(name = "title_font", required = true)
    protected String titleFont;
    @XmlElement(name = "header_focus_width")
    protected int headerFocusWidth;
    @XmlElement(name = "header_bounds", required = true)
    protected String headerBounds;
    @XmlElement(name = "header_full_width")
    protected int headerFullWidth;
    @XmlElement(name = "avatar_shape", required = true)
    protected String avatarShape;
    @XmlElement(name = "title_color", required = true)
    protected String titleColor;
    @XmlElement(name = "header_image_scaled", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String headerImageScaled;
    @XmlElement(name = "show_description")
    protected boolean showDescription;
    @XmlElement(name = "background_color", required = true)
    protected String backgroundColor;

    /**
     * Gets the value of the bodyFont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyFont() {
        return bodyFont;
    }

    /**
     * Sets the value of the bodyFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyFont(String value) {
        this.bodyFont = value;
    }

    /**
     * Gets the value of the headerImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderImage() {
        return headerImage;
    }

    /**
     * Sets the value of the headerImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderImage(String value) {
        this.headerImage = value;
    }

    /**
     * Gets the value of the headerStretch property.
     * 
     */
    public boolean isHeaderStretch() {
        return headerStretch;
    }

    /**
     * Sets the value of the headerStretch property.
     * 
     */
    public void setHeaderStretch(boolean value) {
        this.headerStretch = value;
    }

    /**
     * Gets the value of the headerFocusHeight property.
     * 
     */
    public int getHeaderFocusHeight() {
        return headerFocusHeight;
    }

    /**
     * Sets the value of the headerFocusHeight property.
     * 
     */
    public void setHeaderFocusHeight(int value) {
        this.headerFocusHeight = value;
    }

    /**
     * Gets the value of the showHeaderImage property.
     * 
     */
    public boolean isShowHeaderImage() {
        return showHeaderImage;
    }

    /**
     * Sets the value of the showHeaderImage property.
     * 
     */
    public void setShowHeaderImage(boolean value) {
        this.showHeaderImage = value;
    }

    /**
     * Gets the value of the titleFontWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleFontWeight() {
        return titleFontWeight;
    }

    /**
     * Sets the value of the titleFontWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleFontWeight(String value) {
        this.titleFontWeight = value;
    }

    /**
     * Gets the value of the headerImageFocused property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderImageFocused() {
        return headerImageFocused;
    }

    /**
     * Sets the value of the headerImageFocused property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderImageFocused(String value) {
        this.headerImageFocused = value;
    }

    /**
     * Gets the value of the showAvatar property.
     * 
     */
    public boolean isShowAvatar() {
        return showAvatar;
    }

    /**
     * Sets the value of the showAvatar property.
     * 
     */
    public void setShowAvatar(boolean value) {
        this.showAvatar = value;
    }

    /**
     * Gets the value of the headerFullHeight property.
     * 
     */
    public int getHeaderFullHeight() {
        return headerFullHeight;
    }

    /**
     * Sets the value of the headerFullHeight property.
     * 
     */
    public void setHeaderFullHeight(int value) {
        this.headerFullHeight = value;
    }

    /**
     * Gets the value of the linkColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkColor() {
        return linkColor;
    }

    /**
     * Sets the value of the linkColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkColor(String value) {
        this.linkColor = value;
    }

    /**
     * Gets the value of the showTitle property.
     * 
     */
    public boolean isShowTitle() {
        return showTitle;
    }

    /**
     * Sets the value of the showTitle property.
     * 
     */
    public void setShowTitle(boolean value) {
        this.showTitle = value;
    }

    /**
     * Gets the value of the titleFont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleFont() {
        return titleFont;
    }

    /**
     * Sets the value of the titleFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleFont(String value) {
        this.titleFont = value;
    }

    /**
     * Gets the value of the headerFocusWidth property.
     * 
     */
    public int getHeaderFocusWidth() {
        return headerFocusWidth;
    }

    /**
     * Sets the value of the headerFocusWidth property.
     * 
     */
    public void setHeaderFocusWidth(int value) {
        this.headerFocusWidth = value;
    }

    /**
     * Gets the value of the headerBounds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderBounds() {
        return headerBounds;
    }

    /**
     * Sets the value of the headerBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderBounds(String value) {
        this.headerBounds = value;
    }

    /**
     * Gets the value of the headerFullWidth property.
     * 
     */
    public int getHeaderFullWidth() {
        return headerFullWidth;
    }

    /**
     * Sets the value of the headerFullWidth property.
     * 
     */
    public void setHeaderFullWidth(int value) {
        this.headerFullWidth = value;
    }

    /**
     * Gets the value of the avatarShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvatarShape() {
        return avatarShape;
    }

    /**
     * Sets the value of the avatarShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvatarShape(String value) {
        this.avatarShape = value;
    }

    /**
     * Gets the value of the titleColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleColor() {
        return titleColor;
    }

    /**
     * Sets the value of the titleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleColor(String value) {
        this.titleColor = value;
    }

    /**
     * Gets the value of the headerImageScaled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderImageScaled() {
        return headerImageScaled;
    }

    /**
     * Sets the value of the headerImageScaled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderImageScaled(String value) {
        this.headerImageScaled = value;
    }

    /**
     * Gets the value of the showDescription property.
     * 
     */
    public boolean isShowDescription() {
        return showDescription;
    }

    /**
     * Sets the value of the showDescription property.
     * 
     */
    public void setShowDescription(boolean value) {
        this.showDescription = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

}
