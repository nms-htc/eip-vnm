
package com.nms.ws.checksubscriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extDebit4WAPResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extDebit4WAPResult"
})
@XmlRootElement(name = "extDebit4WAPResponse")
public class ExtDebit4WAPResponse {

    protected String extDebit4WAPResult;

    /**
     * Gets the value of the extDebit4WAPResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtDebit4WAPResult() {
        return extDebit4WAPResult;
    }

    /**
     * Sets the value of the extDebit4WAPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtDebit4WAPResult(String value) {
        this.extDebit4WAPResult = value;
    }

}
