package com.example.demo.Service.Impl;

import com.example.demo.Entity.Test_Mongo_1;
import com.example.demo.Repository.Test_1_Repository;
import com.example.demo.Service.Test_1_Service;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@Service
public class Test_1_ServiceImpl implements Test_1_Service {
    @Autowired
    private Test_1_Repository repository;

    @Override
    public void write(Test_Mongo_1 input_test) throws Exception {
        repository.save(input_test);
    }

    @Override
    public List<Test_Mongo_1> select(int select_num) throws Exception {
        return repository.findById(select_num);
//        repository.findAll();    //  특정 컬랙션에 모든 내용 찾기
//        repository.findOne();   //  특정 컬렉션에 해당하는 첫 번째 찾기
    }

    @Override
    public void update(Test_Mongo_1 update_test) throws Exception {
        Test_Mongo_1 uplode = repository.findById(update_test.getId()).get(0);
        uplode.setTest_str(update_test.getTest_str());
        repository.save(uplode);
    }

    @Override
    public void delete(Test_Mongo_1 delecte_test) throws Exception {
        repository.delete(delecte_test);
    }


//  MongoDB는 값을 넣을때 없으면 그냥 안들어가서 오류 나는 것을 추정    <-- 확인 필요
//    @Override
//    public List<Test_Mongo_1> join_test() throws Exception {
//        log.info("join_test");
//        List<Test_Mongo_1> list = repository.findAll();
//        for(Test_Mongo_1 i : list) {
//            log.info(i.getJoinTest().getStr_2());
//        }
//        return list;
//    }
}
