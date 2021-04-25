package com.example.demo.Repository;

import com.example.demo.Entity.Test_Mongo_1;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Test_1_Repository extends MongoRepository<Test_Mongo_1, Integer> {
    List<Test_Mongo_1> findById(int init);
}
