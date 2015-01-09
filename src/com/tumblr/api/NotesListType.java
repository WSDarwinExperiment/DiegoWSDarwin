
package com.tumblr.api;

import java.util.ArrayList;
import java.util.List;

import wsdarwin.javax.xml.bind.annotation.XmlAccessType;
import wsdarwin.javax.xml.bind.annotation.XmlAccessorType;
import wsdarwin.javax.xml.bind.annotation.XmlElement;
import wsdarwin.javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for notesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notesListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notesItemType-item" type="{api.tumblr.com/}notesItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notesListType", propOrder = {
    "notesItemTypeItem"
})
public class NotesListType {

    @XmlElement(name = "notesItemType-item")
    protected List<NotesItemType> notesItemTypeItem;

    /**
     * Gets the value of the notesItemTypeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notesItemTypeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesItemTypeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotesItemType }
     * 
     * 
     */
    public List<NotesItemType> getNotesItemTypeItem() {
        if (notesItemTypeItem == null) {
            notesItemTypeItem = new ArrayList<NotesItemType>();
        }
        return this.notesItemTypeItem;
    }

}
