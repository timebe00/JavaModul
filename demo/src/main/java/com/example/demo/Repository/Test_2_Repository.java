package com.example.demo.Repository;

import com.example.demo.Entity.Test_Mongo_2;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Test_2_Repository extends MongoRepository<Test_Mongo_2, Integer> {
}
