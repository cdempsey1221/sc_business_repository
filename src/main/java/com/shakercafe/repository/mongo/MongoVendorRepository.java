/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shakercafe.repository.mongo;

import java.util.List;

import javax.inject.Inject;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.shakercafe.domain.Vendor;
import com.shakercafe.repository.VendorRepository;

/**
 *
 * @author christopher.dempsey
 */
@Repository
public class MongoVendorRepository implements VendorRepository {
    
    public static final String VENDOR_COLLECTION = "vendors";
    
    @Inject
    private MongoTemplate mongoTemplate;
    
    //@Override
    @Override
    public void save( Vendor vendor) {  
        
        if ( vendor != null ) {
            
            mongoTemplate.save(vendor, VENDOR_COLLECTION);  
        }
        
    } 
    
    @Override
    public Vendor findByName( String name ) {
        
        Vendor vendor =  mongoTemplate.findOne( 
        		new Query( Criteria.where("name").is( name ) ), Vendor.class, VENDOR_COLLECTION);
        
        return ( vendor );
        
    }
    
    @Override
    public List<Vendor> findAllCurrent() {
        
        List<Vendor> vendors = null;
        
        vendors = mongoTemplate.find( 
                new Query( Criteria.where("active").is(Boolean.TRUE) ), Vendor.class, VENDOR_COLLECTION );
        
        return ( vendors );
        
    }
    
    @Override
    public List<Vendor> findAll() {
        
        return ( mongoTemplate.findAll( Vendor.class, VENDOR_COLLECTION ) );
    }
}
