package com.example.inventory.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.inventory.model.Ebook;

public interface EbookRepo extends MongoRepository<Ebook, String>{
    
}
