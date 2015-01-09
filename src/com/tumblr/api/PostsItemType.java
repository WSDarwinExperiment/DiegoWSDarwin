
package com.tumblr.api;

import java.io.Serializable;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlSchemaType;
import wsdarwin.javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for postsItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postsItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="post_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="reblog_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="photoset_layout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reblog" type="{api.tumblr.com/}reblogType"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reblogged_root_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="reblogged_from_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reblogged_root_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="note_count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tags" type="{api.tumblr.com/}tagsListType"/>
 *         &lt;element name="image_permalink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="blog_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reblogged_root_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="link_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="link_image" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reblogged_root_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="photos" type="{api.tumblr.com/}photosListType"/>
 *         &lt;element name="reblogged_from_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="short_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="slug" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reblogged_from_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="notes" type="{api.tumblr.com/}notesListType"/>
 *         &lt;element name="reblogged_from_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postsItemType", propOrder = {
    "body",
    "postUrl",
    "reblogKey",
    "photosetLayout",
    "state",
    "date",
    "type",
    "reblog",
    "timestamp",
    "id",
    "title",
    "rebloggedRootId",
    "rebloggedFromId",
    "description",
    "rebloggedRootTitle",
    "noteCount",
    "tags",
    "imagePermalink",
    "blogName",
    "rebloggedRootUrl",
    "linkUrl",
    "linkImage",
    "caption",
    "format",
    "rebloggedRootName",
    "url",
    "photos",
    "rebloggedFromName",
    "shortUrl",
    "slug",
    "rebloggedFromUrl",
    "notes",
    "rebloggedFromTitle"
})
public class PostsItemType implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(required = true)
    protected String body;
    @XmlElement(name = "post_url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String postUrl;
    @XmlElement(name = "reblog_key", required = true)
    protected String reblogKey;
    @XmlElement(name = "photoset_layout")
    protected int photosetLayout;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String date;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected ReblogType reblog;
    protected int timestamp;
    protected long id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(name = "reblogged_root_id")
    protected long rebloggedRootId;
    @XmlElement(name = "reblogged_from_id")
    protected long rebloggedFromId;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "reblogged_root_title", required = true)
    protected String rebloggedRootTitle;
    @XmlElement(name = "note_count")
    protected int noteCount;
    @XmlElement(required = true)
    protected TagsListType tags;
    @XmlElement(name = "image_permalink", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String imagePermalink;
    @XmlElement(name = "blog_name", required = true)
    protected String blogName;
    @XmlElement(name = "reblogged_root_url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String rebloggedRootUrl;
    @XmlElement(name = "link_url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String linkUrl;
    @XmlElement(name = "link_image", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String linkImage;
    @XmlElement(required = true)
    protected String caption;
    @XmlElement(required = true)
    protected String format;
    @XmlElement(name = "reblogged_root_name", required = true)
    protected String rebloggedRootName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(required = true)
    protected PhotosListType photos;
    @XmlElement(name = "reblogged_from_name", required = true)
    protected String rebloggedFromName;
    @XmlElement(name = "short_url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String shortUrl;
    @XmlElement(required = true)
    protected String slug;
    @XmlElement(name = "reblogged_from_url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String rebloggedFromUrl;
    @XmlElement(required = true)
    protected NotesListType notes;
    @XmlElement(name = "reblogged_from_title", required = true)
    protected String rebloggedFromTitle;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the postUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostUrl() {
        return postUrl;
    }

    /**
     * Sets the value of the postUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostUrl(String value) {
        this.postUrl = value;
    }

    /**
     * Gets the value of the reblogKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReblogKey() {
        return reblogKey;
    }

    /**
     * Sets the value of the reblogKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReblogKey(String value) {
        this.reblogKey = value;
    }

    /**
     * Gets the value of the photosetLayout property.
     * 
     */
    public int getPhotosetLayout() {
        return photosetLayout;
    }

    /**
     * Sets the value of the photosetLayout property.
     * 
     */
    public void setPhotosetLayout(int value) {
        this.photosetLayout = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
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
     * Gets the value of the reblog property.
     * 
     * @return
     *     possible object is
     *     {@link ReblogType }
     *     
     */
    public ReblogType getReblog() {
        return reblog;
    }

    /**
     * Sets the value of the reblog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReblogType }
     *     
     */
    public void setReblog(ReblogType value) {
        this.reblog = value;
    }

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
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
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
     * Gets the value of the rebloggedRootId property.
     * 
     */
    public long getRebloggedRootId() {
        return rebloggedRootId;
    }

    /**
     * Sets the value of the rebloggedRootId property.
     * 
     */
    public void setRebloggedRootId(long value) {
        this.rebloggedRootId = value;
    }

    /**
     * Gets the value of the rebloggedFromId property.
     * 
     */
    public long getRebloggedFromId() {
        return rebloggedFromId;
    }

    /**
     * Sets the value of the rebloggedFromId property.
     * 
     */
    public void setRebloggedFromId(long value) {
        this.rebloggedFromId = value;
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
     * Gets the value of the rebloggedRootTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebloggedRootTitle() {
        return rebloggedRootTitle;
    }

    /**
     * Sets the value of the rebloggedRootTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebloggedRootTitle(String value) {
        this.rebloggedRootTitle = value;
    }

    /**
     * Gets the value of the noteCount property.
     * 
     */
    public int getNoteCount() {
        return noteCount;
    }

    /**
     * Sets the value of the noteCount property.
     * 
     */
    public void setNoteCount(int value) {
        this.noteCount = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link TagsListType }
     *     
     */
    public TagsListType getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagsListType }
     *     
     */
    public void setTags(TagsListType value) {
        this.tags = value;
    }

    /**
     * Gets the value of the imagePermalink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePermalink() {
        return imagePermalink;
    }

    /**
     * Sets the value of the imagePermalink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePermalink(String value) {
        this.imagePermalink = value;
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
     * Gets the value of the rebloggedRootUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebloggedRootUrl() {
        return rebloggedRootUrl;
    }

    /**
     * Sets the value of the rebloggedRootUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebloggedRootUrl(String value) {
        this.rebloggedRootUrl = value;
    }

    /**
     * Gets the value of the linkUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * Sets the value of the linkUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkUrl(String value) {
        this.linkUrl = value;
    }

    /**
     * Gets the value of the linkImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkImage() {
        return linkImage;
    }

    /**
     * Sets the value of the linkImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkImage(String value) {
        this.linkImage = value;
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
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the rebloggedRootName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebloggedRootName() {
        return rebloggedRootName;
    }

    /**
     * Sets the value of the rebloggedRootName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebloggedRootName(String value) {
        this.rebloggedRootName = value;
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
     * Gets the value of the photos property.
     * 
     * @return
     *     possible object is
     *     {@link PhotosListType }
     *     
     */
    public PhotosListType getPhotos() {
        return photos;
    }

    /**
     * Sets the value of the photos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotosListType }
     *     
     */
    public void setPhotos(PhotosListType value) {
        this.photos = value;
    }

    /**
     * Gets the value of the rebloggedFromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebloggedFromName() {
        return rebloggedFromName;
    }

    /**
     * Sets the value of the rebloggedFromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebloggedFromName(String value) {
        this.rebloggedFromName = value;
    }

    /**
     * Gets the value of the shortUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortUrl() {
        return shortUrl;
    }

    /**
     * Sets the value of the shortUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortUrl(String value) {
        this.shortUrl = value;
    }

    /**
     * Gets the value of the slug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Sets the value of the slug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlug(String value) {
        this.slug = value;
    }

    /**
     * Gets the value of the rebloggedFromUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebloggedFromUrl() {
        return rebloggedFromUrl;
    }

    /**
     * Sets the value of the rebloggedFromUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebloggedFromUrl(String value) {
        this.rebloggedFromUrl = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link NotesListType }
     *     
     */
    public NotesListType getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotesListType }
     *     
     */
    public void setNotes(NotesListType value) {
        this.notes = value;
    }

    /**
     * Gets the value of the rebloggedFromTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebloggedFromTitle() {
        return rebloggedFromTitle;
    }

    /**
     * Sets the value of the rebloggedFromTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebloggedFromTitle(String value) {
        this.rebloggedFromTitle = value;
    }

}
