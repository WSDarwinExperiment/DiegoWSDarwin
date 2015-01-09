
package com.tumblr.api;

import java.util.ArrayList;
import java.util.List;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tagsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tagsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tagsListType-item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tagsListType", propOrder = {
    "tagsListTypeItem"
})
public class TagsListType {

    @XmlElement(name = "tagsListType-item")
    protected List<String> tagsListTypeItem;

    /**
     * Gets the value of the tagsListTypeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tagsListTypeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTagsListTypeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTagsListTypeItem() {
        if (tagsListTypeItem == null) {
            tagsListTypeItem = new ArrayList<String>();
        }
        return this.tagsListTypeItem;
    }

}
