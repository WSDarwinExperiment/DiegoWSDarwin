
package com.tumblr.api;

import java.util.ArrayList;
import java.util.List;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trailListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trailListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trailItemType-item" type="{api.tumblr.com/}trailItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trailListType", propOrder = {
    "trailItemTypeItem"
})
public class TrailListType {

    @XmlElement(name = "trailItemType-item")
    protected List<TrailItemType> trailItemTypeItem;

    /**
     * Gets the value of the trailItemTypeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trailItemTypeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrailItemTypeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrailItemType }
     * 
     * 
     */
    public List<TrailItemType> getTrailItemTypeItem() {
        if (trailItemTypeItem == null) {
            trailItemTypeItem = new ArrayList<TrailItemType>();
        }
        return this.trailItemTypeItem;
    }

}
