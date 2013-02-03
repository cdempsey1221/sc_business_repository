/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shakercafe.repository;

import java.util.List;

import com.shakercafe.domain.Invoice;

/**
 *
 * @author christopher.dempsey
 */
public interface InvoiceRepository {

    public void save(Invoice invInvoice);
    
    public List<Invoice> findAll();
    
}
