package com.example.demo.Controller;

import com.example.demo.Entity.Test_Mongo_2;
import com.example.demo.Service.Test_2_Service;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class Test_2_controller {
    @Autowired
    private Test_2_Service service;

    @GetMapping("/joinTest")
    public void test_join_input() throws Exception {
        log.info("test_join_input");
        Test_Mongo_2 data = new Test_Mongo_2();
        data.setId_test(1);
        data.setStr_2("Test2 join it!!!!");
        service.input(data);
    }
}
