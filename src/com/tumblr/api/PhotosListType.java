
package com.tumblr.api;

import java.util.ArrayList;
import java.util.List;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for photosListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="photosListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="photosItemType-item" type="{api.tumblr.com/}photosItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "photosListType", propOrder = {
    "photosItemTypeItem"
})
public class PhotosListType {

    @XmlElement(name = "photosItemType-item")
    protected List<PhotosItemType> photosItemTypeItem;

    /**
     * Gets the value of the photosItemTypeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the photosItemTypeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhotosItemTypeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhotosItemType }
     * 
     * 
     */
    public List<PhotosItemType> getPhotosItemTypeItem() {
        if (photosItemTypeItem == null) {
            photosItemTypeItem = new ArrayList<PhotosItemType>();
        }
        return this.photosItemTypeItem;
    }

}
