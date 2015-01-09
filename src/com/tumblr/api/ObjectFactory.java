
package com.tumblr.api;


import wsdarwin.javax.xml.namespace.QName;

import wsdarwin.javax.xml.bind.JAXBElement;
import wsdarwin.javax.xml.bind.annotation.XmlElementDecl;
import wsdarwin.javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tumblr.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Blog_QNAME = new QName("api.tumblr.com/", "blog");
    private final static QName _PostsItem_QNAME = new QName("api.tumblr.com/", "postsItem");
    private final static QName _OriginalSize_QNAME = new QName("api.tumblr.com/", "original_size");
    private final static QName _Meta_QNAME = new QName("api.tumblr.com/", "meta");
    private final static QName _Reblog_QNAME = new QName("api.tumblr.com/", "reblog");
    private final static QName _Posts_QNAME = new QName("api.tumblr.com/", "posts");
    private final static QName _NotesItem_QNAME = new QName("api.tumblr.com/", "notesItem");
    private final static QName _Player_QNAME = new QName("api.tumblr.com/", "player");
    private final static QName _Theme_QNAME = new QName("api.tumblr.com/", "theme");
    private final static QName _AltSizesItem_QNAME = new QName("api.tumblr.com/", "alt_sizesItem");
    private final static QName _Exif_QNAME = new QName("api.tumblr.com/", "exif");
    private final static QName _Tags_QNAME = new QName("api.tumblr.com/", "tags");
    private final static QName _Post_QNAME = new QName("api.tumblr.com/", "post");
    private final static QName _PhotosItem_QNAME = new QName("api.tumblr.com/", "photosItem");
    private final static QName _Notes_QNAME = new QName("api.tumblr.com/", "notes");
    private final static QName _AltSizes_QNAME = new QName("api.tumblr.com/", "alt_sizes");
    private final static QName _PlayerItem_QNAME = new QName("api.tumblr.com/", "playerItem");
    private final static QName _PostsResponse_QNAME = new QName("api.tumblr.com/", "postsResponse");
    private final static QName _Trail_QNAME = new QName("api.tumblr.com/", "trail");
    private final static QName _TrailItem_QNAME = new QName("api.tumblr.com/", "trailItem");
    private final static QName _Photos_QNAME = new QName("api.tumblr.com/", "photos");
    private final static QName _Response_QNAME = new QName("api.tumblr.com/", "response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tumblr.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExifType }
     * 
     */
    public ExifType createExifType() {
        return new ExifType();
    }

    /**
     * Create an instance of {@link TagsListType }
     * 
     */
    public TagsListType createTagsListType() {
        return new TagsListType();
    }

    /**
     * Create an instance of {@link PhotosItemType }
     * 
     */
    public PhotosItemType createPhotosItemType() {
        return new PhotosItemType();
    }

    /**
     * Create an instance of {@link PostType }
     * 
     */
    public PostType createPostType() {
        return new PostType();
    }

    /**
     * Create an instance of {@link PlayerListType }
     * 
     */
    public PlayerListType createPlayerListType() {
        return new PlayerListType();
    }

    /**
     * Create an instance of {@link AltSizesItemType }
     * 
     */
    public AltSizesItemType createAltSizesItemType() {
        return new AltSizesItemType();
    }

    /**
     * Create an instance of {@link ThemeType }
     * 
     */
    public ThemeType createThemeType() {
        return new ThemeType();
    }

    /**
     * Create an instance of {@link PostsListType }
     * 
     */
    public PostsListType createPostsListType() {
        return new PostsListType();
    }

    /**
     * Create an instance of {@link NotesItemType }
     * 
     */
    public NotesItemType createNotesItemType() {
        return new NotesItemType();
    }

    /**
     * Create an instance of {@link BlogType }
     * 
     */
    public BlogType createBlogType() {
        return new BlogType();
    }

    /**
     * Create an instance of {@link PostsItemType }
     * 
     */
    public PostsItemType createPostsItemType() {
        return new PostsItemType();
    }

    /**
     * Create an instance of {@link ReblogType }
     * 
     */
    public ReblogType createReblogType() {
        return new ReblogType();
    }

    /**
     * Create an instance of {@link MetaType }
     * 
     */
    public MetaType createMetaType() {
        return new MetaType();
    }

    /**
     * Create an instance of {@link OriginalSizeType }
     * 
     */
    public OriginalSizeType createOriginalSizeType() {
        return new OriginalSizeType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link PhotosListType }
     * 
     */
    public PhotosListType createPhotosListType() {
        return new PhotosListType();
    }

    /**
     * Create an instance of {@link TrailItemType }
     * 
     */
    public TrailItemType createTrailItemType() {
        return new TrailItemType();
    }

    /**
     * Create an instance of {@link PostsResponseType }
     * 
     */
    public PostsResponseType createPostsResponseType() {
        return new PostsResponseType();
    }

    /**
     * Create an instance of {@link TrailListType }
     * 
     */
    public TrailListType createTrailListType() {
        return new TrailListType();
    }

    /**
     * Create an instance of {@link PlayerItemType }
     * 
     */
    public PlayerItemType createPlayerItemType() {
        return new PlayerItemType();
    }

    /**
     * Create an instance of {@link NotesListType }
     * 
     */
    public NotesListType createNotesListType() {
        return new NotesListType();
    }

    /**
     * Create an instance of {@link AltSizesListType }
     * 
     */
    public AltSizesListType createAltSizesListType() {
        return new AltSizesListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlogType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "blog")
    public JAXBElement<BlogType> createBlog(BlogType value) {
        return new JAXBElement<BlogType>(_Blog_QNAME, BlogType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostsItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "postsItem")
    public JAXBElement<PostsItemType> createPostsItem(PostsItemType value) {
        return new JAXBElement<PostsItemType>(_PostsItem_QNAME, PostsItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginalSizeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "original_size")
    public JAXBElement<OriginalSizeType> createOriginalSize(OriginalSizeType value) {
        return new JAXBElement<OriginalSizeType>(_OriginalSize_QNAME, OriginalSizeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "meta")
    public JAXBElement<MetaType> createMeta(MetaType value) {
        return new JAXBElement<MetaType>(_Meta_QNAME, MetaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReblogType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "reblog")
    public JAXBElement<ReblogType> createReblog(ReblogType value) {
        return new JAXBElement<ReblogType>(_Reblog_QNAME, ReblogType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostsListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "posts")
    public JAXBElement<PostsListType> createPosts(PostsListType value) {
        return new JAXBElement<PostsListType>(_Posts_QNAME, PostsListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotesItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "notesItem")
    public JAXBElement<NotesItemType> createNotesItem(NotesItemType value) {
        return new JAXBElement<NotesItemType>(_NotesItem_QNAME, NotesItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "player")
    public JAXBElement<PlayerListType> createPlayer(PlayerListType value) {
        return new JAXBElement<PlayerListType>(_Player_QNAME, PlayerListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThemeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "theme")
    public JAXBElement<ThemeType> createTheme(ThemeType value) {
        return new JAXBElement<ThemeType>(_Theme_QNAME, ThemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltSizesItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "alt_sizesItem")
    public JAXBElement<AltSizesItemType> createAltSizesItem(AltSizesItemType value) {
        return new JAXBElement<AltSizesItemType>(_AltSizesItem_QNAME, AltSizesItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExifType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "exif")
    public JAXBElement<ExifType> createExif(ExifType value) {
        return new JAXBElement<ExifType>(_Exif_QNAME, ExifType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TagsListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "tags")
    public JAXBElement<TagsListType> createTags(TagsListType value) {
        return new JAXBElement<TagsListType>(_Tags_QNAME, TagsListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "post")
    public JAXBElement<PostType> createPost(PostType value) {
        return new JAXBElement<PostType>(_Post_QNAME, PostType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotosItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "photosItem")
    public JAXBElement<PhotosItemType> createPhotosItem(PhotosItemType value) {
        return new JAXBElement<PhotosItemType>(_PhotosItem_QNAME, PhotosItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotesListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "notes")
    public JAXBElement<NotesListType> createNotes(NotesListType value) {
        return new JAXBElement<NotesListType>(_Notes_QNAME, NotesListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltSizesListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "alt_sizes")
    public JAXBElement<AltSizesListType> createAltSizes(AltSizesListType value) {
        return new JAXBElement<AltSizesListType>(_AltSizes_QNAME, AltSizesListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "playerItem")
    public JAXBElement<PlayerItemType> createPlayerItem(PlayerItemType value) {
        return new JAXBElement<PlayerItemType>(_PlayerItem_QNAME, PlayerItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "postsResponse")
    public JAXBElement<PostsResponseType> createPostsResponse(PostsResponseType value) {
        return new JAXBElement<PostsResponseType>(_PostsResponse_QNAME, PostsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "trail")
    public JAXBElement<TrailListType> createTrail(TrailListType value) {
        return new JAXBElement<TrailListType>(_Trail_QNAME, TrailListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrailItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "trailItem")
    public JAXBElement<TrailItemType> createTrailItem(TrailItemType value) {
        return new JAXBElement<TrailItemType>(_TrailItem_QNAME, TrailItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotosListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "photos")
    public JAXBElement<PhotosListType> createPhotos(PhotosListType value) {
        return new JAXBElement<PhotosListType>(_Photos_QNAME, PhotosListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "api.tumblr.com/", name = "response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

}
