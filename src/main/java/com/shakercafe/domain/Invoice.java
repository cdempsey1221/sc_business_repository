/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shakercafe.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 *
 * @author christopher.dempsey
 */

@Document
public class Invoice {
    
    @Id
    private String invoiceId;
    
    private String description;
    private BigDecimal amount;
    private Vendor vendor;
    private Date invoiceDate;
    private String checkNumber;

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    @Override
    public String toString() {
        return "InventoryInvoice{" + "description=" + description + ", amount=" + amount + ", vendor=" + vendor + ", invoiceDate=" + invoiceDate + ", checkNumber=" + checkNumber + '}';
    }
    
    
    
}
