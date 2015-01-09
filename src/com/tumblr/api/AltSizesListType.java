
package com.tumblr.api;

import java.util.ArrayList;
import java.util.List;

import wsdarwin.javax.xml.bind.annotation.*;


/**
 * <p>Java class for alt_sizesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alt_sizesListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alt_sizesItemType-item" type="{api.tumblr.com/}alt_sizesItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alt_sizesListType", propOrder = {
    "altSizesItemTypeItem"
})
public class AltSizesListType {

    @XmlElement(name = "alt_sizesItemType-item")
    protected List<AltSizesItemType> altSizesItemTypeItem;

    /**
     * Gets the value of the altSizesItemTypeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altSizesItemTypeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltSizesItemTypeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltSizesItemType }
     * 
     * 
     */
    public List<AltSizesItemType> getAltSizesItemTypeItem() {
        if (altSizesItemTypeItem == null) {
            altSizesItemTypeItem = new ArrayList<AltSizesItemType>();
        }
        return this.altSizesItemTypeItem;
    }

}
