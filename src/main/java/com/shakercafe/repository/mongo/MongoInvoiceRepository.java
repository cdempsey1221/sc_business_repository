/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shakercafe.repository.mongo;

import java.util.List;

import javax.inject.Inject;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.shakercafe.domain.Invoice;
import com.shakercafe.repository.InvoiceRepository;

/**
 *
 * @author christopher.dempsey
 */
@Repository
public class MongoInvoiceRepository implements InvoiceRepository {
    
    public static final String INVENTORY_INVOICES_COLLECTION = "inventory_invoices";
    
    @Inject
    private MongoTemplate mongoTemplate;
    
    @Override
    public void save( Invoice invInvoice) {  
        
        if ( invInvoice != null ) {
            
            mongoTemplate.save(invInvoice, INVENTORY_INVOICES_COLLECTION);
            
        }
        
    }

	@Override
	public List<Invoice> findAll() {
		
		return ( mongoTemplate.findAll( Invoice.class,  INVENTORY_INVOICES_COLLECTION) );
		
	}  
}
