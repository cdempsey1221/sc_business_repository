/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shakercafe.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author christopher.dempsey
 */
@Document
public class Vendor {
    
    @Id
    private String vendorId;
    
    private String name;
    private String description;
    private boolean active;
    private String address;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Vendor{" + "name=" + name + ", description=" + description + ", active=" + active + ", address=" + address + '}';
    }
       
}
