/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shakercafe.repository;

import java.util.List;

import com.shakercafe.domain.Vendor;

/**
 *
 * @author christopher.dempsey
 */
public interface VendorRepository {

    public List<Vendor> findAll();

    public List<Vendor> findAllCurrent();

    public Vendor findByName(String name);

    //@Override
    public void save(Vendor vendor);
    
}
