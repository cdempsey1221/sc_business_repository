/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shakercafe.repository;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.shakercafe.config.RepositoryConfig;
import com.shakercafe.domain.Vendor;
import com.shakercafe.repository.mongo.MongoVendorRepository;

/**
 *
 * @author christopher.dempsey
 */
@ContextConfiguration(classes=RepositoryConfig.class, loader=AnnotationConfigContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MongoVendorRepositoryTest {
    
    
    @Inject
    private MongoVendorRepository vendorRepository;
    
    public MongoVendorRepositoryTest() {}

    /**
     * Test of save method, of class InventoryInvoiceRepository.
     */
    @Test
    public void save() {
        System.out.println("save");
        Vendor vendor = new Vendor();
        vendor.setActive(true);
        vendor.setAddress("3176 Trout Creek, Saint Augustine, FL 32092");
        vendor.setDescription("mclovin vendor");
        vendor.setName("DEMPSEY");
        vendorRepository.save(vendor);
        System.out.println(vendor.getVendorId());
        System.out.println(vendor);
    }
    
    @Test
    public void findByName() {
        
        System.out.println("Find by Name...Using DEMPSEY");
        
        final Vendor vendor = vendorRepository.findByName( "DEMPSEY");
        
        System.out.println(vendor);
        System.out.println(vendor.getVendorId());
        
        assertTrue( vendor != null);
        assertTrue( vendor.getName().equalsIgnoreCase("DEMPSEY") );
        
    }
    
    @Test
    public void findAllCurrent() {
        
        System.out.println("Find All By Current (Active)...Using DEMPSEY");
        
        final List<Vendor> vendors = vendorRepository.findAllCurrent();
        
        for ( Vendor vendor : vendors ) {
            
            System.out.println(vendor);
        }
        
        System.out.println("Count:  " + vendors.size() );
        
        assertTrue ( vendors != null );
        assertTrue( vendors.size() > 0 );
        
    }
    
    @Test
    public void findAll() {
        
        System.out.println("Find All...");
        
        final List<Vendor> vendors = vendorRepository.findAll();
        
        System.out.println("Count:  " + vendors.size() );
        
        assertTrue ( vendors != null );
        assertTrue( vendors.size() > 0 );
    }
    
}
