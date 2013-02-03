package com.shakercafe.config;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
import com.shakercafe.repository.InvoiceRepository;
import com.shakercafe.repository.VendorRepository;
import com.shakercafe.repository.mongo.MongoInvoiceRepository;
import com.shakercafe.repository.mongo.MongoVendorRepository;

@Configuration
public class RepositoryConfig { 
    
    @Bean 
    public MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(mongo(), "shaker-cafe-prod1");
      }
    
    @Bean
    public Mongo mongo() throws UnknownHostException {
        return new Mongo("192.168.1.71");
    }
    
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate( mongoDbFactory() );
    }

    @Bean 
    public VendorRepository vendorRepository() {
        return new MongoVendorRepository();
    }
    
    @Bean 
    public InvoiceRepository invoiceRepository() {
        return new MongoInvoiceRepository();
    }
    
}