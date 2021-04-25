package com.example.demo.Service.Impl;

import com.example.demo.Entity.Test_Mongo_2;
import com.example.demo.Repository.Test_2_Repository;
import com.example.demo.Service.Test_2_Service;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log
@Service
public class Test_2_ServiceImpl implements Test_2_Service {
    @Autowired
    private Test_2_Repository repository;


    @Override
    public void input(Test_Mongo_2 data) throws Exception {
        repository.save(data);
    }
}
