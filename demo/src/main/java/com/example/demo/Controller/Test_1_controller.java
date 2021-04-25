package com.example.demo.Controller;

import com.example.demo.Entity.Test_Mongo_1;
import com.example.demo.Service.Test_1_Service;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log
@RestController
public class Test_1_controller {
    @Autowired
    private Test_1_Service service;

    //  값 집어 넣기
    @GetMapping("/input")
    public ResponseEntity input_test() throws Exception {
        log.info("input_test");
        Test_Mongo_1 data = new Test_Mongo_1();
        data.setId(1);
        data.setTest_int(1);
        data.setTest_str("A");
        service.write(data);
        return new ResponseEntity(HttpStatus.OK);
    }

    //  값 조회하기
    @GetMapping("/select")
    public ResponseEntity<List<Test_Mongo_1>> select_test() throws Exception {
        log.info("select_test");
        Test_Mongo_1 data = new Test_Mongo_1();
        data.setId(1);
        List<Test_Mongo_1> list = service.select(1);
        log.info("list : " + list);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    //  값 고치기
    @GetMapping("/update")
    public ResponseEntity update_test() throws Exception {
        log.info("update_test");
        Test_Mongo_1 data = new Test_Mongo_1();
        data.setId(1);
        data.setTest_str("B");
        service.update(data);
        return new ResponseEntity(HttpStatus.OK);
    }

    //  값 지우기
    @GetMapping("/delete")
    public ResponseEntity delete_test() throws Exception {
        log.info("delete_test");
        Test_Mongo_1 data = new Test_Mongo_1();
        data.setId(1);
        service.delete(data);
        return new ResponseEntity(HttpStatus.OK);
    }

//    @GetMapping("/join")
//    public ResponseEntity<List<Test_Mongo_1>> join_test() throws Exception{
//        log.info("join_test");
//        return new ResponseEntity<>(service.join_test(), HttpStatus.OK);
//
//    }
}
